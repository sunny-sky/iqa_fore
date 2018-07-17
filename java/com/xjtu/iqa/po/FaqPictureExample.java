package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class FaqPictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FaqPictureExample() {
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

        public Criteria andFAQPICTUREIDIsNull() {
            addCriterion("FAQPICTUREID is null");
            return (Criteria) this;
        }

        public Criteria andFAQPICTUREIDIsNotNull() {
            addCriterion("FAQPICTUREID is not null");
            return (Criteria) this;
        }

        public Criteria andFAQPICTUREIDEqualTo(String value) {
            addCriterion("FAQPICTUREID =", value, "FAQPICTUREID");
            return (Criteria) this;
        }

        public Criteria andFAQPICTUREIDNotEqualTo(String value) {
            addCriterion("FAQPICTUREID <>", value, "FAQPICTUREID");
            return (Criteria) this;
        }

        public Criteria andFAQPICTUREIDGreaterThan(String value) {
            addCriterion("FAQPICTUREID >", value, "FAQPICTUREID");
            return (Criteria) this;
        }

        public Criteria andFAQPICTUREIDGreaterThanOrEqualTo(String value) {
            addCriterion("FAQPICTUREID >=", value, "FAQPICTUREID");
            return (Criteria) this;
        }

        public Criteria andFAQPICTUREIDLessThan(String value) {
            addCriterion("FAQPICTUREID <", value, "FAQPICTUREID");
            return (Criteria) this;
        }

        public Criteria andFAQPICTUREIDLessThanOrEqualTo(String value) {
            addCriterion("FAQPICTUREID <=", value, "FAQPICTUREID");
            return (Criteria) this;
        }

        public Criteria andFAQPICTUREIDLike(String value) {
            addCriterion("FAQPICTUREID like", value, "FAQPICTUREID");
            return (Criteria) this;
        }

        public Criteria andFAQPICTUREIDNotLike(String value) {
            addCriterion("FAQPICTUREID not like", value, "FAQPICTUREID");
            return (Criteria) this;
        }

        public Criteria andFAQPICTUREIDIn(List<String> values) {
            addCriterion("FAQPICTUREID in", values, "FAQPICTUREID");
            return (Criteria) this;
        }

        public Criteria andFAQPICTUREIDNotIn(List<String> values) {
            addCriterion("FAQPICTUREID not in", values, "FAQPICTUREID");
            return (Criteria) this;
        }

        public Criteria andFAQPICTUREIDBetween(String value1, String value2) {
            addCriterion("FAQPICTUREID between", value1, value2, "FAQPICTUREID");
            return (Criteria) this;
        }

        public Criteria andFAQPICTUREIDNotBetween(String value1, String value2) {
            addCriterion("FAQPICTUREID not between", value1, value2, "FAQPICTUREID");
            return (Criteria) this;
        }

        public Criteria andIMGPATHIsNull() {
            addCriterion("IMGPATH is null");
            return (Criteria) this;
        }

        public Criteria andIMGPATHIsNotNull() {
            addCriterion("IMGPATH is not null");
            return (Criteria) this;
        }

        public Criteria andIMGPATHEqualTo(String value) {
            addCriterion("IMGPATH =", value, "IMGPATH");
            return (Criteria) this;
        }

        public Criteria andIMGPATHNotEqualTo(String value) {
            addCriterion("IMGPATH <>", value, "IMGPATH");
            return (Criteria) this;
        }

        public Criteria andIMGPATHGreaterThan(String value) {
            addCriterion("IMGPATH >", value, "IMGPATH");
            return (Criteria) this;
        }

        public Criteria andIMGPATHGreaterThanOrEqualTo(String value) {
            addCriterion("IMGPATH >=", value, "IMGPATH");
            return (Criteria) this;
        }

        public Criteria andIMGPATHLessThan(String value) {
            addCriterion("IMGPATH <", value, "IMGPATH");
            return (Criteria) this;
        }

        public Criteria andIMGPATHLessThanOrEqualTo(String value) {
            addCriterion("IMGPATH <=", value, "IMGPATH");
            return (Criteria) this;
        }

        public Criteria andIMGPATHLike(String value) {
            addCriterion("IMGPATH like", value, "IMGPATH");
            return (Criteria) this;
        }

        public Criteria andIMGPATHNotLike(String value) {
            addCriterion("IMGPATH not like", value, "IMGPATH");
            return (Criteria) this;
        }

        public Criteria andIMGPATHIn(List<String> values) {
            addCriterion("IMGPATH in", values, "IMGPATH");
            return (Criteria) this;
        }

        public Criteria andIMGPATHNotIn(List<String> values) {
            addCriterion("IMGPATH not in", values, "IMGPATH");
            return (Criteria) this;
        }

        public Criteria andIMGPATHBetween(String value1, String value2) {
            addCriterion("IMGPATH between", value1, value2, "IMGPATH");
            return (Criteria) this;
        }

        public Criteria andIMGPATHNotBetween(String value1, String value2) {
            addCriterion("IMGPATH not between", value1, value2, "IMGPATH");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLike(String value) {
            addCriterion("DESCRIPTION like", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "DESCRIPTION");
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

        public Criteria andSTATEIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andSTATEIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andSTATEEqualTo(Integer value) {
            addCriterion("STATE =", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATENotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEGreaterThan(Integer value) {
            addCriterion("STATE >", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATELessThan(Integer value) {
            addCriterion("STATE <", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATELessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEIn(List<Integer> values) {
            addCriterion("STATE in", values, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATENotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATENotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "STATE");
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