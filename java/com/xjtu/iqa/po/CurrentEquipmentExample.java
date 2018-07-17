package com.xjtu.iqa.po;

import java.util.ArrayList;
import java.util.List;

public class CurrentEquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurrentEquipmentExample() {
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

        public Criteria andMACADDRESSIsNull() {
            addCriterion("MACADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSIsNotNull() {
            addCriterion("MACADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSEqualTo(String value) {
            addCriterion("MACADDRESS =", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSNotEqualTo(String value) {
            addCriterion("MACADDRESS <>", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSGreaterThan(String value) {
            addCriterion("MACADDRESS >", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("MACADDRESS >=", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSLessThan(String value) {
            addCriterion("MACADDRESS <", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSLessThanOrEqualTo(String value) {
            addCriterion("MACADDRESS <=", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSLike(String value) {
            addCriterion("MACADDRESS like", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSNotLike(String value) {
            addCriterion("MACADDRESS not like", value, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSIn(List<String> values) {
            addCriterion("MACADDRESS in", values, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSNotIn(List<String> values) {
            addCriterion("MACADDRESS not in", values, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSBetween(String value1, String value2) {
            addCriterion("MACADDRESS between", value1, value2, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andMACADDRESSNotBetween(String value1, String value2) {
            addCriterion("MACADDRESS not between", value1, value2, "MACADDRESS");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELIsNull() {
            addCriterion("EQUIPMENTMODEL is null");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELIsNotNull() {
            addCriterion("EQUIPMENTMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL =", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELNotEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL <>", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELGreaterThan(String value) {
            addCriterion("EQUIPMENTMODEL >", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL >=", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELLessThan(String value) {
            addCriterion("EQUIPMENTMODEL <", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTMODEL <=", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELLike(String value) {
            addCriterion("EQUIPMENTMODEL like", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELNotLike(String value) {
            addCriterion("EQUIPMENTMODEL not like", value, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELIn(List<String> values) {
            addCriterion("EQUIPMENTMODEL in", values, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELNotIn(List<String> values) {
            addCriterion("EQUIPMENTMODEL not in", values, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELBetween(String value1, String value2) {
            addCriterion("EQUIPMENTMODEL between", value1, value2, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTMODELNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENTMODEL not between", value1, value2, "EQUIPMENTMODEL");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTTIMEIsNull() {
            addCriterion("EQUIPMENTTIME is null");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTTIMEIsNotNull() {
            addCriterion("EQUIPMENTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTTIMEEqualTo(String value) {
            addCriterion("EQUIPMENTTIME =", value, "EQUIPMENTTIME");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTTIMENotEqualTo(String value) {
            addCriterion("EQUIPMENTTIME <>", value, "EQUIPMENTTIME");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTTIMEGreaterThan(String value) {
            addCriterion("EQUIPMENTTIME >", value, "EQUIPMENTTIME");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTTIMEGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTTIME >=", value, "EQUIPMENTTIME");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTTIMELessThan(String value) {
            addCriterion("EQUIPMENTTIME <", value, "EQUIPMENTTIME");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTTIMELessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTTIME <=", value, "EQUIPMENTTIME");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTTIMELike(String value) {
            addCriterion("EQUIPMENTTIME like", value, "EQUIPMENTTIME");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTTIMENotLike(String value) {
            addCriterion("EQUIPMENTTIME not like", value, "EQUIPMENTTIME");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTTIMEIn(List<String> values) {
            addCriterion("EQUIPMENTTIME in", values, "EQUIPMENTTIME");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTTIMENotIn(List<String> values) {
            addCriterion("EQUIPMENTTIME not in", values, "EQUIPMENTTIME");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTTIMEBetween(String value1, String value2) {
            addCriterion("EQUIPMENTTIME between", value1, value2, "EQUIPMENTTIME");
            return (Criteria) this;
        }

        public Criteria andEQUIPMENTTIMENotBetween(String value1, String value2) {
            addCriterion("EQUIPMENTTIME not between", value1, value2, "EQUIPMENTTIME");
            return (Criteria) this;
        }

        public Criteria andIPIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIPIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIPEqualTo(String value) {
            addCriterion("IP =", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotEqualTo(String value) {
            addCriterion("IP <>", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThan(String value) {
            addCriterion("IP >", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThan(String value) {
            addCriterion("IP <", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLike(String value) {
            addCriterion("IP like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotLike(String value) {
            addCriterion("IP not like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPIn(List<String> values) {
            addCriterion("IP in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotIn(List<String> values) {
            addCriterion("IP not in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "IP");
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

        public Criteria andHARDDRIVERIsNull() {
            addCriterion("HARDDRIVER is null");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERIsNotNull() {
            addCriterion("HARDDRIVER is not null");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVEREqualTo(String value) {
            addCriterion("HARDDRIVER =", value, "HARDDRIVER");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERNotEqualTo(String value) {
            addCriterion("HARDDRIVER <>", value, "HARDDRIVER");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERGreaterThan(String value) {
            addCriterion("HARDDRIVER >", value, "HARDDRIVER");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERGreaterThanOrEqualTo(String value) {
            addCriterion("HARDDRIVER >=", value, "HARDDRIVER");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERLessThan(String value) {
            addCriterion("HARDDRIVER <", value, "HARDDRIVER");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERLessThanOrEqualTo(String value) {
            addCriterion("HARDDRIVER <=", value, "HARDDRIVER");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERLike(String value) {
            addCriterion("HARDDRIVER like", value, "HARDDRIVER");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERNotLike(String value) {
            addCriterion("HARDDRIVER not like", value, "HARDDRIVER");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERIn(List<String> values) {
            addCriterion("HARDDRIVER in", values, "HARDDRIVER");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERNotIn(List<String> values) {
            addCriterion("HARDDRIVER not in", values, "HARDDRIVER");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERBetween(String value1, String value2) {
            addCriterion("HARDDRIVER between", value1, value2, "HARDDRIVER");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERNotBetween(String value1, String value2) {
            addCriterion("HARDDRIVER not between", value1, value2, "HARDDRIVER");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERMODELIsNull() {
            addCriterion("HARDDRIVERMODEL is null");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERMODELIsNotNull() {
            addCriterion("HARDDRIVERMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERMODELEqualTo(String value) {
            addCriterion("HARDDRIVERMODEL =", value, "HARDDRIVERMODEL");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERMODELNotEqualTo(String value) {
            addCriterion("HARDDRIVERMODEL <>", value, "HARDDRIVERMODEL");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERMODELGreaterThan(String value) {
            addCriterion("HARDDRIVERMODEL >", value, "HARDDRIVERMODEL");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERMODELGreaterThanOrEqualTo(String value) {
            addCriterion("HARDDRIVERMODEL >=", value, "HARDDRIVERMODEL");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERMODELLessThan(String value) {
            addCriterion("HARDDRIVERMODEL <", value, "HARDDRIVERMODEL");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERMODELLessThanOrEqualTo(String value) {
            addCriterion("HARDDRIVERMODEL <=", value, "HARDDRIVERMODEL");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERMODELLike(String value) {
            addCriterion("HARDDRIVERMODEL like", value, "HARDDRIVERMODEL");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERMODELNotLike(String value) {
            addCriterion("HARDDRIVERMODEL not like", value, "HARDDRIVERMODEL");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERMODELIn(List<String> values) {
            addCriterion("HARDDRIVERMODEL in", values, "HARDDRIVERMODEL");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERMODELNotIn(List<String> values) {
            addCriterion("HARDDRIVERMODEL not in", values, "HARDDRIVERMODEL");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERMODELBetween(String value1, String value2) {
            addCriterion("HARDDRIVERMODEL between", value1, value2, "HARDDRIVERMODEL");
            return (Criteria) this;
        }

        public Criteria andHARDDRIVERMODELNotBetween(String value1, String value2) {
            addCriterion("HARDDRIVERMODEL not between", value1, value2, "HARDDRIVERMODEL");
            return (Criteria) this;
        }

        public Criteria andSTORAGEIsNull() {
            addCriterion("STORAGE is null");
            return (Criteria) this;
        }

        public Criteria andSTORAGEIsNotNull() {
            addCriterion("STORAGE is not null");
            return (Criteria) this;
        }

        public Criteria andSTORAGEEqualTo(String value) {
            addCriterion("STORAGE =", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGENotEqualTo(String value) {
            addCriterion("STORAGE <>", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGEGreaterThan(String value) {
            addCriterion("STORAGE >", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGEGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE >=", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGELessThan(String value) {
            addCriterion("STORAGE <", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGELessThanOrEqualTo(String value) {
            addCriterion("STORAGE <=", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGELike(String value) {
            addCriterion("STORAGE like", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGENotLike(String value) {
            addCriterion("STORAGE not like", value, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGEIn(List<String> values) {
            addCriterion("STORAGE in", values, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGENotIn(List<String> values) {
            addCriterion("STORAGE not in", values, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGEBetween(String value1, String value2) {
            addCriterion("STORAGE between", value1, value2, "STORAGE");
            return (Criteria) this;
        }

        public Criteria andSTORAGENotBetween(String value1, String value2) {
            addCriterion("STORAGE not between", value1, value2, "STORAGE");
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

        public Criteria andOSTYPEIsNull() {
            addCriterion("OSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOSTYPEIsNotNull() {
            addCriterion("OSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOSTYPEEqualTo(String value) {
            addCriterion("OSTYPE =", value, "OSTYPE");
            return (Criteria) this;
        }

        public Criteria andOSTYPENotEqualTo(String value) {
            addCriterion("OSTYPE <>", value, "OSTYPE");
            return (Criteria) this;
        }

        public Criteria andOSTYPEGreaterThan(String value) {
            addCriterion("OSTYPE >", value, "OSTYPE");
            return (Criteria) this;
        }

        public Criteria andOSTYPEGreaterThanOrEqualTo(String value) {
            addCriterion("OSTYPE >=", value, "OSTYPE");
            return (Criteria) this;
        }

        public Criteria andOSTYPELessThan(String value) {
            addCriterion("OSTYPE <", value, "OSTYPE");
            return (Criteria) this;
        }

        public Criteria andOSTYPELessThanOrEqualTo(String value) {
            addCriterion("OSTYPE <=", value, "OSTYPE");
            return (Criteria) this;
        }

        public Criteria andOSTYPELike(String value) {
            addCriterion("OSTYPE like", value, "OSTYPE");
            return (Criteria) this;
        }

        public Criteria andOSTYPENotLike(String value) {
            addCriterion("OSTYPE not like", value, "OSTYPE");
            return (Criteria) this;
        }

        public Criteria andOSTYPEIn(List<String> values) {
            addCriterion("OSTYPE in", values, "OSTYPE");
            return (Criteria) this;
        }

        public Criteria andOSTYPENotIn(List<String> values) {
            addCriterion("OSTYPE not in", values, "OSTYPE");
            return (Criteria) this;
        }

        public Criteria andOSTYPEBetween(String value1, String value2) {
            addCriterion("OSTYPE between", value1, value2, "OSTYPE");
            return (Criteria) this;
        }

        public Criteria andOSTYPENotBetween(String value1, String value2) {
            addCriterion("OSTYPE not between", value1, value2, "OSTYPE");
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

        public Criteria andISNOTICEIsNull() {
            addCriterion("ISNOTICE is null");
            return (Criteria) this;
        }

        public Criteria andISNOTICEIsNotNull() {
            addCriterion("ISNOTICE is not null");
            return (Criteria) this;
        }

        public Criteria andISNOTICEEqualTo(Integer value) {
            addCriterion("ISNOTICE =", value, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICENotEqualTo(Integer value) {
            addCriterion("ISNOTICE <>", value, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICEGreaterThan(Integer value) {
            addCriterion("ISNOTICE >", value, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICEGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISNOTICE >=", value, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICELessThan(Integer value) {
            addCriterion("ISNOTICE <", value, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICELessThanOrEqualTo(Integer value) {
            addCriterion("ISNOTICE <=", value, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICEIn(List<Integer> values) {
            addCriterion("ISNOTICE in", values, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICENotIn(List<Integer> values) {
            addCriterion("ISNOTICE not in", values, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICEBetween(Integer value1, Integer value2) {
            addCriterion("ISNOTICE between", value1, value2, "ISNOTICE");
            return (Criteria) this;
        }

        public Criteria andISNOTICENotBetween(Integer value1, Integer value2) {
            addCriterion("ISNOTICE not between", value1, value2, "ISNOTICE");
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

        public Criteria andTIMEREMARKSIsNull() {
            addCriterion("TIMEREMARKS is null");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSIsNotNull() {
            addCriterion("TIMEREMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSEqualTo(String value) {
            addCriterion("TIMEREMARKS =", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSNotEqualTo(String value) {
            addCriterion("TIMEREMARKS <>", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSGreaterThan(String value) {
            addCriterion("TIMEREMARKS >", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSGreaterThanOrEqualTo(String value) {
            addCriterion("TIMEREMARKS >=", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSLessThan(String value) {
            addCriterion("TIMEREMARKS <", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSLessThanOrEqualTo(String value) {
            addCriterion("TIMEREMARKS <=", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSLike(String value) {
            addCriterion("TIMEREMARKS like", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSNotLike(String value) {
            addCriterion("TIMEREMARKS not like", value, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSIn(List<String> values) {
            addCriterion("TIMEREMARKS in", values, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSNotIn(List<String> values) {
            addCriterion("TIMEREMARKS not in", values, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSBetween(String value1, String value2) {
            addCriterion("TIMEREMARKS between", value1, value2, "TIMEREMARKS");
            return (Criteria) this;
        }

        public Criteria andTIMEREMARKSNotBetween(String value1, String value2) {
            addCriterion("TIMEREMARKS not between", value1, value2, "TIMEREMARKS");
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