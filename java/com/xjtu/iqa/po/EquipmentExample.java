package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
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

        public Criteria andEQUIPMENTIDIsNull() {
            addCriterion("EQUIPMENTID is null");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTIDIsNotNull() {
            addCriterion("EQUIPMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTIDEqualTo(String value) {
            addCriterion("EQUIPMENTID =", value, "EQUIPMENTID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTIDNotEqualTo(String value) {
            addCriterion("EQUIPMENTID <>", value, "EQUIPMENTID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTIDGreaterThan(String value) {
            addCriterion("EQUIPMENTID >", value, "EQUIPMENTID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTIDGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTID >=", value, "EQUIPMENTID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTIDLessThan(String value) {
            addCriterion("EQUIPMENTID <", value, "EQUIPMENTID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTIDLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTID <=", value, "EQUIPMENTID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTIDLike(String value) {
            addCriterion("EQUIPMENTID like", value, "EQUIPMENTID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTIDNotLike(String value) {
            addCriterion("EQUIPMENTID not like", value, "EQUIPMENTID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTIDIn(List<String> values) {
            addCriterion("EQUIPMENTID in", values, "EQUIPMENTID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTIDNotIn(List<String> values) {
            addCriterion("EQUIPMENTID not in", values, "EQUIPMENTID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTIDBetween(String value1, String value2) {
            addCriterion("EQUIPMENTID between", value1, value2, "EQUIPMENTID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTIDNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENTID not between", value1, value2, "EQUIPMENTID");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSIsNull() {
            addCriterion("MACADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSIsNotNull() {
            addCriterion("MACADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSEqualTo(String value) {
            addCriterion("MACADDRESS =", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSNotEqualTo(String value) {
            addCriterion("MACADDRESS <>", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSGreaterThan(String value) {
            addCriterion("MACADDRESS >", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("MACADDRESS >=", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSLessThan(String value) {
            addCriterion("MACADDRESS <", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSLessThanOrEqualTo(String value) {
            addCriterion("MACADDRESS <=", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSLike(String value) {
            addCriterion("MACADDRESS like", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSNotLike(String value) {
            addCriterion("MACADDRESS not like", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSIn(List<String> values) {
            addCriterion("MACADDRESS in", values, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSNotIn(List<String> values) {
            addCriterion("MACADDRESS not in", values, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSBetween(String value1, String value2) {
            addCriterion("MACADDRESS between", value1, value2, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSNotBetween(String value1, String value2) {
            addCriterion("MACADDRESS not between", value1, value2, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELIsNull() {
            addCriterion("EQUIPMENTMODEL is null");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELIsNotNull() {
            addCriterion("EQUIPMENTMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL =", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELNotEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL <>", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELGreaterThan(String value) {
            addCriterion("EQUIPMENTMODEL >", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL >=", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELLessThan(String value) {
            addCriterion("EQUIPMENTMODEL <", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL <=", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELLike(String value) {
            addCriterion("EQUIPMENTMODEL like", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELNotLike(String value) {
            addCriterion("EQUIPMENTMODEL not like", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELIn(List<String> values) {
            addCriterion("EQUIPMENTMODEL in", values, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELNotIn(List<String> values) {
            addCriterion("EQUIPMENTMODEL not in", values, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELBetween(String value1, String value2) {
            addCriterion("EQUIPMENTMODEL between", value1, value2, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENTMODEL not between", value1, value2, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andBUYTIMEIsNull() {
            addCriterion("BUYTIME is null");
            return (Criteria) this;
        }

        public Criteria andBUYTIMEIsNotNull() {
            addCriterion("BUYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBUYTIMEEqualTo(String value) {
            addCriterion("BUYTIME =", value, "BUYTIME");
            return (Criteria) this;
        }

        public Criteria andBUYTIMENotEqualTo(String value) {
            addCriterion("BUYTIME <>", value, "BUYTIME");
            return (Criteria) this;
        }

        public Criteria andBUYTIMEGreaterThan(String value) {
            addCriterion("BUYTIME >", value, "BUYTIME");
            return (Criteria) this;
        }

        public Criteria andBUYTIMEGreaterThanOrEqualTo(String value) {
            addCriterion("BUYTIME >=", value, "BUYTIME");
            return (Criteria) this;
        }

        public Criteria andBUYTIMELessThan(String value) {
            addCriterion("BUYTIME <", value, "BUYTIME");
            return (Criteria) this;
        }

        public Criteria andBUYTIMELessThanOrEqualTo(String value) {
            addCriterion("BUYTIME <=", value, "BUYTIME");
            return (Criteria) this;
        }

        public Criteria andBUYTIMELike(String value) {
            addCriterion("BUYTIME like", value, "BUYTIME");
            return (Criteria) this;
        }

        public Criteria andBUYTIMENotLike(String value) {
            addCriterion("BUYTIME not like", value, "BUYTIME");
            return (Criteria) this;
        }

        public Criteria andBUYTIMEIn(List<String> values) {
            addCriterion("BUYTIME in", values, "BUYTIME");
            return (Criteria) this;
        }

        public Criteria andBUYTIMENotIn(List<String> values) {
            addCriterion("BUYTIME not in", values, "BUYTIME");
            return (Criteria) this;
        }

        public Criteria andBUYTIMEBetween(String value1, String value2) {
            addCriterion("BUYTIME between", value1, value2, "BUYTIME");
            return (Criteria) this;
        }

        public Criteria andBUYTIMENotBetween(String value1, String value2) {
            addCriterion("BUYTIME not between", value1, value2, "BUYTIME");
            return (Criteria) this;
        }

        public Criteria andCPUIsNull() {
            addCriterion("CPU is null");
            return (Criteria) this;
        }

        public Criteria andCPUIsNotNull() {
            addCriterion("CPU is not null");
            return (Criteria) this;
        }

        public Criteria andCPUEqualTo(String value) {
            addCriterion("CPU =", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUNotEqualTo(String value) {
            addCriterion("CPU <>", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUGreaterThan(String value) {
            addCriterion("CPU >", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUGreaterThanOrEqualTo(String value) {
            addCriterion("CPU >=", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPULessThan(String value) {
            addCriterion("CPU <", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPULessThanOrEqualTo(String value) {
            addCriterion("CPU <=", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPULike(String value) {
            addCriterion("CPU like", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUNotLike(String value) {
            addCriterion("CPU not like", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUIn(List<String> values) {
            addCriterion("CPU in", values, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUNotIn(List<String> values) {
            addCriterion("CPU not in", values, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUBetween(String value1, String value2) {
            addCriterion("CPU between", value1, value2, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUNotBetween(String value1, String value2) {
            addCriterion("CPU not between", value1, value2, "CPU");
            return (Criteria) this;
        }

        public Criteria andRAMIsNull() {
            addCriterion("RAM is null");
            return (Criteria) this;
        }

        public Criteria andRAMIsNotNull() {
            addCriterion("RAM is not null");
            return (Criteria) this;
        }

        public Criteria andRAMEqualTo(String value) {
            addCriterion("RAM =", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMNotEqualTo(String value) {
            addCriterion("RAM <>", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMGreaterThan(String value) {
            addCriterion("RAM >", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMGreaterThanOrEqualTo(String value) {
            addCriterion("RAM >=", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMLessThan(String value) {
            addCriterion("RAM <", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMLessThanOrEqualTo(String value) {
            addCriterion("RAM <=", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMLike(String value) {
            addCriterion("RAM like", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMNotLike(String value) {
            addCriterion("RAM not like", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMIn(List<String> values) {
            addCriterion("RAM in", values, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMNotIn(List<String> values) {
            addCriterion("RAM not in", values, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMBetween(String value1, String value2) {
            addCriterion("RAM between", value1, value2, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMNotBetween(String value1, String value2) {
            addCriterion("RAM not between", value1, value2, "RAM");
            return (Criteria) this;
        }

        public Criteria andSTORAGEIsNull() {
            addCriterion("STORAGE is null");
            return (Criteria) this;
        }

        public Criteria andSTORAGEIsNotNull() {
            addCriterion("STORAGE is not null");
            return (Criteria) this;
        }

        public Criteria andSTORAGEEqualTo(String value) {
            addCriterion("STORAGE =", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGENotEqualTo(String value) {
            addCriterion("STORAGE <>", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGEGreaterThan(String value) {
            addCriterion("STORAGE >", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGEGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE >=", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGELessThan(String value) {
            addCriterion("STORAGE <", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGELessThanOrEqualTo(String value) {
            addCriterion("STORAGE <=", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGELike(String value) {
            addCriterion("STORAGE like", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGENotLike(String value) {
            addCriterion("STORAGE not like", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGEIn(List<String> values) {
            addCriterion("STORAGE in", values, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGENotIn(List<String> values) {
            addCriterion("STORAGE not in", values, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGEBetween(String value1, String value2) {
            addCriterion("STORAGE between", value1, value2, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGENotBetween(String value1, String value2) {
            addCriterion("STORAGE not between", value1, value2, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andIPIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIPIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIPEqualTo(String value) {
            addCriterion("IP =", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotEqualTo(String value) {
            addCriterion("IP <>", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThan(String value) {
            addCriterion("IP >", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThan(String value) {
            addCriterion("IP <", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLike(String value) {
            addCriterion("IP like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotLike(String value) {
            addCriterion("IP not like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPIn(List<String> values) {
            addCriterion("IP in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotIn(List<String> values) {
            addCriterion("IP not in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "IP");
            return (Criteria) this;
        }

        public Criteria andSTATEIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andSTATEIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andSTATEEqualTo(Integer value) {
            addCriterion("STATE =", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATENotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEGreaterThan(Integer value) {
            addCriterion("STATE >", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATELessThan(Integer value) {
            addCriterion("STATE <", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATELessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEIn(List<Integer> values) {
            addCriterion("STATE in", values, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATENotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATENotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "STATE");
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