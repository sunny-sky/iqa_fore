package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class EquipmentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentsExample() {
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

        public Criteria andEQUIPMENT_IDIsNull() {
            addCriterion("EQUIPMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENT_IDIsNotNull() {
            addCriterion("EQUIPMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENT_IDEqualTo(Integer value) {
            addCriterion("EQUIPMENT_ID =", value, "EQUIPMENT_ID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENT_IDNotEqualTo(Integer value) {
            addCriterion("EQUIPMENT_ID <>", value, "EQUIPMENT_ID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENT_IDGreaterThan(Integer value) {
            addCriterion("EQUIPMENT_ID >", value, "EQUIPMENT_ID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENT_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("EQUIPMENT_ID >=", value, "EQUIPMENT_ID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENT_IDLessThan(Integer value) {
            addCriterion("EQUIPMENT_ID <", value, "EQUIPMENT_ID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENT_IDLessThanOrEqualTo(Integer value) {
            addCriterion("EQUIPMENT_ID <=", value, "EQUIPMENT_ID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENT_IDIn(List<Integer> values) {
            addCriterion("EQUIPMENT_ID in", values, "EQUIPMENT_ID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENT_IDNotIn(List<Integer> values) {
            addCriterion("EQUIPMENT_ID not in", values, "EQUIPMENT_ID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENT_IDBetween(Integer value1, Integer value2) {
            addCriterion("EQUIPMENT_ID between", value1, value2, "EQUIPMENT_ID");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENT_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("EQUIPMENT_ID not between", value1, value2, "EQUIPMENT_ID");
            return (Criteria) this;
        }

        public Criteria andBRANDIsNull() {
            addCriterion("BRAND is null");
            return (Criteria) this;
        }

        public Criteria andBRANDIsNotNull() {
            addCriterion("BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andBRANDEqualTo(String value) {
            addCriterion("BRAND =", value, "BRAND");
            return (Criteria) this;
        }

        public Criteria andBRANDNotEqualTo(String value) {
            addCriterion("BRAND <>", value, "BRAND");
            return (Criteria) this;
        }

        public Criteria andBRANDGreaterThan(String value) {
            addCriterion("BRAND >", value, "BRAND");
            return (Criteria) this;
        }

        public Criteria andBRANDGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND >=", value, "BRAND");
            return (Criteria) this;
        }

        public Criteria andBRANDLessThan(String value) {
            addCriterion("BRAND <", value, "BRAND");
            return (Criteria) this;
        }

        public Criteria andBRANDLessThanOrEqualTo(String value) {
            addCriterion("BRAND <=", value, "BRAND");
            return (Criteria) this;
        }

        public Criteria andBRANDLike(String value) {
            addCriterion("BRAND like", value, "BRAND");
            return (Criteria) this;
        }

        public Criteria andBRANDNotLike(String value) {
            addCriterion("BRAND not like", value, "BRAND");
            return (Criteria) this;
        }

        public Criteria andBRANDIn(List<String> values) {
            addCriterion("BRAND in", values, "BRAND");
            return (Criteria) this;
        }

        public Criteria andBRANDNotIn(List<String> values) {
            addCriterion("BRAND not in", values, "BRAND");
            return (Criteria) this;
        }

        public Criteria andBRANDBetween(String value1, String value2) {
            addCriterion("BRAND between", value1, value2, "BRAND");
            return (Criteria) this;
        }

        public Criteria andBRANDNotBetween(String value1, String value2) {
            addCriterion("BRAND not between", value1, value2, "BRAND");
            return (Criteria) this;
        }

        public Criteria andCONFIGURE_TIMEIsNull() {
            addCriterion("CONFIGURE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCONFIGURE_TIMEIsNotNull() {
            addCriterion("CONFIGURE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCONFIGURE_TIMEEqualTo(String value) {
            addCriterion("CONFIGURE_TIME =", value, "CONFIGURE_TIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURE_TIMENotEqualTo(String value) {
            addCriterion("CONFIGURE_TIME <>", value, "CONFIGURE_TIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURE_TIMEGreaterThan(String value) {
            addCriterion("CONFIGURE_TIME >", value, "CONFIGURE_TIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURE_TIMEGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGURE_TIME >=", value, "CONFIGURE_TIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURE_TIMELessThan(String value) {
            addCriterion("CONFIGURE_TIME <", value, "CONFIGURE_TIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURE_TIMELessThanOrEqualTo(String value) {
            addCriterion("CONFIGURE_TIME <=", value, "CONFIGURE_TIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURE_TIMELike(String value) {
            addCriterion("CONFIGURE_TIME like", value, "CONFIGURE_TIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURE_TIMENotLike(String value) {
            addCriterion("CONFIGURE_TIME not like", value, "CONFIGURE_TIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURE_TIMEIn(List<String> values) {
            addCriterion("CONFIGURE_TIME in", values, "CONFIGURE_TIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURE_TIMENotIn(List<String> values) {
            addCriterion("CONFIGURE_TIME not in", values, "CONFIGURE_TIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURE_TIMEBetween(String value1, String value2) {
            addCriterion("CONFIGURE_TIME between", value1, value2, "CONFIGURE_TIME");
            return (Criteria) this;
        }

        public Criteria andCONFIGURE_TIMENotBetween(String value1, String value2) {
            addCriterion("CONFIGURE_TIME not between", value1, value2, "CONFIGURE_TIME");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTLike(String value) {
            addCriterion("DEPARTMENT like", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "DEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andUSERIsNull() {
            addCriterion("USER is null");
            return (Criteria) this;
        }

        public Criteria andUSERIsNotNull() {
            addCriterion("USER is not null");
            return (Criteria) this;
        }

        public Criteria andUSEREqualTo(String value) {
            addCriterion("USER =", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERNotEqualTo(String value) {
            addCriterion("USER <>", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERGreaterThan(String value) {
            addCriterion("USER >", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERGreaterThanOrEqualTo(String value) {
            addCriterion("USER >=", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERLessThan(String value) {
            addCriterion("USER <", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERLessThanOrEqualTo(String value) {
            addCriterion("USER <=", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERLike(String value) {
            addCriterion("USER like", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERNotLike(String value) {
            addCriterion("USER not like", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERIn(List<String> values) {
            addCriterion("USER in", values, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERNotIn(List<String> values) {
            addCriterion("USER not in", values, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERBetween(String value1, String value2) {
            addCriterion("USER between", value1, value2, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERNotBetween(String value1, String value2) {
            addCriterion("USER not between", value1, value2, "USER");
            return (Criteria) this;
        }

        public Criteria andCPUIsNull() {
            addCriterion("CPU is null");
            return (Criteria) this;
        }

        public Criteria andCPUIsNotNull() {
            addCriterion("CPU is not null");
            return (Criteria) this;
        }

        public Criteria andCPUEqualTo(String value) {
            addCriterion("CPU =", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUNotEqualTo(String value) {
            addCriterion("CPU <>", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUGreaterThan(String value) {
            addCriterion("CPU >", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUGreaterThanOrEqualTo(String value) {
            addCriterion("CPU >=", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPULessThan(String value) {
            addCriterion("CPU <", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPULessThanOrEqualTo(String value) {
            addCriterion("CPU <=", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPULike(String value) {
            addCriterion("CPU like", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUNotLike(String value) {
            addCriterion("CPU not like", value, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUIn(List<String> values) {
            addCriterion("CPU in", values, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUNotIn(List<String> values) {
            addCriterion("CPU not in", values, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUBetween(String value1, String value2) {
            addCriterion("CPU between", value1, value2, "CPU");
            return (Criteria) this;
        }

        public Criteria andCPUNotBetween(String value1, String value2) {
            addCriterion("CPU not between", value1, value2, "CPU");
            return (Criteria) this;
        }

        public Criteria andRAMIsNull() {
            addCriterion("RAM is null");
            return (Criteria) this;
        }

        public Criteria andRAMIsNotNull() {
            addCriterion("RAM is not null");
            return (Criteria) this;
        }

        public Criteria andRAMEqualTo(String value) {
            addCriterion("RAM =", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMNotEqualTo(String value) {
            addCriterion("RAM <>", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMGreaterThan(String value) {
            addCriterion("RAM >", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMGreaterThanOrEqualTo(String value) {
            addCriterion("RAM >=", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMLessThan(String value) {
            addCriterion("RAM <", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMLessThanOrEqualTo(String value) {
            addCriterion("RAM <=", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMLike(String value) {
            addCriterion("RAM like", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMNotLike(String value) {
            addCriterion("RAM not like", value, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMIn(List<String> values) {
            addCriterion("RAM in", values, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMNotIn(List<String> values) {
            addCriterion("RAM not in", values, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMBetween(String value1, String value2) {
            addCriterion("RAM between", value1, value2, "RAM");
            return (Criteria) this;
        }

        public Criteria andRAMNotBetween(String value1, String value2) {
            addCriterion("RAM not between", value1, value2, "RAM");
            return (Criteria) this;
        }

        public Criteria andROMIsNull() {
            addCriterion("ROM is null");
            return (Criteria) this;
        }

        public Criteria andROMIsNotNull() {
            addCriterion("ROM is not null");
            return (Criteria) this;
        }

        public Criteria andROMEqualTo(String value) {
            addCriterion("ROM =", value, "ROM");
            return (Criteria) this;
        }

        public Criteria andROMNotEqualTo(String value) {
            addCriterion("ROM <>", value, "ROM");
            return (Criteria) this;
        }

        public Criteria andROMGreaterThan(String value) {
            addCriterion("ROM >", value, "ROM");
            return (Criteria) this;
        }

        public Criteria andROMGreaterThanOrEqualTo(String value) {
            addCriterion("ROM >=", value, "ROM");
            return (Criteria) this;
        }

        public Criteria andROMLessThan(String value) {
            addCriterion("ROM <", value, "ROM");
            return (Criteria) this;
        }

        public Criteria andROMLessThanOrEqualTo(String value) {
            addCriterion("ROM <=", value, "ROM");
            return (Criteria) this;
        }

        public Criteria andROMLike(String value) {
            addCriterion("ROM like", value, "ROM");
            return (Criteria) this;
        }

        public Criteria andROMNotLike(String value) {
            addCriterion("ROM not like", value, "ROM");
            return (Criteria) this;
        }

        public Criteria andROMIn(List<String> values) {
            addCriterion("ROM in", values, "ROM");
            return (Criteria) this;
        }

        public Criteria andROMNotIn(List<String> values) {
            addCriterion("ROM not in", values, "ROM");
            return (Criteria) this;
        }

        public Criteria andROMBetween(String value1, String value2) {
            addCriterion("ROM between", value1, value2, "ROM");
            return (Criteria) this;
        }

        public Criteria andROMNotBetween(String value1, String value2) {
            addCriterion("ROM not between", value1, value2, "ROM");
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

        public Criteria andBROWSERIsNull() {
            addCriterion("BROWSER is null");
            return (Criteria) this;
        }

        public Criteria andBROWSERIsNotNull() {
            addCriterion("BROWSER is not null");
            return (Criteria) this;
        }

        public Criteria andBROWSEREqualTo(String value) {
            addCriterion("BROWSER =", value, "BROWSER");
            return (Criteria) this;
        }

        public Criteria andBROWSERNotEqualTo(String value) {
            addCriterion("BROWSER <>", value, "BROWSER");
            return (Criteria) this;
        }

        public Criteria andBROWSERGreaterThan(String value) {
            addCriterion("BROWSER >", value, "BROWSER");
            return (Criteria) this;
        }

        public Criteria andBROWSERGreaterThanOrEqualTo(String value) {
            addCriterion("BROWSER >=", value, "BROWSER");
            return (Criteria) this;
        }

        public Criteria andBROWSERLessThan(String value) {
            addCriterion("BROWSER <", value, "BROWSER");
            return (Criteria) this;
        }

        public Criteria andBROWSERLessThanOrEqualTo(String value) {
            addCriterion("BROWSER <=", value, "BROWSER");
            return (Criteria) this;
        }

        public Criteria andBROWSERLike(String value) {
            addCriterion("BROWSER like", value, "BROWSER");
            return (Criteria) this;
        }

        public Criteria andBROWSERNotLike(String value) {
            addCriterion("BROWSER not like", value, "BROWSER");
            return (Criteria) this;
        }

        public Criteria andBROWSERIn(List<String> values) {
            addCriterion("BROWSER in", values, "BROWSER");
            return (Criteria) this;
        }

        public Criteria andBROWSERNotIn(List<String> values) {
            addCriterion("BROWSER not in", values, "BROWSER");
            return (Criteria) this;
        }

        public Criteria andBROWSERBetween(String value1, String value2) {
            addCriterion("BROWSER between", value1, value2, "BROWSER");
            return (Criteria) this;
        }

        public Criteria andBROWSERNotBetween(String value1, String value2) {
            addCriterion("BROWSER not between", value1, value2, "BROWSER");
            return (Criteria) this;
        }

        public Criteria andOFFICE_SOFTWAREIsNull() {
            addCriterion("OFFICE_SOFTWARE is null");
            return (Criteria) this;
        }

        public Criteria andOFFICE_SOFTWAREIsNotNull() {
            addCriterion("OFFICE_SOFTWARE is not null");
            return (Criteria) this;
        }

        public Criteria andOFFICE_SOFTWAREEqualTo(String value) {
            addCriterion("OFFICE_SOFTWARE =", value, "OFFICE_SOFTWARE");
            return (Criteria) this;
        }

        public Criteria andOFFICE_SOFTWARENotEqualTo(String value) {
            addCriterion("OFFICE_SOFTWARE <>", value, "OFFICE_SOFTWARE");
            return (Criteria) this;
        }

        public Criteria andOFFICE_SOFTWAREGreaterThan(String value) {
            addCriterion("OFFICE_SOFTWARE >", value, "OFFICE_SOFTWARE");
            return (Criteria) this;
        }

        public Criteria andOFFICE_SOFTWAREGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_SOFTWARE >=", value, "OFFICE_SOFTWARE");
            return (Criteria) this;
        }

        public Criteria andOFFICE_SOFTWARELessThan(String value) {
            addCriterion("OFFICE_SOFTWARE <", value, "OFFICE_SOFTWARE");
            return (Criteria) this;
        }

        public Criteria andOFFICE_SOFTWARELessThanOrEqualTo(String value) {
            addCriterion("OFFICE_SOFTWARE <=", value, "OFFICE_SOFTWARE");
            return (Criteria) this;
        }

        public Criteria andOFFICE_SOFTWARELike(String value) {
            addCriterion("OFFICE_SOFTWARE like", value, "OFFICE_SOFTWARE");
            return (Criteria) this;
        }

        public Criteria andOFFICE_SOFTWARENotLike(String value) {
            addCriterion("OFFICE_SOFTWARE not like", value, "OFFICE_SOFTWARE");
            return (Criteria) this;
        }

        public Criteria andOFFICE_SOFTWAREIn(List<String> values) {
            addCriterion("OFFICE_SOFTWARE in", values, "OFFICE_SOFTWARE");
            return (Criteria) this;
        }

        public Criteria andOFFICE_SOFTWARENotIn(List<String> values) {
            addCriterion("OFFICE_SOFTWARE not in", values, "OFFICE_SOFTWARE");
            return (Criteria) this;
        }

        public Criteria andOFFICE_SOFTWAREBetween(String value1, String value2) {
            addCriterion("OFFICE_SOFTWARE between", value1, value2, "OFFICE_SOFTWARE");
            return (Criteria) this;
        }

        public Criteria andOFFICE_SOFTWARENotBetween(String value1, String value2) {
            addCriterion("OFFICE_SOFTWARE not between", value1, value2, "OFFICE_SOFTWARE");
            return (Criteria) this;
        }

        public Criteria andUSED_FORIsNull() {
            addCriterion("USED_FOR is null");
            return (Criteria) this;
        }

        public Criteria andUSED_FORIsNotNull() {
            addCriterion("USED_FOR is not null");
            return (Criteria) this;
        }

        public Criteria andUSED_FOREqualTo(String value) {
            addCriterion("USED_FOR =", value, "USED_FOR");
            return (Criteria) this;
        }

        public Criteria andUSED_FORNotEqualTo(String value) {
            addCriterion("USED_FOR <>", value, "USED_FOR");
            return (Criteria) this;
        }

        public Criteria andUSED_FORGreaterThan(String value) {
            addCriterion("USED_FOR >", value, "USED_FOR");
            return (Criteria) this;
        }

        public Criteria andUSED_FORGreaterThanOrEqualTo(String value) {
            addCriterion("USED_FOR >=", value, "USED_FOR");
            return (Criteria) this;
        }

        public Criteria andUSED_FORLessThan(String value) {
            addCriterion("USED_FOR <", value, "USED_FOR");
            return (Criteria) this;
        }

        public Criteria andUSED_FORLessThanOrEqualTo(String value) {
            addCriterion("USED_FOR <=", value, "USED_FOR");
            return (Criteria) this;
        }

        public Criteria andUSED_FORLike(String value) {
            addCriterion("USED_FOR like", value, "USED_FOR");
            return (Criteria) this;
        }

        public Criteria andUSED_FORNotLike(String value) {
            addCriterion("USED_FOR not like", value, "USED_FOR");
            return (Criteria) this;
        }

        public Criteria andUSED_FORIn(List<String> values) {
            addCriterion("USED_FOR in", values, "USED_FOR");
            return (Criteria) this;
        }

        public Criteria andUSED_FORNotIn(List<String> values) {
            addCriterion("USED_FOR not in", values, "USED_FOR");
            return (Criteria) this;
        }

        public Criteria andUSED_FORBetween(String value1, String value2) {
            addCriterion("USED_FOR between", value1, value2, "USED_FOR");
            return (Criteria) this;
        }

        public Criteria andUSED_FORNotBetween(String value1, String value2) {
            addCriterion("USED_FOR not between", value1, value2, "USED_FOR");
            return (Criteria) this;
        }

        public Criteria andIP_ADDRESSIsNull() {
            addCriterion("IP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andIP_ADDRESSIsNotNull() {
            addCriterion("IP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andIP_ADDRESSEqualTo(String value) {
            addCriterion("IP_ADDRESS =", value, "IP_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andIP_ADDRESSNotEqualTo(String value) {
            addCriterion("IP_ADDRESS <>", value, "IP_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andIP_ADDRESSGreaterThan(String value) {
            addCriterion("IP_ADDRESS >", value, "IP_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andIP_ADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS >=", value, "IP_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andIP_ADDRESSLessThan(String value) {
            addCriterion("IP_ADDRESS <", value, "IP_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andIP_ADDRESSLessThanOrEqualTo(String value) {
            addCriterion("IP_ADDRESS <=", value, "IP_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andIP_ADDRESSLike(String value) {
            addCriterion("IP_ADDRESS like", value, "IP_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andIP_ADDRESSNotLike(String value) {
            addCriterion("IP_ADDRESS not like", value, "IP_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andIP_ADDRESSIn(List<String> values) {
            addCriterion("IP_ADDRESS in", values, "IP_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andIP_ADDRESSNotIn(List<String> values) {
            addCriterion("IP_ADDRESS not in", values, "IP_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andIP_ADDRESSBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS between", value1, value2, "IP_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andIP_ADDRESSNotBetween(String value1, String value2) {
            addCriterion("IP_ADDRESS not between", value1, value2, "IP_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andMAC_ADDRESSIsNull() {
            addCriterion("MAC_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andMAC_ADDRESSIsNotNull() {
            addCriterion("MAC_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andMAC_ADDRESSEqualTo(String value) {
            addCriterion("MAC_ADDRESS =", value, "MAC_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andMAC_ADDRESSNotEqualTo(String value) {
            addCriterion("MAC_ADDRESS <>", value, "MAC_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andMAC_ADDRESSGreaterThan(String value) {
            addCriterion("MAC_ADDRESS >", value, "MAC_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andMAC_ADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("MAC_ADDRESS >=", value, "MAC_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andMAC_ADDRESSLessThan(String value) {
            addCriterion("MAC_ADDRESS <", value, "MAC_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andMAC_ADDRESSLessThanOrEqualTo(String value) {
            addCriterion("MAC_ADDRESS <=", value, "MAC_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andMAC_ADDRESSLike(String value) {
            addCriterion("MAC_ADDRESS like", value, "MAC_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andMAC_ADDRESSNotLike(String value) {
            addCriterion("MAC_ADDRESS not like", value, "MAC_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andMAC_ADDRESSIn(List<String> values) {
            addCriterion("MAC_ADDRESS in", values, "MAC_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andMAC_ADDRESSNotIn(List<String> values) {
            addCriterion("MAC_ADDRESS not in", values, "MAC_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andMAC_ADDRESSBetween(String value1, String value2) {
            addCriterion("MAC_ADDRESS between", value1, value2, "MAC_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andMAC_ADDRESSNotBetween(String value1, String value2) {
            addCriterion("MAC_ADDRESS not between", value1, value2, "MAC_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andREGIONIsNull() {
            addCriterion("REGION is null");
            return (Criteria) this;
        }

        public Criteria andREGIONIsNotNull() {
            addCriterion("REGION is not null");
            return (Criteria) this;
        }

        public Criteria andREGIONEqualTo(String value) {
            addCriterion("REGION =", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONNotEqualTo(String value) {
            addCriterion("REGION <>", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONGreaterThan(String value) {
            addCriterion("REGION >", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONGreaterThanOrEqualTo(String value) {
            addCriterion("REGION >=", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONLessThan(String value) {
            addCriterion("REGION <", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONLessThanOrEqualTo(String value) {
            addCriterion("REGION <=", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONLike(String value) {
            addCriterion("REGION like", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONNotLike(String value) {
            addCriterion("REGION not like", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONIn(List<String> values) {
            addCriterion("REGION in", values, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONNotIn(List<String> values) {
            addCriterion("REGION not in", values, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONBetween(String value1, String value2) {
            addCriterion("REGION between", value1, value2, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONNotBetween(String value1, String value2) {
            addCriterion("REGION not between", value1, value2, "REGION");
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