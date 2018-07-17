package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class PayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayExample() {
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

        public Criteria andPAYIDIsNull() {
            addCriterion("PAYID is null");
            return (Criteria) this;
        }

        public Criteria andPAYIDIsNotNull() {
            addCriterion("PAYID is not null");
            return (Criteria) this;
        }

        public Criteria andPAYIDEqualTo(String value) {
            addCriterion("PAYID =", value, "PAYID");
            return (Criteria) this;
        }

        public Criteria andPAYIDNotEqualTo(String value) {
            addCriterion("PAYID <>", value, "PAYID");
            return (Criteria) this;
        }

        public Criteria andPAYIDGreaterThan(String value) {
            addCriterion("PAYID >", value, "PAYID");
            return (Criteria) this;
        }

        public Criteria andPAYIDGreaterThanOrEqualTo(String value) {
            addCriterion("PAYID >=", value, "PAYID");
            return (Criteria) this;
        }

        public Criteria andPAYIDLessThan(String value) {
            addCriterion("PAYID <", value, "PAYID");
            return (Criteria) this;
        }

        public Criteria andPAYIDLessThanOrEqualTo(String value) {
            addCriterion("PAYID <=", value, "PAYID");
            return (Criteria) this;
        }

        public Criteria andPAYIDLike(String value) {
            addCriterion("PAYID like", value, "PAYID");
            return (Criteria) this;
        }

        public Criteria andPAYIDNotLike(String value) {
            addCriterion("PAYID not like", value, "PAYID");
            return (Criteria) this;
        }

        public Criteria andPAYIDIn(List<String> values) {
            addCriterion("PAYID in", values, "PAYID");
            return (Criteria) this;
        }

        public Criteria andPAYIDNotIn(List<String> values) {
            addCriterion("PAYID not in", values, "PAYID");
            return (Criteria) this;
        }

        public Criteria andPAYIDBetween(String value1, String value2) {
            addCriterion("PAYID between", value1, value2, "PAYID");
            return (Criteria) this;
        }

        public Criteria andPAYIDNotBetween(String value1, String value2) {
            addCriterion("PAYID not between", value1, value2, "PAYID");
            return (Criteria) this;
        }

        public Criteria andPAYUSERIDIsNull() {
            addCriterion("PAYUSERID is null");
            return (Criteria) this;
        }

        public Criteria andPAYUSERIDIsNotNull() {
            addCriterion("PAYUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andPAYUSERIDEqualTo(String value) {
            addCriterion("PAYUSERID =", value, "PAYUSERID");
            return (Criteria) this;
        }

        public Criteria andPAYUSERIDNotEqualTo(String value) {
            addCriterion("PAYUSERID <>", value, "PAYUSERID");
            return (Criteria) this;
        }

        public Criteria andPAYUSERIDGreaterThan(String value) {
            addCriterion("PAYUSERID >", value, "PAYUSERID");
            return (Criteria) this;
        }

        public Criteria andPAYUSERIDGreaterThanOrEqualTo(String value) {
            addCriterion("PAYUSERID >=", value, "PAYUSERID");
            return (Criteria) this;
        }

        public Criteria andPAYUSERIDLessThan(String value) {
            addCriterion("PAYUSERID <", value, "PAYUSERID");
            return (Criteria) this;
        }

        public Criteria andPAYUSERIDLessThanOrEqualTo(String value) {
            addCriterion("PAYUSERID <=", value, "PAYUSERID");
            return (Criteria) this;
        }

        public Criteria andPAYUSERIDLike(String value) {
            addCriterion("PAYUSERID like", value, "PAYUSERID");
            return (Criteria) this;
        }

        public Criteria andPAYUSERIDNotLike(String value) {
            addCriterion("PAYUSERID not like", value, "PAYUSERID");
            return (Criteria) this;
        }

        public Criteria andPAYUSERIDIn(List<String> values) {
            addCriterion("PAYUSERID in", values, "PAYUSERID");
            return (Criteria) this;
        }

        public Criteria andPAYUSERIDNotIn(List<String> values) {
            addCriterion("PAYUSERID not in", values, "PAYUSERID");
            return (Criteria) this;
        }

        public Criteria andPAYUSERIDBetween(String value1, String value2) {
            addCriterion("PAYUSERID between", value1, value2, "PAYUSERID");
            return (Criteria) this;
        }

        public Criteria andPAYUSERIDNotBetween(String value1, String value2) {
            addCriterion("PAYUSERID not between", value1, value2, "PAYUSERID");
            return (Criteria) this;
        }

        public Criteria andBEPAYUSERIDIsNull() {
            addCriterion("BEPAYUSERID is null");
            return (Criteria) this;
        }

        public Criteria andBEPAYUSERIDIsNotNull() {
            addCriterion("BEPAYUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andBEPAYUSERIDEqualTo(String value) {
            addCriterion("BEPAYUSERID =", value, "BEPAYUSERID");
            return (Criteria) this;
        }

        public Criteria andBEPAYUSERIDNotEqualTo(String value) {
            addCriterion("BEPAYUSERID <>", value, "BEPAYUSERID");
            return (Criteria) this;
        }

        public Criteria andBEPAYUSERIDGreaterThan(String value) {
            addCriterion("BEPAYUSERID >", value, "BEPAYUSERID");
            return (Criteria) this;
        }

        public Criteria andBEPAYUSERIDGreaterThanOrEqualTo(String value) {
            addCriterion("BEPAYUSERID >=", value, "BEPAYUSERID");
            return (Criteria) this;
        }

        public Criteria andBEPAYUSERIDLessThan(String value) {
            addCriterion("BEPAYUSERID <", value, "BEPAYUSERID");
            return (Criteria) this;
        }

        public Criteria andBEPAYUSERIDLessThanOrEqualTo(String value) {
            addCriterion("BEPAYUSERID <=", value, "BEPAYUSERID");
            return (Criteria) this;
        }

        public Criteria andBEPAYUSERIDLike(String value) {
            addCriterion("BEPAYUSERID like", value, "BEPAYUSERID");
            return (Criteria) this;
        }

        public Criteria andBEPAYUSERIDNotLike(String value) {
            addCriterion("BEPAYUSERID not like", value, "BEPAYUSERID");
            return (Criteria) this;
        }

        public Criteria andBEPAYUSERIDIn(List<String> values) {
            addCriterion("BEPAYUSERID in", values, "BEPAYUSERID");
            return (Criteria) this;
        }

        public Criteria andBEPAYUSERIDNotIn(List<String> values) {
            addCriterion("BEPAYUSERID not in", values, "BEPAYUSERID");
            return (Criteria) this;
        }

        public Criteria andBEPAYUSERIDBetween(String value1, String value2) {
            addCriterion("BEPAYUSERID between", value1, value2, "BEPAYUSERID");
            return (Criteria) this;
        }

        public Criteria andBEPAYUSERIDNotBetween(String value1, String value2) {
            addCriterion("BEPAYUSERID not between", value1, value2, "BEPAYUSERID");
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