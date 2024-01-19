package jp.co.axio.masterMentsetSystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TAuthHistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAuthHistExample() {
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

        public Criteria andWebKbnIsNull() {
            addCriterion("web_kbn is null");
            return (Criteria) this;
        }

        public Criteria andWebKbnIsNotNull() {
            addCriterion("web_kbn is not null");
            return (Criteria) this;
        }

        public Criteria andWebKbnEqualTo(String value) {
            addCriterion("web_kbn =", value, "webKbn");
            return (Criteria) this;
        }

        public Criteria andWebKbnNotEqualTo(String value) {
            addCriterion("web_kbn <>", value, "webKbn");
            return (Criteria) this;
        }

        public Criteria andWebKbnGreaterThan(String value) {
            addCriterion("web_kbn >", value, "webKbn");
            return (Criteria) this;
        }

        public Criteria andWebKbnGreaterThanOrEqualTo(String value) {
            addCriterion("web_kbn >=", value, "webKbn");
            return (Criteria) this;
        }

        public Criteria andWebKbnLessThan(String value) {
            addCriterion("web_kbn <", value, "webKbn");
            return (Criteria) this;
        }

        public Criteria andWebKbnLessThanOrEqualTo(String value) {
            addCriterion("web_kbn <=", value, "webKbn");
            return (Criteria) this;
        }

        public Criteria andWebKbnLike(String value) {
            addCriterion("web_kbn like", value, "webKbn");
            return (Criteria) this;
        }

        public Criteria andWebKbnNotLike(String value) {
            addCriterion("web_kbn not like", value, "webKbn");
            return (Criteria) this;
        }

        public Criteria andWebKbnIn(List<String> values) {
            addCriterion("web_kbn in", values, "webKbn");
            return (Criteria) this;
        }

        public Criteria andWebKbnNotIn(List<String> values) {
            addCriterion("web_kbn not in", values, "webKbn");
            return (Criteria) this;
        }

        public Criteria andWebKbnBetween(String value1, String value2) {
            addCriterion("web_kbn between", value1, value2, "webKbn");
            return (Criteria) this;
        }

        public Criteria andWebKbnNotBetween(String value1, String value2) {
            addCriterion("web_kbn not between", value1, value2, "webKbn");
            return (Criteria) this;
        }

        public Criteria andAuthTsIsNull() {
            addCriterion("auth_ts is null");
            return (Criteria) this;
        }

        public Criteria andAuthTsIsNotNull() {
            addCriterion("auth_ts is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTsEqualTo(Date value) {
            addCriterion("auth_ts =", value, "authTs");
            return (Criteria) this;
        }

        public Criteria andAuthTsNotEqualTo(Date value) {
            addCriterion("auth_ts <>", value, "authTs");
            return (Criteria) this;
        }

        public Criteria andAuthTsGreaterThan(Date value) {
            addCriterion("auth_ts >", value, "authTs");
            return (Criteria) this;
        }

        public Criteria andAuthTsGreaterThanOrEqualTo(Date value) {
            addCriterion("auth_ts >=", value, "authTs");
            return (Criteria) this;
        }

        public Criteria andAuthTsLessThan(Date value) {
            addCriterion("auth_ts <", value, "authTs");
            return (Criteria) this;
        }

        public Criteria andAuthTsLessThanOrEqualTo(Date value) {
            addCriterion("auth_ts <=", value, "authTs");
            return (Criteria) this;
        }

        public Criteria andAuthTsIn(List<Date> values) {
            addCriterion("auth_ts in", values, "authTs");
            return (Criteria) this;
        }

        public Criteria andAuthTsNotIn(List<Date> values) {
            addCriterion("auth_ts not in", values, "authTs");
            return (Criteria) this;
        }

        public Criteria andAuthTsBetween(Date value1, Date value2) {
            addCriterion("auth_ts between", value1, value2, "authTs");
            return (Criteria) this;
        }

        public Criteria andAuthTsNotBetween(Date value1, Date value2) {
            addCriterion("auth_ts not between", value1, value2, "authTs");
            return (Criteria) this;
        }

        public Criteria andAuthFailFlagIsNull() {
            addCriterion("auth_fail_flag is null");
            return (Criteria) this;
        }

        public Criteria andAuthFailFlagIsNotNull() {
            addCriterion("auth_fail_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAuthFailFlagEqualTo(String value) {
            addCriterion("auth_fail_flag =", value, "authFailFlag");
            return (Criteria) this;
        }

        public Criteria andAuthFailFlagNotEqualTo(String value) {
            addCriterion("auth_fail_flag <>", value, "authFailFlag");
            return (Criteria) this;
        }

        public Criteria andAuthFailFlagGreaterThan(String value) {
            addCriterion("auth_fail_flag >", value, "authFailFlag");
            return (Criteria) this;
        }

        public Criteria andAuthFailFlagGreaterThanOrEqualTo(String value) {
            addCriterion("auth_fail_flag >=", value, "authFailFlag");
            return (Criteria) this;
        }

        public Criteria andAuthFailFlagLessThan(String value) {
            addCriterion("auth_fail_flag <", value, "authFailFlag");
            return (Criteria) this;
        }

        public Criteria andAuthFailFlagLessThanOrEqualTo(String value) {
            addCriterion("auth_fail_flag <=", value, "authFailFlag");
            return (Criteria) this;
        }

        public Criteria andAuthFailFlagLike(String value) {
            addCriterion("auth_fail_flag like", value, "authFailFlag");
            return (Criteria) this;
        }

        public Criteria andAuthFailFlagNotLike(String value) {
            addCriterion("auth_fail_flag not like", value, "authFailFlag");
            return (Criteria) this;
        }

        public Criteria andAuthFailFlagIn(List<String> values) {
            addCriterion("auth_fail_flag in", values, "authFailFlag");
            return (Criteria) this;
        }

        public Criteria andAuthFailFlagNotIn(List<String> values) {
            addCriterion("auth_fail_flag not in", values, "authFailFlag");
            return (Criteria) this;
        }

        public Criteria andAuthFailFlagBetween(String value1, String value2) {
            addCriterion("auth_fail_flag between", value1, value2, "authFailFlag");
            return (Criteria) this;
        }

        public Criteria andAuthFailFlagNotBetween(String value1, String value2) {
            addCriterion("auth_fail_flag not between", value1, value2, "authFailFlag");
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