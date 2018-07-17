package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
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

        public Criteria andPERMISSIONIDIsNull() {
            addCriterion("PERMISSIONID is null");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDIsNotNull() {
            addCriterion("PERMISSIONID is not null");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDEqualTo(String value) {
            addCriterion("PERMISSIONID =", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDNotEqualTo(String value) {
            addCriterion("PERMISSIONID <>", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDGreaterThan(String value) {
            addCriterion("PERMISSIONID >", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSIONID >=", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDLessThan(String value) {
            addCriterion("PERMISSIONID <", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDLessThanOrEqualTo(String value) {
            addCriterion("PERMISSIONID <=", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDLike(String value) {
            addCriterion("PERMISSIONID like", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDNotLike(String value) {
            addCriterion("PERMISSIONID not like", value, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDIn(List<String> values) {
            addCriterion("PERMISSIONID in", values, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDNotIn(List<String> values) {
            addCriterion("PERMISSIONID not in", values, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDBetween(String value1, String value2) {
            addCriterion("PERMISSIONID between", value1, value2, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONIDNotBetween(String value1, String value2) {
            addCriterion("PERMISSIONID not between", value1, value2, "PERMISSIONID");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONPHYSICALNAMEIsNull() {
            addCriterion("PERMISSIONPHYSICALNAME is null");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONPHYSICALNAMEIsNotNull() {
            addCriterion("PERMISSIONPHYSICALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONPHYSICALNAMEEqualTo(String value) {
            addCriterion("PERMISSIONPHYSICALNAME =", value, "PERMISSIONPHYSICALNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONPHYSICALNAMENotEqualTo(String value) {
            addCriterion("PERMISSIONPHYSICALNAME <>", value, "PERMISSIONPHYSICALNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONPHYSICALNAMEGreaterThan(String value) {
            addCriterion("PERMISSIONPHYSICALNAME >", value, "PERMISSIONPHYSICALNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONPHYSICALNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSIONPHYSICALNAME >=", value, "PERMISSIONPHYSICALNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONPHYSICALNAMELessThan(String value) {
            addCriterion("PERMISSIONPHYSICALNAME <", value, "PERMISSIONPHYSICALNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONPHYSICALNAMELessThanOrEqualTo(String value) {
            addCriterion("PERMISSIONPHYSICALNAME <=", value, "PERMISSIONPHYSICALNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONPHYSICALNAMELike(String value) {
            addCriterion("PERMISSIONPHYSICALNAME like", value, "PERMISSIONPHYSICALNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONPHYSICALNAMENotLike(String value) {
            addCriterion("PERMISSIONPHYSICALNAME not like", value, "PERMISSIONPHYSICALNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONPHYSICALNAMEIn(List<String> values) {
            addCriterion("PERMISSIONPHYSICALNAME in", values, "PERMISSIONPHYSICALNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONPHYSICALNAMENotIn(List<String> values) {
            addCriterion("PERMISSIONPHYSICALNAME not in", values, "PERMISSIONPHYSICALNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONPHYSICALNAMEBetween(String value1, String value2) {
            addCriterion("PERMISSIONPHYSICALNAME between", value1, value2, "PERMISSIONPHYSICALNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONPHYSICALNAMENotBetween(String value1, String value2) {
            addCriterion("PERMISSIONPHYSICALNAME not between", value1, value2, "PERMISSIONPHYSICALNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONLOGICNAMEIsNull() {
            addCriterion("PERMISSIONLOGICNAME is null");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONLOGICNAMEIsNotNull() {
            addCriterion("PERMISSIONLOGICNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONLOGICNAMEEqualTo(String value) {
            addCriterion("PERMISSIONLOGICNAME =", value, "PERMISSIONLOGICNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONLOGICNAMENotEqualTo(String value) {
            addCriterion("PERMISSIONLOGICNAME <>", value, "PERMISSIONLOGICNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONLOGICNAMEGreaterThan(String value) {
            addCriterion("PERMISSIONLOGICNAME >", value, "PERMISSIONLOGICNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONLOGICNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSIONLOGICNAME >=", value, "PERMISSIONLOGICNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONLOGICNAMELessThan(String value) {
            addCriterion("PERMISSIONLOGICNAME <", value, "PERMISSIONLOGICNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONLOGICNAMELessThanOrEqualTo(String value) {
            addCriterion("PERMISSIONLOGICNAME <=", value, "PERMISSIONLOGICNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONLOGICNAMELike(String value) {
            addCriterion("PERMISSIONLOGICNAME like", value, "PERMISSIONLOGICNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONLOGICNAMENotLike(String value) {
            addCriterion("PERMISSIONLOGICNAME not like", value, "PERMISSIONLOGICNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONLOGICNAMEIn(List<String> values) {
            addCriterion("PERMISSIONLOGICNAME in", values, "PERMISSIONLOGICNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONLOGICNAMENotIn(List<String> values) {
            addCriterion("PERMISSIONLOGICNAME not in", values, "PERMISSIONLOGICNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONLOGICNAMEBetween(String value1, String value2) {
            addCriterion("PERMISSIONLOGICNAME between", value1, value2, "PERMISSIONLOGICNAME");
            return (Criteria) this;
        }

        public Criteria andPERMISSIONLOGICNAMENotBetween(String value1, String value2) {
            addCriterion("PERMISSIONLOGICNAME not between", value1, value2, "PERMISSIONLOGICNAME");
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