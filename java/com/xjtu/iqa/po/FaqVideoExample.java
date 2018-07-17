package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class FaqVideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FaqVideoExample() {
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

        public Criteria andFAQVIDEOIDIsNull() {
            addCriterion("FAQVIDEOID is null");
            return (Criteria) this;
        }

        public Criteria andFAQVIDEOIDIsNotNull() {
            addCriterion("FAQVIDEOID is not null");
            return (Criteria) this;
        }

        public Criteria andFAQVIDEOIDEqualTo(String value) {
            addCriterion("FAQVIDEOID =", value, "FAQVIDEOID");
            return (Criteria) this;
        }

        public Criteria andFAQVIDEOIDNotEqualTo(String value) {
            addCriterion("FAQVIDEOID <>", value, "FAQVIDEOID");
            return (Criteria) this;
        }

        public Criteria andFAQVIDEOIDGreaterThan(String value) {
            addCriterion("FAQVIDEOID >", value, "FAQVIDEOID");
            return (Criteria) this;
        }

        public Criteria andFAQVIDEOIDGreaterThanOrEqualTo(String value) {
            addCriterion("FAQVIDEOID >=", value, "FAQVIDEOID");
            return (Criteria) this;
        }

        public Criteria andFAQVIDEOIDLessThan(String value) {
            addCriterion("FAQVIDEOID <", value, "FAQVIDEOID");
            return (Criteria) this;
        }

        public Criteria andFAQVIDEOIDLessThanOrEqualTo(String value) {
            addCriterion("FAQVIDEOID <=", value, "FAQVIDEOID");
            return (Criteria) this;
        }

        public Criteria andFAQVIDEOIDLike(String value) {
            addCriterion("FAQVIDEOID like", value, "FAQVIDEOID");
            return (Criteria) this;
        }

        public Criteria andFAQVIDEOIDNotLike(String value) {
            addCriterion("FAQVIDEOID not like", value, "FAQVIDEOID");
            return (Criteria) this;
        }

        public Criteria andFAQVIDEOIDIn(List<String> values) {
            addCriterion("FAQVIDEOID in", values, "FAQVIDEOID");
            return (Criteria) this;
        }

        public Criteria andFAQVIDEOIDNotIn(List<String> values) {
            addCriterion("FAQVIDEOID not in", values, "FAQVIDEOID");
            return (Criteria) this;
        }

        public Criteria andFAQVIDEOIDBetween(String value1, String value2) {
            addCriterion("FAQVIDEOID between", value1, value2, "FAQVIDEOID");
            return (Criteria) this;
        }

        public Criteria andFAQVIDEOIDNotBetween(String value1, String value2) {
            addCriterion("FAQVIDEOID not between", value1, value2, "FAQVIDEOID");
            return (Criteria) this;
        }

        public Criteria andURLIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andURLIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andURLEqualTo(String value) {
            addCriterion("URL =", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotEqualTo(String value) {
            addCriterion("URL <>", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLGreaterThan(String value) {
            addCriterion("URL >", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLLessThan(String value) {
            addCriterion("URL <", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLLike(String value) {
            addCriterion("URL like", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotLike(String value) {
            addCriterion("URL not like", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLIn(List<String> values) {
            addCriterion("URL in", values, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotIn(List<String> values) {
            addCriterion("URL not in", values, "URL");
            return (Criteria) this;
        }

        public Criteria andURLBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "URL");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLike(String value) {
            addCriterion("DESCRIPTION like", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "DESCRIPTION");
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