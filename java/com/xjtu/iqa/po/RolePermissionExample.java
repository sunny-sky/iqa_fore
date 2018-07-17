package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class RolePermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RolePermissionExample() {
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

        public Criteria andROLEPERMISSIONIDIsNull() {
            addCriterion("ROLEPERMISSIONID is null");
            return (Criteria) this;
        }

        public Criteria andROLEPERMISSIONIDIsNotNull() {
            addCriterion("ROLEPERMISSIONID is not null");
            return (Criteria) this;
        }

        public Criteria andROLEPERMISSIONIDEqualTo(String value) {
            addCriterion("ROLEPERMISSIONID =", value, "ROLEPERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andROLEPERMISSIONIDNotEqualTo(String value) {
            addCriterion("ROLEPERMISSIONID <>", value, "ROLEPERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andROLEPERMISSIONIDGreaterThan(String value) {
            addCriterion("ROLEPERMISSIONID >", value, "ROLEPERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andROLEPERMISSIONIDGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEPERMISSIONID >=", value, "ROLEPERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andROLEPERMISSIONIDLessThan(String value) {
            addCriterion("ROLEPERMISSIONID <", value, "ROLEPERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andROLEPERMISSIONIDLessThanOrEqualTo(String value) {
            addCriterion("ROLEPERMISSIONID <=", value, "ROLEPERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andROLEPERMISSIONIDLike(String value) {
            addCriterion("ROLEPERMISSIONID like", value, "ROLEPERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andROLEPERMISSIONIDNotLike(String value) {
            addCriterion("ROLEPERMISSIONID not like", value, "ROLEPERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andROLEPERMISSIONIDIn(List<String> values) {
            addCriterion("ROLEPERMISSIONID in", values, "ROLEPERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andROLEPERMISSIONIDNotIn(List<String> values) {
            addCriterion("ROLEPERMISSIONID not in", values, "ROLEPERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andROLEPERMISSIONIDBetween(String value1, String value2) {
            addCriterion("ROLEPERMISSIONID between", value1, value2, "ROLEPERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andROLEPERMISSIONIDNotBetween(String value1, String value2) {
            addCriterion("ROLEPERMISSIONID not between", value1, value2, "ROLEPERMISSIONID");
            return (Criteria) this;
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

        public Criteria andPERMISSIONIDIsNull() {
            addCriterion("PERMISSIONID is null");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDIsNotNull() {
            addCriterion("PERMISSIONID is not null");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDEqualTo(String value) {
            addCriterion("PERMISSIONID =", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDNotEqualTo(String value) {
            addCriterion("PERMISSIONID <>", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDGreaterThan(String value) {
            addCriterion("PERMISSIONID >", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSIONID >=", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDLessThan(String value) {
            addCriterion("PERMISSIONID <", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDLessThanOrEqualTo(String value) {
            addCriterion("PERMISSIONID <=", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDLike(String value) {
            addCriterion("PERMISSIONID like", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDNotLike(String value) {
            addCriterion("PERMISSIONID not like", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDIn(List<String> values) {
            addCriterion("PERMISSIONID in", values, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDNotIn(List<String> values) {
            addCriterion("PERMISSIONID not in", values, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDBetween(String value1, String value2) {
            addCriterion("PERMISSIONID between", value1, value2, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDNotBetween(String value1, String value2) {
            addCriterion("PERMISSIONID not between", value1, value2, "PERMISSIONID");
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