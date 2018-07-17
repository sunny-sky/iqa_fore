package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class BasicConfigureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasicConfigureExample() {
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

        public Criteria andBASICCONFIGUREIsNull() {
            addCriterion("BASICCONFIGURE is null");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREIsNotNull() {
            addCriterion("BASICCONFIGURE is not null");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREEqualTo(String value) {
            addCriterion("BASICCONFIGURE =", value, "BASICCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGURENotEqualTo(String value) {
            addCriterion("BASICCONFIGURE <>", value, "BASICCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREGreaterThan(String value) {
            addCriterion("BASICCONFIGURE >", value, "BASICCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREGreaterThanOrEqualTo(String value) {
            addCriterion("BASICCONFIGURE >=", value, "BASICCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGURELessThan(String value) {
            addCriterion("BASICCONFIGURE <", value, "BASICCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGURELessThanOrEqualTo(String value) {
            addCriterion("BASICCONFIGURE <=", value, "BASICCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGURELike(String value) {
            addCriterion("BASICCONFIGURE like", value, "BASICCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGURENotLike(String value) {
            addCriterion("BASICCONFIGURE not like", value, "BASICCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREIn(List<String> values) {
            addCriterion("BASICCONFIGURE in", values, "BASICCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGURENotIn(List<String> values) {
            addCriterion("BASICCONFIGURE not in", values, "BASICCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREBetween(String value1, String value2) {
            addCriterion("BASICCONFIGURE between", value1, value2, "BASICCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGURENotBetween(String value1, String value2) {
            addCriterion("BASICCONFIGURE not between", value1, value2, "BASICCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDIsNull() {
            addCriterion("CONFIGUREID is null");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDIsNotNull() {
            addCriterion("CONFIGUREID is not null");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDEqualTo(String value) {
            addCriterion("CONFIGUREID =", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDNotEqualTo(String value) {
            addCriterion("CONFIGUREID <>", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDGreaterThan(String value) {
            addCriterion("CONFIGUREID >", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGUREID >=", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDLessThan(String value) {
            addCriterion("CONFIGUREID <", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDLessThanOrEqualTo(String value) {
            addCriterion("CONFIGUREID <=", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDLike(String value) {
            addCriterion("CONFIGUREID like", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDNotLike(String value) {
            addCriterion("CONFIGUREID not like", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDIn(List<String> values) {
            addCriterion("CONFIGUREID in", values, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDNotIn(List<String> values) {
            addCriterion("CONFIGUREID not in", values, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDBetween(String value1, String value2) {
            addCriterion("CONFIGUREID between", value1, value2, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDNotBetween(String value1, String value2) {
            addCriterion("CONFIGUREID not between", value1, value2, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDIsNull() {
            addCriterion("DEPARTMENTID is null");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDIsNotNull() {
            addCriterion("DEPARTMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDEqualTo(String value) {
            addCriterion("DEPARTMENTID =", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDNotEqualTo(String value) {
            addCriterion("DEPARTMENTID <>", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDGreaterThan(String value) {
            addCriterion("DEPARTMENTID >", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTID >=", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDLessThan(String value) {
            addCriterion("DEPARTMENTID <", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTID <=", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDLike(String value) {
            addCriterion("DEPARTMENTID like", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDNotLike(String value) {
            addCriterion("DEPARTMENTID not like", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDIn(List<String> values) {
            addCriterion("DEPARTMENTID in", values, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDNotIn(List<String> values) {
            addCriterion("DEPARTMENTID not in", values, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDBetween(String value1, String value2) {
            addCriterion("DEPARTMENTID between", value1, value2, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENTID not between", value1, value2, "DEPARTMENTID");
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