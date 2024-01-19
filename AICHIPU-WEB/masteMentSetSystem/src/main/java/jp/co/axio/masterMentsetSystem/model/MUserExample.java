package jp.co.axio.masterMentsetSystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MUserExample() {
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

        public Criteria andUpdateKbnIsNull() {
            addCriterion("update_kbn is null");
            return (Criteria) this;
        }

        public Criteria andUpdateKbnIsNotNull() {
            addCriterion("update_kbn is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateKbnEqualTo(String value) {
            addCriterion("update_kbn =", value, "updateKbn");
            return (Criteria) this;
        }

        public Criteria andUpdateKbnNotEqualTo(String value) {
            addCriterion("update_kbn <>", value, "updateKbn");
            return (Criteria) this;
        }

        public Criteria andUpdateKbnGreaterThan(String value) {
            addCriterion("update_kbn >", value, "updateKbn");
            return (Criteria) this;
        }

        public Criteria andUpdateKbnGreaterThanOrEqualTo(String value) {
            addCriterion("update_kbn >=", value, "updateKbn");
            return (Criteria) this;
        }

        public Criteria andUpdateKbnLessThan(String value) {
            addCriterion("update_kbn <", value, "updateKbn");
            return (Criteria) this;
        }

        public Criteria andUpdateKbnLessThanOrEqualTo(String value) {
            addCriterion("update_kbn <=", value, "updateKbn");
            return (Criteria) this;
        }

        public Criteria andUpdateKbnLike(String value) {
            addCriterion("update_kbn like", value, "updateKbn");
            return (Criteria) this;
        }

        public Criteria andUpdateKbnNotLike(String value) {
            addCriterion("update_kbn not like", value, "updateKbn");
            return (Criteria) this;
        }

        public Criteria andUpdateKbnIn(List<String> values) {
            addCriterion("update_kbn in", values, "updateKbn");
            return (Criteria) this;
        }

        public Criteria andUpdateKbnNotIn(List<String> values) {
            addCriterion("update_kbn not in", values, "updateKbn");
            return (Criteria) this;
        }

        public Criteria andUpdateKbnBetween(String value1, String value2) {
            addCriterion("update_kbn between", value1, value2, "updateKbn");
            return (Criteria) this;
        }

        public Criteria andUpdateKbnNotBetween(String value1, String value2) {
            addCriterion("update_kbn not between", value1, value2, "updateKbn");
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