package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class CommunityQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommunityQuestionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCOMMUNITYQUESTIONIDIsNull() {
            addCriterion("COMMUNITYQUESTIONID is null");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDIsNotNull() {
            addCriterion("COMMUNITYQUESTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDEqualTo(String value) {
            addCriterion("COMMUNITYQUESTIONID =", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDNotEqualTo(String value) {
            addCriterion("COMMUNITYQUESTIONID <>", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDGreaterThan(String value) {
            addCriterion("COMMUNITYQUESTIONID >", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUNITYQUESTIONID >=", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDLessThan(String value) {
            addCriterion("COMMUNITYQUESTIONID <", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDLessThanOrEqualTo(String value) {
            addCriterion("COMMUNITYQUESTIONID <=", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDLike(String value) {
            addCriterion("COMMUNITYQUESTIONID like", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDNotLike(String value) {
            addCriterion("COMMUNITYQUESTIONID not like", value, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDIn(List<String> values) {
            addCriterion("COMMUNITYQUESTIONID in", values, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDNotIn(List<String> values) {
            addCriterion("COMMUNITYQUESTIONID not in", values, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDBetween(String value1, String value2) {
            addCriterion("COMMUNITYQUESTIONID between", value1, value2, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andCOMMUNITYQUESTIONIDNotBetween(String value1, String value2) {
            addCriterion("COMMUNITYQUESTIONID not between", value1, value2, "COMMUNITYQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andTIMEIsNull() {
            addCriterion("TIME is null");
            return (Criteria) this;
        }

        public Criteria andTIMEIsNotNull() {
            addCriterion("TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTIMEEqualTo(String value) {
            addCriterion("TIME =", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMENotEqualTo(String value) {
            addCriterion("TIME <>", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMEGreaterThan(String value) {
            addCriterion("TIME >", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMEGreaterThanOrEqualTo(String value) {
            addCriterion("TIME >=", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMELessThan(String value) {
            addCriterion("TIME <", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMELessThanOrEqualTo(String value) {
            addCriterion("TIME <=", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMELike(String value) {
            addCriterion("TIME like", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMENotLike(String value) {
            addCriterion("TIME not like", value, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMEIn(List<String> values) {
            addCriterion("TIME in", values, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMENotIn(List<String> values) {
            addCriterion("TIME not in", values, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMEBetween(String value1, String value2) {
            addCriterion("TIME between", value1, value2, "TIME");
            return (Criteria) this;
        }

        public Criteria andTIMENotBetween(String value1, String value2) {
            addCriterion("TIME not between", value1, value2, "TIME");
            return (Criteria) this;
        }

        public Criteria andTITLEIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTITLEIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTITLEEqualTo(String value) {
            addCriterion("TITLE =", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotEqualTo(String value) {
            addCriterion("TITLE <>", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEGreaterThan(String value) {
            addCriterion("TITLE >", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLELessThan(String value) {
            addCriterion("TITLE <", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLELessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLELike(String value) {
            addCriterion("TITLE like", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotLike(String value) {
            addCriterion("TITLE not like", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEIn(List<String> values) {
            addCriterion("TITLE in", values, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotIn(List<String> values) {
            addCriterion("TITLE not in", values, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "TITLE");
            return (Criteria) this;
        }

        public Criteria andCLASSIFYIDIsNull() {
            addCriterion("CLASSIFYID is null");
            return (Criteria) this;
        }

        public Criteria andCLASSIFYIDIsNotNull() {
            addCriterion("CLASSIFYID is not null");
            return (Criteria) this;
        }

        public Criteria andCLASSIFYIDEqualTo(String value) {
            addCriterion("CLASSIFYID =", value, "CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCLASSIFYIDNotEqualTo(String value) {
            addCriterion("CLASSIFYID <>", value, "CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCLASSIFYIDGreaterThan(String value) {
            addCriterion("CLASSIFYID >", value, "CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCLASSIFYIDGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSIFYID >=", value, "CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCLASSIFYIDLessThan(String value) {
            addCriterion("CLASSIFYID <", value, "CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCLASSIFYIDLessThanOrEqualTo(String value) {
            addCriterion("CLASSIFYID <=", value, "CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCLASSIFYIDLike(String value) {
            addCriterion("CLASSIFYID like", value, "CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCLASSIFYIDNotLike(String value) {
            addCriterion("CLASSIFYID not like", value, "CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCLASSIFYIDIn(List<String> values) {
            addCriterion("CLASSIFYID in", values, "CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCLASSIFYIDNotIn(List<String> values) {
            addCriterion("CLASSIFYID not in", values, "CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCLASSIFYIDBetween(String value1, String value2) {
            addCriterion("CLASSIFYID between", value1, value2, "CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCLASSIFYIDNotBetween(String value1, String value2) {
            addCriterion("CLASSIFYID not between", value1, value2, "CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andUSERIDIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUSERIDIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUSERIDEqualTo(String value) {
            addCriterion("USERID =", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDNotEqualTo(String value) {
            addCriterion("USERID <>", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDGreaterThan(String value) {
            addCriterion("USERID >", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDLessThan(String value) {
            addCriterion("USERID <", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDLike(String value) {
            addCriterion("USERID like", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDNotLike(String value) {
            addCriterion("USERID not like", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDIn(List<String> values) {
            addCriterion("USERID in", values, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDNotIn(List<String> values) {
            addCriterion("USERID not in", values, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "USERID");
            return (Criteria) this;
        }

        public Criteria andSCANIsNull() {
            addCriterion("SCAN is null");
            return (Criteria) this;
        }

        public Criteria andSCANIsNotNull() {
            addCriterion("SCAN is not null");
            return (Criteria) this;
        }

        public Criteria andSCANEqualTo(String value) {
            addCriterion("SCAN =", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANNotEqualTo(String value) {
            addCriterion("SCAN <>", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANGreaterThan(String value) {
            addCriterion("SCAN >", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANGreaterThanOrEqualTo(String value) {
            addCriterion("SCAN >=", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANLessThan(String value) {
            addCriterion("SCAN <", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANLessThanOrEqualTo(String value) {
            addCriterion("SCAN <=", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANLike(String value) {
            addCriterion("SCAN like", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANNotLike(String value) {
            addCriterion("SCAN not like", value, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANIn(List<String> values) {
            addCriterion("SCAN in", values, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANNotIn(List<String> values) {
            addCriterion("SCAN not in", values, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANBetween(String value1, String value2) {
            addCriterion("SCAN between", value1, value2, "SCAN");
            return (Criteria) this;
        }

        public Criteria andSCANNotBetween(String value1, String value2) {
            addCriterion("SCAN not between", value1, value2, "SCAN");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATEIsNull() {
            addCriterion("QUESTIONSTATE is null");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATEIsNotNull() {
            addCriterion("QUESTIONSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATEEqualTo(Integer value) {
            addCriterion("QUESTIONSTATE =", value, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATENotEqualTo(Integer value) {
            addCriterion("QUESTIONSTATE <>", value, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATEGreaterThan(Integer value) {
            addCriterion("QUESTIONSTATE >", value, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUESTIONSTATE >=", value, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATELessThan(Integer value) {
            addCriterion("QUESTIONSTATE <", value, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATELessThanOrEqualTo(Integer value) {
            addCriterion("QUESTIONSTATE <=", value, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATEIn(List<Integer> values) {
            addCriterion("QUESTIONSTATE in", values, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATENotIn(List<Integer> values) {
            addCriterion("QUESTIONSTATE not in", values, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATEBetween(Integer value1, Integer value2) {
            addCriterion("QUESTIONSTATE between", value1, value2, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATENotBetween(Integer value1, Integer value2) {
            addCriterion("QUESTIONSTATE not between", value1, value2, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andISANSWERIsNull() {
            addCriterion("ISANSWER is null");
            return (Criteria) this;
        }

        public Criteria andISANSWERIsNotNull() {
            addCriterion("ISANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andISANSWEREqualTo(Integer value) {
            addCriterion("ISANSWER =", value, "ISANSWER");
            return (Criteria) this;
        }

        public Criteria andISANSWERNotEqualTo(Integer value) {
            addCriterion("ISANSWER <>", value, "ISANSWER");
            return (Criteria) this;
        }

        public Criteria andISANSWERGreaterThan(Integer value) {
            addCriterion("ISANSWER >", value, "ISANSWER");
            return (Criteria) this;
        }

        public Criteria andISANSWERGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISANSWER >=", value, "ISANSWER");
            return (Criteria) this;
        }

        public Criteria andISANSWERLessThan(Integer value) {
            addCriterion("ISANSWER <", value, "ISANSWER");
            return (Criteria) this;
        }

        public Criteria andISANSWERLessThanOrEqualTo(Integer value) {
            addCriterion("ISANSWER <=", value, "ISANSWER");
            return (Criteria) this;
        }

        public Criteria andISANSWERIn(List<Integer> values) {
            addCriterion("ISANSWER in", values, "ISANSWER");
            return (Criteria) this;
        }

        public Criteria andISANSWERNotIn(List<Integer> values) {
            addCriterion("ISANSWER not in", values, "ISANSWER");
            return (Criteria) this;
        }

        public Criteria andISANSWERBetween(Integer value1, Integer value2) {
            addCriterion("ISANSWER between", value1, value2, "ISANSWER");
            return (Criteria) this;
        }

        public Criteria andISANSWERNotBetween(Integer value1, Integer value2) {
            addCriterion("ISANSWER not between", value1, value2, "ISANSWER");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}