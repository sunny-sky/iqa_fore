package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class UserQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserQuestionExample() {
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

        public Criteria andUSERQUESTIONIDIsNull() {
            addCriterion("USERQUESTIONID is null");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDIsNotNull() {
            addCriterion("USERQUESTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDEqualTo(String value) {
            addCriterion("USERQUESTIONID =", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDNotEqualTo(String value) {
            addCriterion("USERQUESTIONID <>", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDGreaterThan(String value) {
            addCriterion("USERQUESTIONID >", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDGreaterThanOrEqualTo(String value) {
            addCriterion("USERQUESTIONID >=", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDLessThan(String value) {
            addCriterion("USERQUESTIONID <", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDLessThanOrEqualTo(String value) {
            addCriterion("USERQUESTIONID <=", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDLike(String value) {
            addCriterion("USERQUESTIONID like", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDNotLike(String value) {
            addCriterion("USERQUESTIONID not like", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDIn(List<String> values) {
            addCriterion("USERQUESTIONID in", values, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDNotIn(List<String> values) {
            addCriterion("USERQUESTIONID not in", values, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDBetween(String value1, String value2) {
            addCriterion("USERQUESTIONID between", value1, value2, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDNotBetween(String value1, String value2) {
            addCriterion("USERQUESTIONID not between", value1, value2, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTITLEIsNull() {
            addCriterion("QUESTIONTITLE is null");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTITLEIsNotNull() {
            addCriterion("QUESTIONTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTITLEEqualTo(String value) {
            addCriterion("QUESTIONTITLE =", value, "QUESTIONTITLE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTITLENotEqualTo(String value) {
            addCriterion("QUESTIONTITLE <>", value, "QUESTIONTITLE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTITLEGreaterThan(String value) {
            addCriterion("QUESTIONTITLE >", value, "QUESTIONTITLE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTITLEGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTIONTITLE >=", value, "QUESTIONTITLE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTITLELessThan(String value) {
            addCriterion("QUESTIONTITLE <", value, "QUESTIONTITLE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTITLELessThanOrEqualTo(String value) {
            addCriterion("QUESTIONTITLE <=", value, "QUESTIONTITLE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTITLELike(String value) {
            addCriterion("QUESTIONTITLE like", value, "QUESTIONTITLE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTITLENotLike(String value) {
            addCriterion("QUESTIONTITLE not like", value, "QUESTIONTITLE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTITLEIn(List<String> values) {
            addCriterion("QUESTIONTITLE in", values, "QUESTIONTITLE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTITLENotIn(List<String> values) {
            addCriterion("QUESTIONTITLE not in", values, "QUESTIONTITLE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTITLEBetween(String value1, String value2) {
            addCriterion("QUESTIONTITLE between", value1, value2, "QUESTIONTITLE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTITLENotBetween(String value1, String value2) {
            addCriterion("QUESTIONTITLE not between", value1, value2, "QUESTIONTITLE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTIMEIsNull() {
            addCriterion("QUESTIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTIMEIsNotNull() {
            addCriterion("QUESTIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTIMEEqualTo(String value) {
            addCriterion("QUESTIONTIME =", value, "QUESTIONTIME");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTIMENotEqualTo(String value) {
            addCriterion("QUESTIONTIME <>", value, "QUESTIONTIME");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTIMEGreaterThan(String value) {
            addCriterion("QUESTIONTIME >", value, "QUESTIONTIME");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTIMEGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTIONTIME >=", value, "QUESTIONTIME");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTIMELessThan(String value) {
            addCriterion("QUESTIONTIME <", value, "QUESTIONTIME");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTIMELessThanOrEqualTo(String value) {
            addCriterion("QUESTIONTIME <=", value, "QUESTIONTIME");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTIMELike(String value) {
            addCriterion("QUESTIONTIME like", value, "QUESTIONTIME");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTIMENotLike(String value) {
            addCriterion("QUESTIONTIME not like", value, "QUESTIONTIME");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTIMEIn(List<String> values) {
            addCriterion("QUESTIONTIME in", values, "QUESTIONTIME");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTIMENotIn(List<String> values) {
            addCriterion("QUESTIONTIME not in", values, "QUESTIONTIME");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTIMEBetween(String value1, String value2) {
            addCriterion("QUESTIONTIME between", value1, value2, "QUESTIONTIME");
            return (Criteria) this;
        }

        public Criteria andQUESTIONTIMENotBetween(String value1, String value2) {
            addCriterion("QUESTIONTIME not between", value1, value2, "QUESTIONTIME");
            return (Criteria) this;
        }

        public Criteria andISFAQIsNull() {
            addCriterion("ISFAQ is null");
            return (Criteria) this;
        }

        public Criteria andISFAQIsNotNull() {
            addCriterion("ISFAQ is not null");
            return (Criteria) this;
        }

        public Criteria andISFAQEqualTo(Integer value) {
            addCriterion("ISFAQ =", value, "ISFAQ");
            return (Criteria) this;
        }

        public Criteria andISFAQNotEqualTo(Integer value) {
            addCriterion("ISFAQ <>", value, "ISFAQ");
            return (Criteria) this;
        }

        public Criteria andISFAQGreaterThan(Integer value) {
            addCriterion("ISFAQ >", value, "ISFAQ");
            return (Criteria) this;
        }

        public Criteria andISFAQGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISFAQ >=", value, "ISFAQ");
            return (Criteria) this;
        }

        public Criteria andISFAQLessThan(Integer value) {
            addCriterion("ISFAQ <", value, "ISFAQ");
            return (Criteria) this;
        }

        public Criteria andISFAQLessThanOrEqualTo(Integer value) {
            addCriterion("ISFAQ <=", value, "ISFAQ");
            return (Criteria) this;
        }

        public Criteria andISFAQIn(List<Integer> values) {
            addCriterion("ISFAQ in", values, "ISFAQ");
            return (Criteria) this;
        }

        public Criteria andISFAQNotIn(List<Integer> values) {
            addCriterion("ISFAQ not in", values, "ISFAQ");
            return (Criteria) this;
        }

        public Criteria andISFAQBetween(Integer value1, Integer value2) {
            addCriterion("ISFAQ between", value1, value2, "ISFAQ");
            return (Criteria) this;
        }

        public Criteria andISFAQNotBetween(Integer value1, Integer value2) {
            addCriterion("ISFAQ not between", value1, value2, "ISFAQ");
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