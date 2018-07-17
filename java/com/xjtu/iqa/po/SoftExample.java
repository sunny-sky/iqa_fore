package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class SoftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SoftExample() {
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

        public Criteria andSOFTIDIsNull() {
            addCriterion("SOFTID is null");
            return (Criteria) this;
        }

        public Criteria andSOFTIDIsNotNull() {
            addCriterion("SOFTID is not null");
            return (Criteria) this;
        }

        public Criteria andSOFTIDEqualTo(String value) {
            addCriterion("SOFTID =", value, "SOFTID");
            return (Criteria) this;
        }

        public Criteria andSOFTIDNotEqualTo(String value) {
            addCriterion("SOFTID <>", value, "SOFTID");
            return (Criteria) this;
        }

        public Criteria andSOFTIDGreaterThan(String value) {
            addCriterion("SOFTID >", value, "SOFTID");
            return (Criteria) this;
        }

        public Criteria andSOFTIDGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTID >=", value, "SOFTID");
            return (Criteria) this;
        }

        public Criteria andSOFTIDLessThan(String value) {
            addCriterion("SOFTID <", value, "SOFTID");
            return (Criteria) this;
        }

        public Criteria andSOFTIDLessThanOrEqualTo(String value) {
            addCriterion("SOFTID <=", value, "SOFTID");
            return (Criteria) this;
        }

        public Criteria andSOFTIDLike(String value) {
            addCriterion("SOFTID like", value, "SOFTID");
            return (Criteria) this;
        }

        public Criteria andSOFTIDNotLike(String value) {
            addCriterion("SOFTID not like", value, "SOFTID");
            return (Criteria) this;
        }

        public Criteria andSOFTIDIn(List<String> values) {
            addCriterion("SOFTID in", values, "SOFTID");
            return (Criteria) this;
        }

        public Criteria andSOFTIDNotIn(List<String> values) {
            addCriterion("SOFTID not in", values, "SOFTID");
            return (Criteria) this;
        }

        public Criteria andSOFTIDBetween(String value1, String value2) {
            addCriterion("SOFTID between", value1, value2, "SOFTID");
            return (Criteria) this;
        }

        public Criteria andSOFTIDNotBetween(String value1, String value2) {
            addCriterion("SOFTID not between", value1, value2, "SOFTID");
            return (Criteria) this;
        }

        public Criteria andSCOREIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andSCOREIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andSCOREEqualTo(String value) {
            addCriterion("SCORE =", value, "SCORE");
            return (Criteria) this;
        }

        public Criteria andSCORENotEqualTo(String value) {
            addCriterion("SCORE <>", value, "SCORE");
            return (Criteria) this;
        }

        public Criteria andSCOREGreaterThan(String value) {
            addCriterion("SCORE >", value, "SCORE");
            return (Criteria) this;
        }

        public Criteria andSCOREGreaterThanOrEqualTo(String value) {
            addCriterion("SCORE >=", value, "SCORE");
            return (Criteria) this;
        }

        public Criteria andSCORELessThan(String value) {
            addCriterion("SCORE <", value, "SCORE");
            return (Criteria) this;
        }

        public Criteria andSCORELessThanOrEqualTo(String value) {
            addCriterion("SCORE <=", value, "SCORE");
            return (Criteria) this;
        }

        public Criteria andSCORELike(String value) {
            addCriterion("SCORE like", value, "SCORE");
            return (Criteria) this;
        }

        public Criteria andSCORENotLike(String value) {
            addCriterion("SCORE not like", value, "SCORE");
            return (Criteria) this;
        }

        public Criteria andSCOREIn(List<String> values) {
            addCriterion("SCORE in", values, "SCORE");
            return (Criteria) this;
        }

        public Criteria andSCORENotIn(List<String> values) {
            addCriterion("SCORE not in", values, "SCORE");
            return (Criteria) this;
        }

        public Criteria andSCOREBetween(String value1, String value2) {
            addCriterion("SCORE between", value1, value2, "SCORE");
            return (Criteria) this;
        }

        public Criteria andSCORENotBetween(String value1, String value2) {
            addCriterion("SCORE not between", value1, value2, "SCORE");
            return (Criteria) this;
        }

        public Criteria andLOGOIsNull() {
            addCriterion("LOGO is null");
            return (Criteria) this;
        }

        public Criteria andLOGOIsNotNull() {
            addCriterion("LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andLOGOEqualTo(String value) {
            addCriterion("LOGO =", value, "LOGO");
            return (Criteria) this;
        }

        public Criteria andLOGONotEqualTo(String value) {
            addCriterion("LOGO <>", value, "LOGO");
            return (Criteria) this;
        }

        public Criteria andLOGOGreaterThan(String value) {
            addCriterion("LOGO >", value, "LOGO");
            return (Criteria) this;
        }

        public Criteria andLOGOGreaterThanOrEqualTo(String value) {
            addCriterion("LOGO >=", value, "LOGO");
            return (Criteria) this;
        }

        public Criteria andLOGOLessThan(String value) {
            addCriterion("LOGO <", value, "LOGO");
            return (Criteria) this;
        }

        public Criteria andLOGOLessThanOrEqualTo(String value) {
            addCriterion("LOGO <=", value, "LOGO");
            return (Criteria) this;
        }

        public Criteria andLOGOLike(String value) {
            addCriterion("LOGO like", value, "LOGO");
            return (Criteria) this;
        }

        public Criteria andLOGONotLike(String value) {
            addCriterion("LOGO not like", value, "LOGO");
            return (Criteria) this;
        }

        public Criteria andLOGOIn(List<String> values) {
            addCriterion("LOGO in", values, "LOGO");
            return (Criteria) this;
        }

        public Criteria andLOGONotIn(List<String> values) {
            addCriterion("LOGO not in", values, "LOGO");
            return (Criteria) this;
        }

        public Criteria andLOGOBetween(String value1, String value2) {
            addCriterion("LOGO between", value1, value2, "LOGO");
            return (Criteria) this;
        }

        public Criteria andLOGONotBetween(String value1, String value2) {
            addCriterion("LOGO not between", value1, value2, "LOGO");
            return (Criteria) this;
        }

        public Criteria andVERSIONTYPEIsNull() {
            addCriterion("VERSIONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andVERSIONTYPEIsNotNull() {
            addCriterion("VERSIONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVERSIONTYPEEqualTo(String value) {
            addCriterion("VERSIONTYPE =", value, "VERSIONTYPE");
            return (Criteria) this;
        }

        public Criteria andVERSIONTYPENotEqualTo(String value) {
            addCriterion("VERSIONTYPE <>", value, "VERSIONTYPE");
            return (Criteria) this;
        }

        public Criteria andVERSIONTYPEGreaterThan(String value) {
            addCriterion("VERSIONTYPE >", value, "VERSIONTYPE");
            return (Criteria) this;
        }

        public Criteria andVERSIONTYPEGreaterThanOrEqualTo(String value) {
            addCriterion("VERSIONTYPE >=", value, "VERSIONTYPE");
            return (Criteria) this;
        }

        public Criteria andVERSIONTYPELessThan(String value) {
            addCriterion("VERSIONTYPE <", value, "VERSIONTYPE");
            return (Criteria) this;
        }

        public Criteria andVERSIONTYPELessThanOrEqualTo(String value) {
            addCriterion("VERSIONTYPE <=", value, "VERSIONTYPE");
            return (Criteria) this;
        }

        public Criteria andVERSIONTYPELike(String value) {
            addCriterion("VERSIONTYPE like", value, "VERSIONTYPE");
            return (Criteria) this;
        }

        public Criteria andVERSIONTYPENotLike(String value) {
            addCriterion("VERSIONTYPE not like", value, "VERSIONTYPE");
            return (Criteria) this;
        }

        public Criteria andVERSIONTYPEIn(List<String> values) {
            addCriterion("VERSIONTYPE in", values, "VERSIONTYPE");
            return (Criteria) this;
        }

        public Criteria andVERSIONTYPENotIn(List<String> values) {
            addCriterion("VERSIONTYPE not in", values, "VERSIONTYPE");
            return (Criteria) this;
        }

        public Criteria andVERSIONTYPEBetween(String value1, String value2) {
            addCriterion("VERSIONTYPE between", value1, value2, "VERSIONTYPE");
            return (Criteria) this;
        }

        public Criteria andVERSIONTYPENotBetween(String value1, String value2) {
            addCriterion("VERSIONTYPE not between", value1, value2, "VERSIONTYPE");
            return (Criteria) this;
        }

        public Criteria andVERSIONIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVERSIONIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVERSIONEqualTo(String value) {
            addCriterion("VERSION =", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONGreaterThan(String value) {
            addCriterion("VERSION >", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONLessThan(String value) {
            addCriterion("VERSION <", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONLike(String value) {
            addCriterion("VERSION like", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONNotLike(String value) {
            addCriterion("VERSION not like", value, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONIn(List<String> values) {
            addCriterion("VERSION in", values, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "VERSION");
            return (Criteria) this;
        }

        public Criteria andVERSIONNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "VERSION");
            return (Criteria) this;
        }

        public Criteria andSOFTTYPEIsNull() {
            addCriterion("SOFTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSOFTTYPEIsNotNull() {
            addCriterion("SOFTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSOFTTYPEEqualTo(String value) {
            addCriterion("SOFTTYPE =", value, "SOFTTYPE");
            return (Criteria) this;
        }

        public Criteria andSOFTTYPENotEqualTo(String value) {
            addCriterion("SOFTTYPE <>", value, "SOFTTYPE");
            return (Criteria) this;
        }

        public Criteria andSOFTTYPEGreaterThan(String value) {
            addCriterion("SOFTTYPE >", value, "SOFTTYPE");
            return (Criteria) this;
        }

        public Criteria andSOFTTYPEGreaterThanOrEqualTo(String value) {
            addCriterion("SOFTTYPE >=", value, "SOFTTYPE");
            return (Criteria) this;
        }

        public Criteria andSOFTTYPELessThan(String value) {
            addCriterion("SOFTTYPE <", value, "SOFTTYPE");
            return (Criteria) this;
        }

        public Criteria andSOFTTYPELessThanOrEqualTo(String value) {
            addCriterion("SOFTTYPE <=", value, "SOFTTYPE");
            return (Criteria) this;
        }

        public Criteria andSOFTTYPELike(String value) {
            addCriterion("SOFTTYPE like", value, "SOFTTYPE");
            return (Criteria) this;
        }

        public Criteria andSOFTTYPENotLike(String value) {
            addCriterion("SOFTTYPE not like", value, "SOFTTYPE");
            return (Criteria) this;
        }

        public Criteria andSOFTTYPEIn(List<String> values) {
            addCriterion("SOFTTYPE in", values, "SOFTTYPE");
            return (Criteria) this;
        }

        public Criteria andSOFTTYPENotIn(List<String> values) {
            addCriterion("SOFTTYPE not in", values, "SOFTTYPE");
            return (Criteria) this;
        }

        public Criteria andSOFTTYPEBetween(String value1, String value2) {
            addCriterion("SOFTTYPE between", value1, value2, "SOFTTYPE");
            return (Criteria) this;
        }

        public Criteria andSOFTTYPENotBetween(String value1, String value2) {
            addCriterion("SOFTTYPE not between", value1, value2, "SOFTTYPE");
            return (Criteria) this;
        }

        public Criteria andSPAREURLIsNull() {
            addCriterion("SPAREURL is null");
            return (Criteria) this;
        }

        public Criteria andSPAREURLIsNotNull() {
            addCriterion("SPAREURL is not null");
            return (Criteria) this;
        }

        public Criteria andSPAREURLEqualTo(String value) {
            addCriterion("SPAREURL =", value, "SPAREURL");
            return (Criteria) this;
        }

        public Criteria andSPAREURLNotEqualTo(String value) {
            addCriterion("SPAREURL <>", value, "SPAREURL");
            return (Criteria) this;
        }

        public Criteria andSPAREURLGreaterThan(String value) {
            addCriterion("SPAREURL >", value, "SPAREURL");
            return (Criteria) this;
        }

        public Criteria andSPAREURLGreaterThanOrEqualTo(String value) {
            addCriterion("SPAREURL >=", value, "SPAREURL");
            return (Criteria) this;
        }

        public Criteria andSPAREURLLessThan(String value) {
            addCriterion("SPAREURL <", value, "SPAREURL");
            return (Criteria) this;
        }

        public Criteria andSPAREURLLessThanOrEqualTo(String value) {
            addCriterion("SPAREURL <=", value, "SPAREURL");
            return (Criteria) this;
        }

        public Criteria andSPAREURLLike(String value) {
            addCriterion("SPAREURL like", value, "SPAREURL");
            return (Criteria) this;
        }

        public Criteria andSPAREURLNotLike(String value) {
            addCriterion("SPAREURL not like", value, "SPAREURL");
            return (Criteria) this;
        }

        public Criteria andSPAREURLIn(List<String> values) {
            addCriterion("SPAREURL in", values, "SPAREURL");
            return (Criteria) this;
        }

        public Criteria andSPAREURLNotIn(List<String> values) {
            addCriterion("SPAREURL not in", values, "SPAREURL");
            return (Criteria) this;
        }

        public Criteria andSPAREURLBetween(String value1, String value2) {
            addCriterion("SPAREURL between", value1, value2, "SPAREURL");
            return (Criteria) this;
        }

        public Criteria andSPAREURLNotBetween(String value1, String value2) {
            addCriterion("SPAREURL not between", value1, value2, "SPAREURL");
            return (Criteria) this;
        }

        public Criteria andOSIsNull() {
            addCriterion("OS is null");
            return (Criteria) this;
        }

        public Criteria andOSIsNotNull() {
            addCriterion("OS is not null");
            return (Criteria) this;
        }

        public Criteria andOSEqualTo(String value) {
            addCriterion("OS =", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSNotEqualTo(String value) {
            addCriterion("OS <>", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSGreaterThan(String value) {
            addCriterion("OS >", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSGreaterThanOrEqualTo(String value) {
            addCriterion("OS >=", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSLessThan(String value) {
            addCriterion("OS <", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSLessThanOrEqualTo(String value) {
            addCriterion("OS <=", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSLike(String value) {
            addCriterion("OS like", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSNotLike(String value) {
            addCriterion("OS not like", value, "OS");
            return (Criteria) this;
        }

        public Criteria andOSIn(List<String> values) {
            addCriterion("OS in", values, "OS");
            return (Criteria) this;
        }

        public Criteria andOSNotIn(List<String> values) {
            addCriterion("OS not in", values, "OS");
            return (Criteria) this;
        }

        public Criteria andOSBetween(String value1, String value2) {
            addCriterion("OS between", value1, value2, "OS");
            return (Criteria) this;
        }

        public Criteria andOSNotBetween(String value1, String value2) {
            addCriterion("OS not between", value1, value2, "OS");
            return (Criteria) this;
        }

        public Criteria andWEBSITEIsNull() {
            addCriterion("WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andWEBSITEIsNotNull() {
            addCriterion("WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andWEBSITEEqualTo(String value) {
            addCriterion("WEBSITE =", value, "WEBSITE");
            return (Criteria) this;
        }

        public Criteria andWEBSITENotEqualTo(String value) {
            addCriterion("WEBSITE <>", value, "WEBSITE");
            return (Criteria) this;
        }

        public Criteria andWEBSITEGreaterThan(String value) {
            addCriterion("WEBSITE >", value, "WEBSITE");
            return (Criteria) this;
        }

        public Criteria andWEBSITEGreaterThanOrEqualTo(String value) {
            addCriterion("WEBSITE >=", value, "WEBSITE");
            return (Criteria) this;
        }

        public Criteria andWEBSITELessThan(String value) {
            addCriterion("WEBSITE <", value, "WEBSITE");
            return (Criteria) this;
        }

        public Criteria andWEBSITELessThanOrEqualTo(String value) {
            addCriterion("WEBSITE <=", value, "WEBSITE");
            return (Criteria) this;
        }

        public Criteria andWEBSITELike(String value) {
            addCriterion("WEBSITE like", value, "WEBSITE");
            return (Criteria) this;
        }

        public Criteria andWEBSITENotLike(String value) {
            addCriterion("WEBSITE not like", value, "WEBSITE");
            return (Criteria) this;
        }

        public Criteria andWEBSITEIn(List<String> values) {
            addCriterion("WEBSITE in", values, "WEBSITE");
            return (Criteria) this;
        }

        public Criteria andWEBSITENotIn(List<String> values) {
            addCriterion("WEBSITE not in", values, "WEBSITE");
            return (Criteria) this;
        }

        public Criteria andWEBSITEBetween(String value1, String value2) {
            addCriterion("WEBSITE between", value1, value2, "WEBSITE");
            return (Criteria) this;
        }

        public Criteria andWEBSITENotBetween(String value1, String value2) {
            addCriterion("WEBSITE not between", value1, value2, "WEBSITE");
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