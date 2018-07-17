package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class ServerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServerExample() {
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

        public Criteria andOSVERSIONIsNull() {
            addCriterion("OSVERSION is null");
            return (Criteria) this;
        }

        public Criteria andOSVERSIONIsNotNull() {
            addCriterion("OSVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andOSVERSIONEqualTo(String value) {
            addCriterion("OSVERSION =", value, "OSVERSION");
            return (Criteria) this;
        }

        public Criteria andOSVERSIONNotEqualTo(String value) {
            addCriterion("OSVERSION <>", value, "OSVERSION");
            return (Criteria) this;
        }

        public Criteria andOSVERSIONGreaterThan(String value) {
            addCriterion("OSVERSION >", value, "OSVERSION");
            return (Criteria) this;
        }

        public Criteria andOSVERSIONGreaterThanOrEqualTo(String value) {
            addCriterion("OSVERSION >=", value, "OSVERSION");
            return (Criteria) this;
        }

        public Criteria andOSVERSIONLessThan(String value) {
            addCriterion("OSVERSION <", value, "OSVERSION");
            return (Criteria) this;
        }

        public Criteria andOSVERSIONLessThanOrEqualTo(String value) {
            addCriterion("OSVERSION <=", value, "OSVERSION");
            return (Criteria) this;
        }

        public Criteria andOSVERSIONLike(String value) {
            addCriterion("OSVERSION like", value, "OSVERSION");
            return (Criteria) this;
        }

        public Criteria andOSVERSIONNotLike(String value) {
            addCriterion("OSVERSION not like", value, "OSVERSION");
            return (Criteria) this;
        }

        public Criteria andOSVERSIONIn(List<String> values) {
            addCriterion("OSVERSION in", values, "OSVERSION");
            return (Criteria) this;
        }

        public Criteria andOSVERSIONNotIn(List<String> values) {
            addCriterion("OSVERSION not in", values, "OSVERSION");
            return (Criteria) this;
        }

        public Criteria andOSVERSIONBetween(String value1, String value2) {
            addCriterion("OSVERSION between", value1, value2, "OSVERSION");
            return (Criteria) this;
        }

        public Criteria andOSVERSIONNotBetween(String value1, String value2) {
            addCriterion("OSVERSION not between", value1, value2, "OSVERSION");
            return (Criteria) this;
        }

        public Criteria andCOMPUTERNAMEIsNull() {
            addCriterion("COMPUTERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCOMPUTERNAMEIsNotNull() {
            addCriterion("COMPUTERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCOMPUTERNAMEEqualTo(String value) {
            addCriterion("COMPUTERNAME =", value, "COMPUTERNAME");
            return (Criteria) this;
        }

        public Criteria andCOMPUTERNAMENotEqualTo(String value) {
            addCriterion("COMPUTERNAME <>", value, "COMPUTERNAME");
            return (Criteria) this;
        }

        public Criteria andCOMPUTERNAMEGreaterThan(String value) {
            addCriterion("COMPUTERNAME >", value, "COMPUTERNAME");
            return (Criteria) this;
        }

        public Criteria andCOMPUTERNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("COMPUTERNAME >=", value, "COMPUTERNAME");
            return (Criteria) this;
        }

        public Criteria andCOMPUTERNAMELessThan(String value) {
            addCriterion("COMPUTERNAME <", value, "COMPUTERNAME");
            return (Criteria) this;
        }

        public Criteria andCOMPUTERNAMELessThanOrEqualTo(String value) {
            addCriterion("COMPUTERNAME <=", value, "COMPUTERNAME");
            return (Criteria) this;
        }

        public Criteria andCOMPUTERNAMELike(String value) {
            addCriterion("COMPUTERNAME like", value, "COMPUTERNAME");
            return (Criteria) this;
        }

        public Criteria andCOMPUTERNAMENotLike(String value) {
            addCriterion("COMPUTERNAME not like", value, "COMPUTERNAME");
            return (Criteria) this;
        }

        public Criteria andCOMPUTERNAMEIn(List<String> values) {
            addCriterion("COMPUTERNAME in", values, "COMPUTERNAME");
            return (Criteria) this;
        }

        public Criteria andCOMPUTERNAMENotIn(List<String> values) {
            addCriterion("COMPUTERNAME not in", values, "COMPUTERNAME");
            return (Criteria) this;
        }

        public Criteria andCOMPUTERNAMEBetween(String value1, String value2) {
            addCriterion("COMPUTERNAME between", value1, value2, "COMPUTERNAME");
            return (Criteria) this;
        }

        public Criteria andCOMPUTERNAMENotBetween(String value1, String value2) {
            addCriterion("COMPUTERNAME not between", value1, value2, "COMPUTERNAME");
            return (Criteria) this;
        }

        public Criteria andPCIIsNull() {
            addCriterion("PCI is null");
            return (Criteria) this;
        }

        public Criteria andPCIIsNotNull() {
            addCriterion("PCI is not null");
            return (Criteria) this;
        }

        public Criteria andPCIEqualTo(String value) {
            addCriterion("PCI =", value, "PCI");
            return (Criteria) this;
        }

        public Criteria andPCINotEqualTo(String value) {
            addCriterion("PCI <>", value, "PCI");
            return (Criteria) this;
        }

        public Criteria andPCIGreaterThan(String value) {
            addCriterion("PCI >", value, "PCI");
            return (Criteria) this;
        }

        public Criteria andPCIGreaterThanOrEqualTo(String value) {
            addCriterion("PCI >=", value, "PCI");
            return (Criteria) this;
        }

        public Criteria andPCILessThan(String value) {
            addCriterion("PCI <", value, "PCI");
            return (Criteria) this;
        }

        public Criteria andPCILessThanOrEqualTo(String value) {
            addCriterion("PCI <=", value, "PCI");
            return (Criteria) this;
        }

        public Criteria andPCILike(String value) {
            addCriterion("PCI like", value, "PCI");
            return (Criteria) this;
        }

        public Criteria andPCINotLike(String value) {
            addCriterion("PCI not like", value, "PCI");
            return (Criteria) this;
        }

        public Criteria andPCIIn(List<String> values) {
            addCriterion("PCI in", values, "PCI");
            return (Criteria) this;
        }

        public Criteria andPCINotIn(List<String> values) {
            addCriterion("PCI not in", values, "PCI");
            return (Criteria) this;
        }

        public Criteria andPCIBetween(String value1, String value2) {
            addCriterion("PCI between", value1, value2, "PCI");
            return (Criteria) this;
        }

        public Criteria andPCINotBetween(String value1, String value2) {
            addCriterion("PCI not between", value1, value2, "PCI");
            return (Criteria) this;
        }

        public Criteria andUSBIsNull() {
            addCriterion("USB is null");
            return (Criteria) this;
        }

        public Criteria andUSBIsNotNull() {
            addCriterion("USB is not null");
            return (Criteria) this;
        }

        public Criteria andUSBEqualTo(String value) {
            addCriterion("USB =", value, "USB");
            return (Criteria) this;
        }

        public Criteria andUSBNotEqualTo(String value) {
            addCriterion("USB <>", value, "USB");
            return (Criteria) this;
        }

        public Criteria andUSBGreaterThan(String value) {
            addCriterion("USB >", value, "USB");
            return (Criteria) this;
        }

        public Criteria andUSBGreaterThanOrEqualTo(String value) {
            addCriterion("USB >=", value, "USB");
            return (Criteria) this;
        }

        public Criteria andUSBLessThan(String value) {
            addCriterion("USB <", value, "USB");
            return (Criteria) this;
        }

        public Criteria andUSBLessThanOrEqualTo(String value) {
            addCriterion("USB <=", value, "USB");
            return (Criteria) this;
        }

        public Criteria andUSBLike(String value) {
            addCriterion("USB like", value, "USB");
            return (Criteria) this;
        }

        public Criteria andUSBNotLike(String value) {
            addCriterion("USB not like", value, "USB");
            return (Criteria) this;
        }

        public Criteria andUSBIn(List<String> values) {
            addCriterion("USB in", values, "USB");
            return (Criteria) this;
        }

        public Criteria andUSBNotIn(List<String> values) {
            addCriterion("USB not in", values, "USB");
            return (Criteria) this;
        }

        public Criteria andUSBBetween(String value1, String value2) {
            addCriterion("USB between", value1, value2, "USB");
            return (Criteria) this;
        }

        public Criteria andUSBNotBetween(String value1, String value2) {
            addCriterion("USB not between", value1, value2, "USB");
            return (Criteria) this;
        }

        public Criteria andPATHIsNull() {
            addCriterion("PATH is null");
            return (Criteria) this;
        }

        public Criteria andPATHIsNotNull() {
            addCriterion("PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPATHEqualTo(String value) {
            addCriterion("PATH =", value, "PATH");
            return (Criteria) this;
        }

        public Criteria andPATHNotEqualTo(String value) {
            addCriterion("PATH <>", value, "PATH");
            return (Criteria) this;
        }

        public Criteria andPATHGreaterThan(String value) {
            addCriterion("PATH >", value, "PATH");
            return (Criteria) this;
        }

        public Criteria andPATHGreaterThanOrEqualTo(String value) {
            addCriterion("PATH >=", value, "PATH");
            return (Criteria) this;
        }

        public Criteria andPATHLessThan(String value) {
            addCriterion("PATH <", value, "PATH");
            return (Criteria) this;
        }

        public Criteria andPATHLessThanOrEqualTo(String value) {
            addCriterion("PATH <=", value, "PATH");
            return (Criteria) this;
        }

        public Criteria andPATHLike(String value) {
            addCriterion("PATH like", value, "PATH");
            return (Criteria) this;
        }

        public Criteria andPATHNotLike(String value) {
            addCriterion("PATH not like", value, "PATH");
            return (Criteria) this;
        }

        public Criteria andPATHIn(List<String> values) {
            addCriterion("PATH in", values, "PATH");
            return (Criteria) this;
        }

        public Criteria andPATHNotIn(List<String> values) {
            addCriterion("PATH not in", values, "PATH");
            return (Criteria) this;
        }

        public Criteria andPATHBetween(String value1, String value2) {
            addCriterion("PATH between", value1, value2, "PATH");
            return (Criteria) this;
        }

        public Criteria andPATHNotBetween(String value1, String value2) {
            addCriterion("PATH not between", value1, value2, "PATH");
            return (Criteria) this;
        }

        public Criteria andRAM_EXCHANGEAREAUSEIsNull() {
            addCriterion("RAM_EXCHANGEAREAUSE is null");
            return (Criteria) this;
        }

        public Criteria andRAM_EXCHANGEAREAUSEIsNotNull() {
            addCriterion("RAM_EXCHANGEAREAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andRAM_EXCHANGEAREAUSEEqualTo(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE =", value, "RAM_EXCHANGEAREAUSE");
            return (Criteria) this;
        }

        public Criteria andRAM_EXCHANGEAREAUSENotEqualTo(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE <>", value, "RAM_EXCHANGEAREAUSE");
            return (Criteria) this;
        }

        public Criteria andRAM_EXCHANGEAREAUSEGreaterThan(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE >", value, "RAM_EXCHANGEAREAUSE");
            return (Criteria) this;
        }

        public Criteria andRAM_EXCHANGEAREAUSEGreaterThanOrEqualTo(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE >=", value, "RAM_EXCHANGEAREAUSE");
            return (Criteria) this;
        }

        public Criteria andRAM_EXCHANGEAREAUSELessThan(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE <", value, "RAM_EXCHANGEAREAUSE");
            return (Criteria) this;
        }

        public Criteria andRAM_EXCHANGEAREAUSELessThanOrEqualTo(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE <=", value, "RAM_EXCHANGEAREAUSE");
            return (Criteria) this;
        }

        public Criteria andRAM_EXCHANGEAREAUSELike(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE like", value, "RAM_EXCHANGEAREAUSE");
            return (Criteria) this;
        }

        public Criteria andRAM_EXCHANGEAREAUSENotLike(String value) {
            addCriterion("RAM_EXCHANGEAREAUSE not like", value, "RAM_EXCHANGEAREAUSE");
            return (Criteria) this;
        }

        public Criteria andRAM_EXCHANGEAREAUSEIn(List<String> values) {
            addCriterion("RAM_EXCHANGEAREAUSE in", values, "RAM_EXCHANGEAREAUSE");
            return (Criteria) this;
        }

        public Criteria andRAM_EXCHANGEAREAUSENotIn(List<String> values) {
            addCriterion("RAM_EXCHANGEAREAUSE not in", values, "RAM_EXCHANGEAREAUSE");
            return (Criteria) this;
        }

        public Criteria andRAM_EXCHANGEAREAUSEBetween(String value1, String value2) {
            addCriterion("RAM_EXCHANGEAREAUSE between", value1, value2, "RAM_EXCHANGEAREAUSE");
            return (Criteria) this;
        }

        public Criteria andRAM_EXCHANGEAREAUSENotBetween(String value1, String value2) {
            addCriterion("RAM_EXCHANGEAREAUSE not between", value1, value2, "RAM_EXCHANGEAREAUSE");
            return (Criteria) this;
        }

        public Criteria andPARTATIONUSEIsNull() {
            addCriterion("PARTATIONUSE is null");
            return (Criteria) this;
        }

        public Criteria andPARTATIONUSEIsNotNull() {
            addCriterion("PARTATIONUSE is not null");
            return (Criteria) this;
        }

        public Criteria andPARTATIONUSEEqualTo(String value) {
            addCriterion("PARTATIONUSE =", value, "PARTATIONUSE");
            return (Criteria) this;
        }

        public Criteria andPARTATIONUSENotEqualTo(String value) {
            addCriterion("PARTATIONUSE <>", value, "PARTATIONUSE");
            return (Criteria) this;
        }

        public Criteria andPARTATIONUSEGreaterThan(String value) {
            addCriterion("PARTATIONUSE >", value, "PARTATIONUSE");
            return (Criteria) this;
        }

        public Criteria andPARTATIONUSEGreaterThanOrEqualTo(String value) {
            addCriterion("PARTATIONUSE >=", value, "PARTATIONUSE");
            return (Criteria) this;
        }

        public Criteria andPARTATIONUSELessThan(String value) {
            addCriterion("PARTATIONUSE <", value, "PARTATIONUSE");
            return (Criteria) this;
        }

        public Criteria andPARTATIONUSELessThanOrEqualTo(String value) {
            addCriterion("PARTATIONUSE <=", value, "PARTATIONUSE");
            return (Criteria) this;
        }

        public Criteria andPARTATIONUSELike(String value) {
            addCriterion("PARTATIONUSE like", value, "PARTATIONUSE");
            return (Criteria) this;
        }

        public Criteria andPARTATIONUSENotLike(String value) {
            addCriterion("PARTATIONUSE not like", value, "PARTATIONUSE");
            return (Criteria) this;
        }

        public Criteria andPARTATIONUSEIn(List<String> values) {
            addCriterion("PARTATIONUSE in", values, "PARTATIONUSE");
            return (Criteria) this;
        }

        public Criteria andPARTATIONUSENotIn(List<String> values) {
            addCriterion("PARTATIONUSE not in", values, "PARTATIONUSE");
            return (Criteria) this;
        }

        public Criteria andPARTATIONUSEBetween(String value1, String value2) {
            addCriterion("PARTATIONUSE between", value1, value2, "PARTATIONUSE");
            return (Criteria) this;
        }

        public Criteria andPARTATIONUSENotBetween(String value1, String value2) {
            addCriterion("PARTATIONUSE not between", value1, value2, "PARTATIONUSE");
            return (Criteria) this;
        }

        public Criteria andIDLERAMIsNull() {
            addCriterion("IDLERAM is null");
            return (Criteria) this;
        }

        public Criteria andIDLERAMIsNotNull() {
            addCriterion("IDLERAM is not null");
            return (Criteria) this;
        }

        public Criteria andIDLERAMEqualTo(String value) {
            addCriterion("IDLERAM =", value, "IDLERAM");
            return (Criteria) this;
        }

        public Criteria andIDLERAMNotEqualTo(String value) {
            addCriterion("IDLERAM <>", value, "IDLERAM");
            return (Criteria) this;
        }

        public Criteria andIDLERAMGreaterThan(String value) {
            addCriterion("IDLERAM >", value, "IDLERAM");
            return (Criteria) this;
        }

        public Criteria andIDLERAMGreaterThanOrEqualTo(String value) {
            addCriterion("IDLERAM >=", value, "IDLERAM");
            return (Criteria) this;
        }

        public Criteria andIDLERAMLessThan(String value) {
            addCriterion("IDLERAM <", value, "IDLERAM");
            return (Criteria) this;
        }

        public Criteria andIDLERAMLessThanOrEqualTo(String value) {
            addCriterion("IDLERAM <=", value, "IDLERAM");
            return (Criteria) this;
        }

        public Criteria andIDLERAMLike(String value) {
            addCriterion("IDLERAM like", value, "IDLERAM");
            return (Criteria) this;
        }

        public Criteria andIDLERAMNotLike(String value) {
            addCriterion("IDLERAM not like", value, "IDLERAM");
            return (Criteria) this;
        }

        public Criteria andIDLERAMIn(List<String> values) {
            addCriterion("IDLERAM in", values, "IDLERAM");
            return (Criteria) this;
        }

        public Criteria andIDLERAMNotIn(List<String> values) {
            addCriterion("IDLERAM not in", values, "IDLERAM");
            return (Criteria) this;
        }

        public Criteria andIDLERAMBetween(String value1, String value2) {
            addCriterion("IDLERAM between", value1, value2, "IDLERAM");
            return (Criteria) this;
        }

        public Criteria andIDLERAMNotBetween(String value1, String value2) {
            addCriterion("IDLERAM not between", value1, value2, "IDLERAM");
            return (Criteria) this;
        }

        public Criteria andOS_TIME_USERNUM_LOADIsNull() {
            addCriterion("OS_TIME_USERNUM_LOAD is null");
            return (Criteria) this;
        }

        public Criteria andOS_TIME_USERNUM_LOADIsNotNull() {
            addCriterion("OS_TIME_USERNUM_LOAD is not null");
            return (Criteria) this;
        }

        public Criteria andOS_TIME_USERNUM_LOADEqualTo(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD =", value, "OS_TIME_USERNUM_LOAD");
            return (Criteria) this;
        }

        public Criteria andOS_TIME_USERNUM_LOADNotEqualTo(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD <>", value, "OS_TIME_USERNUM_LOAD");
            return (Criteria) this;
        }

        public Criteria andOS_TIME_USERNUM_LOADGreaterThan(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD >", value, "OS_TIME_USERNUM_LOAD");
            return (Criteria) this;
        }

        public Criteria andOS_TIME_USERNUM_LOADGreaterThanOrEqualTo(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD >=", value, "OS_TIME_USERNUM_LOAD");
            return (Criteria) this;
        }

        public Criteria andOS_TIME_USERNUM_LOADLessThan(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD <", value, "OS_TIME_USERNUM_LOAD");
            return (Criteria) this;
        }

        public Criteria andOS_TIME_USERNUM_LOADLessThanOrEqualTo(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD <=", value, "OS_TIME_USERNUM_LOAD");
            return (Criteria) this;
        }

        public Criteria andOS_TIME_USERNUM_LOADLike(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD like", value, "OS_TIME_USERNUM_LOAD");
            return (Criteria) this;
        }

        public Criteria andOS_TIME_USERNUM_LOADNotLike(String value) {
            addCriterion("OS_TIME_USERNUM_LOAD not like", value, "OS_TIME_USERNUM_LOAD");
            return (Criteria) this;
        }

        public Criteria andOS_TIME_USERNUM_LOADIn(List<String> values) {
            addCriterion("OS_TIME_USERNUM_LOAD in", values, "OS_TIME_USERNUM_LOAD");
            return (Criteria) this;
        }

        public Criteria andOS_TIME_USERNUM_LOADNotIn(List<String> values) {
            addCriterion("OS_TIME_USERNUM_LOAD not in", values, "OS_TIME_USERNUM_LOAD");
            return (Criteria) this;
        }

        public Criteria andOS_TIME_USERNUM_LOADBetween(String value1, String value2) {
            addCriterion("OS_TIME_USERNUM_LOAD between", value1, value2, "OS_TIME_USERNUM_LOAD");
            return (Criteria) this;
        }

        public Criteria andOS_TIME_USERNUM_LOADNotBetween(String value1, String value2) {
            addCriterion("OS_TIME_USERNUM_LOAD not between", value1, value2, "OS_TIME_USERNUM_LOAD");
            return (Criteria) this;
        }

        public Criteria andOSLOADIsNull() {
            addCriterion("OSLOAD is null");
            return (Criteria) this;
        }

        public Criteria andOSLOADIsNotNull() {
            addCriterion("OSLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andOSLOADEqualTo(String value) {
            addCriterion("OSLOAD =", value, "OSLOAD");
            return (Criteria) this;
        }

        public Criteria andOSLOADNotEqualTo(String value) {
            addCriterion("OSLOAD <>", value, "OSLOAD");
            return (Criteria) this;
        }

        public Criteria andOSLOADGreaterThan(String value) {
            addCriterion("OSLOAD >", value, "OSLOAD");
            return (Criteria) this;
        }

        public Criteria andOSLOADGreaterThanOrEqualTo(String value) {
            addCriterion("OSLOAD >=", value, "OSLOAD");
            return (Criteria) this;
        }

        public Criteria andOSLOADLessThan(String value) {
            addCriterion("OSLOAD <", value, "OSLOAD");
            return (Criteria) this;
        }

        public Criteria andOSLOADLessThanOrEqualTo(String value) {
            addCriterion("OSLOAD <=", value, "OSLOAD");
            return (Criteria) this;
        }

        public Criteria andOSLOADLike(String value) {
            addCriterion("OSLOAD like", value, "OSLOAD");
            return (Criteria) this;
        }

        public Criteria andOSLOADNotLike(String value) {
            addCriterion("OSLOAD not like", value, "OSLOAD");
            return (Criteria) this;
        }

        public Criteria andOSLOADIn(List<String> values) {
            addCriterion("OSLOAD in", values, "OSLOAD");
            return (Criteria) this;
        }

        public Criteria andOSLOADNotIn(List<String> values) {
            addCriterion("OSLOAD not in", values, "OSLOAD");
            return (Criteria) this;
        }

        public Criteria andOSLOADBetween(String value1, String value2) {
            addCriterion("OSLOAD between", value1, value2, "OSLOAD");
            return (Criteria) this;
        }

        public Criteria andOSLOADNotBetween(String value1, String value2) {
            addCriterion("OSLOAD not between", value1, value2, "OSLOAD");
            return (Criteria) this;
        }

        public Criteria andFIREWALLIsNull() {
            addCriterion("FIREWALL is null");
            return (Criteria) this;
        }

        public Criteria andFIREWALLIsNotNull() {
            addCriterion("FIREWALL is not null");
            return (Criteria) this;
        }

        public Criteria andFIREWALLEqualTo(String value) {
            addCriterion("FIREWALL =", value, "FIREWALL");
            return (Criteria) this;
        }

        public Criteria andFIREWALLNotEqualTo(String value) {
            addCriterion("FIREWALL <>", value, "FIREWALL");
            return (Criteria) this;
        }

        public Criteria andFIREWALLGreaterThan(String value) {
            addCriterion("FIREWALL >", value, "FIREWALL");
            return (Criteria) this;
        }

        public Criteria andFIREWALLGreaterThanOrEqualTo(String value) {
            addCriterion("FIREWALL >=", value, "FIREWALL");
            return (Criteria) this;
        }

        public Criteria andFIREWALLLessThan(String value) {
            addCriterion("FIREWALL <", value, "FIREWALL");
            return (Criteria) this;
        }

        public Criteria andFIREWALLLessThanOrEqualTo(String value) {
            addCriterion("FIREWALL <=", value, "FIREWALL");
            return (Criteria) this;
        }

        public Criteria andFIREWALLLike(String value) {
            addCriterion("FIREWALL like", value, "FIREWALL");
            return (Criteria) this;
        }

        public Criteria andFIREWALLNotLike(String value) {
            addCriterion("FIREWALL not like", value, "FIREWALL");
            return (Criteria) this;
        }

        public Criteria andFIREWALLIn(List<String> values) {
            addCriterion("FIREWALL in", values, "FIREWALL");
            return (Criteria) this;
        }

        public Criteria andFIREWALLNotIn(List<String> values) {
            addCriterion("FIREWALL not in", values, "FIREWALL");
            return (Criteria) this;
        }

        public Criteria andFIREWALLBetween(String value1, String value2) {
            addCriterion("FIREWALL between", value1, value2, "FIREWALL");
            return (Criteria) this;
        }

        public Criteria andFIREWALLNotBetween(String value1, String value2) {
            addCriterion("FIREWALL not between", value1, value2, "FIREWALL");
            return (Criteria) this;
        }

        public Criteria andROUTINGTABLEIsNull() {
            addCriterion("ROUTINGTABLE is null");
            return (Criteria) this;
        }

        public Criteria andROUTINGTABLEIsNotNull() {
            addCriterion("ROUTINGTABLE is not null");
            return (Criteria) this;
        }

        public Criteria andROUTINGTABLEEqualTo(String value) {
            addCriterion("ROUTINGTABLE =", value, "ROUTINGTABLE");
            return (Criteria) this;
        }

        public Criteria andROUTINGTABLENotEqualTo(String value) {
            addCriterion("ROUTINGTABLE <>", value, "ROUTINGTABLE");
            return (Criteria) this;
        }

        public Criteria andROUTINGTABLEGreaterThan(String value) {
            addCriterion("ROUTINGTABLE >", value, "ROUTINGTABLE");
            return (Criteria) this;
        }

        public Criteria andROUTINGTABLEGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTINGTABLE >=", value, "ROUTINGTABLE");
            return (Criteria) this;
        }

        public Criteria andROUTINGTABLELessThan(String value) {
            addCriterion("ROUTINGTABLE <", value, "ROUTINGTABLE");
            return (Criteria) this;
        }

        public Criteria andROUTINGTABLELessThanOrEqualTo(String value) {
            addCriterion("ROUTINGTABLE <=", value, "ROUTINGTABLE");
            return (Criteria) this;
        }

        public Criteria andROUTINGTABLELike(String value) {
            addCriterion("ROUTINGTABLE like", value, "ROUTINGTABLE");
            return (Criteria) this;
        }

        public Criteria andROUTINGTABLENotLike(String value) {
            addCriterion("ROUTINGTABLE not like", value, "ROUTINGTABLE");
            return (Criteria) this;
        }

        public Criteria andROUTINGTABLEIn(List<String> values) {
            addCriterion("ROUTINGTABLE in", values, "ROUTINGTABLE");
            return (Criteria) this;
        }

        public Criteria andROUTINGTABLENotIn(List<String> values) {
            addCriterion("ROUTINGTABLE not in", values, "ROUTINGTABLE");
            return (Criteria) this;
        }

        public Criteria andROUTINGTABLEBetween(String value1, String value2) {
            addCriterion("ROUTINGTABLE between", value1, value2, "ROUTINGTABLE");
            return (Criteria) this;
        }

        public Criteria andROUTINGTABLENotBetween(String value1, String value2) {
            addCriterion("ROUTINGTABLE not between", value1, value2, "ROUTINGTABLE");
            return (Criteria) this;
        }

        public Criteria andHASCONTACTIsNull() {
            addCriterion("HASCONTACT is null");
            return (Criteria) this;
        }

        public Criteria andHASCONTACTIsNotNull() {
            addCriterion("HASCONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andHASCONTACTEqualTo(String value) {
            addCriterion("HASCONTACT =", value, "HASCONTACT");
            return (Criteria) this;
        }

        public Criteria andHASCONTACTNotEqualTo(String value) {
            addCriterion("HASCONTACT <>", value, "HASCONTACT");
            return (Criteria) this;
        }

        public Criteria andHASCONTACTGreaterThan(String value) {
            addCriterion("HASCONTACT >", value, "HASCONTACT");
            return (Criteria) this;
        }

        public Criteria andHASCONTACTGreaterThanOrEqualTo(String value) {
            addCriterion("HASCONTACT >=", value, "HASCONTACT");
            return (Criteria) this;
        }

        public Criteria andHASCONTACTLessThan(String value) {
            addCriterion("HASCONTACT <", value, "HASCONTACT");
            return (Criteria) this;
        }

        public Criteria andHASCONTACTLessThanOrEqualTo(String value) {
            addCriterion("HASCONTACT <=", value, "HASCONTACT");
            return (Criteria) this;
        }

        public Criteria andHASCONTACTLike(String value) {
            addCriterion("HASCONTACT like", value, "HASCONTACT");
            return (Criteria) this;
        }

        public Criteria andHASCONTACTNotLike(String value) {
            addCriterion("HASCONTACT not like", value, "HASCONTACT");
            return (Criteria) this;
        }

        public Criteria andHASCONTACTIn(List<String> values) {
            addCriterion("HASCONTACT in", values, "HASCONTACT");
            return (Criteria) this;
        }

        public Criteria andHASCONTACTNotIn(List<String> values) {
            addCriterion("HASCONTACT not in", values, "HASCONTACT");
            return (Criteria) this;
        }

        public Criteria andHASCONTACTBetween(String value1, String value2) {
            addCriterion("HASCONTACT between", value1, value2, "HASCONTACT");
            return (Criteria) this;
        }

        public Criteria andHASCONTACTNotBetween(String value1, String value2) {
            addCriterion("HASCONTACT not between", value1, value2, "HASCONTACT");
            return (Criteria) this;
        }

        public Criteria andNETWORKIsNull() {
            addCriterion("NETWORK is null");
            return (Criteria) this;
        }

        public Criteria andNETWORKIsNotNull() {
            addCriterion("NETWORK is not null");
            return (Criteria) this;
        }

        public Criteria andNETWORKEqualTo(String value) {
            addCriterion("NETWORK =", value, "NETWORK");
            return (Criteria) this;
        }

        public Criteria andNETWORKNotEqualTo(String value) {
            addCriterion("NETWORK <>", value, "NETWORK");
            return (Criteria) this;
        }

        public Criteria andNETWORKGreaterThan(String value) {
            addCriterion("NETWORK >", value, "NETWORK");
            return (Criteria) this;
        }

        public Criteria andNETWORKGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORK >=", value, "NETWORK");
            return (Criteria) this;
        }

        public Criteria andNETWORKLessThan(String value) {
            addCriterion("NETWORK <", value, "NETWORK");
            return (Criteria) this;
        }

        public Criteria andNETWORKLessThanOrEqualTo(String value) {
            addCriterion("NETWORK <=", value, "NETWORK");
            return (Criteria) this;
        }

        public Criteria andNETWORKLike(String value) {
            addCriterion("NETWORK like", value, "NETWORK");
            return (Criteria) this;
        }

        public Criteria andNETWORKNotLike(String value) {
            addCriterion("NETWORK not like", value, "NETWORK");
            return (Criteria) this;
        }

        public Criteria andNETWORKIn(List<String> values) {
            addCriterion("NETWORK in", values, "NETWORK");
            return (Criteria) this;
        }

        public Criteria andNETWORKNotIn(List<String> values) {
            addCriterion("NETWORK not in", values, "NETWORK");
            return (Criteria) this;
        }

        public Criteria andNETWORKBetween(String value1, String value2) {
            addCriterion("NETWORK between", value1, value2, "NETWORK");
            return (Criteria) this;
        }

        public Criteria andNETWORKNotBetween(String value1, String value2) {
            addCriterion("NETWORK not between", value1, value2, "NETWORK");
            return (Criteria) this;
        }

        public Criteria andPROCESSIsNull() {
            addCriterion("PROCESS is null");
            return (Criteria) this;
        }

        public Criteria andPROCESSIsNotNull() {
            addCriterion("PROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andPROCESSEqualTo(String value) {
            addCriterion("PROCESS =", value, "PROCESS");
            return (Criteria) this;
        }

        public Criteria andPROCESSNotEqualTo(String value) {
            addCriterion("PROCESS <>", value, "PROCESS");
            return (Criteria) this;
        }

        public Criteria andPROCESSGreaterThan(String value) {
            addCriterion("PROCESS >", value, "PROCESS");
            return (Criteria) this;
        }

        public Criteria andPROCESSGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS >=", value, "PROCESS");
            return (Criteria) this;
        }

        public Criteria andPROCESSLessThan(String value) {
            addCriterion("PROCESS <", value, "PROCESS");
            return (Criteria) this;
        }

        public Criteria andPROCESSLessThanOrEqualTo(String value) {
            addCriterion("PROCESS <=", value, "PROCESS");
            return (Criteria) this;
        }

        public Criteria andPROCESSLike(String value) {
            addCriterion("PROCESS like", value, "PROCESS");
            return (Criteria) this;
        }

        public Criteria andPROCESSNotLike(String value) {
            addCriterion("PROCESS not like", value, "PROCESS");
            return (Criteria) this;
        }

        public Criteria andPROCESSIn(List<String> values) {
            addCriterion("PROCESS in", values, "PROCESS");
            return (Criteria) this;
        }

        public Criteria andPROCESSNotIn(List<String> values) {
            addCriterion("PROCESS not in", values, "PROCESS");
            return (Criteria) this;
        }

        public Criteria andPROCESSBetween(String value1, String value2) {
            addCriterion("PROCESS between", value1, value2, "PROCESS");
            return (Criteria) this;
        }

        public Criteria andPROCESSNotBetween(String value1, String value2) {
            addCriterion("PROCESS not between", value1, value2, "PROCESS");
            return (Criteria) this;
        }

        public Criteria andREALTIMEPROCESSIsNull() {
            addCriterion("REALTIMEPROCESS is null");
            return (Criteria) this;
        }

        public Criteria andREALTIMEPROCESSIsNotNull() {
            addCriterion("REALTIMEPROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andREALTIMEPROCESSEqualTo(String value) {
            addCriterion("REALTIMEPROCESS =", value, "REALTIMEPROCESS");
            return (Criteria) this;
        }

        public Criteria andREALTIMEPROCESSNotEqualTo(String value) {
            addCriterion("REALTIMEPROCESS <>", value, "REALTIMEPROCESS");
            return (Criteria) this;
        }

        public Criteria andREALTIMEPROCESSGreaterThan(String value) {
            addCriterion("REALTIMEPROCESS >", value, "REALTIMEPROCESS");
            return (Criteria) this;
        }

        public Criteria andREALTIMEPROCESSGreaterThanOrEqualTo(String value) {
            addCriterion("REALTIMEPROCESS >=", value, "REALTIMEPROCESS");
            return (Criteria) this;
        }

        public Criteria andREALTIMEPROCESSLessThan(String value) {
            addCriterion("REALTIMEPROCESS <", value, "REALTIMEPROCESS");
            return (Criteria) this;
        }

        public Criteria andREALTIMEPROCESSLessThanOrEqualTo(String value) {
            addCriterion("REALTIMEPROCESS <=", value, "REALTIMEPROCESS");
            return (Criteria) this;
        }

        public Criteria andREALTIMEPROCESSLike(String value) {
            addCriterion("REALTIMEPROCESS like", value, "REALTIMEPROCESS");
            return (Criteria) this;
        }

        public Criteria andREALTIMEPROCESSNotLike(String value) {
            addCriterion("REALTIMEPROCESS not like", value, "REALTIMEPROCESS");
            return (Criteria) this;
        }

        public Criteria andREALTIMEPROCESSIn(List<String> values) {
            addCriterion("REALTIMEPROCESS in", values, "REALTIMEPROCESS");
            return (Criteria) this;
        }

        public Criteria andREALTIMEPROCESSNotIn(List<String> values) {
            addCriterion("REALTIMEPROCESS not in", values, "REALTIMEPROCESS");
            return (Criteria) this;
        }

        public Criteria andREALTIMEPROCESSBetween(String value1, String value2) {
            addCriterion("REALTIMEPROCESS between", value1, value2, "REALTIMEPROCESS");
            return (Criteria) this;
        }

        public Criteria andREALTIMEPROCESSNotBetween(String value1, String value2) {
            addCriterion("REALTIMEPROCESS not between", value1, value2, "REALTIMEPROCESS");
            return (Criteria) this;
        }

        public Criteria andACTIVEUSERIsNull() {
            addCriterion("ACTIVEUSER is null");
            return (Criteria) this;
        }

        public Criteria andACTIVEUSERIsNotNull() {
            addCriterion("ACTIVEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andACTIVEUSEREqualTo(String value) {
            addCriterion("ACTIVEUSER =", value, "ACTIVEUSER");
            return (Criteria) this;
        }

        public Criteria andACTIVEUSERNotEqualTo(String value) {
            addCriterion("ACTIVEUSER <>", value, "ACTIVEUSER");
            return (Criteria) this;
        }

        public Criteria andACTIVEUSERGreaterThan(String value) {
            addCriterion("ACTIVEUSER >", value, "ACTIVEUSER");
            return (Criteria) this;
        }

        public Criteria andACTIVEUSERGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVEUSER >=", value, "ACTIVEUSER");
            return (Criteria) this;
        }

        public Criteria andACTIVEUSERLessThan(String value) {
            addCriterion("ACTIVEUSER <", value, "ACTIVEUSER");
            return (Criteria) this;
        }

        public Criteria andACTIVEUSERLessThanOrEqualTo(String value) {
            addCriterion("ACTIVEUSER <=", value, "ACTIVEUSER");
            return (Criteria) this;
        }

        public Criteria andACTIVEUSERLike(String value) {
            addCriterion("ACTIVEUSER like", value, "ACTIVEUSER");
            return (Criteria) this;
        }

        public Criteria andACTIVEUSERNotLike(String value) {
            addCriterion("ACTIVEUSER not like", value, "ACTIVEUSER");
            return (Criteria) this;
        }

        public Criteria andACTIVEUSERIn(List<String> values) {
            addCriterion("ACTIVEUSER in", values, "ACTIVEUSER");
            return (Criteria) this;
        }

        public Criteria andACTIVEUSERNotIn(List<String> values) {
            addCriterion("ACTIVEUSER not in", values, "ACTIVEUSER");
            return (Criteria) this;
        }

        public Criteria andACTIVEUSERBetween(String value1, String value2) {
            addCriterion("ACTIVEUSER between", value1, value2, "ACTIVEUSER");
            return (Criteria) this;
        }

        public Criteria andACTIVEUSERNotBetween(String value1, String value2) {
            addCriterion("ACTIVEUSER not between", value1, value2, "ACTIVEUSER");
            return (Criteria) this;
        }

        public Criteria andBIOSIsNull() {
            addCriterion("BIOS is null");
            return (Criteria) this;
        }

        public Criteria andBIOSIsNotNull() {
            addCriterion("BIOS is not null");
            return (Criteria) this;
        }

        public Criteria andBIOSEqualTo(String value) {
            addCriterion("BIOS =", value, "BIOS");
            return (Criteria) this;
        }

        public Criteria andBIOSNotEqualTo(String value) {
            addCriterion("BIOS <>", value, "BIOS");
            return (Criteria) this;
        }

        public Criteria andBIOSGreaterThan(String value) {
            addCriterion("BIOS >", value, "BIOS");
            return (Criteria) this;
        }

        public Criteria andBIOSGreaterThanOrEqualTo(String value) {
            addCriterion("BIOS >=", value, "BIOS");
            return (Criteria) this;
        }

        public Criteria andBIOSLessThan(String value) {
            addCriterion("BIOS <", value, "BIOS");
            return (Criteria) this;
        }

        public Criteria andBIOSLessThanOrEqualTo(String value) {
            addCriterion("BIOS <=", value, "BIOS");
            return (Criteria) this;
        }

        public Criteria andBIOSLike(String value) {
            addCriterion("BIOS like", value, "BIOS");
            return (Criteria) this;
        }

        public Criteria andBIOSNotLike(String value) {
            addCriterion("BIOS not like", value, "BIOS");
            return (Criteria) this;
        }

        public Criteria andBIOSIn(List<String> values) {
            addCriterion("BIOS in", values, "BIOS");
            return (Criteria) this;
        }

        public Criteria andBIOSNotIn(List<String> values) {
            addCriterion("BIOS not in", values, "BIOS");
            return (Criteria) this;
        }

        public Criteria andBIOSBetween(String value1, String value2) {
            addCriterion("BIOS between", value1, value2, "BIOS");
            return (Criteria) this;
        }

        public Criteria andBIOSNotBetween(String value1, String value2) {
            addCriterion("BIOS not between", value1, value2, "BIOS");
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