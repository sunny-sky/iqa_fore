package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class MessageHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageHistoryExample() {
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

        public Criteria andMESSAGEHISTORYIDIsNull() {
            addCriterion("MESSAGEHISTORYID is null");
            return (Criteria) this;
        }

        public Criteria andMESSAGEHISTORYIDIsNotNull() {
            addCriterion("MESSAGEHISTORYID is not null");
            return (Criteria) this;
        }

        public Criteria andMESSAGEHISTORYIDEqualTo(String value) {
            addCriterion("MESSAGEHISTORYID =", value, "MESSAGEHISTORYID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEHISTORYIDNotEqualTo(String value) {
            addCriterion("MESSAGEHISTORYID <>", value, "MESSAGEHISTORYID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEHISTORYIDGreaterThan(String value) {
            addCriterion("MESSAGEHISTORYID >", value, "MESSAGEHISTORYID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEHISTORYIDGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGEHISTORYID >=", value, "MESSAGEHISTORYID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEHISTORYIDLessThan(String value) {
            addCriterion("MESSAGEHISTORYID <", value, "MESSAGEHISTORYID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEHISTORYIDLessThanOrEqualTo(String value) {
            addCriterion("MESSAGEHISTORYID <=", value, "MESSAGEHISTORYID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEHISTORYIDLike(String value) {
            addCriterion("MESSAGEHISTORYID like", value, "MESSAGEHISTORYID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEHISTORYIDNotLike(String value) {
            addCriterion("MESSAGEHISTORYID not like", value, "MESSAGEHISTORYID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEHISTORYIDIn(List<String> values) {
            addCriterion("MESSAGEHISTORYID in", values, "MESSAGEHISTORYID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEHISTORYIDNotIn(List<String> values) {
            addCriterion("MESSAGEHISTORYID not in", values, "MESSAGEHISTORYID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEHISTORYIDBetween(String value1, String value2) {
            addCriterion("MESSAGEHISTORYID between", value1, value2, "MESSAGEHISTORYID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEHISTORYIDNotBetween(String value1, String value2) {
            addCriterion("MESSAGEHISTORYID not between", value1, value2, "MESSAGEHISTORYID");
            return (Criteria) this;
        }

        public Criteria andPOSTUSERIDIsNull() {
            addCriterion("POSTUSERID is null");
            return (Criteria) this;
        }

        public Criteria andPOSTUSERIDIsNotNull() {
            addCriterion("POSTUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andPOSTUSERIDEqualTo(String value) {
            addCriterion("POSTUSERID =", value, "POSTUSERID");
            return (Criteria) this;
        }

        public Criteria andPOSTUSERIDNotEqualTo(String value) {
            addCriterion("POSTUSERID <>", value, "POSTUSERID");
            return (Criteria) this;
        }

        public Criteria andPOSTUSERIDGreaterThan(String value) {
            addCriterion("POSTUSERID >", value, "POSTUSERID");
            return (Criteria) this;
        }

        public Criteria andPOSTUSERIDGreaterThanOrEqualTo(String value) {
            addCriterion("POSTUSERID >=", value, "POSTUSERID");
            return (Criteria) this;
        }

        public Criteria andPOSTUSERIDLessThan(String value) {
            addCriterion("POSTUSERID <", value, "POSTUSERID");
            return (Criteria) this;
        }

        public Criteria andPOSTUSERIDLessThanOrEqualTo(String value) {
            addCriterion("POSTUSERID <=", value, "POSTUSERID");
            return (Criteria) this;
        }

        public Criteria andPOSTUSERIDLike(String value) {
            addCriterion("POSTUSERID like", value, "POSTUSERID");
            return (Criteria) this;
        }

        public Criteria andPOSTUSERIDNotLike(String value) {
            addCriterion("POSTUSERID not like", value, "POSTUSERID");
            return (Criteria) this;
        }

        public Criteria andPOSTUSERIDIn(List<String> values) {
            addCriterion("POSTUSERID in", values, "POSTUSERID");
            return (Criteria) this;
        }

        public Criteria andPOSTUSERIDNotIn(List<String> values) {
            addCriterion("POSTUSERID not in", values, "POSTUSERID");
            return (Criteria) this;
        }

        public Criteria andPOSTUSERIDBetween(String value1, String value2) {
            addCriterion("POSTUSERID between", value1, value2, "POSTUSERID");
            return (Criteria) this;
        }

        public Criteria andPOSTUSERIDNotBetween(String value1, String value2) {
            addCriterion("POSTUSERID not between", value1, value2, "POSTUSERID");
            return (Criteria) this;
        }

        public Criteria andGETUSERIDIsNull() {
            addCriterion("GETUSERID is null");
            return (Criteria) this;
        }

        public Criteria andGETUSERIDIsNotNull() {
            addCriterion("GETUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andGETUSERIDEqualTo(String value) {
            addCriterion("GETUSERID =", value, "GETUSERID");
            return (Criteria) this;
        }

        public Criteria andGETUSERIDNotEqualTo(String value) {
            addCriterion("GETUSERID <>", value, "GETUSERID");
            return (Criteria) this;
        }

        public Criteria andGETUSERIDGreaterThan(String value) {
            addCriterion("GETUSERID >", value, "GETUSERID");
            return (Criteria) this;
        }

        public Criteria andGETUSERIDGreaterThanOrEqualTo(String value) {
            addCriterion("GETUSERID >=", value, "GETUSERID");
            return (Criteria) this;
        }

        public Criteria andGETUSERIDLessThan(String value) {
            addCriterion("GETUSERID <", value, "GETUSERID");
            return (Criteria) this;
        }

        public Criteria andGETUSERIDLessThanOrEqualTo(String value) {
            addCriterion("GETUSERID <=", value, "GETUSERID");
            return (Criteria) this;
        }

        public Criteria andGETUSERIDLike(String value) {
            addCriterion("GETUSERID like", value, "GETUSERID");
            return (Criteria) this;
        }

        public Criteria andGETUSERIDNotLike(String value) {
            addCriterion("GETUSERID not like", value, "GETUSERID");
            return (Criteria) this;
        }

        public Criteria andGETUSERIDIn(List<String> values) {
            addCriterion("GETUSERID in", values, "GETUSERID");
            return (Criteria) this;
        }

        public Criteria andGETUSERIDNotIn(List<String> values) {
            addCriterion("GETUSERID not in", values, "GETUSERID");
            return (Criteria) this;
        }

        public Criteria andGETUSERIDBetween(String value1, String value2) {
            addCriterion("GETUSERID between", value1, value2, "GETUSERID");
            return (Criteria) this;
        }

        public Criteria andGETUSERIDNotBetween(String value1, String value2) {
            addCriterion("GETUSERID not between", value1, value2, "GETUSERID");
            return (Criteria) this;
        }

        public Criteria andTIMEMARKIsNull() {
            addCriterion("TIMEMARK is null");
            return (Criteria) this;
        }

        public Criteria andTIMEMARKIsNotNull() {
            addCriterion("TIMEMARK is not null");
            return (Criteria) this;
        }

        public Criteria andTIMEMARKEqualTo(String value) {
            addCriterion("TIMEMARK =", value, "TIMEMARK");
            return (Criteria) this;
        }

        public Criteria andTIMEMARKNotEqualTo(String value) {
            addCriterion("TIMEMARK <>", value, "TIMEMARK");
            return (Criteria) this;
        }

        public Criteria andTIMEMARKGreaterThan(String value) {
            addCriterion("TIMEMARK >", value, "TIMEMARK");
            return (Criteria) this;
        }

        public Criteria andTIMEMARKGreaterThanOrEqualTo(String value) {
            addCriterion("TIMEMARK >=", value, "TIMEMARK");
            return (Criteria) this;
        }

        public Criteria andTIMEMARKLessThan(String value) {
            addCriterion("TIMEMARK <", value, "TIMEMARK");
            return (Criteria) this;
        }

        public Criteria andTIMEMARKLessThanOrEqualTo(String value) {
            addCriterion("TIMEMARK <=", value, "TIMEMARK");
            return (Criteria) this;
        }

        public Criteria andTIMEMARKLike(String value) {
            addCriterion("TIMEMARK like", value, "TIMEMARK");
            return (Criteria) this;
        }

        public Criteria andTIMEMARKNotLike(String value) {
            addCriterion("TIMEMARK not like", value, "TIMEMARK");
            return (Criteria) this;
        }

        public Criteria andTIMEMARKIn(List<String> values) {
            addCriterion("TIMEMARK in", values, "TIMEMARK");
            return (Criteria) this;
        }

        public Criteria andTIMEMARKNotIn(List<String> values) {
            addCriterion("TIMEMARK not in", values, "TIMEMARK");
            return (Criteria) this;
        }

        public Criteria andTIMEMARKBetween(String value1, String value2) {
            addCriterion("TIMEMARK between", value1, value2, "TIMEMARK");
            return (Criteria) this;
        }

        public Criteria andTIMEMARKNotBetween(String value1, String value2) {
            addCriterion("TIMEMARK not between", value1, value2, "TIMEMARK");
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