package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class AdviseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdviseExample() {
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

        public Criteria andADVISEIDIsNull() {
            addCriterion("ADVISEID is null");
            return (Criteria) this;
        }

        public Criteria andADVISEIDIsNotNull() {
            addCriterion("ADVISEID is not null");
            return (Criteria) this;
        }

        public Criteria andADVISEIDEqualTo(String value) {
            addCriterion("ADVISEID =", value, "ADVISEID");
            return (Criteria) this;
        }

        public Criteria andADVISEIDNotEqualTo(String value) {
            addCriterion("ADVISEID <>", value, "ADVISEID");
            return (Criteria) this;
        }

        public Criteria andADVISEIDGreaterThan(String value) {
            addCriterion("ADVISEID >", value, "ADVISEID");
            return (Criteria) this;
        }

        public Criteria andADVISEIDGreaterThanOrEqualTo(String value) {
            addCriterion("ADVISEID >=", value, "ADVISEID");
            return (Criteria) this;
        }

        public Criteria andADVISEIDLessThan(String value) {
            addCriterion("ADVISEID <", value, "ADVISEID");
            return (Criteria) this;
        }

        public Criteria andADVISEIDLessThanOrEqualTo(String value) {
            addCriterion("ADVISEID <=", value, "ADVISEID");
            return (Criteria) this;
        }

        public Criteria andADVISEIDLike(String value) {
            addCriterion("ADVISEID like", value, "ADVISEID");
            return (Criteria) this;
        }

        public Criteria andADVISEIDNotLike(String value) {
            addCriterion("ADVISEID not like", value, "ADVISEID");
            return (Criteria) this;
        }

        public Criteria andADVISEIDIn(List<String> values) {
            addCriterion("ADVISEID in", values, "ADVISEID");
            return (Criteria) this;
        }

        public Criteria andADVISEIDNotIn(List<String> values) {
            addCriterion("ADVISEID not in", values, "ADVISEID");
            return (Criteria) this;
        }

        public Criteria andADVISEIDBetween(String value1, String value2) {
            addCriterion("ADVISEID between", value1, value2, "ADVISEID");
            return (Criteria) this;
        }

        public Criteria andADVISEIDNotBetween(String value1, String value2) {
            addCriterion("ADVISEID not between", value1, value2, "ADVISEID");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEMAILEqualTo(String value) {
            addCriterion("EMAIL =", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThan(String value) {
            addCriterion("EMAIL >", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThan(String value) {
            addCriterion("EMAIL <", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLike(String value) {
            addCriterion("EMAIL like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotLike(String value) {
            addCriterion("EMAIL not like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILIn(List<String> values) {
            addCriterion("EMAIL in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNAMEEqualTo(String value) {
            addCriterion("NAME =", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotEqualTo(String value) {
            addCriterion("NAME <>", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThan(String value) {
            addCriterion("NAME >", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThan(String value) {
            addCriterion("NAME <", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELike(String value) {
            addCriterion("NAME like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotLike(String value) {
            addCriterion("NAME not like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEIn(List<String> values) {
            addCriterion("NAME in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotIn(List<String> values) {
            addCriterion("NAME not in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andPHONEIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPHONEIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPHONEEqualTo(String value) {
            addCriterion("PHONE =", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotEqualTo(String value) {
            addCriterion("PHONE <>", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEGreaterThan(String value) {
            addCriterion("PHONE >", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONELessThan(String value) {
            addCriterion("PHONE <", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONELessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONELike(String value) {
            addCriterion("PHONE like", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotLike(String value) {
            addCriterion("PHONE not like", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEIn(List<String> values) {
            addCriterion("PHONE in", values, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotIn(List<String> values) {
            addCriterion("PHONE not in", values, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "PHONE");
            return (Criteria) this;
        }

        public Criteria andTEXTIsNull() {
            addCriterion("TEXT is null");
            return (Criteria) this;
        }

        public Criteria andTEXTIsNotNull() {
            addCriterion("TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andTEXTEqualTo(String value) {
            addCriterion("TEXT =", value, "TEXT");
            return (Criteria) this;
        }

        public Criteria andTEXTNotEqualTo(String value) {
            addCriterion("TEXT <>", value, "TEXT");
            return (Criteria) this;
        }

        public Criteria andTEXTGreaterThan(String value) {
            addCriterion("TEXT >", value, "TEXT");
            return (Criteria) this;
        }

        public Criteria andTEXTGreaterThanOrEqualTo(String value) {
            addCriterion("TEXT >=", value, "TEXT");
            return (Criteria) this;
        }

        public Criteria andTEXTLessThan(String value) {
            addCriterion("TEXT <", value, "TEXT");
            return (Criteria) this;
        }

        public Criteria andTEXTLessThanOrEqualTo(String value) {
            addCriterion("TEXT <=", value, "TEXT");
            return (Criteria) this;
        }

        public Criteria andTEXTLike(String value) {
            addCriterion("TEXT like", value, "TEXT");
            return (Criteria) this;
        }

        public Criteria andTEXTNotLike(String value) {
            addCriterion("TEXT not like", value, "TEXT");
            return (Criteria) this;
        }

        public Criteria andTEXTIn(List<String> values) {
            addCriterion("TEXT in", values, "TEXT");
            return (Criteria) this;
        }

        public Criteria andTEXTNotIn(List<String> values) {
            addCriterion("TEXT not in", values, "TEXT");
            return (Criteria) this;
        }

        public Criteria andTEXTBetween(String value1, String value2) {
            addCriterion("TEXT between", value1, value2, "TEXT");
            return (Criteria) this;
        }

        public Criteria andTEXTNotBetween(String value1, String value2) {
            addCriterion("TEXT not between", value1, value2, "TEXT");
            return (Criteria) this;
        }

        public Criteria andANNEXIsNull() {
            addCriterion("ANNEX is null");
            return (Criteria) this;
        }

        public Criteria andANNEXIsNotNull() {
            addCriterion("ANNEX is not null");
            return (Criteria) this;
        }

        public Criteria andANNEXEqualTo(String value) {
            addCriterion("ANNEX =", value, "ANNEX");
            return (Criteria) this;
        }

        public Criteria andANNEXNotEqualTo(String value) {
            addCriterion("ANNEX <>", value, "ANNEX");
            return (Criteria) this;
        }

        public Criteria andANNEXGreaterThan(String value) {
            addCriterion("ANNEX >", value, "ANNEX");
            return (Criteria) this;
        }

        public Criteria andANNEXGreaterThanOrEqualTo(String value) {
            addCriterion("ANNEX >=", value, "ANNEX");
            return (Criteria) this;
        }

        public Criteria andANNEXLessThan(String value) {
            addCriterion("ANNEX <", value, "ANNEX");
            return (Criteria) this;
        }

        public Criteria andANNEXLessThanOrEqualTo(String value) {
            addCriterion("ANNEX <=", value, "ANNEX");
            return (Criteria) this;
        }

        public Criteria andANNEXLike(String value) {
            addCriterion("ANNEX like", value, "ANNEX");
            return (Criteria) this;
        }

        public Criteria andANNEXNotLike(String value) {
            addCriterion("ANNEX not like", value, "ANNEX");
            return (Criteria) this;
        }

        public Criteria andANNEXIn(List<String> values) {
            addCriterion("ANNEX in", values, "ANNEX");
            return (Criteria) this;
        }

        public Criteria andANNEXNotIn(List<String> values) {
            addCriterion("ANNEX not in", values, "ANNEX");
            return (Criteria) this;
        }

        public Criteria andANNEXBetween(String value1, String value2) {
            addCriterion("ANNEX between", value1, value2, "ANNEX");
            return (Criteria) this;
        }

        public Criteria andANNEXNotBetween(String value1, String value2) {
            addCriterion("ANNEX not between", value1, value2, "ANNEX");
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

        public Criteria andSTATESIsNull() {
            addCriterion("STATES is null");
            return (Criteria) this;
        }

        public Criteria andSTATESIsNotNull() {
            addCriterion("STATES is not null");
            return (Criteria) this;
        }

        public Criteria andSTATESEqualTo(Integer value) {
            addCriterion("STATES =", value, "STATES");
            return (Criteria) this;
        }

        public Criteria andSTATESNotEqualTo(Integer value) {
            addCriterion("STATES <>", value, "STATES");
            return (Criteria) this;
        }

        public Criteria andSTATESGreaterThan(Integer value) {
            addCriterion("STATES >", value, "STATES");
            return (Criteria) this;
        }

        public Criteria andSTATESGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATES >=", value, "STATES");
            return (Criteria) this;
        }

        public Criteria andSTATESLessThan(Integer value) {
            addCriterion("STATES <", value, "STATES");
            return (Criteria) this;
        }

        public Criteria andSTATESLessThanOrEqualTo(Integer value) {
            addCriterion("STATES <=", value, "STATES");
            return (Criteria) this;
        }

        public Criteria andSTATESIn(List<Integer> values) {
            addCriterion("STATES in", values, "STATES");
            return (Criteria) this;
        }

        public Criteria andSTATESNotIn(List<Integer> values) {
            addCriterion("STATES not in", values, "STATES");
            return (Criteria) this;
        }

        public Criteria andSTATESBetween(Integer value1, Integer value2) {
            addCriterion("STATES between", value1, value2, "STATES");
            return (Criteria) this;
        }

        public Criteria andSTATESNotBetween(Integer value1, Integer value2) {
            addCriterion("STATES not between", value1, value2, "STATES");
            return (Criteria) this;
        }

        public Criteria andADVISETIMEIsNull() {
            addCriterion("ADVISETIME is null");
            return (Criteria) this;
        }

        public Criteria andADVISETIMEIsNotNull() {
            addCriterion("ADVISETIME is not null");
            return (Criteria) this;
        }

        public Criteria andADVISETIMEEqualTo(String value) {
            addCriterion("ADVISETIME =", value, "ADVISETIME");
            return (Criteria) this;
        }

        public Criteria andADVISETIMENotEqualTo(String value) {
            addCriterion("ADVISETIME <>", value, "ADVISETIME");
            return (Criteria) this;
        }

        public Criteria andADVISETIMEGreaterThan(String value) {
            addCriterion("ADVISETIME >", value, "ADVISETIME");
            return (Criteria) this;
        }

        public Criteria andADVISETIMEGreaterThanOrEqualTo(String value) {
            addCriterion("ADVISETIME >=", value, "ADVISETIME");
            return (Criteria) this;
        }

        public Criteria andADVISETIMELessThan(String value) {
            addCriterion("ADVISETIME <", value, "ADVISETIME");
            return (Criteria) this;
        }

        public Criteria andADVISETIMELessThanOrEqualTo(String value) {
            addCriterion("ADVISETIME <=", value, "ADVISETIME");
            return (Criteria) this;
        }

        public Criteria andADVISETIMELike(String value) {
            addCriterion("ADVISETIME like", value, "ADVISETIME");
            return (Criteria) this;
        }

        public Criteria andADVISETIMENotLike(String value) {
            addCriterion("ADVISETIME not like", value, "ADVISETIME");
            return (Criteria) this;
        }

        public Criteria andADVISETIMEIn(List<String> values) {
            addCriterion("ADVISETIME in", values, "ADVISETIME");
            return (Criteria) this;
        }

        public Criteria andADVISETIMENotIn(List<String> values) {
            addCriterion("ADVISETIME not in", values, "ADVISETIME");
            return (Criteria) this;
        }

        public Criteria andADVISETIMEBetween(String value1, String value2) {
            addCriterion("ADVISETIME between", value1, value2, "ADVISETIME");
            return (Criteria) this;
        }

        public Criteria andADVISETIMENotBetween(String value1, String value2) {
            addCriterion("ADVISETIME not between", value1, value2, "ADVISETIME");
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