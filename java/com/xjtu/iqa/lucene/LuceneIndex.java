package com.xjtu.iqa.lucene;

import java.io.StringReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.cn.smart.SmartChineseAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.search.highlight.Fragmenter;
import org.apache.lucene.search.highlight.Highlighter;
import org.apache.lucene.search.highlight.QueryScorer;
import org.apache.lucene.search.highlight.SimpleHTMLFormatter;
import org.apache.lucene.search.highlight.SimpleSpanFragmenter;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.springframework.beans.factory.annotation.Autowired;

import com.xjtu.iqa.mapper.CollectionMapper;
import com.xjtu.iqa.mapper.CommentMapper;
import com.xjtu.iqa.mapper.FaqQuestionMapper;
import com.xjtu.iqa.mapper.UserMapper;
import com.xjtu.iqa.po.FaqQuestion;
import com.xjtu.iqa.po.User;
import com.xjtu.iqa.util.JsonUtil;
import com.xjtu.iqa.vo.Faq2_faqContentView;
import com.xjtu.iqa.vo.Faq2_faqUserView;


public class LuceneIndex {
	@Autowired
	FaqQuestionMapper faqQuestionMapper;
	@Autowired
	UserMapper userMapper;
	@Autowired
	CommentMapper commentMapper;
	@Autowired
	CollectionMapper collectionMapper;
	
	private static Directory dir = null;

	/**
	 * 获取IndexWriter实例
	 * 
	 * @return
	 * @throws Exception
	 */
	private IndexWriter getWriter() throws Exception {
		/**
		 * 生成的索引我放在了E盘，可以根据自己的需要放在具体位置
		 */
		// !!!String localurl = System.getProperty("user.dir");
		String tomcatPath = System.getProperty("user.dir").replace("bin", "webapps");

		dir = FSDirectory.open(Paths.get(tomcatPath + "/iqa_fore/luence"));
		SmartChineseAnalyzer analyzer = new SmartChineseAnalyzer();
		IndexWriterConfig iwc = new IndexWriterConfig(analyzer);
		IndexWriter writer = new IndexWriter(dir, iwc);
		return writer;
	}

	/**
	 * 添加问答库索引
	 * 
	 * @param FAQ
	 */
	public void addIndex(FaqQuestion questionPersistence) throws Exception {
		IndexWriter writer = getWriter();
		Document doc = new Document();
		doc.add(new StringField("questionId", String.valueOf(questionPersistence.getFAQQUESTIONID()), Field.Store.YES));
		/**
		 * yes是会将数据存进索引，如果查询结果中需要将记录显示出来就要存进去，如果查询结果
		 * 只是显示标题之类的就可以不用存，而且内容过长不建议存进去 使用TextField类是可以用于查询的。
		 */
		doc.add(new TextField("questionTitle", questionPersistence.getFAQTITLE(), Field.Store.YES));
		doc.add(new TextField("questionDescription", questionPersistence.getFAQDESCRIPTION(), Field.Store.YES));
		writer.addDocument(doc);
		writer.close();
	}

	/**
	 * 更新问答库索引
	 * 
	 * @param FAQ
	 * @throws Exception
	 */
	public void updateIndex(FaqQuestion questionPersistence) throws Exception {
		IndexWriter writer = getWriter();
		Document doc = new Document();
		doc.add(new StringField("questionId", String.valueOf(questionPersistence.getFAQQUESTIONID()), Field.Store.YES));
		doc.add(new TextField("questionTitle", questionPersistence.getFAQTITLE(), Field.Store.YES));
		doc.add(new TextField("questionDescription", questionPersistence.getFAQDESCRIPTION(), Field.Store.YES));
		writer.updateDocument(new Term("questionId", String.valueOf(questionPersistence.getFAQQUESTIONID())), doc);
		writer.close();
	}

	/**
	 * 删除问答库的索引
	 * 
	 * @param FAQ
	 * @throws Exception
	 */
	public void deleteIndex(FaqQuestion questionPersistence) throws Exception {
		IndexWriter writer = getWriter();
		writer.deleteDocuments(new Term("questionId", questionPersistence.getFAQQUESTIONID()));
		writer.forceMergeDeletes(); // 强制删除
		writer.commit();
		writer.close();
	}

