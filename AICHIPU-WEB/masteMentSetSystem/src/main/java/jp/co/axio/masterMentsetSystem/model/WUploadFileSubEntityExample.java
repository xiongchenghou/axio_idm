package jp.co.axio.masterMentsetSystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WUploadFileSubEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WUploadFileSubEntityExample() {
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

        public Criteria andRowNoIsNull() {
            addCriterion("row_no is null");
            return (Criteria) this;
        }

        public Criteria andRowNoIsNotNull() {
            addCriterion("row_no is not null");
            return (Criteria) this;
        }

        public Criteria andRowNoEqualTo(Integer value) {
            addCriterion("row_no =", value, "rowNo");
            return (Criteria) this;
        }

        public Criteria andRowNoNotEqualTo(Integer value) {
            addCriterion("row_no <>", value, "rowNo");
            return (Criteria) this;
        }

        public Criteria andRowNoGreaterThan(Integer value) {
            addCriterion("row_no >", value, "rowNo");
            return (Criteria) this;
        }

        public Criteria andRowNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("row_no >=", value, "rowNo");
            return (Criteria) this;
        }

        public Criteria andRowNoLessThan(Integer value) {
            addCriterion("row_no <", value, "rowNo");
            return (Criteria) this;
        }

        public Criteria andRowNoLessThanOrEqualTo(Integer value) {
            addCriterion("row_no <=", value, "rowNo");
            return (Criteria) this;
        }

        public Criteria andRowNoIn(List<Integer> values) {
            addCriterion("row_no in", values, "rowNo");
            return (Criteria) this;
        }

        public Criteria andRowNoNotIn(List<Integer> values) {
            addCriterion("row_no not in", values, "rowNo");
            return (Criteria) this;
        }

        public Criteria andRowNoBetween(Integer value1, Integer value2) {
            addCriterion("row_no between", value1, value2, "rowNo");
            return (Criteria) this;
        }

        public Criteria andRowNoNotBetween(Integer value1, Integer value2) {
            addCriterion("row_no not between", value1, value2, "rowNo");
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

        public Criteria andRowDataIsNull() {
            addCriterion("row_data is null");
            return (Criteria) this;
        }

        public Criteria andRowDataIsNotNull() {
            addCriterion("row_data is not null");
            return (Criteria) this;
        }

        public Criteria andRowDataEqualTo(String value) {
            addCriterion("row_data =", value, "rowData");
            return (Criteria) this;
        }

        public Criteria andRowDataNotEqualTo(String value) {
            addCriterion("row_data <>", value, "rowData");
            return (Criteria) this;
        }

        public Criteria andRowDataGreaterThan(String value) {
            addCriterion("row_data >", value, "rowData");
            return (Criteria) this;
        }

        public Criteria andRowDataGreaterThanOrEqualTo(String value) {
            addCriterion("row_data >=", value, "rowData");
            return (Criteria) this;
        }

        public Criteria andRowDataLessThan(String value) {
            addCriterion("row_data <", value, "rowData");
            return (Criteria) this;
        }

        public Criteria andRowDataLessThanOrEqualTo(String value) {
            addCriterion("row_data <=", value, "rowData");
            return (Criteria) this;
        }

        public Criteria andRowDataLike(String value) {
            addCriterion("row_data like", value, "rowData");
            return (Criteria) this;
        }

        public Criteria andRowDataNotLike(String value) {
            addCriterion("row_data not like", value, "rowData");
            return (Criteria) this;
        }

        public Criteria andRowDataIn(List<String> values) {
            addCriterion("row_data in", values, "rowData");
            return (Criteria) this;
        }

        public Criteria andRowDataNotIn(List<String> values) {
            addCriterion("row_data not in", values, "rowData");
            return (Criteria) this;
        }

        public Criteria andRowDataBetween(String value1, String value2) {
            addCriterion("row_data between", value1, value2, "rowData");
            return (Criteria) this;
        }

        public Criteria andRowDataNotBetween(String value1, String value2) {
            addCriterion("row_data not between", value1, value2, "rowData");
            return (Criteria) this;
        }

        public Criteria andCheckFlagIsNull() {
            addCriterion("check_flag is null");
            return (Criteria) this;
        }

        public Criteria andCheckFlagIsNotNull() {
            addCriterion("check_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFlagEqualTo(String value) {
            addCriterion("check_flag =", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotEqualTo(String value) {
            addCriterion("check_flag <>", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagGreaterThan(String value) {
            addCriterion("check_flag >", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagGreaterThanOrEqualTo(String value) {
            addCriterion("check_flag >=", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagLessThan(String value) {
            addCriterion("check_flag <", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagLessThanOrEqualTo(String value) {
            addCriterion("check_flag <=", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagLike(String value) {
            addCriterion("check_flag like", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotLike(String value) {
            addCriterion("check_flag not like", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagIn(List<String> values) {
            addCriterion("check_flag in", values, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotIn(List<String> values) {
            addCriterion("check_flag not in", values, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagBetween(String value1, String value2) {
            addCriterion("check_flag between", value1, value2, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotBetween(String value1, String value2) {
            addCriterion("check_flag not between", value1, value2, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckMessageIsNull() {
            addCriterion("check_message is null");
            return (Criteria) this;
        }

        public Criteria andCheckMessageIsNotNull() {
            addCriterion("check_message is not null");
            return (Criteria) this;
        }

        public Criteria andCheckMessageEqualTo(String value) {
            addCriterion("check_message =", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageNotEqualTo(String value) {
            addCriterion("check_message <>", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageGreaterThan(String value) {
            addCriterion("check_message >", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageGreaterThanOrEqualTo(String value) {
            addCriterion("check_message >=", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageLessThan(String value) {
            addCriterion("check_message <", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageLessThanOrEqualTo(String value) {
            addCriterion("check_message <=", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageLike(String value) {
            addCriterion("check_message like", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageNotLike(String value) {
            addCriterion("check_message not like", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageIn(List<String> values) {
            addCriterion("check_message in", values, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageNotIn(List<String> values) {
            addCriterion("check_message not in", values, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageBetween(String value1, String value2) {
            addCriterion("check_message between", value1, value2, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageNotBetween(String value1, String value2) {
            addCriterion("check_message not between", value1, value2, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andProcessKbnIsNull() {
            addCriterion("process_kbn is null");
            return (Criteria) this;
        }

        public Criteria andProcessKbnIsNotNull() {
            addCriterion("process_kbn is not null");
            return (Criteria) this;
        }

        public Criteria andProcessKbnEqualTo(String value) {
            addCriterion("process_kbn =", value, "processKbn");
            return (Criteria) this;
        }

        public Criteria andProcessKbnNotEqualTo(String value) {
            addCriterion("process_kbn <>", value, "processKbn");
            return (Criteria) this;
        }

        public Criteria andProcessKbnGreaterThan(String value) {
            addCriterion("process_kbn >", value, "processKbn");
            return (Criteria) this;
        }

        public Criteria andProcessKbnGreaterThanOrEqualTo(String value) {
            addCriterion("process_kbn >=", value, "processKbn");
            return (Criteria) this;
        }

        public Criteria andProcessKbnLessThan(String value) {
            addCriterion("process_kbn <", value, "processKbn");
            return (Criteria) this;
        }

        public Criteria andProcessKbnLessThanOrEqualTo(String value) {
            addCriterion("process_kbn <=", value, "processKbn");
            return (Criteria) this;
        }

        public Criteria andProcessKbnLike(String value) {
            addCriterion("process_kbn like", value, "processKbn");
            return (Criteria) this;
        }

        public Criteria andProcessKbnNotLike(String value) {
            addCriterion("process_kbn not like", value, "processKbn");
            return (Criteria) this;
        }

        public Criteria andProcessKbnIn(List<String> values) {
            addCriterion("process_kbn in", values, "processKbn");
            return (Criteria) this;
        }

        public Criteria andProcessKbnNotIn(List<String> values) {
            addCriterion("process_kbn not in", values, "processKbn");
            return (Criteria) this;
        }

        public Criteria andProcessKbnBetween(String value1, String value2) {
            addCriterion("process_kbn between", value1, value2, "processKbn");
            return (Criteria) this;
        }

        public Criteria andProcessKbnNotBetween(String value1, String value2) {
            addCriterion("process_kbn not between", value1, value2, "processKbn");
            return (Criteria) this;
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

        public Criteria andColumn1IsNull() {
            addCriterion("column_1 is null");
            return (Criteria) this;
        }

        public Criteria andColumn1IsNotNull() {
            addCriterion("column_1 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn1EqualTo(String value) {
            addCriterion("column_1 =", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotEqualTo(String value) {
            addCriterion("column_1 <>", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThan(String value) {
            addCriterion("column_1 >", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThanOrEqualTo(String value) {
            addCriterion("column_1 >=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThan(String value) {
            addCriterion("column_1 <", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThanOrEqualTo(String value) {
            addCriterion("column_1 <=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Like(String value) {
            addCriterion("column_1 like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotLike(String value) {
            addCriterion("column_1 not like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1In(List<String> values) {
            addCriterion("column_1 in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotIn(List<String> values) {
            addCriterion("column_1 not in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Between(String value1, String value2) {
            addCriterion("column_1 between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotBetween(String value1, String value2) {
            addCriterion("column_1 not between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNull() {
            addCriterion("column_2 is null");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNotNull() {
            addCriterion("column_2 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn2EqualTo(String value) {
            addCriterion("column_2 =", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotEqualTo(String value) {
            addCriterion("column_2 <>", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThan(String value) {
            addCriterion("column_2 >", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThanOrEqualTo(String value) {
            addCriterion("column_2 >=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThan(String value) {
            addCriterion("column_2 <", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThanOrEqualTo(String value) {
            addCriterion("column_2 <=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2Like(String value) {
            addCriterion("column_2 like", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotLike(String value) {
            addCriterion("column_2 not like", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2In(List<String> values) {
            addCriterion("column_2 in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotIn(List<String> values) {
            addCriterion("column_2 not in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2Between(String value1, String value2) {
            addCriterion("column_2 between", value1, value2, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotBetween(String value1, String value2) {
            addCriterion("column_2 not between", value1, value2, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn3IsNull() {
            addCriterion("column_3 is null");
            return (Criteria) this;
        }

        public Criteria andColumn3IsNotNull() {
            addCriterion("column_3 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn3EqualTo(String value) {
            addCriterion("column_3 =", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotEqualTo(String value) {
            addCriterion("column_3 <>", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3GreaterThan(String value) {
            addCriterion("column_3 >", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3GreaterThanOrEqualTo(String value) {
            addCriterion("column_3 >=", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3LessThan(String value) {
            addCriterion("column_3 <", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3LessThanOrEqualTo(String value) {
            addCriterion("column_3 <=", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3Like(String value) {
            addCriterion("column_3 like", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotLike(String value) {
            addCriterion("column_3 not like", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3In(List<String> values) {
            addCriterion("column_3 in", values, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotIn(List<String> values) {
            addCriterion("column_3 not in", values, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3Between(String value1, String value2) {
            addCriterion("column_3 between", value1, value2, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotBetween(String value1, String value2) {
            addCriterion("column_3 not between", value1, value2, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn4IsNull() {
            addCriterion("column_4 is null");
            return (Criteria) this;
        }

        public Criteria andColumn4IsNotNull() {
            addCriterion("column_4 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn4EqualTo(String value) {
            addCriterion("column_4 =", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4NotEqualTo(String value) {
            addCriterion("column_4 <>", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4GreaterThan(String value) {
            addCriterion("column_4 >", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4GreaterThanOrEqualTo(String value) {
            addCriterion("column_4 >=", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4LessThan(String value) {
            addCriterion("column_4 <", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4LessThanOrEqualTo(String value) {
            addCriterion("column_4 <=", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4Like(String value) {
            addCriterion("column_4 like", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4NotLike(String value) {
            addCriterion("column_4 not like", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4In(List<String> values) {
            addCriterion("column_4 in", values, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4NotIn(List<String> values) {
            addCriterion("column_4 not in", values, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4Between(String value1, String value2) {
            addCriterion("column_4 between", value1, value2, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4NotBetween(String value1, String value2) {
            addCriterion("column_4 not between", value1, value2, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn5IsNull() {
            addCriterion("column_5 is null");
            return (Criteria) this;
        }

        public Criteria andColumn5IsNotNull() {
            addCriterion("column_5 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn5EqualTo(String value) {
            addCriterion("column_5 =", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5NotEqualTo(String value) {
            addCriterion("column_5 <>", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5GreaterThan(String value) {
            addCriterion("column_5 >", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5GreaterThanOrEqualTo(String value) {
            addCriterion("column_5 >=", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5LessThan(String value) {
            addCriterion("column_5 <", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5LessThanOrEqualTo(String value) {
            addCriterion("column_5 <=", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5Like(String value) {
            addCriterion("column_5 like", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5NotLike(String value) {
            addCriterion("column_5 not like", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5In(List<String> values) {
            addCriterion("column_5 in", values, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5NotIn(List<String> values) {
            addCriterion("column_5 not in", values, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5Between(String value1, String value2) {
            addCriterion("column_5 between", value1, value2, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5NotBetween(String value1, String value2) {
            addCriterion("column_5 not between", value1, value2, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn6IsNull() {
            addCriterion("column_6 is null");
            return (Criteria) this;
        }

        public Criteria andColumn6IsNotNull() {
            addCriterion("column_6 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn6EqualTo(String value) {
            addCriterion("column_6 =", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6NotEqualTo(String value) {
            addCriterion("column_6 <>", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6GreaterThan(String value) {
            addCriterion("column_6 >", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6GreaterThanOrEqualTo(String value) {
            addCriterion("column_6 >=", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6LessThan(String value) {
            addCriterion("column_6 <", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6LessThanOrEqualTo(String value) {
            addCriterion("column_6 <=", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6Like(String value) {
            addCriterion("column_6 like", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6NotLike(String value) {
            addCriterion("column_6 not like", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6In(List<String> values) {
            addCriterion("column_6 in", values, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6NotIn(List<String> values) {
            addCriterion("column_6 not in", values, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6Between(String value1, String value2) {
            addCriterion("column_6 between", value1, value2, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6NotBetween(String value1, String value2) {
            addCriterion("column_6 not between", value1, value2, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn7IsNull() {
            addCriterion("column_7 is null");
            return (Criteria) this;
        }

        public Criteria andColumn7IsNotNull() {
            addCriterion("column_7 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn7EqualTo(String value) {
            addCriterion("column_7 =", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7NotEqualTo(String value) {
            addCriterion("column_7 <>", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7GreaterThan(String value) {
            addCriterion("column_7 >", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7GreaterThanOrEqualTo(String value) {
            addCriterion("column_7 >=", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7LessThan(String value) {
            addCriterion("column_7 <", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7LessThanOrEqualTo(String value) {
            addCriterion("column_7 <=", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7Like(String value) {
            addCriterion("column_7 like", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7NotLike(String value) {
            addCriterion("column_7 not like", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7In(List<String> values) {
            addCriterion("column_7 in", values, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7NotIn(List<String> values) {
            addCriterion("column_7 not in", values, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7Between(String value1, String value2) {
            addCriterion("column_7 between", value1, value2, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7NotBetween(String value1, String value2) {
            addCriterion("column_7 not between", value1, value2, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn8IsNull() {
            addCriterion("column_8 is null");
            return (Criteria) this;
        }

        public Criteria andColumn8IsNotNull() {
            addCriterion("column_8 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn8EqualTo(String value) {
            addCriterion("column_8 =", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8NotEqualTo(String value) {
            addCriterion("column_8 <>", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8GreaterThan(String value) {
            addCriterion("column_8 >", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8GreaterThanOrEqualTo(String value) {
            addCriterion("column_8 >=", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8LessThan(String value) {
            addCriterion("column_8 <", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8LessThanOrEqualTo(String value) {
            addCriterion("column_8 <=", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8Like(String value) {
            addCriterion("column_8 like", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8NotLike(String value) {
            addCriterion("column_8 not like", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8In(List<String> values) {
            addCriterion("column_8 in", values, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8NotIn(List<String> values) {
            addCriterion("column_8 not in", values, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8Between(String value1, String value2) {
            addCriterion("column_8 between", value1, value2, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8NotBetween(String value1, String value2) {
            addCriterion("column_8 not between", value1, value2, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn9IsNull() {
            addCriterion("column_9 is null");
            return (Criteria) this;
        }

        public Criteria andColumn9IsNotNull() {
            addCriterion("column_9 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn9EqualTo(String value) {
            addCriterion("column_9 =", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9NotEqualTo(String value) {
            addCriterion("column_9 <>", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9GreaterThan(String value) {
            addCriterion("column_9 >", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9GreaterThanOrEqualTo(String value) {
            addCriterion("column_9 >=", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9LessThan(String value) {
            addCriterion("column_9 <", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9LessThanOrEqualTo(String value) {
            addCriterion("column_9 <=", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9Like(String value) {
            addCriterion("column_9 like", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9NotLike(String value) {
            addCriterion("column_9 not like", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9In(List<String> values) {
            addCriterion("column_9 in", values, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9NotIn(List<String> values) {
            addCriterion("column_9 not in", values, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9Between(String value1, String value2) {
            addCriterion("column_9 between", value1, value2, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9NotBetween(String value1, String value2) {
            addCriterion("column_9 not between", value1, value2, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn10IsNull() {
            addCriterion("column_10 is null");
            return (Criteria) this;
        }

        public Criteria andColumn10IsNotNull() {
            addCriterion("column_10 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn10EqualTo(String value) {
            addCriterion("column_10 =", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotEqualTo(String value) {
            addCriterion("column_10 <>", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10GreaterThan(String value) {
            addCriterion("column_10 >", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10GreaterThanOrEqualTo(String value) {
            addCriterion("column_10 >=", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10LessThan(String value) {
            addCriterion("column_10 <", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10LessThanOrEqualTo(String value) {
            addCriterion("column_10 <=", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10Like(String value) {
            addCriterion("column_10 like", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotLike(String value) {
            addCriterion("column_10 not like", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10In(List<String> values) {
            addCriterion("column_10 in", values, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotIn(List<String> values) {
            addCriterion("column_10 not in", values, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10Between(String value1, String value2) {
            addCriterion("column_10 between", value1, value2, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotBetween(String value1, String value2) {
            addCriterion("column_10 not between", value1, value2, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn11IsNull() {
            addCriterion("column_11 is null");
            return (Criteria) this;
        }

        public Criteria andColumn11IsNotNull() {
            addCriterion("column_11 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn11EqualTo(String value) {
            addCriterion("column_11 =", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11NotEqualTo(String value) {
            addCriterion("column_11 <>", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11GreaterThan(String value) {
            addCriterion("column_11 >", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11GreaterThanOrEqualTo(String value) {
            addCriterion("column_11 >=", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11LessThan(String value) {
            addCriterion("column_11 <", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11LessThanOrEqualTo(String value) {
            addCriterion("column_11 <=", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11Like(String value) {
            addCriterion("column_11 like", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11NotLike(String value) {
            addCriterion("column_11 not like", value, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11In(List<String> values) {
            addCriterion("column_11 in", values, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11NotIn(List<String> values) {
            addCriterion("column_11 not in", values, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11Between(String value1, String value2) {
            addCriterion("column_11 between", value1, value2, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn11NotBetween(String value1, String value2) {
            addCriterion("column_11 not between", value1, value2, "column11");
            return (Criteria) this;
        }

        public Criteria andColumn12IsNull() {
            addCriterion("column_12 is null");
            return (Criteria) this;
        }

        public Criteria andColumn12IsNotNull() {
            addCriterion("column_12 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn12EqualTo(String value) {
            addCriterion("column_12 =", value, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12NotEqualTo(String value) {
            addCriterion("column_12 <>", value, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12GreaterThan(String value) {
            addCriterion("column_12 >", value, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12GreaterThanOrEqualTo(String value) {
            addCriterion("column_12 >=", value, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12LessThan(String value) {
            addCriterion("column_12 <", value, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12LessThanOrEqualTo(String value) {
            addCriterion("column_12 <=", value, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12Like(String value) {
            addCriterion("column_12 like", value, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12NotLike(String value) {
            addCriterion("column_12 not like", value, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12In(List<String> values) {
            addCriterion("column_12 in", values, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12NotIn(List<String> values) {
            addCriterion("column_12 not in", values, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12Between(String value1, String value2) {
            addCriterion("column_12 between", value1, value2, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn12NotBetween(String value1, String value2) {
            addCriterion("column_12 not between", value1, value2, "column12");
            return (Criteria) this;
        }

        public Criteria andColumn13IsNull() {
            addCriterion("column_13 is null");
            return (Criteria) this;
        }

        public Criteria andColumn13IsNotNull() {
            addCriterion("column_13 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn13EqualTo(String value) {
            addCriterion("column_13 =", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13NotEqualTo(String value) {
            addCriterion("column_13 <>", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13GreaterThan(String value) {
            addCriterion("column_13 >", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13GreaterThanOrEqualTo(String value) {
            addCriterion("column_13 >=", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13LessThan(String value) {
            addCriterion("column_13 <", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13LessThanOrEqualTo(String value) {
            addCriterion("column_13 <=", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13Like(String value) {
            addCriterion("column_13 like", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13NotLike(String value) {
            addCriterion("column_13 not like", value, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13In(List<String> values) {
            addCriterion("column_13 in", values, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13NotIn(List<String> values) {
            addCriterion("column_13 not in", values, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13Between(String value1, String value2) {
            addCriterion("column_13 between", value1, value2, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn13NotBetween(String value1, String value2) {
            addCriterion("column_13 not between", value1, value2, "column13");
            return (Criteria) this;
        }

        public Criteria andColumn14IsNull() {
            addCriterion("column_14 is null");
            return (Criteria) this;
        }

        public Criteria andColumn14IsNotNull() {
            addCriterion("column_14 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn14EqualTo(String value) {
            addCriterion("column_14 =", value, "column14");
            return (Criteria) this;
        }

        public Criteria andColumn14NotEqualTo(String value) {
            addCriterion("column_14 <>", value, "column14");
            return (Criteria) this;
        }

        public Criteria andColumn14GreaterThan(String value) {
            addCriterion("column_14 >", value, "column14");
            return (Criteria) this;
        }

        public Criteria andColumn14GreaterThanOrEqualTo(String value) {
            addCriterion("column_14 >=", value, "column14");
            return (Criteria) this;
        }

        public Criteria andColumn14LessThan(String value) {
            addCriterion("column_14 <", value, "column14");
            return (Criteria) this;
        }

        public Criteria andColumn14LessThanOrEqualTo(String value) {
            addCriterion("column_14 <=", value, "column14");
            return (Criteria) this;
        }

        public Criteria andColumn14Like(String value) {
            addCriterion("column_14 like", value, "column14");
            return (Criteria) this;
        }

        public Criteria andColumn14NotLike(String value) {
            addCriterion("column_14 not like", value, "column14");
            return (Criteria) this;
        }

        public Criteria andColumn14In(List<String> values) {
            addCriterion("column_14 in", values, "column14");
            return (Criteria) this;
        }

        public Criteria andColumn14NotIn(List<String> values) {
            addCriterion("column_14 not in", values, "column14");
            return (Criteria) this;
        }

        public Criteria andColumn14Between(String value1, String value2) {
            addCriterion("column_14 between", value1, value2, "column14");
            return (Criteria) this;
        }

        public Criteria andColumn14NotBetween(String value1, String value2) {
            addCriterion("column_14 not between", value1, value2, "column14");
            return (Criteria) this;
        }

        public Criteria andColumn15IsNull() {
            addCriterion("column_15 is null");
            return (Criteria) this;
        }

        public Criteria andColumn15IsNotNull() {
            addCriterion("column_15 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn15EqualTo(String value) {
            addCriterion("column_15 =", value, "column15");
            return (Criteria) this;
        }

        public Criteria andColumn15NotEqualTo(String value) {
            addCriterion("column_15 <>", value, "column15");
            return (Criteria) this;
        }

        public Criteria andColumn15GreaterThan(String value) {
            addCriterion("column_15 >", value, "column15");
            return (Criteria) this;
        }

        public Criteria andColumn15GreaterThanOrEqualTo(String value) {
            addCriterion("column_15 >=", value, "column15");
            return (Criteria) this;
        }

        public Criteria andColumn15LessThan(String value) {
            addCriterion("column_15 <", value, "column15");
            return (Criteria) this;
        }

        public Criteria andColumn15LessThanOrEqualTo(String value) {
            addCriterion("column_15 <=", value, "column15");
            return (Criteria) this;
        }

        public Criteria andColumn15Like(String value) {
            addCriterion("column_15 like", value, "column15");
            return (Criteria) this;
        }

        public Criteria andColumn15NotLike(String value) {
            addCriterion("column_15 not like", value, "column15");
            return (Criteria) this;
        }

        public Criteria andColumn15In(List<String> values) {
            addCriterion("column_15 in", values, "column15");
            return (Criteria) this;
        }

        public Criteria andColumn15NotIn(List<String> values) {
            addCriterion("column_15 not in", values, "column15");
            return (Criteria) this;
        }

        public Criteria andColumn15Between(String value1, String value2) {
            addCriterion("column_15 between", value1, value2, "column15");
            return (Criteria) this;
        }

        public Criteria andColumn15NotBetween(String value1, String value2) {
            addCriterion("column_15 not between", value1, value2, "column15");
            return (Criteria) this;
        }

        public Criteria andColumn16IsNull() {
            addCriterion("column_16 is null");
            return (Criteria) this;
        }

        public Criteria andColumn16IsNotNull() {
            addCriterion("column_16 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn16EqualTo(String value) {
            addCriterion("column_16 =", value, "column16");
            return (Criteria) this;
        }

        public Criteria andColumn16NotEqualTo(String value) {
            addCriterion("column_16 <>", value, "column16");
            return (Criteria) this;
        }

        public Criteria andColumn16GreaterThan(String value) {
            addCriterion("column_16 >", value, "column16");
            return (Criteria) this;
        }

        public Criteria andColumn16GreaterThanOrEqualTo(String value) {
            addCriterion("column_16 >=", value, "column16");
            return (Criteria) this;
        }

        public Criteria andColumn16LessThan(String value) {
            addCriterion("column_16 <", value, "column16");
            return (Criteria) this;
        }

        public Criteria andColumn16LessThanOrEqualTo(String value) {
            addCriterion("column_16 <=", value, "column16");
            return (Criteria) this;
        }

        public Criteria andColumn16Like(String value) {
            addCriterion("column_16 like", value, "column16");
            return (Criteria) this;
        }

        public Criteria andColumn16NotLike(String value) {
            addCriterion("column_16 not like", value, "column16");
            return (Criteria) this;
        }

        public Criteria andColumn16In(List<String> values) {
            addCriterion("column_16 in", values, "column16");
            return (Criteria) this;
        }

        public Criteria andColumn16NotIn(List<String> values) {
            addCriterion("column_16 not in", values, "column16");
            return (Criteria) this;
        }

        public Criteria andColumn16Between(String value1, String value2) {
            addCriterion("column_16 between", value1, value2, "column16");
            return (Criteria) this;
        }

        public Criteria andColumn16NotBetween(String value1, String value2) {
            addCriterion("column_16 not between", value1, value2, "column16");
            return (Criteria) this;
        }

        public Criteria andColumn17IsNull() {
            addCriterion("column_17 is null");
            return (Criteria) this;
        }

        public Criteria andColumn17IsNotNull() {
            addCriterion("column_17 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn17EqualTo(String value) {
            addCriterion("column_17 =", value, "column17");
            return (Criteria) this;
        }

        public Criteria andColumn17NotEqualTo(String value) {
            addCriterion("column_17 <>", value, "column17");
            return (Criteria) this;
        }

        public Criteria andColumn17GreaterThan(String value) {
            addCriterion("column_17 >", value, "column17");
            return (Criteria) this;
        }

        public Criteria andColumn17GreaterThanOrEqualTo(String value) {
            addCriterion("column_17 >=", value, "column17");
            return (Criteria) this;
        }

        public Criteria andColumn17LessThan(String value) {
            addCriterion("column_17 <", value, "column17");
            return (Criteria) this;
        }

        public Criteria andColumn17LessThanOrEqualTo(String value) {
            addCriterion("column_17 <=", value, "column17");
            return (Criteria) this;
        }

        public Criteria andColumn17Like(String value) {
            addCriterion("column_17 like", value, "column17");
            return (Criteria) this;
        }

        public Criteria andColumn17NotLike(String value) {
            addCriterion("column_17 not like", value, "column17");
            return (Criteria) this;
        }

        public Criteria andColumn17In(List<String> values) {
            addCriterion("column_17 in", values, "column17");
            return (Criteria) this;
        }

        public Criteria andColumn17NotIn(List<String> values) {
            addCriterion("column_17 not in", values, "column17");
            return (Criteria) this;
        }

        public Criteria andColumn17Between(String value1, String value2) {
            addCriterion("column_17 between", value1, value2, "column17");
            return (Criteria) this;
        }

        public Criteria andColumn17NotBetween(String value1, String value2) {
            addCriterion("column_17 not between", value1, value2, "column17");
            return (Criteria) this;
        }

        public Criteria andColumn18IsNull() {
            addCriterion("column_18 is null");
            return (Criteria) this;
        }

        public Criteria andColumn18IsNotNull() {
            addCriterion("column_18 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn18EqualTo(String value) {
            addCriterion("column_18 =", value, "column18");
            return (Criteria) this;
        }

        public Criteria andColumn18NotEqualTo(String value) {
            addCriterion("column_18 <>", value, "column18");
            return (Criteria) this;
        }

        public Criteria andColumn18GreaterThan(String value) {
            addCriterion("column_18 >", value, "column18");
            return (Criteria) this;
        }

        public Criteria andColumn18GreaterThanOrEqualTo(String value) {
            addCriterion("column_18 >=", value, "column18");
            return (Criteria) this;
        }

        public Criteria andColumn18LessThan(String value) {
            addCriterion("column_18 <", value, "column18");
            return (Criteria) this;
        }

        public Criteria andColumn18LessThanOrEqualTo(String value) {
            addCriterion("column_18 <=", value, "column18");
            return (Criteria) this;
        }

        public Criteria andColumn18Like(String value) {
            addCriterion("column_18 like", value, "column18");
            return (Criteria) this;
        }

        public Criteria andColumn18NotLike(String value) {
            addCriterion("column_18 not like", value, "column18");
            return (Criteria) this;
        }

        public Criteria andColumn18In(List<String> values) {
            addCriterion("column_18 in", values, "column18");
            return (Criteria) this;
        }

        public Criteria andColumn18NotIn(List<String> values) {
            addCriterion("column_18 not in", values, "column18");
            return (Criteria) this;
        }

        public Criteria andColumn18Between(String value1, String value2) {
            addCriterion("column_18 between", value1, value2, "column18");
            return (Criteria) this;
        }

        public Criteria andColumn18NotBetween(String value1, String value2) {
            addCriterion("column_18 not between", value1, value2, "column18");
            return (Criteria) this;
        }

        public Criteria andColumn19IsNull() {
            addCriterion("column_19 is null");
            return (Criteria) this;
        }

        public Criteria andColumn19IsNotNull() {
            addCriterion("column_19 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn19EqualTo(String value) {
            addCriterion("column_19 =", value, "column19");
            return (Criteria) this;
        }

        public Criteria andColumn19NotEqualTo(String value) {
            addCriterion("column_19 <>", value, "column19");
            return (Criteria) this;
        }

        public Criteria andColumn19GreaterThan(String value) {
            addCriterion("column_19 >", value, "column19");
            return (Criteria) this;
        }

        public Criteria andColumn19GreaterThanOrEqualTo(String value) {
            addCriterion("column_19 >=", value, "column19");
            return (Criteria) this;
        }

        public Criteria andColumn19LessThan(String value) {
            addCriterion("column_19 <", value, "column19");
            return (Criteria) this;
        }

        public Criteria andColumn19LessThanOrEqualTo(String value) {
            addCriterion("column_19 <=", value, "column19");
            return (Criteria) this;
        }

        public Criteria andColumn19Like(String value) {
            addCriterion("column_19 like", value, "column19");
            return (Criteria) this;
        }

        public Criteria andColumn19NotLike(String value) {
            addCriterion("column_19 not like", value, "column19");
            return (Criteria) this;
        }

        public Criteria andColumn19In(List<String> values) {
            addCriterion("column_19 in", values, "column19");
            return (Criteria) this;
        }

        public Criteria andColumn19NotIn(List<String> values) {
            addCriterion("column_19 not in", values, "column19");
            return (Criteria) this;
        }

        public Criteria andColumn19Between(String value1, String value2) {
            addCriterion("column_19 between", value1, value2, "column19");
            return (Criteria) this;
        }

        public Criteria andColumn19NotBetween(String value1, String value2) {
            addCriterion("column_19 not between", value1, value2, "column19");
            return (Criteria) this;
        }

        public Criteria andColumn20IsNull() {
            addCriterion("column_20 is null");
            return (Criteria) this;
        }

        public Criteria andColumn20IsNotNull() {
            addCriterion("column_20 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn20EqualTo(String value) {
            addCriterion("column_20 =", value, "column20");
            return (Criteria) this;
        }

        public Criteria andColumn20NotEqualTo(String value) {
            addCriterion("column_20 <>", value, "column20");
            return (Criteria) this;
        }

        public Criteria andColumn20GreaterThan(String value) {
            addCriterion("column_20 >", value, "column20");
            return (Criteria) this;
        }

        public Criteria andColumn20GreaterThanOrEqualTo(String value) {
            addCriterion("column_20 >=", value, "column20");
            return (Criteria) this;
        }

        public Criteria andColumn20LessThan(String value) {
            addCriterion("column_20 <", value, "column20");
            return (Criteria) this;
        }

        public Criteria andColumn20LessThanOrEqualTo(String value) {
            addCriterion("column_20 <=", value, "column20");
            return (Criteria) this;
        }

        public Criteria andColumn20Like(String value) {
            addCriterion("column_20 like", value, "column20");
            return (Criteria) this;
        }

        public Criteria andColumn20NotLike(String value) {
            addCriterion("column_20 not like", value, "column20");
            return (Criteria) this;
        }

        public Criteria andColumn20In(List<String> values) {
            addCriterion("column_20 in", values, "column20");
            return (Criteria) this;
        }

        public Criteria andColumn20NotIn(List<String> values) {
            addCriterion("column_20 not in", values, "column20");
            return (Criteria) this;
        }

        public Criteria andColumn20Between(String value1, String value2) {
            addCriterion("column_20 between", value1, value2, "column20");
            return (Criteria) this;
        }

        public Criteria andColumn20NotBetween(String value1, String value2) {
            addCriterion("column_20 not between", value1, value2, "column20");
            return (Criteria) this;
        }

        public Criteria andColumn21IsNull() {
            addCriterion("column_21 is null");
            return (Criteria) this;
        }

        public Criteria andColumn21IsNotNull() {
            addCriterion("column_21 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn21EqualTo(String value) {
            addCriterion("column_21 =", value, "column21");
            return (Criteria) this;
        }

        public Criteria andColumn21NotEqualTo(String value) {
            addCriterion("column_21 <>", value, "column21");
            return (Criteria) this;
        }

        public Criteria andColumn21GreaterThan(String value) {
            addCriterion("column_21 >", value, "column21");
            return (Criteria) this;
        }

        public Criteria andColumn21GreaterThanOrEqualTo(String value) {
            addCriterion("column_21 >=", value, "column21");
            return (Criteria) this;
        }

        public Criteria andColumn21LessThan(String value) {
            addCriterion("column_21 <", value, "column21");
            return (Criteria) this;
        }

        public Criteria andColumn21LessThanOrEqualTo(String value) {
            addCriterion("column_21 <=", value, "column21");
            return (Criteria) this;
        }

        public Criteria andColumn21Like(String value) {
            addCriterion("column_21 like", value, "column21");
            return (Criteria) this;
        }

        public Criteria andColumn21NotLike(String value) {
            addCriterion("column_21 not like", value, "column21");
            return (Criteria) this;
        }

        public Criteria andColumn21In(List<String> values) {
            addCriterion("column_21 in", values, "column21");
            return (Criteria) this;
        }

        public Criteria andColumn21NotIn(List<String> values) {
            addCriterion("column_21 not in", values, "column21");
            return (Criteria) this;
        }

        public Criteria andColumn21Between(String value1, String value2) {
            addCriterion("column_21 between", value1, value2, "column21");
            return (Criteria) this;
        }

        public Criteria andColumn21NotBetween(String value1, String value2) {
            addCriterion("column_21 not between", value1, value2, "column21");
            return (Criteria) this;
        }

        public Criteria andColumn22IsNull() {
            addCriterion("column_22 is null");
            return (Criteria) this;
        }

        public Criteria andColumn22IsNotNull() {
            addCriterion("column_22 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn22EqualTo(String value) {
            addCriterion("column_22 =", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22NotEqualTo(String value) {
            addCriterion("column_22 <>", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22GreaterThan(String value) {
            addCriterion("column_22 >", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22GreaterThanOrEqualTo(String value) {
            addCriterion("column_22 >=", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22LessThan(String value) {
            addCriterion("column_22 <", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22LessThanOrEqualTo(String value) {
            addCriterion("column_22 <=", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22Like(String value) {
            addCriterion("column_22 like", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22NotLike(String value) {
            addCriterion("column_22 not like", value, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22In(List<String> values) {
            addCriterion("column_22 in", values, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22NotIn(List<String> values) {
            addCriterion("column_22 not in", values, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22Between(String value1, String value2) {
            addCriterion("column_22 between", value1, value2, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn22NotBetween(String value1, String value2) {
            addCriterion("column_22 not between", value1, value2, "column22");
            return (Criteria) this;
        }

        public Criteria andColumn23IsNull() {
            addCriterion("column_23 is null");
            return (Criteria) this;
        }

        public Criteria andColumn23IsNotNull() {
            addCriterion("column_23 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn23EqualTo(String value) {
            addCriterion("column_23 =", value, "column23");
            return (Criteria) this;
        }

        public Criteria andColumn23NotEqualTo(String value) {
            addCriterion("column_23 <>", value, "column23");
            return (Criteria) this;
        }

        public Criteria andColumn23GreaterThan(String value) {
            addCriterion("column_23 >", value, "column23");
            return (Criteria) this;
        }

        public Criteria andColumn23GreaterThanOrEqualTo(String value) {
            addCriterion("column_23 >=", value, "column23");
            return (Criteria) this;
        }

        public Criteria andColumn23LessThan(String value) {
            addCriterion("column_23 <", value, "column23");
            return (Criteria) this;
        }

        public Criteria andColumn23LessThanOrEqualTo(String value) {
            addCriterion("column_23 <=", value, "column23");
            return (Criteria) this;
        }

        public Criteria andColumn23Like(String value) {
            addCriterion("column_23 like", value, "column23");
            return (Criteria) this;
        }

        public Criteria andColumn23NotLike(String value) {
            addCriterion("column_23 not like", value, "column23");
            return (Criteria) this;
        }

        public Criteria andColumn23In(List<String> values) {
            addCriterion("column_23 in", values, "column23");
            return (Criteria) this;
        }

        public Criteria andColumn23NotIn(List<String> values) {
            addCriterion("column_23 not in", values, "column23");
            return (Criteria) this;
        }

        public Criteria andColumn23Between(String value1, String value2) {
            addCriterion("column_23 between", value1, value2, "column23");
            return (Criteria) this;
        }

        public Criteria andColumn23NotBetween(String value1, String value2) {
            addCriterion("column_23 not between", value1, value2, "column23");
            return (Criteria) this;
        }

        public Criteria andColumn24IsNull() {
            addCriterion("column_24 is null");
            return (Criteria) this;
        }

        public Criteria andColumn24IsNotNull() {
            addCriterion("column_24 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn24EqualTo(String value) {
            addCriterion("column_24 =", value, "column24");
            return (Criteria) this;
        }

        public Criteria andColumn24NotEqualTo(String value) {
            addCriterion("column_24 <>", value, "column24");
            return (Criteria) this;
        }

        public Criteria andColumn24GreaterThan(String value) {
            addCriterion("column_24 >", value, "column24");
            return (Criteria) this;
        }

        public Criteria andColumn24GreaterThanOrEqualTo(String value) {
            addCriterion("column_24 >=", value, "column24");
            return (Criteria) this;
        }

        public Criteria andColumn24LessThan(String value) {
            addCriterion("column_24 <", value, "column24");
            return (Criteria) this;
        }

        public Criteria andColumn24LessThanOrEqualTo(String value) {
            addCriterion("column_24 <=", value, "column24");
            return (Criteria) this;
        }

        public Criteria andColumn24Like(String value) {
            addCriterion("column_24 like", value, "column24");
            return (Criteria) this;
        }

        public Criteria andColumn24NotLike(String value) {
            addCriterion("column_24 not like", value, "column24");
            return (Criteria) this;
        }

        public Criteria andColumn24In(List<String> values) {
            addCriterion("column_24 in", values, "column24");
            return (Criteria) this;
        }

        public Criteria andColumn24NotIn(List<String> values) {
            addCriterion("column_24 not in", values, "column24");
            return (Criteria) this;
        }

        public Criteria andColumn24Between(String value1, String value2) {
            addCriterion("column_24 between", value1, value2, "column24");
            return (Criteria) this;
        }

        public Criteria andColumn24NotBetween(String value1, String value2) {
            addCriterion("column_24 not between", value1, value2, "column24");
            return (Criteria) this;
        }

        public Criteria andColumn25IsNull() {
            addCriterion("column_25 is null");
            return (Criteria) this;
        }

        public Criteria andColumn25IsNotNull() {
            addCriterion("column_25 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn25EqualTo(String value) {
            addCriterion("column_25 =", value, "column25");
            return (Criteria) this;
        }

        public Criteria andColumn25NotEqualTo(String value) {
            addCriterion("column_25 <>", value, "column25");
            return (Criteria) this;
        }

        public Criteria andColumn25GreaterThan(String value) {
            addCriterion("column_25 >", value, "column25");
            return (Criteria) this;
        }

        public Criteria andColumn25GreaterThanOrEqualTo(String value) {
            addCriterion("column_25 >=", value, "column25");
            return (Criteria) this;
        }

        public Criteria andColumn25LessThan(String value) {
            addCriterion("column_25 <", value, "column25");
            return (Criteria) this;
        }

        public Criteria andColumn25LessThanOrEqualTo(String value) {
            addCriterion("column_25 <=", value, "column25");
            return (Criteria) this;
        }

        public Criteria andColumn25Like(String value) {
            addCriterion("column_25 like", value, "column25");
            return (Criteria) this;
        }

        public Criteria andColumn25NotLike(String value) {
            addCriterion("column_25 not like", value, "column25");
            return (Criteria) this;
        }

        public Criteria andColumn25In(List<String> values) {
            addCriterion("column_25 in", values, "column25");
            return (Criteria) this;
        }

        public Criteria andColumn25NotIn(List<String> values) {
            addCriterion("column_25 not in", values, "column25");
            return (Criteria) this;
        }

        public Criteria andColumn25Between(String value1, String value2) {
            addCriterion("column_25 between", value1, value2, "column25");
            return (Criteria) this;
        }

        public Criteria andColumn25NotBetween(String value1, String value2) {
            addCriterion("column_25 not between", value1, value2, "column25");
            return (Criteria) this;
        }

        public Criteria andColumn26IsNull() {
            addCriterion("column_26 is null");
            return (Criteria) this;
        }

        public Criteria andColumn26IsNotNull() {
            addCriterion("column_26 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn26EqualTo(String value) {
            addCriterion("column_26 =", value, "column26");
            return (Criteria) this;
        }

        public Criteria andColumn26NotEqualTo(String value) {
            addCriterion("column_26 <>", value, "column26");
            return (Criteria) this;
        }

        public Criteria andColumn26GreaterThan(String value) {
            addCriterion("column_26 >", value, "column26");
            return (Criteria) this;
        }

        public Criteria andColumn26GreaterThanOrEqualTo(String value) {
            addCriterion("column_26 >=", value, "column26");
            return (Criteria) this;
        }

        public Criteria andColumn26LessThan(String value) {
            addCriterion("column_26 <", value, "column26");
            return (Criteria) this;
        }

        public Criteria andColumn26LessThanOrEqualTo(String value) {
            addCriterion("column_26 <=", value, "column26");
            return (Criteria) this;
        }

        public Criteria andColumn26Like(String value) {
            addCriterion("column_26 like", value, "column26");
            return (Criteria) this;
        }

        public Criteria andColumn26NotLike(String value) {
            addCriterion("column_26 not like", value, "column26");
            return (Criteria) this;
        }

        public Criteria andColumn26In(List<String> values) {
            addCriterion("column_26 in", values, "column26");
            return (Criteria) this;
        }

        public Criteria andColumn26NotIn(List<String> values) {
            addCriterion("column_26 not in", values, "column26");
            return (Criteria) this;
        }

        public Criteria andColumn26Between(String value1, String value2) {
            addCriterion("column_26 between", value1, value2, "column26");
            return (Criteria) this;
        }

        public Criteria andColumn26NotBetween(String value1, String value2) {
            addCriterion("column_26 not between", value1, value2, "column26");
            return (Criteria) this;
        }

        public Criteria andColumn27IsNull() {
            addCriterion("column_27 is null");
            return (Criteria) this;
        }

        public Criteria andColumn27IsNotNull() {
            addCriterion("column_27 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn27EqualTo(String value) {
            addCriterion("column_27 =", value, "column27");
            return (Criteria) this;
        }

        public Criteria andColumn27NotEqualTo(String value) {
            addCriterion("column_27 <>", value, "column27");
            return (Criteria) this;
        }

        public Criteria andColumn27GreaterThan(String value) {
            addCriterion("column_27 >", value, "column27");
            return (Criteria) this;
        }

        public Criteria andColumn27GreaterThanOrEqualTo(String value) {
            addCriterion("column_27 >=", value, "column27");
            return (Criteria) this;
        }

        public Criteria andColumn27LessThan(String value) {
            addCriterion("column_27 <", value, "column27");
            return (Criteria) this;
        }

        public Criteria andColumn27LessThanOrEqualTo(String value) {
            addCriterion("column_27 <=", value, "column27");
            return (Criteria) this;
        }

        public Criteria andColumn27Like(String value) {
            addCriterion("column_27 like", value, "column27");
            return (Criteria) this;
        }

        public Criteria andColumn27NotLike(String value) {
            addCriterion("column_27 not like", value, "column27");
            return (Criteria) this;
        }

        public Criteria andColumn27In(List<String> values) {
            addCriterion("column_27 in", values, "column27");
            return (Criteria) this;
        }

        public Criteria andColumn27NotIn(List<String> values) {
            addCriterion("column_27 not in", values, "column27");
            return (Criteria) this;
        }

        public Criteria andColumn27Between(String value1, String value2) {
            addCriterion("column_27 between", value1, value2, "column27");
            return (Criteria) this;
        }

        public Criteria andColumn27NotBetween(String value1, String value2) {
            addCriterion("column_27 not between", value1, value2, "column27");
            return (Criteria) this;
        }

        public Criteria andColumn28IsNull() {
            addCriterion("column_28 is null");
            return (Criteria) this;
        }

        public Criteria andColumn28IsNotNull() {
            addCriterion("column_28 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn28EqualTo(String value) {
            addCriterion("column_28 =", value, "column28");
            return (Criteria) this;
        }

        public Criteria andColumn28NotEqualTo(String value) {
            addCriterion("column_28 <>", value, "column28");
            return (Criteria) this;
        }

        public Criteria andColumn28GreaterThan(String value) {
            addCriterion("column_28 >", value, "column28");
            return (Criteria) this;
        }

        public Criteria andColumn28GreaterThanOrEqualTo(String value) {
            addCriterion("column_28 >=", value, "column28");
            return (Criteria) this;
        }

        public Criteria andColumn28LessThan(String value) {
            addCriterion("column_28 <", value, "column28");
            return (Criteria) this;
        }

        public Criteria andColumn28LessThanOrEqualTo(String value) {
            addCriterion("column_28 <=", value, "column28");
            return (Criteria) this;
        }

        public Criteria andColumn28Like(String value) {
            addCriterion("column_28 like", value, "column28");
            return (Criteria) this;
        }

        public Criteria andColumn28NotLike(String value) {
            addCriterion("column_28 not like", value, "column28");
            return (Criteria) this;
        }

        public Criteria andColumn28In(List<String> values) {
            addCriterion("column_28 in", values, "column28");
            return (Criteria) this;
        }

        public Criteria andColumn28NotIn(List<String> values) {
            addCriterion("column_28 not in", values, "column28");
            return (Criteria) this;
        }

        public Criteria andColumn28Between(String value1, String value2) {
            addCriterion("column_28 between", value1, value2, "column28");
            return (Criteria) this;
        }

        public Criteria andColumn28NotBetween(String value1, String value2) {
            addCriterion("column_28 not between", value1, value2, "column28");
            return (Criteria) this;
        }

        public Criteria andColumn29IsNull() {
            addCriterion("column_29 is null");
            return (Criteria) this;
        }

        public Criteria andColumn29IsNotNull() {
            addCriterion("column_29 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn29EqualTo(String value) {
            addCriterion("column_29 =", value, "column29");
            return (Criteria) this;
        }

        public Criteria andColumn29NotEqualTo(String value) {
            addCriterion("column_29 <>", value, "column29");
            return (Criteria) this;
        }

        public Criteria andColumn29GreaterThan(String value) {
            addCriterion("column_29 >", value, "column29");
            return (Criteria) this;
        }

        public Criteria andColumn29GreaterThanOrEqualTo(String value) {
            addCriterion("column_29 >=", value, "column29");
            return (Criteria) this;
        }

        public Criteria andColumn29LessThan(String value) {
            addCriterion("column_29 <", value, "column29");
            return (Criteria) this;
        }

        public Criteria andColumn29LessThanOrEqualTo(String value) {
            addCriterion("column_29 <=", value, "column29");
            return (Criteria) this;
        }

        public Criteria andColumn29Like(String value) {
            addCriterion("column_29 like", value, "column29");
            return (Criteria) this;
        }

        public Criteria andColumn29NotLike(String value) {
            addCriterion("column_29 not like", value, "column29");
            return (Criteria) this;
        }

        public Criteria andColumn29In(List<String> values) {
            addCriterion("column_29 in", values, "column29");
            return (Criteria) this;
        }

        public Criteria andColumn29NotIn(List<String> values) {
            addCriterion("column_29 not in", values, "column29");
            return (Criteria) this;
        }

        public Criteria andColumn29Between(String value1, String value2) {
            addCriterion("column_29 between", value1, value2, "column29");
            return (Criteria) this;
        }

        public Criteria andColumn29NotBetween(String value1, String value2) {
            addCriterion("column_29 not between", value1, value2, "column29");
            return (Criteria) this;
        }

        public Criteria andColumn30IsNull() {
            addCriterion("column_30 is null");
            return (Criteria) this;
        }

        public Criteria andColumn30IsNotNull() {
            addCriterion("column_30 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn30EqualTo(String value) {
            addCriterion("column_30 =", value, "column30");
            return (Criteria) this;
        }

        public Criteria andColumn30NotEqualTo(String value) {
            addCriterion("column_30 <>", value, "column30");
            return (Criteria) this;
        }

        public Criteria andColumn30GreaterThan(String value) {
            addCriterion("column_30 >", value, "column30");
            return (Criteria) this;
        }

        public Criteria andColumn30GreaterThanOrEqualTo(String value) {
            addCriterion("column_30 >=", value, "column30");
            return (Criteria) this;
        }

        public Criteria andColumn30LessThan(String value) {
            addCriterion("column_30 <", value, "column30");
            return (Criteria) this;
        }

        public Criteria andColumn30LessThanOrEqualTo(String value) {
            addCriterion("column_30 <=", value, "column30");
            return (Criteria) this;
        }

        public Criteria andColumn30Like(String value) {
            addCriterion("column_30 like", value, "column30");
            return (Criteria) this;
        }

        public Criteria andColumn30NotLike(String value) {
            addCriterion("column_30 not like", value, "column30");
            return (Criteria) this;
        }

        public Criteria andColumn30In(List<String> values) {
            addCriterion("column_30 in", values, "column30");
            return (Criteria) this;
        }

        public Criteria andColumn30NotIn(List<String> values) {
            addCriterion("column_30 not in", values, "column30");
            return (Criteria) this;
        }

        public Criteria andColumn30Between(String value1, String value2) {
            addCriterion("column_30 between", value1, value2, "column30");
            return (Criteria) this;
        }

        public Criteria andColumn30NotBetween(String value1, String value2) {
            addCriterion("column_30 not between", value1, value2, "column30");
            return (Criteria) this;
        }

        public Criteria andColumn31IsNull() {
            addCriterion("column_31 is null");
            return (Criteria) this;
        }

        public Criteria andColumn31IsNotNull() {
            addCriterion("column_31 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn31EqualTo(String value) {
            addCriterion("column_31 =", value, "column31");
            return (Criteria) this;
        }

        public Criteria andColumn31NotEqualTo(String value) {
            addCriterion("column_31 <>", value, "column31");
            return (Criteria) this;
        }

        public Criteria andColumn31GreaterThan(String value) {
            addCriterion("column_31 >", value, "column31");
            return (Criteria) this;
        }

        public Criteria andColumn31GreaterThanOrEqualTo(String value) {
            addCriterion("column_31 >=", value, "column31");
            return (Criteria) this;
        }

        public Criteria andColumn31LessThan(String value) {
            addCriterion("column_31 <", value, "column31");
            return (Criteria) this;
        }

        public Criteria andColumn31LessThanOrEqualTo(String value) {
            addCriterion("column_31 <=", value, "column31");
            return (Criteria) this;
        }

        public Criteria andColumn31Like(String value) {
            addCriterion("column_31 like", value, "column31");
            return (Criteria) this;
        }

        public Criteria andColumn31NotLike(String value) {
            addCriterion("column_31 not like", value, "column31");
            return (Criteria) this;
        }

        public Criteria andColumn31In(List<String> values) {
            addCriterion("column_31 in", values, "column31");
            return (Criteria) this;
        }

        public Criteria andColumn31NotIn(List<String> values) {
            addCriterion("column_31 not in", values, "column31");
            return (Criteria) this;
        }

        public Criteria andColumn31Between(String value1, String value2) {
            addCriterion("column_31 between", value1, value2, "column31");
            return (Criteria) this;
        }

        public Criteria andColumn31NotBetween(String value1, String value2) {
            addCriterion("column_31 not between", value1, value2, "column31");
            return (Criteria) this;
        }

        public Criteria andColumn32IsNull() {
            addCriterion("column_32 is null");
            return (Criteria) this;
        }

        public Criteria andColumn32IsNotNull() {
            addCriterion("column_32 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn32EqualTo(String value) {
            addCriterion("column_32 =", value, "column32");
            return (Criteria) this;
        }

        public Criteria andColumn32NotEqualTo(String value) {
            addCriterion("column_32 <>", value, "column32");
            return (Criteria) this;
        }

        public Criteria andColumn32GreaterThan(String value) {
            addCriterion("column_32 >", value, "column32");
            return (Criteria) this;
        }

        public Criteria andColumn32GreaterThanOrEqualTo(String value) {
            addCriterion("column_32 >=", value, "column32");
            return (Criteria) this;
        }

        public Criteria andColumn32LessThan(String value) {
            addCriterion("column_32 <", value, "column32");
            return (Criteria) this;
        }

        public Criteria andColumn32LessThanOrEqualTo(String value) {
            addCriterion("column_32 <=", value, "column32");
            return (Criteria) this;
        }

        public Criteria andColumn32Like(String value) {
            addCriterion("column_32 like", value, "column32");
            return (Criteria) this;
        }

        public Criteria andColumn32NotLike(String value) {
            addCriterion("column_32 not like", value, "column32");
            return (Criteria) this;
        }

        public Criteria andColumn32In(List<String> values) {
            addCriterion("column_32 in", values, "column32");
            return (Criteria) this;
        }

        public Criteria andColumn32NotIn(List<String> values) {
            addCriterion("column_32 not in", values, "column32");
            return (Criteria) this;
        }

        public Criteria andColumn32Between(String value1, String value2) {
            addCriterion("column_32 between", value1, value2, "column32");
            return (Criteria) this;
        }

        public Criteria andColumn32NotBetween(String value1, String value2) {
            addCriterion("column_32 not between", value1, value2, "column32");
            return (Criteria) this;
        }

        public Criteria andColumn33IsNull() {
            addCriterion("column_33 is null");
            return (Criteria) this;
        }

        public Criteria andColumn33IsNotNull() {
            addCriterion("column_33 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn33EqualTo(String value) {
            addCriterion("column_33 =", value, "column33");
            return (Criteria) this;
        }

        public Criteria andColumn33NotEqualTo(String value) {
            addCriterion("column_33 <>", value, "column33");
            return (Criteria) this;
        }

        public Criteria andColumn33GreaterThan(String value) {
            addCriterion("column_33 >", value, "column33");
            return (Criteria) this;
        }

        public Criteria andColumn33GreaterThanOrEqualTo(String value) {
            addCriterion("column_33 >=", value, "column33");
            return (Criteria) this;
        }

        public Criteria andColumn33LessThan(String value) {
            addCriterion("column_33 <", value, "column33");
            return (Criteria) this;
        }

        public Criteria andColumn33LessThanOrEqualTo(String value) {
            addCriterion("column_33 <=", value, "column33");
            return (Criteria) this;
        }

        public Criteria andColumn33Like(String value) {
            addCriterion("column_33 like", value, "column33");
            return (Criteria) this;
        }

        public Criteria andColumn33NotLike(String value) {
            addCriterion("column_33 not like", value, "column33");
            return (Criteria) this;
        }

        public Criteria andColumn33In(List<String> values) {
            addCriterion("column_33 in", values, "column33");
            return (Criteria) this;
        }

        public Criteria andColumn33NotIn(List<String> values) {
            addCriterion("column_33 not in", values, "column33");
            return (Criteria) this;
        }

        public Criteria andColumn33Between(String value1, String value2) {
            addCriterion("column_33 between", value1, value2, "column33");
            return (Criteria) this;
        }

        public Criteria andColumn33NotBetween(String value1, String value2) {
            addCriterion("column_33 not between", value1, value2, "column33");
            return (Criteria) this;
        }

        public Criteria andColumn34IsNull() {
            addCriterion("column_34 is null");
            return (Criteria) this;
        }

        public Criteria andColumn34IsNotNull() {
            addCriterion("column_34 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn34EqualTo(String value) {
            addCriterion("column_34 =", value, "column34");
            return (Criteria) this;
        }

        public Criteria andColumn34NotEqualTo(String value) {
            addCriterion("column_34 <>", value, "column34");
            return (Criteria) this;
        }

        public Criteria andColumn34GreaterThan(String value) {
            addCriterion("column_34 >", value, "column34");
            return (Criteria) this;
        }

        public Criteria andColumn34GreaterThanOrEqualTo(String value) {
            addCriterion("column_34 >=", value, "column34");
            return (Criteria) this;
        }

        public Criteria andColumn34LessThan(String value) {
            addCriterion("column_34 <", value, "column34");
            return (Criteria) this;
        }

        public Criteria andColumn34LessThanOrEqualTo(String value) {
            addCriterion("column_34 <=", value, "column34");
            return (Criteria) this;
        }

        public Criteria andColumn34Like(String value) {
            addCriterion("column_34 like", value, "column34");
            return (Criteria) this;
        }

        public Criteria andColumn34NotLike(String value) {
            addCriterion("column_34 not like", value, "column34");
            return (Criteria) this;
        }

        public Criteria andColumn34In(List<String> values) {
            addCriterion("column_34 in", values, "column34");
            return (Criteria) this;
        }

        public Criteria andColumn34NotIn(List<String> values) {
            addCriterion("column_34 not in", values, "column34");
            return (Criteria) this;
        }

        public Criteria andColumn34Between(String value1, String value2) {
            addCriterion("column_34 between", value1, value2, "column34");
            return (Criteria) this;
        }

        public Criteria andColumn34NotBetween(String value1, String value2) {
            addCriterion("column_34 not between", value1, value2, "column34");
            return (Criteria) this;
        }

        public Criteria andColumn35IsNull() {
            addCriterion("column_35 is null");
            return (Criteria) this;
        }

        public Criteria andColumn35IsNotNull() {
            addCriterion("column_35 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn35EqualTo(String value) {
            addCriterion("column_35 =", value, "column35");
            return (Criteria) this;
        }

        public Criteria andColumn35NotEqualTo(String value) {
            addCriterion("column_35 <>", value, "column35");
            return (Criteria) this;
        }

        public Criteria andColumn35GreaterThan(String value) {
            addCriterion("column_35 >", value, "column35");
            return (Criteria) this;
        }

        public Criteria andColumn35GreaterThanOrEqualTo(String value) {
            addCriterion("column_35 >=", value, "column35");
            return (Criteria) this;
        }

        public Criteria andColumn35LessThan(String value) {
            addCriterion("column_35 <", value, "column35");
            return (Criteria) this;
        }

        public Criteria andColumn35LessThanOrEqualTo(String value) {
            addCriterion("column_35 <=", value, "column35");
            return (Criteria) this;
        }

        public Criteria andColumn35Like(String value) {
            addCriterion("column_35 like", value, "column35");
            return (Criteria) this;
        }

        public Criteria andColumn35NotLike(String value) {
            addCriterion("column_35 not like", value, "column35");
            return (Criteria) this;
        }

        public Criteria andColumn35In(List<String> values) {
            addCriterion("column_35 in", values, "column35");
            return (Criteria) this;
        }

        public Criteria andColumn35NotIn(List<String> values) {
            addCriterion("column_35 not in", values, "column35");
            return (Criteria) this;
        }

        public Criteria andColumn35Between(String value1, String value2) {
            addCriterion("column_35 between", value1, value2, "column35");
            return (Criteria) this;
        }

        public Criteria andColumn35NotBetween(String value1, String value2) {
            addCriterion("column_35 not between", value1, value2, "column35");
            return (Criteria) this;
        }

        public Criteria andColumn36IsNull() {
            addCriterion("column_36 is null");
            return (Criteria) this;
        }

        public Criteria andColumn36IsNotNull() {
            addCriterion("column_36 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn36EqualTo(String value) {
            addCriterion("column_36 =", value, "column36");
            return (Criteria) this;
        }

        public Criteria andColumn36NotEqualTo(String value) {
            addCriterion("column_36 <>", value, "column36");
            return (Criteria) this;
        }

        public Criteria andColumn36GreaterThan(String value) {
            addCriterion("column_36 >", value, "column36");
            return (Criteria) this;
        }

        public Criteria andColumn36GreaterThanOrEqualTo(String value) {
            addCriterion("column_36 >=", value, "column36");
            return (Criteria) this;
        }

        public Criteria andColumn36LessThan(String value) {
            addCriterion("column_36 <", value, "column36");
            return (Criteria) this;
        }

        public Criteria andColumn36LessThanOrEqualTo(String value) {
            addCriterion("column_36 <=", value, "column36");
            return (Criteria) this;
        }

        public Criteria andColumn36Like(String value) {
            addCriterion("column_36 like", value, "column36");
            return (Criteria) this;
        }

        public Criteria andColumn36NotLike(String value) {
            addCriterion("column_36 not like", value, "column36");
            return (Criteria) this;
        }

        public Criteria andColumn36In(List<String> values) {
            addCriterion("column_36 in", values, "column36");
            return (Criteria) this;
        }

        public Criteria andColumn36NotIn(List<String> values) {
            addCriterion("column_36 not in", values, "column36");
            return (Criteria) this;
        }

        public Criteria andColumn36Between(String value1, String value2) {
            addCriterion("column_36 between", value1, value2, "column36");
            return (Criteria) this;
        }

        public Criteria andColumn36NotBetween(String value1, String value2) {
            addCriterion("column_36 not between", value1, value2, "column36");
            return (Criteria) this;
        }

        public Criteria andColumn37IsNull() {
            addCriterion("column_37 is null");
            return (Criteria) this;
        }

        public Criteria andColumn37IsNotNull() {
            addCriterion("column_37 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn37EqualTo(String value) {
            addCriterion("column_37 =", value, "column37");
            return (Criteria) this;
        }

        public Criteria andColumn37NotEqualTo(String value) {
            addCriterion("column_37 <>", value, "column37");
            return (Criteria) this;
        }

        public Criteria andColumn37GreaterThan(String value) {
            addCriterion("column_37 >", value, "column37");
            return (Criteria) this;
        }

        public Criteria andColumn37GreaterThanOrEqualTo(String value) {
            addCriterion("column_37 >=", value, "column37");
            return (Criteria) this;
        }

        public Criteria andColumn37LessThan(String value) {
            addCriterion("column_37 <", value, "column37");
            return (Criteria) this;
        }

        public Criteria andColumn37LessThanOrEqualTo(String value) {
            addCriterion("column_37 <=", value, "column37");
            return (Criteria) this;
        }

        public Criteria andColumn37Like(String value) {
            addCriterion("column_37 like", value, "column37");
            return (Criteria) this;
        }

        public Criteria andColumn37NotLike(String value) {
            addCriterion("column_37 not like", value, "column37");
            return (Criteria) this;
        }

        public Criteria andColumn37In(List<String> values) {
            addCriterion("column_37 in", values, "column37");
            return (Criteria) this;
        }

        public Criteria andColumn37NotIn(List<String> values) {
            addCriterion("column_37 not in", values, "column37");
            return (Criteria) this;
        }

        public Criteria andColumn37Between(String value1, String value2) {
            addCriterion("column_37 between", value1, value2, "column37");
            return (Criteria) this;
        }

        public Criteria andColumn37NotBetween(String value1, String value2) {
            addCriterion("column_37 not between", value1, value2, "column37");
            return (Criteria) this;
        }

        public Criteria andColumn38IsNull() {
            addCriterion("column_38 is null");
            return (Criteria) this;
        }

        public Criteria andColumn38IsNotNull() {
            addCriterion("column_38 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn38EqualTo(String value) {
            addCriterion("column_38 =", value, "column38");
            return (Criteria) this;
        }

        public Criteria andColumn38NotEqualTo(String value) {
            addCriterion("column_38 <>", value, "column38");
            return (Criteria) this;
        }

        public Criteria andColumn38GreaterThan(String value) {
            addCriterion("column_38 >", value, "column38");
            return (Criteria) this;
        }

        public Criteria andColumn38GreaterThanOrEqualTo(String value) {
            addCriterion("column_38 >=", value, "column38");
            return (Criteria) this;
        }

        public Criteria andColumn38LessThan(String value) {
            addCriterion("column_38 <", value, "column38");
            return (Criteria) this;
        }

        public Criteria andColumn38LessThanOrEqualTo(String value) {
            addCriterion("column_38 <=", value, "column38");
            return (Criteria) this;
        }

        public Criteria andColumn38Like(String value) {
            addCriterion("column_38 like", value, "column38");
            return (Criteria) this;
        }

        public Criteria andColumn38NotLike(String value) {
            addCriterion("column_38 not like", value, "column38");
            return (Criteria) this;
        }

        public Criteria andColumn38In(List<String> values) {
            addCriterion("column_38 in", values, "column38");
            return (Criteria) this;
        }

        public Criteria andColumn38NotIn(List<String> values) {
            addCriterion("column_38 not in", values, "column38");
            return (Criteria) this;
        }

        public Criteria andColumn38Between(String value1, String value2) {
            addCriterion("column_38 between", value1, value2, "column38");
            return (Criteria) this;
        }

        public Criteria andColumn38NotBetween(String value1, String value2) {
            addCriterion("column_38 not between", value1, value2, "column38");
            return (Criteria) this;
        }

        public Criteria andColumn39IsNull() {
            addCriterion("column_39 is null");
            return (Criteria) this;
        }

        public Criteria andColumn39IsNotNull() {
            addCriterion("column_39 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn39EqualTo(String value) {
            addCriterion("column_39 =", value, "column39");
            return (Criteria) this;
        }

        public Criteria andColumn39NotEqualTo(String value) {
            addCriterion("column_39 <>", value, "column39");
            return (Criteria) this;
        }

        public Criteria andColumn39GreaterThan(String value) {
            addCriterion("column_39 >", value, "column39");
            return (Criteria) this;
        }

        public Criteria andColumn39GreaterThanOrEqualTo(String value) {
            addCriterion("column_39 >=", value, "column39");
            return (Criteria) this;
        }

        public Criteria andColumn39LessThan(String value) {
            addCriterion("column_39 <", value, "column39");
            return (Criteria) this;
        }

        public Criteria andColumn39LessThanOrEqualTo(String value) {
            addCriterion("column_39 <=", value, "column39");
            return (Criteria) this;
        }

        public Criteria andColumn39Like(String value) {
            addCriterion("column_39 like", value, "column39");
            return (Criteria) this;
        }

        public Criteria andColumn39NotLike(String value) {
            addCriterion("column_39 not like", value, "column39");
            return (Criteria) this;
        }

        public Criteria andColumn39In(List<String> values) {
            addCriterion("column_39 in", values, "column39");
            return (Criteria) this;
        }

        public Criteria andColumn39NotIn(List<String> values) {
            addCriterion("column_39 not in", values, "column39");
            return (Criteria) this;
        }

        public Criteria andColumn39Between(String value1, String value2) {
            addCriterion("column_39 between", value1, value2, "column39");
            return (Criteria) this;
        }

        public Criteria andColumn39NotBetween(String value1, String value2) {
            addCriterion("column_39 not between", value1, value2, "column39");
            return (Criteria) this;
        }

        public Criteria andColumn40IsNull() {
            addCriterion("column_40 is null");
            return (Criteria) this;
        }

        public Criteria andColumn40IsNotNull() {
            addCriterion("column_40 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn40EqualTo(String value) {
            addCriterion("column_40 =", value, "column40");
            return (Criteria) this;
        }

        public Criteria andColumn40NotEqualTo(String value) {
            addCriterion("column_40 <>", value, "column40");
            return (Criteria) this;
        }

        public Criteria andColumn40GreaterThan(String value) {
            addCriterion("column_40 >", value, "column40");
            return (Criteria) this;
        }

        public Criteria andColumn40GreaterThanOrEqualTo(String value) {
            addCriterion("column_40 >=", value, "column40");
            return (Criteria) this;
        }

        public Criteria andColumn40LessThan(String value) {
            addCriterion("column_40 <", value, "column40");
            return (Criteria) this;
        }

        public Criteria andColumn40LessThanOrEqualTo(String value) {
            addCriterion("column_40 <=", value, "column40");
            return (Criteria) this;
        }

        public Criteria andColumn40Like(String value) {
            addCriterion("column_40 like", value, "column40");
            return (Criteria) this;
        }

        public Criteria andColumn40NotLike(String value) {
            addCriterion("column_40 not like", value, "column40");
            return (Criteria) this;
        }

        public Criteria andColumn40In(List<String> values) {
            addCriterion("column_40 in", values, "column40");
            return (Criteria) this;
        }

        public Criteria andColumn40NotIn(List<String> values) {
            addCriterion("column_40 not in", values, "column40");
            return (Criteria) this;
        }

        public Criteria andColumn40Between(String value1, String value2) {
            addCriterion("column_40 between", value1, value2, "column40");
            return (Criteria) this;
        }

        public Criteria andColumn40NotBetween(String value1, String value2) {
            addCriterion("column_40 not between", value1, value2, "column40");
            return (Criteria) this;
        }

        public Criteria andColumn41IsNull() {
            addCriterion("column_41 is null");
            return (Criteria) this;
        }

        public Criteria andColumn41IsNotNull() {
            addCriterion("column_41 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn41EqualTo(String value) {
            addCriterion("column_41 =", value, "column41");
            return (Criteria) this;
        }

        public Criteria andColumn41NotEqualTo(String value) {
            addCriterion("column_41 <>", value, "column41");
            return (Criteria) this;
        }

        public Criteria andColumn41GreaterThan(String value) {
            addCriterion("column_41 >", value, "column41");
            return (Criteria) this;
        }

        public Criteria andColumn41GreaterThanOrEqualTo(String value) {
            addCriterion("column_41 >=", value, "column41");
            return (Criteria) this;
        }

        public Criteria andColumn41LessThan(String value) {
            addCriterion("column_41 <", value, "column41");
            return (Criteria) this;
        }

        public Criteria andColumn41LessThanOrEqualTo(String value) {
            addCriterion("column_41 <=", value, "column41");
            return (Criteria) this;
        }

        public Criteria andColumn41Like(String value) {
            addCriterion("column_41 like", value, "column41");
            return (Criteria) this;
        }

        public Criteria andColumn41NotLike(String value) {
            addCriterion("column_41 not like", value, "column41");
            return (Criteria) this;
        }

        public Criteria andColumn41In(List<String> values) {
            addCriterion("column_41 in", values, "column41");
            return (Criteria) this;
        }

        public Criteria andColumn41NotIn(List<String> values) {
            addCriterion("column_41 not in", values, "column41");
            return (Criteria) this;
        }

        public Criteria andColumn41Between(String value1, String value2) {
            addCriterion("column_41 between", value1, value2, "column41");
            return (Criteria) this;
        }

        public Criteria andColumn41NotBetween(String value1, String value2) {
            addCriterion("column_41 not between", value1, value2, "column41");
            return (Criteria) this;
        }

        public Criteria andColumn42IsNull() {
            addCriterion("column_42 is null");
            return (Criteria) this;
        }

        public Criteria andColumn42IsNotNull() {
            addCriterion("column_42 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn42EqualTo(String value) {
            addCriterion("column_42 =", value, "column42");
            return (Criteria) this;
        }

        public Criteria andColumn42NotEqualTo(String value) {
            addCriterion("column_42 <>", value, "column42");
            return (Criteria) this;
        }

        public Criteria andColumn42GreaterThan(String value) {
            addCriterion("column_42 >", value, "column42");
            return (Criteria) this;
        }

        public Criteria andColumn42GreaterThanOrEqualTo(String value) {
            addCriterion("column_42 >=", value, "column42");
            return (Criteria) this;
        }

        public Criteria andColumn42LessThan(String value) {
            addCriterion("column_42 <", value, "column42");
            return (Criteria) this;
        }

        public Criteria andColumn42LessThanOrEqualTo(String value) {
            addCriterion("column_42 <=", value, "column42");
            return (Criteria) this;
        }

        public Criteria andColumn42Like(String value) {
            addCriterion("column_42 like", value, "column42");
            return (Criteria) this;
        }

        public Criteria andColumn42NotLike(String value) {
            addCriterion("column_42 not like", value, "column42");
            return (Criteria) this;
        }

        public Criteria andColumn42In(List<String> values) {
            addCriterion("column_42 in", values, "column42");
            return (Criteria) this;
        }

        public Criteria andColumn42NotIn(List<String> values) {
            addCriterion("column_42 not in", values, "column42");
            return (Criteria) this;
        }

        public Criteria andColumn42Between(String value1, String value2) {
            addCriterion("column_42 between", value1, value2, "column42");
            return (Criteria) this;
        }

        public Criteria andColumn42NotBetween(String value1, String value2) {
            addCriterion("column_42 not between", value1, value2, "column42");
            return (Criteria) this;
        }

        public Criteria andColumn43IsNull() {
            addCriterion("column_43 is null");
            return (Criteria) this;
        }

        public Criteria andColumn43IsNotNull() {
            addCriterion("column_43 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn43EqualTo(String value) {
            addCriterion("column_43 =", value, "column43");
            return (Criteria) this;
        }

        public Criteria andColumn43NotEqualTo(String value) {
            addCriterion("column_43 <>", value, "column43");
            return (Criteria) this;
        }

        public Criteria andColumn43GreaterThan(String value) {
            addCriterion("column_43 >", value, "column43");
            return (Criteria) this;
        }

        public Criteria andColumn43GreaterThanOrEqualTo(String value) {
            addCriterion("column_43 >=", value, "column43");
            return (Criteria) this;
        }

        public Criteria andColumn43LessThan(String value) {
            addCriterion("column_43 <", value, "column43");
            return (Criteria) this;
        }

        public Criteria andColumn43LessThanOrEqualTo(String value) {
            addCriterion("column_43 <=", value, "column43");
            return (Criteria) this;
        }

        public Criteria andColumn43Like(String value) {
            addCriterion("column_43 like", value, "column43");
            return (Criteria) this;
        }

        public Criteria andColumn43NotLike(String value) {
            addCriterion("column_43 not like", value, "column43");
            return (Criteria) this;
        }

        public Criteria andColumn43In(List<String> values) {
            addCriterion("column_43 in", values, "column43");
            return (Criteria) this;
        }

        public Criteria andColumn43NotIn(List<String> values) {
            addCriterion("column_43 not in", values, "column43");
            return (Criteria) this;
        }

        public Criteria andColumn43Between(String value1, String value2) {
            addCriterion("column_43 between", value1, value2, "column43");
            return (Criteria) this;
        }

        public Criteria andColumn43NotBetween(String value1, String value2) {
            addCriterion("column_43 not between", value1, value2, "column43");
            return (Criteria) this;
        }

        public Criteria andColumn44IsNull() {
            addCriterion("column_44 is null");
            return (Criteria) this;
        }

        public Criteria andColumn44IsNotNull() {
            addCriterion("column_44 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn44EqualTo(String value) {
            addCriterion("column_44 =", value, "column44");
            return (Criteria) this;
        }

        public Criteria andColumn44NotEqualTo(String value) {
            addCriterion("column_44 <>", value, "column44");
            return (Criteria) this;
        }

        public Criteria andColumn44GreaterThan(String value) {
            addCriterion("column_44 >", value, "column44");
            return (Criteria) this;
        }

        public Criteria andColumn44GreaterThanOrEqualTo(String value) {
            addCriterion("column_44 >=", value, "column44");
            return (Criteria) this;
        }

        public Criteria andColumn44LessThan(String value) {
            addCriterion("column_44 <", value, "column44");
            return (Criteria) this;
        }

        public Criteria andColumn44LessThanOrEqualTo(String value) {
            addCriterion("column_44 <=", value, "column44");
            return (Criteria) this;
        }

        public Criteria andColumn44Like(String value) {
            addCriterion("column_44 like", value, "column44");
            return (Criteria) this;
        }

        public Criteria andColumn44NotLike(String value) {
            addCriterion("column_44 not like", value, "column44");
            return (Criteria) this;
        }

        public Criteria andColumn44In(List<String> values) {
            addCriterion("column_44 in", values, "column44");
            return (Criteria) this;
        }

        public Criteria andColumn44NotIn(List<String> values) {
            addCriterion("column_44 not in", values, "column44");
            return (Criteria) this;
        }

        public Criteria andColumn44Between(String value1, String value2) {
            addCriterion("column_44 between", value1, value2, "column44");
            return (Criteria) this;
        }

        public Criteria andColumn44NotBetween(String value1, String value2) {
            addCriterion("column_44 not between", value1, value2, "column44");
            return (Criteria) this;
        }

        public Criteria andColumn45IsNull() {
            addCriterion("column_45 is null");
            return (Criteria) this;
        }

        public Criteria andColumn45IsNotNull() {
            addCriterion("column_45 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn45EqualTo(String value) {
            addCriterion("column_45 =", value, "column45");
            return (Criteria) this;
        }

        public Criteria andColumn45NotEqualTo(String value) {
            addCriterion("column_45 <>", value, "column45");
            return (Criteria) this;
        }

        public Criteria andColumn45GreaterThan(String value) {
            addCriterion("column_45 >", value, "column45");
            return (Criteria) this;
        }

        public Criteria andColumn45GreaterThanOrEqualTo(String value) {
            addCriterion("column_45 >=", value, "column45");
            return (Criteria) this;
        }

        public Criteria andColumn45LessThan(String value) {
            addCriterion("column_45 <", value, "column45");
            return (Criteria) this;
        }

        public Criteria andColumn45LessThanOrEqualTo(String value) {
            addCriterion("column_45 <=", value, "column45");
            return (Criteria) this;
        }

        public Criteria andColumn45Like(String value) {
            addCriterion("column_45 like", value, "column45");
            return (Criteria) this;
        }

        public Criteria andColumn45NotLike(String value) {
            addCriterion("column_45 not like", value, "column45");
            return (Criteria) this;
        }

        public Criteria andColumn45In(List<String> values) {
            addCriterion("column_45 in", values, "column45");
            return (Criteria) this;
        }

        public Criteria andColumn45NotIn(List<String> values) {
            addCriterion("column_45 not in", values, "column45");
            return (Criteria) this;
        }

        public Criteria andColumn45Between(String value1, String value2) {
            addCriterion("column_45 between", value1, value2, "column45");
            return (Criteria) this;
        }

        public Criteria andColumn45NotBetween(String value1, String value2) {
            addCriterion("column_45 not between", value1, value2, "column45");
            return (Criteria) this;
        }

        public Criteria andColumn46IsNull() {
            addCriterion("column_46 is null");
            return (Criteria) this;
        }

        public Criteria andColumn46IsNotNull() {
            addCriterion("column_46 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn46EqualTo(String value) {
            addCriterion("column_46 =", value, "column46");
            return (Criteria) this;
        }

        public Criteria andColumn46NotEqualTo(String value) {
            addCriterion("column_46 <>", value, "column46");
            return (Criteria) this;
        }

        public Criteria andColumn46GreaterThan(String value) {
            addCriterion("column_46 >", value, "column46");
            return (Criteria) this;
        }

        public Criteria andColumn46GreaterThanOrEqualTo(String value) {
            addCriterion("column_46 >=", value, "column46");
            return (Criteria) this;
        }

        public Criteria andColumn46LessThan(String value) {
            addCriterion("column_46 <", value, "column46");
            return (Criteria) this;
        }

        public Criteria andColumn46LessThanOrEqualTo(String value) {
            addCriterion("column_46 <=", value, "column46");
            return (Criteria) this;
        }

        public Criteria andColumn46Like(String value) {
            addCriterion("column_46 like", value, "column46");
            return (Criteria) this;
        }

        public Criteria andColumn46NotLike(String value) {
            addCriterion("column_46 not like", value, "column46");
            return (Criteria) this;
        }

        public Criteria andColumn46In(List<String> values) {
            addCriterion("column_46 in", values, "column46");
            return (Criteria) this;
        }

        public Criteria andColumn46NotIn(List<String> values) {
            addCriterion("column_46 not in", values, "column46");
            return (Criteria) this;
        }

        public Criteria andColumn46Between(String value1, String value2) {
            addCriterion("column_46 between", value1, value2, "column46");
            return (Criteria) this;
        }

        public Criteria andColumn46NotBetween(String value1, String value2) {
            addCriterion("column_46 not between", value1, value2, "column46");
            return (Criteria) this;
        }

        public Criteria andColumn47IsNull() {
            addCriterion("column_47 is null");
            return (Criteria) this;
        }

        public Criteria andColumn47IsNotNull() {
            addCriterion("column_47 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn47EqualTo(String value) {
            addCriterion("column_47 =", value, "column47");
            return (Criteria) this;
        }

        public Criteria andColumn47NotEqualTo(String value) {
            addCriterion("column_47 <>", value, "column47");
            return (Criteria) this;
        }

        public Criteria andColumn47GreaterThan(String value) {
            addCriterion("column_47 >", value, "column47");
            return (Criteria) this;
        }

        public Criteria andColumn47GreaterThanOrEqualTo(String value) {
            addCriterion("column_47 >=", value, "column47");
            return (Criteria) this;
        }

        public Criteria andColumn47LessThan(String value) {
            addCriterion("column_47 <", value, "column47");
            return (Criteria) this;
        }

        public Criteria andColumn47LessThanOrEqualTo(String value) {
            addCriterion("column_47 <=", value, "column47");
            return (Criteria) this;
        }

        public Criteria andColumn47Like(String value) {
            addCriterion("column_47 like", value, "column47");
            return (Criteria) this;
        }

        public Criteria andColumn47NotLike(String value) {
            addCriterion("column_47 not like", value, "column47");
            return (Criteria) this;
        }

        public Criteria andColumn47In(List<String> values) {
            addCriterion("column_47 in", values, "column47");
            return (Criteria) this;
        }

        public Criteria andColumn47NotIn(List<String> values) {
            addCriterion("column_47 not in", values, "column47");
            return (Criteria) this;
        }

        public Criteria andColumn47Between(String value1, String value2) {
            addCriterion("column_47 between", value1, value2, "column47");
            return (Criteria) this;
        }

        public Criteria andColumn47NotBetween(String value1, String value2) {
            addCriterion("column_47 not between", value1, value2, "column47");
            return (Criteria) this;
        }

        public Criteria andColumn48IsNull() {
            addCriterion("column_48 is null");
            return (Criteria) this;
        }

        public Criteria andColumn48IsNotNull() {
            addCriterion("column_48 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn48EqualTo(String value) {
            addCriterion("column_48 =", value, "column48");
            return (Criteria) this;
        }

        public Criteria andColumn48NotEqualTo(String value) {
            addCriterion("column_48 <>", value, "column48");
            return (Criteria) this;
        }

        public Criteria andColumn48GreaterThan(String value) {
            addCriterion("column_48 >", value, "column48");
            return (Criteria) this;
        }

        public Criteria andColumn48GreaterThanOrEqualTo(String value) {
            addCriterion("column_48 >=", value, "column48");
            return (Criteria) this;
        }

        public Criteria andColumn48LessThan(String value) {
            addCriterion("column_48 <", value, "column48");
            return (Criteria) this;
        }

        public Criteria andColumn48LessThanOrEqualTo(String value) {
            addCriterion("column_48 <=", value, "column48");
            return (Criteria) this;
        }

        public Criteria andColumn48Like(String value) {
            addCriterion("column_48 like", value, "column48");
            return (Criteria) this;
        }

        public Criteria andColumn48NotLike(String value) {
            addCriterion("column_48 not like", value, "column48");
            return (Criteria) this;
        }

        public Criteria andColumn48In(List<String> values) {
            addCriterion("column_48 in", values, "column48");
            return (Criteria) this;
        }

        public Criteria andColumn48NotIn(List<String> values) {
            addCriterion("column_48 not in", values, "column48");
            return (Criteria) this;
        }

        public Criteria andColumn48Between(String value1, String value2) {
            addCriterion("column_48 between", value1, value2, "column48");
            return (Criteria) this;
        }

        public Criteria andColumn48NotBetween(String value1, String value2) {
            addCriterion("column_48 not between", value1, value2, "column48");
            return (Criteria) this;
        }

        public Criteria andColumn49IsNull() {
            addCriterion("column_49 is null");
            return (Criteria) this;
        }

        public Criteria andColumn49IsNotNull() {
            addCriterion("column_49 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn49EqualTo(String value) {
            addCriterion("column_49 =", value, "column49");
            return (Criteria) this;
        }

        public Criteria andColumn49NotEqualTo(String value) {
            addCriterion("column_49 <>", value, "column49");
            return (Criteria) this;
        }

        public Criteria andColumn49GreaterThan(String value) {
            addCriterion("column_49 >", value, "column49");
            return (Criteria) this;
        }

        public Criteria andColumn49GreaterThanOrEqualTo(String value) {
            addCriterion("column_49 >=", value, "column49");
            return (Criteria) this;
        }

        public Criteria andColumn49LessThan(String value) {
            addCriterion("column_49 <", value, "column49");
            return (Criteria) this;
        }

        public Criteria andColumn49LessThanOrEqualTo(String value) {
            addCriterion("column_49 <=", value, "column49");
            return (Criteria) this;
        }

        public Criteria andColumn49Like(String value) {
            addCriterion("column_49 like", value, "column49");
            return (Criteria) this;
        }

        public Criteria andColumn49NotLike(String value) {
            addCriterion("column_49 not like", value, "column49");
            return (Criteria) this;
        }

        public Criteria andColumn49In(List<String> values) {
            addCriterion("column_49 in", values, "column49");
            return (Criteria) this;
        }

        public Criteria andColumn49NotIn(List<String> values) {
            addCriterion("column_49 not in", values, "column49");
            return (Criteria) this;
        }

        public Criteria andColumn49Between(String value1, String value2) {
            addCriterion("column_49 between", value1, value2, "column49");
            return (Criteria) this;
        }

        public Criteria andColumn49NotBetween(String value1, String value2) {
            addCriterion("column_49 not between", value1, value2, "column49");
            return (Criteria) this;
        }

        public Criteria andColumn50IsNull() {
            addCriterion("column_50 is null");
            return (Criteria) this;
        }

        public Criteria andColumn50IsNotNull() {
            addCriterion("column_50 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn50EqualTo(String value) {
            addCriterion("column_50 =", value, "column50");
            return (Criteria) this;
        }

        public Criteria andColumn50NotEqualTo(String value) {
            addCriterion("column_50 <>", value, "column50");
            return (Criteria) this;
        }

        public Criteria andColumn50GreaterThan(String value) {
            addCriterion("column_50 >", value, "column50");
            return (Criteria) this;
        }

        public Criteria andColumn50GreaterThanOrEqualTo(String value) {
            addCriterion("column_50 >=", value, "column50");
            return (Criteria) this;
        }

        public Criteria andColumn50LessThan(String value) {
            addCriterion("column_50 <", value, "column50");
            return (Criteria) this;
        }

        public Criteria andColumn50LessThanOrEqualTo(String value) {
            addCriterion("column_50 <=", value, "column50");
            return (Criteria) this;
        }

        public Criteria andColumn50Like(String value) {
            addCriterion("column_50 like", value, "column50");
            return (Criteria) this;
        }

        public Criteria andColumn50NotLike(String value) {
            addCriterion("column_50 not like", value, "column50");
            return (Criteria) this;
        }

        public Criteria andColumn50In(List<String> values) {
            addCriterion("column_50 in", values, "column50");
            return (Criteria) this;
        }

        public Criteria andColumn50NotIn(List<String> values) {
            addCriterion("column_50 not in", values, "column50");
            return (Criteria) this;
        }

        public Criteria andColumn50Between(String value1, String value2) {
            addCriterion("column_50 between", value1, value2, "column50");
            return (Criteria) this;
        }

        public Criteria andColumn50NotBetween(String value1, String value2) {
            addCriterion("column_50 not between", value1, value2, "column50");
            return (Criteria) this;
        }

        public Criteria andColumn51IsNull() {
            addCriterion("column_51 is null");
            return (Criteria) this;
        }

        public Criteria andColumn51IsNotNull() {
            addCriterion("column_51 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn51EqualTo(String value) {
            addCriterion("column_51 =", value, "column51");
            return (Criteria) this;
        }

        public Criteria andColumn51NotEqualTo(String value) {
            addCriterion("column_51 <>", value, "column51");
            return (Criteria) this;
        }

        public Criteria andColumn51GreaterThan(String value) {
            addCriterion("column_51 >", value, "column51");
            return (Criteria) this;
        }

        public Criteria andColumn51GreaterThanOrEqualTo(String value) {
            addCriterion("column_51 >=", value, "column51");
            return (Criteria) this;
        }

        public Criteria andColumn51LessThan(String value) {
            addCriterion("column_51 <", value, "column51");
            return (Criteria) this;
        }

        public Criteria andColumn51LessThanOrEqualTo(String value) {
            addCriterion("column_51 <=", value, "column51");
            return (Criteria) this;
        }

        public Criteria andColumn51Like(String value) {
            addCriterion("column_51 like", value, "column51");
            return (Criteria) this;
        }

        public Criteria andColumn51NotLike(String value) {
            addCriterion("column_51 not like", value, "column51");
            return (Criteria) this;
        }

        public Criteria andColumn51In(List<String> values) {
            addCriterion("column_51 in", values, "column51");
            return (Criteria) this;
        }

        public Criteria andColumn51NotIn(List<String> values) {
            addCriterion("column_51 not in", values, "column51");
            return (Criteria) this;
        }

        public Criteria andColumn51Between(String value1, String value2) {
            addCriterion("column_51 between", value1, value2, "column51");
            return (Criteria) this;
        }

        public Criteria andColumn51NotBetween(String value1, String value2) {
            addCriterion("column_51 not between", value1, value2, "column51");
            return (Criteria) this;
        }

        public Criteria andColumn52IsNull() {
            addCriterion("column_52 is null");
            return (Criteria) this;
        }

        public Criteria andColumn52IsNotNull() {
            addCriterion("column_52 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn52EqualTo(String value) {
            addCriterion("column_52 =", value, "column52");
            return (Criteria) this;
        }

        public Criteria andColumn52NotEqualTo(String value) {
            addCriterion("column_52 <>", value, "column52");
            return (Criteria) this;
        }

        public Criteria andColumn52GreaterThan(String value) {
            addCriterion("column_52 >", value, "column52");
            return (Criteria) this;
        }

        public Criteria andColumn52GreaterThanOrEqualTo(String value) {
            addCriterion("column_52 >=", value, "column52");
            return (Criteria) this;
        }

        public Criteria andColumn52LessThan(String value) {
            addCriterion("column_52 <", value, "column52");
            return (Criteria) this;
        }

        public Criteria andColumn52LessThanOrEqualTo(String value) {
            addCriterion("column_52 <=", value, "column52");
            return (Criteria) this;
        }

        public Criteria andColumn52Like(String value) {
            addCriterion("column_52 like", value, "column52");
            return (Criteria) this;
        }

        public Criteria andColumn52NotLike(String value) {
            addCriterion("column_52 not like", value, "column52");
            return (Criteria) this;
        }

        public Criteria andColumn52In(List<String> values) {
            addCriterion("column_52 in", values, "column52");
            return (Criteria) this;
        }

        public Criteria andColumn52NotIn(List<String> values) {
            addCriterion("column_52 not in", values, "column52");
            return (Criteria) this;
        }

        public Criteria andColumn52Between(String value1, String value2) {
            addCriterion("column_52 between", value1, value2, "column52");
            return (Criteria) this;
        }

        public Criteria andColumn52NotBetween(String value1, String value2) {
            addCriterion("column_52 not between", value1, value2, "column52");
            return (Criteria) this;
        }

        public Criteria andColumn53IsNull() {
            addCriterion("column_53 is null");
            return (Criteria) this;
        }

        public Criteria andColumn53IsNotNull() {
            addCriterion("column_53 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn53EqualTo(String value) {
            addCriterion("column_53 =", value, "column53");
            return (Criteria) this;
        }

        public Criteria andColumn53NotEqualTo(String value) {
            addCriterion("column_53 <>", value, "column53");
            return (Criteria) this;
        }

        public Criteria andColumn53GreaterThan(String value) {
            addCriterion("column_53 >", value, "column53");
            return (Criteria) this;
        }

        public Criteria andColumn53GreaterThanOrEqualTo(String value) {
            addCriterion("column_53 >=", value, "column53");
            return (Criteria) this;
        }

        public Criteria andColumn53LessThan(String value) {
            addCriterion("column_53 <", value, "column53");
            return (Criteria) this;
        }

        public Criteria andColumn53LessThanOrEqualTo(String value) {
            addCriterion("column_53 <=", value, "column53");
            return (Criteria) this;
        }

        public Criteria andColumn53Like(String value) {
            addCriterion("column_53 like", value, "column53");
            return (Criteria) this;
        }

        public Criteria andColumn53NotLike(String value) {
            addCriterion("column_53 not like", value, "column53");
            return (Criteria) this;
        }

        public Criteria andColumn53In(List<String> values) {
            addCriterion("column_53 in", values, "column53");
            return (Criteria) this;
        }

        public Criteria andColumn53NotIn(List<String> values) {
            addCriterion("column_53 not in", values, "column53");
            return (Criteria) this;
        }

        public Criteria andColumn53Between(String value1, String value2) {
            addCriterion("column_53 between", value1, value2, "column53");
            return (Criteria) this;
        }

        public Criteria andColumn53NotBetween(String value1, String value2) {
            addCriterion("column_53 not between", value1, value2, "column53");
            return (Criteria) this;
        }

        public Criteria andColumn54IsNull() {
            addCriterion("column_54 is null");
            return (Criteria) this;
        }

        public Criteria andColumn54IsNotNull() {
            addCriterion("column_54 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn54EqualTo(String value) {
            addCriterion("column_54 =", value, "column54");
            return (Criteria) this;
        }

        public Criteria andColumn54NotEqualTo(String value) {
            addCriterion("column_54 <>", value, "column54");
            return (Criteria) this;
        }

        public Criteria andColumn54GreaterThan(String value) {
            addCriterion("column_54 >", value, "column54");
            return (Criteria) this;
        }

        public Criteria andColumn54GreaterThanOrEqualTo(String value) {
            addCriterion("column_54 >=", value, "column54");
            return (Criteria) this;
        }

        public Criteria andColumn54LessThan(String value) {
            addCriterion("column_54 <", value, "column54");
            return (Criteria) this;
        }

        public Criteria andColumn54LessThanOrEqualTo(String value) {
            addCriterion("column_54 <=", value, "column54");
            return (Criteria) this;
        }

        public Criteria andColumn54Like(String value) {
            addCriterion("column_54 like", value, "column54");
            return (Criteria) this;
        }

        public Criteria andColumn54NotLike(String value) {
            addCriterion("column_54 not like", value, "column54");
            return (Criteria) this;
        }

        public Criteria andColumn54In(List<String> values) {
            addCriterion("column_54 in", values, "column54");
            return (Criteria) this;
        }

        public Criteria andColumn54NotIn(List<String> values) {
            addCriterion("column_54 not in", values, "column54");
            return (Criteria) this;
        }

        public Criteria andColumn54Between(String value1, String value2) {
            addCriterion("column_54 between", value1, value2, "column54");
            return (Criteria) this;
        }

        public Criteria andColumn54NotBetween(String value1, String value2) {
            addCriterion("column_54 not between", value1, value2, "column54");
            return (Criteria) this;
        }

        public Criteria andColumn55IsNull() {
            addCriterion("column_55 is null");
            return (Criteria) this;
        }

        public Criteria andColumn55IsNotNull() {
            addCriterion("column_55 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn55EqualTo(String value) {
            addCriterion("column_55 =", value, "column55");
            return (Criteria) this;
        }

        public Criteria andColumn55NotEqualTo(String value) {
            addCriterion("column_55 <>", value, "column55");
            return (Criteria) this;
        }

        public Criteria andColumn55GreaterThan(String value) {
            addCriterion("column_55 >", value, "column55");
            return (Criteria) this;
        }

        public Criteria andColumn55GreaterThanOrEqualTo(String value) {
            addCriterion("column_55 >=", value, "column55");
            return (Criteria) this;
        }

        public Criteria andColumn55LessThan(String value) {
            addCriterion("column_55 <", value, "column55");
            return (Criteria) this;
        }

        public Criteria andColumn55LessThanOrEqualTo(String value) {
            addCriterion("column_55 <=", value, "column55");
            return (Criteria) this;
        }

        public Criteria andColumn55Like(String value) {
            addCriterion("column_55 like", value, "column55");
            return (Criteria) this;
        }

        public Criteria andColumn55NotLike(String value) {
            addCriterion("column_55 not like", value, "column55");
            return (Criteria) this;
        }

        public Criteria andColumn55In(List<String> values) {
            addCriterion("column_55 in", values, "column55");
            return (Criteria) this;
        }

        public Criteria andColumn55NotIn(List<String> values) {
            addCriterion("column_55 not in", values, "column55");
            return (Criteria) this;
        }

        public Criteria andColumn55Between(String value1, String value2) {
            addCriterion("column_55 between", value1, value2, "column55");
            return (Criteria) this;
        }

        public Criteria andColumn55NotBetween(String value1, String value2) {
            addCriterion("column_55 not between", value1, value2, "column55");
            return (Criteria) this;
        }

        public Criteria andColumn56IsNull() {
            addCriterion("column_56 is null");
            return (Criteria) this;
        }

        public Criteria andColumn56IsNotNull() {
            addCriterion("column_56 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn56EqualTo(String value) {
            addCriterion("column_56 =", value, "column56");
            return (Criteria) this;
        }

        public Criteria andColumn56NotEqualTo(String value) {
            addCriterion("column_56 <>", value, "column56");
            return (Criteria) this;
        }

        public Criteria andColumn56GreaterThan(String value) {
            addCriterion("column_56 >", value, "column56");
            return (Criteria) this;
        }

        public Criteria andColumn56GreaterThanOrEqualTo(String value) {
            addCriterion("column_56 >=", value, "column56");
            return (Criteria) this;
        }

        public Criteria andColumn56LessThan(String value) {
            addCriterion("column_56 <", value, "column56");
            return (Criteria) this;
        }

        public Criteria andColumn56LessThanOrEqualTo(String value) {
            addCriterion("column_56 <=", value, "column56");
            return (Criteria) this;
        }

        public Criteria andColumn56Like(String value) {
            addCriterion("column_56 like", value, "column56");
            return (Criteria) this;
        }

        public Criteria andColumn56NotLike(String value) {
            addCriterion("column_56 not like", value, "column56");
            return (Criteria) this;
        }

        public Criteria andColumn56In(List<String> values) {
            addCriterion("column_56 in", values, "column56");
            return (Criteria) this;
        }

        public Criteria andColumn56NotIn(List<String> values) {
            addCriterion("column_56 not in", values, "column56");
            return (Criteria) this;
        }

        public Criteria andColumn56Between(String value1, String value2) {
            addCriterion("column_56 between", value1, value2, "column56");
            return (Criteria) this;
        }

        public Criteria andColumn56NotBetween(String value1, String value2) {
            addCriterion("column_56 not between", value1, value2, "column56");
            return (Criteria) this;
        }

        public Criteria andColumn57IsNull() {
            addCriterion("column_57 is null");
            return (Criteria) this;
        }

        public Criteria andColumn57IsNotNull() {
            addCriterion("column_57 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn57EqualTo(String value) {
            addCriterion("column_57 =", value, "column57");
            return (Criteria) this;
        }

        public Criteria andColumn57NotEqualTo(String value) {
            addCriterion("column_57 <>", value, "column57");
            return (Criteria) this;
        }

        public Criteria andColumn57GreaterThan(String value) {
            addCriterion("column_57 >", value, "column57");
            return (Criteria) this;
        }

        public Criteria andColumn57GreaterThanOrEqualTo(String value) {
            addCriterion("column_57 >=", value, "column57");
            return (Criteria) this;
        }

        public Criteria andColumn57LessThan(String value) {
            addCriterion("column_57 <", value, "column57");
            return (Criteria) this;
        }

        public Criteria andColumn57LessThanOrEqualTo(String value) {
            addCriterion("column_57 <=", value, "column57");
            return (Criteria) this;
        }

        public Criteria andColumn57Like(String value) {
            addCriterion("column_57 like", value, "column57");
            return (Criteria) this;
        }

        public Criteria andColumn57NotLike(String value) {
            addCriterion("column_57 not like", value, "column57");
            return (Criteria) this;
        }

        public Criteria andColumn57In(List<String> values) {
            addCriterion("column_57 in", values, "column57");
            return (Criteria) this;
        }

        public Criteria andColumn57NotIn(List<String> values) {
            addCriterion("column_57 not in", values, "column57");
            return (Criteria) this;
        }

        public Criteria andColumn57Between(String value1, String value2) {
            addCriterion("column_57 between", value1, value2, "column57");
            return (Criteria) this;
        }

        public Criteria andColumn57NotBetween(String value1, String value2) {
            addCriterion("column_57 not between", value1, value2, "column57");
            return (Criteria) this;
        }

        public Criteria andColumn58IsNull() {
            addCriterion("column_58 is null");
            return (Criteria) this;
        }

        public Criteria andColumn58IsNotNull() {
            addCriterion("column_58 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn58EqualTo(String value) {
            addCriterion("column_58 =", value, "column58");
            return (Criteria) this;
        }

        public Criteria andColumn58NotEqualTo(String value) {
            addCriterion("column_58 <>", value, "column58");
            return (Criteria) this;
        }

        public Criteria andColumn58GreaterThan(String value) {
            addCriterion("column_58 >", value, "column58");
            return (Criteria) this;
        }

        public Criteria andColumn58GreaterThanOrEqualTo(String value) {
            addCriterion("column_58 >=", value, "column58");
            return (Criteria) this;
        }

        public Criteria andColumn58LessThan(String value) {
            addCriterion("column_58 <", value, "column58");
            return (Criteria) this;
        }

        public Criteria andColumn58LessThanOrEqualTo(String value) {
            addCriterion("column_58 <=", value, "column58");
            return (Criteria) this;
        }

        public Criteria andColumn58Like(String value) {
            addCriterion("column_58 like", value, "column58");
            return (Criteria) this;
        }

        public Criteria andColumn58NotLike(String value) {
            addCriterion("column_58 not like", value, "column58");
            return (Criteria) this;
        }

        public Criteria andColumn58In(List<String> values) {
            addCriterion("column_58 in", values, "column58");
            return (Criteria) this;
        }

        public Criteria andColumn58NotIn(List<String> values) {
            addCriterion("column_58 not in", values, "column58");
            return (Criteria) this;
        }

        public Criteria andColumn58Between(String value1, String value2) {
            addCriterion("column_58 between", value1, value2, "column58");
            return (Criteria) this;
        }

        public Criteria andColumn58NotBetween(String value1, String value2) {
            addCriterion("column_58 not between", value1, value2, "column58");
            return (Criteria) this;
        }

        public Criteria andColumn59IsNull() {
            addCriterion("column_59 is null");
            return (Criteria) this;
        }

        public Criteria andColumn59IsNotNull() {
            addCriterion("column_59 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn59EqualTo(String value) {
            addCriterion("column_59 =", value, "column59");
            return (Criteria) this;
        }

        public Criteria andColumn59NotEqualTo(String value) {
            addCriterion("column_59 <>", value, "column59");
            return (Criteria) this;
        }

        public Criteria andColumn59GreaterThan(String value) {
            addCriterion("column_59 >", value, "column59");
            return (Criteria) this;
        }

        public Criteria andColumn59GreaterThanOrEqualTo(String value) {
            addCriterion("column_59 >=", value, "column59");
            return (Criteria) this;
        }

        public Criteria andColumn59LessThan(String value) {
            addCriterion("column_59 <", value, "column59");
            return (Criteria) this;
        }

        public Criteria andColumn59LessThanOrEqualTo(String value) {
            addCriterion("column_59 <=", value, "column59");
            return (Criteria) this;
        }

        public Criteria andColumn59Like(String value) {
            addCriterion("column_59 like", value, "column59");
            return (Criteria) this;
        }

        public Criteria andColumn59NotLike(String value) {
            addCriterion("column_59 not like", value, "column59");
            return (Criteria) this;
        }

        public Criteria andColumn59In(List<String> values) {
            addCriterion("column_59 in", values, "column59");
            return (Criteria) this;
        }

        public Criteria andColumn59NotIn(List<String> values) {
            addCriterion("column_59 not in", values, "column59");
            return (Criteria) this;
        }

        public Criteria andColumn59Between(String value1, String value2) {
            addCriterion("column_59 between", value1, value2, "column59");
            return (Criteria) this;
        }

        public Criteria andColumn59NotBetween(String value1, String value2) {
            addCriterion("column_59 not between", value1, value2, "column59");
            return (Criteria) this;
        }

        public Criteria andColumn60IsNull() {
            addCriterion("column_60 is null");
            return (Criteria) this;
        }

        public Criteria andColumn60IsNotNull() {
            addCriterion("column_60 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn60EqualTo(String value) {
            addCriterion("column_60 =", value, "column60");
            return (Criteria) this;
        }

        public Criteria andColumn60NotEqualTo(String value) {
            addCriterion("column_60 <>", value, "column60");
            return (Criteria) this;
        }

        public Criteria andColumn60GreaterThan(String value) {
            addCriterion("column_60 >", value, "column60");
            return (Criteria) this;
        }

        public Criteria andColumn60GreaterThanOrEqualTo(String value) {
            addCriterion("column_60 >=", value, "column60");
            return (Criteria) this;
        }

        public Criteria andColumn60LessThan(String value) {
            addCriterion("column_60 <", value, "column60");
            return (Criteria) this;
        }

        public Criteria andColumn60LessThanOrEqualTo(String value) {
            addCriterion("column_60 <=", value, "column60");
            return (Criteria) this;
        }

        public Criteria andColumn60Like(String value) {
            addCriterion("column_60 like", value, "column60");
            return (Criteria) this;
        }

        public Criteria andColumn60NotLike(String value) {
            addCriterion("column_60 not like", value, "column60");
            return (Criteria) this;
        }

        public Criteria andColumn60In(List<String> values) {
            addCriterion("column_60 in", values, "column60");
            return (Criteria) this;
        }

        public Criteria andColumn60NotIn(List<String> values) {
            addCriterion("column_60 not in", values, "column60");
            return (Criteria) this;
        }

        public Criteria andColumn60Between(String value1, String value2) {
            addCriterion("column_60 between", value1, value2, "column60");
            return (Criteria) this;
        }

        public Criteria andColumn60NotBetween(String value1, String value2) {
            addCriterion("column_60 not between", value1, value2, "column60");
            return (Criteria) this;
        }

        public Criteria andColumn61IsNull() {
            addCriterion("column_61 is null");
            return (Criteria) this;
        }

        public Criteria andColumn61IsNotNull() {
            addCriterion("column_61 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn61EqualTo(String value) {
            addCriterion("column_61 =", value, "column61");
            return (Criteria) this;
        }

        public Criteria andColumn61NotEqualTo(String value) {
            addCriterion("column_61 <>", value, "column61");
            return (Criteria) this;
        }

        public Criteria andColumn61GreaterThan(String value) {
            addCriterion("column_61 >", value, "column61");
            return (Criteria) this;
        }

        public Criteria andColumn61GreaterThanOrEqualTo(String value) {
            addCriterion("column_61 >=", value, "column61");
            return (Criteria) this;
        }

        public Criteria andColumn61LessThan(String value) {
            addCriterion("column_61 <", value, "column61");
            return (Criteria) this;
        }

        public Criteria andColumn61LessThanOrEqualTo(String value) {
            addCriterion("column_61 <=", value, "column61");
            return (Criteria) this;
        }

        public Criteria andColumn61Like(String value) {
            addCriterion("column_61 like", value, "column61");
            return (Criteria) this;
        }

        public Criteria andColumn61NotLike(String value) {
            addCriterion("column_61 not like", value, "column61");
            return (Criteria) this;
        }

        public Criteria andColumn61In(List<String> values) {
            addCriterion("column_61 in", values, "column61");
            return (Criteria) this;
        }

        public Criteria andColumn61NotIn(List<String> values) {
            addCriterion("column_61 not in", values, "column61");
            return (Criteria) this;
        }

        public Criteria andColumn61Between(String value1, String value2) {
            addCriterion("column_61 between", value1, value2, "column61");
            return (Criteria) this;
        }

        public Criteria andColumn61NotBetween(String value1, String value2) {
            addCriterion("column_61 not between", value1, value2, "column61");
            return (Criteria) this;
        }

        public Criteria andColumn62IsNull() {
            addCriterion("column_62 is null");
            return (Criteria) this;
        }

        public Criteria andColumn62IsNotNull() {
            addCriterion("column_62 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn62EqualTo(String value) {
            addCriterion("column_62 =", value, "column62");
            return (Criteria) this;
        }

        public Criteria andColumn62NotEqualTo(String value) {
            addCriterion("column_62 <>", value, "column62");
            return (Criteria) this;
        }

        public Criteria andColumn62GreaterThan(String value) {
            addCriterion("column_62 >", value, "column62");
            return (Criteria) this;
        }

        public Criteria andColumn62GreaterThanOrEqualTo(String value) {
            addCriterion("column_62 >=", value, "column62");
            return (Criteria) this;
        }

        public Criteria andColumn62LessThan(String value) {
            addCriterion("column_62 <", value, "column62");
            return (Criteria) this;
        }

        public Criteria andColumn62LessThanOrEqualTo(String value) {
            addCriterion("column_62 <=", value, "column62");
            return (Criteria) this;
        }

        public Criteria andColumn62Like(String value) {
            addCriterion("column_62 like", value, "column62");
            return (Criteria) this;
        }

        public Criteria andColumn62NotLike(String value) {
            addCriterion("column_62 not like", value, "column62");
            return (Criteria) this;
        }

        public Criteria andColumn62In(List<String> values) {
            addCriterion("column_62 in", values, "column62");
            return (Criteria) this;
        }

        public Criteria andColumn62NotIn(List<String> values) {
            addCriterion("column_62 not in", values, "column62");
            return (Criteria) this;
        }

        public Criteria andColumn62Between(String value1, String value2) {
            addCriterion("column_62 between", value1, value2, "column62");
            return (Criteria) this;
        }

        public Criteria andColumn62NotBetween(String value1, String value2) {
            addCriterion("column_62 not between", value1, value2, "column62");
            return (Criteria) this;
        }

        public Criteria andColumn63IsNull() {
            addCriterion("column_63 is null");
            return (Criteria) this;
        }

        public Criteria andColumn63IsNotNull() {
            addCriterion("column_63 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn63EqualTo(String value) {
            addCriterion("column_63 =", value, "column63");
            return (Criteria) this;
        }

        public Criteria andColumn63NotEqualTo(String value) {
            addCriterion("column_63 <>", value, "column63");
            return (Criteria) this;
        }

        public Criteria andColumn63GreaterThan(String value) {
            addCriterion("column_63 >", value, "column63");
            return (Criteria) this;
        }

        public Criteria andColumn63GreaterThanOrEqualTo(String value) {
            addCriterion("column_63 >=", value, "column63");
            return (Criteria) this;
        }

        public Criteria andColumn63LessThan(String value) {
            addCriterion("column_63 <", value, "column63");
            return (Criteria) this;
        }

        public Criteria andColumn63LessThanOrEqualTo(String value) {
            addCriterion("column_63 <=", value, "column63");
            return (Criteria) this;
        }

        public Criteria andColumn63Like(String value) {
            addCriterion("column_63 like", value, "column63");
            return (Criteria) this;
        }

        public Criteria andColumn63NotLike(String value) {
            addCriterion("column_63 not like", value, "column63");
            return (Criteria) this;
        }

        public Criteria andColumn63In(List<String> values) {
            addCriterion("column_63 in", values, "column63");
            return (Criteria) this;
        }

        public Criteria andColumn63NotIn(List<String> values) {
            addCriterion("column_63 not in", values, "column63");
            return (Criteria) this;
        }

        public Criteria andColumn63Between(String value1, String value2) {
            addCriterion("column_63 between", value1, value2, "column63");
            return (Criteria) this;
        }

        public Criteria andColumn63NotBetween(String value1, String value2) {
            addCriterion("column_63 not between", value1, value2, "column63");
            return (Criteria) this;
        }

        public Criteria andColumn64IsNull() {
            addCriterion("column_64 is null");
            return (Criteria) this;
        }

        public Criteria andColumn64IsNotNull() {
            addCriterion("column_64 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn64EqualTo(String value) {
            addCriterion("column_64 =", value, "column64");
            return (Criteria) this;
        }

        public Criteria andColumn64NotEqualTo(String value) {
            addCriterion("column_64 <>", value, "column64");
            return (Criteria) this;
        }

        public Criteria andColumn64GreaterThan(String value) {
            addCriterion("column_64 >", value, "column64");
            return (Criteria) this;
        }

        public Criteria andColumn64GreaterThanOrEqualTo(String value) {
            addCriterion("column_64 >=", value, "column64");
            return (Criteria) this;
        }

        public Criteria andColumn64LessThan(String value) {
            addCriterion("column_64 <", value, "column64");
            return (Criteria) this;
        }

        public Criteria andColumn64LessThanOrEqualTo(String value) {
            addCriterion("column_64 <=", value, "column64");
            return (Criteria) this;
        }

        public Criteria andColumn64Like(String value) {
            addCriterion("column_64 like", value, "column64");
            return (Criteria) this;
        }

        public Criteria andColumn64NotLike(String value) {
            addCriterion("column_64 not like", value, "column64");
            return (Criteria) this;
        }

        public Criteria andColumn64In(List<String> values) {
            addCriterion("column_64 in", values, "column64");
            return (Criteria) this;
        }

        public Criteria andColumn64NotIn(List<String> values) {
            addCriterion("column_64 not in", values, "column64");
            return (Criteria) this;
        }

        public Criteria andColumn64Between(String value1, String value2) {
            addCriterion("column_64 between", value1, value2, "column64");
            return (Criteria) this;
        }

        public Criteria andColumn64NotBetween(String value1, String value2) {
            addCriterion("column_64 not between", value1, value2, "column64");
            return (Criteria) this;
        }

        public Criteria andColumn65IsNull() {
            addCriterion("column_65 is null");
            return (Criteria) this;
        }

        public Criteria andColumn65IsNotNull() {
            addCriterion("column_65 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn65EqualTo(String value) {
            addCriterion("column_65 =", value, "column65");
            return (Criteria) this;
        }

        public Criteria andColumn65NotEqualTo(String value) {
            addCriterion("column_65 <>", value, "column65");
            return (Criteria) this;
        }

        public Criteria andColumn65GreaterThan(String value) {
            addCriterion("column_65 >", value, "column65");
            return (Criteria) this;
        }

        public Criteria andColumn65GreaterThanOrEqualTo(String value) {
            addCriterion("column_65 >=", value, "column65");
            return (Criteria) this;
        }

        public Criteria andColumn65LessThan(String value) {
            addCriterion("column_65 <", value, "column65");
            return (Criteria) this;
        }

        public Criteria andColumn65LessThanOrEqualTo(String value) {
            addCriterion("column_65 <=", value, "column65");
            return (Criteria) this;
        }

        public Criteria andColumn65Like(String value) {
            addCriterion("column_65 like", value, "column65");
            return (Criteria) this;
        }

        public Criteria andColumn65NotLike(String value) {
            addCriterion("column_65 not like", value, "column65");
            return (Criteria) this;
        }

        public Criteria andColumn65In(List<String> values) {
            addCriterion("column_65 in", values, "column65");
            return (Criteria) this;
        }

        public Criteria andColumn65NotIn(List<String> values) {
            addCriterion("column_65 not in", values, "column65");
            return (Criteria) this;
        }

        public Criteria andColumn65Between(String value1, String value2) {
            addCriterion("column_65 between", value1, value2, "column65");
            return (Criteria) this;
        }

        public Criteria andColumn65NotBetween(String value1, String value2) {
            addCriterion("column_65 not between", value1, value2, "column65");
            return (Criteria) this;
        }

        public Criteria andColumn66IsNull() {
            addCriterion("column_66 is null");
            return (Criteria) this;
        }

        public Criteria andColumn66IsNotNull() {
            addCriterion("column_66 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn66EqualTo(String value) {
            addCriterion("column_66 =", value, "column66");
            return (Criteria) this;
        }

        public Criteria andColumn66NotEqualTo(String value) {
            addCriterion("column_66 <>", value, "column66");
            return (Criteria) this;
        }

        public Criteria andColumn66GreaterThan(String value) {
            addCriterion("column_66 >", value, "column66");
            return (Criteria) this;
        }

        public Criteria andColumn66GreaterThanOrEqualTo(String value) {
            addCriterion("column_66 >=", value, "column66");
            return (Criteria) this;
        }

        public Criteria andColumn66LessThan(String value) {
            addCriterion("column_66 <", value, "column66");
            return (Criteria) this;
        }

        public Criteria andColumn66LessThanOrEqualTo(String value) {
            addCriterion("column_66 <=", value, "column66");
            return (Criteria) this;
        }

        public Criteria andColumn66Like(String value) {
            addCriterion("column_66 like", value, "column66");
            return (Criteria) this;
        }

        public Criteria andColumn66NotLike(String value) {
            addCriterion("column_66 not like", value, "column66");
            return (Criteria) this;
        }

        public Criteria andColumn66In(List<String> values) {
            addCriterion("column_66 in", values, "column66");
            return (Criteria) this;
        }

        public Criteria andColumn66NotIn(List<String> values) {
            addCriterion("column_66 not in", values, "column66");
            return (Criteria) this;
        }

        public Criteria andColumn66Between(String value1, String value2) {
            addCriterion("column_66 between", value1, value2, "column66");
            return (Criteria) this;
        }

        public Criteria andColumn66NotBetween(String value1, String value2) {
            addCriterion("column_66 not between", value1, value2, "column66");
            return (Criteria) this;
        }

        public Criteria andColumn67IsNull() {
            addCriterion("column_67 is null");
            return (Criteria) this;
        }

        public Criteria andColumn67IsNotNull() {
            addCriterion("column_67 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn67EqualTo(String value) {
            addCriterion("column_67 =", value, "column67");
            return (Criteria) this;
        }

        public Criteria andColumn67NotEqualTo(String value) {
            addCriterion("column_67 <>", value, "column67");
            return (Criteria) this;
        }

        public Criteria andColumn67GreaterThan(String value) {
            addCriterion("column_67 >", value, "column67");
            return (Criteria) this;
        }

        public Criteria andColumn67GreaterThanOrEqualTo(String value) {
            addCriterion("column_67 >=", value, "column67");
            return (Criteria) this;
        }

        public Criteria andColumn67LessThan(String value) {
            addCriterion("column_67 <", value, "column67");
            return (Criteria) this;
        }

        public Criteria andColumn67LessThanOrEqualTo(String value) {
            addCriterion("column_67 <=", value, "column67");
            return (Criteria) this;
        }

        public Criteria andColumn67Like(String value) {
            addCriterion("column_67 like", value, "column67");
            return (Criteria) this;
        }

        public Criteria andColumn67NotLike(String value) {
            addCriterion("column_67 not like", value, "column67");
            return (Criteria) this;
        }

        public Criteria andColumn67In(List<String> values) {
            addCriterion("column_67 in", values, "column67");
            return (Criteria) this;
        }

        public Criteria andColumn67NotIn(List<String> values) {
            addCriterion("column_67 not in", values, "column67");
            return (Criteria) this;
        }

        public Criteria andColumn67Between(String value1, String value2) {
            addCriterion("column_67 between", value1, value2, "column67");
            return (Criteria) this;
        }

        public Criteria andColumn67NotBetween(String value1, String value2) {
            addCriterion("column_67 not between", value1, value2, "column67");
            return (Criteria) this;
        }

        public Criteria andColumn68IsNull() {
            addCriterion("column_68 is null");
            return (Criteria) this;
        }

        public Criteria andColumn68IsNotNull() {
            addCriterion("column_68 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn68EqualTo(String value) {
            addCriterion("column_68 =", value, "column68");
            return (Criteria) this;
        }

        public Criteria andColumn68NotEqualTo(String value) {
            addCriterion("column_68 <>", value, "column68");
            return (Criteria) this;
        }

        public Criteria andColumn68GreaterThan(String value) {
            addCriterion("column_68 >", value, "column68");
            return (Criteria) this;
        }

        public Criteria andColumn68GreaterThanOrEqualTo(String value) {
            addCriterion("column_68 >=", value, "column68");
            return (Criteria) this;
        }

        public Criteria andColumn68LessThan(String value) {
            addCriterion("column_68 <", value, "column68");
            return (Criteria) this;
        }

        public Criteria andColumn68LessThanOrEqualTo(String value) {
            addCriterion("column_68 <=", value, "column68");
            return (Criteria) this;
        }

        public Criteria andColumn68Like(String value) {
            addCriterion("column_68 like", value, "column68");
            return (Criteria) this;
        }

        public Criteria andColumn68NotLike(String value) {
            addCriterion("column_68 not like", value, "column68");
            return (Criteria) this;
        }

        public Criteria andColumn68In(List<String> values) {
            addCriterion("column_68 in", values, "column68");
            return (Criteria) this;
        }

        public Criteria andColumn68NotIn(List<String> values) {
            addCriterion("column_68 not in", values, "column68");
            return (Criteria) this;
        }

        public Criteria andColumn68Between(String value1, String value2) {
            addCriterion("column_68 between", value1, value2, "column68");
            return (Criteria) this;
        }

        public Criteria andColumn68NotBetween(String value1, String value2) {
            addCriterion("column_68 not between", value1, value2, "column68");
            return (Criteria) this;
        }

        public Criteria andColumn69IsNull() {
            addCriterion("column_69 is null");
            return (Criteria) this;
        }

        public Criteria andColumn69IsNotNull() {
            addCriterion("column_69 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn69EqualTo(String value) {
            addCriterion("column_69 =", value, "column69");
            return (Criteria) this;
        }

        public Criteria andColumn69NotEqualTo(String value) {
            addCriterion("column_69 <>", value, "column69");
            return (Criteria) this;
        }

        public Criteria andColumn69GreaterThan(String value) {
            addCriterion("column_69 >", value, "column69");
            return (Criteria) this;
        }

        public Criteria andColumn69GreaterThanOrEqualTo(String value) {
            addCriterion("column_69 >=", value, "column69");
            return (Criteria) this;
        }

        public Criteria andColumn69LessThan(String value) {
            addCriterion("column_69 <", value, "column69");
            return (Criteria) this;
        }

        public Criteria andColumn69LessThanOrEqualTo(String value) {
            addCriterion("column_69 <=", value, "column69");
            return (Criteria) this;
        }

        public Criteria andColumn69Like(String value) {
            addCriterion("column_69 like", value, "column69");
            return (Criteria) this;
        }

        public Criteria andColumn69NotLike(String value) {
            addCriterion("column_69 not like", value, "column69");
            return (Criteria) this;
        }

        public Criteria andColumn69In(List<String> values) {
            addCriterion("column_69 in", values, "column69");
            return (Criteria) this;
        }

        public Criteria andColumn69NotIn(List<String> values) {
            addCriterion("column_69 not in", values, "column69");
            return (Criteria) this;
        }

        public Criteria andColumn69Between(String value1, String value2) {
            addCriterion("column_69 between", value1, value2, "column69");
            return (Criteria) this;
        }

        public Criteria andColumn69NotBetween(String value1, String value2) {
            addCriterion("column_69 not between", value1, value2, "column69");
            return (Criteria) this;
        }

        public Criteria andColumn70IsNull() {
            addCriterion("column_70 is null");
            return (Criteria) this;
        }

        public Criteria andColumn70IsNotNull() {
            addCriterion("column_70 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn70EqualTo(String value) {
            addCriterion("column_70 =", value, "column70");
            return (Criteria) this;
        }

        public Criteria andColumn70NotEqualTo(String value) {
            addCriterion("column_70 <>", value, "column70");
            return (Criteria) this;
        }

        public Criteria andColumn70GreaterThan(String value) {
            addCriterion("column_70 >", value, "column70");
            return (Criteria) this;
        }

        public Criteria andColumn70GreaterThanOrEqualTo(String value) {
            addCriterion("column_70 >=", value, "column70");
            return (Criteria) this;
        }

        public Criteria andColumn70LessThan(String value) {
            addCriterion("column_70 <", value, "column70");
            return (Criteria) this;
        }

        public Criteria andColumn70LessThanOrEqualTo(String value) {
            addCriterion("column_70 <=", value, "column70");
            return (Criteria) this;
        }

        public Criteria andColumn70Like(String value) {
            addCriterion("column_70 like", value, "column70");
            return (Criteria) this;
        }

        public Criteria andColumn70NotLike(String value) {
            addCriterion("column_70 not like", value, "column70");
            return (Criteria) this;
        }

        public Criteria andColumn70In(List<String> values) {
            addCriterion("column_70 in", values, "column70");
            return (Criteria) this;
        }

        public Criteria andColumn70NotIn(List<String> values) {
            addCriterion("column_70 not in", values, "column70");
            return (Criteria) this;
        }

        public Criteria andColumn70Between(String value1, String value2) {
            addCriterion("column_70 between", value1, value2, "column70");
            return (Criteria) this;
        }

        public Criteria andColumn70NotBetween(String value1, String value2) {
            addCriterion("column_70 not between", value1, value2, "column70");
            return (Criteria) this;
        }

        public Criteria andColumn71IsNull() {
            addCriterion("column_71 is null");
            return (Criteria) this;
        }

        public Criteria andColumn71IsNotNull() {
            addCriterion("column_71 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn71EqualTo(String value) {
            addCriterion("column_71 =", value, "column71");
            return (Criteria) this;
        }

        public Criteria andColumn71NotEqualTo(String value) {
            addCriterion("column_71 <>", value, "column71");
            return (Criteria) this;
        }

        public Criteria andColumn71GreaterThan(String value) {
            addCriterion("column_71 >", value, "column71");
            return (Criteria) this;
        }

        public Criteria andColumn71GreaterThanOrEqualTo(String value) {
            addCriterion("column_71 >=", value, "column71");
            return (Criteria) this;
        }

        public Criteria andColumn71LessThan(String value) {
            addCriterion("column_71 <", value, "column71");
            return (Criteria) this;
        }

        public Criteria andColumn71LessThanOrEqualTo(String value) {
            addCriterion("column_71 <=", value, "column71");
            return (Criteria) this;
        }

        public Criteria andColumn71Like(String value) {
            addCriterion("column_71 like", value, "column71");
            return (Criteria) this;
        }

        public Criteria andColumn71NotLike(String value) {
            addCriterion("column_71 not like", value, "column71");
            return (Criteria) this;
        }

        public Criteria andColumn71In(List<String> values) {
            addCriterion("column_71 in", values, "column71");
            return (Criteria) this;
        }

        public Criteria andColumn71NotIn(List<String> values) {
            addCriterion("column_71 not in", values, "column71");
            return (Criteria) this;
        }

        public Criteria andColumn71Between(String value1, String value2) {
            addCriterion("column_71 between", value1, value2, "column71");
            return (Criteria) this;
        }

        public Criteria andColumn71NotBetween(String value1, String value2) {
            addCriterion("column_71 not between", value1, value2, "column71");
            return (Criteria) this;
        }

        public Criteria andColumn72IsNull() {
            addCriterion("column_72 is null");
            return (Criteria) this;
        }

        public Criteria andColumn72IsNotNull() {
            addCriterion("column_72 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn72EqualTo(String value) {
            addCriterion("column_72 =", value, "column72");
            return (Criteria) this;
        }

        public Criteria andColumn72NotEqualTo(String value) {
            addCriterion("column_72 <>", value, "column72");
            return (Criteria) this;
        }

        public Criteria andColumn72GreaterThan(String value) {
            addCriterion("column_72 >", value, "column72");
            return (Criteria) this;
        }

        public Criteria andColumn72GreaterThanOrEqualTo(String value) {
            addCriterion("column_72 >=", value, "column72");
            return (Criteria) this;
        }

        public Criteria andColumn72LessThan(String value) {
            addCriterion("column_72 <", value, "column72");
            return (Criteria) this;
        }

        public Criteria andColumn72LessThanOrEqualTo(String value) {
            addCriterion("column_72 <=", value, "column72");
            return (Criteria) this;
        }

        public Criteria andColumn72Like(String value) {
            addCriterion("column_72 like", value, "column72");
            return (Criteria) this;
        }

        public Criteria andColumn72NotLike(String value) {
            addCriterion("column_72 not like", value, "column72");
            return (Criteria) this;
        }

        public Criteria andColumn72In(List<String> values) {
            addCriterion("column_72 in", values, "column72");
            return (Criteria) this;
        }

        public Criteria andColumn72NotIn(List<String> values) {
            addCriterion("column_72 not in", values, "column72");
            return (Criteria) this;
        }

        public Criteria andColumn72Between(String value1, String value2) {
            addCriterion("column_72 between", value1, value2, "column72");
            return (Criteria) this;
        }

        public Criteria andColumn72NotBetween(String value1, String value2) {
            addCriterion("column_72 not between", value1, value2, "column72");
            return (Criteria) this;
        }

        public Criteria andColumn73IsNull() {
            addCriterion("column_73 is null");
            return (Criteria) this;
        }

        public Criteria andColumn73IsNotNull() {
            addCriterion("column_73 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn73EqualTo(String value) {
            addCriterion("column_73 =", value, "column73");
            return (Criteria) this;
        }

        public Criteria andColumn73NotEqualTo(String value) {
            addCriterion("column_73 <>", value, "column73");
            return (Criteria) this;
        }

        public Criteria andColumn73GreaterThan(String value) {
            addCriterion("column_73 >", value, "column73");
            return (Criteria) this;
        }

        public Criteria andColumn73GreaterThanOrEqualTo(String value) {
            addCriterion("column_73 >=", value, "column73");
            return (Criteria) this;
        }

        public Criteria andColumn73LessThan(String value) {
            addCriterion("column_73 <", value, "column73");
            return (Criteria) this;
        }

        public Criteria andColumn73LessThanOrEqualTo(String value) {
            addCriterion("column_73 <=", value, "column73");
            return (Criteria) this;
        }

        public Criteria andColumn73Like(String value) {
            addCriterion("column_73 like", value, "column73");
            return (Criteria) this;
        }

        public Criteria andColumn73NotLike(String value) {
            addCriterion("column_73 not like", value, "column73");
            return (Criteria) this;
        }

        public Criteria andColumn73In(List<String> values) {
            addCriterion("column_73 in", values, "column73");
            return (Criteria) this;
        }

        public Criteria andColumn73NotIn(List<String> values) {
            addCriterion("column_73 not in", values, "column73");
            return (Criteria) this;
        }

        public Criteria andColumn73Between(String value1, String value2) {
            addCriterion("column_73 between", value1, value2, "column73");
            return (Criteria) this;
        }

        public Criteria andColumn73NotBetween(String value1, String value2) {
            addCriterion("column_73 not between", value1, value2, "column73");
            return (Criteria) this;
        }

        public Criteria andColumn74IsNull() {
            addCriterion("column_74 is null");
            return (Criteria) this;
        }

        public Criteria andColumn74IsNotNull() {
            addCriterion("column_74 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn74EqualTo(String value) {
            addCriterion("column_74 =", value, "column74");
            return (Criteria) this;
        }

        public Criteria andColumn74NotEqualTo(String value) {
            addCriterion("column_74 <>", value, "column74");
            return (Criteria) this;
        }

        public Criteria andColumn74GreaterThan(String value) {
            addCriterion("column_74 >", value, "column74");
            return (Criteria) this;
        }

        public Criteria andColumn74GreaterThanOrEqualTo(String value) {
            addCriterion("column_74 >=", value, "column74");
            return (Criteria) this;
        }

        public Criteria andColumn74LessThan(String value) {
            addCriterion("column_74 <", value, "column74");
            return (Criteria) this;
        }

        public Criteria andColumn74LessThanOrEqualTo(String value) {
            addCriterion("column_74 <=", value, "column74");
            return (Criteria) this;
        }

        public Criteria andColumn74Like(String value) {
            addCriterion("column_74 like", value, "column74");
            return (Criteria) this;
        }

        public Criteria andColumn74NotLike(String value) {
            addCriterion("column_74 not like", value, "column74");
            return (Criteria) this;
        }

        public Criteria andColumn74In(List<String> values) {
            addCriterion("column_74 in", values, "column74");
            return (Criteria) this;
        }

        public Criteria andColumn74NotIn(List<String> values) {
            addCriterion("column_74 not in", values, "column74");
            return (Criteria) this;
        }

        public Criteria andColumn74Between(String value1, String value2) {
            addCriterion("column_74 between", value1, value2, "column74");
            return (Criteria) this;
        }

        public Criteria andColumn74NotBetween(String value1, String value2) {
            addCriterion("column_74 not between", value1, value2, "column74");
            return (Criteria) this;
        }

        public Criteria andColumn75IsNull() {
            addCriterion("column_75 is null");
            return (Criteria) this;
        }

        public Criteria andColumn75IsNotNull() {
            addCriterion("column_75 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn75EqualTo(String value) {
            addCriterion("column_75 =", value, "column75");
            return (Criteria) this;
        }

        public Criteria andColumn75NotEqualTo(String value) {
            addCriterion("column_75 <>", value, "column75");
            return (Criteria) this;
        }

        public Criteria andColumn75GreaterThan(String value) {
            addCriterion("column_75 >", value, "column75");
            return (Criteria) this;
        }

        public Criteria andColumn75GreaterThanOrEqualTo(String value) {
            addCriterion("column_75 >=", value, "column75");
            return (Criteria) this;
        }

        public Criteria andColumn75LessThan(String value) {
            addCriterion("column_75 <", value, "column75");
            return (Criteria) this;
        }

        public Criteria andColumn75LessThanOrEqualTo(String value) {
            addCriterion("column_75 <=", value, "column75");
            return (Criteria) this;
        }

        public Criteria andColumn75Like(String value) {
            addCriterion("column_75 like", value, "column75");
            return (Criteria) this;
        }

        public Criteria andColumn75NotLike(String value) {
            addCriterion("column_75 not like", value, "column75");
            return (Criteria) this;
        }

        public Criteria andColumn75In(List<String> values) {
            addCriterion("column_75 in", values, "column75");
            return (Criteria) this;
        }

        public Criteria andColumn75NotIn(List<String> values) {
            addCriterion("column_75 not in", values, "column75");
            return (Criteria) this;
        }

        public Criteria andColumn75Between(String value1, String value2) {
            addCriterion("column_75 between", value1, value2, "column75");
            return (Criteria) this;
        }

        public Criteria andColumn75NotBetween(String value1, String value2) {
            addCriterion("column_75 not between", value1, value2, "column75");
            return (Criteria) this;
        }

        public Criteria andColumn76IsNull() {
            addCriterion("column_76 is null");
            return (Criteria) this;
        }

        public Criteria andColumn76IsNotNull() {
            addCriterion("column_76 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn76EqualTo(String value) {
            addCriterion("column_76 =", value, "column76");
            return (Criteria) this;
        }

        public Criteria andColumn76NotEqualTo(String value) {
            addCriterion("column_76 <>", value, "column76");
            return (Criteria) this;
        }

        public Criteria andColumn76GreaterThan(String value) {
            addCriterion("column_76 >", value, "column76");
            return (Criteria) this;
        }

        public Criteria andColumn76GreaterThanOrEqualTo(String value) {
            addCriterion("column_76 >=", value, "column76");
            return (Criteria) this;
        }

        public Criteria andColumn76LessThan(String value) {
            addCriterion("column_76 <", value, "column76");
            return (Criteria) this;
        }

        public Criteria andColumn76LessThanOrEqualTo(String value) {
            addCriterion("column_76 <=", value, "column76");
            return (Criteria) this;
        }

        public Criteria andColumn76Like(String value) {
            addCriterion("column_76 like", value, "column76");
            return (Criteria) this;
        }

        public Criteria andColumn76NotLike(String value) {
            addCriterion("column_76 not like", value, "column76");
            return (Criteria) this;
        }

        public Criteria andColumn76In(List<String> values) {
            addCriterion("column_76 in", values, "column76");
            return (Criteria) this;
        }

        public Criteria andColumn76NotIn(List<String> values) {
            addCriterion("column_76 not in", values, "column76");
            return (Criteria) this;
        }

        public Criteria andColumn76Between(String value1, String value2) {
            addCriterion("column_76 between", value1, value2, "column76");
            return (Criteria) this;
        }

        public Criteria andColumn76NotBetween(String value1, String value2) {
            addCriterion("column_76 not between", value1, value2, "column76");
            return (Criteria) this;
        }

        public Criteria andColumn77IsNull() {
            addCriterion("column_77 is null");
            return (Criteria) this;
        }

        public Criteria andColumn77IsNotNull() {
            addCriterion("column_77 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn77EqualTo(String value) {
            addCriterion("column_77 =", value, "column77");
            return (Criteria) this;
        }

        public Criteria andColumn77NotEqualTo(String value) {
            addCriterion("column_77 <>", value, "column77");
            return (Criteria) this;
        }

        public Criteria andColumn77GreaterThan(String value) {
            addCriterion("column_77 >", value, "column77");
            return (Criteria) this;
        }

        public Criteria andColumn77GreaterThanOrEqualTo(String value) {
            addCriterion("column_77 >=", value, "column77");
            return (Criteria) this;
        }

        public Criteria andColumn77LessThan(String value) {
            addCriterion("column_77 <", value, "column77");
            return (Criteria) this;
        }

        public Criteria andColumn77LessThanOrEqualTo(String value) {
            addCriterion("column_77 <=", value, "column77");
            return (Criteria) this;
        }

        public Criteria andColumn77Like(String value) {
            addCriterion("column_77 like", value, "column77");
            return (Criteria) this;
        }

        public Criteria andColumn77NotLike(String value) {
            addCriterion("column_77 not like", value, "column77");
            return (Criteria) this;
        }

        public Criteria andColumn77In(List<String> values) {
            addCriterion("column_77 in", values, "column77");
            return (Criteria) this;
        }

        public Criteria andColumn77NotIn(List<String> values) {
            addCriterion("column_77 not in", values, "column77");
            return (Criteria) this;
        }

        public Criteria andColumn77Between(String value1, String value2) {
            addCriterion("column_77 between", value1, value2, "column77");
            return (Criteria) this;
        }

        public Criteria andColumn77NotBetween(String value1, String value2) {
            addCriterion("column_77 not between", value1, value2, "column77");
            return (Criteria) this;
        }

        public Criteria andColumn78IsNull() {
            addCriterion("column_78 is null");
            return (Criteria) this;
        }

        public Criteria andColumn78IsNotNull() {
            addCriterion("column_78 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn78EqualTo(String value) {
            addCriterion("column_78 =", value, "column78");
            return (Criteria) this;
        }

        public Criteria andColumn78NotEqualTo(String value) {
            addCriterion("column_78 <>", value, "column78");
            return (Criteria) this;
        }

        public Criteria andColumn78GreaterThan(String value) {
            addCriterion("column_78 >", value, "column78");
            return (Criteria) this;
        }

        public Criteria andColumn78GreaterThanOrEqualTo(String value) {
            addCriterion("column_78 >=", value, "column78");
            return (Criteria) this;
        }

        public Criteria andColumn78LessThan(String value) {
            addCriterion("column_78 <", value, "column78");
            return (Criteria) this;
        }

        public Criteria andColumn78LessThanOrEqualTo(String value) {
            addCriterion("column_78 <=", value, "column78");
            return (Criteria) this;
        }

        public Criteria andColumn78Like(String value) {
            addCriterion("column_78 like", value, "column78");
            return (Criteria) this;
        }

        public Criteria andColumn78NotLike(String value) {
            addCriterion("column_78 not like", value, "column78");
            return (Criteria) this;
        }

        public Criteria andColumn78In(List<String> values) {
            addCriterion("column_78 in", values, "column78");
            return (Criteria) this;
        }

        public Criteria andColumn78NotIn(List<String> values) {
            addCriterion("column_78 not in", values, "column78");
            return (Criteria) this;
        }

        public Criteria andColumn78Between(String value1, String value2) {
            addCriterion("column_78 between", value1, value2, "column78");
            return (Criteria) this;
        }

        public Criteria andColumn78NotBetween(String value1, String value2) {
            addCriterion("column_78 not between", value1, value2, "column78");
            return (Criteria) this;
        }

        public Criteria andColumn79IsNull() {
            addCriterion("column_79 is null");
            return (Criteria) this;
        }

        public Criteria andColumn79IsNotNull() {
            addCriterion("column_79 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn79EqualTo(String value) {
            addCriterion("column_79 =", value, "column79");
            return (Criteria) this;
        }

        public Criteria andColumn79NotEqualTo(String value) {
            addCriterion("column_79 <>", value, "column79");
            return (Criteria) this;
        }

        public Criteria andColumn79GreaterThan(String value) {
            addCriterion("column_79 >", value, "column79");
            return (Criteria) this;
        }

        public Criteria andColumn79GreaterThanOrEqualTo(String value) {
            addCriterion("column_79 >=", value, "column79");
            return (Criteria) this;
        }

        public Criteria andColumn79LessThan(String value) {
            addCriterion("column_79 <", value, "column79");
            return (Criteria) this;
        }

        public Criteria andColumn79LessThanOrEqualTo(String value) {
            addCriterion("column_79 <=", value, "column79");
            return (Criteria) this;
        }

        public Criteria andColumn79Like(String value) {
            addCriterion("column_79 like", value, "column79");
            return (Criteria) this;
        }

        public Criteria andColumn79NotLike(String value) {
            addCriterion("column_79 not like", value, "column79");
            return (Criteria) this;
        }

        public Criteria andColumn79In(List<String> values) {
            addCriterion("column_79 in", values, "column79");
            return (Criteria) this;
        }

        public Criteria andColumn79NotIn(List<String> values) {
            addCriterion("column_79 not in", values, "column79");
            return (Criteria) this;
        }

        public Criteria andColumn79Between(String value1, String value2) {
            addCriterion("column_79 between", value1, value2, "column79");
            return (Criteria) this;
        }

        public Criteria andColumn79NotBetween(String value1, String value2) {
            addCriterion("column_79 not between", value1, value2, "column79");
            return (Criteria) this;
        }

        public Criteria andColumn80IsNull() {
            addCriterion("column_80 is null");
            return (Criteria) this;
        }

        public Criteria andColumn80IsNotNull() {
            addCriterion("column_80 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn80EqualTo(String value) {
            addCriterion("column_80 =", value, "column80");
            return (Criteria) this;
        }

        public Criteria andColumn80NotEqualTo(String value) {
            addCriterion("column_80 <>", value, "column80");
            return (Criteria) this;
        }

        public Criteria andColumn80GreaterThan(String value) {
            addCriterion("column_80 >", value, "column80");
            return (Criteria) this;
        }

        public Criteria andColumn80GreaterThanOrEqualTo(String value) {
            addCriterion("column_80 >=", value, "column80");
            return (Criteria) this;
        }

        public Criteria andColumn80LessThan(String value) {
            addCriterion("column_80 <", value, "column80");
            return (Criteria) this;
        }

        public Criteria andColumn80LessThanOrEqualTo(String value) {
            addCriterion("column_80 <=", value, "column80");
            return (Criteria) this;
        }

        public Criteria andColumn80Like(String value) {
            addCriterion("column_80 like", value, "column80");
            return (Criteria) this;
        }

        public Criteria andColumn80NotLike(String value) {
            addCriterion("column_80 not like", value, "column80");
            return (Criteria) this;
        }

        public Criteria andColumn80In(List<String> values) {
            addCriterion("column_80 in", values, "column80");
            return (Criteria) this;
        }

        public Criteria andColumn80NotIn(List<String> values) {
            addCriterion("column_80 not in", values, "column80");
            return (Criteria) this;
        }

        public Criteria andColumn80Between(String value1, String value2) {
            addCriterion("column_80 between", value1, value2, "column80");
            return (Criteria) this;
        }

        public Criteria andColumn80NotBetween(String value1, String value2) {
            addCriterion("column_80 not between", value1, value2, "column80");
            return (Criteria) this;
        }

        public Criteria andColumn81IsNull() {
            addCriterion("column_81 is null");
            return (Criteria) this;
        }

        public Criteria andColumn81IsNotNull() {
            addCriterion("column_81 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn81EqualTo(String value) {
            addCriterion("column_81 =", value, "column81");
            return (Criteria) this;
        }

        public Criteria andColumn81NotEqualTo(String value) {
            addCriterion("column_81 <>", value, "column81");
            return (Criteria) this;
        }

        public Criteria andColumn81GreaterThan(String value) {
            addCriterion("column_81 >", value, "column81");
            return (Criteria) this;
        }

        public Criteria andColumn81GreaterThanOrEqualTo(String value) {
            addCriterion("column_81 >=", value, "column81");
            return (Criteria) this;
        }

        public Criteria andColumn81LessThan(String value) {
            addCriterion("column_81 <", value, "column81");
            return (Criteria) this;
        }

        public Criteria andColumn81LessThanOrEqualTo(String value) {
            addCriterion("column_81 <=", value, "column81");
            return (Criteria) this;
        }

        public Criteria andColumn81Like(String value) {
            addCriterion("column_81 like", value, "column81");
            return (Criteria) this;
        }

        public Criteria andColumn81NotLike(String value) {
            addCriterion("column_81 not like", value, "column81");
            return (Criteria) this;
        }

        public Criteria andColumn81In(List<String> values) {
            addCriterion("column_81 in", values, "column81");
            return (Criteria) this;
        }

        public Criteria andColumn81NotIn(List<String> values) {
            addCriterion("column_81 not in", values, "column81");
            return (Criteria) this;
        }

        public Criteria andColumn81Between(String value1, String value2) {
            addCriterion("column_81 between", value1, value2, "column81");
            return (Criteria) this;
        }

        public Criteria andColumn81NotBetween(String value1, String value2) {
            addCriterion("column_81 not between", value1, value2, "column81");
            return (Criteria) this;
        }

        public Criteria andColumn82IsNull() {
            addCriterion("column_82 is null");
            return (Criteria) this;
        }

        public Criteria andColumn82IsNotNull() {
            addCriterion("column_82 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn82EqualTo(String value) {
            addCriterion("column_82 =", value, "column82");
            return (Criteria) this;
        }

        public Criteria andColumn82NotEqualTo(String value) {
            addCriterion("column_82 <>", value, "column82");
            return (Criteria) this;
        }

        public Criteria andColumn82GreaterThan(String value) {
            addCriterion("column_82 >", value, "column82");
            return (Criteria) this;
        }

        public Criteria andColumn82GreaterThanOrEqualTo(String value) {
            addCriterion("column_82 >=", value, "column82");
            return (Criteria) this;
        }

        public Criteria andColumn82LessThan(String value) {
            addCriterion("column_82 <", value, "column82");
            return (Criteria) this;
        }

        public Criteria andColumn82LessThanOrEqualTo(String value) {
            addCriterion("column_82 <=", value, "column82");
            return (Criteria) this;
        }

        public Criteria andColumn82Like(String value) {
            addCriterion("column_82 like", value, "column82");
            return (Criteria) this;
        }

        public Criteria andColumn82NotLike(String value) {
            addCriterion("column_82 not like", value, "column82");
            return (Criteria) this;
        }

        public Criteria andColumn82In(List<String> values) {
            addCriterion("column_82 in", values, "column82");
            return (Criteria) this;
        }

        public Criteria andColumn82NotIn(List<String> values) {
            addCriterion("column_82 not in", values, "column82");
            return (Criteria) this;
        }

        public Criteria andColumn82Between(String value1, String value2) {
            addCriterion("column_82 between", value1, value2, "column82");
            return (Criteria) this;
        }

        public Criteria andColumn82NotBetween(String value1, String value2) {
            addCriterion("column_82 not between", value1, value2, "column82");
            return (Criteria) this;
        }

        public Criteria andColumn83IsNull() {
            addCriterion("column_83 is null");
            return (Criteria) this;
        }

        public Criteria andColumn83IsNotNull() {
            addCriterion("column_83 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn83EqualTo(String value) {
            addCriterion("column_83 =", value, "column83");
            return (Criteria) this;
        }

        public Criteria andColumn83NotEqualTo(String value) {
            addCriterion("column_83 <>", value, "column83");
            return (Criteria) this;
        }

        public Criteria andColumn83GreaterThan(String value) {
            addCriterion("column_83 >", value, "column83");
            return (Criteria) this;
        }

        public Criteria andColumn83GreaterThanOrEqualTo(String value) {
            addCriterion("column_83 >=", value, "column83");
            return (Criteria) this;
        }

        public Criteria andColumn83LessThan(String value) {
            addCriterion("column_83 <", value, "column83");
            return (Criteria) this;
        }

        public Criteria andColumn83LessThanOrEqualTo(String value) {
            addCriterion("column_83 <=", value, "column83");
            return (Criteria) this;
        }

        public Criteria andColumn83Like(String value) {
            addCriterion("column_83 like", value, "column83");
            return (Criteria) this;
        }

        public Criteria andColumn83NotLike(String value) {
            addCriterion("column_83 not like", value, "column83");
            return (Criteria) this;
        }

        public Criteria andColumn83In(List<String> values) {
            addCriterion("column_83 in", values, "column83");
            return (Criteria) this;
        }

        public Criteria andColumn83NotIn(List<String> values) {
            addCriterion("column_83 not in", values, "column83");
            return (Criteria) this;
        }

        public Criteria andColumn83Between(String value1, String value2) {
            addCriterion("column_83 between", value1, value2, "column83");
            return (Criteria) this;
        }

        public Criteria andColumn83NotBetween(String value1, String value2) {
            addCriterion("column_83 not between", value1, value2, "column83");
            return (Criteria) this;
        }

        public Criteria andColumn84IsNull() {
            addCriterion("column_84 is null");
            return (Criteria) this;
        }

        public Criteria andColumn84IsNotNull() {
            addCriterion("column_84 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn84EqualTo(String value) {
            addCriterion("column_84 =", value, "column84");
            return (Criteria) this;
        }

        public Criteria andColumn84NotEqualTo(String value) {
            addCriterion("column_84 <>", value, "column84");
            return (Criteria) this;
        }

        public Criteria andColumn84GreaterThan(String value) {
            addCriterion("column_84 >", value, "column84");
            return (Criteria) this;
        }

        public Criteria andColumn84GreaterThanOrEqualTo(String value) {
            addCriterion("column_84 >=", value, "column84");
            return (Criteria) this;
        }

        public Criteria andColumn84LessThan(String value) {
            addCriterion("column_84 <", value, "column84");
            return (Criteria) this;
        }

        public Criteria andColumn84LessThanOrEqualTo(String value) {
            addCriterion("column_84 <=", value, "column84");
            return (Criteria) this;
        }

        public Criteria andColumn84Like(String value) {
            addCriterion("column_84 like", value, "column84");
            return (Criteria) this;
        }

        public Criteria andColumn84NotLike(String value) {
            addCriterion("column_84 not like", value, "column84");
            return (Criteria) this;
        }

        public Criteria andColumn84In(List<String> values) {
            addCriterion("column_84 in", values, "column84");
            return (Criteria) this;
        }

        public Criteria andColumn84NotIn(List<String> values) {
            addCriterion("column_84 not in", values, "column84");
            return (Criteria) this;
        }

        public Criteria andColumn84Between(String value1, String value2) {
            addCriterion("column_84 between", value1, value2, "column84");
            return (Criteria) this;
        }

        public Criteria andColumn84NotBetween(String value1, String value2) {
            addCriterion("column_84 not between", value1, value2, "column84");
            return (Criteria) this;
        }

        public Criteria andColumn85IsNull() {
            addCriterion("column_85 is null");
            return (Criteria) this;
        }

        public Criteria andColumn85IsNotNull() {
            addCriterion("column_85 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn85EqualTo(String value) {
            addCriterion("column_85 =", value, "column85");
            return (Criteria) this;
        }

        public Criteria andColumn85NotEqualTo(String value) {
            addCriterion("column_85 <>", value, "column85");
            return (Criteria) this;
        }

        public Criteria andColumn85GreaterThan(String value) {
            addCriterion("column_85 >", value, "column85");
            return (Criteria) this;
        }

        public Criteria andColumn85GreaterThanOrEqualTo(String value) {
            addCriterion("column_85 >=", value, "column85");
            return (Criteria) this;
        }

        public Criteria andColumn85LessThan(String value) {
            addCriterion("column_85 <", value, "column85");
            return (Criteria) this;
        }

        public Criteria andColumn85LessThanOrEqualTo(String value) {
            addCriterion("column_85 <=", value, "column85");
            return (Criteria) this;
        }

        public Criteria andColumn85Like(String value) {
            addCriterion("column_85 like", value, "column85");
            return (Criteria) this;
        }

        public Criteria andColumn85NotLike(String value) {
            addCriterion("column_85 not like", value, "column85");
            return (Criteria) this;
        }

        public Criteria andColumn85In(List<String> values) {
            addCriterion("column_85 in", values, "column85");
            return (Criteria) this;
        }

        public Criteria andColumn85NotIn(List<String> values) {
            addCriterion("column_85 not in", values, "column85");
            return (Criteria) this;
        }

        public Criteria andColumn85Between(String value1, String value2) {
            addCriterion("column_85 between", value1, value2, "column85");
            return (Criteria) this;
        }

        public Criteria andColumn85NotBetween(String value1, String value2) {
            addCriterion("column_85 not between", value1, value2, "column85");
            return (Criteria) this;
        }

        public Criteria andColumn86IsNull() {
            addCriterion("column_86 is null");
            return (Criteria) this;
        }

        public Criteria andColumn86IsNotNull() {
            addCriterion("column_86 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn86EqualTo(String value) {
            addCriterion("column_86 =", value, "column86");
            return (Criteria) this;
        }

        public Criteria andColumn86NotEqualTo(String value) {
            addCriterion("column_86 <>", value, "column86");
            return (Criteria) this;
        }

        public Criteria andColumn86GreaterThan(String value) {
            addCriterion("column_86 >", value, "column86");
            return (Criteria) this;
        }

        public Criteria andColumn86GreaterThanOrEqualTo(String value) {
            addCriterion("column_86 >=", value, "column86");
            return (Criteria) this;
        }

        public Criteria andColumn86LessThan(String value) {
            addCriterion("column_86 <", value, "column86");
            return (Criteria) this;
        }

        public Criteria andColumn86LessThanOrEqualTo(String value) {
            addCriterion("column_86 <=", value, "column86");
            return (Criteria) this;
        }

        public Criteria andColumn86Like(String value) {
            addCriterion("column_86 like", value, "column86");
            return (Criteria) this;
        }

        public Criteria andColumn86NotLike(String value) {
            addCriterion("column_86 not like", value, "column86");
            return (Criteria) this;
        }

        public Criteria andColumn86In(List<String> values) {
            addCriterion("column_86 in", values, "column86");
            return (Criteria) this;
        }

        public Criteria andColumn86NotIn(List<String> values) {
            addCriterion("column_86 not in", values, "column86");
            return (Criteria) this;
        }

        public Criteria andColumn86Between(String value1, String value2) {
            addCriterion("column_86 between", value1, value2, "column86");
            return (Criteria) this;
        }

        public Criteria andColumn86NotBetween(String value1, String value2) {
            addCriterion("column_86 not between", value1, value2, "column86");
            return (Criteria) this;
        }

        public Criteria andColumn87IsNull() {
            addCriterion("column_87 is null");
            return (Criteria) this;
        }

        public Criteria andColumn87IsNotNull() {
            addCriterion("column_87 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn87EqualTo(String value) {
            addCriterion("column_87 =", value, "column87");
            return (Criteria) this;
        }

        public Criteria andColumn87NotEqualTo(String value) {
            addCriterion("column_87 <>", value, "column87");
            return (Criteria) this;
        }

        public Criteria andColumn87GreaterThan(String value) {
            addCriterion("column_87 >", value, "column87");
            return (Criteria) this;
        }

        public Criteria andColumn87GreaterThanOrEqualTo(String value) {
            addCriterion("column_87 >=", value, "column87");
            return (Criteria) this;
        }

        public Criteria andColumn87LessThan(String value) {
            addCriterion("column_87 <", value, "column87");
            return (Criteria) this;
        }

        public Criteria andColumn87LessThanOrEqualTo(String value) {
            addCriterion("column_87 <=", value, "column87");
            return (Criteria) this;
        }

        public Criteria andColumn87Like(String value) {
            addCriterion("column_87 like", value, "column87");
            return (Criteria) this;
        }

        public Criteria andColumn87NotLike(String value) {
            addCriterion("column_87 not like", value, "column87");
            return (Criteria) this;
        }

        public Criteria andColumn87In(List<String> values) {
            addCriterion("column_87 in", values, "column87");
            return (Criteria) this;
        }

        public Criteria andColumn87NotIn(List<String> values) {
            addCriterion("column_87 not in", values, "column87");
            return (Criteria) this;
        }

        public Criteria andColumn87Between(String value1, String value2) {
            addCriterion("column_87 between", value1, value2, "column87");
            return (Criteria) this;
        }

        public Criteria andColumn87NotBetween(String value1, String value2) {
            addCriterion("column_87 not between", value1, value2, "column87");
            return (Criteria) this;
        }

        public Criteria andColumn88IsNull() {
            addCriterion("column_88 is null");
            return (Criteria) this;
        }

        public Criteria andColumn88IsNotNull() {
            addCriterion("column_88 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn88EqualTo(String value) {
            addCriterion("column_88 =", value, "column88");
            return (Criteria) this;
        }

        public Criteria andColumn88NotEqualTo(String value) {
            addCriterion("column_88 <>", value, "column88");
            return (Criteria) this;
        }

        public Criteria andColumn88GreaterThan(String value) {
            addCriterion("column_88 >", value, "column88");
            return (Criteria) this;
        }

        public Criteria andColumn88GreaterThanOrEqualTo(String value) {
            addCriterion("column_88 >=", value, "column88");
            return (Criteria) this;
        }

        public Criteria andColumn88LessThan(String value) {
            addCriterion("column_88 <", value, "column88");
            return (Criteria) this;
        }

        public Criteria andColumn88LessThanOrEqualTo(String value) {
            addCriterion("column_88 <=", value, "column88");
            return (Criteria) this;
        }

        public Criteria andColumn88Like(String value) {
            addCriterion("column_88 like", value, "column88");
            return (Criteria) this;
        }

        public Criteria andColumn88NotLike(String value) {
            addCriterion("column_88 not like", value, "column88");
            return (Criteria) this;
        }

        public Criteria andColumn88In(List<String> values) {
            addCriterion("column_88 in", values, "column88");
            return (Criteria) this;
        }

        public Criteria andColumn88NotIn(List<String> values) {
            addCriterion("column_88 not in", values, "column88");
            return (Criteria) this;
        }

        public Criteria andColumn88Between(String value1, String value2) {
            addCriterion("column_88 between", value1, value2, "column88");
            return (Criteria) this;
        }

        public Criteria andColumn88NotBetween(String value1, String value2) {
            addCriterion("column_88 not between", value1, value2, "column88");
            return (Criteria) this;
        }

        public Criteria andColumn89IsNull() {
            addCriterion("column_89 is null");
            return (Criteria) this;
        }

        public Criteria andColumn89IsNotNull() {
            addCriterion("column_89 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn89EqualTo(String value) {
            addCriterion("column_89 =", value, "column89");
            return (Criteria) this;
        }

        public Criteria andColumn89NotEqualTo(String value) {
            addCriterion("column_89 <>", value, "column89");
            return (Criteria) this;
        }

        public Criteria andColumn89GreaterThan(String value) {
            addCriterion("column_89 >", value, "column89");
            return (Criteria) this;
        }

        public Criteria andColumn89GreaterThanOrEqualTo(String value) {
            addCriterion("column_89 >=", value, "column89");
            return (Criteria) this;
        }

        public Criteria andColumn89LessThan(String value) {
            addCriterion("column_89 <", value, "column89");
            return (Criteria) this;
        }

        public Criteria andColumn89LessThanOrEqualTo(String value) {
            addCriterion("column_89 <=", value, "column89");
            return (Criteria) this;
        }

        public Criteria andColumn89Like(String value) {
            addCriterion("column_89 like", value, "column89");
            return (Criteria) this;
        }

        public Criteria andColumn89NotLike(String value) {
            addCriterion("column_89 not like", value, "column89");
            return (Criteria) this;
        }

        public Criteria andColumn89In(List<String> values) {
            addCriterion("column_89 in", values, "column89");
            return (Criteria) this;
        }

        public Criteria andColumn89NotIn(List<String> values) {
            addCriterion("column_89 not in", values, "column89");
            return (Criteria) this;
        }

        public Criteria andColumn89Between(String value1, String value2) {
            addCriterion("column_89 between", value1, value2, "column89");
            return (Criteria) this;
        }

        public Criteria andColumn89NotBetween(String value1, String value2) {
            addCriterion("column_89 not between", value1, value2, "column89");
            return (Criteria) this;
        }

        public Criteria andColumn90IsNull() {
            addCriterion("column_90 is null");
            return (Criteria) this;
        }

        public Criteria andColumn90IsNotNull() {
            addCriterion("column_90 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn90EqualTo(String value) {
            addCriterion("column_90 =", value, "column90");
            return (Criteria) this;
        }

        public Criteria andColumn90NotEqualTo(String value) {
            addCriterion("column_90 <>", value, "column90");
            return (Criteria) this;
        }

        public Criteria andColumn90GreaterThan(String value) {
            addCriterion("column_90 >", value, "column90");
            return (Criteria) this;
        }

        public Criteria andColumn90GreaterThanOrEqualTo(String value) {
            addCriterion("column_90 >=", value, "column90");
            return (Criteria) this;
        }

        public Criteria andColumn90LessThan(String value) {
            addCriterion("column_90 <", value, "column90");
            return (Criteria) this;
        }

        public Criteria andColumn90LessThanOrEqualTo(String value) {
            addCriterion("column_90 <=", value, "column90");
            return (Criteria) this;
        }

        public Criteria andColumn90Like(String value) {
            addCriterion("column_90 like", value, "column90");
            return (Criteria) this;
        }

        public Criteria andColumn90NotLike(String value) {
            addCriterion("column_90 not like", value, "column90");
            return (Criteria) this;
        }

        public Criteria andColumn90In(List<String> values) {
            addCriterion("column_90 in", values, "column90");
            return (Criteria) this;
        }

        public Criteria andColumn90NotIn(List<String> values) {
            addCriterion("column_90 not in", values, "column90");
            return (Criteria) this;
        }

        public Criteria andColumn90Between(String value1, String value2) {
            addCriterion("column_90 between", value1, value2, "column90");
            return (Criteria) this;
        }

        public Criteria andColumn90NotBetween(String value1, String value2) {
            addCriterion("column_90 not between", value1, value2, "column90");
            return (Criteria) this;
        }

        public Criteria andColumn91IsNull() {
            addCriterion("column_91 is null");
            return (Criteria) this;
        }

        public Criteria andColumn91IsNotNull() {
            addCriterion("column_91 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn91EqualTo(String value) {
            addCriterion("column_91 =", value, "column91");
            return (Criteria) this;
        }

        public Criteria andColumn91NotEqualTo(String value) {
            addCriterion("column_91 <>", value, "column91");
            return (Criteria) this;
        }

        public Criteria andColumn91GreaterThan(String value) {
            addCriterion("column_91 >", value, "column91");
            return (Criteria) this;
        }

        public Criteria andColumn91GreaterThanOrEqualTo(String value) {
            addCriterion("column_91 >=", value, "column91");
            return (Criteria) this;
        }

        public Criteria andColumn91LessThan(String value) {
            addCriterion("column_91 <", value, "column91");
            return (Criteria) this;
        }

        public Criteria andColumn91LessThanOrEqualTo(String value) {
            addCriterion("column_91 <=", value, "column91");
            return (Criteria) this;
        }

        public Criteria andColumn91Like(String value) {
            addCriterion("column_91 like", value, "column91");
            return (Criteria) this;
        }

        public Criteria andColumn91NotLike(String value) {
            addCriterion("column_91 not like", value, "column91");
            return (Criteria) this;
        }

        public Criteria andColumn91In(List<String> values) {
            addCriterion("column_91 in", values, "column91");
            return (Criteria) this;
        }

        public Criteria andColumn91NotIn(List<String> values) {
            addCriterion("column_91 not in", values, "column91");
            return (Criteria) this;
        }

        public Criteria andColumn91Between(String value1, String value2) {
            addCriterion("column_91 between", value1, value2, "column91");
            return (Criteria) this;
        }

        public Criteria andColumn91NotBetween(String value1, String value2) {
            addCriterion("column_91 not between", value1, value2, "column91");
            return (Criteria) this;
        }

        public Criteria andColumn92IsNull() {
            addCriterion("column_92 is null");
            return (Criteria) this;
        }

        public Criteria andColumn92IsNotNull() {
            addCriterion("column_92 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn92EqualTo(String value) {
            addCriterion("column_92 =", value, "column92");
            return (Criteria) this;
        }

        public Criteria andColumn92NotEqualTo(String value) {
            addCriterion("column_92 <>", value, "column92");
            return (Criteria) this;
        }

        public Criteria andColumn92GreaterThan(String value) {
            addCriterion("column_92 >", value, "column92");
            return (Criteria) this;
        }

        public Criteria andColumn92GreaterThanOrEqualTo(String value) {
            addCriterion("column_92 >=", value, "column92");
            return (Criteria) this;
        }

        public Criteria andColumn92LessThan(String value) {
            addCriterion("column_92 <", value, "column92");
            return (Criteria) this;
        }

        public Criteria andColumn92LessThanOrEqualTo(String value) {
            addCriterion("column_92 <=", value, "column92");
            return (Criteria) this;
        }

        public Criteria andColumn92Like(String value) {
            addCriterion("column_92 like", value, "column92");
            return (Criteria) this;
        }

        public Criteria andColumn92NotLike(String value) {
            addCriterion("column_92 not like", value, "column92");
            return (Criteria) this;
        }

        public Criteria andColumn92In(List<String> values) {
            addCriterion("column_92 in", values, "column92");
            return (Criteria) this;
        }

        public Criteria andColumn92NotIn(List<String> values) {
            addCriterion("column_92 not in", values, "column92");
            return (Criteria) this;
        }

        public Criteria andColumn92Between(String value1, String value2) {
            addCriterion("column_92 between", value1, value2, "column92");
            return (Criteria) this;
        }

        public Criteria andColumn92NotBetween(String value1, String value2) {
            addCriterion("column_92 not between", value1, value2, "column92");
            return (Criteria) this;
        }

        public Criteria andColumn93IsNull() {
            addCriterion("column_93 is null");
            return (Criteria) this;
        }

        public Criteria andColumn93IsNotNull() {
            addCriterion("column_93 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn93EqualTo(String value) {
            addCriterion("column_93 =", value, "column93");
            return (Criteria) this;
        }

        public Criteria andColumn93NotEqualTo(String value) {
            addCriterion("column_93 <>", value, "column93");
            return (Criteria) this;
        }

        public Criteria andColumn93GreaterThan(String value) {
            addCriterion("column_93 >", value, "column93");
            return (Criteria) this;
        }

        public Criteria andColumn93GreaterThanOrEqualTo(String value) {
            addCriterion("column_93 >=", value, "column93");
            return (Criteria) this;
        }

        public Criteria andColumn93LessThan(String value) {
            addCriterion("column_93 <", value, "column93");
            return (Criteria) this;
        }

        public Criteria andColumn93LessThanOrEqualTo(String value) {
            addCriterion("column_93 <=", value, "column93");
            return (Criteria) this;
        }

        public Criteria andColumn93Like(String value) {
            addCriterion("column_93 like", value, "column93");
            return (Criteria) this;
        }

        public Criteria andColumn93NotLike(String value) {
            addCriterion("column_93 not like", value, "column93");
            return (Criteria) this;
        }

        public Criteria andColumn93In(List<String> values) {
            addCriterion("column_93 in", values, "column93");
            return (Criteria) this;
        }

        public Criteria andColumn93NotIn(List<String> values) {
            addCriterion("column_93 not in", values, "column93");
            return (Criteria) this;
        }

        public Criteria andColumn93Between(String value1, String value2) {
            addCriterion("column_93 between", value1, value2, "column93");
            return (Criteria) this;
        }

        public Criteria andColumn93NotBetween(String value1, String value2) {
            addCriterion("column_93 not between", value1, value2, "column93");
            return (Criteria) this;
        }

        public Criteria andColumn94IsNull() {
            addCriterion("column_94 is null");
            return (Criteria) this;
        }

        public Criteria andColumn94IsNotNull() {
            addCriterion("column_94 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn94EqualTo(String value) {
            addCriterion("column_94 =", value, "column94");
            return (Criteria) this;
        }

        public Criteria andColumn94NotEqualTo(String value) {
            addCriterion("column_94 <>", value, "column94");
            return (Criteria) this;
        }

        public Criteria andColumn94GreaterThan(String value) {
            addCriterion("column_94 >", value, "column94");
            return (Criteria) this;
        }

        public Criteria andColumn94GreaterThanOrEqualTo(String value) {
            addCriterion("column_94 >=", value, "column94");
            return (Criteria) this;
        }

        public Criteria andColumn94LessThan(String value) {
            addCriterion("column_94 <", value, "column94");
            return (Criteria) this;
        }

        public Criteria andColumn94LessThanOrEqualTo(String value) {
            addCriterion("column_94 <=", value, "column94");
            return (Criteria) this;
        }

        public Criteria andColumn94Like(String value) {
            addCriterion("column_94 like", value, "column94");
            return (Criteria) this;
        }

        public Criteria andColumn94NotLike(String value) {
            addCriterion("column_94 not like", value, "column94");
            return (Criteria) this;
        }

        public Criteria andColumn94In(List<String> values) {
            addCriterion("column_94 in", values, "column94");
            return (Criteria) this;
        }

        public Criteria andColumn94NotIn(List<String> values) {
            addCriterion("column_94 not in", values, "column94");
            return (Criteria) this;
        }

        public Criteria andColumn94Between(String value1, String value2) {
            addCriterion("column_94 between", value1, value2, "column94");
            return (Criteria) this;
        }

        public Criteria andColumn94NotBetween(String value1, String value2) {
            addCriterion("column_94 not between", value1, value2, "column94");
            return (Criteria) this;
        }

        public Criteria andColumn95IsNull() {
            addCriterion("column_95 is null");
            return (Criteria) this;
        }

        public Criteria andColumn95IsNotNull() {
            addCriterion("column_95 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn95EqualTo(String value) {
            addCriterion("column_95 =", value, "column95");
            return (Criteria) this;
        }

        public Criteria andColumn95NotEqualTo(String value) {
            addCriterion("column_95 <>", value, "column95");
            return (Criteria) this;
        }

        public Criteria andColumn95GreaterThan(String value) {
            addCriterion("column_95 >", value, "column95");
            return (Criteria) this;
        }

        public Criteria andColumn95GreaterThanOrEqualTo(String value) {
            addCriterion("column_95 >=", value, "column95");
            return (Criteria) this;
        }

        public Criteria andColumn95LessThan(String value) {
            addCriterion("column_95 <", value, "column95");
            return (Criteria) this;
        }

        public Criteria andColumn95LessThanOrEqualTo(String value) {
            addCriterion("column_95 <=", value, "column95");
            return (Criteria) this;
        }

        public Criteria andColumn95Like(String value) {
            addCriterion("column_95 like", value, "column95");
            return (Criteria) this;
        }

        public Criteria andColumn95NotLike(String value) {
            addCriterion("column_95 not like", value, "column95");
            return (Criteria) this;
        }

        public Criteria andColumn95In(List<String> values) {
            addCriterion("column_95 in", values, "column95");
            return (Criteria) this;
        }

        public Criteria andColumn95NotIn(List<String> values) {
            addCriterion("column_95 not in", values, "column95");
            return (Criteria) this;
        }

        public Criteria andColumn95Between(String value1, String value2) {
            addCriterion("column_95 between", value1, value2, "column95");
            return (Criteria) this;
        }

        public Criteria andColumn95NotBetween(String value1, String value2) {
            addCriterion("column_95 not between", value1, value2, "column95");
            return (Criteria) this;
        }

        public Criteria andColumn96IsNull() {
            addCriterion("column_96 is null");
            return (Criteria) this;
        }

        public Criteria andColumn96IsNotNull() {
            addCriterion("column_96 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn96EqualTo(String value) {
            addCriterion("column_96 =", value, "column96");
            return (Criteria) this;
        }

        public Criteria andColumn96NotEqualTo(String value) {
            addCriterion("column_96 <>", value, "column96");
            return (Criteria) this;
        }

        public Criteria andColumn96GreaterThan(String value) {
            addCriterion("column_96 >", value, "column96");
            return (Criteria) this;
        }

        public Criteria andColumn96GreaterThanOrEqualTo(String value) {
            addCriterion("column_96 >=", value, "column96");
            return (Criteria) this;
        }

        public Criteria andColumn96LessThan(String value) {
            addCriterion("column_96 <", value, "column96");
            return (Criteria) this;
        }

        public Criteria andColumn96LessThanOrEqualTo(String value) {
            addCriterion("column_96 <=", value, "column96");
            return (Criteria) this;
        }

        public Criteria andColumn96Like(String value) {
            addCriterion("column_96 like", value, "column96");
            return (Criteria) this;
        }

        public Criteria andColumn96NotLike(String value) {
            addCriterion("column_96 not like", value, "column96");
            return (Criteria) this;
        }

        public Criteria andColumn96In(List<String> values) {
            addCriterion("column_96 in", values, "column96");
            return (Criteria) this;
        }

        public Criteria andColumn96NotIn(List<String> values) {
            addCriterion("column_96 not in", values, "column96");
            return (Criteria) this;
        }

        public Criteria andColumn96Between(String value1, String value2) {
            addCriterion("column_96 between", value1, value2, "column96");
            return (Criteria) this;
        }

        public Criteria andColumn96NotBetween(String value1, String value2) {
            addCriterion("column_96 not between", value1, value2, "column96");
            return (Criteria) this;
        }

        public Criteria andColumn97IsNull() {
            addCriterion("column_97 is null");
            return (Criteria) this;
        }

        public Criteria andColumn97IsNotNull() {
            addCriterion("column_97 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn97EqualTo(String value) {
            addCriterion("column_97 =", value, "column97");
            return (Criteria) this;
        }

        public Criteria andColumn97NotEqualTo(String value) {
            addCriterion("column_97 <>", value, "column97");
            return (Criteria) this;
        }

        public Criteria andColumn97GreaterThan(String value) {
            addCriterion("column_97 >", value, "column97");
            return (Criteria) this;
        }

        public Criteria andColumn97GreaterThanOrEqualTo(String value) {
            addCriterion("column_97 >=", value, "column97");
            return (Criteria) this;
        }

        public Criteria andColumn97LessThan(String value) {
            addCriterion("column_97 <", value, "column97");
            return (Criteria) this;
        }

        public Criteria andColumn97LessThanOrEqualTo(String value) {
            addCriterion("column_97 <=", value, "column97");
            return (Criteria) this;
        }

        public Criteria andColumn97Like(String value) {
            addCriterion("column_97 like", value, "column97");
            return (Criteria) this;
        }

        public Criteria andColumn97NotLike(String value) {
            addCriterion("column_97 not like", value, "column97");
            return (Criteria) this;
        }

        public Criteria andColumn97In(List<String> values) {
            addCriterion("column_97 in", values, "column97");
            return (Criteria) this;
        }

        public Criteria andColumn97NotIn(List<String> values) {
            addCriterion("column_97 not in", values, "column97");
            return (Criteria) this;
        }

        public Criteria andColumn97Between(String value1, String value2) {
            addCriterion("column_97 between", value1, value2, "column97");
            return (Criteria) this;
        }

        public Criteria andColumn97NotBetween(String value1, String value2) {
            addCriterion("column_97 not between", value1, value2, "column97");
            return (Criteria) this;
        }

        public Criteria andColumn98IsNull() {
            addCriterion("column_98 is null");
            return (Criteria) this;
        }

        public Criteria andColumn98IsNotNull() {
            addCriterion("column_98 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn98EqualTo(String value) {
            addCriterion("column_98 =", value, "column98");
            return (Criteria) this;
        }

        public Criteria andColumn98NotEqualTo(String value) {
            addCriterion("column_98 <>", value, "column98");
            return (Criteria) this;
        }

        public Criteria andColumn98GreaterThan(String value) {
            addCriterion("column_98 >", value, "column98");
            return (Criteria) this;
        }

        public Criteria andColumn98GreaterThanOrEqualTo(String value) {
            addCriterion("column_98 >=", value, "column98");
            return (Criteria) this;
        }

        public Criteria andColumn98LessThan(String value) {
            addCriterion("column_98 <", value, "column98");
            return (Criteria) this;
        }

        public Criteria andColumn98LessThanOrEqualTo(String value) {
            addCriterion("column_98 <=", value, "column98");
            return (Criteria) this;
        }

        public Criteria andColumn98Like(String value) {
            addCriterion("column_98 like", value, "column98");
            return (Criteria) this;
        }

        public Criteria andColumn98NotLike(String value) {
            addCriterion("column_98 not like", value, "column98");
            return (Criteria) this;
        }

        public Criteria andColumn98In(List<String> values) {
            addCriterion("column_98 in", values, "column98");
            return (Criteria) this;
        }

        public Criteria andColumn98NotIn(List<String> values) {
            addCriterion("column_98 not in", values, "column98");
            return (Criteria) this;
        }

        public Criteria andColumn98Between(String value1, String value2) {
            addCriterion("column_98 between", value1, value2, "column98");
            return (Criteria) this;
        }

        public Criteria andColumn98NotBetween(String value1, String value2) {
            addCriterion("column_98 not between", value1, value2, "column98");
            return (Criteria) this;
        }

        public Criteria andColumn99IsNull() {
            addCriterion("column_99 is null");
            return (Criteria) this;
        }

        public Criteria andColumn99IsNotNull() {
            addCriterion("column_99 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn99EqualTo(String value) {
            addCriterion("column_99 =", value, "column99");
            return (Criteria) this;
        }

        public Criteria andColumn99NotEqualTo(String value) {
            addCriterion("column_99 <>", value, "column99");
            return (Criteria) this;
        }

        public Criteria andColumn99GreaterThan(String value) {
            addCriterion("column_99 >", value, "column99");
            return (Criteria) this;
        }

        public Criteria andColumn99GreaterThanOrEqualTo(String value) {
            addCriterion("column_99 >=", value, "column99");
            return (Criteria) this;
        }

        public Criteria andColumn99LessThan(String value) {
            addCriterion("column_99 <", value, "column99");
            return (Criteria) this;
        }

        public Criteria andColumn99LessThanOrEqualTo(String value) {
            addCriterion("column_99 <=", value, "column99");
            return (Criteria) this;
        }

        public Criteria andColumn99Like(String value) {
            addCriterion("column_99 like", value, "column99");
            return (Criteria) this;
        }

        public Criteria andColumn99NotLike(String value) {
            addCriterion("column_99 not like", value, "column99");
            return (Criteria) this;
        }

        public Criteria andColumn99In(List<String> values) {
            addCriterion("column_99 in", values, "column99");
            return (Criteria) this;
        }

        public Criteria andColumn99NotIn(List<String> values) {
            addCriterion("column_99 not in", values, "column99");
            return (Criteria) this;
        }

        public Criteria andColumn99Between(String value1, String value2) {
            addCriterion("column_99 between", value1, value2, "column99");
            return (Criteria) this;
        }

        public Criteria andColumn99NotBetween(String value1, String value2) {
            addCriterion("column_99 not between", value1, value2, "column99");
            return (Criteria) this;
        }

        public Criteria andColumn100IsNull() {
            addCriterion("column_100 is null");
            return (Criteria) this;
        }

        public Criteria andColumn100IsNotNull() {
            addCriterion("column_100 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn100EqualTo(String value) {
            addCriterion("column_100 =", value, "column100");
            return (Criteria) this;
        }

        public Criteria andColumn100NotEqualTo(String value) {
            addCriterion("column_100 <>", value, "column100");
            return (Criteria) this;
        }

        public Criteria andColumn100GreaterThan(String value) {
            addCriterion("column_100 >", value, "column100");
            return (Criteria) this;
        }

        public Criteria andColumn100GreaterThanOrEqualTo(String value) {
            addCriterion("column_100 >=", value, "column100");
            return (Criteria) this;
        }

        public Criteria andColumn100LessThan(String value) {
            addCriterion("column_100 <", value, "column100");
            return (Criteria) this;
        }

        public Criteria andColumn100LessThanOrEqualTo(String value) {
            addCriterion("column_100 <=", value, "column100");
            return (Criteria) this;
        }

        public Criteria andColumn100Like(String value) {
            addCriterion("column_100 like", value, "column100");
            return (Criteria) this;
        }

        public Criteria andColumn100NotLike(String value) {
            addCriterion("column_100 not like", value, "column100");
            return (Criteria) this;
        }

        public Criteria andColumn100In(List<String> values) {
            addCriterion("column_100 in", values, "column100");
            return (Criteria) this;
        }

        public Criteria andColumn100NotIn(List<String> values) {
            addCriterion("column_100 not in", values, "column100");
            return (Criteria) this;
        }

        public Criteria andColumn100Between(String value1, String value2) {
            addCriterion("column_100 between", value1, value2, "column100");
            return (Criteria) this;
        }

        public Criteria andColumn100NotBetween(String value1, String value2) {
            addCriterion("column_100 not between", value1, value2, "column100");
            return (Criteria) this;
        }

        public Criteria andColumn101IsNull() {
            addCriterion("column_101 is null");
            return (Criteria) this;
        }

        public Criteria andColumn101IsNotNull() {
            addCriterion("column_101 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn101EqualTo(String value) {
            addCriterion("column_101 =", value, "column101");
            return (Criteria) this;
        }

        public Criteria andColumn101NotEqualTo(String value) {
            addCriterion("column_101 <>", value, "column101");
            return (Criteria) this;
        }

        public Criteria andColumn101GreaterThan(String value) {
            addCriterion("column_101 >", value, "column101");
            return (Criteria) this;
        }

        public Criteria andColumn101GreaterThanOrEqualTo(String value) {
            addCriterion("column_101 >=", value, "column101");
            return (Criteria) this;
        }

        public Criteria andColumn101LessThan(String value) {
            addCriterion("column_101 <", value, "column101");
            return (Criteria) this;
        }

        public Criteria andColumn101LessThanOrEqualTo(String value) {
            addCriterion("column_101 <=", value, "column101");
            return (Criteria) this;
        }

        public Criteria andColumn101Like(String value) {
            addCriterion("column_101 like", value, "column101");
            return (Criteria) this;
        }

        public Criteria andColumn101NotLike(String value) {
            addCriterion("column_101 not like", value, "column101");
            return (Criteria) this;
        }

        public Criteria andColumn101In(List<String> values) {
            addCriterion("column_101 in", values, "column101");
            return (Criteria) this;
        }

        public Criteria andColumn101NotIn(List<String> values) {
            addCriterion("column_101 not in", values, "column101");
            return (Criteria) this;
        }

        public Criteria andColumn101Between(String value1, String value2) {
            addCriterion("column_101 between", value1, value2, "column101");
            return (Criteria) this;
        }

        public Criteria andColumn101NotBetween(String value1, String value2) {
            addCriterion("column_101 not between", value1, value2, "column101");
            return (Criteria) this;
        }

        public Criteria andColumn102IsNull() {
            addCriterion("column_102 is null");
            return (Criteria) this;
        }

        public Criteria andColumn102IsNotNull() {
            addCriterion("column_102 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn102EqualTo(String value) {
            addCriterion("column_102 =", value, "column102");
            return (Criteria) this;
        }

        public Criteria andColumn102NotEqualTo(String value) {
            addCriterion("column_102 <>", value, "column102");
            return (Criteria) this;
        }

        public Criteria andColumn102GreaterThan(String value) {
            addCriterion("column_102 >", value, "column102");
            return (Criteria) this;
        }

        public Criteria andColumn102GreaterThanOrEqualTo(String value) {
            addCriterion("column_102 >=", value, "column102");
            return (Criteria) this;
        }

        public Criteria andColumn102LessThan(String value) {
            addCriterion("column_102 <", value, "column102");
            return (Criteria) this;
        }

        public Criteria andColumn102LessThanOrEqualTo(String value) {
            addCriterion("column_102 <=", value, "column102");
            return (Criteria) this;
        }

        public Criteria andColumn102Like(String value) {
            addCriterion("column_102 like", value, "column102");
            return (Criteria) this;
        }

        public Criteria andColumn102NotLike(String value) {
            addCriterion("column_102 not like", value, "column102");
            return (Criteria) this;
        }

        public Criteria andColumn102In(List<String> values) {
            addCriterion("column_102 in", values, "column102");
            return (Criteria) this;
        }

        public Criteria andColumn102NotIn(List<String> values) {
            addCriterion("column_102 not in", values, "column102");
            return (Criteria) this;
        }

        public Criteria andColumn102Between(String value1, String value2) {
            addCriterion("column_102 between", value1, value2, "column102");
            return (Criteria) this;
        }

        public Criteria andColumn102NotBetween(String value1, String value2) {
            addCriterion("column_102 not between", value1, value2, "column102");
            return (Criteria) this;
        }

        public Criteria andColumn103IsNull() {
            addCriterion("column_103 is null");
            return (Criteria) this;
        }

        public Criteria andColumn103IsNotNull() {
            addCriterion("column_103 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn103EqualTo(String value) {
            addCriterion("column_103 =", value, "column103");
            return (Criteria) this;
        }

        public Criteria andColumn103NotEqualTo(String value) {
            addCriterion("column_103 <>", value, "column103");
            return (Criteria) this;
        }

        public Criteria andColumn103GreaterThan(String value) {
            addCriterion("column_103 >", value, "column103");
            return (Criteria) this;
        }

        public Criteria andColumn103GreaterThanOrEqualTo(String value) {
            addCriterion("column_103 >=", value, "column103");
            return (Criteria) this;
        }

        public Criteria andColumn103LessThan(String value) {
            addCriterion("column_103 <", value, "column103");
            return (Criteria) this;
        }

        public Criteria andColumn103LessThanOrEqualTo(String value) {
            addCriterion("column_103 <=", value, "column103");
            return (Criteria) this;
        }

        public Criteria andColumn103Like(String value) {
            addCriterion("column_103 like", value, "column103");
            return (Criteria) this;
        }

        public Criteria andColumn103NotLike(String value) {
            addCriterion("column_103 not like", value, "column103");
            return (Criteria) this;
        }

        public Criteria andColumn103In(List<String> values) {
            addCriterion("column_103 in", values, "column103");
            return (Criteria) this;
        }

        public Criteria andColumn103NotIn(List<String> values) {
            addCriterion("column_103 not in", values, "column103");
            return (Criteria) this;
        }

        public Criteria andColumn103Between(String value1, String value2) {
            addCriterion("column_103 between", value1, value2, "column103");
            return (Criteria) this;
        }

        public Criteria andColumn103NotBetween(String value1, String value2) {
            addCriterion("column_103 not between", value1, value2, "column103");
            return (Criteria) this;
        }

        public Criteria andColumn104IsNull() {
            addCriterion("column_104 is null");
            return (Criteria) this;
        }

        public Criteria andColumn104IsNotNull() {
            addCriterion("column_104 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn104EqualTo(String value) {
            addCriterion("column_104 =", value, "column104");
            return (Criteria) this;
        }

        public Criteria andColumn104NotEqualTo(String value) {
            addCriterion("column_104 <>", value, "column104");
            return (Criteria) this;
        }

        public Criteria andColumn104GreaterThan(String value) {
            addCriterion("column_104 >", value, "column104");
            return (Criteria) this;
        }

        public Criteria andColumn104GreaterThanOrEqualTo(String value) {
            addCriterion("column_104 >=", value, "column104");
            return (Criteria) this;
        }

        public Criteria andColumn104LessThan(String value) {
            addCriterion("column_104 <", value, "column104");
            return (Criteria) this;
        }

        public Criteria andColumn104LessThanOrEqualTo(String value) {
            addCriterion("column_104 <=", value, "column104");
            return (Criteria) this;
        }

        public Criteria andColumn104Like(String value) {
            addCriterion("column_104 like", value, "column104");
            return (Criteria) this;
        }

        public Criteria andColumn104NotLike(String value) {
            addCriterion("column_104 not like", value, "column104");
            return (Criteria) this;
        }

        public Criteria andColumn104In(List<String> values) {
            addCriterion("column_104 in", values, "column104");
            return (Criteria) this;
        }

        public Criteria andColumn104NotIn(List<String> values) {
            addCriterion("column_104 not in", values, "column104");
            return (Criteria) this;
        }

        public Criteria andColumn104Between(String value1, String value2) {
            addCriterion("column_104 between", value1, value2, "column104");
            return (Criteria) this;
        }

        public Criteria andColumn104NotBetween(String value1, String value2) {
            addCriterion("column_104 not between", value1, value2, "column104");
            return (Criteria) this;
        }

        public Criteria andColumn105IsNull() {
            addCriterion("column_105 is null");
            return (Criteria) this;
        }

        public Criteria andColumn105IsNotNull() {
            addCriterion("column_105 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn105EqualTo(String value) {
            addCriterion("column_105 =", value, "column105");
            return (Criteria) this;
        }

        public Criteria andColumn105NotEqualTo(String value) {
            addCriterion("column_105 <>", value, "column105");
            return (Criteria) this;
        }

        public Criteria andColumn105GreaterThan(String value) {
            addCriterion("column_105 >", value, "column105");
            return (Criteria) this;
        }

        public Criteria andColumn105GreaterThanOrEqualTo(String value) {
            addCriterion("column_105 >=", value, "column105");
            return (Criteria) this;
        }

        public Criteria andColumn105LessThan(String value) {
            addCriterion("column_105 <", value, "column105");
            return (Criteria) this;
        }

        public Criteria andColumn105LessThanOrEqualTo(String value) {
            addCriterion("column_105 <=", value, "column105");
            return (Criteria) this;
        }

        public Criteria andColumn105Like(String value) {
            addCriterion("column_105 like", value, "column105");
            return (Criteria) this;
        }

        public Criteria andColumn105NotLike(String value) {
            addCriterion("column_105 not like", value, "column105");
            return (Criteria) this;
        }

        public Criteria andColumn105In(List<String> values) {
            addCriterion("column_105 in", values, "column105");
            return (Criteria) this;
        }

        public Criteria andColumn105NotIn(List<String> values) {
            addCriterion("column_105 not in", values, "column105");
            return (Criteria) this;
        }

        public Criteria andColumn105Between(String value1, String value2) {
            addCriterion("column_105 between", value1, value2, "column105");
            return (Criteria) this;
        }

        public Criteria andColumn105NotBetween(String value1, String value2) {
            addCriterion("column_105 not between", value1, value2, "column105");
            return (Criteria) this;
        }

        public Criteria andColumn106IsNull() {
            addCriterion("column_106 is null");
            return (Criteria) this;
        }

        public Criteria andColumn106IsNotNull() {
            addCriterion("column_106 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn106EqualTo(String value) {
            addCriterion("column_106 =", value, "column106");
            return (Criteria) this;
        }

        public Criteria andColumn106NotEqualTo(String value) {
            addCriterion("column_106 <>", value, "column106");
            return (Criteria) this;
        }

        public Criteria andColumn106GreaterThan(String value) {
            addCriterion("column_106 >", value, "column106");
            return (Criteria) this;
        }

        public Criteria andColumn106GreaterThanOrEqualTo(String value) {
            addCriterion("column_106 >=", value, "column106");
            return (Criteria) this;
        }

        public Criteria andColumn106LessThan(String value) {
            addCriterion("column_106 <", value, "column106");
            return (Criteria) this;
        }

        public Criteria andColumn106LessThanOrEqualTo(String value) {
            addCriterion("column_106 <=", value, "column106");
            return (Criteria) this;
        }

        public Criteria andColumn106Like(String value) {
            addCriterion("column_106 like", value, "column106");
            return (Criteria) this;
        }

        public Criteria andColumn106NotLike(String value) {
            addCriterion("column_106 not like", value, "column106");
            return (Criteria) this;
        }

        public Criteria andColumn106In(List<String> values) {
            addCriterion("column_106 in", values, "column106");
            return (Criteria) this;
        }

        public Criteria andColumn106NotIn(List<String> values) {
            addCriterion("column_106 not in", values, "column106");
            return (Criteria) this;
        }

        public Criteria andColumn106Between(String value1, String value2) {
            addCriterion("column_106 between", value1, value2, "column106");
            return (Criteria) this;
        }

        public Criteria andColumn106NotBetween(String value1, String value2) {
            addCriterion("column_106 not between", value1, value2, "column106");
            return (Criteria) this;
        }

        public Criteria andColumn107IsNull() {
            addCriterion("column_107 is null");
            return (Criteria) this;
        }

        public Criteria andColumn107IsNotNull() {
            addCriterion("column_107 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn107EqualTo(String value) {
            addCriterion("column_107 =", value, "column107");
            return (Criteria) this;
        }

        public Criteria andColumn107NotEqualTo(String value) {
            addCriterion("column_107 <>", value, "column107");
            return (Criteria) this;
        }

        public Criteria andColumn107GreaterThan(String value) {
            addCriterion("column_107 >", value, "column107");
            return (Criteria) this;
        }

        public Criteria andColumn107GreaterThanOrEqualTo(String value) {
            addCriterion("column_107 >=", value, "column107");
            return (Criteria) this;
        }

        public Criteria andColumn107LessThan(String value) {
            addCriterion("column_107 <", value, "column107");
            return (Criteria) this;
        }

        public Criteria andColumn107LessThanOrEqualTo(String value) {
            addCriterion("column_107 <=", value, "column107");
            return (Criteria) this;
        }

        public Criteria andColumn107Like(String value) {
            addCriterion("column_107 like", value, "column107");
            return (Criteria) this;
        }

        public Criteria andColumn107NotLike(String value) {
            addCriterion("column_107 not like", value, "column107");
            return (Criteria) this;
        }

        public Criteria andColumn107In(List<String> values) {
            addCriterion("column_107 in", values, "column107");
            return (Criteria) this;
        }

        public Criteria andColumn107NotIn(List<String> values) {
            addCriterion("column_107 not in", values, "column107");
            return (Criteria) this;
        }

        public Criteria andColumn107Between(String value1, String value2) {
            addCriterion("column_107 between", value1, value2, "column107");
            return (Criteria) this;
        }

        public Criteria andColumn107NotBetween(String value1, String value2) {
            addCriterion("column_107 not between", value1, value2, "column107");
            return (Criteria) this;
        }

        public Criteria andColumn108IsNull() {
            addCriterion("column_108 is null");
            return (Criteria) this;
        }

        public Criteria andColumn108IsNotNull() {
            addCriterion("column_108 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn108EqualTo(String value) {
            addCriterion("column_108 =", value, "column108");
            return (Criteria) this;
        }

        public Criteria andColumn108NotEqualTo(String value) {
            addCriterion("column_108 <>", value, "column108");
            return (Criteria) this;
        }

        public Criteria andColumn108GreaterThan(String value) {
            addCriterion("column_108 >", value, "column108");
            return (Criteria) this;
        }

        public Criteria andColumn108GreaterThanOrEqualTo(String value) {
            addCriterion("column_108 >=", value, "column108");
            return (Criteria) this;
        }

        public Criteria andColumn108LessThan(String value) {
            addCriterion("column_108 <", value, "column108");
            return (Criteria) this;
        }

        public Criteria andColumn108LessThanOrEqualTo(String value) {
            addCriterion("column_108 <=", value, "column108");
            return (Criteria) this;
        }

        public Criteria andColumn108Like(String value) {
            addCriterion("column_108 like", value, "column108");
            return (Criteria) this;
        }

        public Criteria andColumn108NotLike(String value) {
            addCriterion("column_108 not like", value, "column108");
            return (Criteria) this;
        }

        public Criteria andColumn108In(List<String> values) {
            addCriterion("column_108 in", values, "column108");
            return (Criteria) this;
        }

        public Criteria andColumn108NotIn(List<String> values) {
            addCriterion("column_108 not in", values, "column108");
            return (Criteria) this;
        }

        public Criteria andColumn108Between(String value1, String value2) {
            addCriterion("column_108 between", value1, value2, "column108");
            return (Criteria) this;
        }

        public Criteria andColumn108NotBetween(String value1, String value2) {
            addCriterion("column_108 not between", value1, value2, "column108");
            return (Criteria) this;
        }

        public Criteria andColumn109IsNull() {
            addCriterion("column_109 is null");
            return (Criteria) this;
        }

        public Criteria andColumn109IsNotNull() {
            addCriterion("column_109 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn109EqualTo(String value) {
            addCriterion("column_109 =", value, "column109");
            return (Criteria) this;
        }

        public Criteria andColumn109NotEqualTo(String value) {
            addCriterion("column_109 <>", value, "column109");
            return (Criteria) this;
        }

        public Criteria andColumn109GreaterThan(String value) {
            addCriterion("column_109 >", value, "column109");
            return (Criteria) this;
        }

        public Criteria andColumn109GreaterThanOrEqualTo(String value) {
            addCriterion("column_109 >=", value, "column109");
            return (Criteria) this;
        }

        public Criteria andColumn109LessThan(String value) {
            addCriterion("column_109 <", value, "column109");
            return (Criteria) this;
        }

        public Criteria andColumn109LessThanOrEqualTo(String value) {
            addCriterion("column_109 <=", value, "column109");
            return (Criteria) this;
        }

        public Criteria andColumn109Like(String value) {
            addCriterion("column_109 like", value, "column109");
            return (Criteria) this;
        }

        public Criteria andColumn109NotLike(String value) {
            addCriterion("column_109 not like", value, "column109");
            return (Criteria) this;
        }

        public Criteria andColumn109In(List<String> values) {
            addCriterion("column_109 in", values, "column109");
            return (Criteria) this;
        }

        public Criteria andColumn109NotIn(List<String> values) {
            addCriterion("column_109 not in", values, "column109");
            return (Criteria) this;
        }

        public Criteria andColumn109Between(String value1, String value2) {
            addCriterion("column_109 between", value1, value2, "column109");
            return (Criteria) this;
        }

        public Criteria andColumn109NotBetween(String value1, String value2) {
            addCriterion("column_109 not between", value1, value2, "column109");
            return (Criteria) this;
        }

        public Criteria andColumn110IsNull() {
            addCriterion("column_110 is null");
            return (Criteria) this;
        }

        public Criteria andColumn110IsNotNull() {
            addCriterion("column_110 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn110EqualTo(String value) {
            addCriterion("column_110 =", value, "column110");
            return (Criteria) this;
        }

        public Criteria andColumn110NotEqualTo(String value) {
            addCriterion("column_110 <>", value, "column110");
            return (Criteria) this;
        }

        public Criteria andColumn110GreaterThan(String value) {
            addCriterion("column_110 >", value, "column110");
            return (Criteria) this;
        }

        public Criteria andColumn110GreaterThanOrEqualTo(String value) {
            addCriterion("column_110 >=", value, "column110");
            return (Criteria) this;
        }

        public Criteria andColumn110LessThan(String value) {
            addCriterion("column_110 <", value, "column110");
            return (Criteria) this;
        }

        public Criteria andColumn110LessThanOrEqualTo(String value) {
            addCriterion("column_110 <=", value, "column110");
            return (Criteria) this;
        }

        public Criteria andColumn110Like(String value) {
            addCriterion("column_110 like", value, "column110");
            return (Criteria) this;
        }

        public Criteria andColumn110NotLike(String value) {
            addCriterion("column_110 not like", value, "column110");
            return (Criteria) this;
        }

        public Criteria andColumn110In(List<String> values) {
            addCriterion("column_110 in", values, "column110");
            return (Criteria) this;
        }

        public Criteria andColumn110NotIn(List<String> values) {
            addCriterion("column_110 not in", values, "column110");
            return (Criteria) this;
        }

        public Criteria andColumn110Between(String value1, String value2) {
            addCriterion("column_110 between", value1, value2, "column110");
            return (Criteria) this;
        }

        public Criteria andColumn110NotBetween(String value1, String value2) {
            addCriterion("column_110 not between", value1, value2, "column110");
            return (Criteria) this;
        }

        public Criteria andColumn111IsNull() {
            addCriterion("column_111 is null");
            return (Criteria) this;
        }

        public Criteria andColumn111IsNotNull() {
            addCriterion("column_111 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn111EqualTo(String value) {
            addCriterion("column_111 =", value, "column111");
            return (Criteria) this;
        }

        public Criteria andColumn111NotEqualTo(String value) {
            addCriterion("column_111 <>", value, "column111");
            return (Criteria) this;
        }

        public Criteria andColumn111GreaterThan(String value) {
            addCriterion("column_111 >", value, "column111");
            return (Criteria) this;
        }

        public Criteria andColumn111GreaterThanOrEqualTo(String value) {
            addCriterion("column_111 >=", value, "column111");
            return (Criteria) this;
        }

        public Criteria andColumn111LessThan(String value) {
            addCriterion("column_111 <", value, "column111");
            return (Criteria) this;
        }

        public Criteria andColumn111LessThanOrEqualTo(String value) {
            addCriterion("column_111 <=", value, "column111");
            return (Criteria) this;
        }

        public Criteria andColumn111Like(String value) {
            addCriterion("column_111 like", value, "column111");
            return (Criteria) this;
        }

        public Criteria andColumn111NotLike(String value) {
            addCriterion("column_111 not like", value, "column111");
            return (Criteria) this;
        }

        public Criteria andColumn111In(List<String> values) {
            addCriterion("column_111 in", values, "column111");
            return (Criteria) this;
        }

        public Criteria andColumn111NotIn(List<String> values) {
            addCriterion("column_111 not in", values, "column111");
            return (Criteria) this;
        }

        public Criteria andColumn111Between(String value1, String value2) {
            addCriterion("column_111 between", value1, value2, "column111");
            return (Criteria) this;
        }

        public Criteria andColumn111NotBetween(String value1, String value2) {
            addCriterion("column_111 not between", value1, value2, "column111");
            return (Criteria) this;
        }

        public Criteria andColumn112IsNull() {
            addCriterion("column_112 is null");
            return (Criteria) this;
        }

        public Criteria andColumn112IsNotNull() {
            addCriterion("column_112 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn112EqualTo(String value) {
            addCriterion("column_112 =", value, "column112");
            return (Criteria) this;
        }

        public Criteria andColumn112NotEqualTo(String value) {
            addCriterion("column_112 <>", value, "column112");
            return (Criteria) this;
        }

        public Criteria andColumn112GreaterThan(String value) {
            addCriterion("column_112 >", value, "column112");
            return (Criteria) this;
        }

        public Criteria andColumn112GreaterThanOrEqualTo(String value) {
            addCriterion("column_112 >=", value, "column112");
            return (Criteria) this;
        }

        public Criteria andColumn112LessThan(String value) {
            addCriterion("column_112 <", value, "column112");
            return (Criteria) this;
        }

        public Criteria andColumn112LessThanOrEqualTo(String value) {
            addCriterion("column_112 <=", value, "column112");
            return (Criteria) this;
        }

        public Criteria andColumn112Like(String value) {
            addCriterion("column_112 like", value, "column112");
            return (Criteria) this;
        }

        public Criteria andColumn112NotLike(String value) {
            addCriterion("column_112 not like", value, "column112");
            return (Criteria) this;
        }

        public Criteria andColumn112In(List<String> values) {
            addCriterion("column_112 in", values, "column112");
            return (Criteria) this;
        }

        public Criteria andColumn112NotIn(List<String> values) {
            addCriterion("column_112 not in", values, "column112");
            return (Criteria) this;
        }

        public Criteria andColumn112Between(String value1, String value2) {
            addCriterion("column_112 between", value1, value2, "column112");
            return (Criteria) this;
        }

        public Criteria andColumn112NotBetween(String value1, String value2) {
            addCriterion("column_112 not between", value1, value2, "column112");
            return (Criteria) this;
        }

        public Criteria andColumn113IsNull() {
            addCriterion("column_113 is null");
            return (Criteria) this;
        }

        public Criteria andColumn113IsNotNull() {
            addCriterion("column_113 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn113EqualTo(String value) {
            addCriterion("column_113 =", value, "column113");
            return (Criteria) this;
        }

        public Criteria andColumn113NotEqualTo(String value) {
            addCriterion("column_113 <>", value, "column113");
            return (Criteria) this;
        }

        public Criteria andColumn113GreaterThan(String value) {
            addCriterion("column_113 >", value, "column113");
            return (Criteria) this;
        }

        public Criteria andColumn113GreaterThanOrEqualTo(String value) {
            addCriterion("column_113 >=", value, "column113");
            return (Criteria) this;
        }

        public Criteria andColumn113LessThan(String value) {
            addCriterion("column_113 <", value, "column113");
            return (Criteria) this;
        }

        public Criteria andColumn113LessThanOrEqualTo(String value) {
            addCriterion("column_113 <=", value, "column113");
            return (Criteria) this;
        }

        public Criteria andColumn113Like(String value) {
            addCriterion("column_113 like", value, "column113");
            return (Criteria) this;
        }

        public Criteria andColumn113NotLike(String value) {
            addCriterion("column_113 not like", value, "column113");
            return (Criteria) this;
        }

        public Criteria andColumn113In(List<String> values) {
            addCriterion("column_113 in", values, "column113");
            return (Criteria) this;
        }

        public Criteria andColumn113NotIn(List<String> values) {
            addCriterion("column_113 not in", values, "column113");
            return (Criteria) this;
        }

        public Criteria andColumn113Between(String value1, String value2) {
            addCriterion("column_113 between", value1, value2, "column113");
            return (Criteria) this;
        }

        public Criteria andColumn113NotBetween(String value1, String value2) {
            addCriterion("column_113 not between", value1, value2, "column113");
            return (Criteria) this;
        }

        public Criteria andColumn114IsNull() {
            addCriterion("column_114 is null");
            return (Criteria) this;
        }

        public Criteria andColumn114IsNotNull() {
            addCriterion("column_114 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn114EqualTo(String value) {
            addCriterion("column_114 =", value, "column114");
            return (Criteria) this;
        }

        public Criteria andColumn114NotEqualTo(String value) {
            addCriterion("column_114 <>", value, "column114");
            return (Criteria) this;
        }

        public Criteria andColumn114GreaterThan(String value) {
            addCriterion("column_114 >", value, "column114");
            return (Criteria) this;
        }

        public Criteria andColumn114GreaterThanOrEqualTo(String value) {
            addCriterion("column_114 >=", value, "column114");
            return (Criteria) this;
        }

        public Criteria andColumn114LessThan(String value) {
            addCriterion("column_114 <", value, "column114");
            return (Criteria) this;
        }

        public Criteria andColumn114LessThanOrEqualTo(String value) {
            addCriterion("column_114 <=", value, "column114");
            return (Criteria) this;
        }

        public Criteria andColumn114Like(String value) {
            addCriterion("column_114 like", value, "column114");
            return (Criteria) this;
        }

        public Criteria andColumn114NotLike(String value) {
            addCriterion("column_114 not like", value, "column114");
            return (Criteria) this;
        }

        public Criteria andColumn114In(List<String> values) {
            addCriterion("column_114 in", values, "column114");
            return (Criteria) this;
        }

        public Criteria andColumn114NotIn(List<String> values) {
            addCriterion("column_114 not in", values, "column114");
            return (Criteria) this;
        }

        public Criteria andColumn114Between(String value1, String value2) {
            addCriterion("column_114 between", value1, value2, "column114");
            return (Criteria) this;
        }

        public Criteria andColumn114NotBetween(String value1, String value2) {
            addCriterion("column_114 not between", value1, value2, "column114");
            return (Criteria) this;
        }

        public Criteria andColumn115IsNull() {
            addCriterion("column_115 is null");
            return (Criteria) this;
        }

        public Criteria andColumn115IsNotNull() {
            addCriterion("column_115 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn115EqualTo(String value) {
            addCriterion("column_115 =", value, "column115");
            return (Criteria) this;
        }

        public Criteria andColumn115NotEqualTo(String value) {
            addCriterion("column_115 <>", value, "column115");
            return (Criteria) this;
        }

        public Criteria andColumn115GreaterThan(String value) {
            addCriterion("column_115 >", value, "column115");
            return (Criteria) this;
        }

        public Criteria andColumn115GreaterThanOrEqualTo(String value) {
            addCriterion("column_115 >=", value, "column115");
            return (Criteria) this;
        }

        public Criteria andColumn115LessThan(String value) {
            addCriterion("column_115 <", value, "column115");
            return (Criteria) this;
        }

        public Criteria andColumn115LessThanOrEqualTo(String value) {
            addCriterion("column_115 <=", value, "column115");
            return (Criteria) this;
        }

        public Criteria andColumn115Like(String value) {
            addCriterion("column_115 like", value, "column115");
            return (Criteria) this;
        }

        public Criteria andColumn115NotLike(String value) {
            addCriterion("column_115 not like", value, "column115");
            return (Criteria) this;
        }

        public Criteria andColumn115In(List<String> values) {
            addCriterion("column_115 in", values, "column115");
            return (Criteria) this;
        }

        public Criteria andColumn115NotIn(List<String> values) {
            addCriterion("column_115 not in", values, "column115");
            return (Criteria) this;
        }

        public Criteria andColumn115Between(String value1, String value2) {
            addCriterion("column_115 between", value1, value2, "column115");
            return (Criteria) this;
        }

        public Criteria andColumn115NotBetween(String value1, String value2) {
            addCriterion("column_115 not between", value1, value2, "column115");
            return (Criteria) this;
        }

        public Criteria andColumn116IsNull() {
            addCriterion("column_116 is null");
            return (Criteria) this;
        }

        public Criteria andColumn116IsNotNull() {
            addCriterion("column_116 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn116EqualTo(String value) {
            addCriterion("column_116 =", value, "column116");
            return (Criteria) this;
        }

        public Criteria andColumn116NotEqualTo(String value) {
            addCriterion("column_116 <>", value, "column116");
            return (Criteria) this;
        }

        public Criteria andColumn116GreaterThan(String value) {
            addCriterion("column_116 >", value, "column116");
            return (Criteria) this;
        }

        public Criteria andColumn116GreaterThanOrEqualTo(String value) {
            addCriterion("column_116 >=", value, "column116");
            return (Criteria) this;
        }

        public Criteria andColumn116LessThan(String value) {
            addCriterion("column_116 <", value, "column116");
            return (Criteria) this;
        }

        public Criteria andColumn116LessThanOrEqualTo(String value) {
            addCriterion("column_116 <=", value, "column116");
            return (Criteria) this;
        }

        public Criteria andColumn116Like(String value) {
            addCriterion("column_116 like", value, "column116");
            return (Criteria) this;
        }

        public Criteria andColumn116NotLike(String value) {
            addCriterion("column_116 not like", value, "column116");
            return (Criteria) this;
        }

        public Criteria andColumn116In(List<String> values) {
            addCriterion("column_116 in", values, "column116");
            return (Criteria) this;
        }

        public Criteria andColumn116NotIn(List<String> values) {
            addCriterion("column_116 not in", values, "column116");
            return (Criteria) this;
        }

        public Criteria andColumn116Between(String value1, String value2) {
            addCriterion("column_116 between", value1, value2, "column116");
            return (Criteria) this;
        }

        public Criteria andColumn116NotBetween(String value1, String value2) {
            addCriterion("column_116 not between", value1, value2, "column116");
            return (Criteria) this;
        }

        public Criteria andColumn117IsNull() {
            addCriterion("column_117 is null");
            return (Criteria) this;
        }

        public Criteria andColumn117IsNotNull() {
            addCriterion("column_117 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn117EqualTo(String value) {
            addCriterion("column_117 =", value, "column117");
            return (Criteria) this;
        }

        public Criteria andColumn117NotEqualTo(String value) {
            addCriterion("column_117 <>", value, "column117");
            return (Criteria) this;
        }

        public Criteria andColumn117GreaterThan(String value) {
            addCriterion("column_117 >", value, "column117");
            return (Criteria) this;
        }

        public Criteria andColumn117GreaterThanOrEqualTo(String value) {
            addCriterion("column_117 >=", value, "column117");
            return (Criteria) this;
        }

        public Criteria andColumn117LessThan(String value) {
            addCriterion("column_117 <", value, "column117");
            return (Criteria) this;
        }

        public Criteria andColumn117LessThanOrEqualTo(String value) {
            addCriterion("column_117 <=", value, "column117");
            return (Criteria) this;
        }

        public Criteria andColumn117Like(String value) {
            addCriterion("column_117 like", value, "column117");
            return (Criteria) this;
        }

        public Criteria andColumn117NotLike(String value) {
            addCriterion("column_117 not like", value, "column117");
            return (Criteria) this;
        }

        public Criteria andColumn117In(List<String> values) {
            addCriterion("column_117 in", values, "column117");
            return (Criteria) this;
        }

        public Criteria andColumn117NotIn(List<String> values) {
            addCriterion("column_117 not in", values, "column117");
            return (Criteria) this;
        }

        public Criteria andColumn117Between(String value1, String value2) {
            addCriterion("column_117 between", value1, value2, "column117");
            return (Criteria) this;
        }

        public Criteria andColumn117NotBetween(String value1, String value2) {
            addCriterion("column_117 not between", value1, value2, "column117");
            return (Criteria) this;
        }

        public Criteria andColumn118IsNull() {
            addCriterion("column_118 is null");
            return (Criteria) this;
        }

        public Criteria andColumn118IsNotNull() {
            addCriterion("column_118 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn118EqualTo(String value) {
            addCriterion("column_118 =", value, "column118");
            return (Criteria) this;
        }

        public Criteria andColumn118NotEqualTo(String value) {
            addCriterion("column_118 <>", value, "column118");
            return (Criteria) this;
        }

        public Criteria andColumn118GreaterThan(String value) {
            addCriterion("column_118 >", value, "column118");
            return (Criteria) this;
        }

        public Criteria andColumn118GreaterThanOrEqualTo(String value) {
            addCriterion("column_118 >=", value, "column118");
            return (Criteria) this;
        }

        public Criteria andColumn118LessThan(String value) {
            addCriterion("column_118 <", value, "column118");
            return (Criteria) this;
        }

        public Criteria andColumn118LessThanOrEqualTo(String value) {
            addCriterion("column_118 <=", value, "column118");
            return (Criteria) this;
        }

        public Criteria andColumn118Like(String value) {
            addCriterion("column_118 like", value, "column118");
            return (Criteria) this;
        }

        public Criteria andColumn118NotLike(String value) {
            addCriterion("column_118 not like", value, "column118");
            return (Criteria) this;
        }

        public Criteria andColumn118In(List<String> values) {
            addCriterion("column_118 in", values, "column118");
            return (Criteria) this;
        }

        public Criteria andColumn118NotIn(List<String> values) {
            addCriterion("column_118 not in", values, "column118");
            return (Criteria) this;
        }

        public Criteria andColumn118Between(String value1, String value2) {
            addCriterion("column_118 between", value1, value2, "column118");
            return (Criteria) this;
        }

        public Criteria andColumn118NotBetween(String value1, String value2) {
            addCriterion("column_118 not between", value1, value2, "column118");
            return (Criteria) this;
        }

        public Criteria andColumn119IsNull() {
            addCriterion("column_119 is null");
            return (Criteria) this;
        }

        public Criteria andColumn119IsNotNull() {
            addCriterion("column_119 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn119EqualTo(String value) {
            addCriterion("column_119 =", value, "column119");
            return (Criteria) this;
        }

        public Criteria andColumn119NotEqualTo(String value) {
            addCriterion("column_119 <>", value, "column119");
            return (Criteria) this;
        }

        public Criteria andColumn119GreaterThan(String value) {
            addCriterion("column_119 >", value, "column119");
            return (Criteria) this;
        }

        public Criteria andColumn119GreaterThanOrEqualTo(String value) {
            addCriterion("column_119 >=", value, "column119");
            return (Criteria) this;
        }

        public Criteria andColumn119LessThan(String value) {
            addCriterion("column_119 <", value, "column119");
            return (Criteria) this;
        }

        public Criteria andColumn119LessThanOrEqualTo(String value) {
            addCriterion("column_119 <=", value, "column119");
            return (Criteria) this;
        }

        public Criteria andColumn119Like(String value) {
            addCriterion("column_119 like", value, "column119");
            return (Criteria) this;
        }

        public Criteria andColumn119NotLike(String value) {
            addCriterion("column_119 not like", value, "column119");
            return (Criteria) this;
        }

        public Criteria andColumn119In(List<String> values) {
            addCriterion("column_119 in", values, "column119");
            return (Criteria) this;
        }

        public Criteria andColumn119NotIn(List<String> values) {
            addCriterion("column_119 not in", values, "column119");
            return (Criteria) this;
        }

        public Criteria andColumn119Between(String value1, String value2) {
            addCriterion("column_119 between", value1, value2, "column119");
            return (Criteria) this;
        }

        public Criteria andColumn119NotBetween(String value1, String value2) {
            addCriterion("column_119 not between", value1, value2, "column119");
            return (Criteria) this;
        }

        public Criteria andColumn120IsNull() {
            addCriterion("column_120 is null");
            return (Criteria) this;
        }

        public Criteria andColumn120IsNotNull() {
            addCriterion("column_120 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn120EqualTo(String value) {
            addCriterion("column_120 =", value, "column120");
            return (Criteria) this;
        }

        public Criteria andColumn120NotEqualTo(String value) {
            addCriterion("column_120 <>", value, "column120");
            return (Criteria) this;
        }

        public Criteria andColumn120GreaterThan(String value) {
            addCriterion("column_120 >", value, "column120");
            return (Criteria) this;
        }

        public Criteria andColumn120GreaterThanOrEqualTo(String value) {
            addCriterion("column_120 >=", value, "column120");
            return (Criteria) this;
        }

        public Criteria andColumn120LessThan(String value) {
            addCriterion("column_120 <", value, "column120");
            return (Criteria) this;
        }

        public Criteria andColumn120LessThanOrEqualTo(String value) {
            addCriterion("column_120 <=", value, "column120");
            return (Criteria) this;
        }

        public Criteria andColumn120Like(String value) {
            addCriterion("column_120 like", value, "column120");
            return (Criteria) this;
        }

        public Criteria andColumn120NotLike(String value) {
            addCriterion("column_120 not like", value, "column120");
            return (Criteria) this;
        }

        public Criteria andColumn120In(List<String> values) {
            addCriterion("column_120 in", values, "column120");
            return (Criteria) this;
        }

        public Criteria andColumn120NotIn(List<String> values) {
            addCriterion("column_120 not in", values, "column120");
            return (Criteria) this;
        }

        public Criteria andColumn120Between(String value1, String value2) {
            addCriterion("column_120 between", value1, value2, "column120");
            return (Criteria) this;
        }

        public Criteria andColumn120NotBetween(String value1, String value2) {
            addCriterion("column_120 not between", value1, value2, "column120");
            return (Criteria) this;
        }

        public Criteria andColumn121IsNull() {
            addCriterion("column_121 is null");
            return (Criteria) this;
        }

        public Criteria andColumn121IsNotNull() {
            addCriterion("column_121 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn121EqualTo(String value) {
            addCriterion("column_121 =", value, "column121");
            return (Criteria) this;
        }

        public Criteria andColumn121NotEqualTo(String value) {
            addCriterion("column_121 <>", value, "column121");
            return (Criteria) this;
        }

        public Criteria andColumn121GreaterThan(String value) {
            addCriterion("column_121 >", value, "column121");
            return (Criteria) this;
        }

        public Criteria andColumn121GreaterThanOrEqualTo(String value) {
            addCriterion("column_121 >=", value, "column121");
            return (Criteria) this;
        }

        public Criteria andColumn121LessThan(String value) {
            addCriterion("column_121 <", value, "column121");
            return (Criteria) this;
        }

        public Criteria andColumn121LessThanOrEqualTo(String value) {
            addCriterion("column_121 <=", value, "column121");
            return (Criteria) this;
        }

        public Criteria andColumn121Like(String value) {
            addCriterion("column_121 like", value, "column121");
            return (Criteria) this;
        }

        public Criteria andColumn121NotLike(String value) {
            addCriterion("column_121 not like", value, "column121");
            return (Criteria) this;
        }

        public Criteria andColumn121In(List<String> values) {
            addCriterion("column_121 in", values, "column121");
            return (Criteria) this;
        }

        public Criteria andColumn121NotIn(List<String> values) {
            addCriterion("column_121 not in", values, "column121");
            return (Criteria) this;
        }

        public Criteria andColumn121Between(String value1, String value2) {
            addCriterion("column_121 between", value1, value2, "column121");
            return (Criteria) this;
        }

        public Criteria andColumn121NotBetween(String value1, String value2) {
            addCriterion("column_121 not between", value1, value2, "column121");
            return (Criteria) this;
        }

        public Criteria andColumn122IsNull() {
            addCriterion("column_122 is null");
            return (Criteria) this;
        }

        public Criteria andColumn122IsNotNull() {
            addCriterion("column_122 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn122EqualTo(String value) {
            addCriterion("column_122 =", value, "column122");
            return (Criteria) this;
        }

        public Criteria andColumn122NotEqualTo(String value) {
            addCriterion("column_122 <>", value, "column122");
            return (Criteria) this;
        }

        public Criteria andColumn122GreaterThan(String value) {
            addCriterion("column_122 >", value, "column122");
            return (Criteria) this;
        }

        public Criteria andColumn122GreaterThanOrEqualTo(String value) {
            addCriterion("column_122 >=", value, "column122");
            return (Criteria) this;
        }

        public Criteria andColumn122LessThan(String value) {
            addCriterion("column_122 <", value, "column122");
            return (Criteria) this;
        }

        public Criteria andColumn122LessThanOrEqualTo(String value) {
            addCriterion("column_122 <=", value, "column122");
            return (Criteria) this;
        }

        public Criteria andColumn122Like(String value) {
            addCriterion("column_122 like", value, "column122");
            return (Criteria) this;
        }

        public Criteria andColumn122NotLike(String value) {
            addCriterion("column_122 not like", value, "column122");
            return (Criteria) this;
        }

        public Criteria andColumn122In(List<String> values) {
            addCriterion("column_122 in", values, "column122");
            return (Criteria) this;
        }

        public Criteria andColumn122NotIn(List<String> values) {
            addCriterion("column_122 not in", values, "column122");
            return (Criteria) this;
        }

        public Criteria andColumn122Between(String value1, String value2) {
            addCriterion("column_122 between", value1, value2, "column122");
            return (Criteria) this;
        }

        public Criteria andColumn122NotBetween(String value1, String value2) {
            addCriterion("column_122 not between", value1, value2, "column122");
            return (Criteria) this;
        }

        public Criteria andColumn123IsNull() {
            addCriterion("column_123 is null");
            return (Criteria) this;
        }

        public Criteria andColumn123IsNotNull() {
            addCriterion("column_123 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn123EqualTo(String value) {
            addCriterion("column_123 =", value, "column123");
            return (Criteria) this;
        }

        public Criteria andColumn123NotEqualTo(String value) {
            addCriterion("column_123 <>", value, "column123");
            return (Criteria) this;
        }

        public Criteria andColumn123GreaterThan(String value) {
            addCriterion("column_123 >", value, "column123");
            return (Criteria) this;
        }

        public Criteria andColumn123GreaterThanOrEqualTo(String value) {
            addCriterion("column_123 >=", value, "column123");
            return (Criteria) this;
        }

        public Criteria andColumn123LessThan(String value) {
            addCriterion("column_123 <", value, "column123");
            return (Criteria) this;
        }

        public Criteria andColumn123LessThanOrEqualTo(String value) {
            addCriterion("column_123 <=", value, "column123");
            return (Criteria) this;
        }

        public Criteria andColumn123Like(String value) {
            addCriterion("column_123 like", value, "column123");
            return (Criteria) this;
        }

        public Criteria andColumn123NotLike(String value) {
            addCriterion("column_123 not like", value, "column123");
            return (Criteria) this;
        }

        public Criteria andColumn123In(List<String> values) {
            addCriterion("column_123 in", values, "column123");
            return (Criteria) this;
        }

        public Criteria andColumn123NotIn(List<String> values) {
            addCriterion("column_123 not in", values, "column123");
            return (Criteria) this;
        }

        public Criteria andColumn123Between(String value1, String value2) {
            addCriterion("column_123 between", value1, value2, "column123");
            return (Criteria) this;
        }

        public Criteria andColumn123NotBetween(String value1, String value2) {
            addCriterion("column_123 not between", value1, value2, "column123");
            return (Criteria) this;
        }

        public Criteria andColumn124IsNull() {
            addCriterion("column_124 is null");
            return (Criteria) this;
        }

        public Criteria andColumn124IsNotNull() {
            addCriterion("column_124 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn124EqualTo(String value) {
            addCriterion("column_124 =", value, "column124");
            return (Criteria) this;
        }

        public Criteria andColumn124NotEqualTo(String value) {
            addCriterion("column_124 <>", value, "column124");
            return (Criteria) this;
        }

        public Criteria andColumn124GreaterThan(String value) {
            addCriterion("column_124 >", value, "column124");
            return (Criteria) this;
        }

        public Criteria andColumn124GreaterThanOrEqualTo(String value) {
            addCriterion("column_124 >=", value, "column124");
            return (Criteria) this;
        }

        public Criteria andColumn124LessThan(String value) {
            addCriterion("column_124 <", value, "column124");
            return (Criteria) this;
        }

        public Criteria andColumn124LessThanOrEqualTo(String value) {
            addCriterion("column_124 <=", value, "column124");
            return (Criteria) this;
        }

        public Criteria andColumn124Like(String value) {
            addCriterion("column_124 like", value, "column124");
            return (Criteria) this;
        }

        public Criteria andColumn124NotLike(String value) {
            addCriterion("column_124 not like", value, "column124");
            return (Criteria) this;
        }

        public Criteria andColumn124In(List<String> values) {
            addCriterion("column_124 in", values, "column124");
            return (Criteria) this;
        }

        public Criteria andColumn124NotIn(List<String> values) {
            addCriterion("column_124 not in", values, "column124");
            return (Criteria) this;
        }

        public Criteria andColumn124Between(String value1, String value2) {
            addCriterion("column_124 between", value1, value2, "column124");
            return (Criteria) this;
        }

        public Criteria andColumn124NotBetween(String value1, String value2) {
            addCriterion("column_124 not between", value1, value2, "column124");
            return (Criteria) this;
        }

        public Criteria andColumn125IsNull() {
            addCriterion("column_125 is null");
            return (Criteria) this;
        }

        public Criteria andColumn125IsNotNull() {
            addCriterion("column_125 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn125EqualTo(String value) {
            addCriterion("column_125 =", value, "column125");
            return (Criteria) this;
        }

        public Criteria andColumn125NotEqualTo(String value) {
            addCriterion("column_125 <>", value, "column125");
            return (Criteria) this;
        }

        public Criteria andColumn125GreaterThan(String value) {
            addCriterion("column_125 >", value, "column125");
            return (Criteria) this;
        }

        public Criteria andColumn125GreaterThanOrEqualTo(String value) {
            addCriterion("column_125 >=", value, "column125");
            return (Criteria) this;
        }

        public Criteria andColumn125LessThan(String value) {
            addCriterion("column_125 <", value, "column125");
            return (Criteria) this;
        }

        public Criteria andColumn125LessThanOrEqualTo(String value) {
            addCriterion("column_125 <=", value, "column125");
            return (Criteria) this;
        }

        public Criteria andColumn125Like(String value) {
            addCriterion("column_125 like", value, "column125");
            return (Criteria) this;
        }

        public Criteria andColumn125NotLike(String value) {
            addCriterion("column_125 not like", value, "column125");
            return (Criteria) this;
        }

        public Criteria andColumn125In(List<String> values) {
            addCriterion("column_125 in", values, "column125");
            return (Criteria) this;
        }

        public Criteria andColumn125NotIn(List<String> values) {
            addCriterion("column_125 not in", values, "column125");
            return (Criteria) this;
        }

        public Criteria andColumn125Between(String value1, String value2) {
            addCriterion("column_125 between", value1, value2, "column125");
            return (Criteria) this;
        }

        public Criteria andColumn125NotBetween(String value1, String value2) {
            addCriterion("column_125 not between", value1, value2, "column125");
            return (Criteria) this;
        }

        public Criteria andColumn126IsNull() {
            addCriterion("column_126 is null");
            return (Criteria) this;
        }

        public Criteria andColumn126IsNotNull() {
            addCriterion("column_126 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn126EqualTo(String value) {
            addCriterion("column_126 =", value, "column126");
            return (Criteria) this;
        }

        public Criteria andColumn126NotEqualTo(String value) {
            addCriterion("column_126 <>", value, "column126");
            return (Criteria) this;
        }

        public Criteria andColumn126GreaterThan(String value) {
            addCriterion("column_126 >", value, "column126");
            return (Criteria) this;
        }

        public Criteria andColumn126GreaterThanOrEqualTo(String value) {
            addCriterion("column_126 >=", value, "column126");
            return (Criteria) this;
        }

        public Criteria andColumn126LessThan(String value) {
            addCriterion("column_126 <", value, "column126");
            return (Criteria) this;
        }

        public Criteria andColumn126LessThanOrEqualTo(String value) {
            addCriterion("column_126 <=", value, "column126");
            return (Criteria) this;
        }

        public Criteria andColumn126Like(String value) {
            addCriterion("column_126 like", value, "column126");
            return (Criteria) this;
        }

        public Criteria andColumn126NotLike(String value) {
            addCriterion("column_126 not like", value, "column126");
            return (Criteria) this;
        }

        public Criteria andColumn126In(List<String> values) {
            addCriterion("column_126 in", values, "column126");
            return (Criteria) this;
        }

        public Criteria andColumn126NotIn(List<String> values) {
            addCriterion("column_126 not in", values, "column126");
            return (Criteria) this;
        }

        public Criteria andColumn126Between(String value1, String value2) {
            addCriterion("column_126 between", value1, value2, "column126");
            return (Criteria) this;
        }

        public Criteria andColumn126NotBetween(String value1, String value2) {
            addCriterion("column_126 not between", value1, value2, "column126");
            return (Criteria) this;
        }

        public Criteria andColumn127IsNull() {
            addCriterion("column_127 is null");
            return (Criteria) this;
        }

        public Criteria andColumn127IsNotNull() {
            addCriterion("column_127 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn127EqualTo(String value) {
            addCriterion("column_127 =", value, "column127");
            return (Criteria) this;
        }

        public Criteria andColumn127NotEqualTo(String value) {
            addCriterion("column_127 <>", value, "column127");
            return (Criteria) this;
        }

        public Criteria andColumn127GreaterThan(String value) {
            addCriterion("column_127 >", value, "column127");
            return (Criteria) this;
        }

        public Criteria andColumn127GreaterThanOrEqualTo(String value) {
            addCriterion("column_127 >=", value, "column127");
            return (Criteria) this;
        }

        public Criteria andColumn127LessThan(String value) {
            addCriterion("column_127 <", value, "column127");
            return (Criteria) this;
        }

        public Criteria andColumn127LessThanOrEqualTo(String value) {
            addCriterion("column_127 <=", value, "column127");
            return (Criteria) this;
        }

        public Criteria andColumn127Like(String value) {
            addCriterion("column_127 like", value, "column127");
            return (Criteria) this;
        }

        public Criteria andColumn127NotLike(String value) {
            addCriterion("column_127 not like", value, "column127");
            return (Criteria) this;
        }

        public Criteria andColumn127In(List<String> values) {
            addCriterion("column_127 in", values, "column127");
            return (Criteria) this;
        }

        public Criteria andColumn127NotIn(List<String> values) {
            addCriterion("column_127 not in", values, "column127");
            return (Criteria) this;
        }

        public Criteria andColumn127Between(String value1, String value2) {
            addCriterion("column_127 between", value1, value2, "column127");
            return (Criteria) this;
        }

        public Criteria andColumn127NotBetween(String value1, String value2) {
            addCriterion("column_127 not between", value1, value2, "column127");
            return (Criteria) this;
        }

        public Criteria andColumn128IsNull() {
            addCriterion("column_128 is null");
            return (Criteria) this;
        }

        public Criteria andColumn128IsNotNull() {
            addCriterion("column_128 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn128EqualTo(String value) {
            addCriterion("column_128 =", value, "column128");
            return (Criteria) this;
        }

        public Criteria andColumn128NotEqualTo(String value) {
            addCriterion("column_128 <>", value, "column128");
            return (Criteria) this;
        }

        public Criteria andColumn128GreaterThan(String value) {
            addCriterion("column_128 >", value, "column128");
            return (Criteria) this;
        }

        public Criteria andColumn128GreaterThanOrEqualTo(String value) {
            addCriterion("column_128 >=", value, "column128");
            return (Criteria) this;
        }

        public Criteria andColumn128LessThan(String value) {
            addCriterion("column_128 <", value, "column128");
            return (Criteria) this;
        }

        public Criteria andColumn128LessThanOrEqualTo(String value) {
            addCriterion("column_128 <=", value, "column128");
            return (Criteria) this;
        }

        public Criteria andColumn128Like(String value) {
            addCriterion("column_128 like", value, "column128");
            return (Criteria) this;
        }

        public Criteria andColumn128NotLike(String value) {
            addCriterion("column_128 not like", value, "column128");
            return (Criteria) this;
        }

        public Criteria andColumn128In(List<String> values) {
            addCriterion("column_128 in", values, "column128");
            return (Criteria) this;
        }

        public Criteria andColumn128NotIn(List<String> values) {
            addCriterion("column_128 not in", values, "column128");
            return (Criteria) this;
        }

        public Criteria andColumn128Between(String value1, String value2) {
            addCriterion("column_128 between", value1, value2, "column128");
            return (Criteria) this;
        }

        public Criteria andColumn128NotBetween(String value1, String value2) {
            addCriterion("column_128 not between", value1, value2, "column128");
            return (Criteria) this;
        }

        public Criteria andColumn129IsNull() {
            addCriterion("column_129 is null");
            return (Criteria) this;
        }

        public Criteria andColumn129IsNotNull() {
            addCriterion("column_129 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn129EqualTo(String value) {
            addCriterion("column_129 =", value, "column129");
            return (Criteria) this;
        }

        public Criteria andColumn129NotEqualTo(String value) {
            addCriterion("column_129 <>", value, "column129");
            return (Criteria) this;
        }

        public Criteria andColumn129GreaterThan(String value) {
            addCriterion("column_129 >", value, "column129");
            return (Criteria) this;
        }

        public Criteria andColumn129GreaterThanOrEqualTo(String value) {
            addCriterion("column_129 >=", value, "column129");
            return (Criteria) this;
        }

        public Criteria andColumn129LessThan(String value) {
            addCriterion("column_129 <", value, "column129");
            return (Criteria) this;
        }

        public Criteria andColumn129LessThanOrEqualTo(String value) {
            addCriterion("column_129 <=", value, "column129");
            return (Criteria) this;
        }

        public Criteria andColumn129Like(String value) {
            addCriterion("column_129 like", value, "column129");
            return (Criteria) this;
        }

        public Criteria andColumn129NotLike(String value) {
            addCriterion("column_129 not like", value, "column129");
            return (Criteria) this;
        }

        public Criteria andColumn129In(List<String> values) {
            addCriterion("column_129 in", values, "column129");
            return (Criteria) this;
        }

        public Criteria andColumn129NotIn(List<String> values) {
            addCriterion("column_129 not in", values, "column129");
            return (Criteria) this;
        }

        public Criteria andColumn129Between(String value1, String value2) {
            addCriterion("column_129 between", value1, value2, "column129");
            return (Criteria) this;
        }

        public Criteria andColumn129NotBetween(String value1, String value2) {
            addCriterion("column_129 not between", value1, value2, "column129");
            return (Criteria) this;
        }

        public Criteria andColumn130IsNull() {
            addCriterion("column_130 is null");
            return (Criteria) this;
        }

        public Criteria andColumn130IsNotNull() {
            addCriterion("column_130 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn130EqualTo(String value) {
            addCriterion("column_130 =", value, "column130");
            return (Criteria) this;
        }

        public Criteria andColumn130NotEqualTo(String value) {
            addCriterion("column_130 <>", value, "column130");
            return (Criteria) this;
        }

        public Criteria andColumn130GreaterThan(String value) {
            addCriterion("column_130 >", value, "column130");
            return (Criteria) this;
        }

        public Criteria andColumn130GreaterThanOrEqualTo(String value) {
            addCriterion("column_130 >=", value, "column130");
            return (Criteria) this;
        }

        public Criteria andColumn130LessThan(String value) {
            addCriterion("column_130 <", value, "column130");
            return (Criteria) this;
        }

        public Criteria andColumn130LessThanOrEqualTo(String value) {
            addCriterion("column_130 <=", value, "column130");
            return (Criteria) this;
        }

        public Criteria andColumn130Like(String value) {
            addCriterion("column_130 like", value, "column130");
            return (Criteria) this;
        }

        public Criteria andColumn130NotLike(String value) {
            addCriterion("column_130 not like", value, "column130");
            return (Criteria) this;
        }

        public Criteria andColumn130In(List<String> values) {
            addCriterion("column_130 in", values, "column130");
            return (Criteria) this;
        }

        public Criteria andColumn130NotIn(List<String> values) {
            addCriterion("column_130 not in", values, "column130");
            return (Criteria) this;
        }

        public Criteria andColumn130Between(String value1, String value2) {
            addCriterion("column_130 between", value1, value2, "column130");
            return (Criteria) this;
        }

        public Criteria andColumn130NotBetween(String value1, String value2) {
            addCriterion("column_130 not between", value1, value2, "column130");
            return (Criteria) this;
        }

        public Criteria andColumn131IsNull() {
            addCriterion("column_131 is null");
            return (Criteria) this;
        }

        public Criteria andColumn131IsNotNull() {
            addCriterion("column_131 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn131EqualTo(String value) {
            addCriterion("column_131 =", value, "column131");
            return (Criteria) this;
        }

        public Criteria andColumn131NotEqualTo(String value) {
            addCriterion("column_131 <>", value, "column131");
            return (Criteria) this;
        }

        public Criteria andColumn131GreaterThan(String value) {
            addCriterion("column_131 >", value, "column131");
            return (Criteria) this;
        }

        public Criteria andColumn131GreaterThanOrEqualTo(String value) {
            addCriterion("column_131 >=", value, "column131");
            return (Criteria) this;
        }

        public Criteria andColumn131LessThan(String value) {
            addCriterion("column_131 <", value, "column131");
            return (Criteria) this;
        }

        public Criteria andColumn131LessThanOrEqualTo(String value) {
            addCriterion("column_131 <=", value, "column131");
            return (Criteria) this;
        }

        public Criteria andColumn131Like(String value) {
            addCriterion("column_131 like", value, "column131");
            return (Criteria) this;
        }

        public Criteria andColumn131NotLike(String value) {
            addCriterion("column_131 not like", value, "column131");
            return (Criteria) this;
        }

        public Criteria andColumn131In(List<String> values) {
            addCriterion("column_131 in", values, "column131");
            return (Criteria) this;
        }

        public Criteria andColumn131NotIn(List<String> values) {
            addCriterion("column_131 not in", values, "column131");
            return (Criteria) this;
        }

        public Criteria andColumn131Between(String value1, String value2) {
            addCriterion("column_131 between", value1, value2, "column131");
            return (Criteria) this;
        }

        public Criteria andColumn131NotBetween(String value1, String value2) {
            addCriterion("column_131 not between", value1, value2, "column131");
            return (Criteria) this;
        }

        public Criteria andColumn132IsNull() {
            addCriterion("column_132 is null");
            return (Criteria) this;
        }

        public Criteria andColumn132IsNotNull() {
            addCriterion("column_132 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn132EqualTo(String value) {
            addCriterion("column_132 =", value, "column132");
            return (Criteria) this;
        }

        public Criteria andColumn132NotEqualTo(String value) {
            addCriterion("column_132 <>", value, "column132");
            return (Criteria) this;
        }

        public Criteria andColumn132GreaterThan(String value) {
            addCriterion("column_132 >", value, "column132");
            return (Criteria) this;
        }

        public Criteria andColumn132GreaterThanOrEqualTo(String value) {
            addCriterion("column_132 >=", value, "column132");
            return (Criteria) this;
        }

        public Criteria andColumn132LessThan(String value) {
            addCriterion("column_132 <", value, "column132");
            return (Criteria) this;
        }

        public Criteria andColumn132LessThanOrEqualTo(String value) {
            addCriterion("column_132 <=", value, "column132");
            return (Criteria) this;
        }

        public Criteria andColumn132Like(String value) {
            addCriterion("column_132 like", value, "column132");
            return (Criteria) this;
        }

        public Criteria andColumn132NotLike(String value) {
            addCriterion("column_132 not like", value, "column132");
            return (Criteria) this;
        }

        public Criteria andColumn132In(List<String> values) {
            addCriterion("column_132 in", values, "column132");
            return (Criteria) this;
        }

        public Criteria andColumn132NotIn(List<String> values) {
            addCriterion("column_132 not in", values, "column132");
            return (Criteria) this;
        }

        public Criteria andColumn132Between(String value1, String value2) {
            addCriterion("column_132 between", value1, value2, "column132");
            return (Criteria) this;
        }

        public Criteria andColumn132NotBetween(String value1, String value2) {
            addCriterion("column_132 not between", value1, value2, "column132");
            return (Criteria) this;
        }

        public Criteria andColumn133IsNull() {
            addCriterion("column_133 is null");
            return (Criteria) this;
        }

        public Criteria andColumn133IsNotNull() {
            addCriterion("column_133 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn133EqualTo(String value) {
            addCriterion("column_133 =", value, "column133");
            return (Criteria) this;
        }

        public Criteria andColumn133NotEqualTo(String value) {
            addCriterion("column_133 <>", value, "column133");
            return (Criteria) this;
        }

        public Criteria andColumn133GreaterThan(String value) {
            addCriterion("column_133 >", value, "column133");
            return (Criteria) this;
        }

        public Criteria andColumn133GreaterThanOrEqualTo(String value) {
            addCriterion("column_133 >=", value, "column133");
            return (Criteria) this;
        }

        public Criteria andColumn133LessThan(String value) {
            addCriterion("column_133 <", value, "column133");
            return (Criteria) this;
        }

        public Criteria andColumn133LessThanOrEqualTo(String value) {
            addCriterion("column_133 <=", value, "column133");
            return (Criteria) this;
        }

        public Criteria andColumn133Like(String value) {
            addCriterion("column_133 like", value, "column133");
            return (Criteria) this;
        }

        public Criteria andColumn133NotLike(String value) {
            addCriterion("column_133 not like", value, "column133");
            return (Criteria) this;
        }

        public Criteria andColumn133In(List<String> values) {
            addCriterion("column_133 in", values, "column133");
            return (Criteria) this;
        }

        public Criteria andColumn133NotIn(List<String> values) {
            addCriterion("column_133 not in", values, "column133");
            return (Criteria) this;
        }

        public Criteria andColumn133Between(String value1, String value2) {
            addCriterion("column_133 between", value1, value2, "column133");
            return (Criteria) this;
        }

        public Criteria andColumn133NotBetween(String value1, String value2) {
            addCriterion("column_133 not between", value1, value2, "column133");
            return (Criteria) this;
        }

        public Criteria andColumn134IsNull() {
            addCriterion("column_134 is null");
            return (Criteria) this;
        }

        public Criteria andColumn134IsNotNull() {
            addCriterion("column_134 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn134EqualTo(String value) {
            addCriterion("column_134 =", value, "column134");
            return (Criteria) this;
        }

        public Criteria andColumn134NotEqualTo(String value) {
            addCriterion("column_134 <>", value, "column134");
            return (Criteria) this;
        }

        public Criteria andColumn134GreaterThan(String value) {
            addCriterion("column_134 >", value, "column134");
            return (Criteria) this;
        }

        public Criteria andColumn134GreaterThanOrEqualTo(String value) {
            addCriterion("column_134 >=", value, "column134");
            return (Criteria) this;
        }

        public Criteria andColumn134LessThan(String value) {
            addCriterion("column_134 <", value, "column134");
            return (Criteria) this;
        }

        public Criteria andColumn134LessThanOrEqualTo(String value) {
            addCriterion("column_134 <=", value, "column134");
            return (Criteria) this;
        }

        public Criteria andColumn134Like(String value) {
            addCriterion("column_134 like", value, "column134");
            return (Criteria) this;
        }

        public Criteria andColumn134NotLike(String value) {
            addCriterion("column_134 not like", value, "column134");
            return (Criteria) this;
        }

        public Criteria andColumn134In(List<String> values) {
            addCriterion("column_134 in", values, "column134");
            return (Criteria) this;
        }

        public Criteria andColumn134NotIn(List<String> values) {
            addCriterion("column_134 not in", values, "column134");
            return (Criteria) this;
        }

        public Criteria andColumn134Between(String value1, String value2) {
            addCriterion("column_134 between", value1, value2, "column134");
            return (Criteria) this;
        }

        public Criteria andColumn134NotBetween(String value1, String value2) {
            addCriterion("column_134 not between", value1, value2, "column134");
            return (Criteria) this;
        }

        public Criteria andColumn135IsNull() {
            addCriterion("column_135 is null");
            return (Criteria) this;
        }

        public Criteria andColumn135IsNotNull() {
            addCriterion("column_135 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn135EqualTo(String value) {
            addCriterion("column_135 =", value, "column135");
            return (Criteria) this;
        }

        public Criteria andColumn135NotEqualTo(String value) {
            addCriterion("column_135 <>", value, "column135");
            return (Criteria) this;
        }

        public Criteria andColumn135GreaterThan(String value) {
            addCriterion("column_135 >", value, "column135");
            return (Criteria) this;
        }

        public Criteria andColumn135GreaterThanOrEqualTo(String value) {
            addCriterion("column_135 >=", value, "column135");
            return (Criteria) this;
        }

        public Criteria andColumn135LessThan(String value) {
            addCriterion("column_135 <", value, "column135");
            return (Criteria) this;
        }

        public Criteria andColumn135LessThanOrEqualTo(String value) {
            addCriterion("column_135 <=", value, "column135");
            return (Criteria) this;
        }

        public Criteria andColumn135Like(String value) {
            addCriterion("column_135 like", value, "column135");
            return (Criteria) this;
        }

        public Criteria andColumn135NotLike(String value) {
            addCriterion("column_135 not like", value, "column135");
            return (Criteria) this;
        }

        public Criteria andColumn135In(List<String> values) {
            addCriterion("column_135 in", values, "column135");
            return (Criteria) this;
        }

        public Criteria andColumn135NotIn(List<String> values) {
            addCriterion("column_135 not in", values, "column135");
            return (Criteria) this;
        }

        public Criteria andColumn135Between(String value1, String value2) {
            addCriterion("column_135 between", value1, value2, "column135");
            return (Criteria) this;
        }

        public Criteria andColumn135NotBetween(String value1, String value2) {
            addCriterion("column_135 not between", value1, value2, "column135");
            return (Criteria) this;
        }

        public Criteria andColumn136IsNull() {
            addCriterion("column_136 is null");
            return (Criteria) this;
        }

        public Criteria andColumn136IsNotNull() {
            addCriterion("column_136 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn136EqualTo(String value) {
            addCriterion("column_136 =", value, "column136");
            return (Criteria) this;
        }

        public Criteria andColumn136NotEqualTo(String value) {
            addCriterion("column_136 <>", value, "column136");
            return (Criteria) this;
        }

        public Criteria andColumn136GreaterThan(String value) {
            addCriterion("column_136 >", value, "column136");
            return (Criteria) this;
        }

        public Criteria andColumn136GreaterThanOrEqualTo(String value) {
            addCriterion("column_136 >=", value, "column136");
            return (Criteria) this;
        }

        public Criteria andColumn136LessThan(String value) {
            addCriterion("column_136 <", value, "column136");
            return (Criteria) this;
        }

        public Criteria andColumn136LessThanOrEqualTo(String value) {
            addCriterion("column_136 <=", value, "column136");
            return (Criteria) this;
        }

        public Criteria andColumn136Like(String value) {
            addCriterion("column_136 like", value, "column136");
            return (Criteria) this;
        }

        public Criteria andColumn136NotLike(String value) {
            addCriterion("column_136 not like", value, "column136");
            return (Criteria) this;
        }

        public Criteria andColumn136In(List<String> values) {
            addCriterion("column_136 in", values, "column136");
            return (Criteria) this;
        }

        public Criteria andColumn136NotIn(List<String> values) {
            addCriterion("column_136 not in", values, "column136");
            return (Criteria) this;
        }

        public Criteria andColumn136Between(String value1, String value2) {
            addCriterion("column_136 between", value1, value2, "column136");
            return (Criteria) this;
        }

        public Criteria andColumn136NotBetween(String value1, String value2) {
            addCriterion("column_136 not between", value1, value2, "column136");
            return (Criteria) this;
        }

        public Criteria andColumn137IsNull() {
            addCriterion("column_137 is null");
            return (Criteria) this;
        }

        public Criteria andColumn137IsNotNull() {
            addCriterion("column_137 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn137EqualTo(String value) {
            addCriterion("column_137 =", value, "column137");
            return (Criteria) this;
        }

        public Criteria andColumn137NotEqualTo(String value) {
            addCriterion("column_137 <>", value, "column137");
            return (Criteria) this;
        }

        public Criteria andColumn137GreaterThan(String value) {
            addCriterion("column_137 >", value, "column137");
            return (Criteria) this;
        }

        public Criteria andColumn137GreaterThanOrEqualTo(String value) {
            addCriterion("column_137 >=", value, "column137");
            return (Criteria) this;
        }

        public Criteria andColumn137LessThan(String value) {
            addCriterion("column_137 <", value, "column137");
            return (Criteria) this;
        }

        public Criteria andColumn137LessThanOrEqualTo(String value) {
            addCriterion("column_137 <=", value, "column137");
            return (Criteria) this;
        }

        public Criteria andColumn137Like(String value) {
            addCriterion("column_137 like", value, "column137");
            return (Criteria) this;
        }

        public Criteria andColumn137NotLike(String value) {
            addCriterion("column_137 not like", value, "column137");
            return (Criteria) this;
        }

        public Criteria andColumn137In(List<String> values) {
            addCriterion("column_137 in", values, "column137");
            return (Criteria) this;
        }

        public Criteria andColumn137NotIn(List<String> values) {
            addCriterion("column_137 not in", values, "column137");
            return (Criteria) this;
        }

        public Criteria andColumn137Between(String value1, String value2) {
            addCriterion("column_137 between", value1, value2, "column137");
            return (Criteria) this;
        }

        public Criteria andColumn137NotBetween(String value1, String value2) {
            addCriterion("column_137 not between", value1, value2, "column137");
            return (Criteria) this;
        }

        public Criteria andColumn138IsNull() {
            addCriterion("column_138 is null");
            return (Criteria) this;
        }

        public Criteria andColumn138IsNotNull() {
            addCriterion("column_138 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn138EqualTo(String value) {
            addCriterion("column_138 =", value, "column138");
            return (Criteria) this;
        }

        public Criteria andColumn138NotEqualTo(String value) {
            addCriterion("column_138 <>", value, "column138");
            return (Criteria) this;
        }

        public Criteria andColumn138GreaterThan(String value) {
            addCriterion("column_138 >", value, "column138");
            return (Criteria) this;
        }

        public Criteria andColumn138GreaterThanOrEqualTo(String value) {
            addCriterion("column_138 >=", value, "column138");
            return (Criteria) this;
        }

        public Criteria andColumn138LessThan(String value) {
            addCriterion("column_138 <", value, "column138");
            return (Criteria) this;
        }

        public Criteria andColumn138LessThanOrEqualTo(String value) {
            addCriterion("column_138 <=", value, "column138");
            return (Criteria) this;
        }

        public Criteria andColumn138Like(String value) {
            addCriterion("column_138 like", value, "column138");
            return (Criteria) this;
        }

        public Criteria andColumn138NotLike(String value) {
            addCriterion("column_138 not like", value, "column138");
            return (Criteria) this;
        }

        public Criteria andColumn138In(List<String> values) {
            addCriterion("column_138 in", values, "column138");
            return (Criteria) this;
        }

        public Criteria andColumn138NotIn(List<String> values) {
            addCriterion("column_138 not in", values, "column138");
            return (Criteria) this;
        }

        public Criteria andColumn138Between(String value1, String value2) {
            addCriterion("column_138 between", value1, value2, "column138");
            return (Criteria) this;
        }

        public Criteria andColumn138NotBetween(String value1, String value2) {
            addCriterion("column_138 not between", value1, value2, "column138");
            return (Criteria) this;
        }

        public Criteria andColumn139IsNull() {
            addCriterion("column_139 is null");
            return (Criteria) this;
        }

        public Criteria andColumn139IsNotNull() {
            addCriterion("column_139 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn139EqualTo(String value) {
            addCriterion("column_139 =", value, "column139");
            return (Criteria) this;
        }

        public Criteria andColumn139NotEqualTo(String value) {
            addCriterion("column_139 <>", value, "column139");
            return (Criteria) this;
        }

        public Criteria andColumn139GreaterThan(String value) {
            addCriterion("column_139 >", value, "column139");
            return (Criteria) this;
        }

        public Criteria andColumn139GreaterThanOrEqualTo(String value) {
            addCriterion("column_139 >=", value, "column139");
            return (Criteria) this;
        }

        public Criteria andColumn139LessThan(String value) {
            addCriterion("column_139 <", value, "column139");
            return (Criteria) this;
        }

        public Criteria andColumn139LessThanOrEqualTo(String value) {
            addCriterion("column_139 <=", value, "column139");
            return (Criteria) this;
        }

        public Criteria andColumn139Like(String value) {
            addCriterion("column_139 like", value, "column139");
            return (Criteria) this;
        }

        public Criteria andColumn139NotLike(String value) {
            addCriterion("column_139 not like", value, "column139");
            return (Criteria) this;
        }

        public Criteria andColumn139In(List<String> values) {
            addCriterion("column_139 in", values, "column139");
            return (Criteria) this;
        }

        public Criteria andColumn139NotIn(List<String> values) {
            addCriterion("column_139 not in", values, "column139");
            return (Criteria) this;
        }

        public Criteria andColumn139Between(String value1, String value2) {
            addCriterion("column_139 between", value1, value2, "column139");
            return (Criteria) this;
        }

        public Criteria andColumn139NotBetween(String value1, String value2) {
            addCriterion("column_139 not between", value1, value2, "column139");
            return (Criteria) this;
        }

        public Criteria andColumn140IsNull() {
            addCriterion("column_140 is null");
            return (Criteria) this;
        }

        public Criteria andColumn140IsNotNull() {
            addCriterion("column_140 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn140EqualTo(String value) {
            addCriterion("column_140 =", value, "column140");
            return (Criteria) this;
        }

        public Criteria andColumn140NotEqualTo(String value) {
            addCriterion("column_140 <>", value, "column140");
            return (Criteria) this;
        }

        public Criteria andColumn140GreaterThan(String value) {
            addCriterion("column_140 >", value, "column140");
            return (Criteria) this;
        }

        public Criteria andColumn140GreaterThanOrEqualTo(String value) {
            addCriterion("column_140 >=", value, "column140");
            return (Criteria) this;
        }

        public Criteria andColumn140LessThan(String value) {
            addCriterion("column_140 <", value, "column140");
            return (Criteria) this;
        }

        public Criteria andColumn140LessThanOrEqualTo(String value) {
            addCriterion("column_140 <=", value, "column140");
            return (Criteria) this;
        }

        public Criteria andColumn140Like(String value) {
            addCriterion("column_140 like", value, "column140");
            return (Criteria) this;
        }

        public Criteria andColumn140NotLike(String value) {
            addCriterion("column_140 not like", value, "column140");
            return (Criteria) this;
        }

        public Criteria andColumn140In(List<String> values) {
            addCriterion("column_140 in", values, "column140");
            return (Criteria) this;
        }

        public Criteria andColumn140NotIn(List<String> values) {
            addCriterion("column_140 not in", values, "column140");
            return (Criteria) this;
        }

        public Criteria andColumn140Between(String value1, String value2) {
            addCriterion("column_140 between", value1, value2, "column140");
            return (Criteria) this;
        }

        public Criteria andColumn140NotBetween(String value1, String value2) {
            addCriterion("column_140 not between", value1, value2, "column140");
            return (Criteria) this;
        }

        public Criteria andColumn141IsNull() {
            addCriterion("column_141 is null");
            return (Criteria) this;
        }

        public Criteria andColumn141IsNotNull() {
            addCriterion("column_141 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn141EqualTo(String value) {
            addCriterion("column_141 =", value, "column141");
            return (Criteria) this;
        }

        public Criteria andColumn141NotEqualTo(String value) {
            addCriterion("column_141 <>", value, "column141");
            return (Criteria) this;
        }

        public Criteria andColumn141GreaterThan(String value) {
            addCriterion("column_141 >", value, "column141");
            return (Criteria) this;
        }

        public Criteria andColumn141GreaterThanOrEqualTo(String value) {
            addCriterion("column_141 >=", value, "column141");
            return (Criteria) this;
        }

        public Criteria andColumn141LessThan(String value) {
            addCriterion("column_141 <", value, "column141");
            return (Criteria) this;
        }

        public Criteria andColumn141LessThanOrEqualTo(String value) {
            addCriterion("column_141 <=", value, "column141");
            return (Criteria) this;
        }

        public Criteria andColumn141Like(String value) {
            addCriterion("column_141 like", value, "column141");
            return (Criteria) this;
        }

        public Criteria andColumn141NotLike(String value) {
            addCriterion("column_141 not like", value, "column141");
            return (Criteria) this;
        }

        public Criteria andColumn141In(List<String> values) {
            addCriterion("column_141 in", values, "column141");
            return (Criteria) this;
        }

        public Criteria andColumn141NotIn(List<String> values) {
            addCriterion("column_141 not in", values, "column141");
            return (Criteria) this;
        }

        public Criteria andColumn141Between(String value1, String value2) {
            addCriterion("column_141 between", value1, value2, "column141");
            return (Criteria) this;
        }

        public Criteria andColumn141NotBetween(String value1, String value2) {
            addCriterion("column_141 not between", value1, value2, "column141");
            return (Criteria) this;
        }

        public Criteria andColumn142IsNull() {
            addCriterion("column_142 is null");
            return (Criteria) this;
        }

        public Criteria andColumn142IsNotNull() {
            addCriterion("column_142 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn142EqualTo(String value) {
            addCriterion("column_142 =", value, "column142");
            return (Criteria) this;
        }

        public Criteria andColumn142NotEqualTo(String value) {
            addCriterion("column_142 <>", value, "column142");
            return (Criteria) this;
        }

        public Criteria andColumn142GreaterThan(String value) {
            addCriterion("column_142 >", value, "column142");
            return (Criteria) this;
        }

        public Criteria andColumn142GreaterThanOrEqualTo(String value) {
            addCriterion("column_142 >=", value, "column142");
            return (Criteria) this;
        }

        public Criteria andColumn142LessThan(String value) {
            addCriterion("column_142 <", value, "column142");
            return (Criteria) this;
        }

        public Criteria andColumn142LessThanOrEqualTo(String value) {
            addCriterion("column_142 <=", value, "column142");
            return (Criteria) this;
        }

        public Criteria andColumn142Like(String value) {
            addCriterion("column_142 like", value, "column142");
            return (Criteria) this;
        }

        public Criteria andColumn142NotLike(String value) {
            addCriterion("column_142 not like", value, "column142");
            return (Criteria) this;
        }

        public Criteria andColumn142In(List<String> values) {
            addCriterion("column_142 in", values, "column142");
            return (Criteria) this;
        }

        public Criteria andColumn142NotIn(List<String> values) {
            addCriterion("column_142 not in", values, "column142");
            return (Criteria) this;
        }

        public Criteria andColumn142Between(String value1, String value2) {
            addCriterion("column_142 between", value1, value2, "column142");
            return (Criteria) this;
        }

        public Criteria andColumn142NotBetween(String value1, String value2) {
            addCriterion("column_142 not between", value1, value2, "column142");
            return (Criteria) this;
        }

        public Criteria andColumn143IsNull() {
            addCriterion("column_143 is null");
            return (Criteria) this;
        }

        public Criteria andColumn143IsNotNull() {
            addCriterion("column_143 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn143EqualTo(String value) {
            addCriterion("column_143 =", value, "column143");
            return (Criteria) this;
        }

        public Criteria andColumn143NotEqualTo(String value) {
            addCriterion("column_143 <>", value, "column143");
            return (Criteria) this;
        }

        public Criteria andColumn143GreaterThan(String value) {
            addCriterion("column_143 >", value, "column143");
            return (Criteria) this;
        }

        public Criteria andColumn143GreaterThanOrEqualTo(String value) {
            addCriterion("column_143 >=", value, "column143");
            return (Criteria) this;
        }

        public Criteria andColumn143LessThan(String value) {
            addCriterion("column_143 <", value, "column143");
            return (Criteria) this;
        }

        public Criteria andColumn143LessThanOrEqualTo(String value) {
            addCriterion("column_143 <=", value, "column143");
            return (Criteria) this;
        }

        public Criteria andColumn143Like(String value) {
            addCriterion("column_143 like", value, "column143");
            return (Criteria) this;
        }

        public Criteria andColumn143NotLike(String value) {
            addCriterion("column_143 not like", value, "column143");
            return (Criteria) this;
        }

        public Criteria andColumn143In(List<String> values) {
            addCriterion("column_143 in", values, "column143");
            return (Criteria) this;
        }

        public Criteria andColumn143NotIn(List<String> values) {
            addCriterion("column_143 not in", values, "column143");
            return (Criteria) this;
        }

        public Criteria andColumn143Between(String value1, String value2) {
            addCriterion("column_143 between", value1, value2, "column143");
            return (Criteria) this;
        }

        public Criteria andColumn143NotBetween(String value1, String value2) {
            addCriterion("column_143 not between", value1, value2, "column143");
            return (Criteria) this;
        }

        public Criteria andColumn144IsNull() {
            addCriterion("column_144 is null");
            return (Criteria) this;
        }

        public Criteria andColumn144IsNotNull() {
            addCriterion("column_144 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn144EqualTo(String value) {
            addCriterion("column_144 =", value, "column144");
            return (Criteria) this;
        }

        public Criteria andColumn144NotEqualTo(String value) {
            addCriterion("column_144 <>", value, "column144");
            return (Criteria) this;
        }

        public Criteria andColumn144GreaterThan(String value) {
            addCriterion("column_144 >", value, "column144");
            return (Criteria) this;
        }

        public Criteria andColumn144GreaterThanOrEqualTo(String value) {
            addCriterion("column_144 >=", value, "column144");
            return (Criteria) this;
        }

        public Criteria andColumn144LessThan(String value) {
            addCriterion("column_144 <", value, "column144");
            return (Criteria) this;
        }

        public Criteria andColumn144LessThanOrEqualTo(String value) {
            addCriterion("column_144 <=", value, "column144");
            return (Criteria) this;
        }

        public Criteria andColumn144Like(String value) {
            addCriterion("column_144 like", value, "column144");
            return (Criteria) this;
        }

        public Criteria andColumn144NotLike(String value) {
            addCriterion("column_144 not like", value, "column144");
            return (Criteria) this;
        }

        public Criteria andColumn144In(List<String> values) {
            addCriterion("column_144 in", values, "column144");
            return (Criteria) this;
        }

        public Criteria andColumn144NotIn(List<String> values) {
            addCriterion("column_144 not in", values, "column144");
            return (Criteria) this;
        }

        public Criteria andColumn144Between(String value1, String value2) {
            addCriterion("column_144 between", value1, value2, "column144");
            return (Criteria) this;
        }

        public Criteria andColumn144NotBetween(String value1, String value2) {
            addCriterion("column_144 not between", value1, value2, "column144");
            return (Criteria) this;
        }

        public Criteria andColumn145IsNull() {
            addCriterion("column_145 is null");
            return (Criteria) this;
        }

        public Criteria andColumn145IsNotNull() {
            addCriterion("column_145 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn145EqualTo(String value) {
            addCriterion("column_145 =", value, "column145");
            return (Criteria) this;
        }

        public Criteria andColumn145NotEqualTo(String value) {
            addCriterion("column_145 <>", value, "column145");
            return (Criteria) this;
        }

        public Criteria andColumn145GreaterThan(String value) {
            addCriterion("column_145 >", value, "column145");
            return (Criteria) this;
        }

        public Criteria andColumn145GreaterThanOrEqualTo(String value) {
            addCriterion("column_145 >=", value, "column145");
            return (Criteria) this;
        }

        public Criteria andColumn145LessThan(String value) {
            addCriterion("column_145 <", value, "column145");
            return (Criteria) this;
        }

        public Criteria andColumn145LessThanOrEqualTo(String value) {
            addCriterion("column_145 <=", value, "column145");
            return (Criteria) this;
        }

        public Criteria andColumn145Like(String value) {
            addCriterion("column_145 like", value, "column145");
            return (Criteria) this;
        }

        public Criteria andColumn145NotLike(String value) {
            addCriterion("column_145 not like", value, "column145");
            return (Criteria) this;
        }

        public Criteria andColumn145In(List<String> values) {
            addCriterion("column_145 in", values, "column145");
            return (Criteria) this;
        }

        public Criteria andColumn145NotIn(List<String> values) {
            addCriterion("column_145 not in", values, "column145");
            return (Criteria) this;
        }

        public Criteria andColumn145Between(String value1, String value2) {
            addCriterion("column_145 between", value1, value2, "column145");
            return (Criteria) this;
        }

        public Criteria andColumn145NotBetween(String value1, String value2) {
            addCriterion("column_145 not between", value1, value2, "column145");
            return (Criteria) this;
        }

        public Criteria andColumn146IsNull() {
            addCriterion("column_146 is null");
            return (Criteria) this;
        }

        public Criteria andColumn146IsNotNull() {
            addCriterion("column_146 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn146EqualTo(String value) {
            addCriterion("column_146 =", value, "column146");
            return (Criteria) this;
        }

        public Criteria andColumn146NotEqualTo(String value) {
            addCriterion("column_146 <>", value, "column146");
            return (Criteria) this;
        }

        public Criteria andColumn146GreaterThan(String value) {
            addCriterion("column_146 >", value, "column146");
            return (Criteria) this;
        }

        public Criteria andColumn146GreaterThanOrEqualTo(String value) {
            addCriterion("column_146 >=", value, "column146");
            return (Criteria) this;
        }

        public Criteria andColumn146LessThan(String value) {
            addCriterion("column_146 <", value, "column146");
            return (Criteria) this;
        }

        public Criteria andColumn146LessThanOrEqualTo(String value) {
            addCriterion("column_146 <=", value, "column146");
            return (Criteria) this;
        }

        public Criteria andColumn146Like(String value) {
            addCriterion("column_146 like", value, "column146");
            return (Criteria) this;
        }

        public Criteria andColumn146NotLike(String value) {
            addCriterion("column_146 not like", value, "column146");
            return (Criteria) this;
        }

        public Criteria andColumn146In(List<String> values) {
            addCriterion("column_146 in", values, "column146");
            return (Criteria) this;
        }

        public Criteria andColumn146NotIn(List<String> values) {
            addCriterion("column_146 not in", values, "column146");
            return (Criteria) this;
        }

        public Criteria andColumn146Between(String value1, String value2) {
            addCriterion("column_146 between", value1, value2, "column146");
            return (Criteria) this;
        }

        public Criteria andColumn146NotBetween(String value1, String value2) {
            addCriterion("column_146 not between", value1, value2, "column146");
            return (Criteria) this;
        }

        public Criteria andColumn147IsNull() {
            addCriterion("column_147 is null");
            return (Criteria) this;
        }

        public Criteria andColumn147IsNotNull() {
            addCriterion("column_147 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn147EqualTo(String value) {
            addCriterion("column_147 =", value, "column147");
            return (Criteria) this;
        }

        public Criteria andColumn147NotEqualTo(String value) {
            addCriterion("column_147 <>", value, "column147");
            return (Criteria) this;
        }

        public Criteria andColumn147GreaterThan(String value) {
            addCriterion("column_147 >", value, "column147");
            return (Criteria) this;
        }

        public Criteria andColumn147GreaterThanOrEqualTo(String value) {
            addCriterion("column_147 >=", value, "column147");
            return (Criteria) this;
        }

        public Criteria andColumn147LessThan(String value) {
            addCriterion("column_147 <", value, "column147");
            return (Criteria) this;
        }

        public Criteria andColumn147LessThanOrEqualTo(String value) {
            addCriterion("column_147 <=", value, "column147");
            return (Criteria) this;
        }

        public Criteria andColumn147Like(String value) {
            addCriterion("column_147 like", value, "column147");
            return (Criteria) this;
        }

        public Criteria andColumn147NotLike(String value) {
            addCriterion("column_147 not like", value, "column147");
            return (Criteria) this;
        }

        public Criteria andColumn147In(List<String> values) {
            addCriterion("column_147 in", values, "column147");
            return (Criteria) this;
        }

        public Criteria andColumn147NotIn(List<String> values) {
            addCriterion("column_147 not in", values, "column147");
            return (Criteria) this;
        }

        public Criteria andColumn147Between(String value1, String value2) {
            addCriterion("column_147 between", value1, value2, "column147");
            return (Criteria) this;
        }

        public Criteria andColumn147NotBetween(String value1, String value2) {
            addCriterion("column_147 not between", value1, value2, "column147");
            return (Criteria) this;
        }

        public Criteria andColumn148IsNull() {
            addCriterion("column_148 is null");
            return (Criteria) this;
        }

        public Criteria andColumn148IsNotNull() {
            addCriterion("column_148 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn148EqualTo(String value) {
            addCriterion("column_148 =", value, "column148");
            return (Criteria) this;
        }

        public Criteria andColumn148NotEqualTo(String value) {
            addCriterion("column_148 <>", value, "column148");
            return (Criteria) this;
        }

        public Criteria andColumn148GreaterThan(String value) {
            addCriterion("column_148 >", value, "column148");
            return (Criteria) this;
        }

        public Criteria andColumn148GreaterThanOrEqualTo(String value) {
            addCriterion("column_148 >=", value, "column148");
            return (Criteria) this;
        }

        public Criteria andColumn148LessThan(String value) {
            addCriterion("column_148 <", value, "column148");
            return (Criteria) this;
        }

        public Criteria andColumn148LessThanOrEqualTo(String value) {
            addCriterion("column_148 <=", value, "column148");
            return (Criteria) this;
        }

        public Criteria andColumn148Like(String value) {
            addCriterion("column_148 like", value, "column148");
            return (Criteria) this;
        }

        public Criteria andColumn148NotLike(String value) {
            addCriterion("column_148 not like", value, "column148");
            return (Criteria) this;
        }

        public Criteria andColumn148In(List<String> values) {
            addCriterion("column_148 in", values, "column148");
            return (Criteria) this;
        }

        public Criteria andColumn148NotIn(List<String> values) {
            addCriterion("column_148 not in", values, "column148");
            return (Criteria) this;
        }

        public Criteria andColumn148Between(String value1, String value2) {
            addCriterion("column_148 between", value1, value2, "column148");
            return (Criteria) this;
        }

        public Criteria andColumn148NotBetween(String value1, String value2) {
            addCriterion("column_148 not between", value1, value2, "column148");
            return (Criteria) this;
        }

        public Criteria andColumn149IsNull() {
            addCriterion("column_149 is null");
            return (Criteria) this;
        }

        public Criteria andColumn149IsNotNull() {
            addCriterion("column_149 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn149EqualTo(String value) {
            addCriterion("column_149 =", value, "column149");
            return (Criteria) this;
        }

        public Criteria andColumn149NotEqualTo(String value) {
            addCriterion("column_149 <>", value, "column149");
            return (Criteria) this;
        }

        public Criteria andColumn149GreaterThan(String value) {
            addCriterion("column_149 >", value, "column149");
            return (Criteria) this;
        }

        public Criteria andColumn149GreaterThanOrEqualTo(String value) {
            addCriterion("column_149 >=", value, "column149");
            return (Criteria) this;
        }

        public Criteria andColumn149LessThan(String value) {
            addCriterion("column_149 <", value, "column149");
            return (Criteria) this;
        }

        public Criteria andColumn149LessThanOrEqualTo(String value) {
            addCriterion("column_149 <=", value, "column149");
            return (Criteria) this;
        }

        public Criteria andColumn149Like(String value) {
            addCriterion("column_149 like", value, "column149");
            return (Criteria) this;
        }

        public Criteria andColumn149NotLike(String value) {
            addCriterion("column_149 not like", value, "column149");
            return (Criteria) this;
        }

        public Criteria andColumn149In(List<String> values) {
            addCriterion("column_149 in", values, "column149");
            return (Criteria) this;
        }

        public Criteria andColumn149NotIn(List<String> values) {
            addCriterion("column_149 not in", values, "column149");
            return (Criteria) this;
        }

        public Criteria andColumn149Between(String value1, String value2) {
            addCriterion("column_149 between", value1, value2, "column149");
            return (Criteria) this;
        }

        public Criteria andColumn149NotBetween(String value1, String value2) {
            addCriterion("column_149 not between", value1, value2, "column149");
            return (Criteria) this;
        }

        public Criteria andColumn150IsNull() {
            addCriterion("column_150 is null");
            return (Criteria) this;
        }

        public Criteria andColumn150IsNotNull() {
            addCriterion("column_150 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn150EqualTo(String value) {
            addCriterion("column_150 =", value, "column150");
            return (Criteria) this;
        }

        public Criteria andColumn150NotEqualTo(String value) {
            addCriterion("column_150 <>", value, "column150");
            return (Criteria) this;
        }

        public Criteria andColumn150GreaterThan(String value) {
            addCriterion("column_150 >", value, "column150");
            return (Criteria) this;
        }

        public Criteria andColumn150GreaterThanOrEqualTo(String value) {
            addCriterion("column_150 >=", value, "column150");
            return (Criteria) this;
        }

        public Criteria andColumn150LessThan(String value) {
            addCriterion("column_150 <", value, "column150");
            return (Criteria) this;
        }

        public Criteria andColumn150LessThanOrEqualTo(String value) {
            addCriterion("column_150 <=", value, "column150");
            return (Criteria) this;
        }

        public Criteria andColumn150Like(String value) {
            addCriterion("column_150 like", value, "column150");
            return (Criteria) this;
        }

        public Criteria andColumn150NotLike(String value) {
            addCriterion("column_150 not like", value, "column150");
            return (Criteria) this;
        }

        public Criteria andColumn150In(List<String> values) {
            addCriterion("column_150 in", values, "column150");
            return (Criteria) this;
        }

        public Criteria andColumn150NotIn(List<String> values) {
            addCriterion("column_150 not in", values, "column150");
            return (Criteria) this;
        }

        public Criteria andColumn150Between(String value1, String value2) {
            addCriterion("column_150 between", value1, value2, "column150");
            return (Criteria) this;
        }

        public Criteria andColumn150NotBetween(String value1, String value2) {
            addCriterion("column_150 not between", value1, value2, "column150");
            return (Criteria) this;
        }

        public Criteria andColumn151IsNull() {
            addCriterion("column_151 is null");
            return (Criteria) this;
        }

        public Criteria andColumn151IsNotNull() {
            addCriterion("column_151 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn151EqualTo(String value) {
            addCriterion("column_151 =", value, "column151");
            return (Criteria) this;
        }

        public Criteria andColumn151NotEqualTo(String value) {
            addCriterion("column_151 <>", value, "column151");
            return (Criteria) this;
        }

        public Criteria andColumn151GreaterThan(String value) {
            addCriterion("column_151 >", value, "column151");
            return (Criteria) this;
        }

        public Criteria andColumn151GreaterThanOrEqualTo(String value) {
            addCriterion("column_151 >=", value, "column151");
            return (Criteria) this;
        }

        public Criteria andColumn151LessThan(String value) {
            addCriterion("column_151 <", value, "column151");
            return (Criteria) this;
        }

        public Criteria andColumn151LessThanOrEqualTo(String value) {
            addCriterion("column_151 <=", value, "column151");
            return (Criteria) this;
        }

        public Criteria andColumn151Like(String value) {
            addCriterion("column_151 like", value, "column151");
            return (Criteria) this;
        }

        public Criteria andColumn151NotLike(String value) {
            addCriterion("column_151 not like", value, "column151");
            return (Criteria) this;
        }

        public Criteria andColumn151In(List<String> values) {
            addCriterion("column_151 in", values, "column151");
            return (Criteria) this;
        }

        public Criteria andColumn151NotIn(List<String> values) {
            addCriterion("column_151 not in", values, "column151");
            return (Criteria) this;
        }

        public Criteria andColumn151Between(String value1, String value2) {
            addCriterion("column_151 between", value1, value2, "column151");
            return (Criteria) this;
        }

        public Criteria andColumn151NotBetween(String value1, String value2) {
            addCriterion("column_151 not between", value1, value2, "column151");
            return (Criteria) this;
        }

        public Criteria andColumn152IsNull() {
            addCriterion("column_152 is null");
            return (Criteria) this;
        }

        public Criteria andColumn152IsNotNull() {
            addCriterion("column_152 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn152EqualTo(String value) {
            addCriterion("column_152 =", value, "column152");
            return (Criteria) this;
        }

        public Criteria andColumn152NotEqualTo(String value) {
            addCriterion("column_152 <>", value, "column152");
            return (Criteria) this;
        }

        public Criteria andColumn152GreaterThan(String value) {
            addCriterion("column_152 >", value, "column152");
            return (Criteria) this;
        }

        public Criteria andColumn152GreaterThanOrEqualTo(String value) {
            addCriterion("column_152 >=", value, "column152");
            return (Criteria) this;
        }

        public Criteria andColumn152LessThan(String value) {
            addCriterion("column_152 <", value, "column152");
            return (Criteria) this;
        }

        public Criteria andColumn152LessThanOrEqualTo(String value) {
            addCriterion("column_152 <=", value, "column152");
            return (Criteria) this;
        }

        public Criteria andColumn152Like(String value) {
            addCriterion("column_152 like", value, "column152");
            return (Criteria) this;
        }

        public Criteria andColumn152NotLike(String value) {
            addCriterion("column_152 not like", value, "column152");
            return (Criteria) this;
        }

        public Criteria andColumn152In(List<String> values) {
            addCriterion("column_152 in", values, "column152");
            return (Criteria) this;
        }

        public Criteria andColumn152NotIn(List<String> values) {
            addCriterion("column_152 not in", values, "column152");
            return (Criteria) this;
        }

        public Criteria andColumn152Between(String value1, String value2) {
            addCriterion("column_152 between", value1, value2, "column152");
            return (Criteria) this;
        }

        public Criteria andColumn152NotBetween(String value1, String value2) {
            addCriterion("column_152 not between", value1, value2, "column152");
            return (Criteria) this;
        }

        public Criteria andColumn153IsNull() {
            addCriterion("column_153 is null");
            return (Criteria) this;
        }

        public Criteria andColumn153IsNotNull() {
            addCriterion("column_153 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn153EqualTo(String value) {
            addCriterion("column_153 =", value, "column153");
            return (Criteria) this;
        }

        public Criteria andColumn153NotEqualTo(String value) {
            addCriterion("column_153 <>", value, "column153");
            return (Criteria) this;
        }

        public Criteria andColumn153GreaterThan(String value) {
            addCriterion("column_153 >", value, "column153");
            return (Criteria) this;
        }

        public Criteria andColumn153GreaterThanOrEqualTo(String value) {
            addCriterion("column_153 >=", value, "column153");
            return (Criteria) this;
        }

        public Criteria andColumn153LessThan(String value) {
            addCriterion("column_153 <", value, "column153");
            return (Criteria) this;
        }

        public Criteria andColumn153LessThanOrEqualTo(String value) {
            addCriterion("column_153 <=", value, "column153");
            return (Criteria) this;
        }

        public Criteria andColumn153Like(String value) {
            addCriterion("column_153 like", value, "column153");
            return (Criteria) this;
        }

        public Criteria andColumn153NotLike(String value) {
            addCriterion("column_153 not like", value, "column153");
            return (Criteria) this;
        }

        public Criteria andColumn153In(List<String> values) {
            addCriterion("column_153 in", values, "column153");
            return (Criteria) this;
        }

        public Criteria andColumn153NotIn(List<String> values) {
            addCriterion("column_153 not in", values, "column153");
            return (Criteria) this;
        }

        public Criteria andColumn153Between(String value1, String value2) {
            addCriterion("column_153 between", value1, value2, "column153");
            return (Criteria) this;
        }

        public Criteria andColumn153NotBetween(String value1, String value2) {
            addCriterion("column_153 not between", value1, value2, "column153");
            return (Criteria) this;
        }

        public Criteria andColumn154IsNull() {
            addCriterion("column_154 is null");
            return (Criteria) this;
        }

        public Criteria andColumn154IsNotNull() {
            addCriterion("column_154 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn154EqualTo(String value) {
            addCriterion("column_154 =", value, "column154");
            return (Criteria) this;
        }

        public Criteria andColumn154NotEqualTo(String value) {
            addCriterion("column_154 <>", value, "column154");
            return (Criteria) this;
        }

        public Criteria andColumn154GreaterThan(String value) {
            addCriterion("column_154 >", value, "column154");
            return (Criteria) this;
        }

        public Criteria andColumn154GreaterThanOrEqualTo(String value) {
            addCriterion("column_154 >=", value, "column154");
            return (Criteria) this;
        }

        public Criteria andColumn154LessThan(String value) {
            addCriterion("column_154 <", value, "column154");
            return (Criteria) this;
        }

        public Criteria andColumn154LessThanOrEqualTo(String value) {
            addCriterion("column_154 <=", value, "column154");
            return (Criteria) this;
        }

        public Criteria andColumn154Like(String value) {
            addCriterion("column_154 like", value, "column154");
            return (Criteria) this;
        }

        public Criteria andColumn154NotLike(String value) {
            addCriterion("column_154 not like", value, "column154");
            return (Criteria) this;
        }

        public Criteria andColumn154In(List<String> values) {
            addCriterion("column_154 in", values, "column154");
            return (Criteria) this;
        }

        public Criteria andColumn154NotIn(List<String> values) {
            addCriterion("column_154 not in", values, "column154");
            return (Criteria) this;
        }

        public Criteria andColumn154Between(String value1, String value2) {
            addCriterion("column_154 between", value1, value2, "column154");
            return (Criteria) this;
        }

        public Criteria andColumn154NotBetween(String value1, String value2) {
            addCriterion("column_154 not between", value1, value2, "column154");
            return (Criteria) this;
        }

        public Criteria andColumn155IsNull() {
            addCriterion("column_155 is null");
            return (Criteria) this;
        }

        public Criteria andColumn155IsNotNull() {
            addCriterion("column_155 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn155EqualTo(String value) {
            addCriterion("column_155 =", value, "column155");
            return (Criteria) this;
        }

        public Criteria andColumn155NotEqualTo(String value) {
            addCriterion("column_155 <>", value, "column155");
            return (Criteria) this;
        }

        public Criteria andColumn155GreaterThan(String value) {
            addCriterion("column_155 >", value, "column155");
            return (Criteria) this;
        }

        public Criteria andColumn155GreaterThanOrEqualTo(String value) {
            addCriterion("column_155 >=", value, "column155");
            return (Criteria) this;
        }

        public Criteria andColumn155LessThan(String value) {
            addCriterion("column_155 <", value, "column155");
            return (Criteria) this;
        }

        public Criteria andColumn155LessThanOrEqualTo(String value) {
            addCriterion("column_155 <=", value, "column155");
            return (Criteria) this;
        }

        public Criteria andColumn155Like(String value) {
            addCriterion("column_155 like", value, "column155");
            return (Criteria) this;
        }

        public Criteria andColumn155NotLike(String value) {
            addCriterion("column_155 not like", value, "column155");
            return (Criteria) this;
        }

        public Criteria andColumn155In(List<String> values) {
            addCriterion("column_155 in", values, "column155");
            return (Criteria) this;
        }

        public Criteria andColumn155NotIn(List<String> values) {
            addCriterion("column_155 not in", values, "column155");
            return (Criteria) this;
        }

        public Criteria andColumn155Between(String value1, String value2) {
            addCriterion("column_155 between", value1, value2, "column155");
            return (Criteria) this;
        }

        public Criteria andColumn155NotBetween(String value1, String value2) {
            addCriterion("column_155 not between", value1, value2, "column155");
            return (Criteria) this;
        }

        public Criteria andColumn156IsNull() {
            addCriterion("column_156 is null");
            return (Criteria) this;
        }

        public Criteria andColumn156IsNotNull() {
            addCriterion("column_156 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn156EqualTo(String value) {
            addCriterion("column_156 =", value, "column156");
            return (Criteria) this;
        }

        public Criteria andColumn156NotEqualTo(String value) {
            addCriterion("column_156 <>", value, "column156");
            return (Criteria) this;
        }

        public Criteria andColumn156GreaterThan(String value) {
            addCriterion("column_156 >", value, "column156");
            return (Criteria) this;
        }

        public Criteria andColumn156GreaterThanOrEqualTo(String value) {
            addCriterion("column_156 >=", value, "column156");
            return (Criteria) this;
        }

        public Criteria andColumn156LessThan(String value) {
            addCriterion("column_156 <", value, "column156");
            return (Criteria) this;
        }

        public Criteria andColumn156LessThanOrEqualTo(String value) {
            addCriterion("column_156 <=", value, "column156");
            return (Criteria) this;
        }

        public Criteria andColumn156Like(String value) {
            addCriterion("column_156 like", value, "column156");
            return (Criteria) this;
        }

        public Criteria andColumn156NotLike(String value) {
            addCriterion("column_156 not like", value, "column156");
            return (Criteria) this;
        }

        public Criteria andColumn156In(List<String> values) {
            addCriterion("column_156 in", values, "column156");
            return (Criteria) this;
        }

        public Criteria andColumn156NotIn(List<String> values) {
            addCriterion("column_156 not in", values, "column156");
            return (Criteria) this;
        }

        public Criteria andColumn156Between(String value1, String value2) {
            addCriterion("column_156 between", value1, value2, "column156");
            return (Criteria) this;
        }

        public Criteria andColumn156NotBetween(String value1, String value2) {
            addCriterion("column_156 not between", value1, value2, "column156");
            return (Criteria) this;
        }

        public Criteria andColumn157IsNull() {
            addCriterion("column_157 is null");
            return (Criteria) this;
        }

        public Criteria andColumn157IsNotNull() {
            addCriterion("column_157 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn157EqualTo(String value) {
            addCriterion("column_157 =", value, "column157");
            return (Criteria) this;
        }

        public Criteria andColumn157NotEqualTo(String value) {
            addCriterion("column_157 <>", value, "column157");
            return (Criteria) this;
        }

        public Criteria andColumn157GreaterThan(String value) {
            addCriterion("column_157 >", value, "column157");
            return (Criteria) this;
        }

        public Criteria andColumn157GreaterThanOrEqualTo(String value) {
            addCriterion("column_157 >=", value, "column157");
            return (Criteria) this;
        }

        public Criteria andColumn157LessThan(String value) {
            addCriterion("column_157 <", value, "column157");
            return (Criteria) this;
        }

        public Criteria andColumn157LessThanOrEqualTo(String value) {
            addCriterion("column_157 <=", value, "column157");
            return (Criteria) this;
        }

        public Criteria andColumn157Like(String value) {
            addCriterion("column_157 like", value, "column157");
            return (Criteria) this;
        }

        public Criteria andColumn157NotLike(String value) {
            addCriterion("column_157 not like", value, "column157");
            return (Criteria) this;
        }

        public Criteria andColumn157In(List<String> values) {
            addCriterion("column_157 in", values, "column157");
            return (Criteria) this;
        }

        public Criteria andColumn157NotIn(List<String> values) {
            addCriterion("column_157 not in", values, "column157");
            return (Criteria) this;
        }

        public Criteria andColumn157Between(String value1, String value2) {
            addCriterion("column_157 between", value1, value2, "column157");
            return (Criteria) this;
        }

        public Criteria andColumn157NotBetween(String value1, String value2) {
            addCriterion("column_157 not between", value1, value2, "column157");
            return (Criteria) this;
        }

        public Criteria andColumn158IsNull() {
            addCriterion("column_158 is null");
            return (Criteria) this;
        }

        public Criteria andColumn158IsNotNull() {
            addCriterion("column_158 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn158EqualTo(String value) {
            addCriterion("column_158 =", value, "column158");
            return (Criteria) this;
        }

        public Criteria andColumn158NotEqualTo(String value) {
            addCriterion("column_158 <>", value, "column158");
            return (Criteria) this;
        }

        public Criteria andColumn158GreaterThan(String value) {
            addCriterion("column_158 >", value, "column158");
            return (Criteria) this;
        }

        public Criteria andColumn158GreaterThanOrEqualTo(String value) {
            addCriterion("column_158 >=", value, "column158");
            return (Criteria) this;
        }

        public Criteria andColumn158LessThan(String value) {
            addCriterion("column_158 <", value, "column158");
            return (Criteria) this;
        }

        public Criteria andColumn158LessThanOrEqualTo(String value) {
            addCriterion("column_158 <=", value, "column158");
            return (Criteria) this;
        }

        public Criteria andColumn158Like(String value) {
            addCriterion("column_158 like", value, "column158");
            return (Criteria) this;
        }

        public Criteria andColumn158NotLike(String value) {
            addCriterion("column_158 not like", value, "column158");
            return (Criteria) this;
        }

        public Criteria andColumn158In(List<String> values) {
            addCriterion("column_158 in", values, "column158");
            return (Criteria) this;
        }

        public Criteria andColumn158NotIn(List<String> values) {
            addCriterion("column_158 not in", values, "column158");
            return (Criteria) this;
        }

        public Criteria andColumn158Between(String value1, String value2) {
            addCriterion("column_158 between", value1, value2, "column158");
            return (Criteria) this;
        }

        public Criteria andColumn158NotBetween(String value1, String value2) {
            addCriterion("column_158 not between", value1, value2, "column158");
            return (Criteria) this;
        }

        public Criteria andColumn159IsNull() {
            addCriterion("column_159 is null");
            return (Criteria) this;
        }

        public Criteria andColumn159IsNotNull() {
            addCriterion("column_159 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn159EqualTo(String value) {
            addCriterion("column_159 =", value, "column159");
            return (Criteria) this;
        }

        public Criteria andColumn159NotEqualTo(String value) {
            addCriterion("column_159 <>", value, "column159");
            return (Criteria) this;
        }

        public Criteria andColumn159GreaterThan(String value) {
            addCriterion("column_159 >", value, "column159");
            return (Criteria) this;
        }

        public Criteria andColumn159GreaterThanOrEqualTo(String value) {
            addCriterion("column_159 >=", value, "column159");
            return (Criteria) this;
        }

        public Criteria andColumn159LessThan(String value) {
            addCriterion("column_159 <", value, "column159");
            return (Criteria) this;
        }

        public Criteria andColumn159LessThanOrEqualTo(String value) {
            addCriterion("column_159 <=", value, "column159");
            return (Criteria) this;
        }

        public Criteria andColumn159Like(String value) {
            addCriterion("column_159 like", value, "column159");
            return (Criteria) this;
        }

        public Criteria andColumn159NotLike(String value) {
            addCriterion("column_159 not like", value, "column159");
            return (Criteria) this;
        }

        public Criteria andColumn159In(List<String> values) {
            addCriterion("column_159 in", values, "column159");
            return (Criteria) this;
        }

        public Criteria andColumn159NotIn(List<String> values) {
            addCriterion("column_159 not in", values, "column159");
            return (Criteria) this;
        }

        public Criteria andColumn159Between(String value1, String value2) {
            addCriterion("column_159 between", value1, value2, "column159");
            return (Criteria) this;
        }

        public Criteria andColumn159NotBetween(String value1, String value2) {
            addCriterion("column_159 not between", value1, value2, "column159");
            return (Criteria) this;
        }

        public Criteria andColumn160IsNull() {
            addCriterion("column_160 is null");
            return (Criteria) this;
        }

        public Criteria andColumn160IsNotNull() {
            addCriterion("column_160 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn160EqualTo(String value) {
            addCriterion("column_160 =", value, "column160");
            return (Criteria) this;
        }

        public Criteria andColumn160NotEqualTo(String value) {
            addCriterion("column_160 <>", value, "column160");
            return (Criteria) this;
        }

        public Criteria andColumn160GreaterThan(String value) {
            addCriterion("column_160 >", value, "column160");
            return (Criteria) this;
        }

        public Criteria andColumn160GreaterThanOrEqualTo(String value) {
            addCriterion("column_160 >=", value, "column160");
            return (Criteria) this;
        }

        public Criteria andColumn160LessThan(String value) {
            addCriterion("column_160 <", value, "column160");
            return (Criteria) this;
        }

        public Criteria andColumn160LessThanOrEqualTo(String value) {
            addCriterion("column_160 <=", value, "column160");
            return (Criteria) this;
        }

        public Criteria andColumn160Like(String value) {
            addCriterion("column_160 like", value, "column160");
            return (Criteria) this;
        }

        public Criteria andColumn160NotLike(String value) {
            addCriterion("column_160 not like", value, "column160");
            return (Criteria) this;
        }

        public Criteria andColumn160In(List<String> values) {
            addCriterion("column_160 in", values, "column160");
            return (Criteria) this;
        }

        public Criteria andColumn160NotIn(List<String> values) {
            addCriterion("column_160 not in", values, "column160");
            return (Criteria) this;
        }

        public Criteria andColumn160Between(String value1, String value2) {
            addCriterion("column_160 between", value1, value2, "column160");
            return (Criteria) this;
        }

        public Criteria andColumn160NotBetween(String value1, String value2) {
            addCriterion("column_160 not between", value1, value2, "column160");
            return (Criteria) this;
        }

        public Criteria andColumn161IsNull() {
            addCriterion("column_161 is null");
            return (Criteria) this;
        }

        public Criteria andColumn161IsNotNull() {
            addCriterion("column_161 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn161EqualTo(String value) {
            addCriterion("column_161 =", value, "column161");
            return (Criteria) this;
        }

        public Criteria andColumn161NotEqualTo(String value) {
            addCriterion("column_161 <>", value, "column161");
            return (Criteria) this;
        }

        public Criteria andColumn161GreaterThan(String value) {
            addCriterion("column_161 >", value, "column161");
            return (Criteria) this;
        }

        public Criteria andColumn161GreaterThanOrEqualTo(String value) {
            addCriterion("column_161 >=", value, "column161");
            return (Criteria) this;
        }

        public Criteria andColumn161LessThan(String value) {
            addCriterion("column_161 <", value, "column161");
            return (Criteria) this;
        }

        public Criteria andColumn161LessThanOrEqualTo(String value) {
            addCriterion("column_161 <=", value, "column161");
            return (Criteria) this;
        }

        public Criteria andColumn161Like(String value) {
            addCriterion("column_161 like", value, "column161");
            return (Criteria) this;
        }

        public Criteria andColumn161NotLike(String value) {
            addCriterion("column_161 not like", value, "column161");
            return (Criteria) this;
        }

        public Criteria andColumn161In(List<String> values) {
            addCriterion("column_161 in", values, "column161");
            return (Criteria) this;
        }

        public Criteria andColumn161NotIn(List<String> values) {
            addCriterion("column_161 not in", values, "column161");
            return (Criteria) this;
        }

        public Criteria andColumn161Between(String value1, String value2) {
            addCriterion("column_161 between", value1, value2, "column161");
            return (Criteria) this;
        }

        public Criteria andColumn161NotBetween(String value1, String value2) {
            addCriterion("column_161 not between", value1, value2, "column161");
            return (Criteria) this;
        }

        public Criteria andColumn162IsNull() {
            addCriterion("column_162 is null");
            return (Criteria) this;
        }

        public Criteria andColumn162IsNotNull() {
            addCriterion("column_162 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn162EqualTo(String value) {
            addCriterion("column_162 =", value, "column162");
            return (Criteria) this;
        }

        public Criteria andColumn162NotEqualTo(String value) {
            addCriterion("column_162 <>", value, "column162");
            return (Criteria) this;
        }

        public Criteria andColumn162GreaterThan(String value) {
            addCriterion("column_162 >", value, "column162");
            return (Criteria) this;
        }

        public Criteria andColumn162GreaterThanOrEqualTo(String value) {
            addCriterion("column_162 >=", value, "column162");
            return (Criteria) this;
        }

        public Criteria andColumn162LessThan(String value) {
            addCriterion("column_162 <", value, "column162");
            return (Criteria) this;
        }

        public Criteria andColumn162LessThanOrEqualTo(String value) {
            addCriterion("column_162 <=", value, "column162");
            return (Criteria) this;
        }

        public Criteria andColumn162Like(String value) {
            addCriterion("column_162 like", value, "column162");
            return (Criteria) this;
        }

        public Criteria andColumn162NotLike(String value) {
            addCriterion("column_162 not like", value, "column162");
            return (Criteria) this;
        }

        public Criteria andColumn162In(List<String> values) {
            addCriterion("column_162 in", values, "column162");
            return (Criteria) this;
        }

        public Criteria andColumn162NotIn(List<String> values) {
            addCriterion("column_162 not in", values, "column162");
            return (Criteria) this;
        }

        public Criteria andColumn162Between(String value1, String value2) {
            addCriterion("column_162 between", value1, value2, "column162");
            return (Criteria) this;
        }

        public Criteria andColumn162NotBetween(String value1, String value2) {
            addCriterion("column_162 not between", value1, value2, "column162");
            return (Criteria) this;
        }

        public Criteria andColumn163IsNull() {
            addCriterion("column_163 is null");
            return (Criteria) this;
        }

        public Criteria andColumn163IsNotNull() {
            addCriterion("column_163 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn163EqualTo(String value) {
            addCriterion("column_163 =", value, "column163");
            return (Criteria) this;
        }

        public Criteria andColumn163NotEqualTo(String value) {
            addCriterion("column_163 <>", value, "column163");
            return (Criteria) this;
        }

        public Criteria andColumn163GreaterThan(String value) {
            addCriterion("column_163 >", value, "column163");
            return (Criteria) this;
        }

        public Criteria andColumn163GreaterThanOrEqualTo(String value) {
            addCriterion("column_163 >=", value, "column163");
            return (Criteria) this;
        }

        public Criteria andColumn163LessThan(String value) {
            addCriterion("column_163 <", value, "column163");
            return (Criteria) this;
        }

        public Criteria andColumn163LessThanOrEqualTo(String value) {
            addCriterion("column_163 <=", value, "column163");
            return (Criteria) this;
        }

        public Criteria andColumn163Like(String value) {
            addCriterion("column_163 like", value, "column163");
            return (Criteria) this;
        }

        public Criteria andColumn163NotLike(String value) {
            addCriterion("column_163 not like", value, "column163");
            return (Criteria) this;
        }

        public Criteria andColumn163In(List<String> values) {
            addCriterion("column_163 in", values, "column163");
            return (Criteria) this;
        }

        public Criteria andColumn163NotIn(List<String> values) {
            addCriterion("column_163 not in", values, "column163");
            return (Criteria) this;
        }

        public Criteria andColumn163Between(String value1, String value2) {
            addCriterion("column_163 between", value1, value2, "column163");
            return (Criteria) this;
        }

        public Criteria andColumn163NotBetween(String value1, String value2) {
            addCriterion("column_163 not between", value1, value2, "column163");
            return (Criteria) this;
        }

        public Criteria andColumn164IsNull() {
            addCriterion("column_164 is null");
            return (Criteria) this;
        }

        public Criteria andColumn164IsNotNull() {
            addCriterion("column_164 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn164EqualTo(String value) {
            addCriterion("column_164 =", value, "column164");
            return (Criteria) this;
        }

        public Criteria andColumn164NotEqualTo(String value) {
            addCriterion("column_164 <>", value, "column164");
            return (Criteria) this;
        }

        public Criteria andColumn164GreaterThan(String value) {
            addCriterion("column_164 >", value, "column164");
            return (Criteria) this;
        }

        public Criteria andColumn164GreaterThanOrEqualTo(String value) {
            addCriterion("column_164 >=", value, "column164");
            return (Criteria) this;
        }

        public Criteria andColumn164LessThan(String value) {
            addCriterion("column_164 <", value, "column164");
            return (Criteria) this;
        }

        public Criteria andColumn164LessThanOrEqualTo(String value) {
            addCriterion("column_164 <=", value, "column164");
            return (Criteria) this;
        }

        public Criteria andColumn164Like(String value) {
            addCriterion("column_164 like", value, "column164");
            return (Criteria) this;
        }

        public Criteria andColumn164NotLike(String value) {
            addCriterion("column_164 not like", value, "column164");
            return (Criteria) this;
        }

        public Criteria andColumn164In(List<String> values) {
            addCriterion("column_164 in", values, "column164");
            return (Criteria) this;
        }

        public Criteria andColumn164NotIn(List<String> values) {
            addCriterion("column_164 not in", values, "column164");
            return (Criteria) this;
        }

        public Criteria andColumn164Between(String value1, String value2) {
            addCriterion("column_164 between", value1, value2, "column164");
            return (Criteria) this;
        }

        public Criteria andColumn164NotBetween(String value1, String value2) {
            addCriterion("column_164 not between", value1, value2, "column164");
            return (Criteria) this;
        }

        public Criteria andColumn165IsNull() {
            addCriterion("column_165 is null");
            return (Criteria) this;
        }

        public Criteria andColumn165IsNotNull() {
            addCriterion("column_165 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn165EqualTo(String value) {
            addCriterion("column_165 =", value, "column165");
            return (Criteria) this;
        }

        public Criteria andColumn165NotEqualTo(String value) {
            addCriterion("column_165 <>", value, "column165");
            return (Criteria) this;
        }

        public Criteria andColumn165GreaterThan(String value) {
            addCriterion("column_165 >", value, "column165");
            return (Criteria) this;
        }

        public Criteria andColumn165GreaterThanOrEqualTo(String value) {
            addCriterion("column_165 >=", value, "column165");
            return (Criteria) this;
        }

        public Criteria andColumn165LessThan(String value) {
            addCriterion("column_165 <", value, "column165");
            return (Criteria) this;
        }

        public Criteria andColumn165LessThanOrEqualTo(String value) {
            addCriterion("column_165 <=", value, "column165");
            return (Criteria) this;
        }

        public Criteria andColumn165Like(String value) {
            addCriterion("column_165 like", value, "column165");
            return (Criteria) this;
        }

        public Criteria andColumn165NotLike(String value) {
            addCriterion("column_165 not like", value, "column165");
            return (Criteria) this;
        }

        public Criteria andColumn165In(List<String> values) {
            addCriterion("column_165 in", values, "column165");
            return (Criteria) this;
        }

        public Criteria andColumn165NotIn(List<String> values) {
            addCriterion("column_165 not in", values, "column165");
            return (Criteria) this;
        }

        public Criteria andColumn165Between(String value1, String value2) {
            addCriterion("column_165 between", value1, value2, "column165");
            return (Criteria) this;
        }

        public Criteria andColumn165NotBetween(String value1, String value2) {
            addCriterion("column_165 not between", value1, value2, "column165");
            return (Criteria) this;
        }

        public Criteria andColumn166IsNull() {
            addCriterion("column_166 is null");
            return (Criteria) this;
        }

        public Criteria andColumn166IsNotNull() {
            addCriterion("column_166 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn166EqualTo(String value) {
            addCriterion("column_166 =", value, "column166");
            return (Criteria) this;
        }

        public Criteria andColumn166NotEqualTo(String value) {
            addCriterion("column_166 <>", value, "column166");
            return (Criteria) this;
        }

        public Criteria andColumn166GreaterThan(String value) {
            addCriterion("column_166 >", value, "column166");
            return (Criteria) this;
        }

        public Criteria andColumn166GreaterThanOrEqualTo(String value) {
            addCriterion("column_166 >=", value, "column166");
            return (Criteria) this;
        }

        public Criteria andColumn166LessThan(String value) {
            addCriterion("column_166 <", value, "column166");
            return (Criteria) this;
        }

        public Criteria andColumn166LessThanOrEqualTo(String value) {
            addCriterion("column_166 <=", value, "column166");
            return (Criteria) this;
        }

        public Criteria andColumn166Like(String value) {
            addCriterion("column_166 like", value, "column166");
            return (Criteria) this;
        }

        public Criteria andColumn166NotLike(String value) {
            addCriterion("column_166 not like", value, "column166");
            return (Criteria) this;
        }

        public Criteria andColumn166In(List<String> values) {
            addCriterion("column_166 in", values, "column166");
            return (Criteria) this;
        }

        public Criteria andColumn166NotIn(List<String> values) {
            addCriterion("column_166 not in", values, "column166");
            return (Criteria) this;
        }

        public Criteria andColumn166Between(String value1, String value2) {
            addCriterion("column_166 between", value1, value2, "column166");
            return (Criteria) this;
        }

        public Criteria andColumn166NotBetween(String value1, String value2) {
            addCriterion("column_166 not between", value1, value2, "column166");
            return (Criteria) this;
        }

        public Criteria andColumn167IsNull() {
            addCriterion("column_167 is null");
            return (Criteria) this;
        }

        public Criteria andColumn167IsNotNull() {
            addCriterion("column_167 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn167EqualTo(String value) {
            addCriterion("column_167 =", value, "column167");
            return (Criteria) this;
        }

        public Criteria andColumn167NotEqualTo(String value) {
            addCriterion("column_167 <>", value, "column167");
            return (Criteria) this;
        }

        public Criteria andColumn167GreaterThan(String value) {
            addCriterion("column_167 >", value, "column167");
            return (Criteria) this;
        }

        public Criteria andColumn167GreaterThanOrEqualTo(String value) {
            addCriterion("column_167 >=", value, "column167");
            return (Criteria) this;
        }

        public Criteria andColumn167LessThan(String value) {
            addCriterion("column_167 <", value, "column167");
            return (Criteria) this;
        }

        public Criteria andColumn167LessThanOrEqualTo(String value) {
            addCriterion("column_167 <=", value, "column167");
            return (Criteria) this;
        }

        public Criteria andColumn167Like(String value) {
            addCriterion("column_167 like", value, "column167");
            return (Criteria) this;
        }

        public Criteria andColumn167NotLike(String value) {
            addCriterion("column_167 not like", value, "column167");
            return (Criteria) this;
        }

        public Criteria andColumn167In(List<String> values) {
            addCriterion("column_167 in", values, "column167");
            return (Criteria) this;
        }

        public Criteria andColumn167NotIn(List<String> values) {
            addCriterion("column_167 not in", values, "column167");
            return (Criteria) this;
        }

        public Criteria andColumn167Between(String value1, String value2) {
            addCriterion("column_167 between", value1, value2, "column167");
            return (Criteria) this;
        }

        public Criteria andColumn167NotBetween(String value1, String value2) {
            addCriterion("column_167 not between", value1, value2, "column167");
            return (Criteria) this;
        }

        public Criteria andColumn168IsNull() {
            addCriterion("column_168 is null");
            return (Criteria) this;
        }

        public Criteria andColumn168IsNotNull() {
            addCriterion("column_168 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn168EqualTo(String value) {
            addCriterion("column_168 =", value, "column168");
            return (Criteria) this;
        }

        public Criteria andColumn168NotEqualTo(String value) {
            addCriterion("column_168 <>", value, "column168");
            return (Criteria) this;
        }

        public Criteria andColumn168GreaterThan(String value) {
            addCriterion("column_168 >", value, "column168");
            return (Criteria) this;
        }

        public Criteria andColumn168GreaterThanOrEqualTo(String value) {
            addCriterion("column_168 >=", value, "column168");
            return (Criteria) this;
        }

        public Criteria andColumn168LessThan(String value) {
            addCriterion("column_168 <", value, "column168");
            return (Criteria) this;
        }

        public Criteria andColumn168LessThanOrEqualTo(String value) {
            addCriterion("column_168 <=", value, "column168");
            return (Criteria) this;
        }

        public Criteria andColumn168Like(String value) {
            addCriterion("column_168 like", value, "column168");
            return (Criteria) this;
        }

        public Criteria andColumn168NotLike(String value) {
            addCriterion("column_168 not like", value, "column168");
            return (Criteria) this;
        }

        public Criteria andColumn168In(List<String> values) {
            addCriterion("column_168 in", values, "column168");
            return (Criteria) this;
        }

        public Criteria andColumn168NotIn(List<String> values) {
            addCriterion("column_168 not in", values, "column168");
            return (Criteria) this;
        }

        public Criteria andColumn168Between(String value1, String value2) {
            addCriterion("column_168 between", value1, value2, "column168");
            return (Criteria) this;
        }

        public Criteria andColumn168NotBetween(String value1, String value2) {
            addCriterion("column_168 not between", value1, value2, "column168");
            return (Criteria) this;
        }

        public Criteria andColumn169IsNull() {
            addCriterion("column_169 is null");
            return (Criteria) this;
        }

        public Criteria andColumn169IsNotNull() {
            addCriterion("column_169 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn169EqualTo(String value) {
            addCriterion("column_169 =", value, "column169");
            return (Criteria) this;
        }

        public Criteria andColumn169NotEqualTo(String value) {
            addCriterion("column_169 <>", value, "column169");
            return (Criteria) this;
        }

        public Criteria andColumn169GreaterThan(String value) {
            addCriterion("column_169 >", value, "column169");
            return (Criteria) this;
        }

        public Criteria andColumn169GreaterThanOrEqualTo(String value) {
            addCriterion("column_169 >=", value, "column169");
            return (Criteria) this;
        }

        public Criteria andColumn169LessThan(String value) {
            addCriterion("column_169 <", value, "column169");
            return (Criteria) this;
        }

        public Criteria andColumn169LessThanOrEqualTo(String value) {
            addCriterion("column_169 <=", value, "column169");
            return (Criteria) this;
        }

        public Criteria andColumn169Like(String value) {
            addCriterion("column_169 like", value, "column169");
            return (Criteria) this;
        }

        public Criteria andColumn169NotLike(String value) {
            addCriterion("column_169 not like", value, "column169");
            return (Criteria) this;
        }

        public Criteria andColumn169In(List<String> values) {
            addCriterion("column_169 in", values, "column169");
            return (Criteria) this;
        }

        public Criteria andColumn169NotIn(List<String> values) {
            addCriterion("column_169 not in", values, "column169");
            return (Criteria) this;
        }

        public Criteria andColumn169Between(String value1, String value2) {
            addCriterion("column_169 between", value1, value2, "column169");
            return (Criteria) this;
        }

        public Criteria andColumn169NotBetween(String value1, String value2) {
            addCriterion("column_169 not between", value1, value2, "column169");
            return (Criteria) this;
        }

        public Criteria andColumn170IsNull() {
            addCriterion("column_170 is null");
            return (Criteria) this;
        }

        public Criteria andColumn170IsNotNull() {
            addCriterion("column_170 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn170EqualTo(String value) {
            addCriterion("column_170 =", value, "column170");
            return (Criteria) this;
        }

        public Criteria andColumn170NotEqualTo(String value) {
            addCriterion("column_170 <>", value, "column170");
            return (Criteria) this;
        }

        public Criteria andColumn170GreaterThan(String value) {
            addCriterion("column_170 >", value, "column170");
            return (Criteria) this;
        }

        public Criteria andColumn170GreaterThanOrEqualTo(String value) {
            addCriterion("column_170 >=", value, "column170");
            return (Criteria) this;
        }

        public Criteria andColumn170LessThan(String value) {
            addCriterion("column_170 <", value, "column170");
            return (Criteria) this;
        }

        public Criteria andColumn170LessThanOrEqualTo(String value) {
            addCriterion("column_170 <=", value, "column170");
            return (Criteria) this;
        }

        public Criteria andColumn170Like(String value) {
            addCriterion("column_170 like", value, "column170");
            return (Criteria) this;
        }

        public Criteria andColumn170NotLike(String value) {
            addCriterion("column_170 not like", value, "column170");
            return (Criteria) this;
        }

        public Criteria andColumn170In(List<String> values) {
            addCriterion("column_170 in", values, "column170");
            return (Criteria) this;
        }

        public Criteria andColumn170NotIn(List<String> values) {
            addCriterion("column_170 not in", values, "column170");
            return (Criteria) this;
        }

        public Criteria andColumn170Between(String value1, String value2) {
            addCriterion("column_170 between", value1, value2, "column170");
            return (Criteria) this;
        }

        public Criteria andColumn170NotBetween(String value1, String value2) {
            addCriterion("column_170 not between", value1, value2, "column170");
            return (Criteria) this;
        }

        public Criteria andColumn171IsNull() {
            addCriterion("column_171 is null");
            return (Criteria) this;
        }

        public Criteria andColumn171IsNotNull() {
            addCriterion("column_171 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn171EqualTo(String value) {
            addCriterion("column_171 =", value, "column171");
            return (Criteria) this;
        }

        public Criteria andColumn171NotEqualTo(String value) {
            addCriterion("column_171 <>", value, "column171");
            return (Criteria) this;
        }

        public Criteria andColumn171GreaterThan(String value) {
            addCriterion("column_171 >", value, "column171");
            return (Criteria) this;
        }

        public Criteria andColumn171GreaterThanOrEqualTo(String value) {
            addCriterion("column_171 >=", value, "column171");
            return (Criteria) this;
        }

        public Criteria andColumn171LessThan(String value) {
            addCriterion("column_171 <", value, "column171");
            return (Criteria) this;
        }

        public Criteria andColumn171LessThanOrEqualTo(String value) {
            addCriterion("column_171 <=", value, "column171");
            return (Criteria) this;
        }

        public Criteria andColumn171Like(String value) {
            addCriterion("column_171 like", value, "column171");
            return (Criteria) this;
        }

        public Criteria andColumn171NotLike(String value) {
            addCriterion("column_171 not like", value, "column171");
            return (Criteria) this;
        }

        public Criteria andColumn171In(List<String> values) {
            addCriterion("column_171 in", values, "column171");
            return (Criteria) this;
        }

        public Criteria andColumn171NotIn(List<String> values) {
            addCriterion("column_171 not in", values, "column171");
            return (Criteria) this;
        }

        public Criteria andColumn171Between(String value1, String value2) {
            addCriterion("column_171 between", value1, value2, "column171");
            return (Criteria) this;
        }

        public Criteria andColumn171NotBetween(String value1, String value2) {
            addCriterion("column_171 not between", value1, value2, "column171");
            return (Criteria) this;
        }

        public Criteria andColumn172IsNull() {
            addCriterion("column_172 is null");
            return (Criteria) this;
        }

        public Criteria andColumn172IsNotNull() {
            addCriterion("column_172 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn172EqualTo(String value) {
            addCriterion("column_172 =", value, "column172");
            return (Criteria) this;
        }

        public Criteria andColumn172NotEqualTo(String value) {
            addCriterion("column_172 <>", value, "column172");
            return (Criteria) this;
        }

        public Criteria andColumn172GreaterThan(String value) {
            addCriterion("column_172 >", value, "column172");
            return (Criteria) this;
        }

        public Criteria andColumn172GreaterThanOrEqualTo(String value) {
            addCriterion("column_172 >=", value, "column172");
            return (Criteria) this;
        }

        public Criteria andColumn172LessThan(String value) {
            addCriterion("column_172 <", value, "column172");
            return (Criteria) this;
        }

        public Criteria andColumn172LessThanOrEqualTo(String value) {
            addCriterion("column_172 <=", value, "column172");
            return (Criteria) this;
        }

        public Criteria andColumn172Like(String value) {
            addCriterion("column_172 like", value, "column172");
            return (Criteria) this;
        }

        public Criteria andColumn172NotLike(String value) {
            addCriterion("column_172 not like", value, "column172");
            return (Criteria) this;
        }

        public Criteria andColumn172In(List<String> values) {
            addCriterion("column_172 in", values, "column172");
            return (Criteria) this;
        }

        public Criteria andColumn172NotIn(List<String> values) {
            addCriterion("column_172 not in", values, "column172");
            return (Criteria) this;
        }

        public Criteria andColumn172Between(String value1, String value2) {
            addCriterion("column_172 between", value1, value2, "column172");
            return (Criteria) this;
        }

        public Criteria andColumn172NotBetween(String value1, String value2) {
            addCriterion("column_172 not between", value1, value2, "column172");
            return (Criteria) this;
        }

        public Criteria andColumn173IsNull() {
            addCriterion("column_173 is null");
            return (Criteria) this;
        }

        public Criteria andColumn173IsNotNull() {
            addCriterion("column_173 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn173EqualTo(String value) {
            addCriterion("column_173 =", value, "column173");
            return (Criteria) this;
        }

        public Criteria andColumn173NotEqualTo(String value) {
            addCriterion("column_173 <>", value, "column173");
            return (Criteria) this;
        }

        public Criteria andColumn173GreaterThan(String value) {
            addCriterion("column_173 >", value, "column173");
            return (Criteria) this;
        }

        public Criteria andColumn173GreaterThanOrEqualTo(String value) {
            addCriterion("column_173 >=", value, "column173");
            return (Criteria) this;
        }

        public Criteria andColumn173LessThan(String value) {
            addCriterion("column_173 <", value, "column173");
            return (Criteria) this;
        }

        public Criteria andColumn173LessThanOrEqualTo(String value) {
            addCriterion("column_173 <=", value, "column173");
            return (Criteria) this;
        }

        public Criteria andColumn173Like(String value) {
            addCriterion("column_173 like", value, "column173");
            return (Criteria) this;
        }

        public Criteria andColumn173NotLike(String value) {
            addCriterion("column_173 not like", value, "column173");
            return (Criteria) this;
        }

        public Criteria andColumn173In(List<String> values) {
            addCriterion("column_173 in", values, "column173");
            return (Criteria) this;
        }

        public Criteria andColumn173NotIn(List<String> values) {
            addCriterion("column_173 not in", values, "column173");
            return (Criteria) this;
        }

        public Criteria andColumn173Between(String value1, String value2) {
            addCriterion("column_173 between", value1, value2, "column173");
            return (Criteria) this;
        }

        public Criteria andColumn173NotBetween(String value1, String value2) {
            addCriterion("column_173 not between", value1, value2, "column173");
            return (Criteria) this;
        }

        public Criteria andColumn174IsNull() {
            addCriterion("column_174 is null");
            return (Criteria) this;
        }

        public Criteria andColumn174IsNotNull() {
            addCriterion("column_174 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn174EqualTo(String value) {
            addCriterion("column_174 =", value, "column174");
            return (Criteria) this;
        }

        public Criteria andColumn174NotEqualTo(String value) {
            addCriterion("column_174 <>", value, "column174");
            return (Criteria) this;
        }

        public Criteria andColumn174GreaterThan(String value) {
            addCriterion("column_174 >", value, "column174");
            return (Criteria) this;
        }

        public Criteria andColumn174GreaterThanOrEqualTo(String value) {
            addCriterion("column_174 >=", value, "column174");
            return (Criteria) this;
        }

        public Criteria andColumn174LessThan(String value) {
            addCriterion("column_174 <", value, "column174");
            return (Criteria) this;
        }

        public Criteria andColumn174LessThanOrEqualTo(String value) {
            addCriterion("column_174 <=", value, "column174");
            return (Criteria) this;
        }

        public Criteria andColumn174Like(String value) {
            addCriterion("column_174 like", value, "column174");
            return (Criteria) this;
        }

        public Criteria andColumn174NotLike(String value) {
            addCriterion("column_174 not like", value, "column174");
            return (Criteria) this;
        }

        public Criteria andColumn174In(List<String> values) {
            addCriterion("column_174 in", values, "column174");
            return (Criteria) this;
        }

        public Criteria andColumn174NotIn(List<String> values) {
            addCriterion("column_174 not in", values, "column174");
            return (Criteria) this;
        }

        public Criteria andColumn174Between(String value1, String value2) {
            addCriterion("column_174 between", value1, value2, "column174");
            return (Criteria) this;
        }

        public Criteria andColumn174NotBetween(String value1, String value2) {
            addCriterion("column_174 not between", value1, value2, "column174");
            return (Criteria) this;
        }

        public Criteria andColumn175IsNull() {
            addCriterion("column_175 is null");
            return (Criteria) this;
        }

        public Criteria andColumn175IsNotNull() {
            addCriterion("column_175 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn175EqualTo(String value) {
            addCriterion("column_175 =", value, "column175");
            return (Criteria) this;
        }

        public Criteria andColumn175NotEqualTo(String value) {
            addCriterion("column_175 <>", value, "column175");
            return (Criteria) this;
        }

        public Criteria andColumn175GreaterThan(String value) {
            addCriterion("column_175 >", value, "column175");
            return (Criteria) this;
        }

        public Criteria andColumn175GreaterThanOrEqualTo(String value) {
            addCriterion("column_175 >=", value, "column175");
            return (Criteria) this;
        }

        public Criteria andColumn175LessThan(String value) {
            addCriterion("column_175 <", value, "column175");
            return (Criteria) this;
        }

        public Criteria andColumn175LessThanOrEqualTo(String value) {
            addCriterion("column_175 <=", value, "column175");
            return (Criteria) this;
        }

        public Criteria andColumn175Like(String value) {
            addCriterion("column_175 like", value, "column175");
            return (Criteria) this;
        }

        public Criteria andColumn175NotLike(String value) {
            addCriterion("column_175 not like", value, "column175");
            return (Criteria) this;
        }

        public Criteria andColumn175In(List<String> values) {
            addCriterion("column_175 in", values, "column175");
            return (Criteria) this;
        }

        public Criteria andColumn175NotIn(List<String> values) {
            addCriterion("column_175 not in", values, "column175");
            return (Criteria) this;
        }

        public Criteria andColumn175Between(String value1, String value2) {
            addCriterion("column_175 between", value1, value2, "column175");
            return (Criteria) this;
        }

        public Criteria andColumn175NotBetween(String value1, String value2) {
            addCriterion("column_175 not between", value1, value2, "column175");
            return (Criteria) this;
        }

        public Criteria andColumn176IsNull() {
            addCriterion("column_176 is null");
            return (Criteria) this;
        }

        public Criteria andColumn176IsNotNull() {
            addCriterion("column_176 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn176EqualTo(String value) {
            addCriterion("column_176 =", value, "column176");
            return (Criteria) this;
        }

        public Criteria andColumn176NotEqualTo(String value) {
            addCriterion("column_176 <>", value, "column176");
            return (Criteria) this;
        }

        public Criteria andColumn176GreaterThan(String value) {
            addCriterion("column_176 >", value, "column176");
            return (Criteria) this;
        }

        public Criteria andColumn176GreaterThanOrEqualTo(String value) {
            addCriterion("column_176 >=", value, "column176");
            return (Criteria) this;
        }

        public Criteria andColumn176LessThan(String value) {
            addCriterion("column_176 <", value, "column176");
            return (Criteria) this;
        }

        public Criteria andColumn176LessThanOrEqualTo(String value) {
            addCriterion("column_176 <=", value, "column176");
            return (Criteria) this;
        }

        public Criteria andColumn176Like(String value) {
            addCriterion("column_176 like", value, "column176");
            return (Criteria) this;
        }

        public Criteria andColumn176NotLike(String value) {
            addCriterion("column_176 not like", value, "column176");
            return (Criteria) this;
        }

        public Criteria andColumn176In(List<String> values) {
            addCriterion("column_176 in", values, "column176");
            return (Criteria) this;
        }

        public Criteria andColumn176NotIn(List<String> values) {
            addCriterion("column_176 not in", values, "column176");
            return (Criteria) this;
        }

        public Criteria andColumn176Between(String value1, String value2) {
            addCriterion("column_176 between", value1, value2, "column176");
            return (Criteria) this;
        }

        public Criteria andColumn176NotBetween(String value1, String value2) {
            addCriterion("column_176 not between", value1, value2, "column176");
            return (Criteria) this;
        }

        public Criteria andColumn177IsNull() {
            addCriterion("column_177 is null");
            return (Criteria) this;
        }

        public Criteria andColumn177IsNotNull() {
            addCriterion("column_177 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn177EqualTo(String value) {
            addCriterion("column_177 =", value, "column177");
            return (Criteria) this;
        }

        public Criteria andColumn177NotEqualTo(String value) {
            addCriterion("column_177 <>", value, "column177");
            return (Criteria) this;
        }

        public Criteria andColumn177GreaterThan(String value) {
            addCriterion("column_177 >", value, "column177");
            return (Criteria) this;
        }

        public Criteria andColumn177GreaterThanOrEqualTo(String value) {
            addCriterion("column_177 >=", value, "column177");
            return (Criteria) this;
        }

        public Criteria andColumn177LessThan(String value) {
            addCriterion("column_177 <", value, "column177");
            return (Criteria) this;
        }

        public Criteria andColumn177LessThanOrEqualTo(String value) {
            addCriterion("column_177 <=", value, "column177");
            return (Criteria) this;
        }

        public Criteria andColumn177Like(String value) {
            addCriterion("column_177 like", value, "column177");
            return (Criteria) this;
        }

        public Criteria andColumn177NotLike(String value) {
            addCriterion("column_177 not like", value, "column177");
            return (Criteria) this;
        }

        public Criteria andColumn177In(List<String> values) {
            addCriterion("column_177 in", values, "column177");
            return (Criteria) this;
        }

        public Criteria andColumn177NotIn(List<String> values) {
            addCriterion("column_177 not in", values, "column177");
            return (Criteria) this;
        }

        public Criteria andColumn177Between(String value1, String value2) {
            addCriterion("column_177 between", value1, value2, "column177");
            return (Criteria) this;
        }

        public Criteria andColumn177NotBetween(String value1, String value2) {
            addCriterion("column_177 not between", value1, value2, "column177");
            return (Criteria) this;
        }

        public Criteria andColumn178IsNull() {
            addCriterion("column_178 is null");
            return (Criteria) this;
        }

        public Criteria andColumn178IsNotNull() {
            addCriterion("column_178 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn178EqualTo(String value) {
            addCriterion("column_178 =", value, "column178");
            return (Criteria) this;
        }

        public Criteria andColumn178NotEqualTo(String value) {
            addCriterion("column_178 <>", value, "column178");
            return (Criteria) this;
        }

        public Criteria andColumn178GreaterThan(String value) {
            addCriterion("column_178 >", value, "column178");
            return (Criteria) this;
        }

        public Criteria andColumn178GreaterThanOrEqualTo(String value) {
            addCriterion("column_178 >=", value, "column178");
            return (Criteria) this;
        }

        public Criteria andColumn178LessThan(String value) {
            addCriterion("column_178 <", value, "column178");
            return (Criteria) this;
        }

        public Criteria andColumn178LessThanOrEqualTo(String value) {
            addCriterion("column_178 <=", value, "column178");
            return (Criteria) this;
        }

        public Criteria andColumn178Like(String value) {
            addCriterion("column_178 like", value, "column178");
            return (Criteria) this;
        }

        public Criteria andColumn178NotLike(String value) {
            addCriterion("column_178 not like", value, "column178");
            return (Criteria) this;
        }

        public Criteria andColumn178In(List<String> values) {
            addCriterion("column_178 in", values, "column178");
            return (Criteria) this;
        }

        public Criteria andColumn178NotIn(List<String> values) {
            addCriterion("column_178 not in", values, "column178");
            return (Criteria) this;
        }

        public Criteria andColumn178Between(String value1, String value2) {
            addCriterion("column_178 between", value1, value2, "column178");
            return (Criteria) this;
        }

        public Criteria andColumn178NotBetween(String value1, String value2) {
            addCriterion("column_178 not between", value1, value2, "column178");
            return (Criteria) this;
        }

        public Criteria andColumn179IsNull() {
            addCriterion("column_179 is null");
            return (Criteria) this;
        }

        public Criteria andColumn179IsNotNull() {
            addCriterion("column_179 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn179EqualTo(String value) {
            addCriterion("column_179 =", value, "column179");
            return (Criteria) this;
        }

        public Criteria andColumn179NotEqualTo(String value) {
            addCriterion("column_179 <>", value, "column179");
            return (Criteria) this;
        }

        public Criteria andColumn179GreaterThan(String value) {
            addCriterion("column_179 >", value, "column179");
            return (Criteria) this;
        }

        public Criteria andColumn179GreaterThanOrEqualTo(String value) {
            addCriterion("column_179 >=", value, "column179");
            return (Criteria) this;
        }

        public Criteria andColumn179LessThan(String value) {
            addCriterion("column_179 <", value, "column179");
            return (Criteria) this;
        }

        public Criteria andColumn179LessThanOrEqualTo(String value) {
            addCriterion("column_179 <=", value, "column179");
            return (Criteria) this;
        }

        public Criteria andColumn179Like(String value) {
            addCriterion("column_179 like", value, "column179");
            return (Criteria) this;
        }

        public Criteria andColumn179NotLike(String value) {
            addCriterion("column_179 not like", value, "column179");
            return (Criteria) this;
        }

        public Criteria andColumn179In(List<String> values) {
            addCriterion("column_179 in", values, "column179");
            return (Criteria) this;
        }

        public Criteria andColumn179NotIn(List<String> values) {
            addCriterion("column_179 not in", values, "column179");
            return (Criteria) this;
        }

        public Criteria andColumn179Between(String value1, String value2) {
            addCriterion("column_179 between", value1, value2, "column179");
            return (Criteria) this;
        }

        public Criteria andColumn179NotBetween(String value1, String value2) {
            addCriterion("column_179 not between", value1, value2, "column179");
            return (Criteria) this;
        }

        public Criteria andColumn180IsNull() {
            addCriterion("column_180 is null");
            return (Criteria) this;
        }

        public Criteria andColumn180IsNotNull() {
            addCriterion("column_180 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn180EqualTo(String value) {
            addCriterion("column_180 =", value, "column180");
            return (Criteria) this;
        }

        public Criteria andColumn180NotEqualTo(String value) {
            addCriterion("column_180 <>", value, "column180");
            return (Criteria) this;
        }

        public Criteria andColumn180GreaterThan(String value) {
            addCriterion("column_180 >", value, "column180");
            return (Criteria) this;
        }

        public Criteria andColumn180GreaterThanOrEqualTo(String value) {
            addCriterion("column_180 >=", value, "column180");
            return (Criteria) this;
        }

        public Criteria andColumn180LessThan(String value) {
            addCriterion("column_180 <", value, "column180");
            return (Criteria) this;
        }

        public Criteria andColumn180LessThanOrEqualTo(String value) {
            addCriterion("column_180 <=", value, "column180");
            return (Criteria) this;
        }

        public Criteria andColumn180Like(String value) {
            addCriterion("column_180 like", value, "column180");
            return (Criteria) this;
        }

        public Criteria andColumn180NotLike(String value) {
            addCriterion("column_180 not like", value, "column180");
            return (Criteria) this;
        }

        public Criteria andColumn180In(List<String> values) {
            addCriterion("column_180 in", values, "column180");
            return (Criteria) this;
        }

        public Criteria andColumn180NotIn(List<String> values) {
            addCriterion("column_180 not in", values, "column180");
            return (Criteria) this;
        }

        public Criteria andColumn180Between(String value1, String value2) {
            addCriterion("column_180 between", value1, value2, "column180");
            return (Criteria) this;
        }

        public Criteria andColumn180NotBetween(String value1, String value2) {
            addCriterion("column_180 not between", value1, value2, "column180");
            return (Criteria) this;
        }

        public Criteria andColumn181IsNull() {
            addCriterion("column_181 is null");
            return (Criteria) this;
        }

        public Criteria andColumn181IsNotNull() {
            addCriterion("column_181 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn181EqualTo(String value) {
            addCriterion("column_181 =", value, "column181");
            return (Criteria) this;
        }

        public Criteria andColumn181NotEqualTo(String value) {
            addCriterion("column_181 <>", value, "column181");
            return (Criteria) this;
        }

        public Criteria andColumn181GreaterThan(String value) {
            addCriterion("column_181 >", value, "column181");
            return (Criteria) this;
        }

        public Criteria andColumn181GreaterThanOrEqualTo(String value) {
            addCriterion("column_181 >=", value, "column181");
            return (Criteria) this;
        }

        public Criteria andColumn181LessThan(String value) {
            addCriterion("column_181 <", value, "column181");
            return (Criteria) this;
        }

        public Criteria andColumn181LessThanOrEqualTo(String value) {
            addCriterion("column_181 <=", value, "column181");
            return (Criteria) this;
        }

        public Criteria andColumn181Like(String value) {
            addCriterion("column_181 like", value, "column181");
            return (Criteria) this;
        }

        public Criteria andColumn181NotLike(String value) {
            addCriterion("column_181 not like", value, "column181");
            return (Criteria) this;
        }

        public Criteria andColumn181In(List<String> values) {
            addCriterion("column_181 in", values, "column181");
            return (Criteria) this;
        }

        public Criteria andColumn181NotIn(List<String> values) {
            addCriterion("column_181 not in", values, "column181");
            return (Criteria) this;
        }

        public Criteria andColumn181Between(String value1, String value2) {
            addCriterion("column_181 between", value1, value2, "column181");
            return (Criteria) this;
        }

        public Criteria andColumn181NotBetween(String value1, String value2) {
            addCriterion("column_181 not between", value1, value2, "column181");
            return (Criteria) this;
        }

        public Criteria andColumn182IsNull() {
            addCriterion("column_182 is null");
            return (Criteria) this;
        }

        public Criteria andColumn182IsNotNull() {
            addCriterion("column_182 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn182EqualTo(String value) {
            addCriterion("column_182 =", value, "column182");
            return (Criteria) this;
        }

        public Criteria andColumn182NotEqualTo(String value) {
            addCriterion("column_182 <>", value, "column182");
            return (Criteria) this;
        }

        public Criteria andColumn182GreaterThan(String value) {
            addCriterion("column_182 >", value, "column182");
            return (Criteria) this;
        }

        public Criteria andColumn182GreaterThanOrEqualTo(String value) {
            addCriterion("column_182 >=", value, "column182");
            return (Criteria) this;
        }

        public Criteria andColumn182LessThan(String value) {
            addCriterion("column_182 <", value, "column182");
            return (Criteria) this;
        }

        public Criteria andColumn182LessThanOrEqualTo(String value) {
            addCriterion("column_182 <=", value, "column182");
            return (Criteria) this;
        }

        public Criteria andColumn182Like(String value) {
            addCriterion("column_182 like", value, "column182");
            return (Criteria) this;
        }

        public Criteria andColumn182NotLike(String value) {
            addCriterion("column_182 not like", value, "column182");
            return (Criteria) this;
        }

        public Criteria andColumn182In(List<String> values) {
            addCriterion("column_182 in", values, "column182");
            return (Criteria) this;
        }

        public Criteria andColumn182NotIn(List<String> values) {
            addCriterion("column_182 not in", values, "column182");
            return (Criteria) this;
        }

        public Criteria andColumn182Between(String value1, String value2) {
            addCriterion("column_182 between", value1, value2, "column182");
            return (Criteria) this;
        }

        public Criteria andColumn182NotBetween(String value1, String value2) {
            addCriterion("column_182 not between", value1, value2, "column182");
            return (Criteria) this;
        }

        public Criteria andColumn183IsNull() {
            addCriterion("column_183 is null");
            return (Criteria) this;
        }

        public Criteria andColumn183IsNotNull() {
            addCriterion("column_183 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn183EqualTo(String value) {
            addCriterion("column_183 =", value, "column183");
            return (Criteria) this;
        }

        public Criteria andColumn183NotEqualTo(String value) {
            addCriterion("column_183 <>", value, "column183");
            return (Criteria) this;
        }

        public Criteria andColumn183GreaterThan(String value) {
            addCriterion("column_183 >", value, "column183");
            return (Criteria) this;
        }

        public Criteria andColumn183GreaterThanOrEqualTo(String value) {
            addCriterion("column_183 >=", value, "column183");
            return (Criteria) this;
        }

        public Criteria andColumn183LessThan(String value) {
            addCriterion("column_183 <", value, "column183");
            return (Criteria) this;
        }

        public Criteria andColumn183LessThanOrEqualTo(String value) {
            addCriterion("column_183 <=", value, "column183");
            return (Criteria) this;
        }

        public Criteria andColumn183Like(String value) {
            addCriterion("column_183 like", value, "column183");
            return (Criteria) this;
        }

        public Criteria andColumn183NotLike(String value) {
            addCriterion("column_183 not like", value, "column183");
            return (Criteria) this;
        }

        public Criteria andColumn183In(List<String> values) {
            addCriterion("column_183 in", values, "column183");
            return (Criteria) this;
        }

        public Criteria andColumn183NotIn(List<String> values) {
            addCriterion("column_183 not in", values, "column183");
            return (Criteria) this;
        }

        public Criteria andColumn183Between(String value1, String value2) {
            addCriterion("column_183 between", value1, value2, "column183");
            return (Criteria) this;
        }

        public Criteria andColumn183NotBetween(String value1, String value2) {
            addCriterion("column_183 not between", value1, value2, "column183");
            return (Criteria) this;
        }

        public Criteria andColumn184IsNull() {
            addCriterion("column_184 is null");
            return (Criteria) this;
        }

        public Criteria andColumn184IsNotNull() {
            addCriterion("column_184 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn184EqualTo(String value) {
            addCriterion("column_184 =", value, "column184");
            return (Criteria) this;
        }

        public Criteria andColumn184NotEqualTo(String value) {
            addCriterion("column_184 <>", value, "column184");
            return (Criteria) this;
        }

        public Criteria andColumn184GreaterThan(String value) {
            addCriterion("column_184 >", value, "column184");
            return (Criteria) this;
        }

        public Criteria andColumn184GreaterThanOrEqualTo(String value) {
            addCriterion("column_184 >=", value, "column184");
            return (Criteria) this;
        }

        public Criteria andColumn184LessThan(String value) {
            addCriterion("column_184 <", value, "column184");
            return (Criteria) this;
        }

        public Criteria andColumn184LessThanOrEqualTo(String value) {
            addCriterion("column_184 <=", value, "column184");
            return (Criteria) this;
        }

        public Criteria andColumn184Like(String value) {
            addCriterion("column_184 like", value, "column184");
            return (Criteria) this;
        }

        public Criteria andColumn184NotLike(String value) {
            addCriterion("column_184 not like", value, "column184");
            return (Criteria) this;
        }

        public Criteria andColumn184In(List<String> values) {
            addCriterion("column_184 in", values, "column184");
            return (Criteria) this;
        }

        public Criteria andColumn184NotIn(List<String> values) {
            addCriterion("column_184 not in", values, "column184");
            return (Criteria) this;
        }

        public Criteria andColumn184Between(String value1, String value2) {
            addCriterion("column_184 between", value1, value2, "column184");
            return (Criteria) this;
        }

        public Criteria andColumn184NotBetween(String value1, String value2) {
            addCriterion("column_184 not between", value1, value2, "column184");
            return (Criteria) this;
        }

        public Criteria andColumn185IsNull() {
            addCriterion("column_185 is null");
            return (Criteria) this;
        }

        public Criteria andColumn185IsNotNull() {
            addCriterion("column_185 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn185EqualTo(String value) {
            addCriterion("column_185 =", value, "column185");
            return (Criteria) this;
        }

        public Criteria andColumn185NotEqualTo(String value) {
            addCriterion("column_185 <>", value, "column185");
            return (Criteria) this;
        }

        public Criteria andColumn185GreaterThan(String value) {
            addCriterion("column_185 >", value, "column185");
            return (Criteria) this;
        }

        public Criteria andColumn185GreaterThanOrEqualTo(String value) {
            addCriterion("column_185 >=", value, "column185");
            return (Criteria) this;
        }

        public Criteria andColumn185LessThan(String value) {
            addCriterion("column_185 <", value, "column185");
            return (Criteria) this;
        }

        public Criteria andColumn185LessThanOrEqualTo(String value) {
            addCriterion("column_185 <=", value, "column185");
            return (Criteria) this;
        }

        public Criteria andColumn185Like(String value) {
            addCriterion("column_185 like", value, "column185");
            return (Criteria) this;
        }

        public Criteria andColumn185NotLike(String value) {
            addCriterion("column_185 not like", value, "column185");
            return (Criteria) this;
        }

        public Criteria andColumn185In(List<String> values) {
            addCriterion("column_185 in", values, "column185");
            return (Criteria) this;
        }

        public Criteria andColumn185NotIn(List<String> values) {
            addCriterion("column_185 not in", values, "column185");
            return (Criteria) this;
        }

        public Criteria andColumn185Between(String value1, String value2) {
            addCriterion("column_185 between", value1, value2, "column185");
            return (Criteria) this;
        }

        public Criteria andColumn185NotBetween(String value1, String value2) {
            addCriterion("column_185 not between", value1, value2, "column185");
            return (Criteria) this;
        }

        public Criteria andColumn186IsNull() {
            addCriterion("column_186 is null");
            return (Criteria) this;
        }

        public Criteria andColumn186IsNotNull() {
            addCriterion("column_186 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn186EqualTo(String value) {
            addCriterion("column_186 =", value, "column186");
            return (Criteria) this;
        }

        public Criteria andColumn186NotEqualTo(String value) {
            addCriterion("column_186 <>", value, "column186");
            return (Criteria) this;
        }

        public Criteria andColumn186GreaterThan(String value) {
            addCriterion("column_186 >", value, "column186");
            return (Criteria) this;
        }

        public Criteria andColumn186GreaterThanOrEqualTo(String value) {
            addCriterion("column_186 >=", value, "column186");
            return (Criteria) this;
        }

        public Criteria andColumn186LessThan(String value) {
            addCriterion("column_186 <", value, "column186");
            return (Criteria) this;
        }

        public Criteria andColumn186LessThanOrEqualTo(String value) {
            addCriterion("column_186 <=", value, "column186");
            return (Criteria) this;
        }

        public Criteria andColumn186Like(String value) {
            addCriterion("column_186 like", value, "column186");
            return (Criteria) this;
        }

        public Criteria andColumn186NotLike(String value) {
            addCriterion("column_186 not like", value, "column186");
            return (Criteria) this;
        }

        public Criteria andColumn186In(List<String> values) {
            addCriterion("column_186 in", values, "column186");
            return (Criteria) this;
        }

        public Criteria andColumn186NotIn(List<String> values) {
            addCriterion("column_186 not in", values, "column186");
            return (Criteria) this;
        }

        public Criteria andColumn186Between(String value1, String value2) {
            addCriterion("column_186 between", value1, value2, "column186");
            return (Criteria) this;
        }

        public Criteria andColumn186NotBetween(String value1, String value2) {
            addCriterion("column_186 not between", value1, value2, "column186");
            return (Criteria) this;
        }

        public Criteria andColumn187IsNull() {
            addCriterion("column_187 is null");
            return (Criteria) this;
        }

        public Criteria andColumn187IsNotNull() {
            addCriterion("column_187 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn187EqualTo(String value) {
            addCriterion("column_187 =", value, "column187");
            return (Criteria) this;
        }

        public Criteria andColumn187NotEqualTo(String value) {
            addCriterion("column_187 <>", value, "column187");
            return (Criteria) this;
        }

        public Criteria andColumn187GreaterThan(String value) {
            addCriterion("column_187 >", value, "column187");
            return (Criteria) this;
        }

        public Criteria andColumn187GreaterThanOrEqualTo(String value) {
            addCriterion("column_187 >=", value, "column187");
            return (Criteria) this;
        }

        public Criteria andColumn187LessThan(String value) {
            addCriterion("column_187 <", value, "column187");
            return (Criteria) this;
        }

        public Criteria andColumn187LessThanOrEqualTo(String value) {
            addCriterion("column_187 <=", value, "column187");
            return (Criteria) this;
        }

        public Criteria andColumn187Like(String value) {
            addCriterion("column_187 like", value, "column187");
            return (Criteria) this;
        }

        public Criteria andColumn187NotLike(String value) {
            addCriterion("column_187 not like", value, "column187");
            return (Criteria) this;
        }

        public Criteria andColumn187In(List<String> values) {
            addCriterion("column_187 in", values, "column187");
            return (Criteria) this;
        }

        public Criteria andColumn187NotIn(List<String> values) {
            addCriterion("column_187 not in", values, "column187");
            return (Criteria) this;
        }

        public Criteria andColumn187Between(String value1, String value2) {
            addCriterion("column_187 between", value1, value2, "column187");
            return (Criteria) this;
        }

        public Criteria andColumn187NotBetween(String value1, String value2) {
            addCriterion("column_187 not between", value1, value2, "column187");
            return (Criteria) this;
        }

        public Criteria andColumn188IsNull() {
            addCriterion("column_188 is null");
            return (Criteria) this;
        }

        public Criteria andColumn188IsNotNull() {
            addCriterion("column_188 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn188EqualTo(String value) {
            addCriterion("column_188 =", value, "column188");
            return (Criteria) this;
        }

        public Criteria andColumn188NotEqualTo(String value) {
            addCriterion("column_188 <>", value, "column188");
            return (Criteria) this;
        }

        public Criteria andColumn188GreaterThan(String value) {
            addCriterion("column_188 >", value, "column188");
            return (Criteria) this;
        }

        public Criteria andColumn188GreaterThanOrEqualTo(String value) {
            addCriterion("column_188 >=", value, "column188");
            return (Criteria) this;
        }

        public Criteria andColumn188LessThan(String value) {
            addCriterion("column_188 <", value, "column188");
            return (Criteria) this;
        }

        public Criteria andColumn188LessThanOrEqualTo(String value) {
            addCriterion("column_188 <=", value, "column188");
            return (Criteria) this;
        }

        public Criteria andColumn188Like(String value) {
            addCriterion("column_188 like", value, "column188");
            return (Criteria) this;
        }

        public Criteria andColumn188NotLike(String value) {
            addCriterion("column_188 not like", value, "column188");
            return (Criteria) this;
        }

        public Criteria andColumn188In(List<String> values) {
            addCriterion("column_188 in", values, "column188");
            return (Criteria) this;
        }

        public Criteria andColumn188NotIn(List<String> values) {
            addCriterion("column_188 not in", values, "column188");
            return (Criteria) this;
        }

        public Criteria andColumn188Between(String value1, String value2) {
            addCriterion("column_188 between", value1, value2, "column188");
            return (Criteria) this;
        }

        public Criteria andColumn188NotBetween(String value1, String value2) {
            addCriterion("column_188 not between", value1, value2, "column188");
            return (Criteria) this;
        }

        public Criteria andColumn189IsNull() {
            addCriterion("column_189 is null");
            return (Criteria) this;
        }

        public Criteria andColumn189IsNotNull() {
            addCriterion("column_189 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn189EqualTo(String value) {
            addCriterion("column_189 =", value, "column189");
            return (Criteria) this;
        }

        public Criteria andColumn189NotEqualTo(String value) {
            addCriterion("column_189 <>", value, "column189");
            return (Criteria) this;
        }

        public Criteria andColumn189GreaterThan(String value) {
            addCriterion("column_189 >", value, "column189");
            return (Criteria) this;
        }

        public Criteria andColumn189GreaterThanOrEqualTo(String value) {
            addCriterion("column_189 >=", value, "column189");
            return (Criteria) this;
        }

        public Criteria andColumn189LessThan(String value) {
            addCriterion("column_189 <", value, "column189");
            return (Criteria) this;
        }

        public Criteria andColumn189LessThanOrEqualTo(String value) {
            addCriterion("column_189 <=", value, "column189");
            return (Criteria) this;
        }

        public Criteria andColumn189Like(String value) {
            addCriterion("column_189 like", value, "column189");
            return (Criteria) this;
        }

        public Criteria andColumn189NotLike(String value) {
            addCriterion("column_189 not like", value, "column189");
            return (Criteria) this;
        }

        public Criteria andColumn189In(List<String> values) {
            addCriterion("column_189 in", values, "column189");
            return (Criteria) this;
        }

        public Criteria andColumn189NotIn(List<String> values) {
            addCriterion("column_189 not in", values, "column189");
            return (Criteria) this;
        }

        public Criteria andColumn189Between(String value1, String value2) {
            addCriterion("column_189 between", value1, value2, "column189");
            return (Criteria) this;
        }

        public Criteria andColumn189NotBetween(String value1, String value2) {
            addCriterion("column_189 not between", value1, value2, "column189");
            return (Criteria) this;
        }

        public Criteria andColumn190IsNull() {
            addCriterion("column_190 is null");
            return (Criteria) this;
        }

        public Criteria andColumn190IsNotNull() {
            addCriterion("column_190 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn190EqualTo(String value) {
            addCriterion("column_190 =", value, "column190");
            return (Criteria) this;
        }

        public Criteria andColumn190NotEqualTo(String value) {
            addCriterion("column_190 <>", value, "column190");
            return (Criteria) this;
        }

        public Criteria andColumn190GreaterThan(String value) {
            addCriterion("column_190 >", value, "column190");
            return (Criteria) this;
        }

        public Criteria andColumn190GreaterThanOrEqualTo(String value) {
            addCriterion("column_190 >=", value, "column190");
            return (Criteria) this;
        }

        public Criteria andColumn190LessThan(String value) {
            addCriterion("column_190 <", value, "column190");
            return (Criteria) this;
        }

        public Criteria andColumn190LessThanOrEqualTo(String value) {
            addCriterion("column_190 <=", value, "column190");
            return (Criteria) this;
        }

        public Criteria andColumn190Like(String value) {
            addCriterion("column_190 like", value, "column190");
            return (Criteria) this;
        }

        public Criteria andColumn190NotLike(String value) {
            addCriterion("column_190 not like", value, "column190");
            return (Criteria) this;
        }

        public Criteria andColumn190In(List<String> values) {
            addCriterion("column_190 in", values, "column190");
            return (Criteria) this;
        }

        public Criteria andColumn190NotIn(List<String> values) {
            addCriterion("column_190 not in", values, "column190");
            return (Criteria) this;
        }

        public Criteria andColumn190Between(String value1, String value2) {
            addCriterion("column_190 between", value1, value2, "column190");
            return (Criteria) this;
        }

        public Criteria andColumn190NotBetween(String value1, String value2) {
            addCriterion("column_190 not between", value1, value2, "column190");
            return (Criteria) this;
        }

        public Criteria andColumn191IsNull() {
            addCriterion("column_191 is null");
            return (Criteria) this;
        }

        public Criteria andColumn191IsNotNull() {
            addCriterion("column_191 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn191EqualTo(String value) {
            addCriterion("column_191 =", value, "column191");
            return (Criteria) this;
        }

        public Criteria andColumn191NotEqualTo(String value) {
            addCriterion("column_191 <>", value, "column191");
            return (Criteria) this;
        }

        public Criteria andColumn191GreaterThan(String value) {
            addCriterion("column_191 >", value, "column191");
            return (Criteria) this;
        }

        public Criteria andColumn191GreaterThanOrEqualTo(String value) {
            addCriterion("column_191 >=", value, "column191");
            return (Criteria) this;
        }

        public Criteria andColumn191LessThan(String value) {
            addCriterion("column_191 <", value, "column191");
            return (Criteria) this;
        }

        public Criteria andColumn191LessThanOrEqualTo(String value) {
            addCriterion("column_191 <=", value, "column191");
            return (Criteria) this;
        }

        public Criteria andColumn191Like(String value) {
            addCriterion("column_191 like", value, "column191");
            return (Criteria) this;
        }

        public Criteria andColumn191NotLike(String value) {
            addCriterion("column_191 not like", value, "column191");
            return (Criteria) this;
        }

        public Criteria andColumn191In(List<String> values) {
            addCriterion("column_191 in", values, "column191");
            return (Criteria) this;
        }

        public Criteria andColumn191NotIn(List<String> values) {
            addCriterion("column_191 not in", values, "column191");
            return (Criteria) this;
        }

        public Criteria andColumn191Between(String value1, String value2) {
            addCriterion("column_191 between", value1, value2, "column191");
            return (Criteria) this;
        }

        public Criteria andColumn191NotBetween(String value1, String value2) {
            addCriterion("column_191 not between", value1, value2, "column191");
            return (Criteria) this;
        }

        public Criteria andColumn192IsNull() {
            addCriterion("column_192 is null");
            return (Criteria) this;
        }

        public Criteria andColumn192IsNotNull() {
            addCriterion("column_192 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn192EqualTo(String value) {
            addCriterion("column_192 =", value, "column192");
            return (Criteria) this;
        }

        public Criteria andColumn192NotEqualTo(String value) {
            addCriterion("column_192 <>", value, "column192");
            return (Criteria) this;
        }

        public Criteria andColumn192GreaterThan(String value) {
            addCriterion("column_192 >", value, "column192");
            return (Criteria) this;
        }

        public Criteria andColumn192GreaterThanOrEqualTo(String value) {
            addCriterion("column_192 >=", value, "column192");
            return (Criteria) this;
        }

        public Criteria andColumn192LessThan(String value) {
            addCriterion("column_192 <", value, "column192");
            return (Criteria) this;
        }

        public Criteria andColumn192LessThanOrEqualTo(String value) {
            addCriterion("column_192 <=", value, "column192");
            return (Criteria) this;
        }

        public Criteria andColumn192Like(String value) {
            addCriterion("column_192 like", value, "column192");
            return (Criteria) this;
        }

        public Criteria andColumn192NotLike(String value) {
            addCriterion("column_192 not like", value, "column192");
            return (Criteria) this;
        }

        public Criteria andColumn192In(List<String> values) {
            addCriterion("column_192 in", values, "column192");
            return (Criteria) this;
        }

        public Criteria andColumn192NotIn(List<String> values) {
            addCriterion("column_192 not in", values, "column192");
            return (Criteria) this;
        }

        public Criteria andColumn192Between(String value1, String value2) {
            addCriterion("column_192 between", value1, value2, "column192");
            return (Criteria) this;
        }

        public Criteria andColumn192NotBetween(String value1, String value2) {
            addCriterion("column_192 not between", value1, value2, "column192");
            return (Criteria) this;
        }

        public Criteria andColumn193IsNull() {
            addCriterion("column_193 is null");
            return (Criteria) this;
        }

        public Criteria andColumn193IsNotNull() {
            addCriterion("column_193 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn193EqualTo(String value) {
            addCriterion("column_193 =", value, "column193");
            return (Criteria) this;
        }

        public Criteria andColumn193NotEqualTo(String value) {
            addCriterion("column_193 <>", value, "column193");
            return (Criteria) this;
        }

        public Criteria andColumn193GreaterThan(String value) {
            addCriterion("column_193 >", value, "column193");
            return (Criteria) this;
        }

        public Criteria andColumn193GreaterThanOrEqualTo(String value) {
            addCriterion("column_193 >=", value, "column193");
            return (Criteria) this;
        }

        public Criteria andColumn193LessThan(String value) {
            addCriterion("column_193 <", value, "column193");
            return (Criteria) this;
        }

        public Criteria andColumn193LessThanOrEqualTo(String value) {
            addCriterion("column_193 <=", value, "column193");
            return (Criteria) this;
        }

        public Criteria andColumn193Like(String value) {
            addCriterion("column_193 like", value, "column193");
            return (Criteria) this;
        }

        public Criteria andColumn193NotLike(String value) {
            addCriterion("column_193 not like", value, "column193");
            return (Criteria) this;
        }

        public Criteria andColumn193In(List<String> values) {
            addCriterion("column_193 in", values, "column193");
            return (Criteria) this;
        }

        public Criteria andColumn193NotIn(List<String> values) {
            addCriterion("column_193 not in", values, "column193");
            return (Criteria) this;
        }

        public Criteria andColumn193Between(String value1, String value2) {
            addCriterion("column_193 between", value1, value2, "column193");
            return (Criteria) this;
        }

        public Criteria andColumn193NotBetween(String value1, String value2) {
            addCriterion("column_193 not between", value1, value2, "column193");
            return (Criteria) this;
        }

        public Criteria andColumn194IsNull() {
            addCriterion("column_194 is null");
            return (Criteria) this;
        }

        public Criteria andColumn194IsNotNull() {
            addCriterion("column_194 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn194EqualTo(String value) {
            addCriterion("column_194 =", value, "column194");
            return (Criteria) this;
        }

        public Criteria andColumn194NotEqualTo(String value) {
            addCriterion("column_194 <>", value, "column194");
            return (Criteria) this;
        }

        public Criteria andColumn194GreaterThan(String value) {
            addCriterion("column_194 >", value, "column194");
            return (Criteria) this;
        }

        public Criteria andColumn194GreaterThanOrEqualTo(String value) {
            addCriterion("column_194 >=", value, "column194");
            return (Criteria) this;
        }

        public Criteria andColumn194LessThan(String value) {
            addCriterion("column_194 <", value, "column194");
            return (Criteria) this;
        }

        public Criteria andColumn194LessThanOrEqualTo(String value) {
            addCriterion("column_194 <=", value, "column194");
            return (Criteria) this;
        }

        public Criteria andColumn194Like(String value) {
            addCriterion("column_194 like", value, "column194");
            return (Criteria) this;
        }

        public Criteria andColumn194NotLike(String value) {
            addCriterion("column_194 not like", value, "column194");
            return (Criteria) this;
        }

        public Criteria andColumn194In(List<String> values) {
            addCriterion("column_194 in", values, "column194");
            return (Criteria) this;
        }

        public Criteria andColumn194NotIn(List<String> values) {
            addCriterion("column_194 not in", values, "column194");
            return (Criteria) this;
        }

        public Criteria andColumn194Between(String value1, String value2) {
            addCriterion("column_194 between", value1, value2, "column194");
            return (Criteria) this;
        }

        public Criteria andColumn194NotBetween(String value1, String value2) {
            addCriterion("column_194 not between", value1, value2, "column194");
            return (Criteria) this;
        }

        public Criteria andColumn195IsNull() {
            addCriterion("column_195 is null");
            return (Criteria) this;
        }

        public Criteria andColumn195IsNotNull() {
            addCriterion("column_195 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn195EqualTo(String value) {
            addCriterion("column_195 =", value, "column195");
            return (Criteria) this;
        }

        public Criteria andColumn195NotEqualTo(String value) {
            addCriterion("column_195 <>", value, "column195");
            return (Criteria) this;
        }

        public Criteria andColumn195GreaterThan(String value) {
            addCriterion("column_195 >", value, "column195");
            return (Criteria) this;
        }

        public Criteria andColumn195GreaterThanOrEqualTo(String value) {
            addCriterion("column_195 >=", value, "column195");
            return (Criteria) this;
        }

        public Criteria andColumn195LessThan(String value) {
            addCriterion("column_195 <", value, "column195");
            return (Criteria) this;
        }

        public Criteria andColumn195LessThanOrEqualTo(String value) {
            addCriterion("column_195 <=", value, "column195");
            return (Criteria) this;
        }

        public Criteria andColumn195Like(String value) {
            addCriterion("column_195 like", value, "column195");
            return (Criteria) this;
        }

        public Criteria andColumn195NotLike(String value) {
            addCriterion("column_195 not like", value, "column195");
            return (Criteria) this;
        }

        public Criteria andColumn195In(List<String> values) {
            addCriterion("column_195 in", values, "column195");
            return (Criteria) this;
        }

        public Criteria andColumn195NotIn(List<String> values) {
            addCriterion("column_195 not in", values, "column195");
            return (Criteria) this;
        }

        public Criteria andColumn195Between(String value1, String value2) {
            addCriterion("column_195 between", value1, value2, "column195");
            return (Criteria) this;
        }

        public Criteria andColumn195NotBetween(String value1, String value2) {
            addCriterion("column_195 not between", value1, value2, "column195");
            return (Criteria) this;
        }

        public Criteria andColumn196IsNull() {
            addCriterion("column_196 is null");
            return (Criteria) this;
        }

        public Criteria andColumn196IsNotNull() {
            addCriterion("column_196 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn196EqualTo(String value) {
            addCriterion("column_196 =", value, "column196");
            return (Criteria) this;
        }

        public Criteria andColumn196NotEqualTo(String value) {
            addCriterion("column_196 <>", value, "column196");
            return (Criteria) this;
        }

        public Criteria andColumn196GreaterThan(String value) {
            addCriterion("column_196 >", value, "column196");
            return (Criteria) this;
        }

        public Criteria andColumn196GreaterThanOrEqualTo(String value) {
            addCriterion("column_196 >=", value, "column196");
            return (Criteria) this;
        }

        public Criteria andColumn196LessThan(String value) {
            addCriterion("column_196 <", value, "column196");
            return (Criteria) this;
        }

        public Criteria andColumn196LessThanOrEqualTo(String value) {
            addCriterion("column_196 <=", value, "column196");
            return (Criteria) this;
        }

        public Criteria andColumn196Like(String value) {
            addCriterion("column_196 like", value, "column196");
            return (Criteria) this;
        }

        public Criteria andColumn196NotLike(String value) {
            addCriterion("column_196 not like", value, "column196");
            return (Criteria) this;
        }

        public Criteria andColumn196In(List<String> values) {
            addCriterion("column_196 in", values, "column196");
            return (Criteria) this;
        }

        public Criteria andColumn196NotIn(List<String> values) {
            addCriterion("column_196 not in", values, "column196");
            return (Criteria) this;
        }

        public Criteria andColumn196Between(String value1, String value2) {
            addCriterion("column_196 between", value1, value2, "column196");
            return (Criteria) this;
        }

        public Criteria andColumn196NotBetween(String value1, String value2) {
            addCriterion("column_196 not between", value1, value2, "column196");
            return (Criteria) this;
        }

        public Criteria andColumn197IsNull() {
            addCriterion("column_197 is null");
            return (Criteria) this;
        }

        public Criteria andColumn197IsNotNull() {
            addCriterion("column_197 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn197EqualTo(String value) {
            addCriterion("column_197 =", value, "column197");
            return (Criteria) this;
        }

        public Criteria andColumn197NotEqualTo(String value) {
            addCriterion("column_197 <>", value, "column197");
            return (Criteria) this;
        }

        public Criteria andColumn197GreaterThan(String value) {
            addCriterion("column_197 >", value, "column197");
            return (Criteria) this;
        }

        public Criteria andColumn197GreaterThanOrEqualTo(String value) {
            addCriterion("column_197 >=", value, "column197");
            return (Criteria) this;
        }

        public Criteria andColumn197LessThan(String value) {
            addCriterion("column_197 <", value, "column197");
            return (Criteria) this;
        }

        public Criteria andColumn197LessThanOrEqualTo(String value) {
            addCriterion("column_197 <=", value, "column197");
            return (Criteria) this;
        }

        public Criteria andColumn197Like(String value) {
            addCriterion("column_197 like", value, "column197");
            return (Criteria) this;
        }

        public Criteria andColumn197NotLike(String value) {
            addCriterion("column_197 not like", value, "column197");
            return (Criteria) this;
        }

        public Criteria andColumn197In(List<String> values) {
            addCriterion("column_197 in", values, "column197");
            return (Criteria) this;
        }

        public Criteria andColumn197NotIn(List<String> values) {
            addCriterion("column_197 not in", values, "column197");
            return (Criteria) this;
        }

        public Criteria andColumn197Between(String value1, String value2) {
            addCriterion("column_197 between", value1, value2, "column197");
            return (Criteria) this;
        }

        public Criteria andColumn197NotBetween(String value1, String value2) {
            addCriterion("column_197 not between", value1, value2, "column197");
            return (Criteria) this;
        }

        public Criteria andColumn198IsNull() {
            addCriterion("column_198 is null");
            return (Criteria) this;
        }

        public Criteria andColumn198IsNotNull() {
            addCriterion("column_198 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn198EqualTo(String value) {
            addCriterion("column_198 =", value, "column198");
            return (Criteria) this;
        }

        public Criteria andColumn198NotEqualTo(String value) {
            addCriterion("column_198 <>", value, "column198");
            return (Criteria) this;
        }

        public Criteria andColumn198GreaterThan(String value) {
            addCriterion("column_198 >", value, "column198");
            return (Criteria) this;
        }

        public Criteria andColumn198GreaterThanOrEqualTo(String value) {
            addCriterion("column_198 >=", value, "column198");
            return (Criteria) this;
        }

        public Criteria andColumn198LessThan(String value) {
            addCriterion("column_198 <", value, "column198");
            return (Criteria) this;
        }

        public Criteria andColumn198LessThanOrEqualTo(String value) {
            addCriterion("column_198 <=", value, "column198");
            return (Criteria) this;
        }

        public Criteria andColumn198Like(String value) {
            addCriterion("column_198 like", value, "column198");
            return (Criteria) this;
        }

        public Criteria andColumn198NotLike(String value) {
            addCriterion("column_198 not like", value, "column198");
            return (Criteria) this;
        }

        public Criteria andColumn198In(List<String> values) {
            addCriterion("column_198 in", values, "column198");
            return (Criteria) this;
        }

        public Criteria andColumn198NotIn(List<String> values) {
            addCriterion("column_198 not in", values, "column198");
            return (Criteria) this;
        }

        public Criteria andColumn198Between(String value1, String value2) {
            addCriterion("column_198 between", value1, value2, "column198");
            return (Criteria) this;
        }

        public Criteria andColumn198NotBetween(String value1, String value2) {
            addCriterion("column_198 not between", value1, value2, "column198");
            return (Criteria) this;
        }

        public Criteria andColumn199IsNull() {
            addCriterion("column_199 is null");
            return (Criteria) this;
        }

        public Criteria andColumn199IsNotNull() {
            addCriterion("column_199 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn199EqualTo(String value) {
            addCriterion("column_199 =", value, "column199");
            return (Criteria) this;
        }

        public Criteria andColumn199NotEqualTo(String value) {
            addCriterion("column_199 <>", value, "column199");
            return (Criteria) this;
        }

        public Criteria andColumn199GreaterThan(String value) {
            addCriterion("column_199 >", value, "column199");
            return (Criteria) this;
        }

        public Criteria andColumn199GreaterThanOrEqualTo(String value) {
            addCriterion("column_199 >=", value, "column199");
            return (Criteria) this;
        }

        public Criteria andColumn199LessThan(String value) {
            addCriterion("column_199 <", value, "column199");
            return (Criteria) this;
        }

        public Criteria andColumn199LessThanOrEqualTo(String value) {
            addCriterion("column_199 <=", value, "column199");
            return (Criteria) this;
        }

        public Criteria andColumn199Like(String value) {
            addCriterion("column_199 like", value, "column199");
            return (Criteria) this;
        }

        public Criteria andColumn199NotLike(String value) {
            addCriterion("column_199 not like", value, "column199");
            return (Criteria) this;
        }

        public Criteria andColumn199In(List<String> values) {
            addCriterion("column_199 in", values, "column199");
            return (Criteria) this;
        }

        public Criteria andColumn199NotIn(List<String> values) {
            addCriterion("column_199 not in", values, "column199");
            return (Criteria) this;
        }

        public Criteria andColumn199Between(String value1, String value2) {
            addCriterion("column_199 between", value1, value2, "column199");
            return (Criteria) this;
        }

        public Criteria andColumn199NotBetween(String value1, String value2) {
            addCriterion("column_199 not between", value1, value2, "column199");
            return (Criteria) this;
        }

        public Criteria andColumn200IsNull() {
            addCriterion("column_200 is null");
            return (Criteria) this;
        }

        public Criteria andColumn200IsNotNull() {
            addCriterion("column_200 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn200EqualTo(String value) {
            addCriterion("column_200 =", value, "column200");
            return (Criteria) this;
        }

        public Criteria andColumn200NotEqualTo(String value) {
            addCriterion("column_200 <>", value, "column200");
            return (Criteria) this;
        }

        public Criteria andColumn200GreaterThan(String value) {
            addCriterion("column_200 >", value, "column200");
            return (Criteria) this;
        }

        public Criteria andColumn200GreaterThanOrEqualTo(String value) {
            addCriterion("column_200 >=", value, "column200");
            return (Criteria) this;
        }

        public Criteria andColumn200LessThan(String value) {
            addCriterion("column_200 <", value, "column200");
            return (Criteria) this;
        }

        public Criteria andColumn200LessThanOrEqualTo(String value) {
            addCriterion("column_200 <=", value, "column200");
            return (Criteria) this;
        }

        public Criteria andColumn200Like(String value) {
            addCriterion("column_200 like", value, "column200");
            return (Criteria) this;
        }

        public Criteria andColumn200NotLike(String value) {
            addCriterion("column_200 not like", value, "column200");
            return (Criteria) this;
        }

        public Criteria andColumn200In(List<String> values) {
            addCriterion("column_200 in", values, "column200");
            return (Criteria) this;
        }

        public Criteria andColumn200NotIn(List<String> values) {
            addCriterion("column_200 not in", values, "column200");
            return (Criteria) this;
        }

        public Criteria andColumn200Between(String value1, String value2) {
            addCriterion("column_200 between", value1, value2, "column200");
            return (Criteria) this;
        }

        public Criteria andColumn200NotBetween(String value1, String value2) {
            addCriterion("column_200 not between", value1, value2, "column200");
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