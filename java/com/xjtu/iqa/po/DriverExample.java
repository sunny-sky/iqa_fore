package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class DriverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriverExample() {
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

        public Criteria andOSIsNull() {
            addCriterion("OS is null");
            return (Criteria) this;
        }

        public Criteria andOSIsNotNull() {
            addCriterion("OS is not null");
            return (Criteria) this;
        }

        public Criteria andOSEqualTo(String value) {
            addCriterion("OS =", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSNotEqualTo(String value) {
            addCriterion("OS <>", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSGreaterThan(String value) {
            addCriterion("OS >", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSGreaterThanOrEqualTo(String value) {
            addCriterion("OS >=", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSLessThan(String value) {
            addCriterion("OS <", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSLessThanOrEqualTo(String value) {
            addCriterion("OS <=", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSLike(String value) {
            addCriterion("OS like", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSNotLike(String value) {
            addCriterion("OS not like", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSIn(List<String> values) {
            addCriterion("OS in", values, "OS");
            return (Criteria) this;
        }

        public Criteria andOSNotIn(List<String> values) {
            addCriterion("OS not in", values, "OS");
            return (Criteria) this;
        }

        public Criteria andOSBetween(String value1, String value2) {
            addCriterion("OS between", value1, value2, "OS");
            return (Criteria) this;
        }

        public Criteria andOSNotBetween(String value1, String value2) {
            addCriterion("OS not between", value1, value2, "OS");
            return (Criteria) this;
        }

        public Criteria andDRIVERTYPEIsNull() {
            addCriterion("DRIVERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDRIVERTYPEIsNotNull() {
            addCriterion("DRIVERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDRIVERTYPEEqualTo(String value) {
            addCriterion("DRIVERTYPE =", value, "DRIVERTYPE");
            return (Criteria) this;
        }

        public Criteria andDRIVERTYPENotEqualTo(String value) {
            addCriterion("DRIVERTYPE <>", value, "DRIVERTYPE");
            return (Criteria) this;
        }

        public Criteria andDRIVERTYPEGreaterThan(String value) {
            addCriterion("DRIVERTYPE >", value, "DRIVERTYPE");
            return (Criteria) this;
        }

        public Criteria andDRIVERTYPEGreaterThanOrEqualTo(String value) {
            addCriterion("DRIVERTYPE >=", value, "DRIVERTYPE");
            return (Criteria) this;
        }

        public Criteria andDRIVERTYPELessThan(String value) {
            addCriterion("DRIVERTYPE <", value, "DRIVERTYPE");
            return (Criteria) this;
        }

        public Criteria andDRIVERTYPELessThanOrEqualTo(String value) {
            addCriterion("DRIVERTYPE <=", value, "DRIVERTYPE");
            return (Criteria) this;
        }

        public Criteria andDRIVERTYPELike(String value) {
            addCriterion("DRIVERTYPE like", value, "DRIVERTYPE");
            return (Criteria) this;
        }

        public Criteria andDRIVERTYPENotLike(String value) {
            addCriterion("DRIVERTYPE not like", value, "DRIVERTYPE");
            return (Criteria) this;
        }

        public Criteria andDRIVERTYPEIn(List<String> values) {
            addCriterion("DRIVERTYPE in", values, "DRIVERTYPE");
            return (Criteria) this;
        }

        public Criteria andDRIVERTYPENotIn(List<String> values) {
            addCriterion("DRIVERTYPE not in", values, "DRIVERTYPE");
            return (Criteria) this;
        }

        public Criteria andDRIVERTYPEBetween(String value1, String value2) {
            addCriterion("DRIVERTYPE between", value1, value2, "DRIVERTYPE");
            return (Criteria) this;
        }

        public Criteria andDRIVERTYPENotBetween(String value1, String value2) {
            addCriterion("DRIVERTYPE not between", value1, value2, "DRIVERTYPE");
            return (Criteria) this;
        }

        public Criteria andFITNESSIsNull() {
            addCriterion("FITNESS is null");
            return (Criteria) this;
        }

        public Criteria andFITNESSIsNotNull() {
            addCriterion("FITNESS is not null");
            return (Criteria) this;
        }

        public Criteria andFITNESSEqualTo(String value) {
            addCriterion("FITNESS =", value, "FITNESS");
            return (Criteria) this;
        }

        public Criteria andFITNESSNotEqualTo(String value) {
            addCriterion("FITNESS <>", value, "FITNESS");
            return (Criteria) this;
        }

        public Criteria andFITNESSGreaterThan(String value) {
            addCriterion("FITNESS >", value, "FITNESS");
            return (Criteria) this;
        }

        public Criteria andFITNESSGreaterThanOrEqualTo(String value) {
            addCriterion("FITNESS >=", value, "FITNESS");
            return (Criteria) this;
        }

        public Criteria andFITNESSLessThan(String value) {
            addCriterion("FITNESS <", value, "FITNESS");
            return (Criteria) this;
        }

        public Criteria andFITNESSLessThanOrEqualTo(String value) {
            addCriterion("FITNESS <=", value, "FITNESS");
            return (Criteria) this;
        }

        public Criteria andFITNESSLike(String value) {
            addCriterion("FITNESS like", value, "FITNESS");
            return (Criteria) this;
        }

        public Criteria andFITNESSNotLike(String value) {
            addCriterion("FITNESS not like", value, "FITNESS");
            return (Criteria) this;
        }

        public Criteria andFITNESSIn(List<String> values) {
            addCriterion("FITNESS in", values, "FITNESS");
            return (Criteria) this;
        }

        public Criteria andFITNESSNotIn(List<String> values) {
            addCriterion("FITNESS not in", values, "FITNESS");
            return (Criteria) this;
        }

        public Criteria andFITNESSBetween(String value1, String value2) {
            addCriterion("FITNESS between", value1, value2, "FITNESS");
            return (Criteria) this;
        }

        public Criteria andFITNESSNotBetween(String value1, String value2) {
            addCriterion("FITNESS not between", value1, value2, "FITNESS");
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