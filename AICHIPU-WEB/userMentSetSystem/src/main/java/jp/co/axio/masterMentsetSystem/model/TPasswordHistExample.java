package jp.co.axio.masterMentsetSystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPasswordHistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPasswordHistExample() {
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

        public Criteria andPasswordUpdateTsIsNull() {
            addCriterion("password_update_ts is null");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTsIsNotNull() {
            addCriterion("password_update_ts is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTsEqualTo(Date value) {
            addCriterion("password_update_ts =", value, "passwordUpdateTs");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTsNotEqualTo(Date value) {
            addCriterion("password_update_ts <>", value, "passwordUpdateTs");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTsGreaterThan(Date value) {
            addCriterion("password_update_ts >", value, "passwordUpdateTs");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTsGreaterThanOrEqualTo(Date value) {
            addCriterion("password_update_ts >=", value, "passwordUpdateTs");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTsLessThan(Date value) {
            addCriterion("password_update_ts <", value, "passwordUpdateTs");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTsLessThanOrEqualTo(Date value) {
            addCriterion("password_update_ts <=", value, "passwordUpdateTs");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTsIn(List<Date> values) {
            addCriterion("password_update_ts in", values, "passwordUpdateTs");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTsNotIn(List<Date> values) {
            addCriterion("password_update_ts not in", values, "passwordUpdateTs");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTsBetween(Date value1, Date value2) {
            addCriterion("password_update_ts between", value1, value2, "passwordUpdateTs");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTsNotBetween(Date value1, Date value2) {
            addCriterion("password_update_ts not between", value1, value2, "passwordUpdateTs");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdaterIdIsNull() {
            addCriterion("password_updater_id is null");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdaterIdIsNotNull() {
            addCriterion("password_updater_id is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdaterIdEqualTo(String value) {
            addCriterion("password_updater_id =", value, "passwordUpdaterId");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdaterIdNotEqualTo(String value) {
            addCriterion("password_updater_id <>", value, "passwordUpdaterId");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdaterIdGreaterThan(String value) {
            addCriterion("password_updater_id >", value, "passwordUpdaterId");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdaterIdGreaterThanOrEqualTo(String value) {
            addCriterion("password_updater_id >=", value, "passwordUpdaterId");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdaterIdLessThan(String value) {
            addCriterion("password_updater_id <", value, "passwordUpdaterId");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdaterIdLessThanOrEqualTo(String value) {
            addCriterion("password_updater_id <=", value, "passwordUpdaterId");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdaterIdLike(String value) {
            addCriterion("password_updater_id like", value, "passwordUpdaterId");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdaterIdNotLike(String value) {
            addCriterion("password_updater_id not like", value, "passwordUpdaterId");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdaterIdIn(List<String> values) {
            addCriterion("password_updater_id in", values, "passwordUpdaterId");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdaterIdNotIn(List<String> values) {
            addCriterion("password_updater_id not in", values, "passwordUpdaterId");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdaterIdBetween(String value1, String value2) {
            addCriterion("password_updater_id between", value1, value2, "passwordUpdaterId");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdaterIdNotBetween(String value1, String value2) {
            addCriterion("password_updater_id not between", value1, value2, "passwordUpdaterId");
            return (Criteria) this;
        }

        public Criteria andCurrPasswordIsNull() {
            addCriterion("curr_password is null");
            return (Criteria) this;
        }

        public Criteria andCurrPasswordIsNotNull() {
            addCriterion("curr_password is not null");
            return (Criteria) this;
        }

        public Criteria andCurrPasswordEqualTo(String value) {
            addCriterion("curr_password =", value, "currPassword");
            return (Criteria) this;
        }

        public Criteria andCurrPasswordNotEqualTo(String value) {
            addCriterion("curr_password <>", value, "currPassword");
            return (Criteria) this;
        }

        public Criteria andCurrPasswordGreaterThan(String value) {
            addCriterion("curr_password >", value, "currPassword");
            return (Criteria) this;
        }

        public Criteria andCurrPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("curr_password >=", value, "currPassword");
            return (Criteria) this;
        }

        public Criteria andCurrPasswordLessThan(String value) {
            addCriterion("curr_password <", value, "currPassword");
            return (Criteria) this;
        }

        public Criteria andCurrPasswordLessThanOrEqualTo(String value) {
            addCriterion("curr_password <=", value, "currPassword");
            return (Criteria) this;
        }

        public Criteria andCurrPasswordLike(String value) {
            addCriterion("curr_password like", value, "currPassword");
            return (Criteria) this;
        }

        public Criteria andCurrPasswordNotLike(String value) {
            addCriterion("curr_password not like", value, "currPassword");
            return (Criteria) this;
        }

        public Criteria andCurrPasswordIn(List<String> values) {
            addCriterion("curr_password in", values, "currPassword");
            return (Criteria) this;
        }

        public Criteria andCurrPasswordNotIn(List<String> values) {
            addCriterion("curr_password not in", values, "currPassword");
            return (Criteria) this;
        }

        public Criteria andCurrPasswordBetween(String value1, String value2) {
            addCriterion("curr_password between", value1, value2, "currPassword");
            return (Criteria) this;
        }

        public Criteria andCurrPasswordNotBetween(String value1, String value2) {
            addCriterion("curr_password not between", value1, value2, "currPassword");
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

        public Criteria andOpeIdIsNull() {
            addCriterion("ope_id is null");
            return (Criteria) this;
        }

        public Criteria andOpeIdIsNotNull() {
            addCriterion("ope_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpeIdEqualTo(String value) {
            addCriterion("ope_id =", value, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdNotEqualTo(String value) {
            addCriterion("ope_id <>", value, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdGreaterThan(String value) {
            addCriterion("ope_id >", value, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ope_id >=", value, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdLessThan(String value) {
            addCriterion("ope_id <", value, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdLessThanOrEqualTo(String value) {
            addCriterion("ope_id <=", value, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdLike(String value) {
            addCriterion("ope_id like", value, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdNotLike(String value) {
            addCriterion("ope_id not like", value, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdIn(List<String> values) {
            addCriterion("ope_id in", values, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdNotIn(List<String> values) {
            addCriterion("ope_id not in", values, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdBetween(String value1, String value2) {
            addCriterion("ope_id between", value1, value2, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdNotBetween(String value1, String value2) {
            addCriterion("ope_id not between", value1, value2, "opeId");
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