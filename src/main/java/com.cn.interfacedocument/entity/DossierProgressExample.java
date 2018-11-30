package com.cn.interfacedocument.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DossierProgressExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public DossierProgressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNull() {
            addCriterion("CREATE_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNotNull() {
            addCriterion("CREATE_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameEqualTo(String value) {
            addCriterion("CREATE_USER_NAME =", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotEqualTo(String value) {
            addCriterion("CREATE_USER_NAME <>", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThan(String value) {
            addCriterion("CREATE_USER_NAME >", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_NAME >=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThan(String value) {
            addCriterion("CREATE_USER_NAME <", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_NAME <=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLike(String value) {
            addCriterion("CREATE_USER_NAME like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotLike(String value) {
            addCriterion("CREATE_USER_NAME not like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIn(List<String> values) {
            addCriterion("CREATE_USER_NAME in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotIn(List<String> values) {
            addCriterion("CREATE_USER_NAME not in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameBetween(String value1, String value2) {
            addCriterion("CREATE_USER_NAME between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER_NAME not between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeIsNull() {
            addCriterion("CREATE_USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeIsNotNull() {
            addCriterion("CREATE_USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeEqualTo(Byte value) {
            addCriterion("CREATE_USER_TYPE =", value, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeNotEqualTo(Byte value) {
            addCriterion("CREATE_USER_TYPE <>", value, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeGreaterThan(Byte value) {
            addCriterion("CREATE_USER_TYPE >", value, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("CREATE_USER_TYPE >=", value, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeLessThan(Byte value) {
            addCriterion("CREATE_USER_TYPE <", value, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeLessThanOrEqualTo(Byte value) {
            addCriterion("CREATE_USER_TYPE <=", value, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeIn(List<Byte> values) {
            addCriterion("CREATE_USER_TYPE in", values, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeNotIn(List<Byte> values) {
            addCriterion("CREATE_USER_TYPE not in", values, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeBetween(Byte value1, Byte value2) {
            addCriterion("CREATE_USER_TYPE between", value1, value2, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("CREATE_USER_TYPE not between", value1, value2, "createUserType");
            return (Criteria) this;
        }

        public Criteria andProgressStatusIsNull() {
            addCriterion("PROGRESS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andProgressStatusIsNotNull() {
            addCriterion("PROGRESS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andProgressStatusEqualTo(Byte value) {
            addCriterion("PROGRESS_STATUS =", value, "progressStatus");
            return (Criteria) this;
        }

        public Criteria andProgressStatusNotEqualTo(Byte value) {
            addCriterion("PROGRESS_STATUS <>", value, "progressStatus");
            return (Criteria) this;
        }

        public Criteria andProgressStatusGreaterThan(Byte value) {
            addCriterion("PROGRESS_STATUS >", value, "progressStatus");
            return (Criteria) this;
        }

        public Criteria andProgressStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("PROGRESS_STATUS >=", value, "progressStatus");
            return (Criteria) this;
        }

        public Criteria andProgressStatusLessThan(Byte value) {
            addCriterion("PROGRESS_STATUS <", value, "progressStatus");
            return (Criteria) this;
        }

        public Criteria andProgressStatusLessThanOrEqualTo(Byte value) {
            addCriterion("PROGRESS_STATUS <=", value, "progressStatus");
            return (Criteria) this;
        }

        public Criteria andProgressStatusIn(List<Byte> values) {
            addCriterion("PROGRESS_STATUS in", values, "progressStatus");
            return (Criteria) this;
        }

        public Criteria andProgressStatusNotIn(List<Byte> values) {
            addCriterion("PROGRESS_STATUS not in", values, "progressStatus");
            return (Criteria) this;
        }

        public Criteria andProgressStatusBetween(Byte value1, Byte value2) {
            addCriterion("PROGRESS_STATUS between", value1, value2, "progressStatus");
            return (Criteria) this;
        }

        public Criteria andProgressStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("PROGRESS_STATUS not between", value1, value2, "progressStatus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNull() {
            addCriterion("CASE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNotNull() {
            addCriterion("CASE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNoEqualTo(String value) {
            addCriterion("CASE_NO =", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotEqualTo(String value) {
            addCriterion("CASE_NO <>", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThan(String value) {
            addCriterion("CASE_NO >", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_NO >=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThan(String value) {
            addCriterion("CASE_NO <", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThanOrEqualTo(String value) {
            addCriterion("CASE_NO <=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLike(String value) {
            addCriterion("CASE_NO like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotLike(String value) {
            addCriterion("CASE_NO not like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoIn(List<String> values) {
            addCriterion("CASE_NO in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotIn(List<String> values) {
            addCriterion("CASE_NO not in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoBetween(String value1, String value2) {
            addCriterion("CASE_NO between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotBetween(String value1, String value2) {
            addCriterion("CASE_NO not between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andDossierIdIsNull() {
            addCriterion("DOSSIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDossierIdIsNotNull() {
            addCriterion("DOSSIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDossierIdEqualTo(Long value) {
            addCriterion("DOSSIER_ID =", value, "dossierId");
            return (Criteria) this;
        }

        public Criteria andDossierIdNotEqualTo(Long value) {
            addCriterion("DOSSIER_ID <>", value, "dossierId");
            return (Criteria) this;
        }

        public Criteria andDossierIdGreaterThan(Long value) {
            addCriterion("DOSSIER_ID >", value, "dossierId");
            return (Criteria) this;
        }

        public Criteria andDossierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DOSSIER_ID >=", value, "dossierId");
            return (Criteria) this;
        }

        public Criteria andDossierIdLessThan(Long value) {
            addCriterion("DOSSIER_ID <", value, "dossierId");
            return (Criteria) this;
        }

        public Criteria andDossierIdLessThanOrEqualTo(Long value) {
            addCriterion("DOSSIER_ID <=", value, "dossierId");
            return (Criteria) this;
        }

        public Criteria andDossierIdIn(List<Long> values) {
            addCriterion("DOSSIER_ID in", values, "dossierId");
            return (Criteria) this;
        }

        public Criteria andDossierIdNotIn(List<Long> values) {
            addCriterion("DOSSIER_ID not in", values, "dossierId");
            return (Criteria) this;
        }

        public Criteria andDossierIdBetween(Long value1, Long value2) {
            addCriterion("DOSSIER_ID between", value1, value2, "dossierId");
            return (Criteria) this;
        }

        public Criteria andDossierIdNotBetween(Long value1, Long value2) {
            addCriterion("DOSSIER_ID not between", value1, value2, "dossierId");
            return (Criteria) this;
        }

        public Criteria andDossierNameIsNull() {
            addCriterion("DOSSIER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDossierNameIsNotNull() {
            addCriterion("DOSSIER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDossierNameEqualTo(String value) {
            addCriterion("DOSSIER_NAME =", value, "dossierName");
            return (Criteria) this;
        }

        public Criteria andDossierNameNotEqualTo(String value) {
            addCriterion("DOSSIER_NAME <>", value, "dossierName");
            return (Criteria) this;
        }

        public Criteria andDossierNameGreaterThan(String value) {
            addCriterion("DOSSIER_NAME >", value, "dossierName");
            return (Criteria) this;
        }

        public Criteria andDossierNameGreaterThanOrEqualTo(String value) {
            addCriterion("DOSSIER_NAME >=", value, "dossierName");
            return (Criteria) this;
        }

        public Criteria andDossierNameLessThan(String value) {
            addCriterion("DOSSIER_NAME <", value, "dossierName");
            return (Criteria) this;
        }

        public Criteria andDossierNameLessThanOrEqualTo(String value) {
            addCriterion("DOSSIER_NAME <=", value, "dossierName");
            return (Criteria) this;
        }

        public Criteria andDossierNameLike(String value) {
            addCriterion("DOSSIER_NAME like", value, "dossierName");
            return (Criteria) this;
        }

        public Criteria andDossierNameNotLike(String value) {
            addCriterion("DOSSIER_NAME not like", value, "dossierName");
            return (Criteria) this;
        }

        public Criteria andDossierNameIn(List<String> values) {
            addCriterion("DOSSIER_NAME in", values, "dossierName");
            return (Criteria) this;
        }

        public Criteria andDossierNameNotIn(List<String> values) {
            addCriterion("DOSSIER_NAME not in", values, "dossierName");
            return (Criteria) this;
        }

        public Criteria andDossierNameBetween(String value1, String value2) {
            addCriterion("DOSSIER_NAME between", value1, value2, "dossierName");
            return (Criteria) this;
        }

        public Criteria andDossierNameNotBetween(String value1, String value2) {
            addCriterion("DOSSIER_NAME not between", value1, value2, "dossierName");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated do_not_delete_during_merge Fri Nov 30 10:52:03 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DOSSIER_PROGRESS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
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