package jp.co.axio.masterMentsetSystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WUploadSubEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WUploadSubEntityExample() {
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

        public Criteria andUploadUserIdIsNull() {
            addCriterion("upload_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIsNotNull() {
            addCriterion("upload_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdEqualTo(String value) {
            addCriterion("upload_user_id =", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotEqualTo(String value) {
            addCriterion("upload_user_id <>", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdGreaterThan(String value) {
            addCriterion("upload_user_id >", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("upload_user_id >=", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLessThan(String value) {
            addCriterion("upload_user_id <", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLessThanOrEqualTo(String value) {
            addCriterion("upload_user_id <=", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLike(String value) {
            addCriterion("upload_user_id like", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotLike(String value) {
            addCriterion("upload_user_id not like", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIn(List<String> values) {
            addCriterion("upload_user_id in", values, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotIn(List<String> values) {
            addCriterion("upload_user_id not in", values, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdBetween(String value1, String value2) {
            addCriterion("upload_user_id between", value1, value2, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotBetween(String value1, String value2) {
            addCriterion("upload_user_id not between", value1, value2, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserTsIsNull() {
            addCriterion("upload_user_ts is null");
            return (Criteria) this;
        }

        public Criteria andUploadUserTsIsNotNull() {
            addCriterion("upload_user_ts is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUserTsEqualTo(Date value) {
            addCriterion("upload_user_ts =", value, "uploadUserTs");
            return (Criteria) this;
        }

        public Criteria andUploadUserTsNotEqualTo(Date value) {
            addCriterion("upload_user_ts <>", value, "uploadUserTs");
            return (Criteria) this;
        }

        public Criteria andUploadUserTsGreaterThan(Date value) {
            addCriterion("upload_user_ts >", value, "uploadUserTs");
            return (Criteria) this;
        }

        public Criteria andUploadUserTsGreaterThanOrEqualTo(Date value) {
            addCriterion("upload_user_ts >=", value, "uploadUserTs");
            return (Criteria) this;
        }

        public Criteria andUploadUserTsLessThan(Date value) {
            addCriterion("upload_user_ts <", value, "uploadUserTs");
            return (Criteria) this;
        }

        public Criteria andUploadUserTsLessThanOrEqualTo(Date value) {
            addCriterion("upload_user_ts <=", value, "uploadUserTs");
            return (Criteria) this;
        }

        public Criteria andUploadUserTsIn(List<Date> values) {
            addCriterion("upload_user_ts in", values, "uploadUserTs");
            return (Criteria) this;
        }

        public Criteria andUploadUserTsNotIn(List<Date> values) {
            addCriterion("upload_user_ts not in", values, "uploadUserTs");
            return (Criteria) this;
        }

        public Criteria andUploadUserTsBetween(Date value1, Date value2) {
            addCriterion("upload_user_ts between", value1, value2, "uploadUserTs");
            return (Criteria) this;
        }

        public Criteria andUploadUserTsNotBetween(Date value1, Date value2) {
            addCriterion("upload_user_ts not between", value1, value2, "uploadUserTs");
            return (Criteria) this;
        }

        public Criteria andUploadSessionIsNull() {
            addCriterion("upload_session is null");
            return (Criteria) this;
        }

        public Criteria andUploadSessionIsNotNull() {
            addCriterion("upload_session is not null");
            return (Criteria) this;
        }

        public Criteria andUploadSessionEqualTo(String value) {
            addCriterion("upload_session =", value, "uploadSession");
            return (Criteria) this;
        }

        public Criteria andUploadSessionNotEqualTo(String value) {
            addCriterion("upload_session <>", value, "uploadSession");
            return (Criteria) this;
        }

        public Criteria andUploadSessionGreaterThan(String value) {
            addCriterion("upload_session >", value, "uploadSession");
            return (Criteria) this;
        }

        public Criteria andUploadSessionGreaterThanOrEqualTo(String value) {
            addCriterion("upload_session >=", value, "uploadSession");
            return (Criteria) this;
        }

        public Criteria andUploadSessionLessThan(String value) {
            addCriterion("upload_session <", value, "uploadSession");
            return (Criteria) this;
        }

        public Criteria andUploadSessionLessThanOrEqualTo(String value) {
            addCriterion("upload_session <=", value, "uploadSession");
            return (Criteria) this;
        }

        public Criteria andUploadSessionLike(String value) {
            addCriterion("upload_session like", value, "uploadSession");
            return (Criteria) this;
        }

        public Criteria andUploadSessionNotLike(String value) {
            addCriterion("upload_session not like", value, "uploadSession");
            return (Criteria) this;
        }

        public Criteria andUploadSessionIn(List<String> values) {
            addCriterion("upload_session in", values, "uploadSession");
            return (Criteria) this;
        }

        public Criteria andUploadSessionNotIn(List<String> values) {
            addCriterion("upload_session not in", values, "uploadSession");
            return (Criteria) this;
        }

        public Criteria andUploadSessionBetween(String value1, String value2) {
            addCriterion("upload_session between", value1, value2, "uploadSession");
            return (Criteria) this;
        }

        public Criteria andUploadSessionNotBetween(String value1, String value2) {
            addCriterion("upload_session not between", value1, value2, "uploadSession");
            return (Criteria) this;
        }

        public Criteria andProcessFlagIsNull() {
            addCriterion("process_flag is null");
            return (Criteria) this;
        }

        public Criteria andProcessFlagIsNotNull() {
            addCriterion("process_flag is not null");
            return (Criteria) this;
        }

        public Criteria andProcessFlagEqualTo(String value) {
            addCriterion("process_flag =", value, "processFlag");
            return (Criteria) this;
        }

        public Criteria andProcessFlagNotEqualTo(String value) {
            addCriterion("process_flag <>", value, "processFlag");
            return (Criteria) this;
        }

        public Criteria andProcessFlagGreaterThan(String value) {
            addCriterion("process_flag >", value, "processFlag");
            return (Criteria) this;
        }

        public Criteria andProcessFlagGreaterThanOrEqualTo(String value) {
            addCriterion("process_flag >=", value, "processFlag");
            return (Criteria) this;
        }

        public Criteria andProcessFlagLessThan(String value) {
            addCriterion("process_flag <", value, "processFlag");
            return (Criteria) this;
        }

        public Criteria andProcessFlagLessThanOrEqualTo(String value) {
            addCriterion("process_flag <=", value, "processFlag");
            return (Criteria) this;
        }

        public Criteria andProcessFlagLike(String value) {
            addCriterion("process_flag like", value, "processFlag");
            return (Criteria) this;
        }

        public Criteria andProcessFlagNotLike(String value) {
            addCriterion("process_flag not like", value, "processFlag");
            return (Criteria) this;
        }

        public Criteria andProcessFlagIn(List<String> values) {
            addCriterion("process_flag in", values, "processFlag");
            return (Criteria) this;
        }

        public Criteria andProcessFlagNotIn(List<String> values) {
            addCriterion("process_flag not in", values, "processFlag");
            return (Criteria) this;
        }

        public Criteria andProcessFlagBetween(String value1, String value2) {
            addCriterion("process_flag between", value1, value2, "processFlag");
            return (Criteria) this;
        }

        public Criteria andProcessFlagNotBetween(String value1, String value2) {
            addCriterion("process_flag not between", value1, value2, "processFlag");
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