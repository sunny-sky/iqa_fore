package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMESSAGEIDIsNull() {
            addCriterion("MESSAGEID is null");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIDIsNotNull() {
            addCriterion("MESSAGEID is not null");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIDEqualTo(String value) {
            addCriterion("MESSAGEID =", value, "MESSAGEID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIDNotEqualTo(String value) {
            addCriterion("MESSAGEID <>", value, "MESSAGEID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIDGreaterThan(String value) {
            addCriterion("MESSAGEID >", value, "MESSAGEID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIDGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGEID >=", value, "MESSAGEID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIDLessThan(String value) {
            addCriterion("MESSAGEID <", value, "MESSAGEID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIDLessThanOrEqualTo(String value) {
            addCriterion("MESSAGEID <=", value, "MESSAGEID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIDLike(String value) {
            addCriterion("MESSAGEID like", value, "MESSAGEID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIDNotLike(String value) {
            addCriterion("MESSAGEID not like", value, "MESSAGEID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIDIn(List<String> values) {
            addCriterion("MESSAGEID in", values, "MESSAGEID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIDNotIn(List<String> values) {
            addCriterion("MESSAGEID not in", values, "MESSAGEID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIDBetween(String value1, String value2) {
            addCriterion("MESSAGEID between", value1, value2, "MESSAGEID");
            return (Criteria) this;
        }

        public Criteria andMESSAGEIDNotBetween(String value1, String value2) {
            addCriterion("MESSAGEID not between", value1, value2, "MESSAGEID");
            return (Criteria) this;
        }

        public Criteria andMESSAGECONTENTIsNull() {
            addCriterion("MESSAGECONTENT is null");
            return (Criteria) this;
        }

        public Criteria andMESSAGECONTENTIsNotNull() {
            addCriterion("MESSAGECONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andMESSAGECONTENTEqualTo(String value) {
            addCriterion("MESSAGECONTENT =", value, "MESSAGECONTENT");
            return (Criteria) this;
        }

        public Criteria andMESSAGECONTENTNotEqualTo(String value) {
            addCriterion("MESSAGECONTENT <>", value, "MESSAGECONTENT");
            return (Criteria) this;
        }

        public Criteria andMESSAGECONTENTGreaterThan(String value) {
            addCriterion("MESSAGECONTENT >", value, "MESSAGECONTENT");
            return (Criteria) this;
        }

        public Criteria andMESSAGECONTENTGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGECONTENT >=", value, "MESSAGECONTENT");
            return (Criteria) this;
        }

        public Criteria andMESSAGECONTENTLessThan(String value) {
            addCriterion("MESSAGECONTENT <", value, "MESSAGECONTENT");
            return (Criteria) this;
        }

        public Criteria andMESSAGECONTENTLessThanOrEqualTo(String value) {
            addCriterion("MESSAGECONTENT <=", value, "MESSAGECONTENT");
            return (Criteria) this;
        }

        public Criteria andMESSAGECONTENTLike(String value) {
            addCriterion("MESSAGECONTENT like", value, "MESSAGECONTENT");
            return (Criteria) this;
        }

        public Criteria andMESSAGECONTENTNotLike(String value) {
            addCriterion("MESSAGECONTENT not like", value, "MESSAGECONTENT");
            return (Criteria) this;
        }

        public Criteria andMESSAGECONTENTIn(List<String> values) {
            addCriterion("MESSAGECONTENT in", values, "MESSAGECONTENT");
            return (Criteria) this;
        }

        public Criteria andMESSAGECONTENTNotIn(List<String> values) {
            addCriterion("MESSAGECONTENT not in", values, "MESSAGECONTENT");
            return (Criteria) this;
        }

        public Criteria andMESSAGECONTENTBetween(String value1, String value2) {
            addCriterion("MESSAGECONTENT between", value1, value2, "MESSAGECONTENT");
            return (Criteria) this;
        }

        public Criteria andMESSAGECONTENTNotBetween(String value1, String value2) {
            addCriterion("MESSAGECONTENT not between", value1, value2, "MESSAGECONTENT");
            return (Criteria) this;
        }

        public Criteria andMESSAGETIMEIsNull() {
            addCriterion("MESSAGETIME is null");
            return (Criteria) this;
        }

        public Criteria andMESSAGETIMEIsNotNull() {
            addCriterion("MESSAGETIME is not null");
            return (Criteria) this;
        }

        public Criteria andMESSAGETIMEEqualTo(String value) {
            addCriterion("MESSAGETIME =", value, "MESSAGETIME");
            return (Criteria) this;
        }

        public Criteria andMESSAGETIMENotEqualTo(String value) {
            addCriterion("MESSAGETIME <>", value, "MESSAGETIME");
            return (Criteria) this;
        }

        public Criteria andMESSAGETIMEGreaterThan(String value) {
            addCriterion("MESSAGETIME >", value, "MESSAGETIME");
            return (Criteria) this;
        }

        public Criteria andMESSAGETIMEGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGETIME >=", value, "MESSAGETIME");
            return (Criteria) this;
        }

        public Criteria andMESSAGETIMELessThan(String value) {
            addCriterion("MESSAGETIME <", value, "MESSAGETIME");
            return (Criteria) this;
        }

        public Criteria andMESSAGETIMELessThanOrEqualTo(String value) {
            addCriterion("MESSAGETIME <=", value, "MESSAGETIME");
            return (Criteria) this;
        }

        public Criteria andMESSAGETIMELike(String value) {
            addCriterion("MESSAGETIME like", value, "MESSAGETIME");
            return (Criteria) this;
        }

        public Criteria andMESSAGETIMENotLike(String value) {
            addCriterion("MESSAGETIME not like", value, "MESSAGETIME");
            return (Criteria) this;
        }

        public Criteria andMESSAGETIMEIn(List<String> values) {
            addCriterion("MESSAGETIME in", values, "MESSAGETIME");
            return (Criteria) this;
        }

        public Criteria andMESSAGETIMENotIn(List<String> values) {
            addCriterion("MESSAGETIME not in", values, "MESSAGETIME");
            return (Criteria) this;
        }

        public Criteria andMESSAGETIMEBetween(String value1, String value2) {
            addCriterion("MESSAGETIME between", value1, value2, "MESSAGETIME");
            return (Criteria) this;
        }

        public Criteria andMESSAGETIMENotBetween(String value1, String value2) {
            addCriterion("MESSAGETIME not between", value1, value2, "MESSAGETIME");
            return (Criteria) this;
        }

        public Criteria andMESSAGESTATEIsNull() {
            addCriterion("MESSAGESTATE is null");
            return (Criteria) this;
        }

        public Criteria andMESSAGESTATEIsNotNull() {
            addCriterion("MESSAGESTATE is not null");
            return (Criteria) this;
        }

        public Criteria andMESSAGESTATEEqualTo(Integer value) {
            addCriterion("MESSAGESTATE =", value, "MESSAGESTATE");
            return (Criteria) this;
        }

        public Criteria andMESSAGESTATENotEqualTo(Integer value) {
            addCriterion("MESSAGESTATE <>", value, "MESSAGESTATE");
            return (Criteria) this;
        }

        public Criteria andMESSAGESTATEGreaterThan(Integer value) {
            addCriterion("MESSAGESTATE >", value, "MESSAGESTATE");
            return (Criteria) this;
        }

        public Criteria andMESSAGESTATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("MESSAGESTATE >=", value, "MESSAGESTATE");
            return (Criteria) this;
        }

        public Criteria andMESSAGESTATELessThan(Integer value) {
            addCriterion("MESSAGESTATE <", value, "MESSAGESTATE");
            return (Criteria) this;
        }

        public Criteria andMESSAGESTATELessThanOrEqualTo(Integer value) {
            addCriterion("MESSAGESTATE <=", value, "MESSAGESTATE");
            return (Criteria) this;
        }

        public Criteria andMESSAGESTATEIn(List<Integer> values) {
            addCriterion("MESSAGESTATE in", values, "MESSAGESTATE");
            return (Criteria) this;
        }

        public Criteria andMESSAGESTATENotIn(List<Integer> values) {
            addCriterion("MESSAGESTATE not in", values, "MESSAGESTATE");
            return (Criteria) this;
        }

        public Criteria andMESSAGESTATEBetween(Integer value1, Integer value2) {
            addCriterion("MESSAGESTATE between", value1, value2, "MESSAGESTATE");
            return (Criteria) this;
        }

        public Criteria andMESSAGESTATENotBetween(Integer value1, Integer value2) {
            addCriterion("MESSAGESTATE not between", value1, value2, "MESSAGESTATE");
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