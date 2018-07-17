package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class ConfigureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigureExample() {
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

        public Criteria andCONFIGUREIDIsNull() {
            addCriterion("CONFIGUREID is null");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDIsNotNull() {
            addCriterion("CONFIGUREID is not null");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDEqualTo(String value) {
            addCriterion("CONFIGUREID =", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDNotEqualTo(String value) {
            addCriterion("CONFIGUREID <>", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDGreaterThan(String value) {
            addCriterion("CONFIGUREID >", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGUREID >=", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDLessThan(String value) {
            addCriterion("CONFIGUREID <", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDLessThanOrEqualTo(String value) {
            addCriterion("CONFIGUREID <=", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDLike(String value) {
            addCriterion("CONFIGUREID like", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDNotLike(String value) {
            addCriterion("CONFIGUREID not like", value, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDIn(List<String> values) {
            addCriterion("CONFIGUREID in", values, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDNotIn(List<String> values) {
            addCriterion("CONFIGUREID not in", values, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDBetween(String value1, String value2) {
            addCriterion("CONFIGUREID between", value1, value2, "CONFIGUREID");
            return (Criteria) this;
        }

        public Criteria andCONFIGUREIDNotBetween(String value1, String value2) {
            addCriterion("CONFIGUREID not between", value1, value2, "CONFIGUREID");
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

        public Criteria andFILESIZEIsNull() {
            addCriterion("FILESIZE is null");
            return (Criteria) this;
        }

        public Criteria andFILESIZEIsNotNull() {
            addCriterion("FILESIZE is not null");
            return (Criteria) this;
        }

        public Criteria andFILESIZEEqualTo(String value) {
            addCriterion("FILESIZE =", value, "FILESIZE");
            return (Criteria) this;
        }

        public Criteria andFILESIZENotEqualTo(String value) {
            addCriterion("FILESIZE <>", value, "FILESIZE");
            return (Criteria) this;
        }

        public Criteria andFILESIZEGreaterThan(String value) {
            addCriterion("FILESIZE >", value, "FILESIZE");
            return (Criteria) this;
        }

        public Criteria andFILESIZEGreaterThanOrEqualTo(String value) {
            addCriterion("FILESIZE >=", value, "FILESIZE");
            return (Criteria) this;
        }

        public Criteria andFILESIZELessThan(String value) {
            addCriterion("FILESIZE <", value, "FILESIZE");
            return (Criteria) this;
        }

        public Criteria andFILESIZELessThanOrEqualTo(String value) {
            addCriterion("FILESIZE <=", value, "FILESIZE");
            return (Criteria) this;
        }

        public Criteria andFILESIZELike(String value) {
            addCriterion("FILESIZE like", value, "FILESIZE");
            return (Criteria) this;
        }

        public Criteria andFILESIZENotLike(String value) {
            addCriterion("FILESIZE not like", value, "FILESIZE");
            return (Criteria) this;
        }

        public Criteria andFILESIZEIn(List<String> values) {
            addCriterion("FILESIZE in", values, "FILESIZE");
            return (Criteria) this;
        }

        public Criteria andFILESIZENotIn(List<String> values) {
            addCriterion("FILESIZE not in", values, "FILESIZE");
            return (Criteria) this;
        }

        public Criteria andFILESIZEBetween(String value1, String value2) {
            addCriterion("FILESIZE between", value1, value2, "FILESIZE");
            return (Criteria) this;
        }

        public Criteria andFILESIZENotBetween(String value1, String value2) {
            addCriterion("FILESIZE not between", value1, value2, "FILESIZE");
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

        public Criteria andDOWNLOADTIMESIsNull() {
            addCriterion("DOWNLOADTIMES is null");
            return (Criteria) this;
        }

        public Criteria andDOWNLOADTIMESIsNotNull() {
            addCriterion("DOWNLOADTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andDOWNLOADTIMESEqualTo(Integer value) {
            addCriterion("DOWNLOADTIMES =", value, "DOWNLOADTIMES");
            return (Criteria) this;
        }

        public Criteria andDOWNLOADTIMESNotEqualTo(Integer value) {
            addCriterion("DOWNLOADTIMES <>", value, "DOWNLOADTIMES");
            return (Criteria) this;
        }

        public Criteria andDOWNLOADTIMESGreaterThan(Integer value) {
            addCriterion("DOWNLOADTIMES >", value, "DOWNLOADTIMES");
            return (Criteria) this;
        }

        public Criteria andDOWNLOADTIMESGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOWNLOADTIMES >=", value, "DOWNLOADTIMES");
            return (Criteria) this;
        }

        public Criteria andDOWNLOADTIMESLessThan(Integer value) {
            addCriterion("DOWNLOADTIMES <", value, "DOWNLOADTIMES");
            return (Criteria) this;
        }

        public Criteria andDOWNLOADTIMESLessThanOrEqualTo(Integer value) {
            addCriterion("DOWNLOADTIMES <=", value, "DOWNLOADTIMES");
            return (Criteria) this;
        }

        public Criteria andDOWNLOADTIMESIn(List<Integer> values) {
            addCriterion("DOWNLOADTIMES in", values, "DOWNLOADTIMES");
            return (Criteria) this;
        }

        public Criteria andDOWNLOADTIMESNotIn(List<Integer> values) {
            addCriterion("DOWNLOADTIMES not in", values, "DOWNLOADTIMES");
            return (Criteria) this;
        }

        public Criteria andDOWNLOADTIMESBetween(Integer value1, Integer value2) {
            addCriterion("DOWNLOADTIMES between", value1, value2, "DOWNLOADTIMES");
            return (Criteria) this;
        }

        public Criteria andDOWNLOADTIMESNotBetween(Integer value1, Integer value2) {
            addCriterion("DOWNLOADTIMES not between", value1, value2, "DOWNLOADTIMES");
            return (Criteria) this;
        }

        public Criteria andPRODUCERIsNull() {
            addCriterion("PRODUCER is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCERIsNotNull() {
            addCriterion("PRODUCER is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCEREqualTo(String value) {
            addCriterion("PRODUCER =", value, "PRODUCER");
            return (Criteria) this;
        }

        public Criteria andPRODUCERNotEqualTo(String value) {
            addCriterion("PRODUCER <>", value, "PRODUCER");
            return (Criteria) this;
        }

        public Criteria andPRODUCERGreaterThan(String value) {
            addCriterion("PRODUCER >", value, "PRODUCER");
            return (Criteria) this;
        }

        public Criteria andPRODUCERGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCER >=", value, "PRODUCER");
            return (Criteria) this;
        }

        public Criteria andPRODUCERLessThan(String value) {
            addCriterion("PRODUCER <", value, "PRODUCER");
            return (Criteria) this;
        }

        public Criteria andPRODUCERLessThanOrEqualTo(String value) {
            addCriterion("PRODUCER <=", value, "PRODUCER");
            return (Criteria) this;
        }

        public Criteria andPRODUCERLike(String value) {
            addCriterion("PRODUCER like", value, "PRODUCER");
            return (Criteria) this;
        }

        public Criteria andPRODUCERNotLike(String value) {
            addCriterion("PRODUCER not like", value, "PRODUCER");
            return (Criteria) this;
        }

        public Criteria andPRODUCERIn(List<String> values) {
            addCriterion("PRODUCER in", values, "PRODUCER");
            return (Criteria) this;
        }

        public Criteria andPRODUCERNotIn(List<String> values) {
            addCriterion("PRODUCER not in", values, "PRODUCER");
            return (Criteria) this;
        }

        public Criteria andPRODUCERBetween(String value1, String value2) {
            addCriterion("PRODUCER between", value1, value2, "PRODUCER");
            return (Criteria) this;
        }

        public Criteria andPRODUCERNotBetween(String value1, String value2) {
            addCriterion("PRODUCER not between", value1, value2, "PRODUCER");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETIMEIsNull() {
            addCriterion("CONFIGURETIME is null");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETIMEIsNotNull() {
            addCriterion("CONFIGURETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETIMEEqualTo(String value) {
            addCriterion("CONFIGURETIME =", value, "CONFIGURETIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETIMENotEqualTo(String value) {
            addCriterion("CONFIGURETIME <>", value, "CONFIGURETIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETIMEGreaterThan(String value) {
            addCriterion("CONFIGURETIME >", value, "CONFIGURETIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETIMEGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGURETIME >=", value, "CONFIGURETIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETIMELessThan(String value) {
            addCriterion("CONFIGURETIME <", value, "CONFIGURETIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETIMELessThanOrEqualTo(String value) {
            addCriterion("CONFIGURETIME <=", value, "CONFIGURETIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETIMELike(String value) {
            addCriterion("CONFIGURETIME like", value, "CONFIGURETIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETIMENotLike(String value) {
            addCriterion("CONFIGURETIME not like", value, "CONFIGURETIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETIMEIn(List<String> values) {
            addCriterion("CONFIGURETIME in", values, "CONFIGURETIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETIMENotIn(List<String> values) {
            addCriterion("CONFIGURETIME not in", values, "CONFIGURETIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETIMEBetween(String value1, String value2) {
            addCriterion("CONFIGURETIME between", value1, value2, "CONFIGURETIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURETIMENotBetween(String value1, String value2) {
            addCriterion("CONFIGURETIME not between", value1, value2, "CONFIGURETIME");
            return (Criteria) this;
        }

        public Criteria andISCONFIGUREIsNull() {
            addCriterion("ISCONFIGURE is null");
            return (Criteria) this;
        }

        public Criteria andISCONFIGUREIsNotNull() {
            addCriterion("ISCONFIGURE is not null");
            return (Criteria) this;
        }

        public Criteria andISCONFIGUREEqualTo(Integer value) {
            addCriterion("ISCONFIGURE =", value, "ISCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andISCONFIGURENotEqualTo(Integer value) {
            addCriterion("ISCONFIGURE <>", value, "ISCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andISCONFIGUREGreaterThan(Integer value) {
            addCriterion("ISCONFIGURE >", value, "ISCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andISCONFIGUREGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISCONFIGURE >=", value, "ISCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andISCONFIGURELessThan(Integer value) {
            addCriterion("ISCONFIGURE <", value, "ISCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andISCONFIGURELessThanOrEqualTo(Integer value) {
            addCriterion("ISCONFIGURE <=", value, "ISCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andISCONFIGUREIn(List<Integer> values) {
            addCriterion("ISCONFIGURE in", values, "ISCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andISCONFIGURENotIn(List<Integer> values) {
            addCriterion("ISCONFIGURE not in", values, "ISCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andISCONFIGUREBetween(Integer value1, Integer value2) {
            addCriterion("ISCONFIGURE between", value1, value2, "ISCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andISCONFIGURENotBetween(Integer value1, Integer value2) {
            addCriterion("ISCONFIGURE not between", value1, value2, "ISCONFIGURE");
            return (Criteria) this;
        }

        public Criteria andRENAMEIsNull() {
            addCriterion("RENAME is null");
            return (Criteria) this;
        }

        public Criteria andRENAMEIsNotNull() {
            addCriterion("RENAME is not null");
            return (Criteria) this;
        }

        public Criteria andRENAMEEqualTo(String value) {
            addCriterion("RENAME =", value, "RENAME");
            return (Criteria) this;
        }

        public Criteria andRENAMENotEqualTo(String value) {
            addCriterion("RENAME <>", value, "RENAME");
            return (Criteria) this;
        }

        public Criteria andRENAMEGreaterThan(String value) {
            addCriterion("RENAME >", value, "RENAME");
            return (Criteria) this;
        }

        public Criteria andRENAMEGreaterThanOrEqualTo(String value) {
            addCriterion("RENAME >=", value, "RENAME");
            return (Criteria) this;
        }

        public Criteria andRENAMELessThan(String value) {
            addCriterion("RENAME <", value, "RENAME");
            return (Criteria) this;
        }

        public Criteria andRENAMELessThanOrEqualTo(String value) {
            addCriterion("RENAME <=", value, "RENAME");
            return (Criteria) this;
        }

        public Criteria andRENAMELike(String value) {
            addCriterion("RENAME like", value, "RENAME");
            return (Criteria) this;
        }

        public Criteria andRENAMENotLike(String value) {
            addCriterion("RENAME not like", value, "RENAME");
            return (Criteria) this;
        }

        public Criteria andRENAMEIn(List<String> values) {
            addCriterion("RENAME in", values, "RENAME");
            return (Criteria) this;
        }

        public Criteria andRENAMENotIn(List<String> values) {
            addCriterion("RENAME not in", values, "RENAME");
            return (Criteria) this;
        }

        public Criteria andRENAMEBetween(String value1, String value2) {
            addCriterion("RENAME between", value1, value2, "RENAME");
            return (Criteria) this;
        }

        public Criteria andRENAMENotBetween(String value1, String value2) {
            addCriterion("RENAME not between", value1, value2, "RENAME");
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