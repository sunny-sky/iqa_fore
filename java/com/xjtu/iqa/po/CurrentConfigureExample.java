package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class CurrentConfigureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurrentConfigureExample() {
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

        public Criteria andCURRENTCONFIGUREIDIsNull() {
            addCriterion("CURRENTCONFIGUREID is null");
            return (Criteria) this;
        }

        public Criteria andCURRENTCONFIGUREIDIsNotNull() {
            addCriterion("CURRENTCONFIGUREID is not null");
            return (Criteria) this;
        }

        public Criteria andCURRENTCONFIGUREIDEqualTo(String value) {
            addCriterion("CURRENTCONFIGUREID =", value, "CURRENTCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCURRENTCONFIGUREIDNotEqualTo(String value) {
            addCriterion("CURRENTCONFIGUREID <>", value, "CURRENTCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCURRENTCONFIGUREIDGreaterThan(String value) {
            addCriterion("CURRENTCONFIGUREID >", value, "CURRENTCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCURRENTCONFIGUREIDGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENTCONFIGUREID >=", value, "CURRENTCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCURRENTCONFIGUREIDLessThan(String value) {
            addCriterion("CURRENTCONFIGUREID <", value, "CURRENTCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCURRENTCONFIGUREIDLessThanOrEqualTo(String value) {
            addCriterion("CURRENTCONFIGUREID <=", value, "CURRENTCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCURRENTCONFIGUREIDLike(String value) {
            addCriterion("CURRENTCONFIGUREID like", value, "CURRENTCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCURRENTCONFIGUREIDNotLike(String value) {
            addCriterion("CURRENTCONFIGUREID not like", value, "CURRENTCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCURRENTCONFIGUREIDIn(List<String> values) {
            addCriterion("CURRENTCONFIGUREID in", values, "CURRENTCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCURRENTCONFIGUREIDNotIn(List<String> values) {
            addCriterion("CURRENTCONFIGUREID not in", values, "CURRENTCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCURRENTCONFIGUREIDBetween(String value1, String value2) {
            addCriterion("CURRENTCONFIGUREID between", value1, value2, "CURRENTCONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCURRENTCONFIGUREIDNotBetween(String value1, String value2) {
            addCriterion("CURRENTCONFIGUREID not between", value1, value2, "CURRENTCONFIGUREID");
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

        public Criteria andCONFIGUREVERSIONIsNull() {
            addCriterion("CONFIGUREVERSION is null");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREVERSIONIsNotNull() {
            addCriterion("CONFIGUREVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREVERSIONEqualTo(String value) {
            addCriterion("CONFIGUREVERSION =", value, "CONFIGUREVERSION");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREVERSIONNotEqualTo(String value) {
            addCriterion("CONFIGUREVERSION <>", value, "CONFIGUREVERSION");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREVERSIONGreaterThan(String value) {
            addCriterion("CONFIGUREVERSION >", value, "CONFIGUREVERSION");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREVERSIONGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGUREVERSION >=", value, "CONFIGUREVERSION");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREVERSIONLessThan(String value) {
            addCriterion("CONFIGUREVERSION <", value, "CONFIGUREVERSION");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREVERSIONLessThanOrEqualTo(String value) {
            addCriterion("CONFIGUREVERSION <=", value, "CONFIGUREVERSION");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREVERSIONLike(String value) {
            addCriterion("CONFIGUREVERSION like", value, "CONFIGUREVERSION");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREVERSIONNotLike(String value) {
            addCriterion("CONFIGUREVERSION not like", value, "CONFIGUREVERSION");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREVERSIONIn(List<String> values) {
            addCriterion("CONFIGUREVERSION in", values, "CONFIGUREVERSION");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREVERSIONNotIn(List<String> values) {
            addCriterion("CONFIGUREVERSION not in", values, "CONFIGUREVERSION");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREVERSIONBetween(String value1, String value2) {
            addCriterion("CONFIGUREVERSION between", value1, value2, "CONFIGUREVERSION");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREVERSIONNotBetween(String value1, String value2) {
            addCriterion("CONFIGUREVERSION not between", value1, value2, "CONFIGUREVERSION");
            return (Criteria) this;
        }

        public Criteria andCONFIGURENAMEIsNull() {
            addCriterion("CONFIGURENAME is null");
            return (Criteria) this;
        }

        public Criteria andCONFIGURENAMEIsNotNull() {
            addCriterion("CONFIGURENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCONFIGURENAMEEqualTo(String value) {
            addCriterion("CONFIGURENAME =", value, "CONFIGURENAME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURENAMENotEqualTo(String value) {
            addCriterion("CONFIGURENAME <>", value, "CONFIGURENAME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURENAMEGreaterThan(String value) {
            addCriterion("CONFIGURENAME >", value, "CONFIGURENAME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURENAMEGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGURENAME >=", value, "CONFIGURENAME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURENAMELessThan(String value) {
            addCriterion("CONFIGURENAME <", value, "CONFIGURENAME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURENAMELessThanOrEqualTo(String value) {
            addCriterion("CONFIGURENAME <=", value, "CONFIGURENAME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURENAMELike(String value) {
            addCriterion("CONFIGURENAME like", value, "CONFIGURENAME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURENAMENotLike(String value) {
            addCriterion("CONFIGURENAME not like", value, "CONFIGURENAME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURENAMEIn(List<String> values) {
            addCriterion("CONFIGURENAME in", values, "CONFIGURENAME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURENAMENotIn(List<String> values) {
            addCriterion("CONFIGURENAME not in", values, "CONFIGURENAME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURENAMEBetween(String value1, String value2) {
            addCriterion("CONFIGURENAME between", value1, value2, "CONFIGURENAME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURENAMENotBetween(String value1, String value2) {
            addCriterion("CONFIGURENAME not between", value1, value2, "CONFIGURENAME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETYPEIsNull() {
            addCriterion("CONFIGURETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETYPEIsNotNull() {
            addCriterion("CONFIGURETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETYPEEqualTo(String value) {
            addCriterion("CONFIGURETYPE =", value, "CONFIGURETYPE");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETYPENotEqualTo(String value) {
            addCriterion("CONFIGURETYPE <>", value, "CONFIGURETYPE");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETYPEGreaterThan(String value) {
            addCriterion("CONFIGURETYPE >", value, "CONFIGURETYPE");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETYPEGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGURETYPE >=", value, "CONFIGURETYPE");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETYPELessThan(String value) {
            addCriterion("CONFIGURETYPE <", value, "CONFIGURETYPE");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETYPELessThanOrEqualTo(String value) {
            addCriterion("CONFIGURETYPE <=", value, "CONFIGURETYPE");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETYPELike(String value) {
            addCriterion("CONFIGURETYPE like", value, "CONFIGURETYPE");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETYPENotLike(String value) {
            addCriterion("CONFIGURETYPE not like", value, "CONFIGURETYPE");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETYPEIn(List<String> values) {
            addCriterion("CONFIGURETYPE in", values, "CONFIGURETYPE");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETYPENotIn(List<String> values) {
            addCriterion("CONFIGURETYPE not in", values, "CONFIGURETYPE");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETYPEBetween(String value1, String value2) {
            addCriterion("CONFIGURETYPE between", value1, value2, "CONFIGURETYPE");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETYPENotBetween(String value1, String value2) {
            addCriterion("CONFIGURETYPE not between", value1, value2, "CONFIGURETYPE");
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