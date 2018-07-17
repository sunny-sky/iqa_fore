package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class EquipmentBasicConfigureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentBasicConfigureExample() {
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

        public Criteria andEQUIPMENTBASICCONFIGUREIDIsNull() {
            addCriterion("EQUIPMENTBASICCONFIGUREID is null");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTBASICCONFIGUREIDIsNotNull() {
            addCriterion("EQUIPMENTBASICCONFIGUREID is not null");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTBASICCONFIGUREIDEqualTo(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID =", value, "EQUIPMENTBASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTBASICCONFIGUREIDNotEqualTo(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID <>", value, "EQUIPMENTBASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTBASICCONFIGUREIDGreaterThan(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID >", value, "EQUIPMENTBASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTBASICCONFIGUREIDGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID >=", value, "EQUIPMENTBASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTBASICCONFIGUREIDLessThan(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID <", value, "EQUIPMENTBASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTBASICCONFIGUREIDLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID <=", value, "EQUIPMENTBASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTBASICCONFIGUREIDLike(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID like", value, "EQUIPMENTBASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTBASICCONFIGUREIDNotLike(String value) {
            addCriterion("EQUIPMENTBASICCONFIGUREID not like", value, "EQUIPMENTBASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTBASICCONFIGUREIDIn(List<String> values) {
            addCriterion("EQUIPMENTBASICCONFIGUREID in", values, "EQUIPMENTBASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTBASICCONFIGUREIDNotIn(List<String> values) {
            addCriterion("EQUIPMENTBASICCONFIGUREID not in", values, "EQUIPMENTBASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTBASICCONFIGUREIDBetween(String value1, String value2) {
            addCriterion("EQUIPMENTBASICCONFIGUREID between", value1, value2, "EQUIPMENTBASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTBASICCONFIGUREIDNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENTBASICCONFIGUREID not between", value1, value2, "EQUIPMENTBASICCONFIGUREID");
            return (Criteria) this;
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

        public Criteria andBASICCONFIGUREIDIsNull() {
            addCriterion("BASICCONFIGUREID is null");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREIDIsNotNull() {
            addCriterion("BASICCONFIGUREID is not null");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREIDEqualTo(String value) {
            addCriterion("BASICCONFIGUREID =", value, "BASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREIDNotEqualTo(String value) {
            addCriterion("BASICCONFIGUREID <>", value, "BASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREIDGreaterThan(String value) {
            addCriterion("BASICCONFIGUREID >", value, "BASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREIDGreaterThanOrEqualTo(String value) {
            addCriterion("BASICCONFIGUREID >=", value, "BASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREIDLessThan(String value) {
            addCriterion("BASICCONFIGUREID <", value, "BASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREIDLessThanOrEqualTo(String value) {
            addCriterion("BASICCONFIGUREID <=", value, "BASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREIDLike(String value) {
            addCriterion("BASICCONFIGUREID like", value, "BASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREIDNotLike(String value) {
            addCriterion("BASICCONFIGUREID not like", value, "BASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREIDIn(List<String> values) {
            addCriterion("BASICCONFIGUREID in", values, "BASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREIDNotIn(List<String> values) {
            addCriterion("BASICCONFIGUREID not in", values, "BASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREIDBetween(String value1, String value2) {
            addCriterion("BASICCONFIGUREID between", value1, value2, "BASICCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andBASICCONFIGUREIDNotBetween(String value1, String value2) {
            addCriterion("BASICCONFIGUREID not between", value1, value2, "BASICCONFIGUREID");
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