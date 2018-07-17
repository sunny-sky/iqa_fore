package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class GeneralUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GeneralUserExample() {
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

        public Criteria andEMPLOYERIsNull() {
            addCriterion("EMPLOYER is null");
            return (Criteria) this;
        }

        public Criteria andEMPLOYERIsNotNull() {
            addCriterion("EMPLOYER is not null");
            return (Criteria) this;
        }

        public Criteria andEMPLOYEREqualTo(String value) {
            addCriterion("EMPLOYER =", value, "EMPLOYER");
            return (Criteria) this;
        }

        public Criteria andEMPLOYERNotEqualTo(String value) {
            addCriterion("EMPLOYER <>", value, "EMPLOYER");
            return (Criteria) this;
        }

        public Criteria andEMPLOYERGreaterThan(String value) {
            addCriterion("EMPLOYER >", value, "EMPLOYER");
            return (Criteria) this;
        }

        public Criteria andEMPLOYERGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYER >=", value, "EMPLOYER");
            return (Criteria) this;
        }

        public Criteria andEMPLOYERLessThan(String value) {
            addCriterion("EMPLOYER <", value, "EMPLOYER");
            return (Criteria) this;
        }

        public Criteria andEMPLOYERLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYER <=", value, "EMPLOYER");
            return (Criteria) this;
        }

        public Criteria andEMPLOYERLike(String value) {
            addCriterion("EMPLOYER like", value, "EMPLOYER");
            return (Criteria) this;
        }

        public Criteria andEMPLOYERNotLike(String value) {
            addCriterion("EMPLOYER not like", value, "EMPLOYER");
            return (Criteria) this;
        }

        public Criteria andEMPLOYERIn(List<String> values) {
            addCriterion("EMPLOYER in", values, "EMPLOYER");
            return (Criteria) this;
        }

        public Criteria andEMPLOYERNotIn(List<String> values) {
            addCriterion("EMPLOYER not in", values, "EMPLOYER");
            return (Criteria) this;
        }

        public Criteria andEMPLOYERBetween(String value1, String value2) {
            addCriterion("EMPLOYER between", value1, value2, "EMPLOYER");
            return (Criteria) this;
        }

        public Criteria andEMPLOYERNotBetween(String value1, String value2) {
            addCriterion("EMPLOYER not between", value1, value2, "EMPLOYER");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTLike(String value) {
            addCriterion("DEPARTMENT like", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andREALNAMEIsNull() {
            addCriterion("REALNAME is null");
            return (Criteria) this;
        }

        public Criteria andREALNAMEIsNotNull() {
            addCriterion("REALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andREALNAMEEqualTo(String value) {
            addCriterion("REALNAME =", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMENotEqualTo(String value) {
            addCriterion("REALNAME <>", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMEGreaterThan(String value) {
            addCriterion("REALNAME >", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("REALNAME >=", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMELessThan(String value) {
            addCriterion("REALNAME <", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMELessThanOrEqualTo(String value) {
            addCriterion("REALNAME <=", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMELike(String value) {
            addCriterion("REALNAME like", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMENotLike(String value) {
            addCriterion("REALNAME not like", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMEIn(List<String> values) {
            addCriterion("REALNAME in", values, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMENotIn(List<String> values) {
            addCriterion("REALNAME not in", values, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMEBetween(String value1, String value2) {
            addCriterion("REALNAME between", value1, value2, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMENotBetween(String value1, String value2) {
            addCriterion("REALNAME not between", value1, value2, "REALNAME");
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