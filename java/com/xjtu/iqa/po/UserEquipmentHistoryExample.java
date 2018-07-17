package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class UserEquipmentHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserEquipmentHistoryExample() {
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

        public Criteria andUSEREQUIPMENTHISTORYIDIsNull() {
            addCriterion("USEREQUIPMENTHISTORYID is null");
            return (Criteria) this;
        }

        public Criteria andUSEREQUIPMENTHISTORYIDIsNotNull() {
            addCriterion("USEREQUIPMENTHISTORYID is not null");
            return (Criteria) this;
        }

        public Criteria andUSEREQUIPMENTHISTORYIDEqualTo(String value) {
            addCriterion("USEREQUIPMENTHISTORYID =", value, "USEREQUIPMENTHISTORYID");
            return (Criteria) this;
        }

        public Criteria andUSEREQUIPMENTHISTORYIDNotEqualTo(String value) {
            addCriterion("USEREQUIPMENTHISTORYID <>", value, "USEREQUIPMENTHISTORYID");
            return (Criteria) this;
        }

        public Criteria andUSEREQUIPMENTHISTORYIDGreaterThan(String value) {
            addCriterion("USEREQUIPMENTHISTORYID >", value, "USEREQUIPMENTHISTORYID");
            return (Criteria) this;
        }

        public Criteria andUSEREQUIPMENTHISTORYIDGreaterThanOrEqualTo(String value) {
            addCriterion("USEREQUIPMENTHISTORYID >=", value, "USEREQUIPMENTHISTORYID");
            return (Criteria) this;
        }

        public Criteria andUSEREQUIPMENTHISTORYIDLessThan(String value) {
            addCriterion("USEREQUIPMENTHISTORYID <", value, "USEREQUIPMENTHISTORYID");
            return (Criteria) this;
        }

        public Criteria andUSEREQUIPMENTHISTORYIDLessThanOrEqualTo(String value) {
            addCriterion("USEREQUIPMENTHISTORYID <=", value, "USEREQUIPMENTHISTORYID");
            return (Criteria) this;
        }

        public Criteria andUSEREQUIPMENTHISTORYIDLike(String value) {
            addCriterion("USEREQUIPMENTHISTORYID like", value, "USEREQUIPMENTHISTORYID");
            return (Criteria) this;
        }

        public Criteria andUSEREQUIPMENTHISTORYIDNotLike(String value) {
            addCriterion("USEREQUIPMENTHISTORYID not like", value, "USEREQUIPMENTHISTORYID");
            return (Criteria) this;
        }

        public Criteria andUSEREQUIPMENTHISTORYIDIn(List<String> values) {
            addCriterion("USEREQUIPMENTHISTORYID in", values, "USEREQUIPMENTHISTORYID");
            return (Criteria) this;
        }

        public Criteria andUSEREQUIPMENTHISTORYIDNotIn(List<String> values) {
            addCriterion("USEREQUIPMENTHISTORYID not in", values, "USEREQUIPMENTHISTORYID");
            return (Criteria) this;
        }

        public Criteria andUSEREQUIPMENTHISTORYIDBetween(String value1, String value2) {
            addCriterion("USEREQUIPMENTHISTORYID between", value1, value2, "USEREQUIPMENTHISTORYID");
            return (Criteria) this;
        }

        public Criteria andUSEREQUIPMENTHISTORYIDNotBetween(String value1, String value2) {
            addCriterion("USEREQUIPMENTHISTORYID not between", value1, value2, "USEREQUIPMENTHISTORYID");
            return (Criteria) this;
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

        public Criteria andALLOCATIONSTARTTIMEIsNull() {
            addCriterion("ALLOCATIONSTARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONSTARTTIMEIsNotNull() {
            addCriterion("ALLOCATIONSTARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONSTARTTIMEEqualTo(String value) {
            addCriterion("ALLOCATIONSTARTTIME =", value, "ALLOCATIONSTARTTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONSTARTTIMENotEqualTo(String value) {
            addCriterion("ALLOCATIONSTARTTIME <>", value, "ALLOCATIONSTARTTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONSTARTTIMEGreaterThan(String value) {
            addCriterion("ALLOCATIONSTARTTIME >", value, "ALLOCATIONSTARTTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONSTARTTIMEGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOCATIONSTARTTIME >=", value, "ALLOCATIONSTARTTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONSTARTTIMELessThan(String value) {
            addCriterion("ALLOCATIONSTARTTIME <", value, "ALLOCATIONSTARTTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONSTARTTIMELessThanOrEqualTo(String value) {
            addCriterion("ALLOCATIONSTARTTIME <=", value, "ALLOCATIONSTARTTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONSTARTTIMELike(String value) {
            addCriterion("ALLOCATIONSTARTTIME like", value, "ALLOCATIONSTARTTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONSTARTTIMENotLike(String value) {
            addCriterion("ALLOCATIONSTARTTIME not like", value, "ALLOCATIONSTARTTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONSTARTTIMEIn(List<String> values) {
            addCriterion("ALLOCATIONSTARTTIME in", values, "ALLOCATIONSTARTTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONSTARTTIMENotIn(List<String> values) {
            addCriterion("ALLOCATIONSTARTTIME not in", values, "ALLOCATIONSTARTTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONSTARTTIMEBetween(String value1, String value2) {
            addCriterion("ALLOCATIONSTARTTIME between", value1, value2, "ALLOCATIONSTARTTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONSTARTTIMENotBetween(String value1, String value2) {
            addCriterion("ALLOCATIONSTARTTIME not between", value1, value2, "ALLOCATIONSTARTTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONENDTIMEIsNull() {
            addCriterion("ALLOCATIONENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONENDTIMEIsNotNull() {
            addCriterion("ALLOCATIONENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONENDTIMEEqualTo(String value) {
            addCriterion("ALLOCATIONENDTIME =", value, "ALLOCATIONENDTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONENDTIMENotEqualTo(String value) {
            addCriterion("ALLOCATIONENDTIME <>", value, "ALLOCATIONENDTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONENDTIMEGreaterThan(String value) {
            addCriterion("ALLOCATIONENDTIME >", value, "ALLOCATIONENDTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONENDTIMEGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOCATIONENDTIME >=", value, "ALLOCATIONENDTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONENDTIMELessThan(String value) {
            addCriterion("ALLOCATIONENDTIME <", value, "ALLOCATIONENDTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONENDTIMELessThanOrEqualTo(String value) {
            addCriterion("ALLOCATIONENDTIME <=", value, "ALLOCATIONENDTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONENDTIMELike(String value) {
            addCriterion("ALLOCATIONENDTIME like", value, "ALLOCATIONENDTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONENDTIMENotLike(String value) {
            addCriterion("ALLOCATIONENDTIME not like", value, "ALLOCATIONENDTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONENDTIMEIn(List<String> values) {
            addCriterion("ALLOCATIONENDTIME in", values, "ALLOCATIONENDTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONENDTIMENotIn(List<String> values) {
            addCriterion("ALLOCATIONENDTIME not in", values, "ALLOCATIONENDTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONENDTIMEBetween(String value1, String value2) {
            addCriterion("ALLOCATIONENDTIME between", value1, value2, "ALLOCATIONENDTIME");
            return (Criteria) this;
        }

        public Criteria andALLOCATIONENDTIMENotBetween(String value1, String value2) {
            addCriterion("ALLOCATIONENDTIME not between", value1, value2, "ALLOCATIONENDTIME");
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