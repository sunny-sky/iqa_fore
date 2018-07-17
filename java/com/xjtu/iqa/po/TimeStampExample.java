package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class TimeStampExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimeStampExample() {
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

        public Criteria andTIMEIDIsNull() {
            addCriterion("TIMEID is null");
            return (Criteria) this;
        }

        public Criteria andTIMEIDIsNotNull() {
            addCriterion("TIMEID is not null");
            return (Criteria) this;
        }

        public Criteria andTIMEIDEqualTo(String value) {
            addCriterion("TIMEID =", value, "TIMEID");
            return (Criteria) this;
        }

        public Criteria andTIMEIDNotEqualTo(String value) {
            addCriterion("TIMEID <>", value, "TIMEID");
            return (Criteria) this;
        }

        public Criteria andTIMEIDGreaterThan(String value) {
            addCriterion("TIMEID >", value, "TIMEID");
            return (Criteria) this;
        }

        public Criteria andTIMEIDGreaterThanOrEqualTo(String value) {
            addCriterion("TIMEID >=", value, "TIMEID");
            return (Criteria) this;
        }

        public Criteria andTIMEIDLessThan(String value) {
            addCriterion("TIMEID <", value, "TIMEID");
            return (Criteria) this;
        }

        public Criteria andTIMEIDLessThanOrEqualTo(String value) {
            addCriterion("TIMEID <=", value, "TIMEID");
            return (Criteria) this;
        }

        public Criteria andTIMEIDLike(String value) {
            addCriterion("TIMEID like", value, "TIMEID");
            return (Criteria) this;
        }

        public Criteria andTIMEIDNotLike(String value) {
            addCriterion("TIMEID not like", value, "TIMEID");
            return (Criteria) this;
        }

        public Criteria andTIMEIDIn(List<String> values) {
            addCriterion("TIMEID in", values, "TIMEID");
            return (Criteria) this;
        }

        public Criteria andTIMEIDNotIn(List<String> values) {
            addCriterion("TIMEID not in", values, "TIMEID");
            return (Criteria) this;
        }

        public Criteria andTIMEIDBetween(String value1, String value2) {
            addCriterion("TIMEID between", value1, value2, "TIMEID");
            return (Criteria) this;
        }

        public Criteria andTIMEIDNotBetween(String value1, String value2) {
            addCriterion("TIMEID not between", value1, value2, "TIMEID");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNAMEEqualTo(String value) {
            addCriterion("NAME =", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotEqualTo(String value) {
            addCriterion("NAME <>", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThan(String value) {
            addCriterion("NAME >", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThan(String value) {
            addCriterion("NAME <", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELike(String value) {
            addCriterion("NAME like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotLike(String value) {
            addCriterion("NAME not like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEIn(List<String> values) {
            addCriterion("NAME in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotIn(List<String> values) {
            addCriterion("NAME not in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "NAME");
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

        public Criteria andBEGINTIMEIsNull() {
            addCriterion("BEGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andBEGINTIMEIsNotNull() {
            addCriterion("BEGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBEGINTIMEEqualTo(String value) {
            addCriterion("BEGINTIME =", value, "BEGINTIME");
            return (Criteria) this;
        }

        public Criteria andBEGINTIMENotEqualTo(String value) {
            addCriterion("BEGINTIME <>", value, "BEGINTIME");
            return (Criteria) this;
        }

        public Criteria andBEGINTIMEGreaterThan(String value) {
            addCriterion("BEGINTIME >", value, "BEGINTIME");
            return (Criteria) this;
        }

        public Criteria andBEGINTIMEGreaterThanOrEqualTo(String value) {
            addCriterion("BEGINTIME >=", value, "BEGINTIME");
            return (Criteria) this;
        }

        public Criteria andBEGINTIMELessThan(String value) {
            addCriterion("BEGINTIME <", value, "BEGINTIME");
            return (Criteria) this;
        }

        public Criteria andBEGINTIMELessThanOrEqualTo(String value) {
            addCriterion("BEGINTIME <=", value, "BEGINTIME");
            return (Criteria) this;
        }

        public Criteria andBEGINTIMELike(String value) {
            addCriterion("BEGINTIME like", value, "BEGINTIME");
            return (Criteria) this;
        }

        public Criteria andBEGINTIMENotLike(String value) {
            addCriterion("BEGINTIME not like", value, "BEGINTIME");
            return (Criteria) this;
        }

        public Criteria andBEGINTIMEIn(List<String> values) {
            addCriterion("BEGINTIME in", values, "BEGINTIME");
            return (Criteria) this;
        }

        public Criteria andBEGINTIMENotIn(List<String> values) {
            addCriterion("BEGINTIME not in", values, "BEGINTIME");
            return (Criteria) this;
        }

        public Criteria andBEGINTIMEBetween(String value1, String value2) {
            addCriterion("BEGINTIME between", value1, value2, "BEGINTIME");
            return (Criteria) this;
        }

        public Criteria andBEGINTIMENotBetween(String value1, String value2) {
            addCriterion("BEGINTIME not between", value1, value2, "BEGINTIME");
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