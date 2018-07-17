package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class ItExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItExample() {
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

        public Criteria andGOODWORKIsNull() {
            addCriterion("GOODWORK is null");
            return (Criteria) this;
        }

        public Criteria andGOODWORKIsNotNull() {
            addCriterion("GOODWORK is not null");
            return (Criteria) this;
        }

        public Criteria andGOODWORKEqualTo(String value) {
            addCriterion("GOODWORK =", value, "GOODWORK");
            return (Criteria) this;
        }

        public Criteria andGOODWORKNotEqualTo(String value) {
            addCriterion("GOODWORK <>", value, "GOODWORK");
            return (Criteria) this;
        }

        public Criteria andGOODWORKGreaterThan(String value) {
            addCriterion("GOODWORK >", value, "GOODWORK");
            return (Criteria) this;
        }

        public Criteria andGOODWORKGreaterThanOrEqualTo(String value) {
            addCriterion("GOODWORK >=", value, "GOODWORK");
            return (Criteria) this;
        }

        public Criteria andGOODWORKLessThan(String value) {
            addCriterion("GOODWORK <", value, "GOODWORK");
            return (Criteria) this;
        }

        public Criteria andGOODWORKLessThanOrEqualTo(String value) {
            addCriterion("GOODWORK <=", value, "GOODWORK");
            return (Criteria) this;
        }

        public Criteria andGOODWORKLike(String value) {
            addCriterion("GOODWORK like", value, "GOODWORK");
            return (Criteria) this;
        }

        public Criteria andGOODWORKNotLike(String value) {
            addCriterion("GOODWORK not like", value, "GOODWORK");
            return (Criteria) this;
        }

        public Criteria andGOODWORKIn(List<String> values) {
            addCriterion("GOODWORK in", values, "GOODWORK");
            return (Criteria) this;
        }

        public Criteria andGOODWORKNotIn(List<String> values) {
            addCriterion("GOODWORK not in", values, "GOODWORK");
            return (Criteria) this;
        }

        public Criteria andGOODWORKBetween(String value1, String value2) {
            addCriterion("GOODWORK between", value1, value2, "GOODWORK");
            return (Criteria) this;
        }

        public Criteria andGOODWORKNotBetween(String value1, String value2) {
            addCriterion("GOODWORK not between", value1, value2, "GOODWORK");
            return (Criteria) this;
        }

        public Criteria andWORKAGEIsNull() {
            addCriterion("WORKAGE is null");
            return (Criteria) this;
        }

        public Criteria andWORKAGEIsNotNull() {
            addCriterion("WORKAGE is not null");
            return (Criteria) this;
        }

        public Criteria andWORKAGEEqualTo(String value) {
            addCriterion("WORKAGE =", value, "WORKAGE");
            return (Criteria) this;
        }

        public Criteria andWORKAGENotEqualTo(String value) {
            addCriterion("WORKAGE <>", value, "WORKAGE");
            return (Criteria) this;
        }

        public Criteria andWORKAGEGreaterThan(String value) {
            addCriterion("WORKAGE >", value, "WORKAGE");
            return (Criteria) this;
        }

        public Criteria andWORKAGEGreaterThanOrEqualTo(String value) {
            addCriterion("WORKAGE >=", value, "WORKAGE");
            return (Criteria) this;
        }

        public Criteria andWORKAGELessThan(String value) {
            addCriterion("WORKAGE <", value, "WORKAGE");
            return (Criteria) this;
        }

        public Criteria andWORKAGELessThanOrEqualTo(String value) {
            addCriterion("WORKAGE <=", value, "WORKAGE");
            return (Criteria) this;
        }

        public Criteria andWORKAGELike(String value) {
            addCriterion("WORKAGE like", value, "WORKAGE");
            return (Criteria) this;
        }

        public Criteria andWORKAGENotLike(String value) {
            addCriterion("WORKAGE not like", value, "WORKAGE");
            return (Criteria) this;
        }

        public Criteria andWORKAGEIn(List<String> values) {
            addCriterion("WORKAGE in", values, "WORKAGE");
            return (Criteria) this;
        }

        public Criteria andWORKAGENotIn(List<String> values) {
            addCriterion("WORKAGE not in", values, "WORKAGE");
            return (Criteria) this;
        }

        public Criteria andWORKAGEBetween(String value1, String value2) {
            addCriterion("WORKAGE between", value1, value2, "WORKAGE");
            return (Criteria) this;
        }

        public Criteria andWORKAGENotBetween(String value1, String value2) {
            addCriterion("WORKAGE not between", value1, value2, "WORKAGE");
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