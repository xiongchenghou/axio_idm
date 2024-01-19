package jp.co.axio.masterMentsetSystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VAdminMaintenanceEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VAdminMaintenanceEntityExample() {
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

        public Criteria andFutureUserFlagIsNull() {
            addCriterion("future_user_flag is null");
            return (Criteria) this;
        }

        public Criteria andFutureUserFlagIsNotNull() {
            addCriterion("future_user_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFutureUserFlagEqualTo(String value) {
            addCriterion("future_user_flag =", value, "futureUserFlag");
            return (Criteria) this;
        }

        public Criteria andFutureUserFlagNotEqualTo(String value) {
            addCriterion("future_user_flag <>", value, "futureUserFlag");
            return (Criteria) this;
        }

        public Criteria andFutureUserFlagGreaterThan(String value) {
            addCriterion("future_user_flag >", value, "futureUserFlag");
            return (Criteria) this;
        }

        public Criteria andFutureUserFlagGreaterThanOrEqualTo(String value) {
            addCriterion("future_user_flag >=", value, "futureUserFlag");
            return (Criteria) this;
        }

        public Criteria andFutureUserFlagLessThan(String value) {
            addCriterion("future_user_flag <", value, "futureUserFlag");
            return (Criteria) this;
        }

        public Criteria andFutureUserFlagLessThanOrEqualTo(String value) {
            addCriterion("future_user_flag <=", value, "futureUserFlag");
            return (Criteria) this;
        }

        public Criteria andFutureUserFlagLike(String value) {
            addCriterion("future_user_flag like", value, "futureUserFlag");
            return (Criteria) this;
        }

        public Criteria andFutureUserFlagNotLike(String value) {
            addCriterion("future_user_flag not like", value, "futureUserFlag");
            return (Criteria) this;
        }

        public Criteria andFutureUserFlagIn(List<String> values) {
            addCriterion("future_user_flag in", values, "futureUserFlag");
            return (Criteria) this;
        }

        public Criteria andFutureUserFlagNotIn(List<String> values) {
            addCriterion("future_user_flag not in", values, "futureUserFlag");
            return (Criteria) this;
        }

        public Criteria andFutureUserFlagBetween(String value1, String value2) {
            addCriterion("future_user_flag between", value1, value2, "futureUserFlag");
            return (Criteria) this;
        }

        public Criteria andFutureUserFlagNotBetween(String value1, String value2) {
            addCriterion("future_user_flag not between", value1, value2, "futureUserFlag");
            return (Criteria) this;
        }

        public Criteria andReflectionFlagIsNull() {
            addCriterion("reflection_flag is null");
            return (Criteria) this;
        }

        public Criteria andReflectionFlagIsNotNull() {
            addCriterion("reflection_flag is not null");
            return (Criteria) this;
        }

        public Criteria andReflectionFlagEqualTo(String value) {
            addCriterion("reflection_flag =", value, "reflectionFlag");
            return (Criteria) this;
        }

        public Criteria andReflectionFlagNotEqualTo(String value) {
            addCriterion("reflection_flag <>", value, "reflectionFlag");
            return (Criteria) this;
        }

        public Criteria andReflectionFlagGreaterThan(String value) {
            addCriterion("reflection_flag >", value, "reflectionFlag");
            return (Criteria) this;
        }

        public Criteria andReflectionFlagGreaterThanOrEqualTo(String value) {
            addCriterion("reflection_flag >=", value, "reflectionFlag");
            return (Criteria) this;
        }

        public Criteria andReflectionFlagLessThan(String value) {
            addCriterion("reflection_flag <", value, "reflectionFlag");
            return (Criteria) this;
        }

        public Criteria andReflectionFlagLessThanOrEqualTo(String value) {
            addCriterion("reflection_flag <=", value, "reflectionFlag");
            return (Criteria) this;
        }

        public Criteria andReflectionFlagLike(String value) {
            addCriterion("reflection_flag like", value, "reflectionFlag");
            return (Criteria) this;
        }

        public Criteria andReflectionFlagNotLike(String value) {
            addCriterion("reflection_flag not like", value, "reflectionFlag");
            return (Criteria) this;
        }

        public Criteria andReflectionFlagIn(List<String> values) {
            addCriterion("reflection_flag in", values, "reflectionFlag");
            return (Criteria) this;
        }

        public Criteria andReflectionFlagNotIn(List<String> values) {
            addCriterion("reflection_flag not in", values, "reflectionFlag");
            return (Criteria) this;
        }

        public Criteria andReflectionFlagBetween(String value1, String value2) {
            addCriterion("reflection_flag between", value1, value2, "reflectionFlag");
            return (Criteria) this;
        }

        public Criteria andReflectionFlagNotBetween(String value1, String value2) {
            addCriterion("reflection_flag not between", value1, value2, "reflectionFlag");
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

        public Criteria andEmploymentNameIsNull() {
            addCriterion("employment_name is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentNameIsNotNull() {
            addCriterion("employment_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentNameEqualTo(String value) {
            addCriterion("employment_name =", value, "employmentName");
            return (Criteria) this;
        }

        public Criteria andEmploymentNameNotEqualTo(String value) {
            addCriterion("employment_name <>", value, "employmentName");
            return (Criteria) this;
        }

        public Criteria andEmploymentNameGreaterThan(String value) {
            addCriterion("employment_name >", value, "employmentName");
            return (Criteria) this;
        }

        public Criteria andEmploymentNameGreaterThanOrEqualTo(String value) {
            addCriterion("employment_name >=", value, "employmentName");
            return (Criteria) this;
        }

        public Criteria andEmploymentNameLessThan(String value) {
            addCriterion("employment_name <", value, "employmentName");
            return (Criteria) this;
        }

        public Criteria andEmploymentNameLessThanOrEqualTo(String value) {
            addCriterion("employment_name <=", value, "employmentName");
            return (Criteria) this;
        }

        public Criteria andEmploymentNameLike(String value) {
            addCriterion("employment_name like", value, "employmentName");
            return (Criteria) this;
        }

        public Criteria andEmploymentNameNotLike(String value) {
            addCriterion("employment_name not like", value, "employmentName");
            return (Criteria) this;
        }

        public Criteria andEmploymentNameIn(List<String> values) {
            addCriterion("employment_name in", values, "employmentName");
            return (Criteria) this;
        }

        public Criteria andEmploymentNameNotIn(List<String> values) {
            addCriterion("employment_name not in", values, "employmentName");
            return (Criteria) this;
        }

        public Criteria andEmploymentNameBetween(String value1, String value2) {
            addCriterion("employment_name between", value1, value2, "employmentName");
            return (Criteria) this;
        }

        public Criteria andEmploymentNameNotBetween(String value1, String value2) {
            addCriterion("employment_name not between", value1, value2, "employmentName");
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

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNull() {
            addCriterion("region_code is null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNotNull() {
            addCriterion("region_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeEqualTo(String value) {
            addCriterion("region_code =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(String value) {
            addCriterion("region_code <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(String value) {
            addCriterion("region_code >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("region_code >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(String value) {
            addCriterion("region_code <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("region_code <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLike(String value) {
            addCriterion("region_code like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotLike(String value) {
            addCriterion("region_code not like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<String> values) {
            addCriterion("region_code in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<String> values) {
            addCriterion("region_code not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(String value1, String value2) {
            addCriterion("region_code between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(String value1, String value2) {
            addCriterion("region_code not between", value1, value2, "regionCode");
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

        public Criteria andCompanyNameEnIsNull() {
            addCriterion("company_name_en is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnIsNotNull() {
            addCriterion("company_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnEqualTo(String value) {
            addCriterion("company_name_en =", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnNotEqualTo(String value) {
            addCriterion("company_name_en <>", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnGreaterThan(String value) {
            addCriterion("company_name_en >", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("company_name_en >=", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnLessThan(String value) {
            addCriterion("company_name_en <", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnLessThanOrEqualTo(String value) {
            addCriterion("company_name_en <=", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnLike(String value) {
            addCriterion("company_name_en like", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnNotLike(String value) {
            addCriterion("company_name_en not like", value, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnIn(List<String> values) {
            addCriterion("company_name_en in", values, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnNotIn(List<String> values) {
            addCriterion("company_name_en not in", values, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnBetween(String value1, String value2) {
            addCriterion("company_name_en between", value1, value2, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEnNotBetween(String value1, String value2) {
            addCriterion("company_name_en not between", value1, value2, "companyNameEn");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJpIsNull() {
            addCriterion("company_name_jp is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJpIsNotNull() {
            addCriterion("company_name_jp is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJpEqualTo(String value) {
            addCriterion("company_name_jp =", value, "companyNameJp");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJpNotEqualTo(String value) {
            addCriterion("company_name_jp <>", value, "companyNameJp");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJpGreaterThan(String value) {
            addCriterion("company_name_jp >", value, "companyNameJp");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJpGreaterThanOrEqualTo(String value) {
            addCriterion("company_name_jp >=", value, "companyNameJp");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJpLessThan(String value) {
            addCriterion("company_name_jp <", value, "companyNameJp");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJpLessThanOrEqualTo(String value) {
            addCriterion("company_name_jp <=", value, "companyNameJp");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJpLike(String value) {
            addCriterion("company_name_jp like", value, "companyNameJp");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJpNotLike(String value) {
            addCriterion("company_name_jp not like", value, "companyNameJp");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJpIn(List<String> values) {
            addCriterion("company_name_jp in", values, "companyNameJp");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJpNotIn(List<String> values) {
            addCriterion("company_name_jp not in", values, "companyNameJp");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJpBetween(String value1, String value2) {
            addCriterion("company_name_jp between", value1, value2, "companyNameJp");
            return (Criteria) this;
        }

        public Criteria andCompanyNameJpNotBetween(String value1, String value2) {
            addCriterion("company_name_jp not between", value1, value2, "companyNameJp");
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

        public Criteria andOrganizationNameEnIsNull() {
            addCriterion("organization_name_en is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEnIsNotNull() {
            addCriterion("organization_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEnEqualTo(String value) {
            addCriterion("organization_name_en =", value, "organizationNameEn");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEnNotEqualTo(String value) {
            addCriterion("organization_name_en <>", value, "organizationNameEn");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEnGreaterThan(String value) {
            addCriterion("organization_name_en >", value, "organizationNameEn");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("organization_name_en >=", value, "organizationNameEn");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEnLessThan(String value) {
            addCriterion("organization_name_en <", value, "organizationNameEn");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEnLessThanOrEqualTo(String value) {
            addCriterion("organization_name_en <=", value, "organizationNameEn");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEnLike(String value) {
            addCriterion("organization_name_en like", value, "organizationNameEn");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEnNotLike(String value) {
            addCriterion("organization_name_en not like", value, "organizationNameEn");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEnIn(List<String> values) {
            addCriterion("organization_name_en in", values, "organizationNameEn");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEnNotIn(List<String> values) {
            addCriterion("organization_name_en not in", values, "organizationNameEn");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEnBetween(String value1, String value2) {
            addCriterion("organization_name_en between", value1, value2, "organizationNameEn");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameEnNotBetween(String value1, String value2) {
            addCriterion("organization_name_en not between", value1, value2, "organizationNameEn");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameJpIsNull() {
            addCriterion("organization_name_jp is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameJpIsNotNull() {
            addCriterion("organization_name_jp is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameJpEqualTo(String value) {
            addCriterion("organization_name_jp =", value, "organizationNameJp");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameJpNotEqualTo(String value) {
            addCriterion("organization_name_jp <>", value, "organizationNameJp");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameJpGreaterThan(String value) {
            addCriterion("organization_name_jp >", value, "organizationNameJp");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameJpGreaterThanOrEqualTo(String value) {
            addCriterion("organization_name_jp >=", value, "organizationNameJp");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameJpLessThan(String value) {
            addCriterion("organization_name_jp <", value, "organizationNameJp");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameJpLessThanOrEqualTo(String value) {
            addCriterion("organization_name_jp <=", value, "organizationNameJp");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameJpLike(String value) {
            addCriterion("organization_name_jp like", value, "organizationNameJp");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameJpNotLike(String value) {
            addCriterion("organization_name_jp not like", value, "organizationNameJp");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameJpIn(List<String> values) {
            addCriterion("organization_name_jp in", values, "organizationNameJp");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameJpNotIn(List<String> values) {
            addCriterion("organization_name_jp not in", values, "organizationNameJp");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameJpBetween(String value1, String value2) {
            addCriterion("organization_name_jp between", value1, value2, "organizationNameJp");
            return (Criteria) this;
        }

        public Criteria andOrganizationNameJpNotBetween(String value1, String value2) {
            addCriterion("organization_name_jp not between", value1, value2, "organizationNameJp");
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

        public Criteria andPositionNameEnIsNull() {
            addCriterion("position_name_en is null");
            return (Criteria) this;
        }

        public Criteria andPositionNameEnIsNotNull() {
            addCriterion("position_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNameEnEqualTo(String value) {
            addCriterion("position_name_en =", value, "positionNameEn");
            return (Criteria) this;
        }

        public Criteria andPositionNameEnNotEqualTo(String value) {
            addCriterion("position_name_en <>", value, "positionNameEn");
            return (Criteria) this;
        }

        public Criteria andPositionNameEnGreaterThan(String value) {
            addCriterion("position_name_en >", value, "positionNameEn");
            return (Criteria) this;
        }

        public Criteria andPositionNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("position_name_en >=", value, "positionNameEn");
            return (Criteria) this;
        }

        public Criteria andPositionNameEnLessThan(String value) {
            addCriterion("position_name_en <", value, "positionNameEn");
            return (Criteria) this;
        }

        public Criteria andPositionNameEnLessThanOrEqualTo(String value) {
            addCriterion("position_name_en <=", value, "positionNameEn");
            return (Criteria) this;
        }

        public Criteria andPositionNameEnLike(String value) {
            addCriterion("position_name_en like", value, "positionNameEn");
            return (Criteria) this;
        }

        public Criteria andPositionNameEnNotLike(String value) {
            addCriterion("position_name_en not like", value, "positionNameEn");
            return (Criteria) this;
        }

        public Criteria andPositionNameEnIn(List<String> values) {
            addCriterion("position_name_en in", values, "positionNameEn");
            return (Criteria) this;
        }

        public Criteria andPositionNameEnNotIn(List<String> values) {
            addCriterion("position_name_en not in", values, "positionNameEn");
            return (Criteria) this;
        }

        public Criteria andPositionNameEnBetween(String value1, String value2) {
            addCriterion("position_name_en between", value1, value2, "positionNameEn");
            return (Criteria) this;
        }

        public Criteria andPositionNameEnNotBetween(String value1, String value2) {
            addCriterion("position_name_en not between", value1, value2, "positionNameEn");
            return (Criteria) this;
        }

        public Criteria andPositionNameJpIsNull() {
            addCriterion("position_name_jp is null");
            return (Criteria) this;
        }

        public Criteria andPositionNameJpIsNotNull() {
            addCriterion("position_name_jp is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNameJpEqualTo(String value) {
            addCriterion("position_name_jp =", value, "positionNameJp");
            return (Criteria) this;
        }

        public Criteria andPositionNameJpNotEqualTo(String value) {
            addCriterion("position_name_jp <>", value, "positionNameJp");
            return (Criteria) this;
        }

        public Criteria andPositionNameJpGreaterThan(String value) {
            addCriterion("position_name_jp >", value, "positionNameJp");
            return (Criteria) this;
        }

        public Criteria andPositionNameJpGreaterThanOrEqualTo(String value) {
            addCriterion("position_name_jp >=", value, "positionNameJp");
            return (Criteria) this;
        }

        public Criteria andPositionNameJpLessThan(String value) {
            addCriterion("position_name_jp <", value, "positionNameJp");
            return (Criteria) this;
        }

        public Criteria andPositionNameJpLessThanOrEqualTo(String value) {
            addCriterion("position_name_jp <=", value, "positionNameJp");
            return (Criteria) this;
        }

        public Criteria andPositionNameJpLike(String value) {
            addCriterion("position_name_jp like", value, "positionNameJp");
            return (Criteria) this;
        }

        public Criteria andPositionNameJpNotLike(String value) {
            addCriterion("position_name_jp not like", value, "positionNameJp");
            return (Criteria) this;
        }

        public Criteria andPositionNameJpIn(List<String> values) {
            addCriterion("position_name_jp in", values, "positionNameJp");
            return (Criteria) this;
        }

        public Criteria andPositionNameJpNotIn(List<String> values) {
            addCriterion("position_name_jp not in", values, "positionNameJp");
            return (Criteria) this;
        }

        public Criteria andPositionNameJpBetween(String value1, String value2) {
            addCriterion("position_name_jp between", value1, value2, "positionNameJp");
            return (Criteria) this;
        }

        public Criteria andPositionNameJpNotBetween(String value1, String value2) {
            addCriterion("position_name_jp not between", value1, value2, "positionNameJp");
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

        public Criteria andGradeNameEnIsNull() {
            addCriterion("grade_name_en is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEnIsNotNull() {
            addCriterion("grade_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEnEqualTo(String value) {
            addCriterion("grade_name_en =", value, "gradeNameEn");
            return (Criteria) this;
        }

        public Criteria andGradeNameEnNotEqualTo(String value) {
            addCriterion("grade_name_en <>", value, "gradeNameEn");
            return (Criteria) this;
        }

        public Criteria andGradeNameEnGreaterThan(String value) {
            addCriterion("grade_name_en >", value, "gradeNameEn");
            return (Criteria) this;
        }

        public Criteria andGradeNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("grade_name_en >=", value, "gradeNameEn");
            return (Criteria) this;
        }

        public Criteria andGradeNameEnLessThan(String value) {
            addCriterion("grade_name_en <", value, "gradeNameEn");
            return (Criteria) this;
        }

        public Criteria andGradeNameEnLessThanOrEqualTo(String value) {
            addCriterion("grade_name_en <=", value, "gradeNameEn");
            return (Criteria) this;
        }

        public Criteria andGradeNameEnLike(String value) {
            addCriterion("grade_name_en like", value, "gradeNameEn");
            return (Criteria) this;
        }

        public Criteria andGradeNameEnNotLike(String value) {
            addCriterion("grade_name_en not like", value, "gradeNameEn");
            return (Criteria) this;
        }

        public Criteria andGradeNameEnIn(List<String> values) {
            addCriterion("grade_name_en in", values, "gradeNameEn");
            return (Criteria) this;
        }

        public Criteria andGradeNameEnNotIn(List<String> values) {
            addCriterion("grade_name_en not in", values, "gradeNameEn");
            return (Criteria) this;
        }

        public Criteria andGradeNameEnBetween(String value1, String value2) {
            addCriterion("grade_name_en between", value1, value2, "gradeNameEn");
            return (Criteria) this;
        }

        public Criteria andGradeNameEnNotBetween(String value1, String value2) {
            addCriterion("grade_name_en not between", value1, value2, "gradeNameEn");
            return (Criteria) this;
        }

        public Criteria andGradeNameJpIsNull() {
            addCriterion("grade_name_jp is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameJpIsNotNull() {
            addCriterion("grade_name_jp is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameJpEqualTo(String value) {
            addCriterion("grade_name_jp =", value, "gradeNameJp");
            return (Criteria) this;
        }

        public Criteria andGradeNameJpNotEqualTo(String value) {
            addCriterion("grade_name_jp <>", value, "gradeNameJp");
            return (Criteria) this;
        }

        public Criteria andGradeNameJpGreaterThan(String value) {
            addCriterion("grade_name_jp >", value, "gradeNameJp");
            return (Criteria) this;
        }

        public Criteria andGradeNameJpGreaterThanOrEqualTo(String value) {
            addCriterion("grade_name_jp >=", value, "gradeNameJp");
            return (Criteria) this;
        }

        public Criteria andGradeNameJpLessThan(String value) {
            addCriterion("grade_name_jp <", value, "gradeNameJp");
            return (Criteria) this;
        }

        public Criteria andGradeNameJpLessThanOrEqualTo(String value) {
            addCriterion("grade_name_jp <=", value, "gradeNameJp");
            return (Criteria) this;
        }

        public Criteria andGradeNameJpLike(String value) {
            addCriterion("grade_name_jp like", value, "gradeNameJp");
            return (Criteria) this;
        }

        public Criteria andGradeNameJpNotLike(String value) {
            addCriterion("grade_name_jp not like", value, "gradeNameJp");
            return (Criteria) this;
        }

        public Criteria andGradeNameJpIn(List<String> values) {
            addCriterion("grade_name_jp in", values, "gradeNameJp");
            return (Criteria) this;
        }

        public Criteria andGradeNameJpNotIn(List<String> values) {
            addCriterion("grade_name_jp not in", values, "gradeNameJp");
            return (Criteria) this;
        }

        public Criteria andGradeNameJpBetween(String value1, String value2) {
            addCriterion("grade_name_jp between", value1, value2, "gradeNameJp");
            return (Criteria) this;
        }

        public Criteria andGradeNameJpNotBetween(String value1, String value2) {
            addCriterion("grade_name_jp not between", value1, value2, "gradeNameJp");
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

        public Criteria andLocationNameEnIsNull() {
            addCriterion("location_name_en is null");
            return (Criteria) this;
        }

        public Criteria andLocationNameEnIsNotNull() {
            addCriterion("location_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andLocationNameEnEqualTo(String value) {
            addCriterion("location_name_en =", value, "locationNameEn");
            return (Criteria) this;
        }

        public Criteria andLocationNameEnNotEqualTo(String value) {
            addCriterion("location_name_en <>", value, "locationNameEn");
            return (Criteria) this;
        }

        public Criteria andLocationNameEnGreaterThan(String value) {
            addCriterion("location_name_en >", value, "locationNameEn");
            return (Criteria) this;
        }

        public Criteria andLocationNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("location_name_en >=", value, "locationNameEn");
            return (Criteria) this;
        }

        public Criteria andLocationNameEnLessThan(String value) {
            addCriterion("location_name_en <", value, "locationNameEn");
            return (Criteria) this;
        }

        public Criteria andLocationNameEnLessThanOrEqualTo(String value) {
            addCriterion("location_name_en <=", value, "locationNameEn");
            return (Criteria) this;
        }

        public Criteria andLocationNameEnLike(String value) {
            addCriterion("location_name_en like", value, "locationNameEn");
            return (Criteria) this;
        }

        public Criteria andLocationNameEnNotLike(String value) {
            addCriterion("location_name_en not like", value, "locationNameEn");
            return (Criteria) this;
        }

        public Criteria andLocationNameEnIn(List<String> values) {
            addCriterion("location_name_en in", values, "locationNameEn");
            return (Criteria) this;
        }

        public Criteria andLocationNameEnNotIn(List<String> values) {
            addCriterion("location_name_en not in", values, "locationNameEn");
            return (Criteria) this;
        }

        public Criteria andLocationNameEnBetween(String value1, String value2) {
            addCriterion("location_name_en between", value1, value2, "locationNameEn");
            return (Criteria) this;
        }

        public Criteria andLocationNameEnNotBetween(String value1, String value2) {
            addCriterion("location_name_en not between", value1, value2, "locationNameEn");
            return (Criteria) this;
        }

        public Criteria andLocationNameJpIsNull() {
            addCriterion("location_name_jp is null");
            return (Criteria) this;
        }

        public Criteria andLocationNameJpIsNotNull() {
            addCriterion("location_name_jp is not null");
            return (Criteria) this;
        }

        public Criteria andLocationNameJpEqualTo(String value) {
            addCriterion("location_name_jp =", value, "locationNameJp");
            return (Criteria) this;
        }

        public Criteria andLocationNameJpNotEqualTo(String value) {
            addCriterion("location_name_jp <>", value, "locationNameJp");
            return (Criteria) this;
        }

        public Criteria andLocationNameJpGreaterThan(String value) {
            addCriterion("location_name_jp >", value, "locationNameJp");
            return (Criteria) this;
        }

        public Criteria andLocationNameJpGreaterThanOrEqualTo(String value) {
            addCriterion("location_name_jp >=", value, "locationNameJp");
            return (Criteria) this;
        }

        public Criteria andLocationNameJpLessThan(String value) {
            addCriterion("location_name_jp <", value, "locationNameJp");
            return (Criteria) this;
        }

        public Criteria andLocationNameJpLessThanOrEqualTo(String value) {
            addCriterion("location_name_jp <=", value, "locationNameJp");
            return (Criteria) this;
        }

        public Criteria andLocationNameJpLike(String value) {
            addCriterion("location_name_jp like", value, "locationNameJp");
            return (Criteria) this;
        }

        public Criteria andLocationNameJpNotLike(String value) {
            addCriterion("location_name_jp not like", value, "locationNameJp");
            return (Criteria) this;
        }

        public Criteria andLocationNameJpIn(List<String> values) {
            addCriterion("location_name_jp in", values, "locationNameJp");
            return (Criteria) this;
        }

        public Criteria andLocationNameJpNotIn(List<String> values) {
            addCriterion("location_name_jp not in", values, "locationNameJp");
            return (Criteria) this;
        }

        public Criteria andLocationNameJpBetween(String value1, String value2) {
            addCriterion("location_name_jp between", value1, value2, "locationNameJp");
            return (Criteria) this;
        }

        public Criteria andLocationNameJpNotBetween(String value1, String value2) {
            addCriterion("location_name_jp not between", value1, value2, "locationNameJp");
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

        public Criteria andApplicationUseFlag01IsNull() {
            addCriterion("application_use_flag_01 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag01IsNotNull() {
            addCriterion("application_use_flag_01 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag01EqualTo(String value) {
            addCriterion("application_use_flag_01 =", value, "applicationUseFlag01");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag01NotEqualTo(String value) {
            addCriterion("application_use_flag_01 <>", value, "applicationUseFlag01");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag01GreaterThan(String value) {
            addCriterion("application_use_flag_01 >", value, "applicationUseFlag01");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag01GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_01 >=", value, "applicationUseFlag01");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag01LessThan(String value) {
            addCriterion("application_use_flag_01 <", value, "applicationUseFlag01");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag01LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_01 <=", value, "applicationUseFlag01");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag01Like(String value) {
            addCriterion("application_use_flag_01 like", value, "applicationUseFlag01");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag01NotLike(String value) {
            addCriterion("application_use_flag_01 not like", value, "applicationUseFlag01");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag01In(List<String> values) {
            addCriterion("application_use_flag_01 in", values, "applicationUseFlag01");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag01NotIn(List<String> values) {
            addCriterion("application_use_flag_01 not in", values, "applicationUseFlag01");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag01Between(String value1, String value2) {
            addCriterion("application_use_flag_01 between", value1, value2, "applicationUseFlag01");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag01NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_01 not between", value1, value2, "applicationUseFlag01");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag02IsNull() {
            addCriterion("application_use_flag_02 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag02IsNotNull() {
            addCriterion("application_use_flag_02 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag02EqualTo(String value) {
            addCriterion("application_use_flag_02 =", value, "applicationUseFlag02");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag02NotEqualTo(String value) {
            addCriterion("application_use_flag_02 <>", value, "applicationUseFlag02");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag02GreaterThan(String value) {
            addCriterion("application_use_flag_02 >", value, "applicationUseFlag02");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag02GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_02 >=", value, "applicationUseFlag02");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag02LessThan(String value) {
            addCriterion("application_use_flag_02 <", value, "applicationUseFlag02");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag02LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_02 <=", value, "applicationUseFlag02");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag02Like(String value) {
            addCriterion("application_use_flag_02 like", value, "applicationUseFlag02");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag02NotLike(String value) {
            addCriterion("application_use_flag_02 not like", value, "applicationUseFlag02");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag02In(List<String> values) {
            addCriterion("application_use_flag_02 in", values, "applicationUseFlag02");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag02NotIn(List<String> values) {
            addCriterion("application_use_flag_02 not in", values, "applicationUseFlag02");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag02Between(String value1, String value2) {
            addCriterion("application_use_flag_02 between", value1, value2, "applicationUseFlag02");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag02NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_02 not between", value1, value2, "applicationUseFlag02");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag03IsNull() {
            addCriterion("application_use_flag_03 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag03IsNotNull() {
            addCriterion("application_use_flag_03 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag03EqualTo(String value) {
            addCriterion("application_use_flag_03 =", value, "applicationUseFlag03");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag03NotEqualTo(String value) {
            addCriterion("application_use_flag_03 <>", value, "applicationUseFlag03");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag03GreaterThan(String value) {
            addCriterion("application_use_flag_03 >", value, "applicationUseFlag03");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag03GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_03 >=", value, "applicationUseFlag03");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag03LessThan(String value) {
            addCriterion("application_use_flag_03 <", value, "applicationUseFlag03");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag03LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_03 <=", value, "applicationUseFlag03");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag03Like(String value) {
            addCriterion("application_use_flag_03 like", value, "applicationUseFlag03");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag03NotLike(String value) {
            addCriterion("application_use_flag_03 not like", value, "applicationUseFlag03");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag03In(List<String> values) {
            addCriterion("application_use_flag_03 in", values, "applicationUseFlag03");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag03NotIn(List<String> values) {
            addCriterion("application_use_flag_03 not in", values, "applicationUseFlag03");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag03Between(String value1, String value2) {
            addCriterion("application_use_flag_03 between", value1, value2, "applicationUseFlag03");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag03NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_03 not between", value1, value2, "applicationUseFlag03");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag04IsNull() {
            addCriterion("application_use_flag_04 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag04IsNotNull() {
            addCriterion("application_use_flag_04 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag04EqualTo(String value) {
            addCriterion("application_use_flag_04 =", value, "applicationUseFlag04");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag04NotEqualTo(String value) {
            addCriterion("application_use_flag_04 <>", value, "applicationUseFlag04");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag04GreaterThan(String value) {
            addCriterion("application_use_flag_04 >", value, "applicationUseFlag04");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag04GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_04 >=", value, "applicationUseFlag04");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag04LessThan(String value) {
            addCriterion("application_use_flag_04 <", value, "applicationUseFlag04");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag04LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_04 <=", value, "applicationUseFlag04");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag04Like(String value) {
            addCriterion("application_use_flag_04 like", value, "applicationUseFlag04");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag04NotLike(String value) {
            addCriterion("application_use_flag_04 not like", value, "applicationUseFlag04");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag04In(List<String> values) {
            addCriterion("application_use_flag_04 in", values, "applicationUseFlag04");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag04NotIn(List<String> values) {
            addCriterion("application_use_flag_04 not in", values, "applicationUseFlag04");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag04Between(String value1, String value2) {
            addCriterion("application_use_flag_04 between", value1, value2, "applicationUseFlag04");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag04NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_04 not between", value1, value2, "applicationUseFlag04");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag05IsNull() {
            addCriterion("application_use_flag_05 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag05IsNotNull() {
            addCriterion("application_use_flag_05 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag05EqualTo(String value) {
            addCriterion("application_use_flag_05 =", value, "applicationUseFlag05");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag05NotEqualTo(String value) {
            addCriterion("application_use_flag_05 <>", value, "applicationUseFlag05");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag05GreaterThan(String value) {
            addCriterion("application_use_flag_05 >", value, "applicationUseFlag05");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag05GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_05 >=", value, "applicationUseFlag05");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag05LessThan(String value) {
            addCriterion("application_use_flag_05 <", value, "applicationUseFlag05");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag05LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_05 <=", value, "applicationUseFlag05");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag05Like(String value) {
            addCriterion("application_use_flag_05 like", value, "applicationUseFlag05");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag05NotLike(String value) {
            addCriterion("application_use_flag_05 not like", value, "applicationUseFlag05");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag05In(List<String> values) {
            addCriterion("application_use_flag_05 in", values, "applicationUseFlag05");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag05NotIn(List<String> values) {
            addCriterion("application_use_flag_05 not in", values, "applicationUseFlag05");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag05Between(String value1, String value2) {
            addCriterion("application_use_flag_05 between", value1, value2, "applicationUseFlag05");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag05NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_05 not between", value1, value2, "applicationUseFlag05");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag06IsNull() {
            addCriterion("application_use_flag_06 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag06IsNotNull() {
            addCriterion("application_use_flag_06 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag06EqualTo(String value) {
            addCriterion("application_use_flag_06 =", value, "applicationUseFlag06");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag06NotEqualTo(String value) {
            addCriterion("application_use_flag_06 <>", value, "applicationUseFlag06");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag06GreaterThan(String value) {
            addCriterion("application_use_flag_06 >", value, "applicationUseFlag06");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag06GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_06 >=", value, "applicationUseFlag06");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag06LessThan(String value) {
            addCriterion("application_use_flag_06 <", value, "applicationUseFlag06");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag06LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_06 <=", value, "applicationUseFlag06");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag06Like(String value) {
            addCriterion("application_use_flag_06 like", value, "applicationUseFlag06");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag06NotLike(String value) {
            addCriterion("application_use_flag_06 not like", value, "applicationUseFlag06");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag06In(List<String> values) {
            addCriterion("application_use_flag_06 in", values, "applicationUseFlag06");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag06NotIn(List<String> values) {
            addCriterion("application_use_flag_06 not in", values, "applicationUseFlag06");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag06Between(String value1, String value2) {
            addCriterion("application_use_flag_06 between", value1, value2, "applicationUseFlag06");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag06NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_06 not between", value1, value2, "applicationUseFlag06");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag07IsNull() {
            addCriterion("application_use_flag_07 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag07IsNotNull() {
            addCriterion("application_use_flag_07 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag07EqualTo(String value) {
            addCriterion("application_use_flag_07 =", value, "applicationUseFlag07");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag07NotEqualTo(String value) {
            addCriterion("application_use_flag_07 <>", value, "applicationUseFlag07");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag07GreaterThan(String value) {
            addCriterion("application_use_flag_07 >", value, "applicationUseFlag07");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag07GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_07 >=", value, "applicationUseFlag07");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag07LessThan(String value) {
            addCriterion("application_use_flag_07 <", value, "applicationUseFlag07");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag07LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_07 <=", value, "applicationUseFlag07");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag07Like(String value) {
            addCriterion("application_use_flag_07 like", value, "applicationUseFlag07");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag07NotLike(String value) {
            addCriterion("application_use_flag_07 not like", value, "applicationUseFlag07");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag07In(List<String> values) {
            addCriterion("application_use_flag_07 in", values, "applicationUseFlag07");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag07NotIn(List<String> values) {
            addCriterion("application_use_flag_07 not in", values, "applicationUseFlag07");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag07Between(String value1, String value2) {
            addCriterion("application_use_flag_07 between", value1, value2, "applicationUseFlag07");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag07NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_07 not between", value1, value2, "applicationUseFlag07");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag08IsNull() {
            addCriterion("application_use_flag_08 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag08IsNotNull() {
            addCriterion("application_use_flag_08 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag08EqualTo(String value) {
            addCriterion("application_use_flag_08 =", value, "applicationUseFlag08");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag08NotEqualTo(String value) {
            addCriterion("application_use_flag_08 <>", value, "applicationUseFlag08");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag08GreaterThan(String value) {
            addCriterion("application_use_flag_08 >", value, "applicationUseFlag08");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag08GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_08 >=", value, "applicationUseFlag08");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag08LessThan(String value) {
            addCriterion("application_use_flag_08 <", value, "applicationUseFlag08");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag08LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_08 <=", value, "applicationUseFlag08");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag08Like(String value) {
            addCriterion("application_use_flag_08 like", value, "applicationUseFlag08");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag08NotLike(String value) {
            addCriterion("application_use_flag_08 not like", value, "applicationUseFlag08");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag08In(List<String> values) {
            addCriterion("application_use_flag_08 in", values, "applicationUseFlag08");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag08NotIn(List<String> values) {
            addCriterion("application_use_flag_08 not in", values, "applicationUseFlag08");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag08Between(String value1, String value2) {
            addCriterion("application_use_flag_08 between", value1, value2, "applicationUseFlag08");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag08NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_08 not between", value1, value2, "applicationUseFlag08");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag09IsNull() {
            addCriterion("application_use_flag_09 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag09IsNotNull() {
            addCriterion("application_use_flag_09 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag09EqualTo(String value) {
            addCriterion("application_use_flag_09 =", value, "applicationUseFlag09");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag09NotEqualTo(String value) {
            addCriterion("application_use_flag_09 <>", value, "applicationUseFlag09");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag09GreaterThan(String value) {
            addCriterion("application_use_flag_09 >", value, "applicationUseFlag09");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag09GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_09 >=", value, "applicationUseFlag09");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag09LessThan(String value) {
            addCriterion("application_use_flag_09 <", value, "applicationUseFlag09");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag09LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_09 <=", value, "applicationUseFlag09");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag09Like(String value) {
            addCriterion("application_use_flag_09 like", value, "applicationUseFlag09");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag09NotLike(String value) {
            addCriterion("application_use_flag_09 not like", value, "applicationUseFlag09");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag09In(List<String> values) {
            addCriterion("application_use_flag_09 in", values, "applicationUseFlag09");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag09NotIn(List<String> values) {
            addCriterion("application_use_flag_09 not in", values, "applicationUseFlag09");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag09Between(String value1, String value2) {
            addCriterion("application_use_flag_09 between", value1, value2, "applicationUseFlag09");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag09NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_09 not between", value1, value2, "applicationUseFlag09");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag10IsNull() {
            addCriterion("application_use_flag_10 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag10IsNotNull() {
            addCriterion("application_use_flag_10 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag10EqualTo(String value) {
            addCriterion("application_use_flag_10 =", value, "applicationUseFlag10");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag10NotEqualTo(String value) {
            addCriterion("application_use_flag_10 <>", value, "applicationUseFlag10");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag10GreaterThan(String value) {
            addCriterion("application_use_flag_10 >", value, "applicationUseFlag10");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag10GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_10 >=", value, "applicationUseFlag10");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag10LessThan(String value) {
            addCriterion("application_use_flag_10 <", value, "applicationUseFlag10");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag10LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_10 <=", value, "applicationUseFlag10");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag10Like(String value) {
            addCriterion("application_use_flag_10 like", value, "applicationUseFlag10");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag10NotLike(String value) {
            addCriterion("application_use_flag_10 not like", value, "applicationUseFlag10");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag10In(List<String> values) {
            addCriterion("application_use_flag_10 in", values, "applicationUseFlag10");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag10NotIn(List<String> values) {
            addCriterion("application_use_flag_10 not in", values, "applicationUseFlag10");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag10Between(String value1, String value2) {
            addCriterion("application_use_flag_10 between", value1, value2, "applicationUseFlag10");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag10NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_10 not between", value1, value2, "applicationUseFlag10");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag11IsNull() {
            addCriterion("application_use_flag_11 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag11IsNotNull() {
            addCriterion("application_use_flag_11 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag11EqualTo(String value) {
            addCriterion("application_use_flag_11 =", value, "applicationUseFlag11");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag11NotEqualTo(String value) {
            addCriterion("application_use_flag_11 <>", value, "applicationUseFlag11");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag11GreaterThan(String value) {
            addCriterion("application_use_flag_11 >", value, "applicationUseFlag11");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag11GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_11 >=", value, "applicationUseFlag11");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag11LessThan(String value) {
            addCriterion("application_use_flag_11 <", value, "applicationUseFlag11");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag11LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_11 <=", value, "applicationUseFlag11");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag11Like(String value) {
            addCriterion("application_use_flag_11 like", value, "applicationUseFlag11");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag11NotLike(String value) {
            addCriterion("application_use_flag_11 not like", value, "applicationUseFlag11");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag11In(List<String> values) {
            addCriterion("application_use_flag_11 in", values, "applicationUseFlag11");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag11NotIn(List<String> values) {
            addCriterion("application_use_flag_11 not in", values, "applicationUseFlag11");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag11Between(String value1, String value2) {
            addCriterion("application_use_flag_11 between", value1, value2, "applicationUseFlag11");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag11NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_11 not between", value1, value2, "applicationUseFlag11");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag12IsNull() {
            addCriterion("application_use_flag_12 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag12IsNotNull() {
            addCriterion("application_use_flag_12 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag12EqualTo(String value) {
            addCriterion("application_use_flag_12 =", value, "applicationUseFlag12");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag12NotEqualTo(String value) {
            addCriterion("application_use_flag_12 <>", value, "applicationUseFlag12");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag12GreaterThan(String value) {
            addCriterion("application_use_flag_12 >", value, "applicationUseFlag12");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag12GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_12 >=", value, "applicationUseFlag12");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag12LessThan(String value) {
            addCriterion("application_use_flag_12 <", value, "applicationUseFlag12");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag12LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_12 <=", value, "applicationUseFlag12");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag12Like(String value) {
            addCriterion("application_use_flag_12 like", value, "applicationUseFlag12");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag12NotLike(String value) {
            addCriterion("application_use_flag_12 not like", value, "applicationUseFlag12");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag12In(List<String> values) {
            addCriterion("application_use_flag_12 in", values, "applicationUseFlag12");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag12NotIn(List<String> values) {
            addCriterion("application_use_flag_12 not in", values, "applicationUseFlag12");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag12Between(String value1, String value2) {
            addCriterion("application_use_flag_12 between", value1, value2, "applicationUseFlag12");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag12NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_12 not between", value1, value2, "applicationUseFlag12");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag13IsNull() {
            addCriterion("application_use_flag_13 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag13IsNotNull() {
            addCriterion("application_use_flag_13 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag13EqualTo(String value) {
            addCriterion("application_use_flag_13 =", value, "applicationUseFlag13");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag13NotEqualTo(String value) {
            addCriterion("application_use_flag_13 <>", value, "applicationUseFlag13");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag13GreaterThan(String value) {
            addCriterion("application_use_flag_13 >", value, "applicationUseFlag13");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag13GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_13 >=", value, "applicationUseFlag13");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag13LessThan(String value) {
            addCriterion("application_use_flag_13 <", value, "applicationUseFlag13");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag13LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_13 <=", value, "applicationUseFlag13");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag13Like(String value) {
            addCriterion("application_use_flag_13 like", value, "applicationUseFlag13");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag13NotLike(String value) {
            addCriterion("application_use_flag_13 not like", value, "applicationUseFlag13");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag13In(List<String> values) {
            addCriterion("application_use_flag_13 in", values, "applicationUseFlag13");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag13NotIn(List<String> values) {
            addCriterion("application_use_flag_13 not in", values, "applicationUseFlag13");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag13Between(String value1, String value2) {
            addCriterion("application_use_flag_13 between", value1, value2, "applicationUseFlag13");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag13NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_13 not between", value1, value2, "applicationUseFlag13");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag14IsNull() {
            addCriterion("application_use_flag_14 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag14IsNotNull() {
            addCriterion("application_use_flag_14 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag14EqualTo(String value) {
            addCriterion("application_use_flag_14 =", value, "applicationUseFlag14");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag14NotEqualTo(String value) {
            addCriterion("application_use_flag_14 <>", value, "applicationUseFlag14");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag14GreaterThan(String value) {
            addCriterion("application_use_flag_14 >", value, "applicationUseFlag14");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag14GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_14 >=", value, "applicationUseFlag14");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag14LessThan(String value) {
            addCriterion("application_use_flag_14 <", value, "applicationUseFlag14");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag14LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_14 <=", value, "applicationUseFlag14");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag14Like(String value) {
            addCriterion("application_use_flag_14 like", value, "applicationUseFlag14");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag14NotLike(String value) {
            addCriterion("application_use_flag_14 not like", value, "applicationUseFlag14");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag14In(List<String> values) {
            addCriterion("application_use_flag_14 in", values, "applicationUseFlag14");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag14NotIn(List<String> values) {
            addCriterion("application_use_flag_14 not in", values, "applicationUseFlag14");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag14Between(String value1, String value2) {
            addCriterion("application_use_flag_14 between", value1, value2, "applicationUseFlag14");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag14NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_14 not between", value1, value2, "applicationUseFlag14");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag15IsNull() {
            addCriterion("application_use_flag_15 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag15IsNotNull() {
            addCriterion("application_use_flag_15 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag15EqualTo(String value) {
            addCriterion("application_use_flag_15 =", value, "applicationUseFlag15");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag15NotEqualTo(String value) {
            addCriterion("application_use_flag_15 <>", value, "applicationUseFlag15");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag15GreaterThan(String value) {
            addCriterion("application_use_flag_15 >", value, "applicationUseFlag15");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag15GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_15 >=", value, "applicationUseFlag15");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag15LessThan(String value) {
            addCriterion("application_use_flag_15 <", value, "applicationUseFlag15");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag15LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_15 <=", value, "applicationUseFlag15");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag15Like(String value) {
            addCriterion("application_use_flag_15 like", value, "applicationUseFlag15");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag15NotLike(String value) {
            addCriterion("application_use_flag_15 not like", value, "applicationUseFlag15");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag15In(List<String> values) {
            addCriterion("application_use_flag_15 in", values, "applicationUseFlag15");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag15NotIn(List<String> values) {
            addCriterion("application_use_flag_15 not in", values, "applicationUseFlag15");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag15Between(String value1, String value2) {
            addCriterion("application_use_flag_15 between", value1, value2, "applicationUseFlag15");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag15NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_15 not between", value1, value2, "applicationUseFlag15");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag16IsNull() {
            addCriterion("application_use_flag_16 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag16IsNotNull() {
            addCriterion("application_use_flag_16 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag16EqualTo(String value) {
            addCriterion("application_use_flag_16 =", value, "applicationUseFlag16");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag16NotEqualTo(String value) {
            addCriterion("application_use_flag_16 <>", value, "applicationUseFlag16");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag16GreaterThan(String value) {
            addCriterion("application_use_flag_16 >", value, "applicationUseFlag16");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag16GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_16 >=", value, "applicationUseFlag16");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag16LessThan(String value) {
            addCriterion("application_use_flag_16 <", value, "applicationUseFlag16");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag16LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_16 <=", value, "applicationUseFlag16");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag16Like(String value) {
            addCriterion("application_use_flag_16 like", value, "applicationUseFlag16");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag16NotLike(String value) {
            addCriterion("application_use_flag_16 not like", value, "applicationUseFlag16");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag16In(List<String> values) {
            addCriterion("application_use_flag_16 in", values, "applicationUseFlag16");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag16NotIn(List<String> values) {
            addCriterion("application_use_flag_16 not in", values, "applicationUseFlag16");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag16Between(String value1, String value2) {
            addCriterion("application_use_flag_16 between", value1, value2, "applicationUseFlag16");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag16NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_16 not between", value1, value2, "applicationUseFlag16");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag17IsNull() {
            addCriterion("application_use_flag_17 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag17IsNotNull() {
            addCriterion("application_use_flag_17 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag17EqualTo(String value) {
            addCriterion("application_use_flag_17 =", value, "applicationUseFlag17");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag17NotEqualTo(String value) {
            addCriterion("application_use_flag_17 <>", value, "applicationUseFlag17");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag17GreaterThan(String value) {
            addCriterion("application_use_flag_17 >", value, "applicationUseFlag17");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag17GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_17 >=", value, "applicationUseFlag17");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag17LessThan(String value) {
            addCriterion("application_use_flag_17 <", value, "applicationUseFlag17");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag17LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_17 <=", value, "applicationUseFlag17");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag17Like(String value) {
            addCriterion("application_use_flag_17 like", value, "applicationUseFlag17");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag17NotLike(String value) {
            addCriterion("application_use_flag_17 not like", value, "applicationUseFlag17");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag17In(List<String> values) {
            addCriterion("application_use_flag_17 in", values, "applicationUseFlag17");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag17NotIn(List<String> values) {
            addCriterion("application_use_flag_17 not in", values, "applicationUseFlag17");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag17Between(String value1, String value2) {
            addCriterion("application_use_flag_17 between", value1, value2, "applicationUseFlag17");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag17NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_17 not between", value1, value2, "applicationUseFlag17");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag18IsNull() {
            addCriterion("application_use_flag_18 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag18IsNotNull() {
            addCriterion("application_use_flag_18 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag18EqualTo(String value) {
            addCriterion("application_use_flag_18 =", value, "applicationUseFlag18");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag18NotEqualTo(String value) {
            addCriterion("application_use_flag_18 <>", value, "applicationUseFlag18");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag18GreaterThan(String value) {
            addCriterion("application_use_flag_18 >", value, "applicationUseFlag18");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag18GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_18 >=", value, "applicationUseFlag18");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag18LessThan(String value) {
            addCriterion("application_use_flag_18 <", value, "applicationUseFlag18");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag18LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_18 <=", value, "applicationUseFlag18");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag18Like(String value) {
            addCriterion("application_use_flag_18 like", value, "applicationUseFlag18");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag18NotLike(String value) {
            addCriterion("application_use_flag_18 not like", value, "applicationUseFlag18");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag18In(List<String> values) {
            addCriterion("application_use_flag_18 in", values, "applicationUseFlag18");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag18NotIn(List<String> values) {
            addCriterion("application_use_flag_18 not in", values, "applicationUseFlag18");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag18Between(String value1, String value2) {
            addCriterion("application_use_flag_18 between", value1, value2, "applicationUseFlag18");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag18NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_18 not between", value1, value2, "applicationUseFlag18");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag19IsNull() {
            addCriterion("application_use_flag_19 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag19IsNotNull() {
            addCriterion("application_use_flag_19 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag19EqualTo(String value) {
            addCriterion("application_use_flag_19 =", value, "applicationUseFlag19");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag19NotEqualTo(String value) {
            addCriterion("application_use_flag_19 <>", value, "applicationUseFlag19");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag19GreaterThan(String value) {
            addCriterion("application_use_flag_19 >", value, "applicationUseFlag19");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag19GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_19 >=", value, "applicationUseFlag19");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag19LessThan(String value) {
            addCriterion("application_use_flag_19 <", value, "applicationUseFlag19");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag19LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_19 <=", value, "applicationUseFlag19");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag19Like(String value) {
            addCriterion("application_use_flag_19 like", value, "applicationUseFlag19");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag19NotLike(String value) {
            addCriterion("application_use_flag_19 not like", value, "applicationUseFlag19");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag19In(List<String> values) {
            addCriterion("application_use_flag_19 in", values, "applicationUseFlag19");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag19NotIn(List<String> values) {
            addCriterion("application_use_flag_19 not in", values, "applicationUseFlag19");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag19Between(String value1, String value2) {
            addCriterion("application_use_flag_19 between", value1, value2, "applicationUseFlag19");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag19NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_19 not between", value1, value2, "applicationUseFlag19");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag20IsNull() {
            addCriterion("application_use_flag_20 is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag20IsNotNull() {
            addCriterion("application_use_flag_20 is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag20EqualTo(String value) {
            addCriterion("application_use_flag_20 =", value, "applicationUseFlag20");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag20NotEqualTo(String value) {
            addCriterion("application_use_flag_20 <>", value, "applicationUseFlag20");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag20GreaterThan(String value) {
            addCriterion("application_use_flag_20 >", value, "applicationUseFlag20");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag20GreaterThanOrEqualTo(String value) {
            addCriterion("application_use_flag_20 >=", value, "applicationUseFlag20");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag20LessThan(String value) {
            addCriterion("application_use_flag_20 <", value, "applicationUseFlag20");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag20LessThanOrEqualTo(String value) {
            addCriterion("application_use_flag_20 <=", value, "applicationUseFlag20");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag20Like(String value) {
            addCriterion("application_use_flag_20 like", value, "applicationUseFlag20");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag20NotLike(String value) {
            addCriterion("application_use_flag_20 not like", value, "applicationUseFlag20");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag20In(List<String> values) {
            addCriterion("application_use_flag_20 in", values, "applicationUseFlag20");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag20NotIn(List<String> values) {
            addCriterion("application_use_flag_20 not in", values, "applicationUseFlag20");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag20Between(String value1, String value2) {
            addCriterion("application_use_flag_20 between", value1, value2, "applicationUseFlag20");
            return (Criteria) this;
        }

        public Criteria andApplicationUseFlag20NotBetween(String value1, String value2) {
            addCriterion("application_use_flag_20 not between", value1, value2, "applicationUseFlag20");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag01IsNull() {
            addCriterion("system_valid_flag_01 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag01IsNotNull() {
            addCriterion("system_valid_flag_01 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag01EqualTo(String value) {
            addCriterion("system_valid_flag_01 =", value, "systemValidFlag01");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag01NotEqualTo(String value) {
            addCriterion("system_valid_flag_01 <>", value, "systemValidFlag01");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag01GreaterThan(String value) {
            addCriterion("system_valid_flag_01 >", value, "systemValidFlag01");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag01GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_01 >=", value, "systemValidFlag01");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag01LessThan(String value) {
            addCriterion("system_valid_flag_01 <", value, "systemValidFlag01");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag01LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_01 <=", value, "systemValidFlag01");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag01Like(String value) {
            addCriterion("system_valid_flag_01 like", value, "systemValidFlag01");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag01NotLike(String value) {
            addCriterion("system_valid_flag_01 not like", value, "systemValidFlag01");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag01In(List<String> values) {
            addCriterion("system_valid_flag_01 in", values, "systemValidFlag01");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag01NotIn(List<String> values) {
            addCriterion("system_valid_flag_01 not in", values, "systemValidFlag01");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag01Between(String value1, String value2) {
            addCriterion("system_valid_flag_01 between", value1, value2, "systemValidFlag01");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag01NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_01 not between", value1, value2, "systemValidFlag01");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag02IsNull() {
            addCriterion("system_valid_flag_02 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag02IsNotNull() {
            addCriterion("system_valid_flag_02 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag02EqualTo(String value) {
            addCriterion("system_valid_flag_02 =", value, "systemValidFlag02");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag02NotEqualTo(String value) {
            addCriterion("system_valid_flag_02 <>", value, "systemValidFlag02");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag02GreaterThan(String value) {
            addCriterion("system_valid_flag_02 >", value, "systemValidFlag02");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag02GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_02 >=", value, "systemValidFlag02");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag02LessThan(String value) {
            addCriterion("system_valid_flag_02 <", value, "systemValidFlag02");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag02LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_02 <=", value, "systemValidFlag02");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag02Like(String value) {
            addCriterion("system_valid_flag_02 like", value, "systemValidFlag02");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag02NotLike(String value) {
            addCriterion("system_valid_flag_02 not like", value, "systemValidFlag02");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag02In(List<String> values) {
            addCriterion("system_valid_flag_02 in", values, "systemValidFlag02");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag02NotIn(List<String> values) {
            addCriterion("system_valid_flag_02 not in", values, "systemValidFlag02");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag02Between(String value1, String value2) {
            addCriterion("system_valid_flag_02 between", value1, value2, "systemValidFlag02");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag02NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_02 not between", value1, value2, "systemValidFlag02");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag03IsNull() {
            addCriterion("system_valid_flag_03 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag03IsNotNull() {
            addCriterion("system_valid_flag_03 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag03EqualTo(String value) {
            addCriterion("system_valid_flag_03 =", value, "systemValidFlag03");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag03NotEqualTo(String value) {
            addCriterion("system_valid_flag_03 <>", value, "systemValidFlag03");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag03GreaterThan(String value) {
            addCriterion("system_valid_flag_03 >", value, "systemValidFlag03");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag03GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_03 >=", value, "systemValidFlag03");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag03LessThan(String value) {
            addCriterion("system_valid_flag_03 <", value, "systemValidFlag03");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag03LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_03 <=", value, "systemValidFlag03");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag03Like(String value) {
            addCriterion("system_valid_flag_03 like", value, "systemValidFlag03");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag03NotLike(String value) {
            addCriterion("system_valid_flag_03 not like", value, "systemValidFlag03");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag03In(List<String> values) {
            addCriterion("system_valid_flag_03 in", values, "systemValidFlag03");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag03NotIn(List<String> values) {
            addCriterion("system_valid_flag_03 not in", values, "systemValidFlag03");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag03Between(String value1, String value2) {
            addCriterion("system_valid_flag_03 between", value1, value2, "systemValidFlag03");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag03NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_03 not between", value1, value2, "systemValidFlag03");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag04IsNull() {
            addCriterion("system_valid_flag_04 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag04IsNotNull() {
            addCriterion("system_valid_flag_04 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag04EqualTo(String value) {
            addCriterion("system_valid_flag_04 =", value, "systemValidFlag04");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag04NotEqualTo(String value) {
            addCriterion("system_valid_flag_04 <>", value, "systemValidFlag04");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag04GreaterThan(String value) {
            addCriterion("system_valid_flag_04 >", value, "systemValidFlag04");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag04GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_04 >=", value, "systemValidFlag04");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag04LessThan(String value) {
            addCriterion("system_valid_flag_04 <", value, "systemValidFlag04");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag04LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_04 <=", value, "systemValidFlag04");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag04Like(String value) {
            addCriterion("system_valid_flag_04 like", value, "systemValidFlag04");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag04NotLike(String value) {
            addCriterion("system_valid_flag_04 not like", value, "systemValidFlag04");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag04In(List<String> values) {
            addCriterion("system_valid_flag_04 in", values, "systemValidFlag04");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag04NotIn(List<String> values) {
            addCriterion("system_valid_flag_04 not in", values, "systemValidFlag04");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag04Between(String value1, String value2) {
            addCriterion("system_valid_flag_04 between", value1, value2, "systemValidFlag04");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag04NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_04 not between", value1, value2, "systemValidFlag04");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag05IsNull() {
            addCriterion("system_valid_flag_05 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag05IsNotNull() {
            addCriterion("system_valid_flag_05 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag05EqualTo(String value) {
            addCriterion("system_valid_flag_05 =", value, "systemValidFlag05");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag05NotEqualTo(String value) {
            addCriterion("system_valid_flag_05 <>", value, "systemValidFlag05");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag05GreaterThan(String value) {
            addCriterion("system_valid_flag_05 >", value, "systemValidFlag05");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag05GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_05 >=", value, "systemValidFlag05");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag05LessThan(String value) {
            addCriterion("system_valid_flag_05 <", value, "systemValidFlag05");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag05LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_05 <=", value, "systemValidFlag05");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag05Like(String value) {
            addCriterion("system_valid_flag_05 like", value, "systemValidFlag05");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag05NotLike(String value) {
            addCriterion("system_valid_flag_05 not like", value, "systemValidFlag05");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag05In(List<String> values) {
            addCriterion("system_valid_flag_05 in", values, "systemValidFlag05");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag05NotIn(List<String> values) {
            addCriterion("system_valid_flag_05 not in", values, "systemValidFlag05");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag05Between(String value1, String value2) {
            addCriterion("system_valid_flag_05 between", value1, value2, "systemValidFlag05");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag05NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_05 not between", value1, value2, "systemValidFlag05");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag06IsNull() {
            addCriterion("system_valid_flag_06 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag06IsNotNull() {
            addCriterion("system_valid_flag_06 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag06EqualTo(String value) {
            addCriterion("system_valid_flag_06 =", value, "systemValidFlag06");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag06NotEqualTo(String value) {
            addCriterion("system_valid_flag_06 <>", value, "systemValidFlag06");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag06GreaterThan(String value) {
            addCriterion("system_valid_flag_06 >", value, "systemValidFlag06");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag06GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_06 >=", value, "systemValidFlag06");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag06LessThan(String value) {
            addCriterion("system_valid_flag_06 <", value, "systemValidFlag06");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag06LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_06 <=", value, "systemValidFlag06");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag06Like(String value) {
            addCriterion("system_valid_flag_06 like", value, "systemValidFlag06");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag06NotLike(String value) {
            addCriterion("system_valid_flag_06 not like", value, "systemValidFlag06");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag06In(List<String> values) {
            addCriterion("system_valid_flag_06 in", values, "systemValidFlag06");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag06NotIn(List<String> values) {
            addCriterion("system_valid_flag_06 not in", values, "systemValidFlag06");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag06Between(String value1, String value2) {
            addCriterion("system_valid_flag_06 between", value1, value2, "systemValidFlag06");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag06NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_06 not between", value1, value2, "systemValidFlag06");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag07IsNull() {
            addCriterion("system_valid_flag_07 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag07IsNotNull() {
            addCriterion("system_valid_flag_07 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag07EqualTo(String value) {
            addCriterion("system_valid_flag_07 =", value, "systemValidFlag07");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag07NotEqualTo(String value) {
            addCriterion("system_valid_flag_07 <>", value, "systemValidFlag07");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag07GreaterThan(String value) {
            addCriterion("system_valid_flag_07 >", value, "systemValidFlag07");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag07GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_07 >=", value, "systemValidFlag07");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag07LessThan(String value) {
            addCriterion("system_valid_flag_07 <", value, "systemValidFlag07");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag07LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_07 <=", value, "systemValidFlag07");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag07Like(String value) {
            addCriterion("system_valid_flag_07 like", value, "systemValidFlag07");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag07NotLike(String value) {
            addCriterion("system_valid_flag_07 not like", value, "systemValidFlag07");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag07In(List<String> values) {
            addCriterion("system_valid_flag_07 in", values, "systemValidFlag07");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag07NotIn(List<String> values) {
            addCriterion("system_valid_flag_07 not in", values, "systemValidFlag07");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag07Between(String value1, String value2) {
            addCriterion("system_valid_flag_07 between", value1, value2, "systemValidFlag07");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag07NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_07 not between", value1, value2, "systemValidFlag07");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag08IsNull() {
            addCriterion("system_valid_flag_08 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag08IsNotNull() {
            addCriterion("system_valid_flag_08 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag08EqualTo(String value) {
            addCriterion("system_valid_flag_08 =", value, "systemValidFlag08");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag08NotEqualTo(String value) {
            addCriterion("system_valid_flag_08 <>", value, "systemValidFlag08");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag08GreaterThan(String value) {
            addCriterion("system_valid_flag_08 >", value, "systemValidFlag08");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag08GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_08 >=", value, "systemValidFlag08");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag08LessThan(String value) {
            addCriterion("system_valid_flag_08 <", value, "systemValidFlag08");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag08LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_08 <=", value, "systemValidFlag08");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag08Like(String value) {
            addCriterion("system_valid_flag_08 like", value, "systemValidFlag08");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag08NotLike(String value) {
            addCriterion("system_valid_flag_08 not like", value, "systemValidFlag08");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag08In(List<String> values) {
            addCriterion("system_valid_flag_08 in", values, "systemValidFlag08");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag08NotIn(List<String> values) {
            addCriterion("system_valid_flag_08 not in", values, "systemValidFlag08");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag08Between(String value1, String value2) {
            addCriterion("system_valid_flag_08 between", value1, value2, "systemValidFlag08");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag08NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_08 not between", value1, value2, "systemValidFlag08");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag09IsNull() {
            addCriterion("system_valid_flag_09 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag09IsNotNull() {
            addCriterion("system_valid_flag_09 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag09EqualTo(String value) {
            addCriterion("system_valid_flag_09 =", value, "systemValidFlag09");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag09NotEqualTo(String value) {
            addCriterion("system_valid_flag_09 <>", value, "systemValidFlag09");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag09GreaterThan(String value) {
            addCriterion("system_valid_flag_09 >", value, "systemValidFlag09");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag09GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_09 >=", value, "systemValidFlag09");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag09LessThan(String value) {
            addCriterion("system_valid_flag_09 <", value, "systemValidFlag09");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag09LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_09 <=", value, "systemValidFlag09");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag09Like(String value) {
            addCriterion("system_valid_flag_09 like", value, "systemValidFlag09");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag09NotLike(String value) {
            addCriterion("system_valid_flag_09 not like", value, "systemValidFlag09");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag09In(List<String> values) {
            addCriterion("system_valid_flag_09 in", values, "systemValidFlag09");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag09NotIn(List<String> values) {
            addCriterion("system_valid_flag_09 not in", values, "systemValidFlag09");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag09Between(String value1, String value2) {
            addCriterion("system_valid_flag_09 between", value1, value2, "systemValidFlag09");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag09NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_09 not between", value1, value2, "systemValidFlag09");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag10IsNull() {
            addCriterion("system_valid_flag_10 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag10IsNotNull() {
            addCriterion("system_valid_flag_10 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag10EqualTo(String value) {
            addCriterion("system_valid_flag_10 =", value, "systemValidFlag10");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag10NotEqualTo(String value) {
            addCriterion("system_valid_flag_10 <>", value, "systemValidFlag10");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag10GreaterThan(String value) {
            addCriterion("system_valid_flag_10 >", value, "systemValidFlag10");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag10GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_10 >=", value, "systemValidFlag10");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag10LessThan(String value) {
            addCriterion("system_valid_flag_10 <", value, "systemValidFlag10");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag10LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_10 <=", value, "systemValidFlag10");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag10Like(String value) {
            addCriterion("system_valid_flag_10 like", value, "systemValidFlag10");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag10NotLike(String value) {
            addCriterion("system_valid_flag_10 not like", value, "systemValidFlag10");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag10In(List<String> values) {
            addCriterion("system_valid_flag_10 in", values, "systemValidFlag10");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag10NotIn(List<String> values) {
            addCriterion("system_valid_flag_10 not in", values, "systemValidFlag10");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag10Between(String value1, String value2) {
            addCriterion("system_valid_flag_10 between", value1, value2, "systemValidFlag10");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag10NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_10 not between", value1, value2, "systemValidFlag10");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag11IsNull() {
            addCriterion("system_valid_flag_11 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag11IsNotNull() {
            addCriterion("system_valid_flag_11 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag11EqualTo(String value) {
            addCriterion("system_valid_flag_11 =", value, "systemValidFlag11");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag11NotEqualTo(String value) {
            addCriterion("system_valid_flag_11 <>", value, "systemValidFlag11");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag11GreaterThan(String value) {
            addCriterion("system_valid_flag_11 >", value, "systemValidFlag11");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag11GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_11 >=", value, "systemValidFlag11");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag11LessThan(String value) {
            addCriterion("system_valid_flag_11 <", value, "systemValidFlag11");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag11LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_11 <=", value, "systemValidFlag11");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag11Like(String value) {
            addCriterion("system_valid_flag_11 like", value, "systemValidFlag11");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag11NotLike(String value) {
            addCriterion("system_valid_flag_11 not like", value, "systemValidFlag11");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag11In(List<String> values) {
            addCriterion("system_valid_flag_11 in", values, "systemValidFlag11");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag11NotIn(List<String> values) {
            addCriterion("system_valid_flag_11 not in", values, "systemValidFlag11");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag11Between(String value1, String value2) {
            addCriterion("system_valid_flag_11 between", value1, value2, "systemValidFlag11");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag11NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_11 not between", value1, value2, "systemValidFlag11");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag12IsNull() {
            addCriterion("system_valid_flag_12 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag12IsNotNull() {
            addCriterion("system_valid_flag_12 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag12EqualTo(String value) {
            addCriterion("system_valid_flag_12 =", value, "systemValidFlag12");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag12NotEqualTo(String value) {
            addCriterion("system_valid_flag_12 <>", value, "systemValidFlag12");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag12GreaterThan(String value) {
            addCriterion("system_valid_flag_12 >", value, "systemValidFlag12");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag12GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_12 >=", value, "systemValidFlag12");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag12LessThan(String value) {
            addCriterion("system_valid_flag_12 <", value, "systemValidFlag12");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag12LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_12 <=", value, "systemValidFlag12");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag12Like(String value) {
            addCriterion("system_valid_flag_12 like", value, "systemValidFlag12");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag12NotLike(String value) {
            addCriterion("system_valid_flag_12 not like", value, "systemValidFlag12");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag12In(List<String> values) {
            addCriterion("system_valid_flag_12 in", values, "systemValidFlag12");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag12NotIn(List<String> values) {
            addCriterion("system_valid_flag_12 not in", values, "systemValidFlag12");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag12Between(String value1, String value2) {
            addCriterion("system_valid_flag_12 between", value1, value2, "systemValidFlag12");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag12NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_12 not between", value1, value2, "systemValidFlag12");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag13IsNull() {
            addCriterion("system_valid_flag_13 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag13IsNotNull() {
            addCriterion("system_valid_flag_13 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag13EqualTo(String value) {
            addCriterion("system_valid_flag_13 =", value, "systemValidFlag13");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag13NotEqualTo(String value) {
            addCriterion("system_valid_flag_13 <>", value, "systemValidFlag13");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag13GreaterThan(String value) {
            addCriterion("system_valid_flag_13 >", value, "systemValidFlag13");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag13GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_13 >=", value, "systemValidFlag13");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag13LessThan(String value) {
            addCriterion("system_valid_flag_13 <", value, "systemValidFlag13");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag13LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_13 <=", value, "systemValidFlag13");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag13Like(String value) {
            addCriterion("system_valid_flag_13 like", value, "systemValidFlag13");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag13NotLike(String value) {
            addCriterion("system_valid_flag_13 not like", value, "systemValidFlag13");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag13In(List<String> values) {
            addCriterion("system_valid_flag_13 in", values, "systemValidFlag13");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag13NotIn(List<String> values) {
            addCriterion("system_valid_flag_13 not in", values, "systemValidFlag13");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag13Between(String value1, String value2) {
            addCriterion("system_valid_flag_13 between", value1, value2, "systemValidFlag13");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag13NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_13 not between", value1, value2, "systemValidFlag13");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag14IsNull() {
            addCriterion("system_valid_flag_14 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag14IsNotNull() {
            addCriterion("system_valid_flag_14 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag14EqualTo(String value) {
            addCriterion("system_valid_flag_14 =", value, "systemValidFlag14");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag14NotEqualTo(String value) {
            addCriterion("system_valid_flag_14 <>", value, "systemValidFlag14");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag14GreaterThan(String value) {
            addCriterion("system_valid_flag_14 >", value, "systemValidFlag14");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag14GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_14 >=", value, "systemValidFlag14");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag14LessThan(String value) {
            addCriterion("system_valid_flag_14 <", value, "systemValidFlag14");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag14LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_14 <=", value, "systemValidFlag14");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag14Like(String value) {
            addCriterion("system_valid_flag_14 like", value, "systemValidFlag14");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag14NotLike(String value) {
            addCriterion("system_valid_flag_14 not like", value, "systemValidFlag14");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag14In(List<String> values) {
            addCriterion("system_valid_flag_14 in", values, "systemValidFlag14");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag14NotIn(List<String> values) {
            addCriterion("system_valid_flag_14 not in", values, "systemValidFlag14");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag14Between(String value1, String value2) {
            addCriterion("system_valid_flag_14 between", value1, value2, "systemValidFlag14");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag14NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_14 not between", value1, value2, "systemValidFlag14");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag15IsNull() {
            addCriterion("system_valid_flag_15 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag15IsNotNull() {
            addCriterion("system_valid_flag_15 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag15EqualTo(String value) {
            addCriterion("system_valid_flag_15 =", value, "systemValidFlag15");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag15NotEqualTo(String value) {
            addCriterion("system_valid_flag_15 <>", value, "systemValidFlag15");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag15GreaterThan(String value) {
            addCriterion("system_valid_flag_15 >", value, "systemValidFlag15");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag15GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_15 >=", value, "systemValidFlag15");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag15LessThan(String value) {
            addCriterion("system_valid_flag_15 <", value, "systemValidFlag15");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag15LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_15 <=", value, "systemValidFlag15");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag15Like(String value) {
            addCriterion("system_valid_flag_15 like", value, "systemValidFlag15");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag15NotLike(String value) {
            addCriterion("system_valid_flag_15 not like", value, "systemValidFlag15");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag15In(List<String> values) {
            addCriterion("system_valid_flag_15 in", values, "systemValidFlag15");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag15NotIn(List<String> values) {
            addCriterion("system_valid_flag_15 not in", values, "systemValidFlag15");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag15Between(String value1, String value2) {
            addCriterion("system_valid_flag_15 between", value1, value2, "systemValidFlag15");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag15NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_15 not between", value1, value2, "systemValidFlag15");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag16IsNull() {
            addCriterion("system_valid_flag_16 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag16IsNotNull() {
            addCriterion("system_valid_flag_16 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag16EqualTo(String value) {
            addCriterion("system_valid_flag_16 =", value, "systemValidFlag16");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag16NotEqualTo(String value) {
            addCriterion("system_valid_flag_16 <>", value, "systemValidFlag16");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag16GreaterThan(String value) {
            addCriterion("system_valid_flag_16 >", value, "systemValidFlag16");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag16GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_16 >=", value, "systemValidFlag16");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag16LessThan(String value) {
            addCriterion("system_valid_flag_16 <", value, "systemValidFlag16");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag16LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_16 <=", value, "systemValidFlag16");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag16Like(String value) {
            addCriterion("system_valid_flag_16 like", value, "systemValidFlag16");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag16NotLike(String value) {
            addCriterion("system_valid_flag_16 not like", value, "systemValidFlag16");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag16In(List<String> values) {
            addCriterion("system_valid_flag_16 in", values, "systemValidFlag16");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag16NotIn(List<String> values) {
            addCriterion("system_valid_flag_16 not in", values, "systemValidFlag16");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag16Between(String value1, String value2) {
            addCriterion("system_valid_flag_16 between", value1, value2, "systemValidFlag16");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag16NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_16 not between", value1, value2, "systemValidFlag16");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag17IsNull() {
            addCriterion("system_valid_flag_17 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag17IsNotNull() {
            addCriterion("system_valid_flag_17 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag17EqualTo(String value) {
            addCriterion("system_valid_flag_17 =", value, "systemValidFlag17");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag17NotEqualTo(String value) {
            addCriterion("system_valid_flag_17 <>", value, "systemValidFlag17");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag17GreaterThan(String value) {
            addCriterion("system_valid_flag_17 >", value, "systemValidFlag17");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag17GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_17 >=", value, "systemValidFlag17");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag17LessThan(String value) {
            addCriterion("system_valid_flag_17 <", value, "systemValidFlag17");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag17LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_17 <=", value, "systemValidFlag17");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag17Like(String value) {
            addCriterion("system_valid_flag_17 like", value, "systemValidFlag17");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag17NotLike(String value) {
            addCriterion("system_valid_flag_17 not like", value, "systemValidFlag17");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag17In(List<String> values) {
            addCriterion("system_valid_flag_17 in", values, "systemValidFlag17");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag17NotIn(List<String> values) {
            addCriterion("system_valid_flag_17 not in", values, "systemValidFlag17");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag17Between(String value1, String value2) {
            addCriterion("system_valid_flag_17 between", value1, value2, "systemValidFlag17");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag17NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_17 not between", value1, value2, "systemValidFlag17");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag18IsNull() {
            addCriterion("system_valid_flag_18 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag18IsNotNull() {
            addCriterion("system_valid_flag_18 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag18EqualTo(String value) {
            addCriterion("system_valid_flag_18 =", value, "systemValidFlag18");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag18NotEqualTo(String value) {
            addCriterion("system_valid_flag_18 <>", value, "systemValidFlag18");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag18GreaterThan(String value) {
            addCriterion("system_valid_flag_18 >", value, "systemValidFlag18");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag18GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_18 >=", value, "systemValidFlag18");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag18LessThan(String value) {
            addCriterion("system_valid_flag_18 <", value, "systemValidFlag18");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag18LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_18 <=", value, "systemValidFlag18");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag18Like(String value) {
            addCriterion("system_valid_flag_18 like", value, "systemValidFlag18");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag18NotLike(String value) {
            addCriterion("system_valid_flag_18 not like", value, "systemValidFlag18");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag18In(List<String> values) {
            addCriterion("system_valid_flag_18 in", values, "systemValidFlag18");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag18NotIn(List<String> values) {
            addCriterion("system_valid_flag_18 not in", values, "systemValidFlag18");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag18Between(String value1, String value2) {
            addCriterion("system_valid_flag_18 between", value1, value2, "systemValidFlag18");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag18NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_18 not between", value1, value2, "systemValidFlag18");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag19IsNull() {
            addCriterion("system_valid_flag_19 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag19IsNotNull() {
            addCriterion("system_valid_flag_19 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag19EqualTo(String value) {
            addCriterion("system_valid_flag_19 =", value, "systemValidFlag19");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag19NotEqualTo(String value) {
            addCriterion("system_valid_flag_19 <>", value, "systemValidFlag19");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag19GreaterThan(String value) {
            addCriterion("system_valid_flag_19 >", value, "systemValidFlag19");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag19GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_19 >=", value, "systemValidFlag19");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag19LessThan(String value) {
            addCriterion("system_valid_flag_19 <", value, "systemValidFlag19");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag19LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_19 <=", value, "systemValidFlag19");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag19Like(String value) {
            addCriterion("system_valid_flag_19 like", value, "systemValidFlag19");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag19NotLike(String value) {
            addCriterion("system_valid_flag_19 not like", value, "systemValidFlag19");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag19In(List<String> values) {
            addCriterion("system_valid_flag_19 in", values, "systemValidFlag19");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag19NotIn(List<String> values) {
            addCriterion("system_valid_flag_19 not in", values, "systemValidFlag19");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag19Between(String value1, String value2) {
            addCriterion("system_valid_flag_19 between", value1, value2, "systemValidFlag19");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag19NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_19 not between", value1, value2, "systemValidFlag19");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag20IsNull() {
            addCriterion("system_valid_flag_20 is null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag20IsNotNull() {
            addCriterion("system_valid_flag_20 is not null");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag20EqualTo(String value) {
            addCriterion("system_valid_flag_20 =", value, "systemValidFlag20");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag20NotEqualTo(String value) {
            addCriterion("system_valid_flag_20 <>", value, "systemValidFlag20");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag20GreaterThan(String value) {
            addCriterion("system_valid_flag_20 >", value, "systemValidFlag20");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag20GreaterThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_20 >=", value, "systemValidFlag20");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag20LessThan(String value) {
            addCriterion("system_valid_flag_20 <", value, "systemValidFlag20");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag20LessThanOrEqualTo(String value) {
            addCriterion("system_valid_flag_20 <=", value, "systemValidFlag20");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag20Like(String value) {
            addCriterion("system_valid_flag_20 like", value, "systemValidFlag20");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag20NotLike(String value) {
            addCriterion("system_valid_flag_20 not like", value, "systemValidFlag20");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag20In(List<String> values) {
            addCriterion("system_valid_flag_20 in", values, "systemValidFlag20");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag20NotIn(List<String> values) {
            addCriterion("system_valid_flag_20 not in", values, "systemValidFlag20");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag20Between(String value1, String value2) {
            addCriterion("system_valid_flag_20 between", value1, value2, "systemValidFlag20");
            return (Criteria) this;
        }

        public Criteria andSystemValidFlag20NotBetween(String value1, String value2) {
            addCriterion("system_valid_flag_20 not between", value1, value2, "systemValidFlag20");
            return (Criteria) this;
        }

        public Criteria andAdminFlagIsNull() {
            addCriterion("admin_flag is null");
            return (Criteria) this;
        }

        public Criteria andAdminFlagIsNotNull() {
            addCriterion("admin_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAdminFlagEqualTo(String value) {
            addCriterion("admin_flag =", value, "adminFlag");
            return (Criteria) this;
        }

        public Criteria andAdminFlagNotEqualTo(String value) {
            addCriterion("admin_flag <>", value, "adminFlag");
            return (Criteria) this;
        }

        public Criteria andAdminFlagGreaterThan(String value) {
            addCriterion("admin_flag >", value, "adminFlag");
            return (Criteria) this;
        }

        public Criteria andAdminFlagGreaterThanOrEqualTo(String value) {
            addCriterion("admin_flag >=", value, "adminFlag");
            return (Criteria) this;
        }

        public Criteria andAdminFlagLessThan(String value) {
            addCriterion("admin_flag <", value, "adminFlag");
            return (Criteria) this;
        }

        public Criteria andAdminFlagLessThanOrEqualTo(String value) {
            addCriterion("admin_flag <=", value, "adminFlag");
            return (Criteria) this;
        }

        public Criteria andAdminFlagLike(String value) {
            addCriterion("admin_flag like", value, "adminFlag");
            return (Criteria) this;
        }

        public Criteria andAdminFlagNotLike(String value) {
            addCriterion("admin_flag not like", value, "adminFlag");
            return (Criteria) this;
        }

        public Criteria andAdminFlagIn(List<String> values) {
            addCriterion("admin_flag in", values, "adminFlag");
            return (Criteria) this;
        }

        public Criteria andAdminFlagNotIn(List<String> values) {
            addCriterion("admin_flag not in", values, "adminFlag");
            return (Criteria) this;
        }

        public Criteria andAdminFlagBetween(String value1, String value2) {
            addCriterion("admin_flag between", value1, value2, "adminFlag");
            return (Criteria) this;
        }

        public Criteria andAdminFlagNotBetween(String value1, String value2) {
            addCriterion("admin_flag not between", value1, value2, "adminFlag");
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