	/**
	 * 查询问答库
	 * 
	 * @param q
	 *            查询关键字
	 * @return
	 * @throws Exception
	 */
	public List<FaqQuestion> searchFAQ(String q) throws Exception {
		/**
		 * 注意的是查询索引的位置得是存放索引的位置，不然会找不到。
		 */
		// !!!String localurl = System.getProperty("user.dir");

		String tomcatPath = System.getProperty("user.dir").replace("bin", "webapps");
		dir = FSDirectory.open(Paths.get(tomcatPath + "/iqa_fore/luence"));
		IndexReader reader = DirectoryReader.open(dir);
		IndexSearcher is = new IndexSearcher(reader);
		BooleanQuery.Builder booleanQuery = new BooleanQuery.Builder();
		SmartChineseAnalyzer analyzer = new SmartChineseAnalyzer();
		/**
		 * questionTitle和questionDescription就是我们需要进行查找的两个字段
		 * 同时在存放索引的时候要使用TextField类进行存放。
		 */
		QueryParser parser = new QueryParser("questionTitle", analyzer);
		Query query = parser.parse(q);
		QueryParser parser2 = new QueryParser("questionDescription", analyzer);
		Query query2 = parser2.parse(q);
		booleanQuery.add(query, BooleanClause.Occur.SHOULD);
		booleanQuery.add(query2, BooleanClause.Occur.SHOULD);
		TopDocs hits = is.search(booleanQuery.build(), 10000);
		QueryScorer scorer = new QueryScorer(query);
		Fragmenter fragmenter = new SimpleSpanFragmenter(scorer);
		/**
		 * 这里可以根据自己的需要来自定义查找关键字高亮时的样式。
		 */
		SimpleHTMLFormatter simpleHTMLFormatter = new SimpleHTMLFormatter("<b><font color='red'>", "</font></b>");
		Highlighter highlighter = new Highlighter(simpleHTMLFormatter, scorer);
		highlighter.setTextFragmenter(fragmenter);
		List<FaqQuestion> qList = new LinkedList<FaqQuestion>();
		for (ScoreDoc scoreDoc : hits.scoreDocs) {
			Document doc = is.doc(scoreDoc.doc);
			FaqQuestion questionPersistence = new FaqQuestion();
			questionPersistence.setFAQQUESTIONID(doc.get(("questionId")));
			questionPersistence.setFAQDESCRIPTION(doc.get(("questionDescription")));
			String questionTitle = doc.get("questionTitle");
			String questionDescription = doc.get("questionDescription");
			if (questionTitle != null) {
				TokenStream tokenStream = analyzer.tokenStream("questionTitle", new StringReader(questionTitle));
				String husername = highlighter.getBestFragment(tokenStream, questionTitle);
				if (StringUtil.isEmpty(husername)) {
					questionPersistence.setFAQTITLE(questionTitle);
				} else {
					questionPersistence.setFAQTITLE(husername);
				}
			}
			if (questionDescription != null) {
				TokenStream tokenStream = analyzer.tokenStream("questionDescription",
						new StringReader(questionDescription));
				String hContent = highlighter.getBestFragment(tokenStream, questionDescription);
				if (StringUtil.isEmpty(hContent)) {
					if (questionDescription.length() <= 200) {
						questionPersistence.setFAQDESCRIPTION(questionDescription);
					} else {
						questionPersistence.setFAQDESCRIPTION(questionDescription.substring(0, 200));
					}
				} else {
					questionPersistence.setFAQDESCRIPTION(hContent);
				}
			}
			qList.add(questionPersistence);
		}

		return qList;
	}

	/**
	 * 封装List，展示在faq2页面
	 */
	public List<Faq2_faqContentView> faq2_faqContentViews(List<FaqQuestion> questionPersistence,
			int starNum, int totoalNum) {
		int endNum = starNum + 5;
		if (endNum >= totoalNum) {
			endNum = totoalNum;
		}
		List<Faq2_faqContentView> faq2_faqContentViews = new ArrayList<Faq2_faqContentView>();
		for (int i = starNum; i < endNum; i++) {
			List<Faq2_faqUserView> userViews = new ArrayList<Faq2_faqUserView>();
			String userId = faqQuestionMapper.findUserIdByQuestionId(questionPersistence.get(i).getFAQQUESTIONID());
			User userPersistences = userMapper.getUserInfoById(userId);
			
			Faq2_faqUserView faq2_faqUserView = new Faq2_faqUserView(userPersistences);
			userViews.add(faq2_faqUserView);
			
			Faq2_faqContentView faq2View = new Faq2_faqContentView(questionPersistence.get(i));
			faq2View.setuList(userViews);
			int commentCount = commentMapper.commentInfo(questionPersistence.get(i).getFAQQUESTIONID());
			List<FaqQuestion> questionPersistences = faqQuestionMapper
					.faq3_faqcontent(questionPersistence.get(i).getFAQQUESTIONID(), 2);
			int collectionCount = collectionMapper.getCollectionFaqCount(questionPersistence.get(i).getFAQQUESTIONID());
			faq2View.setCommentNumber(commentCount);
			faq2View.setFaqScan(questionPersistences.get(0).getSCAN());
			faq2View.setFaqModifytime(questionPersistences.get(0).getMODIFYTIME());
			faq2View.setFaqCollection(Integer.toString(collectionCount));
			faq2_faqContentViews.add(faq2View);
		}

		System.out.println(JsonUtil.toJsonString(faq2_faqContentViews));
		return faq2_faqContentViews;
	}

	public static void main(String[] args) {

	}
}
