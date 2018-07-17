package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class ComputerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComputerExample() {
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

        public Criteria andGRAPHICCARDIsNull() {
            addCriterion("GRAPHICCARD is null");
            return (Criteria) this;
        }

        public Criteria andGRAPHICCARDIsNotNull() {
            addCriterion("GRAPHICCARD is not null");
            return (Criteria) this;
        }

        public Criteria andGRAPHICCARDEqualTo(String value) {
            addCriterion("GRAPHICCARD =", value, "GRAPHICCARD");
            return (Criteria) this;
        }

        public Criteria andGRAPHICCARDNotEqualTo(String value) {
            addCriterion("GRAPHICCARD <>", value, "GRAPHICCARD");
            return (Criteria) this;
        }

        public Criteria andGRAPHICCARDGreaterThan(String value) {
            addCriterion("GRAPHICCARD >", value, "GRAPHICCARD");
            return (Criteria) this;
        }

        public Criteria andGRAPHICCARDGreaterThanOrEqualTo(String value) {
            addCriterion("GRAPHICCARD >=", value, "GRAPHICCARD");
            return (Criteria) this;
        }

        public Criteria andGRAPHICCARDLessThan(String value) {
            addCriterion("GRAPHICCARD <", value, "GRAPHICCARD");
            return (Criteria) this;
        }

        public Criteria andGRAPHICCARDLessThanOrEqualTo(String value) {
            addCriterion("GRAPHICCARD <=", value, "GRAPHICCARD");
            return (Criteria) this;
        }

        public Criteria andGRAPHICCARDLike(String value) {
            addCriterion("GRAPHICCARD like", value, "GRAPHICCARD");
            return (Criteria) this;
        }

        public Criteria andGRAPHICCARDNotLike(String value) {
            addCriterion("GRAPHICCARD not like", value, "GRAPHICCARD");
            return (Criteria) this;
        }

        public Criteria andGRAPHICCARDIn(List<String> values) {
            addCriterion("GRAPHICCARD in", values, "GRAPHICCARD");
            return (Criteria) this;
        }

        public Criteria andGRAPHICCARDNotIn(List<String> values) {
            addCriterion("GRAPHICCARD not in", values, "GRAPHICCARD");
            return (Criteria) this;
        }

        public Criteria andGRAPHICCARDBetween(String value1, String value2) {
            addCriterion("GRAPHICCARD between", value1, value2, "GRAPHICCARD");
            return (Criteria) this;
        }

        public Criteria andGRAPHICCARDNotBetween(String value1, String value2) {
            addCriterion("GRAPHICCARD not between", value1, value2, "GRAPHICCARD");
            return (Criteria) this;
        }

        public Criteria andAUDIOCARDIsNull() {
            addCriterion("AUDIOCARD is null");
            return (Criteria) this;
        }

        public Criteria andAUDIOCARDIsNotNull() {
            addCriterion("AUDIOCARD is not null");
            return (Criteria) this;
        }

        public Criteria andAUDIOCARDEqualTo(String value) {
            addCriterion("AUDIOCARD =", value, "AUDIOCARD");
            return (Criteria) this;
        }

        public Criteria andAUDIOCARDNotEqualTo(String value) {
            addCriterion("AUDIOCARD <>", value, "AUDIOCARD");
            return (Criteria) this;
        }

        public Criteria andAUDIOCARDGreaterThan(String value) {
            addCriterion("AUDIOCARD >", value, "AUDIOCARD");
            return (Criteria) this;
        }

        public Criteria andAUDIOCARDGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIOCARD >=", value, "AUDIOCARD");
            return (Criteria) this;
        }

        public Criteria andAUDIOCARDLessThan(String value) {
            addCriterion("AUDIOCARD <", value, "AUDIOCARD");
            return (Criteria) this;
        }

        public Criteria andAUDIOCARDLessThanOrEqualTo(String value) {
            addCriterion("AUDIOCARD <=", value, "AUDIOCARD");
            return (Criteria) this;
        }

        public Criteria andAUDIOCARDLike(String value) {
            addCriterion("AUDIOCARD like", value, "AUDIOCARD");
            return (Criteria) this;
        }

        public Criteria andAUDIOCARDNotLike(String value) {
            addCriterion("AUDIOCARD not like", value, "AUDIOCARD");
            return (Criteria) this;
        }

        public Criteria andAUDIOCARDIn(List<String> values) {
            addCriterion("AUDIOCARD in", values, "AUDIOCARD");
            return (Criteria) this;
        }

        public Criteria andAUDIOCARDNotIn(List<String> values) {
            addCriterion("AUDIOCARD not in", values, "AUDIOCARD");
            return (Criteria) this;
        }

        public Criteria andAUDIOCARDBetween(String value1, String value2) {
            addCriterion("AUDIOCARD between", value1, value2, "AUDIOCARD");
            return (Criteria) this;
        }

        public Criteria andAUDIOCARDNotBetween(String value1, String value2) {
            addCriterion("AUDIOCARD not between", value1, value2, "AUDIOCARD");
            return (Criteria) this;
        }

        public Criteria andNETWORKCARDIsNull() {
            addCriterion("NETWORKCARD is null");
            return (Criteria) this;
        }

        public Criteria andNETWORKCARDIsNotNull() {
            addCriterion("NETWORKCARD is not null");
            return (Criteria) this;
        }

        public Criteria andNETWORKCARDEqualTo(String value) {
            addCriterion("NETWORKCARD =", value, "NETWORKCARD");
            return (Criteria) this;
        }

        public Criteria andNETWORKCARDNotEqualTo(String value) {
            addCriterion("NETWORKCARD <>", value, "NETWORKCARD");
            return (Criteria) this;
        }

        public Criteria andNETWORKCARDGreaterThan(String value) {
            addCriterion("NETWORKCARD >", value, "NETWORKCARD");
            return (Criteria) this;
        }

        public Criteria andNETWORKCARDGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORKCARD >=", value, "NETWORKCARD");
            return (Criteria) this;
        }

        public Criteria andNETWORKCARDLessThan(String value) {
            addCriterion("NETWORKCARD <", value, "NETWORKCARD");
            return (Criteria) this;
        }

        public Criteria andNETWORKCARDLessThanOrEqualTo(String value) {
            addCriterion("NETWORKCARD <=", value, "NETWORKCARD");
            return (Criteria) this;
        }

        public Criteria andNETWORKCARDLike(String value) {
            addCriterion("NETWORKCARD like", value, "NETWORKCARD");
            return (Criteria) this;
        }

        public Criteria andNETWORKCARDNotLike(String value) {
            addCriterion("NETWORKCARD not like", value, "NETWORKCARD");
            return (Criteria) this;
        }

        public Criteria andNETWORKCARDIn(List<String> values) {
            addCriterion("NETWORKCARD in", values, "NETWORKCARD");
            return (Criteria) this;
        }

        public Criteria andNETWORKCARDNotIn(List<String> values) {
            addCriterion("NETWORKCARD not in", values, "NETWORKCARD");
            return (Criteria) this;
        }

        public Criteria andNETWORKCARDBetween(String value1, String value2) {
            addCriterion("NETWORKCARD between", value1, value2, "NETWORKCARD");
            return (Criteria) this;
        }

        public Criteria andNETWORKCARDNotBetween(String value1, String value2) {
            addCriterion("NETWORKCARD not between", value1, value2, "NETWORKCARD");
            return (Criteria) this;
        }

        public Criteria andMOTHERBOARDIsNull() {
            addCriterion("MOTHERBOARD is null");
            return (Criteria) this;
        }

        public Criteria andMOTHERBOARDIsNotNull() {
            addCriterion("MOTHERBOARD is not null");
            return (Criteria) this;
        }

        public Criteria andMOTHERBOARDEqualTo(String value) {
            addCriterion("MOTHERBOARD =", value, "MOTHERBOARD");
            return (Criteria) this;
        }

        public Criteria andMOTHERBOARDNotEqualTo(String value) {
            addCriterion("MOTHERBOARD <>", value, "MOTHERBOARD");
            return (Criteria) this;
        }

        public Criteria andMOTHERBOARDGreaterThan(String value) {
            addCriterion("MOTHERBOARD >", value, "MOTHERBOARD");
            return (Criteria) this;
        }

        public Criteria andMOTHERBOARDGreaterThanOrEqualTo(String value) {
            addCriterion("MOTHERBOARD >=", value, "MOTHERBOARD");
            return (Criteria) this;
        }

        public Criteria andMOTHERBOARDLessThan(String value) {
            addCriterion("MOTHERBOARD <", value, "MOTHERBOARD");
            return (Criteria) this;
        }

        public Criteria andMOTHERBOARDLessThanOrEqualTo(String value) {
            addCriterion("MOTHERBOARD <=", value, "MOTHERBOARD");
            return (Criteria) this;
        }

        public Criteria andMOTHERBOARDLike(String value) {
            addCriterion("MOTHERBOARD like", value, "MOTHERBOARD");
            return (Criteria) this;
        }

        public Criteria andMOTHERBOARDNotLike(String value) {
            addCriterion("MOTHERBOARD not like", value, "MOTHERBOARD");
            return (Criteria) this;
        }

        public Criteria andMOTHERBOARDIn(List<String> values) {
            addCriterion("MOTHERBOARD in", values, "MOTHERBOARD");
            return (Criteria) this;
        }

        public Criteria andMOTHERBOARDNotIn(List<String> values) {
            addCriterion("MOTHERBOARD not in", values, "MOTHERBOARD");
            return (Criteria) this;
        }

        public Criteria andMOTHERBOARDBetween(String value1, String value2) {
            addCriterion("MOTHERBOARD between", value1, value2, "MOTHERBOARD");
            return (Criteria) this;
        }

        public Criteria andMOTHERBOARDNotBetween(String value1, String value2) {
            addCriterion("MOTHERBOARD not between", value1, value2, "MOTHERBOARD");
            return (Criteria) this;
        }

        public Criteria andOSNAMEIsNull() {
            addCriterion("OSNAME is null");
            return (Criteria) this;
        }

        public Criteria andOSNAMEIsNotNull() {
            addCriterion("OSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOSNAMEEqualTo(String value) {
            addCriterion("OSNAME =", value, "OSNAME");
            return (Criteria) this;
        }

        public Criteria andOSNAMENotEqualTo(String value) {
            addCriterion("OSNAME <>", value, "OSNAME");
            return (Criteria) this;
        }

        public Criteria andOSNAMEGreaterThan(String value) {
            addCriterion("OSNAME >", value, "OSNAME");
            return (Criteria) this;
        }

        public Criteria andOSNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("OSNAME >=", value, "OSNAME");
            return (Criteria) this;
        }

        public Criteria andOSNAMELessThan(String value) {
            addCriterion("OSNAME <", value, "OSNAME");
            return (Criteria) this;
        }

        public Criteria andOSNAMELessThanOrEqualTo(String value) {
            addCriterion("OSNAME <=", value, "OSNAME");
            return (Criteria) this;
        }

        public Criteria andOSNAMELike(String value) {
            addCriterion("OSNAME like", value, "OSNAME");
            return (Criteria) this;
        }

        public Criteria andOSNAMENotLike(String value) {
            addCriterion("OSNAME not like", value, "OSNAME");
            return (Criteria) this;
        }

        public Criteria andOSNAMEIn(List<String> values) {
            addCriterion("OSNAME in", values, "OSNAME");
            return (Criteria) this;
        }

        public Criteria andOSNAMENotIn(List<String> values) {
            addCriterion("OSNAME not in", values, "OSNAME");
            return (Criteria) this;
        }

        public Criteria andOSNAMEBetween(String value1, String value2) {
            addCriterion("OSNAME between", value1, value2, "OSNAME");
            return (Criteria) this;
        }

        public Criteria andOSNAMENotBetween(String value1, String value2) {
            addCriterion("OSNAME not between", value1, value2, "OSNAME");
            return (Criteria) this;
        }

        public Criteria andOSIDIsNull() {
            addCriterion("OSID is null");
            return (Criteria) this;
        }

        public Criteria andOSIDIsNotNull() {
            addCriterion("OSID is not null");
            return (Criteria) this;
        }

        public Criteria andOSIDEqualTo(String value) {
            addCriterion("OSID =", value, "OSID");
            return (Criteria) this;
        }

        public Criteria andOSIDNotEqualTo(String value) {
            addCriterion("OSID <>", value, "OSID");
            return (Criteria) this;
        }

        public Criteria andOSIDGreaterThan(String value) {
            addCriterion("OSID >", value, "OSID");
            return (Criteria) this;
        }

        public Criteria andOSIDGreaterThanOrEqualTo(String value) {
            addCriterion("OSID >=", value, "OSID");
            return (Criteria) this;
        }

        public Criteria andOSIDLessThan(String value) {
            addCriterion("OSID <", value, "OSID");
            return (Criteria) this;
        }

        public Criteria andOSIDLessThanOrEqualTo(String value) {
            addCriterion("OSID <=", value, "OSID");
            return (Criteria) this;
        }

        public Criteria andOSIDLike(String value) {
            addCriterion("OSID like", value, "OSID");
            return (Criteria) this;
        }

        public Criteria andOSIDNotLike(String value) {
            addCriterion("OSID not like", value, "OSID");
            return (Criteria) this;
        }

        public Criteria andOSIDIn(List<String> values) {
            addCriterion("OSID in", values, "OSID");
            return (Criteria) this;
        }

        public Criteria andOSIDNotIn(List<String> values) {
            addCriterion("OSID not in", values, "OSID");
            return (Criteria) this;
        }

        public Criteria andOSIDBetween(String value1, String value2) {
            addCriterion("OSID between", value1, value2, "OSID");
            return (Criteria) this;
        }

        public Criteria andOSIDNotBetween(String value1, String value2) {
            addCriterion("OSID not between", value1, value2, "OSID");
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