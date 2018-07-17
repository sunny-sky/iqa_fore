package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class PatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatchExample() {
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

        public Criteria andPATCHNUMBERIsNull() {
            addCriterion("PATCHNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPATCHNUMBERIsNotNull() {
            addCriterion("PATCHNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPATCHNUMBEREqualTo(String value) {
            addCriterion("PATCHNUMBER =", value, "PATCHNUMBER");
            return (Criteria) this;
        }

        public Criteria andPATCHNUMBERNotEqualTo(String value) {
            addCriterion("PATCHNUMBER <>", value, "PATCHNUMBER");
            return (Criteria) this;
        }

        public Criteria andPATCHNUMBERGreaterThan(String value) {
            addCriterion("PATCHNUMBER >", value, "PATCHNUMBER");
            return (Criteria) this;
        }

        public Criteria andPATCHNUMBERGreaterThanOrEqualTo(String value) {
            addCriterion("PATCHNUMBER >=", value, "PATCHNUMBER");
            return (Criteria) this;
        }

        public Criteria andPATCHNUMBERLessThan(String value) {
            addCriterion("PATCHNUMBER <", value, "PATCHNUMBER");
            return (Criteria) this;
        }

        public Criteria andPATCHNUMBERLessThanOrEqualTo(String value) {
            addCriterion("PATCHNUMBER <=", value, "PATCHNUMBER");
            return (Criteria) this;
        }

        public Criteria andPATCHNUMBERLike(String value) {
            addCriterion("PATCHNUMBER like", value, "PATCHNUMBER");
            return (Criteria) this;
        }

        public Criteria andPATCHNUMBERNotLike(String value) {
            addCriterion("PATCHNUMBER not like", value, "PATCHNUMBER");
            return (Criteria) this;
        }

        public Criteria andPATCHNUMBERIn(List<String> values) {
            addCriterion("PATCHNUMBER in", values, "PATCHNUMBER");
            return (Criteria) this;
        }

        public Criteria andPATCHNUMBERNotIn(List<String> values) {
            addCriterion("PATCHNUMBER not in", values, "PATCHNUMBER");
            return (Criteria) this;
        }

        public Criteria andPATCHNUMBERBetween(String value1, String value2) {
            addCriterion("PATCHNUMBER between", value1, value2, "PATCHNUMBER");
            return (Criteria) this;
        }

        public Criteria andPATCHNUMBERNotBetween(String value1, String value2) {
            addCriterion("PATCHNUMBER not between", value1, value2, "PATCHNUMBER");
            return (Criteria) this;
        }

        public Criteria andLANGUAGEIsNull() {
            addCriterion("LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andLANGUAGEIsNotNull() {
            addCriterion("LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andLANGUAGEEqualTo(String value) {
            addCriterion("LANGUAGE =", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGENotEqualTo(String value) {
            addCriterion("LANGUAGE <>", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGEGreaterThan(String value) {
            addCriterion("LANGUAGE >", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGEGreaterThanOrEqualTo(String value) {
            addCriterion("LANGUAGE >=", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGELessThan(String value) {
            addCriterion("LANGUAGE <", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGELessThanOrEqualTo(String value) {
            addCriterion("LANGUAGE <=", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGELike(String value) {
            addCriterion("LANGUAGE like", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGENotLike(String value) {
            addCriterion("LANGUAGE not like", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGEIn(List<String> values) {
            addCriterion("LANGUAGE in", values, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGENotIn(List<String> values) {
            addCriterion("LANGUAGE not in", values, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGEBetween(String value1, String value2) {
            addCriterion("LANGUAGE between", value1, value2, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGENotBetween(String value1, String value2) {
            addCriterion("LANGUAGE not between", value1, value2, "LANGUAGE");
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