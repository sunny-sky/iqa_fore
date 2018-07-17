package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class RobotAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RobotAnswerExample() {
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

        public Criteria andROBOTANSWERIDIsNull() {
            addCriterion("ROBOTANSWERID is null");
            return (Criteria) this;
        }

        public Criteria andROBOTANSWERIDIsNotNull() {
            addCriterion("ROBOTANSWERID is not null");
            return (Criteria) this;
        }

        public Criteria andROBOTANSWERIDEqualTo(String value) {
            addCriterion("ROBOTANSWERID =", value, "ROBOTANSWERID");
            return (Criteria) this;
        }

        public Criteria andROBOTANSWERIDNotEqualTo(String value) {
            addCriterion("ROBOTANSWERID <>", value, "ROBOTANSWERID");
            return (Criteria) this;
        }

        public Criteria andROBOTANSWERIDGreaterThan(String value) {
            addCriterion("ROBOTANSWERID >", value, "ROBOTANSWERID");
            return (Criteria) this;
        }

        public Criteria andROBOTANSWERIDGreaterThanOrEqualTo(String value) {
            addCriterion("ROBOTANSWERID >=", value, "ROBOTANSWERID");
            return (Criteria) this;
        }

        public Criteria andROBOTANSWERIDLessThan(String value) {
            addCriterion("ROBOTANSWERID <", value, "ROBOTANSWERID");
            return (Criteria) this;
        }

        public Criteria andROBOTANSWERIDLessThanOrEqualTo(String value) {
            addCriterion("ROBOTANSWERID <=", value, "ROBOTANSWERID");
            return (Criteria) this;
        }

        public Criteria andROBOTANSWERIDLike(String value) {
            addCriterion("ROBOTANSWERID like", value, "ROBOTANSWERID");
            return (Criteria) this;
        }

        public Criteria andROBOTANSWERIDNotLike(String value) {
            addCriterion("ROBOTANSWERID not like", value, "ROBOTANSWERID");
            return (Criteria) this;
        }

        public Criteria andROBOTANSWERIDIn(List<String> values) {
            addCriterion("ROBOTANSWERID in", values, "ROBOTANSWERID");
            return (Criteria) this;
        }

        public Criteria andROBOTANSWERIDNotIn(List<String> values) {
            addCriterion("ROBOTANSWERID not in", values, "ROBOTANSWERID");
            return (Criteria) this;
        }

        public Criteria andROBOTANSWERIDBetween(String value1, String value2) {
            addCriterion("ROBOTANSWERID between", value1, value2, "ROBOTANSWERID");
            return (Criteria) this;
        }

        public Criteria andROBOTANSWERIDNotBetween(String value1, String value2) {
            addCriterion("ROBOTANSWERID not between", value1, value2, "ROBOTANSWERID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDIsNull() {
            addCriterion("USERQUESTIONID is null");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDIsNotNull() {
            addCriterion("USERQUESTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDEqualTo(String value) {
            addCriterion("USERQUESTIONID =", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDNotEqualTo(String value) {
            addCriterion("USERQUESTIONID <>", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDGreaterThan(String value) {
            addCriterion("USERQUESTIONID >", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDGreaterThanOrEqualTo(String value) {
            addCriterion("USERQUESTIONID >=", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDLessThan(String value) {
            addCriterion("USERQUESTIONID <", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDLessThanOrEqualTo(String value) {
            addCriterion("USERQUESTIONID <=", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDLike(String value) {
            addCriterion("USERQUESTIONID like", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDNotLike(String value) {
            addCriterion("USERQUESTIONID not like", value, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDIn(List<String> values) {
            addCriterion("USERQUESTIONID in", values, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDNotIn(List<String> values) {
            addCriterion("USERQUESTIONID not in", values, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDBetween(String value1, String value2) {
            addCriterion("USERQUESTIONID between", value1, value2, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andUSERQUESTIONIDNotBetween(String value1, String value2) {
            addCriterion("USERQUESTIONID not between", value1, value2, "USERQUESTIONID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDIsNull() {
            addCriterion("FAQANSWERID is null");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDIsNotNull() {
            addCriterion("FAQANSWERID is not null");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDEqualTo(String value) {
            addCriterion("FAQANSWERID =", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDNotEqualTo(String value) {
            addCriterion("FAQANSWERID <>", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDGreaterThan(String value) {
            addCriterion("FAQANSWERID >", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDGreaterThanOrEqualTo(String value) {
            addCriterion("FAQANSWERID >=", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDLessThan(String value) {
            addCriterion("FAQANSWERID <", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDLessThanOrEqualTo(String value) {
            addCriterion("FAQANSWERID <=", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDLike(String value) {
            addCriterion("FAQANSWERID like", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDNotLike(String value) {
            addCriterion("FAQANSWERID not like", value, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDIn(List<String> values) {
            addCriterion("FAQANSWERID in", values, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDNotIn(List<String> values) {
            addCriterion("FAQANSWERID not in", values, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDBetween(String value1, String value2) {
            addCriterion("FAQANSWERID between", value1, value2, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andFAQANSWERIDNotBetween(String value1, String value2) {
            addCriterion("FAQANSWERID not between", value1, value2, "FAQANSWERID");
            return (Criteria) this;
        }

        public Criteria andSATICFACTIONIsNull() {
            addCriterion("SATICFACTION is null");
            return (Criteria) this;
        }

        public Criteria andSATICFACTIONIsNotNull() {
            addCriterion("SATICFACTION is not null");
            return (Criteria) this;
        }

        public Criteria andSATICFACTIONEqualTo(Integer value) {
            addCriterion("SATICFACTION =", value, "SATICFACTION");
            return (Criteria) this;
        }

        public Criteria andSATICFACTIONNotEqualTo(Integer value) {
            addCriterion("SATICFACTION <>", value, "SATICFACTION");
            return (Criteria) this;
        }

        public Criteria andSATICFACTIONGreaterThan(Integer value) {
            addCriterion("SATICFACTION >", value, "SATICFACTION");
            return (Criteria) this;
        }

        public Criteria andSATICFACTIONGreaterThanOrEqualTo(Integer value) {
            addCriterion("SATICFACTION >=", value, "SATICFACTION");
            return (Criteria) this;
        }

        public Criteria andSATICFACTIONLessThan(Integer value) {
            addCriterion("SATICFACTION <", value, "SATICFACTION");
            return (Criteria) this;
        }

        public Criteria andSATICFACTIONLessThanOrEqualTo(Integer value) {
            addCriterion("SATICFACTION <=", value, "SATICFACTION");
            return (Criteria) this;
        }

        public Criteria andSATICFACTIONIn(List<Integer> values) {
            addCriterion("SATICFACTION in", values, "SATICFACTION");
            return (Criteria) this;
        }

        public Criteria andSATICFACTIONNotIn(List<Integer> values) {
            addCriterion("SATICFACTION not in", values, "SATICFACTION");
            return (Criteria) this;
        }

        public Criteria andSATICFACTIONBetween(Integer value1, Integer value2) {
            addCriterion("SATICFACTION between", value1, value2, "SATICFACTION");
            return (Criteria) this;
        }

        public Criteria andSATICFACTIONNotBetween(Integer value1, Integer value2) {
            addCriterion("SATICFACTION not between", value1, value2, "SATICFACTION");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATEIsNull() {
            addCriterion("QUESTIONSTATE is null");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATEIsNotNull() {
            addCriterion("QUESTIONSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATEEqualTo(Integer value) {
            addCriterion("QUESTIONSTATE =", value, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATENotEqualTo(Integer value) {
            addCriterion("QUESTIONSTATE <>", value, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATEGreaterThan(Integer value) {
            addCriterion("QUESTIONSTATE >", value, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUESTIONSTATE >=", value, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATELessThan(Integer value) {
            addCriterion("QUESTIONSTATE <", value, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATELessThanOrEqualTo(Integer value) {
            addCriterion("QUESTIONSTATE <=", value, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATEIn(List<Integer> values) {
            addCriterion("QUESTIONSTATE in", values, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATENotIn(List<Integer> values) {
            addCriterion("QUESTIONSTATE not in", values, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATEBetween(Integer value1, Integer value2) {
            addCriterion("QUESTIONSTATE between", value1, value2, "QUESTIONSTATE");
            return (Criteria) this;
        }

        public Criteria andQUESTIONSTATENotBetween(Integer value1, Integer value2) {
            addCriterion("QUESTIONSTATE not between", value1, value2, "QUESTIONSTATE");
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