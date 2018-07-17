package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
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

        public Criteria andROLEIDIsNull() {
            addCriterion("ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andROLEIDIsNotNull() {
            addCriterion("ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andROLEIDEqualTo(String value) {
            addCriterion("ROLEID =", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDNotEqualTo(String value) {
            addCriterion("ROLEID <>", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDGreaterThan(String value) {
            addCriterion("ROLEID >", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEID >=", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDLessThan(String value) {
            addCriterion("ROLEID <", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDLessThanOrEqualTo(String value) {
            addCriterion("ROLEID <=", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDLike(String value) {
            addCriterion("ROLEID like", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDNotLike(String value) {
            addCriterion("ROLEID not like", value, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDIn(List<String> values) {
            addCriterion("ROLEID in", values, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDNotIn(List<String> values) {
            addCriterion("ROLEID not in", values, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDBetween(String value1, String value2) {
            addCriterion("ROLEID between", value1, value2, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLEIDNotBetween(String value1, String value2) {
            addCriterion("ROLEID not between", value1, value2, "ROLEID");
            return (Criteria) this;
        }

        public Criteria andROLENAMEIsNull() {
            addCriterion("ROLENAME is null");
            return (Criteria) this;
        }

        public Criteria andROLENAMEIsNotNull() {
            addCriterion("ROLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andROLENAMEEqualTo(String value) {
            addCriterion("ROLENAME =", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMENotEqualTo(String value) {
            addCriterion("ROLENAME <>", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMEGreaterThan(String value) {
            addCriterion("ROLENAME >", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMEGreaterThanOrEqualTo(String value) {
            addCriterion("ROLENAME >=", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMELessThan(String value) {
            addCriterion("ROLENAME <", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMELessThanOrEqualTo(String value) {
            addCriterion("ROLENAME <=", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMELike(String value) {
            addCriterion("ROLENAME like", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMENotLike(String value) {
            addCriterion("ROLENAME not like", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMEIn(List<String> values) {
            addCriterion("ROLENAME in", values, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMENotIn(List<String> values) {
            addCriterion("ROLENAME not in", values, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMEBetween(String value1, String value2) {
            addCriterion("ROLENAME between", value1, value2, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMENotBetween(String value1, String value2) {
            addCriterion("ROLENAME not between", value1, value2, "ROLENAME");
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