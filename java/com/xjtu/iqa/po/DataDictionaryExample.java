package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class DataDictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataDictionaryExample() {
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

        public Criteria andDATADICTIONARYIDIsNull() {
            addCriterion("DATADICTIONARYID is null");
            return (Criteria) this;
        }

        public Criteria andDATADICTIONARYIDIsNotNull() {
            addCriterion("DATADICTIONARYID is not null");
            return (Criteria) this;
        }

        public Criteria andDATADICTIONARYIDEqualTo(String value) {
            addCriterion("DATADICTIONARYID =", value, "DATADICTIONARYID");
            return (Criteria) this;
        }

        public Criteria andDATADICTIONARYIDNotEqualTo(String value) {
            addCriterion("DATADICTIONARYID <>", value, "DATADICTIONARYID");
            return (Criteria) this;
        }

        public Criteria andDATADICTIONARYIDGreaterThan(String value) {
            addCriterion("DATADICTIONARYID >", value, "DATADICTIONARYID");
            return (Criteria) this;
        }

        public Criteria andDATADICTIONARYIDGreaterThanOrEqualTo(String value) {
            addCriterion("DATADICTIONARYID >=", value, "DATADICTIONARYID");
            return (Criteria) this;
        }

        public Criteria andDATADICTIONARYIDLessThan(String value) {
            addCriterion("DATADICTIONARYID <", value, "DATADICTIONARYID");
            return (Criteria) this;
        }

        public Criteria andDATADICTIONARYIDLessThanOrEqualTo(String value) {
            addCriterion("DATADICTIONARYID <=", value, "DATADICTIONARYID");
            return (Criteria) this;
        }

        public Criteria andDATADICTIONARYIDLike(String value) {
            addCriterion("DATADICTIONARYID like", value, "DATADICTIONARYID");
            return (Criteria) this;
        }

        public Criteria andDATADICTIONARYIDNotLike(String value) {
            addCriterion("DATADICTIONARYID not like", value, "DATADICTIONARYID");
            return (Criteria) this;
        }

        public Criteria andDATADICTIONARYIDIn(List<String> values) {
            addCriterion("DATADICTIONARYID in", values, "DATADICTIONARYID");
            return (Criteria) this;
        }

        public Criteria andDATADICTIONARYIDNotIn(List<String> values) {
            addCriterion("DATADICTIONARYID not in", values, "DATADICTIONARYID");
            return (Criteria) this;
        }

        public Criteria andDATADICTIONARYIDBetween(String value1, String value2) {
            addCriterion("DATADICTIONARYID between", value1, value2, "DATADICTIONARYID");
            return (Criteria) this;
        }

        public Criteria andDATADICTIONARYIDNotBetween(String value1, String value2) {
            addCriterion("DATADICTIONARYID not between", value1, value2, "DATADICTIONARYID");
            return (Criteria) this;
        }

        public Criteria andDATANAMEIsNull() {
            addCriterion("DATANAME is null");
            return (Criteria) this;
        }

        public Criteria andDATANAMEIsNotNull() {
            addCriterion("DATANAME is not null");
            return (Criteria) this;
        }

        public Criteria andDATANAMEEqualTo(String value) {
            addCriterion("DATANAME =", value, "DATANAME");
            return (Criteria) this;
        }

        public Criteria andDATANAMENotEqualTo(String value) {
            addCriterion("DATANAME <>", value, "DATANAME");
            return (Criteria) this;
        }

        public Criteria andDATANAMEGreaterThan(String value) {
            addCriterion("DATANAME >", value, "DATANAME");
            return (Criteria) this;
        }

        public Criteria andDATANAMEGreaterThanOrEqualTo(String value) {
            addCriterion("DATANAME >=", value, "DATANAME");
            return (Criteria) this;
        }

        public Criteria andDATANAMELessThan(String value) {
            addCriterion("DATANAME <", value, "DATANAME");
            return (Criteria) this;
        }

        public Criteria andDATANAMELessThanOrEqualTo(String value) {
            addCriterion("DATANAME <=", value, "DATANAME");
            return (Criteria) this;
        }

        public Criteria andDATANAMELike(String value) {
            addCriterion("DATANAME like", value, "DATANAME");
            return (Criteria) this;
        }

        public Criteria andDATANAMENotLike(String value) {
            addCriterion("DATANAME not like", value, "DATANAME");
            return (Criteria) this;
        }

        public Criteria andDATANAMEIn(List<String> values) {
            addCriterion("DATANAME in", values, "DATANAME");
            return (Criteria) this;
        }

        public Criteria andDATANAMENotIn(List<String> values) {
            addCriterion("DATANAME not in", values, "DATANAME");
            return (Criteria) this;
        }

        public Criteria andDATANAMEBetween(String value1, String value2) {
            addCriterion("DATANAME between", value1, value2, "DATANAME");
            return (Criteria) this;
        }

        public Criteria andDATANAMENotBetween(String value1, String value2) {
            addCriterion("DATANAME not between", value1, value2, "DATANAME");
            return (Criteria) this;
        }

        public Criteria andDATAVALUEIsNull() {
            addCriterion("DATAVALUE is null");
            return (Criteria) this;
        }

        public Criteria andDATAVALUEIsNotNull() {
            addCriterion("DATAVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDATAVALUEEqualTo(String value) {
            addCriterion("DATAVALUE =", value, "DATAVALUE");
            return (Criteria) this;
        }

        public Criteria andDATAVALUENotEqualTo(String value) {
            addCriterion("DATAVALUE <>", value, "DATAVALUE");
            return (Criteria) this;
        }

        public Criteria andDATAVALUEGreaterThan(String value) {
            addCriterion("DATAVALUE >", value, "DATAVALUE");
            return (Criteria) this;
        }

        public Criteria andDATAVALUEGreaterThanOrEqualTo(String value) {
            addCriterion("DATAVALUE >=", value, "DATAVALUE");
            return (Criteria) this;
        }

        public Criteria andDATAVALUELessThan(String value) {
            addCriterion("DATAVALUE <", value, "DATAVALUE");
            return (Criteria) this;
        }

        public Criteria andDATAVALUELessThanOrEqualTo(String value) {
            addCriterion("DATAVALUE <=", value, "DATAVALUE");
            return (Criteria) this;
        }

        public Criteria andDATAVALUELike(String value) {
            addCriterion("DATAVALUE like", value, "DATAVALUE");
            return (Criteria) this;
        }

        public Criteria andDATAVALUENotLike(String value) {
            addCriterion("DATAVALUE not like", value, "DATAVALUE");
            return (Criteria) this;
        }

        public Criteria andDATAVALUEIn(List<String> values) {
            addCriterion("DATAVALUE in", values, "DATAVALUE");
            return (Criteria) this;
        }

        public Criteria andDATAVALUENotIn(List<String> values) {
            addCriterion("DATAVALUE not in", values, "DATAVALUE");
            return (Criteria) this;
        }

        public Criteria andDATAVALUEBetween(String value1, String value2) {
            addCriterion("DATAVALUE between", value1, value2, "DATAVALUE");
            return (Criteria) this;
        }

        public Criteria andDATAVALUENotBetween(String value1, String value2) {
            addCriterion("DATAVALUE not between", value1, value2, "DATAVALUE");
            return (Criteria) this;
        }

        public Criteria andREMARKSIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andREMARKSIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andREMARKSEqualTo(String value) {
            addCriterion("REMARKS =", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSGreaterThan(String value) {
            addCriterion("REMARKS >", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSLessThan(String value) {
            addCriterion("REMARKS <", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSLike(String value) {
            addCriterion("REMARKS like", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSNotLike(String value) {
            addCriterion("REMARKS not like", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSIn(List<String> values) {
            addCriterion("REMARKS in", values, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andDATATYPEIsNull() {
            addCriterion("DATATYPE is null");
            return (Criteria) this;
        }

        public Criteria andDATATYPEIsNotNull() {
            addCriterion("DATATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDATATYPEEqualTo(Integer value) {
            addCriterion("DATATYPE =", value, "DATATYPE");
            return (Criteria) this;
        }

        public Criteria andDATATYPENotEqualTo(Integer value) {
            addCriterion("DATATYPE <>", value, "DATATYPE");
            return (Criteria) this;
        }

        public Criteria andDATATYPEGreaterThan(Integer value) {
            addCriterion("DATATYPE >", value, "DATATYPE");
            return (Criteria) this;
        }

        public Criteria andDATATYPEGreaterThanOrEqualTo(Integer value) {
            addCriterion("DATATYPE >=", value, "DATATYPE");
            return (Criteria) this;
        }

        public Criteria andDATATYPELessThan(Integer value) {
            addCriterion("DATATYPE <", value, "DATATYPE");
            return (Criteria) this;
        }

        public Criteria andDATATYPELessThanOrEqualTo(Integer value) {
            addCriterion("DATATYPE <=", value, "DATATYPE");
            return (Criteria) this;
        }

        public Criteria andDATATYPEIn(List<Integer> values) {
            addCriterion("DATATYPE in", values, "DATATYPE");
            return (Criteria) this;
        }

        public Criteria andDATATYPENotIn(List<Integer> values) {
            addCriterion("DATATYPE not in", values, "DATATYPE");
            return (Criteria) this;
        }

        public Criteria andDATATYPEBetween(Integer value1, Integer value2) {
            addCriterion("DATATYPE between", value1, value2, "DATATYPE");
            return (Criteria) this;
        }

        public Criteria andDATATYPENotBetween(Integer value1, Integer value2) {
            addCriterion("DATATYPE not between", value1, value2, "DATATYPE");
            return (Criteria) this;
        }

        public Criteria andDATARANGEIsNull() {
            addCriterion("DATARANGE is null");
            return (Criteria) this;
        }

        public Criteria andDATARANGEIsNotNull() {
            addCriterion("DATARANGE is not null");
            return (Criteria) this;
        }

        public Criteria andDATARANGEEqualTo(String value) {
            addCriterion("DATARANGE =", value, "DATARANGE");
            return (Criteria) this;
        }

        public Criteria andDATARANGENotEqualTo(String value) {
            addCriterion("DATARANGE <>", value, "DATARANGE");
            return (Criteria) this;
        }

        public Criteria andDATARANGEGreaterThan(String value) {
            addCriterion("DATARANGE >", value, "DATARANGE");
            return (Criteria) this;
        }

        public Criteria andDATARANGEGreaterThanOrEqualTo(String value) {
            addCriterion("DATARANGE >=", value, "DATARANGE");
            return (Criteria) this;
        }

        public Criteria andDATARANGELessThan(String value) {
            addCriterion("DATARANGE <", value, "DATARANGE");
            return (Criteria) this;
        }

        public Criteria andDATARANGELessThanOrEqualTo(String value) {
            addCriterion("DATARANGE <=", value, "DATARANGE");
            return (Criteria) this;
        }

        public Criteria andDATARANGELike(String value) {
            addCriterion("DATARANGE like", value, "DATARANGE");
            return (Criteria) this;
        }

        public Criteria andDATARANGENotLike(String value) {
            addCriterion("DATARANGE not like", value, "DATARANGE");
            return (Criteria) this;
        }

        public Criteria andDATARANGEIn(List<String> values) {
            addCriterion("DATARANGE in", values, "DATARANGE");
            return (Criteria) this;
        }

        public Criteria andDATARANGENotIn(List<String> values) {
            addCriterion("DATARANGE not in", values, "DATARANGE");
            return (Criteria) this;
        }

        public Criteria andDATARANGEBetween(String value1, String value2) {
            addCriterion("DATARANGE between", value1, value2, "DATARANGE");
            return (Criteria) this;
        }

        public Criteria andDATARANGENotBetween(String value1, String value2) {
            addCriterion("DATARANGE not between", value1, value2, "DATARANGE");
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