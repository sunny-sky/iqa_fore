package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class ConfigureHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigureHistoryExample() {
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

        public Criteria andCONFIGUREHISTORYIDIsNull() {
            addCriterion("CONFIGUREHISTORYID is null");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREHISTORYIDIsNotNull() {
            addCriterion("CONFIGUREHISTORYID is not null");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREHISTORYIDEqualTo(String value) {
            addCriterion("CONFIGUREHISTORYID =", value, "CONFIGUREHISTORYID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREHISTORYIDNotEqualTo(String value) {
            addCriterion("CONFIGUREHISTORYID <>", value, "CONFIGUREHISTORYID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREHISTORYIDGreaterThan(String value) {
            addCriterion("CONFIGUREHISTORYID >", value, "CONFIGUREHISTORYID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREHISTORYIDGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGUREHISTORYID >=", value, "CONFIGUREHISTORYID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREHISTORYIDLessThan(String value) {
            addCriterion("CONFIGUREHISTORYID <", value, "CONFIGUREHISTORYID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREHISTORYIDLessThanOrEqualTo(String value) {
            addCriterion("CONFIGUREHISTORYID <=", value, "CONFIGUREHISTORYID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREHISTORYIDLike(String value) {
            addCriterion("CONFIGUREHISTORYID like", value, "CONFIGUREHISTORYID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREHISTORYIDNotLike(String value) {
            addCriterion("CONFIGUREHISTORYID not like", value, "CONFIGUREHISTORYID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREHISTORYIDIn(List<String> values) {
            addCriterion("CONFIGUREHISTORYID in", values, "CONFIGUREHISTORYID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREHISTORYIDNotIn(List<String> values) {
            addCriterion("CONFIGUREHISTORYID not in", values, "CONFIGUREHISTORYID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREHISTORYIDBetween(String value1, String value2) {
            addCriterion("CONFIGUREHISTORYID between", value1, value2, "CONFIGUREHISTORYID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREHISTORYIDNotBetween(String value1, String value2) {
            addCriterion("CONFIGUREHISTORYID not between", value1, value2, "CONFIGUREHISTORYID");
            return (Criteria) this;
        }

        public Criteria andUPDATETIMEIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUPDATETIMEIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUPDATETIMEEqualTo(String value) {
            addCriterion("UPDATETIME =", value, "UPDATETIME");
            return (Criteria) this;
        }

        public Criteria andUPDATETIMENotEqualTo(String value) {
            addCriterion("UPDATETIME <>", value, "UPDATETIME");
            return (Criteria) this;
        }

        public Criteria andUPDATETIMEGreaterThan(String value) {
            addCriterion("UPDATETIME >", value, "UPDATETIME");
            return (Criteria) this;
        }

        public Criteria andUPDATETIMEGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATETIME >=", value, "UPDATETIME");
            return (Criteria) this;
        }

        public Criteria andUPDATETIMELessThan(String value) {
            addCriterion("UPDATETIME <", value, "UPDATETIME");
            return (Criteria) this;
        }

        public Criteria andUPDATETIMELessThanOrEqualTo(String value) {
            addCriterion("UPDATETIME <=", value, "UPDATETIME");
            return (Criteria) this;
        }

        public Criteria andUPDATETIMELike(String value) {
            addCriterion("UPDATETIME like", value, "UPDATETIME");
            return (Criteria) this;
        }

        public Criteria andUPDATETIMENotLike(String value) {
            addCriterion("UPDATETIME not like", value, "UPDATETIME");
            return (Criteria) this;
        }

        public Criteria andUPDATETIMEIn(List<String> values) {
            addCriterion("UPDATETIME in", values, "UPDATETIME");
            return (Criteria) this;
        }

        public Criteria andUPDATETIMENotIn(List<String> values) {
            addCriterion("UPDATETIME not in", values, "UPDATETIME");
            return (Criteria) this;
        }

        public Criteria andUPDATETIMEBetween(String value1, String value2) {
            addCriterion("UPDATETIME between", value1, value2, "UPDATETIME");
            return (Criteria) this;
        }

        public Criteria andUPDATETIMENotBetween(String value1, String value2) {
            addCriterion("UPDATETIME not between", value1, value2, "UPDATETIME");
            return (Criteria) this;
        }

        public Criteria andVERSIONIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVERSIONIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVERSIONEqualTo(String value) {
            addCriterion("VERSION =", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONGreaterThan(String value) {
            addCriterion("VERSION >", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONLessThan(String value) {
            addCriterion("VERSION <", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONLike(String value) {
            addCriterion("VERSION like", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONNotLike(String value) {
            addCriterion("VERSION not like", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONIn(List<String> values) {
            addCriterion("VERSION in", values, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "VERSION");
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

        public Criteria andURLIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andURLIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andURLEqualTo(String value) {
            addCriterion("URL =", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotEqualTo(String value) {
            addCriterion("URL <>", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLGreaterThan(String value) {
            addCriterion("URL >", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLLessThan(String value) {
            addCriterion("URL <", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLLike(String value) {
            addCriterion("URL like", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotLike(String value) {
            addCriterion("URL not like", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLIn(List<String> values) {
            addCriterion("URL in", values, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotIn(List<String> values) {
            addCriterion("URL not in", values, "URL");
            return (Criteria) this;
        }

        public Criteria andURLBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "URL");
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