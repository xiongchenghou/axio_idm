package jp.co.axio.masterMentsetSystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TUserSubEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserSubEntityExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andReflectionDateIsNull() {
            addCriterion("reflection_date is null");
            return (Criteria) this;
        }

        public Criteria andReflectionDateIsNotNull() {
            addCriterion("reflection_date is not null");
            return (Criteria) this;
        }

        public Criteria andReflectionDateEqualTo(Date value) {
            addCriterionForJDBCDate("reflection_date =", value, "reflectionDate");
            return (Criteria) this;
        }

        public Criteria andReflectionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("reflection_date <>", value, "reflectionDate");
            return (Criteria) this;
        }

        public Criteria andReflectionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("reflection_date >", value, "reflectionDate");
            return (Criteria) this;
        }

        public Criteria andReflectionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reflection_date >=", value, "reflectionDate");
            return (Criteria) this;
        }

        public Criteria andReflectionDateLessThan(Date value) {
            addCriterionForJDBCDate("reflection_date <", value, "reflectionDate");
            return (Criteria) this;
        }

        public Criteria andReflectionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reflection_date <=", value, "reflectionDate");
            return (Criteria) this;
        }

        public Criteria andReflectionDateIn(List<Date> values) {
            addCriterionForJDBCDate("reflection_date in", values, "reflectionDate");
            return (Criteria) this;
        }

        public Criteria andReflectionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("reflection_date not in", values, "reflectionDate");
            return (Criteria) this;
        }

        public Criteria andReflectionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reflection_date between", value1, value2, "reflectionDate");
            return (Criteria) this;
        }

        public Criteria andReflectionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reflection_date not between", value1, value2, "reflectionDate");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("employee_id like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("employee_id not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andLmIdIsNull() {
            addCriterion("lm_id is null");
            return (Criteria) this;
        }

        public Criteria andLmIdIsNotNull() {
            addCriterion("lm_id is not null");
            return (Criteria) this;
        }

        public Criteria andLmIdEqualTo(String value) {
            addCriterion("lm_id =", value, "lmId");
            return (Criteria) this;
        }

        public Criteria andLmIdNotEqualTo(String value) {
            addCriterion("lm_id <>", value, "lmId");
            return (Criteria) this;
        }

        public Criteria andLmIdGreaterThan(String value) {
            addCriterion("lm_id >", value, "lmId");
            return (Criteria) this;
        }

        public Criteria andLmIdGreaterThanOrEqualTo(String value) {
            addCriterion("lm_id >=", value, "lmId");
            return (Criteria) this;
        }

        public Criteria andLmIdLessThan(String value) {
            addCriterion("lm_id <", value, "lmId");
            return (Criteria) this;
        }

        public Criteria andLmIdLessThanOrEqualTo(String value) {
            addCriterion("lm_id <=", value, "lmId");
            return (Criteria) this;
        }

        public Criteria andLmIdLike(String value) {
            addCriterion("lm_id like", value, "lmId");
            return (Criteria) this;
        }

        public Criteria andLmIdNotLike(String value) {
            addCriterion("lm_id not like", value, "lmId");
            return (Criteria) this;
        }

        public Criteria andLmIdIn(List<String> values) {
            addCriterion("lm_id in", values, "lmId");
            return (Criteria) this;
        }

        public Criteria andLmIdNotIn(List<String> values) {
            addCriterion("lm_id not in", values, "lmId");
            return (Criteria) this;
        }

        public Criteria andLmIdBetween(String value1, String value2) {
            addCriterion("lm_id between", value1, value2, "lmId");
            return (Criteria) this;
        }

        public Criteria andLmIdNotBetween(String value1, String value2) {
            addCriterion("lm_id not between", value1, value2, "lmId");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andInitPasswordIsNull() {
            addCriterion("init_password is null");
            return (Criteria) this;
        }

        public Criteria andInitPasswordIsNotNull() {
            addCriterion("init_password is not null");
            return (Criteria) this;
        }

        public Criteria andInitPasswordEqualTo(String value) {
            addCriterion("init_password =", value, "initPassword");
            return (Criteria) this;
        }

        public Criteria andInitPasswordNotEqualTo(String value) {
            addCriterion("init_password <>", value, "initPassword");
            return (Criteria) this;
        }

        public Criteria andInitPasswordGreaterThan(String value) {
            addCriterion("init_password >", value, "initPassword");
            return (Criteria) this;
        }

        public Criteria andInitPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("init_password >=", value, "initPassword");
            return (Criteria) this;
        }

        public Criteria andInitPasswordLessThan(String value) {
            addCriterion("init_password <", value, "initPassword");
            return (Criteria) this;
        }

        public Criteria andInitPasswordLessThanOrEqualTo(String value) {
            addCriterion("init_password <=", value, "initPassword");
            return (Criteria) this;
        }

        public Criteria andInitPasswordLike(String value) {
            addCriterion("init_password like", value, "initPassword");
            return (Criteria) this;
        }

        public Criteria andInitPasswordNotLike(String value) {
            addCriterion("init_password not like", value, "initPassword");
            return (Criteria) this;
        }

        public Criteria andInitPasswordIn(List<String> values) {
            addCriterion("init_password in", values, "initPassword");
            return (Criteria) this;
        }

        public Criteria andInitPasswordNotIn(List<String> values) {
            addCriterion("init_password not in", values, "initPassword");
            return (Criteria) this;
        }

        public Criteria andInitPasswordBetween(String value1, String value2) {
            addCriterion("init_password between", value1, value2, "initPassword");
            return (Criteria) this;
        }

        public Criteria andInitPasswordNotBetween(String value1, String value2) {
            addCriterion("init_password not between", value1, value2, "initPassword");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(String value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(String value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(String value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(String value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(String value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(String value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLike(String value) {
            addCriterion("delete_flag like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotLike(String value) {
            addCriterion("delete_flag not like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<String> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<String> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(String value1, String value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(String value1, String value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andInvalidFlagIsNull() {
            addCriterion("invalid_flag is null");
            return (Criteria) this;
        }

        public Criteria andInvalidFlagIsNotNull() {
            addCriterion("invalid_flag is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidFlagEqualTo(String value) {
            addCriterion("invalid_flag =", value, "invalidFlag");
            return (Criteria) this;
        }

        public Criteria andInvalidFlagNotEqualTo(String value) {
            addCriterion("invalid_flag <>", value, "invalidFlag");
            return (Criteria) this;
        }

        public Criteria andInvalidFlagGreaterThan(String value) {
            addCriterion("invalid_flag >", value, "invalidFlag");
            return (Criteria) this;
        }

        public Criteria andInvalidFlagGreaterThanOrEqualTo(String value) {
            addCriterion("invalid_flag >=", value, "invalidFlag");
            return (Criteria) this;
        }

        public Criteria andInvalidFlagLessThan(String value) {
            addCriterion("invalid_flag <", value, "invalidFlag");
            return (Criteria) this;
        }

        public Criteria andInvalidFlagLessThanOrEqualTo(String value) {
            addCriterion("invalid_flag <=", value, "invalidFlag");
            return (Criteria) this;
        }

        public Criteria andInvalidFlagLike(String value) {
            addCriterion("invalid_flag like", value, "invalidFlag");
            return (Criteria) this;
        }

        public Criteria andInvalidFlagNotLike(String value) {
            addCriterion("invalid_flag not like", value, "invalidFlag");
            return (Criteria) this;
        }

        public Criteria andInvalidFlagIn(List<String> values) {
            addCriterion("invalid_flag in", values, "invalidFlag");
            return (Criteria) this;
        }

        public Criteria andInvalidFlagNotIn(List<String> values) {
            addCriterion("invalid_flag not in", values, "invalidFlag");
            return (Criteria) this;
        }

        public Criteria andInvalidFlagBetween(String value1, String value2) {
            addCriterion("invalid_flag between", value1, value2, "invalidFlag");
            return (Criteria) this;
        }

        public Criteria andInvalidFlagNotBetween(String value1, String value2) {
            addCriterion("invalid_flag not between", value1, value2, "invalidFlag");
            return (Criteria) this;
        }

        public Criteria andLangCodeIsNull() {
            addCriterion("lang_code is null");
            return (Criteria) this;
        }

        public Criteria andLangCodeIsNotNull() {
            addCriterion("lang_code is not null");
            return (Criteria) this;
        }

        public Criteria andLangCodeEqualTo(String value) {
            addCriterion("lang_code =", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeNotEqualTo(String value) {
            addCriterion("lang_code <>", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeGreaterThan(String value) {
            addCriterion("lang_code >", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeGreaterThanOrEqualTo(String value) {
            addCriterion("lang_code >=", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeLessThan(String value) {
            addCriterion("lang_code <", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeLessThanOrEqualTo(String value) {
            addCriterion("lang_code <=", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeLike(String value) {
            addCriterion("lang_code like", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeNotLike(String value) {
            addCriterion("lang_code not like", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeIn(List<String> values) {
            addCriterion("lang_code in", values, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeNotIn(List<String> values) {
            addCriterion("lang_code not in", values, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeBetween(String value1, String value2) {
            addCriterion("lang_code between", value1, value2, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeNotBetween(String value1, String value2) {
            addCriterion("lang_code not between", value1, value2, "langCode");
            return (Criteria) this;
        }

        public Criteria andEnrollmentKbnIsNull() {
            addCriterion("enrollment_kbn is null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentKbnIsNotNull() {
            addCriterion("enrollment_kbn is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentKbnEqualTo(String value) {
            addCriterion("enrollment_kbn =", value, "enrollmentKbn");
            return (Criteria) this;
        }

        public Criteria andEnrollmentKbnNotEqualTo(String value) {
            addCriterion("enrollment_kbn <>", value, "enrollmentKbn");
            return (Criteria) this;
        }

        public Criteria andEnrollmentKbnGreaterThan(String value) {
            addCriterion("enrollment_kbn >", value, "enrollmentKbn");
            return (Criteria) this;
        }

        public Criteria andEnrollmentKbnGreaterThanOrEqualTo(String value) {
            addCriterion("enrollment_kbn >=", value, "enrollmentKbn");
            return (Criteria) this;
        }

        public Criteria andEnrollmentKbnLessThan(String value) {
            addCriterion("enrollment_kbn <", value, "enrollmentKbn");
            return (Criteria) this;
        }

        public Criteria andEnrollmentKbnLessThanOrEqualTo(String value) {
            addCriterion("enrollment_kbn <=", value, "enrollmentKbn");
            return (Criteria) this;
        }

        public Criteria andEnrollmentKbnLike(String value) {
            addCriterion("enrollment_kbn like", value, "enrollmentKbn");
            return (Criteria) this;
        }

        public Criteria andEnrollmentKbnNotLike(String value) {
            addCriterion("enrollment_kbn not like", value, "enrollmentKbn");
            return (Criteria) this;
        }

        public Criteria andEnrollmentKbnIn(List<String> values) {
            addCriterion("enrollment_kbn in", values, "enrollmentKbn");
            return (Criteria) this;
        }

        public Criteria andEnrollmentKbnNotIn(List<String> values) {
            addCriterion("enrollment_kbn not in", values, "enrollmentKbn");
            return (Criteria) this;
        }

        public Criteria andEnrollmentKbnBetween(String value1, String value2) {
            addCriterion("enrollment_kbn between", value1, value2, "enrollmentKbn");
            return (Criteria) this;
        }

        public Criteria andEnrollmentKbnNotBetween(String value1, String value2) {
            addCriterion("enrollment_kbn not between", value1, value2, "enrollmentKbn");
            return (Criteria) this;
        }

        public Criteria andEmploymentKbnIsNull() {
            addCriterion("employment_kbn is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentKbnIsNotNull() {
            addCriterion("employment_kbn is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentKbnEqualTo(String value) {
            addCriterion("employment_kbn =", value, "employmentKbn");
            return (Criteria) this;
        }

        public Criteria andEmploymentKbnNotEqualTo(String value) {
            addCriterion("employment_kbn <>", value, "employmentKbn");
            return (Criteria) this;
        }

        public Criteria andEmploymentKbnGreaterThan(String value) {
            addCriterion("employment_kbn >", value, "employmentKbn");
            return (Criteria) this;
        }

        public Criteria andEmploymentKbnGreaterThanOrEqualTo(String value) {
            addCriterion("employment_kbn >=", value, "employmentKbn");
            return (Criteria) this;
        }

        public Criteria andEmploymentKbnLessThan(String value) {
            addCriterion("employment_kbn <", value, "employmentKbn");
            return (Criteria) this;
        }

        public Criteria andEmploymentKbnLessThanOrEqualTo(String value) {
            addCriterion("employment_kbn <=", value, "employmentKbn");
            return (Criteria) this;
        }

        public Criteria andEmploymentKbnLike(String value) {
            addCriterion("employment_kbn like", value, "employmentKbn");
            return (Criteria) this;
        }

        public Criteria andEmploymentKbnNotLike(String value) {
            addCriterion("employment_kbn not like", value, "employmentKbn");
            return (Criteria) this;
        }

        public Criteria andEmploymentKbnIn(List<String> values) {
            addCriterion("employment_kbn in", values, "employmentKbn");
            return (Criteria) this;
        }

        public Criteria andEmploymentKbnNotIn(List<String> values) {
            addCriterion("employment_kbn not in", values, "employmentKbn");
            return (Criteria) this;
        }

        public Criteria andEmploymentKbnBetween(String value1, String value2) {
            addCriterion("employment_kbn between", value1, value2, "employmentKbn");
            return (Criteria) this;
        }

        public Criteria andEmploymentKbnNotBetween(String value1, String value2) {
            addCriterion("employment_kbn not between", value1, value2, "employmentKbn");
            return (Criteria) this;
        }

        public Criteria andMailaddrIsNull() {
            addCriterion("mailaddr is null");
            return (Criteria) this;
        }

        public Criteria andMailaddrIsNotNull() {
            addCriterion("mailaddr is not null");
            return (Criteria) this;
        }

        public Criteria andMailaddrEqualTo(String value) {
            addCriterion("mailaddr =", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotEqualTo(String value) {
            addCriterion("mailaddr <>", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrGreaterThan(String value) {
            addCriterion("mailaddr >", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrGreaterThanOrEqualTo(String value) {
            addCriterion("mailaddr >=", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrLessThan(String value) {
            addCriterion("mailaddr <", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrLessThanOrEqualTo(String value) {
            addCriterion("mailaddr <=", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrLike(String value) {
            addCriterion("mailaddr like", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotLike(String value) {
            addCriterion("mailaddr not like", value, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrIn(List<String> values) {
            addCriterion("mailaddr in", values, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotIn(List<String> values) {
            addCriterion("mailaddr not in", values, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrBetween(String value1, String value2) {
            addCriterion("mailaddr between", value1, value2, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotBetween(String value1, String value2) {
            addCriterion("mailaddr not between", value1, value2, "mailaddr");
            return (Criteria) this;
        }

        public Criteria andMailaddrSecoundIsNull() {
            addCriterion("mailaddr_secound is null");
            return (Criteria) this;
        }

        public Criteria andMailaddrSecoundIsNotNull() {
            addCriterion("mailaddr_secound is not null");
            return (Criteria) this;
        }

        public Criteria andMailaddrSecoundEqualTo(String value) {
            addCriterion("mailaddr_secound =", value, "mailaddrSecound");
            return (Criteria) this;
        }

        public Criteria andMailaddrSecoundNotEqualTo(String value) {
            addCriterion("mailaddr_secound <>", value, "mailaddrSecound");
            return (Criteria) this;
        }

        public Criteria andMailaddrSecoundGreaterThan(String value) {
            addCriterion("mailaddr_secound >", value, "mailaddrSecound");
            return (Criteria) this;
        }

        public Criteria andMailaddrSecoundGreaterThanOrEqualTo(String value) {
            addCriterion("mailaddr_secound >=", value, "mailaddrSecound");
            return (Criteria) this;
        }

        public Criteria andMailaddrSecoundLessThan(String value) {
            addCriterion("mailaddr_secound <", value, "mailaddrSecound");
            return (Criteria) this;
        }

        public Criteria andMailaddrSecoundLessThanOrEqualTo(String value) {
            addCriterion("mailaddr_secound <=", value, "mailaddrSecound");
            return (Criteria) this;
        }

        public Criteria andMailaddrSecoundLike(String value) {
            addCriterion("mailaddr_secound like", value, "mailaddrSecound");
            return (Criteria) this;
        }

        public Criteria andMailaddrSecoundNotLike(String value) {
            addCriterion("mailaddr_secound not like", value, "mailaddrSecound");
            return (Criteria) this;
        }

        public Criteria andMailaddrSecoundIn(List<String> values) {
            addCriterion("mailaddr_secound in", values, "mailaddrSecound");
            return (Criteria) this;
        }

        public Criteria andMailaddrSecoundNotIn(List<String> values) {
            addCriterion("mailaddr_secound not in", values, "mailaddrSecound");
            return (Criteria) this;
        }

        public Criteria andMailaddrSecoundBetween(String value1, String value2) {
            addCriterion("mailaddr_secound between", value1, value2, "mailaddrSecound");
            return (Criteria) this;
        }

        public Criteria andMailaddrSecoundNotBetween(String value1, String value2) {
            addCriterion("mailaddr_secound not between", value1, value2, "mailaddrSecound");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotificationIsNull() {
            addCriterion("mailaddr_notification is null");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotificationIsNotNull() {
            addCriterion("mailaddr_notification is not null");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotificationEqualTo(String value) {
            addCriterion("mailaddr_notification =", value, "mailaddrNotification");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotificationNotEqualTo(String value) {
            addCriterion("mailaddr_notification <>", value, "mailaddrNotification");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotificationGreaterThan(String value) {
            addCriterion("mailaddr_notification >", value, "mailaddrNotification");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotificationGreaterThanOrEqualTo(String value) {
            addCriterion("mailaddr_notification >=", value, "mailaddrNotification");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotificationLessThan(String value) {
            addCriterion("mailaddr_notification <", value, "mailaddrNotification");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotificationLessThanOrEqualTo(String value) {
            addCriterion("mailaddr_notification <=", value, "mailaddrNotification");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotificationLike(String value) {
            addCriterion("mailaddr_notification like", value, "mailaddrNotification");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotificationNotLike(String value) {
            addCriterion("mailaddr_notification not like", value, "mailaddrNotification");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotificationIn(List<String> values) {
            addCriterion("mailaddr_notification in", values, "mailaddrNotification");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotificationNotIn(List<String> values) {
            addCriterion("mailaddr_notification not in", values, "mailaddrNotification");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotificationBetween(String value1, String value2) {
            addCriterion("mailaddr_notification between", value1, value2, "mailaddrNotification");
            return (Criteria) this;
        }

        public Criteria andMailaddrNotificationNotBetween(String value1, String value2) {
            addCriterion("mailaddr_notification not between", value1, value2, "mailaddrNotification");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelExIsNull() {
            addCriterion("tel_ex is null");
            return (Criteria) this;
        }

        public Criteria andTelExIsNotNull() {
            addCriterion("tel_ex is not null");
            return (Criteria) this;
        }

        public Criteria andTelExEqualTo(String value) {
            addCriterion("tel_ex =", value, "telEx");
            return (Criteria) this;
        }

        public Criteria andTelExNotEqualTo(String value) {
            addCriterion("tel_ex <>", value, "telEx");
            return (Criteria) this;
        }

        public Criteria andTelExGreaterThan(String value) {
            addCriterion("tel_ex >", value, "telEx");
            return (Criteria) this;
        }

        public Criteria andTelExGreaterThanOrEqualTo(String value) {
            addCriterion("tel_ex >=", value, "telEx");
            return (Criteria) this;
        }

        public Criteria andTelExLessThan(String value) {
            addCriterion("tel_ex <", value, "telEx");
            return (Criteria) this;
        }

        public Criteria andTelExLessThanOrEqualTo(String value) {
            addCriterion("tel_ex <=", value, "telEx");
            return (Criteria) this;
        }

        public Criteria andTelExLike(String value) {
            addCriterion("tel_ex like", value, "telEx");
            return (Criteria) this;
        }

        public Criteria andTelExNotLike(String value) {
            addCriterion("tel_ex not like", value, "telEx");
            return (Criteria) this;
        }

        public Criteria andTelExIn(List<String> values) {
            addCriterion("tel_ex in", values, "telEx");
            return (Criteria) this;
        }

        public Criteria andTelExNotIn(List<String> values) {
            addCriterion("tel_ex not in", values, "telEx");
            return (Criteria) this;
        }

        public Criteria andTelExBetween(String value1, String value2) {
            addCriterion("tel_ex between", value1, value2, "telEx");
            return (Criteria) this;
        }

        public Criteria andTelExNotBetween(String value1, String value2) {
            addCriterion("tel_ex not between", value1, value2, "telEx");
            return (Criteria) this;
        }

        public Criteria andSurnameEnIsNull() {
            addCriterion("surname_en is null");
            return (Criteria) this;
        }

        public Criteria andSurnameEnIsNotNull() {
            addCriterion("surname_en is not null");
            return (Criteria) this;
        }

        public Criteria andSurnameEnEqualTo(String value) {
            addCriterion("surname_en =", value, "surnameEn");
            return (Criteria) this;
        }

        public Criteria andSurnameEnNotEqualTo(String value) {
            addCriterion("surname_en <>", value, "surnameEn");
            return (Criteria) this;
        }

        public Criteria andSurnameEnGreaterThan(String value) {
            addCriterion("surname_en >", value, "surnameEn");
            return (Criteria) this;
        }

        public Criteria andSurnameEnGreaterThanOrEqualTo(String value) {
            addCriterion("surname_en >=", value, "surnameEn");
            return (Criteria) this;
        }

        public Criteria andSurnameEnLessThan(String value) {
            addCriterion("surname_en <", value, "surnameEn");
            return (Criteria) this;
        }

        public Criteria andSurnameEnLessThanOrEqualTo(String value) {
            addCriterion("surname_en <=", value, "surnameEn");
            return (Criteria) this;
        }

        public Criteria andSurnameEnLike(String value) {
            addCriterion("surname_en like", value, "surnameEn");
            return (Criteria) this;
        }

        public Criteria andSurnameEnNotLike(String value) {
            addCriterion("surname_en not like", value, "surnameEn");
            return (Criteria) this;
        }

        public Criteria andSurnameEnIn(List<String> values) {
            addCriterion("surname_en in", values, "surnameEn");
            return (Criteria) this;
        }

        public Criteria andSurnameEnNotIn(List<String> values) {
            addCriterion("surname_en not in", values, "surnameEn");
            return (Criteria) this;
        }

        public Criteria andSurnameEnBetween(String value1, String value2) {
            addCriterion("surname_en between", value1, value2, "surnameEn");
            return (Criteria) this;
        }

        public Criteria andSurnameEnNotBetween(String value1, String value2) {
            addCriterion("surname_en not between", value1, value2, "surnameEn");
            return (Criteria) this;
        }

        public Criteria andSurnameJpIsNull() {
            addCriterion("surname_jp is null");
            return (Criteria) this;
        }

        public Criteria andSurnameJpIsNotNull() {
            addCriterion("surname_jp is not null");
            return (Criteria) this;
        }

        public Criteria andSurnameJpEqualTo(String value) {
            addCriterion("surname_jp =", value, "surnameJp");
            return (Criteria) this;
        }

        public Criteria andSurnameJpNotEqualTo(String value) {
            addCriterion("surname_jp <>", value, "surnameJp");
            return (Criteria) this;
        }

        public Criteria andSurnameJpGreaterThan(String value) {
            addCriterion("surname_jp >", value, "surnameJp");
            return (Criteria) this;
        }

        public Criteria andSurnameJpGreaterThanOrEqualTo(String value) {
            addCriterion("surname_jp >=", value, "surnameJp");
            return (Criteria) this;
        }

        public Criteria andSurnameJpLessThan(String value) {
            addCriterion("surname_jp <", value, "surnameJp");
            return (Criteria) this;
        }

        public Criteria andSurnameJpLessThanOrEqualTo(String value) {
            addCriterion("surname_jp <=", value, "surnameJp");
            return (Criteria) this;
        }

        public Criteria andSurnameJpLike(String value) {
            addCriterion("surname_jp like", value, "surnameJp");
            return (Criteria) this;
        }

        public Criteria andSurnameJpNotLike(String value) {
            addCriterion("surname_jp not like", value, "surnameJp");
            return (Criteria) this;
        }

        public Criteria andSurnameJpIn(List<String> values) {
            addCriterion("surname_jp in", values, "surnameJp");
            return (Criteria) this;
        }

        public Criteria andSurnameJpNotIn(List<String> values) {
            addCriterion("surname_jp not in", values, "surnameJp");
            return (Criteria) this;
        }

        public Criteria andSurnameJpBetween(String value1, String value2) {
            addCriterion("surname_jp between", value1, value2, "surnameJp");
            return (Criteria) this;
        }

        public Criteria andSurnameJpNotBetween(String value1, String value2) {
            addCriterion("surname_jp not between", value1, value2, "surnameJp");
            return (Criteria) this;
        }

        public Criteria andSurnameKanaIsNull() {
            addCriterion("surname_kana is null");
            return (Criteria) this;
        }

        public Criteria andSurnameKanaIsNotNull() {
            addCriterion("surname_kana is not null");
            return (Criteria) this;
        }

        public Criteria andSurnameKanaEqualTo(String value) {
            addCriterion("surname_kana =", value, "surnameKana");
            return (Criteria) this;
        }

        public Criteria andSurnameKanaNotEqualTo(String value) {
            addCriterion("surname_kana <>", value, "surnameKana");
            return (Criteria) this;
        }

        public Criteria andSurnameKanaGreaterThan(String value) {
            addCriterion("surname_kana >", value, "surnameKana");
            return (Criteria) this;
        }

        public Criteria andSurnameKanaGreaterThanOrEqualTo(String value) {
            addCriterion("surname_kana >=", value, "surnameKana");
            return (Criteria) this;
        }

        public Criteria andSurnameKanaLessThan(String value) {
            addCriterion("surname_kana <", value, "surnameKana");
            return (Criteria) this;
        }

        public Criteria andSurnameKanaLessThanOrEqualTo(String value) {
            addCriterion("surname_kana <=", value, "surnameKana");
            return (Criteria) this;
        }

        public Criteria andSurnameKanaLike(String value) {
            addCriterion("surname_kana like", value, "surnameKana");
            return (Criteria) this;
        }

        public Criteria andSurnameKanaNotLike(String value) {
            addCriterion("surname_kana not like", value, "surnameKana");
            return (Criteria) this;
        }

        public Criteria andSurnameKanaIn(List<String> values) {
            addCriterion("surname_kana in", values, "surnameKana");
            return (Criteria) this;
        }

        public Criteria andSurnameKanaNotIn(List<String> values) {
            addCriterion("surname_kana not in", values, "surnameKana");
            return (Criteria) this;
        }

        public Criteria andSurnameKanaBetween(String value1, String value2) {
            addCriterion("surname_kana between", value1, value2, "surnameKana");
            return (Criteria) this;
        }

        public Criteria andSurnameKanaNotBetween(String value1, String value2) {
            addCriterion("surname_kana not between", value1, value2, "surnameKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameEnIsNull() {
            addCriterion("middlename_en is null");
            return (Criteria) this;
        }

        public Criteria andMiddlenameEnIsNotNull() {
            addCriterion("middlename_en is not null");
            return (Criteria) this;
        }

        public Criteria andMiddlenameEnEqualTo(String value) {
            addCriterion("middlename_en =", value, "middlenameEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameEnNotEqualTo(String value) {
            addCriterion("middlename_en <>", value, "middlenameEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameEnGreaterThan(String value) {
            addCriterion("middlename_en >", value, "middlenameEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameEnGreaterThanOrEqualTo(String value) {
            addCriterion("middlename_en >=", value, "middlenameEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameEnLessThan(String value) {
            addCriterion("middlename_en <", value, "middlenameEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameEnLessThanOrEqualTo(String value) {
            addCriterion("middlename_en <=", value, "middlenameEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameEnLike(String value) {
            addCriterion("middlename_en like", value, "middlenameEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameEnNotLike(String value) {
            addCriterion("middlename_en not like", value, "middlenameEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameEnIn(List<String> values) {
            addCriterion("middlename_en in", values, "middlenameEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameEnNotIn(List<String> values) {
            addCriterion("middlename_en not in", values, "middlenameEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameEnBetween(String value1, String value2) {
            addCriterion("middlename_en between", value1, value2, "middlenameEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameEnNotBetween(String value1, String value2) {
            addCriterion("middlename_en not between", value1, value2, "middlenameEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameJpIsNull() {
            addCriterion("middlename_jp is null");
            return (Criteria) this;
        }

        public Criteria andMiddlenameJpIsNotNull() {
            addCriterion("middlename_jp is not null");
            return (Criteria) this;
        }

        public Criteria andMiddlenameJpEqualTo(String value) {
            addCriterion("middlename_jp =", value, "middlenameJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameJpNotEqualTo(String value) {
            addCriterion("middlename_jp <>", value, "middlenameJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameJpGreaterThan(String value) {
            addCriterion("middlename_jp >", value, "middlenameJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameJpGreaterThanOrEqualTo(String value) {
            addCriterion("middlename_jp >=", value, "middlenameJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameJpLessThan(String value) {
            addCriterion("middlename_jp <", value, "middlenameJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameJpLessThanOrEqualTo(String value) {
            addCriterion("middlename_jp <=", value, "middlenameJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameJpLike(String value) {
            addCriterion("middlename_jp like", value, "middlenameJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameJpNotLike(String value) {
            addCriterion("middlename_jp not like", value, "middlenameJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameJpIn(List<String> values) {
            addCriterion("middlename_jp in", values, "middlenameJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameJpNotIn(List<String> values) {
            addCriterion("middlename_jp not in", values, "middlenameJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameJpBetween(String value1, String value2) {
            addCriterion("middlename_jp between", value1, value2, "middlenameJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameJpNotBetween(String value1, String value2) {
            addCriterion("middlename_jp not between", value1, value2, "middlenameJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameKanaIsNull() {
            addCriterion("middlename_kana is null");
            return (Criteria) this;
        }

        public Criteria andMiddlenameKanaIsNotNull() {
            addCriterion("middlename_kana is not null");
            return (Criteria) this;
        }

        public Criteria andMiddlenameKanaEqualTo(String value) {
            addCriterion("middlename_kana =", value, "middlenameKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameKanaNotEqualTo(String value) {
            addCriterion("middlename_kana <>", value, "middlenameKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameKanaGreaterThan(String value) {
            addCriterion("middlename_kana >", value, "middlenameKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameKanaGreaterThanOrEqualTo(String value) {
            addCriterion("middlename_kana >=", value, "middlenameKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameKanaLessThan(String value) {
            addCriterion("middlename_kana <", value, "middlenameKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameKanaLessThanOrEqualTo(String value) {
            addCriterion("middlename_kana <=", value, "middlenameKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameKanaLike(String value) {
            addCriterion("middlename_kana like", value, "middlenameKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameKanaNotLike(String value) {
            addCriterion("middlename_kana not like", value, "middlenameKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameKanaIn(List<String> values) {
            addCriterion("middlename_kana in", values, "middlenameKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameKanaNotIn(List<String> values) {
            addCriterion("middlename_kana not in", values, "middlenameKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameKanaBetween(String value1, String value2) {
            addCriterion("middlename_kana between", value1, value2, "middlenameKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameKanaNotBetween(String value1, String value2) {
            addCriterion("middlename_kana not between", value1, value2, "middlenameKana");
            return (Criteria) this;
        }

        public Criteria andGivennameEnIsNull() {
            addCriterion("givenname_en is null");
            return (Criteria) this;
        }

        public Criteria andGivennameEnIsNotNull() {
            addCriterion("givenname_en is not null");
            return (Criteria) this;
        }

        public Criteria andGivennameEnEqualTo(String value) {
            addCriterion("givenname_en =", value, "givennameEn");
            return (Criteria) this;
        }

        public Criteria andGivennameEnNotEqualTo(String value) {
            addCriterion("givenname_en <>", value, "givennameEn");
            return (Criteria) this;
        }

        public Criteria andGivennameEnGreaterThan(String value) {
            addCriterion("givenname_en >", value, "givennameEn");
            return (Criteria) this;
        }

        public Criteria andGivennameEnGreaterThanOrEqualTo(String value) {
            addCriterion("givenname_en >=", value, "givennameEn");
            return (Criteria) this;
        }

        public Criteria andGivennameEnLessThan(String value) {
            addCriterion("givenname_en <", value, "givennameEn");
            return (Criteria) this;
        }

        public Criteria andGivennameEnLessThanOrEqualTo(String value) {
            addCriterion("givenname_en <=", value, "givennameEn");
            return (Criteria) this;
        }

        public Criteria andGivennameEnLike(String value) {
            addCriterion("givenname_en like", value, "givennameEn");
            return (Criteria) this;
        }

        public Criteria andGivennameEnNotLike(String value) {
            addCriterion("givenname_en not like", value, "givennameEn");
            return (Criteria) this;
        }

        public Criteria andGivennameEnIn(List<String> values) {
            addCriterion("givenname_en in", values, "givennameEn");
            return (Criteria) this;
        }

        public Criteria andGivennameEnNotIn(List<String> values) {
            addCriterion("givenname_en not in", values, "givennameEn");
            return (Criteria) this;
        }

        public Criteria andGivennameEnBetween(String value1, String value2) {
            addCriterion("givenname_en between", value1, value2, "givennameEn");
            return (Criteria) this;
        }

        public Criteria andGivennameEnNotBetween(String value1, String value2) {
            addCriterion("givenname_en not between", value1, value2, "givennameEn");
            return (Criteria) this;
        }

        public Criteria andGivennameJpIsNull() {
            addCriterion("givenname_jp is null");
            return (Criteria) this;
        }

        public Criteria andGivennameJpIsNotNull() {
            addCriterion("givenname_jp is not null");
            return (Criteria) this;
        }

        public Criteria andGivennameJpEqualTo(String value) {
            addCriterion("givenname_jp =", value, "givennameJp");
            return (Criteria) this;
        }

        public Criteria andGivennameJpNotEqualTo(String value) {
            addCriterion("givenname_jp <>", value, "givennameJp");
            return (Criteria) this;
        }

        public Criteria andGivennameJpGreaterThan(String value) {
            addCriterion("givenname_jp >", value, "givennameJp");
            return (Criteria) this;
        }

        public Criteria andGivennameJpGreaterThanOrEqualTo(String value) {
            addCriterion("givenname_jp >=", value, "givennameJp");
            return (Criteria) this;
        }

        public Criteria andGivennameJpLessThan(String value) {
            addCriterion("givenname_jp <", value, "givennameJp");
            return (Criteria) this;
        }

        public Criteria andGivennameJpLessThanOrEqualTo(String value) {
            addCriterion("givenname_jp <=", value, "givennameJp");
            return (Criteria) this;
        }

        public Criteria andGivennameJpLike(String value) {
            addCriterion("givenname_jp like", value, "givennameJp");
            return (Criteria) this;
        }

        public Criteria andGivennameJpNotLike(String value) {
            addCriterion("givenname_jp not like", value, "givennameJp");
            return (Criteria) this;
        }

        public Criteria andGivennameJpIn(List<String> values) {
            addCriterion("givenname_jp in", values, "givennameJp");
            return (Criteria) this;
        }

        public Criteria andGivennameJpNotIn(List<String> values) {
            addCriterion("givenname_jp not in", values, "givennameJp");
            return (Criteria) this;
        }

        public Criteria andGivennameJpBetween(String value1, String value2) {
            addCriterion("givenname_jp between", value1, value2, "givennameJp");
            return (Criteria) this;
        }

        public Criteria andGivennameJpNotBetween(String value1, String value2) {
            addCriterion("givenname_jp not between", value1, value2, "givennameJp");
            return (Criteria) this;
        }

        public Criteria andGivennameKanaIsNull() {
            addCriterion("givenname_kana is null");
            return (Criteria) this;
        }

        public Criteria andGivennameKanaIsNotNull() {
            addCriterion("givenname_kana is not null");
            return (Criteria) this;
        }

        public Criteria andGivennameKanaEqualTo(String value) {
            addCriterion("givenname_kana =", value, "givennameKana");
            return (Criteria) this;
        }

        public Criteria andGivennameKanaNotEqualTo(String value) {
            addCriterion("givenname_kana <>", value, "givennameKana");
            return (Criteria) this;
        }

        public Criteria andGivennameKanaGreaterThan(String value) {
            addCriterion("givenname_kana >", value, "givennameKana");
            return (Criteria) this;
        }

        public Criteria andGivennameKanaGreaterThanOrEqualTo(String value) {
            addCriterion("givenname_kana >=", value, "givennameKana");
            return (Criteria) this;
        }

        public Criteria andGivennameKanaLessThan(String value) {
            addCriterion("givenname_kana <", value, "givennameKana");
            return (Criteria) this;
        }

        public Criteria andGivennameKanaLessThanOrEqualTo(String value) {
            addCriterion("givenname_kana <=", value, "givennameKana");
            return (Criteria) this;
        }

        public Criteria andGivennameKanaLike(String value) {
            addCriterion("givenname_kana like", value, "givennameKana");
            return (Criteria) this;
        }

        public Criteria andGivennameKanaNotLike(String value) {
            addCriterion("givenname_kana not like", value, "givennameKana");
            return (Criteria) this;
        }

        public Criteria andGivennameKanaIn(List<String> values) {
            addCriterion("givenname_kana in", values, "givennameKana");
            return (Criteria) this;
        }

        public Criteria andGivennameKanaNotIn(List<String> values) {
            addCriterion("givenname_kana not in", values, "givennameKana");
            return (Criteria) this;
        }

        public Criteria andGivennameKanaBetween(String value1, String value2) {
            addCriterion("givenname_kana between", value1, value2, "givennameKana");
            return (Criteria) this;
        }

        public Criteria andGivennameKanaNotBetween(String value1, String value2) {
            addCriterion("givenname_kana not between", value1, value2, "givennameKana");
            return (Criteria) this;
        }

        public Criteria andSurnameNickEnIsNull() {
            addCriterion("surname_nick_en is null");
            return (Criteria) this;
        }

        public Criteria andSurnameNickEnIsNotNull() {
            addCriterion("surname_nick_en is not null");
            return (Criteria) this;
        }

        public Criteria andSurnameNickEnEqualTo(String value) {
            addCriterion("surname_nick_en =", value, "surnameNickEn");
            return (Criteria) this;
        }

        public Criteria andSurnameNickEnNotEqualTo(String value) {
            addCriterion("surname_nick_en <>", value, "surnameNickEn");
            return (Criteria) this;
        }

        public Criteria andSurnameNickEnGreaterThan(String value) {
            addCriterion("surname_nick_en >", value, "surnameNickEn");
            return (Criteria) this;
        }

        public Criteria andSurnameNickEnGreaterThanOrEqualTo(String value) {
            addCriterion("surname_nick_en >=", value, "surnameNickEn");
            return (Criteria) this;
        }

        public Criteria andSurnameNickEnLessThan(String value) {
            addCriterion("surname_nick_en <", value, "surnameNickEn");
            return (Criteria) this;
        }

        public Criteria andSurnameNickEnLessThanOrEqualTo(String value) {
            addCriterion("surname_nick_en <=", value, "surnameNickEn");
            return (Criteria) this;
        }

        public Criteria andSurnameNickEnLike(String value) {
            addCriterion("surname_nick_en like", value, "surnameNickEn");
            return (Criteria) this;
        }

        public Criteria andSurnameNickEnNotLike(String value) {
            addCriterion("surname_nick_en not like", value, "surnameNickEn");
            return (Criteria) this;
        }

        public Criteria andSurnameNickEnIn(List<String> values) {
            addCriterion("surname_nick_en in", values, "surnameNickEn");
            return (Criteria) this;
        }

        public Criteria andSurnameNickEnNotIn(List<String> values) {
            addCriterion("surname_nick_en not in", values, "surnameNickEn");
            return (Criteria) this;
        }

        public Criteria andSurnameNickEnBetween(String value1, String value2) {
            addCriterion("surname_nick_en between", value1, value2, "surnameNickEn");
            return (Criteria) this;
        }

        public Criteria andSurnameNickEnNotBetween(String value1, String value2) {
            addCriterion("surname_nick_en not between", value1, value2, "surnameNickEn");
            return (Criteria) this;
        }

        public Criteria andSurnameNickJpIsNull() {
            addCriterion("surname_nick_jp is null");
            return (Criteria) this;
        }

        public Criteria andSurnameNickJpIsNotNull() {
            addCriterion("surname_nick_jp is not null");
            return (Criteria) this;
        }

        public Criteria andSurnameNickJpEqualTo(String value) {
            addCriterion("surname_nick_jp =", value, "surnameNickJp");
            return (Criteria) this;
        }

        public Criteria andSurnameNickJpNotEqualTo(String value) {
            addCriterion("surname_nick_jp <>", value, "surnameNickJp");
            return (Criteria) this;
        }

        public Criteria andSurnameNickJpGreaterThan(String value) {
            addCriterion("surname_nick_jp >", value, "surnameNickJp");
            return (Criteria) this;
        }

        public Criteria andSurnameNickJpGreaterThanOrEqualTo(String value) {
            addCriterion("surname_nick_jp >=", value, "surnameNickJp");
            return (Criteria) this;
        }

        public Criteria andSurnameNickJpLessThan(String value) {
            addCriterion("surname_nick_jp <", value, "surnameNickJp");
            return (Criteria) this;
        }

        public Criteria andSurnameNickJpLessThanOrEqualTo(String value) {
            addCriterion("surname_nick_jp <=", value, "surnameNickJp");
            return (Criteria) this;
        }

        public Criteria andSurnameNickJpLike(String value) {
            addCriterion("surname_nick_jp like", value, "surnameNickJp");
            return (Criteria) this;
        }

        public Criteria andSurnameNickJpNotLike(String value) {
            addCriterion("surname_nick_jp not like", value, "surnameNickJp");
            return (Criteria) this;
        }

        public Criteria andSurnameNickJpIn(List<String> values) {
            addCriterion("surname_nick_jp in", values, "surnameNickJp");
            return (Criteria) this;
        }

        public Criteria andSurnameNickJpNotIn(List<String> values) {
            addCriterion("surname_nick_jp not in", values, "surnameNickJp");
            return (Criteria) this;
        }

        public Criteria andSurnameNickJpBetween(String value1, String value2) {
            addCriterion("surname_nick_jp between", value1, value2, "surnameNickJp");
            return (Criteria) this;
        }

        public Criteria andSurnameNickJpNotBetween(String value1, String value2) {
            addCriterion("surname_nick_jp not between", value1, value2, "surnameNickJp");
            return (Criteria) this;
        }

        public Criteria andSurnameNickKanaIsNull() {
            addCriterion("surname_nick_kana is null");
            return (Criteria) this;
        }

        public Criteria andSurnameNickKanaIsNotNull() {
            addCriterion("surname_nick_kana is not null");
            return (Criteria) this;
        }

        public Criteria andSurnameNickKanaEqualTo(String value) {
            addCriterion("surname_nick_kana =", value, "surnameNickKana");
            return (Criteria) this;
        }

        public Criteria andSurnameNickKanaNotEqualTo(String value) {
            addCriterion("surname_nick_kana <>", value, "surnameNickKana");
            return (Criteria) this;
        }

        public Criteria andSurnameNickKanaGreaterThan(String value) {
            addCriterion("surname_nick_kana >", value, "surnameNickKana");
            return (Criteria) this;
        }

        public Criteria andSurnameNickKanaGreaterThanOrEqualTo(String value) {
            addCriterion("surname_nick_kana >=", value, "surnameNickKana");
            return (Criteria) this;
        }

        public Criteria andSurnameNickKanaLessThan(String value) {
            addCriterion("surname_nick_kana <", value, "surnameNickKana");
            return (Criteria) this;
        }

        public Criteria andSurnameNickKanaLessThanOrEqualTo(String value) {
            addCriterion("surname_nick_kana <=", value, "surnameNickKana");
            return (Criteria) this;
        }

        public Criteria andSurnameNickKanaLike(String value) {
            addCriterion("surname_nick_kana like", value, "surnameNickKana");
            return (Criteria) this;
        }

        public Criteria andSurnameNickKanaNotLike(String value) {
            addCriterion("surname_nick_kana not like", value, "surnameNickKana");
            return (Criteria) this;
        }

        public Criteria andSurnameNickKanaIn(List<String> values) {
            addCriterion("surname_nick_kana in", values, "surnameNickKana");
            return (Criteria) this;
        }

        public Criteria andSurnameNickKanaNotIn(List<String> values) {
            addCriterion("surname_nick_kana not in", values, "surnameNickKana");
            return (Criteria) this;
        }

        public Criteria andSurnameNickKanaBetween(String value1, String value2) {
            addCriterion("surname_nick_kana between", value1, value2, "surnameNickKana");
            return (Criteria) this;
        }

        public Criteria andSurnameNickKanaNotBetween(String value1, String value2) {
            addCriterion("surname_nick_kana not between", value1, value2, "surnameNickKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickEnIsNull() {
            addCriterion("middlename_nick_en is null");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickEnIsNotNull() {
            addCriterion("middlename_nick_en is not null");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickEnEqualTo(String value) {
            addCriterion("middlename_nick_en =", value, "middlenameNickEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickEnNotEqualTo(String value) {
            addCriterion("middlename_nick_en <>", value, "middlenameNickEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickEnGreaterThan(String value) {
            addCriterion("middlename_nick_en >", value, "middlenameNickEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickEnGreaterThanOrEqualTo(String value) {
            addCriterion("middlename_nick_en >=", value, "middlenameNickEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickEnLessThan(String value) {
            addCriterion("middlename_nick_en <", value, "middlenameNickEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickEnLessThanOrEqualTo(String value) {
            addCriterion("middlename_nick_en <=", value, "middlenameNickEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickEnLike(String value) {
            addCriterion("middlename_nick_en like", value, "middlenameNickEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickEnNotLike(String value) {
            addCriterion("middlename_nick_en not like", value, "middlenameNickEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickEnIn(List<String> values) {
            addCriterion("middlename_nick_en in", values, "middlenameNickEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickEnNotIn(List<String> values) {
            addCriterion("middlename_nick_en not in", values, "middlenameNickEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickEnBetween(String value1, String value2) {
            addCriterion("middlename_nick_en between", value1, value2, "middlenameNickEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickEnNotBetween(String value1, String value2) {
            addCriterion("middlename_nick_en not between", value1, value2, "middlenameNickEn");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickJpIsNull() {
            addCriterion("middlename_nick_jp is null");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickJpIsNotNull() {
            addCriterion("middlename_nick_jp is not null");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickJpEqualTo(String value) {
            addCriterion("middlename_nick_jp =", value, "middlenameNickJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickJpNotEqualTo(String value) {
            addCriterion("middlename_nick_jp <>", value, "middlenameNickJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickJpGreaterThan(String value) {
            addCriterion("middlename_nick_jp >", value, "middlenameNickJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickJpGreaterThanOrEqualTo(String value) {
            addCriterion("middlename_nick_jp >=", value, "middlenameNickJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickJpLessThan(String value) {
            addCriterion("middlename_nick_jp <", value, "middlenameNickJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickJpLessThanOrEqualTo(String value) {
            addCriterion("middlename_nick_jp <=", value, "middlenameNickJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickJpLike(String value) {
            addCriterion("middlename_nick_jp like", value, "middlenameNickJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickJpNotLike(String value) {
            addCriterion("middlename_nick_jp not like", value, "middlenameNickJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickJpIn(List<String> values) {
            addCriterion("middlename_nick_jp in", values, "middlenameNickJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickJpNotIn(List<String> values) {
            addCriterion("middlename_nick_jp not in", values, "middlenameNickJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickJpBetween(String value1, String value2) {
            addCriterion("middlename_nick_jp between", value1, value2, "middlenameNickJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickJpNotBetween(String value1, String value2) {
            addCriterion("middlename_nick_jp not between", value1, value2, "middlenameNickJp");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickKanaIsNull() {
            addCriterion("middlename_nick_kana is null");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickKanaIsNotNull() {
            addCriterion("middlename_nick_kana is not null");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickKanaEqualTo(String value) {
            addCriterion("middlename_nick_kana =", value, "middlenameNickKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickKanaNotEqualTo(String value) {
            addCriterion("middlename_nick_kana <>", value, "middlenameNickKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickKanaGreaterThan(String value) {
            addCriterion("middlename_nick_kana >", value, "middlenameNickKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickKanaGreaterThanOrEqualTo(String value) {
            addCriterion("middlename_nick_kana >=", value, "middlenameNickKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickKanaLessThan(String value) {
            addCriterion("middlename_nick_kana <", value, "middlenameNickKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickKanaLessThanOrEqualTo(String value) {
            addCriterion("middlename_nick_kana <=", value, "middlenameNickKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickKanaLike(String value) {
            addCriterion("middlename_nick_kana like", value, "middlenameNickKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickKanaNotLike(String value) {
            addCriterion("middlename_nick_kana not like", value, "middlenameNickKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickKanaIn(List<String> values) {
            addCriterion("middlename_nick_kana in", values, "middlenameNickKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickKanaNotIn(List<String> values) {
            addCriterion("middlename_nick_kana not in", values, "middlenameNickKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickKanaBetween(String value1, String value2) {
            addCriterion("middlename_nick_kana between", value1, value2, "middlenameNickKana");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNickKanaNotBetween(String value1, String value2) {
            addCriterion("middlename_nick_kana not between", value1, value2, "middlenameNickKana");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckEnIsNull() {
            addCriterion("givenname_nuck_en is null");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckEnIsNotNull() {
            addCriterion("givenname_nuck_en is not null");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckEnEqualTo(String value) {
            addCriterion("givenname_nuck_en =", value, "givennameNuckEn");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckEnNotEqualTo(String value) {
            addCriterion("givenname_nuck_en <>", value, "givennameNuckEn");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckEnGreaterThan(String value) {
            addCriterion("givenname_nuck_en >", value, "givennameNuckEn");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckEnGreaterThanOrEqualTo(String value) {
            addCriterion("givenname_nuck_en >=", value, "givennameNuckEn");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckEnLessThan(String value) {
            addCriterion("givenname_nuck_en <", value, "givennameNuckEn");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckEnLessThanOrEqualTo(String value) {
            addCriterion("givenname_nuck_en <=", value, "givennameNuckEn");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckEnLike(String value) {
            addCriterion("givenname_nuck_en like", value, "givennameNuckEn");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckEnNotLike(String value) {
            addCriterion("givenname_nuck_en not like", value, "givennameNuckEn");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckEnIn(List<String> values) {
            addCriterion("givenname_nuck_en in", values, "givennameNuckEn");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckEnNotIn(List<String> values) {
            addCriterion("givenname_nuck_en not in", values, "givennameNuckEn");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckEnBetween(String value1, String value2) {
            addCriterion("givenname_nuck_en between", value1, value2, "givennameNuckEn");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckEnNotBetween(String value1, String value2) {
            addCriterion("givenname_nuck_en not between", value1, value2, "givennameNuckEn");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckJpIsNull() {
            addCriterion("givenname_nuck_jp is null");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckJpIsNotNull() {
            addCriterion("givenname_nuck_jp is not null");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckJpEqualTo(String value) {
            addCriterion("givenname_nuck_jp =", value, "givennameNuckJp");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckJpNotEqualTo(String value) {
            addCriterion("givenname_nuck_jp <>", value, "givennameNuckJp");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckJpGreaterThan(String value) {
            addCriterion("givenname_nuck_jp >", value, "givennameNuckJp");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckJpGreaterThanOrEqualTo(String value) {
            addCriterion("givenname_nuck_jp >=", value, "givennameNuckJp");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckJpLessThan(String value) {
            addCriterion("givenname_nuck_jp <", value, "givennameNuckJp");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckJpLessThanOrEqualTo(String value) {
            addCriterion("givenname_nuck_jp <=", value, "givennameNuckJp");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckJpLike(String value) {
            addCriterion("givenname_nuck_jp like", value, "givennameNuckJp");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckJpNotLike(String value) {
            addCriterion("givenname_nuck_jp not like", value, "givennameNuckJp");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckJpIn(List<String> values) {
            addCriterion("givenname_nuck_jp in", values, "givennameNuckJp");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckJpNotIn(List<String> values) {
            addCriterion("givenname_nuck_jp not in", values, "givennameNuckJp");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckJpBetween(String value1, String value2) {
            addCriterion("givenname_nuck_jp between", value1, value2, "givennameNuckJp");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckJpNotBetween(String value1, String value2) {
            addCriterion("givenname_nuck_jp not between", value1, value2, "givennameNuckJp");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckKanaIsNull() {
            addCriterion("givenname_nuck_kana is null");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckKanaIsNotNull() {
            addCriterion("givenname_nuck_kana is not null");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckKanaEqualTo(String value) {
            addCriterion("givenname_nuck_kana =", value, "givennameNuckKana");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckKanaNotEqualTo(String value) {
            addCriterion("givenname_nuck_kana <>", value, "givennameNuckKana");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckKanaGreaterThan(String value) {
            addCriterion("givenname_nuck_kana >", value, "givennameNuckKana");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckKanaGreaterThanOrEqualTo(String value) {
            addCriterion("givenname_nuck_kana >=", value, "givennameNuckKana");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckKanaLessThan(String value) {
            addCriterion("givenname_nuck_kana <", value, "givennameNuckKana");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckKanaLessThanOrEqualTo(String value) {
            addCriterion("givenname_nuck_kana <=", value, "givennameNuckKana");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckKanaLike(String value) {
            addCriterion("givenname_nuck_kana like", value, "givennameNuckKana");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckKanaNotLike(String value) {
            addCriterion("givenname_nuck_kana not like", value, "givennameNuckKana");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckKanaIn(List<String> values) {
            addCriterion("givenname_nuck_kana in", values, "givennameNuckKana");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckKanaNotIn(List<String> values) {
            addCriterion("givenname_nuck_kana not in", values, "givennameNuckKana");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckKanaBetween(String value1, String value2) {
            addCriterion("givenname_nuck_kana between", value1, value2, "givennameNuckKana");
            return (Criteria) this;
        }

        public Criteria andGivennameNuckKanaNotBetween(String value1, String value2) {
            addCriterion("givenname_nuck_kana not between", value1, value2, "givennameNuckKana");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andPositionCodeIsNull() {
            addCriterion("position_code is null");
            return (Criteria) this;
        }

        public Criteria andPositionCodeIsNotNull() {
            addCriterion("position_code is not null");
            return (Criteria) this;
        }

        public Criteria andPositionCodeEqualTo(String value) {
            addCriterion("position_code =", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotEqualTo(String value) {
            addCriterion("position_code <>", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeGreaterThan(String value) {
            addCriterion("position_code >", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("position_code >=", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeLessThan(String value) {
            addCriterion("position_code <", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeLessThanOrEqualTo(String value) {
            addCriterion("position_code <=", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeLike(String value) {
            addCriterion("position_code like", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotLike(String value) {
            addCriterion("position_code not like", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeIn(List<String> values) {
            addCriterion("position_code in", values, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotIn(List<String> values) {
            addCriterion("position_code not in", values, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeBetween(String value1, String value2) {
            addCriterion("position_code between", value1, value2, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotBetween(String value1, String value2) {
            addCriterion("position_code not between", value1, value2, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNull() {
            addCriterion("position_name is null");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNotNull() {
            addCriterion("position_name is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNameEqualTo(String value) {
            addCriterion("position_name =", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotEqualTo(String value) {
            addCriterion("position_name <>", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThan(String value) {
            addCriterion("position_name >", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThanOrEqualTo(String value) {
            addCriterion("position_name >=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThan(String value) {
            addCriterion("position_name <", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThanOrEqualTo(String value) {
            addCriterion("position_name <=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLike(String value) {
            addCriterion("position_name like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotLike(String value) {
            addCriterion("position_name not like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameIn(List<String> values) {
            addCriterion("position_name in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotIn(List<String> values) {
            addCriterion("position_name not in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameBetween(String value1, String value2) {
            addCriterion("position_name between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotBetween(String value1, String value2) {
            addCriterion("position_name not between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andGradeCodeIsNull() {
            addCriterion("grade_code is null");
            return (Criteria) this;
        }

        public Criteria andGradeCodeIsNotNull() {
            addCriterion("grade_code is not null");
            return (Criteria) this;
        }

        public Criteria andGradeCodeEqualTo(String value) {
            addCriterion("grade_code =", value, "gradeCode");
            return (Criteria) this;
        }

        public Criteria andGradeCodeNotEqualTo(String value) {
            addCriterion("grade_code <>", value, "gradeCode");
            return (Criteria) this;
        }

        public Criteria andGradeCodeGreaterThan(String value) {
            addCriterion("grade_code >", value, "gradeCode");
            return (Criteria) this;
        }

        public Criteria andGradeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("grade_code >=", value, "gradeCode");
            return (Criteria) this;
        }

        public Criteria andGradeCodeLessThan(String value) {
            addCriterion("grade_code <", value, "gradeCode");
            return (Criteria) this;
        }

        public Criteria andGradeCodeLessThanOrEqualTo(String value) {
            addCriterion("grade_code <=", value, "gradeCode");
            return (Criteria) this;
        }

        public Criteria andGradeCodeLike(String value) {
            addCriterion("grade_code like", value, "gradeCode");
            return (Criteria) this;
        }

        public Criteria andGradeCodeNotLike(String value) {
            addCriterion("grade_code not like", value, "gradeCode");
            return (Criteria) this;
        }

        public Criteria andGradeCodeIn(List<String> values) {
            addCriterion("grade_code in", values, "gradeCode");
            return (Criteria) this;
        }

        public Criteria andGradeCodeNotIn(List<String> values) {
            addCriterion("grade_code not in", values, "gradeCode");
            return (Criteria) this;
        }

        public Criteria andGradeCodeBetween(String value1, String value2) {
            addCriterion("grade_code between", value1, value2, "gradeCode");
            return (Criteria) this;
        }

        public Criteria andGradeCodeNotBetween(String value1, String value2) {
            addCriterion("grade_code not between", value1, value2, "gradeCode");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNull() {
            addCriterion("grade_name is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNotNull() {
            addCriterion("grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEqualTo(String value) {
            addCriterion("grade_name =", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotEqualTo(String value) {
            addCriterion("grade_name <>", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThan(String value) {
            addCriterion("grade_name >", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("grade_name >=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThan(String value) {
            addCriterion("grade_name <", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThanOrEqualTo(String value) {
            addCriterion("grade_name <=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLike(String value) {
            addCriterion("grade_name like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotLike(String value) {
            addCriterion("grade_name not like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameIn(List<String> values) {
            addCriterion("grade_name in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotIn(List<String> values) {
            addCriterion("grade_name not in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameBetween(String value1, String value2) {
            addCriterion("grade_name between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotBetween(String value1, String value2) {
            addCriterion("grade_name not between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNull() {
            addCriterion("organization_code is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNotNull() {
            addCriterion("organization_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeEqualTo(String value) {
            addCriterion("organization_code =", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotEqualTo(String value) {
            addCriterion("organization_code <>", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThan(String value) {
            addCriterion("organization_code >", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("organization_code >=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThan(String value) {
            addCriterion("organization_code <", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("organization_code <=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLike(String value) {
            addCriterion("organization_code like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotLike(String value) {
            addCriterion("organization_code not like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIn(List<String> values) {
            addCriterion("organization_code in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotIn(List<String> values) {
            addCriterion("organization_code not in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeBetween(String value1, String value2) {
            addCriterion("organization_code between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotBetween(String value1, String value2) {
            addCriterion("organization_code not between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIsNull() {
            addCriterion("location_code is null");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIsNotNull() {
            addCriterion("location_code is not null");
            return (Criteria) this;
        }

        public Criteria andLocationCodeEqualTo(String value) {
            addCriterion("location_code =", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotEqualTo(String value) {
            addCriterion("location_code <>", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeGreaterThan(String value) {
            addCriterion("location_code >", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("location_code >=", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLessThan(String value) {
            addCriterion("location_code <", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLessThanOrEqualTo(String value) {
            addCriterion("location_code <=", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLike(String value) {
            addCriterion("location_code like", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotLike(String value) {
            addCriterion("location_code not like", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIn(List<String> values) {
            addCriterion("location_code in", values, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotIn(List<String> values) {
            addCriterion("location_code not in", values, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeBetween(String value1, String value2) {
            addCriterion("location_code between", value1, value2, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotBetween(String value1, String value2) {
            addCriterion("location_code not between", value1, value2, "locationCode");
            return (Criteria) this;
        }

        public Criteria andKenmuInfoIsNull() {
            addCriterion("kenmu_info is null");
            return (Criteria) this;
        }

        public Criteria andKenmuInfoIsNotNull() {
            addCriterion("kenmu_info is not null");
            return (Criteria) this;
        }

        public Criteria andKenmuInfoEqualTo(String value) {
            addCriterion("kenmu_info =", value, "kenmuInfo");
            return (Criteria) this;
        }

        public Criteria andKenmuInfoNotEqualTo(String value) {
            addCriterion("kenmu_info <>", value, "kenmuInfo");
            return (Criteria) this;
        }

        public Criteria andKenmuInfoGreaterThan(String value) {
            addCriterion("kenmu_info >", value, "kenmuInfo");
            return (Criteria) this;
        }

        public Criteria andKenmuInfoGreaterThanOrEqualTo(String value) {
            addCriterion("kenmu_info >=", value, "kenmuInfo");
            return (Criteria) this;
        }

        public Criteria andKenmuInfoLessThan(String value) {
            addCriterion("kenmu_info <", value, "kenmuInfo");
            return (Criteria) this;
        }

        public Criteria andKenmuInfoLessThanOrEqualTo(String value) {
            addCriterion("kenmu_info <=", value, "kenmuInfo");
            return (Criteria) this;
        }

        public Criteria andKenmuInfoLike(String value) {
            addCriterion("kenmu_info like", value, "kenmuInfo");
            return (Criteria) this;
        }

        public Criteria andKenmuInfoNotLike(String value) {
            addCriterion("kenmu_info not like", value, "kenmuInfo");
            return (Criteria) this;
        }

        public Criteria andKenmuInfoIn(List<String> values) {
            addCriterion("kenmu_info in", values, "kenmuInfo");
            return (Criteria) this;
        }

        public Criteria andKenmuInfoNotIn(List<String> values) {
            addCriterion("kenmu_info not in", values, "kenmuInfo");
            return (Criteria) this;
        }

        public Criteria andKenmuInfoBetween(String value1, String value2) {
            addCriterion("kenmu_info between", value1, value2, "kenmuInfo");
            return (Criteria) this;
        }

        public Criteria andKenmuInfoNotBetween(String value1, String value2) {
            addCriterion("kenmu_info not between", value1, value2, "kenmuInfo");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIsNull() {
            addCriterion("register_id is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIsNotNull() {
            addCriterion("register_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdEqualTo(String value) {
            addCriterion("register_id =", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotEqualTo(String value) {
            addCriterion("register_id <>", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThan(String value) {
            addCriterion("register_id >", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThanOrEqualTo(String value) {
            addCriterion("register_id >=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThan(String value) {
            addCriterion("register_id <", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThanOrEqualTo(String value) {
            addCriterion("register_id <=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLike(String value) {
            addCriterion("register_id like", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotLike(String value) {
            addCriterion("register_id not like", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIn(List<String> values) {
            addCriterion("register_id in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotIn(List<String> values) {
            addCriterion("register_id not in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdBetween(String value1, String value2) {
            addCriterion("register_id between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotBetween(String value1, String value2) {
            addCriterion("register_id not between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegistTsIsNull() {
            addCriterion("regist_ts is null");
            return (Criteria) this;
        }

        public Criteria andRegistTsIsNotNull() {
            addCriterion("regist_ts is not null");
            return (Criteria) this;
        }

        public Criteria andRegistTsEqualTo(Date value) {
            addCriterion("regist_ts =", value, "registTs");
            return (Criteria) this;
        }

        public Criteria andRegistTsNotEqualTo(Date value) {
            addCriterion("regist_ts <>", value, "registTs");
            return (Criteria) this;
        }

        public Criteria andRegistTsGreaterThan(Date value) {
            addCriterion("regist_ts >", value, "registTs");
            return (Criteria) this;
        }

        public Criteria andRegistTsGreaterThanOrEqualTo(Date value) {
            addCriterion("regist_ts >=", value, "registTs");
            return (Criteria) this;
        }

        public Criteria andRegistTsLessThan(Date value) {
            addCriterion("regist_ts <", value, "registTs");
            return (Criteria) this;
        }

        public Criteria andRegistTsLessThanOrEqualTo(Date value) {
            addCriterion("regist_ts <=", value, "registTs");
            return (Criteria) this;
        }

        public Criteria andRegistTsIn(List<Date> values) {
            addCriterion("regist_ts in", values, "registTs");
            return (Criteria) this;
        }

        public Criteria andRegistTsNotIn(List<Date> values) {
            addCriterion("regist_ts not in", values, "registTs");
            return (Criteria) this;
        }

        public Criteria andRegistTsBetween(Date value1, Date value2) {
            addCriterion("regist_ts between", value1, value2, "registTs");
            return (Criteria) this;
        }

        public Criteria andRegistTsNotBetween(Date value1, Date value2) {
            addCriterion("regist_ts not between", value1, value2, "registTs");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNull() {
            addCriterion("updater_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNotNull() {
            addCriterion("updater_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdEqualTo(String value) {
            addCriterion("updater_id =", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotEqualTo(String value) {
            addCriterion("updater_id <>", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThan(String value) {
            addCriterion("updater_id >", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThanOrEqualTo(String value) {
            addCriterion("updater_id >=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThan(String value) {
            addCriterion("updater_id <", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThanOrEqualTo(String value) {
            addCriterion("updater_id <=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLike(String value) {
            addCriterion("updater_id like", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotLike(String value) {
            addCriterion("updater_id not like", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIn(List<String> values) {
            addCriterion("updater_id in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotIn(List<String> values) {
            addCriterion("updater_id not in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdBetween(String value1, String value2) {
            addCriterion("updater_id between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotBetween(String value1, String value2) {
            addCriterion("updater_id not between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdateTsIsNull() {
            addCriterion("update_ts is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTsIsNotNull() {
            addCriterion("update_ts is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTsEqualTo(Date value) {
            addCriterion("update_ts =", value, "updateTs");
            return (Criteria) this;
        }

        public Criteria andUpdateTsNotEqualTo(Date value) {
            addCriterion("update_ts <>", value, "updateTs");
            return (Criteria) this;
        }

        public Criteria andUpdateTsGreaterThan(Date value) {
            addCriterion("update_ts >", value, "updateTs");
            return (Criteria) this;
        }

        public Criteria andUpdateTsGreaterThanOrEqualTo(Date value) {
            addCriterion("update_ts >=", value, "updateTs");
            return (Criteria) this;
        }

        public Criteria andUpdateTsLessThan(Date value) {
            addCriterion("update_ts <", value, "updateTs");
            return (Criteria) this;
        }

        public Criteria andUpdateTsLessThanOrEqualTo(Date value) {
            addCriterion("update_ts <=", value, "updateTs");
            return (Criteria) this;
        }

        public Criteria andUpdateTsIn(List<Date> values) {
            addCriterion("update_ts in", values, "updateTs");
            return (Criteria) this;
        }

        public Criteria andUpdateTsNotIn(List<Date> values) {
            addCriterion("update_ts not in", values, "updateTs");
            return (Criteria) this;
        }

        public Criteria andUpdateTsBetween(Date value1, Date value2) {
            addCriterion("update_ts between", value1, value2, "updateTs");
            return (Criteria) this;
        }

        public Criteria andUpdateTsNotBetween(Date value1, Date value2) {
            addCriterion("update_ts not between", value1, value2, "updateTs");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr1IsNull() {
            addCriterion("expansion_attr1 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr1IsNotNull() {
            addCriterion("expansion_attr1 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr1EqualTo(String value) {
            addCriterion("expansion_attr1 =", value, "expansionAttr1");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr1NotEqualTo(String value) {
            addCriterion("expansion_attr1 <>", value, "expansionAttr1");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr1GreaterThan(String value) {
            addCriterion("expansion_attr1 >", value, "expansionAttr1");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr1GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr1 >=", value, "expansionAttr1");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr1LessThan(String value) {
            addCriterion("expansion_attr1 <", value, "expansionAttr1");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr1LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr1 <=", value, "expansionAttr1");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr1Like(String value) {
            addCriterion("expansion_attr1 like", value, "expansionAttr1");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr1NotLike(String value) {
            addCriterion("expansion_attr1 not like", value, "expansionAttr1");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr1In(List<String> values) {
            addCriterion("expansion_attr1 in", values, "expansionAttr1");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr1NotIn(List<String> values) {
            addCriterion("expansion_attr1 not in", values, "expansionAttr1");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr1Between(String value1, String value2) {
            addCriterion("expansion_attr1 between", value1, value2, "expansionAttr1");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr1NotBetween(String value1, String value2) {
            addCriterion("expansion_attr1 not between", value1, value2, "expansionAttr1");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr2IsNull() {
            addCriterion("expansion_attr2 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr2IsNotNull() {
            addCriterion("expansion_attr2 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr2EqualTo(String value) {
            addCriterion("expansion_attr2 =", value, "expansionAttr2");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr2NotEqualTo(String value) {
            addCriterion("expansion_attr2 <>", value, "expansionAttr2");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr2GreaterThan(String value) {
            addCriterion("expansion_attr2 >", value, "expansionAttr2");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr2GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr2 >=", value, "expansionAttr2");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr2LessThan(String value) {
            addCriterion("expansion_attr2 <", value, "expansionAttr2");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr2LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr2 <=", value, "expansionAttr2");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr2Like(String value) {
            addCriterion("expansion_attr2 like", value, "expansionAttr2");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr2NotLike(String value) {
            addCriterion("expansion_attr2 not like", value, "expansionAttr2");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr2In(List<String> values) {
            addCriterion("expansion_attr2 in", values, "expansionAttr2");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr2NotIn(List<String> values) {
            addCriterion("expansion_attr2 not in", values, "expansionAttr2");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr2Between(String value1, String value2) {
            addCriterion("expansion_attr2 between", value1, value2, "expansionAttr2");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr2NotBetween(String value1, String value2) {
            addCriterion("expansion_attr2 not between", value1, value2, "expansionAttr2");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr3IsNull() {
            addCriterion("expansion_attr3 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr3IsNotNull() {
            addCriterion("expansion_attr3 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr3EqualTo(String value) {
            addCriterion("expansion_attr3 =", value, "expansionAttr3");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr3NotEqualTo(String value) {
            addCriterion("expansion_attr3 <>", value, "expansionAttr3");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr3GreaterThan(String value) {
            addCriterion("expansion_attr3 >", value, "expansionAttr3");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr3GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr3 >=", value, "expansionAttr3");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr3LessThan(String value) {
            addCriterion("expansion_attr3 <", value, "expansionAttr3");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr3LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr3 <=", value, "expansionAttr3");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr3Like(String value) {
            addCriterion("expansion_attr3 like", value, "expansionAttr3");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr3NotLike(String value) {
            addCriterion("expansion_attr3 not like", value, "expansionAttr3");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr3In(List<String> values) {
            addCriterion("expansion_attr3 in", values, "expansionAttr3");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr3NotIn(List<String> values) {
            addCriterion("expansion_attr3 not in", values, "expansionAttr3");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr3Between(String value1, String value2) {
            addCriterion("expansion_attr3 between", value1, value2, "expansionAttr3");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr3NotBetween(String value1, String value2) {
            addCriterion("expansion_attr3 not between", value1, value2, "expansionAttr3");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr4IsNull() {
            addCriterion("expansion_attr4 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr4IsNotNull() {
            addCriterion("expansion_attr4 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr4EqualTo(String value) {
            addCriterion("expansion_attr4 =", value, "expansionAttr4");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr4NotEqualTo(String value) {
            addCriterion("expansion_attr4 <>", value, "expansionAttr4");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr4GreaterThan(String value) {
            addCriterion("expansion_attr4 >", value, "expansionAttr4");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr4GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr4 >=", value, "expansionAttr4");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr4LessThan(String value) {
            addCriterion("expansion_attr4 <", value, "expansionAttr4");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr4LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr4 <=", value, "expansionAttr4");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr4Like(String value) {
            addCriterion("expansion_attr4 like", value, "expansionAttr4");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr4NotLike(String value) {
            addCriterion("expansion_attr4 not like", value, "expansionAttr4");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr4In(List<String> values) {
            addCriterion("expansion_attr4 in", values, "expansionAttr4");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr4NotIn(List<String> values) {
            addCriterion("expansion_attr4 not in", values, "expansionAttr4");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr4Between(String value1, String value2) {
            addCriterion("expansion_attr4 between", value1, value2, "expansionAttr4");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr4NotBetween(String value1, String value2) {
            addCriterion("expansion_attr4 not between", value1, value2, "expansionAttr4");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr5IsNull() {
            addCriterion("expansion_attr5 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr5IsNotNull() {
            addCriterion("expansion_attr5 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr5EqualTo(String value) {
            addCriterion("expansion_attr5 =", value, "expansionAttr5");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr5NotEqualTo(String value) {
            addCriterion("expansion_attr5 <>", value, "expansionAttr5");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr5GreaterThan(String value) {
            addCriterion("expansion_attr5 >", value, "expansionAttr5");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr5GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr5 >=", value, "expansionAttr5");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr5LessThan(String value) {
            addCriterion("expansion_attr5 <", value, "expansionAttr5");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr5LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr5 <=", value, "expansionAttr5");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr5Like(String value) {
            addCriterion("expansion_attr5 like", value, "expansionAttr5");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr5NotLike(String value) {
            addCriterion("expansion_attr5 not like", value, "expansionAttr5");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr5In(List<String> values) {
            addCriterion("expansion_attr5 in", values, "expansionAttr5");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr5NotIn(List<String> values) {
            addCriterion("expansion_attr5 not in", values, "expansionAttr5");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr5Between(String value1, String value2) {
            addCriterion("expansion_attr5 between", value1, value2, "expansionAttr5");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr5NotBetween(String value1, String value2) {
            addCriterion("expansion_attr5 not between", value1, value2, "expansionAttr5");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr6IsNull() {
            addCriterion("expansion_attr6 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr6IsNotNull() {
            addCriterion("expansion_attr6 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr6EqualTo(String value) {
            addCriterion("expansion_attr6 =", value, "expansionAttr6");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr6NotEqualTo(String value) {
            addCriterion("expansion_attr6 <>", value, "expansionAttr6");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr6GreaterThan(String value) {
            addCriterion("expansion_attr6 >", value, "expansionAttr6");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr6GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr6 >=", value, "expansionAttr6");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr6LessThan(String value) {
            addCriterion("expansion_attr6 <", value, "expansionAttr6");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr6LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr6 <=", value, "expansionAttr6");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr6Like(String value) {
            addCriterion("expansion_attr6 like", value, "expansionAttr6");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr6NotLike(String value) {
            addCriterion("expansion_attr6 not like", value, "expansionAttr6");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr6In(List<String> values) {
            addCriterion("expansion_attr6 in", values, "expansionAttr6");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr6NotIn(List<String> values) {
            addCriterion("expansion_attr6 not in", values, "expansionAttr6");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr6Between(String value1, String value2) {
            addCriterion("expansion_attr6 between", value1, value2, "expansionAttr6");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr6NotBetween(String value1, String value2) {
            addCriterion("expansion_attr6 not between", value1, value2, "expansionAttr6");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr7IsNull() {
            addCriterion("expansion_attr7 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr7IsNotNull() {
            addCriterion("expansion_attr7 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr7EqualTo(String value) {
            addCriterion("expansion_attr7 =", value, "expansionAttr7");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr7NotEqualTo(String value) {
            addCriterion("expansion_attr7 <>", value, "expansionAttr7");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr7GreaterThan(String value) {
            addCriterion("expansion_attr7 >", value, "expansionAttr7");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr7GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr7 >=", value, "expansionAttr7");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr7LessThan(String value) {
            addCriterion("expansion_attr7 <", value, "expansionAttr7");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr7LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr7 <=", value, "expansionAttr7");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr7Like(String value) {
            addCriterion("expansion_attr7 like", value, "expansionAttr7");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr7NotLike(String value) {
            addCriterion("expansion_attr7 not like", value, "expansionAttr7");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr7In(List<String> values) {
            addCriterion("expansion_attr7 in", values, "expansionAttr7");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr7NotIn(List<String> values) {
            addCriterion("expansion_attr7 not in", values, "expansionAttr7");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr7Between(String value1, String value2) {
            addCriterion("expansion_attr7 between", value1, value2, "expansionAttr7");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr7NotBetween(String value1, String value2) {
            addCriterion("expansion_attr7 not between", value1, value2, "expansionAttr7");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr8IsNull() {
            addCriterion("expansion_attr8 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr8IsNotNull() {
            addCriterion("expansion_attr8 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr8EqualTo(String value) {
            addCriterion("expansion_attr8 =", value, "expansionAttr8");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr8NotEqualTo(String value) {
            addCriterion("expansion_attr8 <>", value, "expansionAttr8");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr8GreaterThan(String value) {
            addCriterion("expansion_attr8 >", value, "expansionAttr8");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr8GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr8 >=", value, "expansionAttr8");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr8LessThan(String value) {
            addCriterion("expansion_attr8 <", value, "expansionAttr8");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr8LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr8 <=", value, "expansionAttr8");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr8Like(String value) {
            addCriterion("expansion_attr8 like", value, "expansionAttr8");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr8NotLike(String value) {
            addCriterion("expansion_attr8 not like", value, "expansionAttr8");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr8In(List<String> values) {
            addCriterion("expansion_attr8 in", values, "expansionAttr8");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr8NotIn(List<String> values) {
            addCriterion("expansion_attr8 not in", values, "expansionAttr8");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr8Between(String value1, String value2) {
            addCriterion("expansion_attr8 between", value1, value2, "expansionAttr8");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr8NotBetween(String value1, String value2) {
            addCriterion("expansion_attr8 not between", value1, value2, "expansionAttr8");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr9IsNull() {
            addCriterion("expansion_attr9 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr9IsNotNull() {
            addCriterion("expansion_attr9 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr9EqualTo(String value) {
            addCriterion("expansion_attr9 =", value, "expansionAttr9");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr9NotEqualTo(String value) {
            addCriterion("expansion_attr9 <>", value, "expansionAttr9");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr9GreaterThan(String value) {
            addCriterion("expansion_attr9 >", value, "expansionAttr9");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr9GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr9 >=", value, "expansionAttr9");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr9LessThan(String value) {
            addCriterion("expansion_attr9 <", value, "expansionAttr9");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr9LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr9 <=", value, "expansionAttr9");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr9Like(String value) {
            addCriterion("expansion_attr9 like", value, "expansionAttr9");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr9NotLike(String value) {
            addCriterion("expansion_attr9 not like", value, "expansionAttr9");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr9In(List<String> values) {
            addCriterion("expansion_attr9 in", values, "expansionAttr9");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr9NotIn(List<String> values) {
            addCriterion("expansion_attr9 not in", values, "expansionAttr9");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr9Between(String value1, String value2) {
            addCriterion("expansion_attr9 between", value1, value2, "expansionAttr9");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr9NotBetween(String value1, String value2) {
            addCriterion("expansion_attr9 not between", value1, value2, "expansionAttr9");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr10IsNull() {
            addCriterion("expansion_attr10 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr10IsNotNull() {
            addCriterion("expansion_attr10 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr10EqualTo(String value) {
            addCriterion("expansion_attr10 =", value, "expansionAttr10");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr10NotEqualTo(String value) {
            addCriterion("expansion_attr10 <>", value, "expansionAttr10");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr10GreaterThan(String value) {
            addCriterion("expansion_attr10 >", value, "expansionAttr10");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr10GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr10 >=", value, "expansionAttr10");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr10LessThan(String value) {
            addCriterion("expansion_attr10 <", value, "expansionAttr10");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr10LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr10 <=", value, "expansionAttr10");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr10Like(String value) {
            addCriterion("expansion_attr10 like", value, "expansionAttr10");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr10NotLike(String value) {
            addCriterion("expansion_attr10 not like", value, "expansionAttr10");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr10In(List<String> values) {
            addCriterion("expansion_attr10 in", values, "expansionAttr10");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr10NotIn(List<String> values) {
            addCriterion("expansion_attr10 not in", values, "expansionAttr10");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr10Between(String value1, String value2) {
            addCriterion("expansion_attr10 between", value1, value2, "expansionAttr10");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr10NotBetween(String value1, String value2) {
            addCriterion("expansion_attr10 not between", value1, value2, "expansionAttr10");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr11IsNull() {
            addCriterion("expansion_attr11 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr11IsNotNull() {
            addCriterion("expansion_attr11 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr11EqualTo(String value) {
            addCriterion("expansion_attr11 =", value, "expansionAttr11");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr11NotEqualTo(String value) {
            addCriterion("expansion_attr11 <>", value, "expansionAttr11");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr11GreaterThan(String value) {
            addCriterion("expansion_attr11 >", value, "expansionAttr11");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr11GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr11 >=", value, "expansionAttr11");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr11LessThan(String value) {
            addCriterion("expansion_attr11 <", value, "expansionAttr11");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr11LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr11 <=", value, "expansionAttr11");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr11Like(String value) {
            addCriterion("expansion_attr11 like", value, "expansionAttr11");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr11NotLike(String value) {
            addCriterion("expansion_attr11 not like", value, "expansionAttr11");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr11In(List<String> values) {
            addCriterion("expansion_attr11 in", values, "expansionAttr11");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr11NotIn(List<String> values) {
            addCriterion("expansion_attr11 not in", values, "expansionAttr11");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr11Between(String value1, String value2) {
            addCriterion("expansion_attr11 between", value1, value2, "expansionAttr11");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr11NotBetween(String value1, String value2) {
            addCriterion("expansion_attr11 not between", value1, value2, "expansionAttr11");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr12IsNull() {
            addCriterion("expansion_attr12 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr12IsNotNull() {
            addCriterion("expansion_attr12 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr12EqualTo(String value) {
            addCriterion("expansion_attr12 =", value, "expansionAttr12");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr12NotEqualTo(String value) {
            addCriterion("expansion_attr12 <>", value, "expansionAttr12");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr12GreaterThan(String value) {
            addCriterion("expansion_attr12 >", value, "expansionAttr12");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr12GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr12 >=", value, "expansionAttr12");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr12LessThan(String value) {
            addCriterion("expansion_attr12 <", value, "expansionAttr12");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr12LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr12 <=", value, "expansionAttr12");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr12Like(String value) {
            addCriterion("expansion_attr12 like", value, "expansionAttr12");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr12NotLike(String value) {
            addCriterion("expansion_attr12 not like", value, "expansionAttr12");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr12In(List<String> values) {
            addCriterion("expansion_attr12 in", values, "expansionAttr12");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr12NotIn(List<String> values) {
            addCriterion("expansion_attr12 not in", values, "expansionAttr12");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr12Between(String value1, String value2) {
            addCriterion("expansion_attr12 between", value1, value2, "expansionAttr12");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr12NotBetween(String value1, String value2) {
            addCriterion("expansion_attr12 not between", value1, value2, "expansionAttr12");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr13IsNull() {
            addCriterion("expansion_attr13 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr13IsNotNull() {
            addCriterion("expansion_attr13 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr13EqualTo(String value) {
            addCriterion("expansion_attr13 =", value, "expansionAttr13");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr13NotEqualTo(String value) {
            addCriterion("expansion_attr13 <>", value, "expansionAttr13");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr13GreaterThan(String value) {
            addCriterion("expansion_attr13 >", value, "expansionAttr13");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr13GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr13 >=", value, "expansionAttr13");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr13LessThan(String value) {
            addCriterion("expansion_attr13 <", value, "expansionAttr13");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr13LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr13 <=", value, "expansionAttr13");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr13Like(String value) {
            addCriterion("expansion_attr13 like", value, "expansionAttr13");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr13NotLike(String value) {
            addCriterion("expansion_attr13 not like", value, "expansionAttr13");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr13In(List<String> values) {
            addCriterion("expansion_attr13 in", values, "expansionAttr13");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr13NotIn(List<String> values) {
            addCriterion("expansion_attr13 not in", values, "expansionAttr13");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr13Between(String value1, String value2) {
            addCriterion("expansion_attr13 between", value1, value2, "expansionAttr13");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr13NotBetween(String value1, String value2) {
            addCriterion("expansion_attr13 not between", value1, value2, "expansionAttr13");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr14IsNull() {
            addCriterion("expansion_attr14 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr14IsNotNull() {
            addCriterion("expansion_attr14 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr14EqualTo(String value) {
            addCriterion("expansion_attr14 =", value, "expansionAttr14");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr14NotEqualTo(String value) {
            addCriterion("expansion_attr14 <>", value, "expansionAttr14");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr14GreaterThan(String value) {
            addCriterion("expansion_attr14 >", value, "expansionAttr14");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr14GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr14 >=", value, "expansionAttr14");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr14LessThan(String value) {
            addCriterion("expansion_attr14 <", value, "expansionAttr14");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr14LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr14 <=", value, "expansionAttr14");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr14Like(String value) {
            addCriterion("expansion_attr14 like", value, "expansionAttr14");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr14NotLike(String value) {
            addCriterion("expansion_attr14 not like", value, "expansionAttr14");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr14In(List<String> values) {
            addCriterion("expansion_attr14 in", values, "expansionAttr14");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr14NotIn(List<String> values) {
            addCriterion("expansion_attr14 not in", values, "expansionAttr14");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr14Between(String value1, String value2) {
            addCriterion("expansion_attr14 between", value1, value2, "expansionAttr14");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr14NotBetween(String value1, String value2) {
            addCriterion("expansion_attr14 not between", value1, value2, "expansionAttr14");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr15IsNull() {
            addCriterion("expansion_attr15 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr15IsNotNull() {
            addCriterion("expansion_attr15 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr15EqualTo(String value) {
            addCriterion("expansion_attr15 =", value, "expansionAttr15");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr15NotEqualTo(String value) {
            addCriterion("expansion_attr15 <>", value, "expansionAttr15");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr15GreaterThan(String value) {
            addCriterion("expansion_attr15 >", value, "expansionAttr15");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr15GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr15 >=", value, "expansionAttr15");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr15LessThan(String value) {
            addCriterion("expansion_attr15 <", value, "expansionAttr15");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr15LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr15 <=", value, "expansionAttr15");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr15Like(String value) {
            addCriterion("expansion_attr15 like", value, "expansionAttr15");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr15NotLike(String value) {
            addCriterion("expansion_attr15 not like", value, "expansionAttr15");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr15In(List<String> values) {
            addCriterion("expansion_attr15 in", values, "expansionAttr15");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr15NotIn(List<String> values) {
            addCriterion("expansion_attr15 not in", values, "expansionAttr15");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr15Between(String value1, String value2) {
            addCriterion("expansion_attr15 between", value1, value2, "expansionAttr15");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr15NotBetween(String value1, String value2) {
            addCriterion("expansion_attr15 not between", value1, value2, "expansionAttr15");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr16IsNull() {
            addCriterion("expansion_attr16 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr16IsNotNull() {
            addCriterion("expansion_attr16 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr16EqualTo(String value) {
            addCriterion("expansion_attr16 =", value, "expansionAttr16");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr16NotEqualTo(String value) {
            addCriterion("expansion_attr16 <>", value, "expansionAttr16");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr16GreaterThan(String value) {
            addCriterion("expansion_attr16 >", value, "expansionAttr16");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr16GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr16 >=", value, "expansionAttr16");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr16LessThan(String value) {
            addCriterion("expansion_attr16 <", value, "expansionAttr16");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr16LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr16 <=", value, "expansionAttr16");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr16Like(String value) {
            addCriterion("expansion_attr16 like", value, "expansionAttr16");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr16NotLike(String value) {
            addCriterion("expansion_attr16 not like", value, "expansionAttr16");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr16In(List<String> values) {
            addCriterion("expansion_attr16 in", values, "expansionAttr16");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr16NotIn(List<String> values) {
            addCriterion("expansion_attr16 not in", values, "expansionAttr16");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr16Between(String value1, String value2) {
            addCriterion("expansion_attr16 between", value1, value2, "expansionAttr16");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr16NotBetween(String value1, String value2) {
            addCriterion("expansion_attr16 not between", value1, value2, "expansionAttr16");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr17IsNull() {
            addCriterion("expansion_attr17 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr17IsNotNull() {
            addCriterion("expansion_attr17 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr17EqualTo(String value) {
            addCriterion("expansion_attr17 =", value, "expansionAttr17");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr17NotEqualTo(String value) {
            addCriterion("expansion_attr17 <>", value, "expansionAttr17");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr17GreaterThan(String value) {
            addCriterion("expansion_attr17 >", value, "expansionAttr17");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr17GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr17 >=", value, "expansionAttr17");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr17LessThan(String value) {
            addCriterion("expansion_attr17 <", value, "expansionAttr17");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr17LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr17 <=", value, "expansionAttr17");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr17Like(String value) {
            addCriterion("expansion_attr17 like", value, "expansionAttr17");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr17NotLike(String value) {
            addCriterion("expansion_attr17 not like", value, "expansionAttr17");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr17In(List<String> values) {
            addCriterion("expansion_attr17 in", values, "expansionAttr17");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr17NotIn(List<String> values) {
            addCriterion("expansion_attr17 not in", values, "expansionAttr17");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr17Between(String value1, String value2) {
            addCriterion("expansion_attr17 between", value1, value2, "expansionAttr17");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr17NotBetween(String value1, String value2) {
            addCriterion("expansion_attr17 not between", value1, value2, "expansionAttr17");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr18IsNull() {
            addCriterion("expansion_attr18 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr18IsNotNull() {
            addCriterion("expansion_attr18 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr18EqualTo(String value) {
            addCriterion("expansion_attr18 =", value, "expansionAttr18");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr18NotEqualTo(String value) {
            addCriterion("expansion_attr18 <>", value, "expansionAttr18");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr18GreaterThan(String value) {
            addCriterion("expansion_attr18 >", value, "expansionAttr18");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr18GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr18 >=", value, "expansionAttr18");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr18LessThan(String value) {
            addCriterion("expansion_attr18 <", value, "expansionAttr18");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr18LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr18 <=", value, "expansionAttr18");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr18Like(String value) {
            addCriterion("expansion_attr18 like", value, "expansionAttr18");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr18NotLike(String value) {
            addCriterion("expansion_attr18 not like", value, "expansionAttr18");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr18In(List<String> values) {
            addCriterion("expansion_attr18 in", values, "expansionAttr18");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr18NotIn(List<String> values) {
            addCriterion("expansion_attr18 not in", values, "expansionAttr18");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr18Between(String value1, String value2) {
            addCriterion("expansion_attr18 between", value1, value2, "expansionAttr18");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr18NotBetween(String value1, String value2) {
            addCriterion("expansion_attr18 not between", value1, value2, "expansionAttr18");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr19IsNull() {
            addCriterion("expansion_attr19 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr19IsNotNull() {
            addCriterion("expansion_attr19 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr19EqualTo(String value) {
            addCriterion("expansion_attr19 =", value, "expansionAttr19");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr19NotEqualTo(String value) {
            addCriterion("expansion_attr19 <>", value, "expansionAttr19");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr19GreaterThan(String value) {
            addCriterion("expansion_attr19 >", value, "expansionAttr19");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr19GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr19 >=", value, "expansionAttr19");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr19LessThan(String value) {
            addCriterion("expansion_attr19 <", value, "expansionAttr19");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr19LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr19 <=", value, "expansionAttr19");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr19Like(String value) {
            addCriterion("expansion_attr19 like", value, "expansionAttr19");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr19NotLike(String value) {
            addCriterion("expansion_attr19 not like", value, "expansionAttr19");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr19In(List<String> values) {
            addCriterion("expansion_attr19 in", values, "expansionAttr19");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr19NotIn(List<String> values) {
            addCriterion("expansion_attr19 not in", values, "expansionAttr19");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr19Between(String value1, String value2) {
            addCriterion("expansion_attr19 between", value1, value2, "expansionAttr19");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr19NotBetween(String value1, String value2) {
            addCriterion("expansion_attr19 not between", value1, value2, "expansionAttr19");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr20IsNull() {
            addCriterion("expansion_attr20 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr20IsNotNull() {
            addCriterion("expansion_attr20 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr20EqualTo(String value) {
            addCriterion("expansion_attr20 =", value, "expansionAttr20");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr20NotEqualTo(String value) {
            addCriterion("expansion_attr20 <>", value, "expansionAttr20");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr20GreaterThan(String value) {
            addCriterion("expansion_attr20 >", value, "expansionAttr20");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr20GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr20 >=", value, "expansionAttr20");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr20LessThan(String value) {
            addCriterion("expansion_attr20 <", value, "expansionAttr20");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr20LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr20 <=", value, "expansionAttr20");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr20Like(String value) {
            addCriterion("expansion_attr20 like", value, "expansionAttr20");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr20NotLike(String value) {
            addCriterion("expansion_attr20 not like", value, "expansionAttr20");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr20In(List<String> values) {
            addCriterion("expansion_attr20 in", values, "expansionAttr20");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr20NotIn(List<String> values) {
            addCriterion("expansion_attr20 not in", values, "expansionAttr20");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr20Between(String value1, String value2) {
            addCriterion("expansion_attr20 between", value1, value2, "expansionAttr20");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr20NotBetween(String value1, String value2) {
            addCriterion("expansion_attr20 not between", value1, value2, "expansionAttr20");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr21IsNull() {
            addCriterion("expansion_attr21 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr21IsNotNull() {
            addCriterion("expansion_attr21 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr21EqualTo(String value) {
            addCriterion("expansion_attr21 =", value, "expansionAttr21");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr21NotEqualTo(String value) {
            addCriterion("expansion_attr21 <>", value, "expansionAttr21");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr21GreaterThan(String value) {
            addCriterion("expansion_attr21 >", value, "expansionAttr21");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr21GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr21 >=", value, "expansionAttr21");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr21LessThan(String value) {
            addCriterion("expansion_attr21 <", value, "expansionAttr21");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr21LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr21 <=", value, "expansionAttr21");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr21Like(String value) {
            addCriterion("expansion_attr21 like", value, "expansionAttr21");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr21NotLike(String value) {
            addCriterion("expansion_attr21 not like", value, "expansionAttr21");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr21In(List<String> values) {
            addCriterion("expansion_attr21 in", values, "expansionAttr21");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr21NotIn(List<String> values) {
            addCriterion("expansion_attr21 not in", values, "expansionAttr21");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr21Between(String value1, String value2) {
            addCriterion("expansion_attr21 between", value1, value2, "expansionAttr21");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr21NotBetween(String value1, String value2) {
            addCriterion("expansion_attr21 not between", value1, value2, "expansionAttr21");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr22IsNull() {
            addCriterion("expansion_attr22 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr22IsNotNull() {
            addCriterion("expansion_attr22 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr22EqualTo(String value) {
            addCriterion("expansion_attr22 =", value, "expansionAttr22");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr22NotEqualTo(String value) {
            addCriterion("expansion_attr22 <>", value, "expansionAttr22");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr22GreaterThan(String value) {
            addCriterion("expansion_attr22 >", value, "expansionAttr22");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr22GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr22 >=", value, "expansionAttr22");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr22LessThan(String value) {
            addCriterion("expansion_attr22 <", value, "expansionAttr22");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr22LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr22 <=", value, "expansionAttr22");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr22Like(String value) {
            addCriterion("expansion_attr22 like", value, "expansionAttr22");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr22NotLike(String value) {
            addCriterion("expansion_attr22 not like", value, "expansionAttr22");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr22In(List<String> values) {
            addCriterion("expansion_attr22 in", values, "expansionAttr22");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr22NotIn(List<String> values) {
            addCriterion("expansion_attr22 not in", values, "expansionAttr22");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr22Between(String value1, String value2) {
            addCriterion("expansion_attr22 between", value1, value2, "expansionAttr22");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr22NotBetween(String value1, String value2) {
            addCriterion("expansion_attr22 not between", value1, value2, "expansionAttr22");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr23IsNull() {
            addCriterion("expansion_attr23 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr23IsNotNull() {
            addCriterion("expansion_attr23 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr23EqualTo(String value) {
            addCriterion("expansion_attr23 =", value, "expansionAttr23");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr23NotEqualTo(String value) {
            addCriterion("expansion_attr23 <>", value, "expansionAttr23");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr23GreaterThan(String value) {
            addCriterion("expansion_attr23 >", value, "expansionAttr23");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr23GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr23 >=", value, "expansionAttr23");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr23LessThan(String value) {
            addCriterion("expansion_attr23 <", value, "expansionAttr23");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr23LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr23 <=", value, "expansionAttr23");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr23Like(String value) {
            addCriterion("expansion_attr23 like", value, "expansionAttr23");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr23NotLike(String value) {
            addCriterion("expansion_attr23 not like", value, "expansionAttr23");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr23In(List<String> values) {
            addCriterion("expansion_attr23 in", values, "expansionAttr23");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr23NotIn(List<String> values) {
            addCriterion("expansion_attr23 not in", values, "expansionAttr23");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr23Between(String value1, String value2) {
            addCriterion("expansion_attr23 between", value1, value2, "expansionAttr23");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr23NotBetween(String value1, String value2) {
            addCriterion("expansion_attr23 not between", value1, value2, "expansionAttr23");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr24IsNull() {
            addCriterion("expansion_attr24 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr24IsNotNull() {
            addCriterion("expansion_attr24 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr24EqualTo(String value) {
            addCriterion("expansion_attr24 =", value, "expansionAttr24");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr24NotEqualTo(String value) {
            addCriterion("expansion_attr24 <>", value, "expansionAttr24");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr24GreaterThan(String value) {
            addCriterion("expansion_attr24 >", value, "expansionAttr24");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr24GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr24 >=", value, "expansionAttr24");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr24LessThan(String value) {
            addCriterion("expansion_attr24 <", value, "expansionAttr24");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr24LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr24 <=", value, "expansionAttr24");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr24Like(String value) {
            addCriterion("expansion_attr24 like", value, "expansionAttr24");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr24NotLike(String value) {
            addCriterion("expansion_attr24 not like", value, "expansionAttr24");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr24In(List<String> values) {
            addCriterion("expansion_attr24 in", values, "expansionAttr24");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr24NotIn(List<String> values) {
            addCriterion("expansion_attr24 not in", values, "expansionAttr24");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr24Between(String value1, String value2) {
            addCriterion("expansion_attr24 between", value1, value2, "expansionAttr24");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr24NotBetween(String value1, String value2) {
            addCriterion("expansion_attr24 not between", value1, value2, "expansionAttr24");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr25IsNull() {
            addCriterion("expansion_attr25 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr25IsNotNull() {
            addCriterion("expansion_attr25 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr25EqualTo(String value) {
            addCriterion("expansion_attr25 =", value, "expansionAttr25");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr25NotEqualTo(String value) {
            addCriterion("expansion_attr25 <>", value, "expansionAttr25");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr25GreaterThan(String value) {
            addCriterion("expansion_attr25 >", value, "expansionAttr25");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr25GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr25 >=", value, "expansionAttr25");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr25LessThan(String value) {
            addCriterion("expansion_attr25 <", value, "expansionAttr25");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr25LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr25 <=", value, "expansionAttr25");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr25Like(String value) {
            addCriterion("expansion_attr25 like", value, "expansionAttr25");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr25NotLike(String value) {
            addCriterion("expansion_attr25 not like", value, "expansionAttr25");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr25In(List<String> values) {
            addCriterion("expansion_attr25 in", values, "expansionAttr25");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr25NotIn(List<String> values) {
            addCriterion("expansion_attr25 not in", values, "expansionAttr25");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr25Between(String value1, String value2) {
            addCriterion("expansion_attr25 between", value1, value2, "expansionAttr25");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr25NotBetween(String value1, String value2) {
            addCriterion("expansion_attr25 not between", value1, value2, "expansionAttr25");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr26IsNull() {
            addCriterion("expansion_attr26 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr26IsNotNull() {
            addCriterion("expansion_attr26 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr26EqualTo(String value) {
            addCriterion("expansion_attr26 =", value, "expansionAttr26");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr26NotEqualTo(String value) {
            addCriterion("expansion_attr26 <>", value, "expansionAttr26");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr26GreaterThan(String value) {
            addCriterion("expansion_attr26 >", value, "expansionAttr26");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr26GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr26 >=", value, "expansionAttr26");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr26LessThan(String value) {
            addCriterion("expansion_attr26 <", value, "expansionAttr26");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr26LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr26 <=", value, "expansionAttr26");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr26Like(String value) {
            addCriterion("expansion_attr26 like", value, "expansionAttr26");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr26NotLike(String value) {
            addCriterion("expansion_attr26 not like", value, "expansionAttr26");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr26In(List<String> values) {
            addCriterion("expansion_attr26 in", values, "expansionAttr26");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr26NotIn(List<String> values) {
            addCriterion("expansion_attr26 not in", values, "expansionAttr26");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr26Between(String value1, String value2) {
            addCriterion("expansion_attr26 between", value1, value2, "expansionAttr26");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr26NotBetween(String value1, String value2) {
            addCriterion("expansion_attr26 not between", value1, value2, "expansionAttr26");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr27IsNull() {
            addCriterion("expansion_attr27 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr27IsNotNull() {
            addCriterion("expansion_attr27 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr27EqualTo(String value) {
            addCriterion("expansion_attr27 =", value, "expansionAttr27");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr27NotEqualTo(String value) {
            addCriterion("expansion_attr27 <>", value, "expansionAttr27");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr27GreaterThan(String value) {
            addCriterion("expansion_attr27 >", value, "expansionAttr27");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr27GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr27 >=", value, "expansionAttr27");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr27LessThan(String value) {
            addCriterion("expansion_attr27 <", value, "expansionAttr27");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr27LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr27 <=", value, "expansionAttr27");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr27Like(String value) {
            addCriterion("expansion_attr27 like", value, "expansionAttr27");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr27NotLike(String value) {
            addCriterion("expansion_attr27 not like", value, "expansionAttr27");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr27In(List<String> values) {
            addCriterion("expansion_attr27 in", values, "expansionAttr27");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr27NotIn(List<String> values) {
            addCriterion("expansion_attr27 not in", values, "expansionAttr27");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr27Between(String value1, String value2) {
            addCriterion("expansion_attr27 between", value1, value2, "expansionAttr27");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr27NotBetween(String value1, String value2) {
            addCriterion("expansion_attr27 not between", value1, value2, "expansionAttr27");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr28IsNull() {
            addCriterion("expansion_attr28 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr28IsNotNull() {
            addCriterion("expansion_attr28 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr28EqualTo(String value) {
            addCriterion("expansion_attr28 =", value, "expansionAttr28");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr28NotEqualTo(String value) {
            addCriterion("expansion_attr28 <>", value, "expansionAttr28");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr28GreaterThan(String value) {
            addCriterion("expansion_attr28 >", value, "expansionAttr28");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr28GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr28 >=", value, "expansionAttr28");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr28LessThan(String value) {
            addCriterion("expansion_attr28 <", value, "expansionAttr28");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr28LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr28 <=", value, "expansionAttr28");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr28Like(String value) {
            addCriterion("expansion_attr28 like", value, "expansionAttr28");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr28NotLike(String value) {
            addCriterion("expansion_attr28 not like", value, "expansionAttr28");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr28In(List<String> values) {
            addCriterion("expansion_attr28 in", values, "expansionAttr28");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr28NotIn(List<String> values) {
            addCriterion("expansion_attr28 not in", values, "expansionAttr28");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr28Between(String value1, String value2) {
            addCriterion("expansion_attr28 between", value1, value2, "expansionAttr28");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr28NotBetween(String value1, String value2) {
            addCriterion("expansion_attr28 not between", value1, value2, "expansionAttr28");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr29IsNull() {
            addCriterion("expansion_attr29 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr29IsNotNull() {
            addCriterion("expansion_attr29 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr29EqualTo(String value) {
            addCriterion("expansion_attr29 =", value, "expansionAttr29");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr29NotEqualTo(String value) {
            addCriterion("expansion_attr29 <>", value, "expansionAttr29");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr29GreaterThan(String value) {
            addCriterion("expansion_attr29 >", value, "expansionAttr29");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr29GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr29 >=", value, "expansionAttr29");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr29LessThan(String value) {
            addCriterion("expansion_attr29 <", value, "expansionAttr29");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr29LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr29 <=", value, "expansionAttr29");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr29Like(String value) {
            addCriterion("expansion_attr29 like", value, "expansionAttr29");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr29NotLike(String value) {
            addCriterion("expansion_attr29 not like", value, "expansionAttr29");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr29In(List<String> values) {
            addCriterion("expansion_attr29 in", values, "expansionAttr29");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr29NotIn(List<String> values) {
            addCriterion("expansion_attr29 not in", values, "expansionAttr29");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr29Between(String value1, String value2) {
            addCriterion("expansion_attr29 between", value1, value2, "expansionAttr29");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr29NotBetween(String value1, String value2) {
            addCriterion("expansion_attr29 not between", value1, value2, "expansionAttr29");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr30IsNull() {
            addCriterion("expansion_attr30 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr30IsNotNull() {
            addCriterion("expansion_attr30 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr30EqualTo(String value) {
            addCriterion("expansion_attr30 =", value, "expansionAttr30");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr30NotEqualTo(String value) {
            addCriterion("expansion_attr30 <>", value, "expansionAttr30");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr30GreaterThan(String value) {
            addCriterion("expansion_attr30 >", value, "expansionAttr30");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr30GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr30 >=", value, "expansionAttr30");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr30LessThan(String value) {
            addCriterion("expansion_attr30 <", value, "expansionAttr30");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr30LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr30 <=", value, "expansionAttr30");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr30Like(String value) {
            addCriterion("expansion_attr30 like", value, "expansionAttr30");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr30NotLike(String value) {
            addCriterion("expansion_attr30 not like", value, "expansionAttr30");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr30In(List<String> values) {
            addCriterion("expansion_attr30 in", values, "expansionAttr30");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr30NotIn(List<String> values) {
            addCriterion("expansion_attr30 not in", values, "expansionAttr30");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr30Between(String value1, String value2) {
            addCriterion("expansion_attr30 between", value1, value2, "expansionAttr30");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr30NotBetween(String value1, String value2) {
            addCriterion("expansion_attr30 not between", value1, value2, "expansionAttr30");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr31IsNull() {
            addCriterion("expansion_attr31 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr31IsNotNull() {
            addCriterion("expansion_attr31 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr31EqualTo(String value) {
            addCriterion("expansion_attr31 =", value, "expansionAttr31");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr31NotEqualTo(String value) {
            addCriterion("expansion_attr31 <>", value, "expansionAttr31");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr31GreaterThan(String value) {
            addCriterion("expansion_attr31 >", value, "expansionAttr31");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr31GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr31 >=", value, "expansionAttr31");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr31LessThan(String value) {
            addCriterion("expansion_attr31 <", value, "expansionAttr31");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr31LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr31 <=", value, "expansionAttr31");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr31Like(String value) {
            addCriterion("expansion_attr31 like", value, "expansionAttr31");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr31NotLike(String value) {
            addCriterion("expansion_attr31 not like", value, "expansionAttr31");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr31In(List<String> values) {
            addCriterion("expansion_attr31 in", values, "expansionAttr31");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr31NotIn(List<String> values) {
            addCriterion("expansion_attr31 not in", values, "expansionAttr31");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr31Between(String value1, String value2) {
            addCriterion("expansion_attr31 between", value1, value2, "expansionAttr31");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr31NotBetween(String value1, String value2) {
            addCriterion("expansion_attr31 not between", value1, value2, "expansionAttr31");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr32IsNull() {
            addCriterion("expansion_attr32 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr32IsNotNull() {
            addCriterion("expansion_attr32 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr32EqualTo(String value) {
            addCriterion("expansion_attr32 =", value, "expansionAttr32");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr32NotEqualTo(String value) {
            addCriterion("expansion_attr32 <>", value, "expansionAttr32");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr32GreaterThan(String value) {
            addCriterion("expansion_attr32 >", value, "expansionAttr32");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr32GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr32 >=", value, "expansionAttr32");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr32LessThan(String value) {
            addCriterion("expansion_attr32 <", value, "expansionAttr32");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr32LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr32 <=", value, "expansionAttr32");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr32Like(String value) {
            addCriterion("expansion_attr32 like", value, "expansionAttr32");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr32NotLike(String value) {
            addCriterion("expansion_attr32 not like", value, "expansionAttr32");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr32In(List<String> values) {
            addCriterion("expansion_attr32 in", values, "expansionAttr32");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr32NotIn(List<String> values) {
            addCriterion("expansion_attr32 not in", values, "expansionAttr32");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr32Between(String value1, String value2) {
            addCriterion("expansion_attr32 between", value1, value2, "expansionAttr32");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr32NotBetween(String value1, String value2) {
            addCriterion("expansion_attr32 not between", value1, value2, "expansionAttr32");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr33IsNull() {
            addCriterion("expansion_attr33 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr33IsNotNull() {
            addCriterion("expansion_attr33 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr33EqualTo(String value) {
            addCriterion("expansion_attr33 =", value, "expansionAttr33");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr33NotEqualTo(String value) {
            addCriterion("expansion_attr33 <>", value, "expansionAttr33");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr33GreaterThan(String value) {
            addCriterion("expansion_attr33 >", value, "expansionAttr33");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr33GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr33 >=", value, "expansionAttr33");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr33LessThan(String value) {
            addCriterion("expansion_attr33 <", value, "expansionAttr33");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr33LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr33 <=", value, "expansionAttr33");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr33Like(String value) {
            addCriterion("expansion_attr33 like", value, "expansionAttr33");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr33NotLike(String value) {
            addCriterion("expansion_attr33 not like", value, "expansionAttr33");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr33In(List<String> values) {
            addCriterion("expansion_attr33 in", values, "expansionAttr33");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr33NotIn(List<String> values) {
            addCriterion("expansion_attr33 not in", values, "expansionAttr33");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr33Between(String value1, String value2) {
            addCriterion("expansion_attr33 between", value1, value2, "expansionAttr33");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr33NotBetween(String value1, String value2) {
            addCriterion("expansion_attr33 not between", value1, value2, "expansionAttr33");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr34IsNull() {
            addCriterion("expansion_attr34 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr34IsNotNull() {
            addCriterion("expansion_attr34 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr34EqualTo(String value) {
            addCriterion("expansion_attr34 =", value, "expansionAttr34");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr34NotEqualTo(String value) {
            addCriterion("expansion_attr34 <>", value, "expansionAttr34");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr34GreaterThan(String value) {
            addCriterion("expansion_attr34 >", value, "expansionAttr34");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr34GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr34 >=", value, "expansionAttr34");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr34LessThan(String value) {
            addCriterion("expansion_attr34 <", value, "expansionAttr34");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr34LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr34 <=", value, "expansionAttr34");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr34Like(String value) {
            addCriterion("expansion_attr34 like", value, "expansionAttr34");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr34NotLike(String value) {
            addCriterion("expansion_attr34 not like", value, "expansionAttr34");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr34In(List<String> values) {
            addCriterion("expansion_attr34 in", values, "expansionAttr34");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr34NotIn(List<String> values) {
            addCriterion("expansion_attr34 not in", values, "expansionAttr34");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr34Between(String value1, String value2) {
            addCriterion("expansion_attr34 between", value1, value2, "expansionAttr34");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr34NotBetween(String value1, String value2) {
            addCriterion("expansion_attr34 not between", value1, value2, "expansionAttr34");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr35IsNull() {
            addCriterion("expansion_attr35 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr35IsNotNull() {
            addCriterion("expansion_attr35 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr35EqualTo(String value) {
            addCriterion("expansion_attr35 =", value, "expansionAttr35");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr35NotEqualTo(String value) {
            addCriterion("expansion_attr35 <>", value, "expansionAttr35");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr35GreaterThan(String value) {
            addCriterion("expansion_attr35 >", value, "expansionAttr35");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr35GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr35 >=", value, "expansionAttr35");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr35LessThan(String value) {
            addCriterion("expansion_attr35 <", value, "expansionAttr35");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr35LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr35 <=", value, "expansionAttr35");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr35Like(String value) {
            addCriterion("expansion_attr35 like", value, "expansionAttr35");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr35NotLike(String value) {
            addCriterion("expansion_attr35 not like", value, "expansionAttr35");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr35In(List<String> values) {
            addCriterion("expansion_attr35 in", values, "expansionAttr35");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr35NotIn(List<String> values) {
            addCriterion("expansion_attr35 not in", values, "expansionAttr35");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr35Between(String value1, String value2) {
            addCriterion("expansion_attr35 between", value1, value2, "expansionAttr35");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr35NotBetween(String value1, String value2) {
            addCriterion("expansion_attr35 not between", value1, value2, "expansionAttr35");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr36IsNull() {
            addCriterion("expansion_attr36 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr36IsNotNull() {
            addCriterion("expansion_attr36 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr36EqualTo(String value) {
            addCriterion("expansion_attr36 =", value, "expansionAttr36");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr36NotEqualTo(String value) {
            addCriterion("expansion_attr36 <>", value, "expansionAttr36");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr36GreaterThan(String value) {
            addCriterion("expansion_attr36 >", value, "expansionAttr36");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr36GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr36 >=", value, "expansionAttr36");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr36LessThan(String value) {
            addCriterion("expansion_attr36 <", value, "expansionAttr36");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr36LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr36 <=", value, "expansionAttr36");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr36Like(String value) {
            addCriterion("expansion_attr36 like", value, "expansionAttr36");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr36NotLike(String value) {
            addCriterion("expansion_attr36 not like", value, "expansionAttr36");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr36In(List<String> values) {
            addCriterion("expansion_attr36 in", values, "expansionAttr36");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr36NotIn(List<String> values) {
            addCriterion("expansion_attr36 not in", values, "expansionAttr36");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr36Between(String value1, String value2) {
            addCriterion("expansion_attr36 between", value1, value2, "expansionAttr36");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr36NotBetween(String value1, String value2) {
            addCriterion("expansion_attr36 not between", value1, value2, "expansionAttr36");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr37IsNull() {
            addCriterion("expansion_attr37 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr37IsNotNull() {
            addCriterion("expansion_attr37 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr37EqualTo(String value) {
            addCriterion("expansion_attr37 =", value, "expansionAttr37");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr37NotEqualTo(String value) {
            addCriterion("expansion_attr37 <>", value, "expansionAttr37");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr37GreaterThan(String value) {
            addCriterion("expansion_attr37 >", value, "expansionAttr37");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr37GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr37 >=", value, "expansionAttr37");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr37LessThan(String value) {
            addCriterion("expansion_attr37 <", value, "expansionAttr37");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr37LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr37 <=", value, "expansionAttr37");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr37Like(String value) {
            addCriterion("expansion_attr37 like", value, "expansionAttr37");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr37NotLike(String value) {
            addCriterion("expansion_attr37 not like", value, "expansionAttr37");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr37In(List<String> values) {
            addCriterion("expansion_attr37 in", values, "expansionAttr37");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr37NotIn(List<String> values) {
            addCriterion("expansion_attr37 not in", values, "expansionAttr37");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr37Between(String value1, String value2) {
            addCriterion("expansion_attr37 between", value1, value2, "expansionAttr37");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr37NotBetween(String value1, String value2) {
            addCriterion("expansion_attr37 not between", value1, value2, "expansionAttr37");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr38IsNull() {
            addCriterion("expansion_attr38 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr38IsNotNull() {
            addCriterion("expansion_attr38 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr38EqualTo(String value) {
            addCriterion("expansion_attr38 =", value, "expansionAttr38");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr38NotEqualTo(String value) {
            addCriterion("expansion_attr38 <>", value, "expansionAttr38");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr38GreaterThan(String value) {
            addCriterion("expansion_attr38 >", value, "expansionAttr38");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr38GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr38 >=", value, "expansionAttr38");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr38LessThan(String value) {
            addCriterion("expansion_attr38 <", value, "expansionAttr38");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr38LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr38 <=", value, "expansionAttr38");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr38Like(String value) {
            addCriterion("expansion_attr38 like", value, "expansionAttr38");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr38NotLike(String value) {
            addCriterion("expansion_attr38 not like", value, "expansionAttr38");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr38In(List<String> values) {
            addCriterion("expansion_attr38 in", values, "expansionAttr38");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr38NotIn(List<String> values) {
            addCriterion("expansion_attr38 not in", values, "expansionAttr38");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr38Between(String value1, String value2) {
            addCriterion("expansion_attr38 between", value1, value2, "expansionAttr38");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr38NotBetween(String value1, String value2) {
            addCriterion("expansion_attr38 not between", value1, value2, "expansionAttr38");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr39IsNull() {
            addCriterion("expansion_attr39 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr39IsNotNull() {
            addCriterion("expansion_attr39 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr39EqualTo(String value) {
            addCriterion("expansion_attr39 =", value, "expansionAttr39");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr39NotEqualTo(String value) {
            addCriterion("expansion_attr39 <>", value, "expansionAttr39");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr39GreaterThan(String value) {
            addCriterion("expansion_attr39 >", value, "expansionAttr39");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr39GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr39 >=", value, "expansionAttr39");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr39LessThan(String value) {
            addCriterion("expansion_attr39 <", value, "expansionAttr39");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr39LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr39 <=", value, "expansionAttr39");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr39Like(String value) {
            addCriterion("expansion_attr39 like", value, "expansionAttr39");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr39NotLike(String value) {
            addCriterion("expansion_attr39 not like", value, "expansionAttr39");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr39In(List<String> values) {
            addCriterion("expansion_attr39 in", values, "expansionAttr39");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr39NotIn(List<String> values) {
            addCriterion("expansion_attr39 not in", values, "expansionAttr39");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr39Between(String value1, String value2) {
            addCriterion("expansion_attr39 between", value1, value2, "expansionAttr39");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr39NotBetween(String value1, String value2) {
            addCriterion("expansion_attr39 not between", value1, value2, "expansionAttr39");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr40IsNull() {
            addCriterion("expansion_attr40 is null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr40IsNotNull() {
            addCriterion("expansion_attr40 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr40EqualTo(String value) {
            addCriterion("expansion_attr40 =", value, "expansionAttr40");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr40NotEqualTo(String value) {
            addCriterion("expansion_attr40 <>", value, "expansionAttr40");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr40GreaterThan(String value) {
            addCriterion("expansion_attr40 >", value, "expansionAttr40");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr40GreaterThanOrEqualTo(String value) {
            addCriterion("expansion_attr40 >=", value, "expansionAttr40");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr40LessThan(String value) {
            addCriterion("expansion_attr40 <", value, "expansionAttr40");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr40LessThanOrEqualTo(String value) {
            addCriterion("expansion_attr40 <=", value, "expansionAttr40");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr40Like(String value) {
            addCriterion("expansion_attr40 like", value, "expansionAttr40");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr40NotLike(String value) {
            addCriterion("expansion_attr40 not like", value, "expansionAttr40");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr40In(List<String> values) {
            addCriterion("expansion_attr40 in", values, "expansionAttr40");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr40NotIn(List<String> values) {
            addCriterion("expansion_attr40 not in", values, "expansionAttr40");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr40Between(String value1, String value2) {
            addCriterion("expansion_attr40 between", value1, value2, "expansionAttr40");
            return (Criteria) this;
        }

        public Criteria andExpansionAttr40NotBetween(String value1, String value2) {
            addCriterion("expansion_attr40 not between", value1, value2, "expansionAttr40");
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