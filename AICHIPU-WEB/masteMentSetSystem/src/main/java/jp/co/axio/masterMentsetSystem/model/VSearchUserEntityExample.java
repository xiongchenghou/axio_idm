package jp.co.axio.masterMentsetSystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VSearchUserEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VSearchUserEntityExample() {
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUserReserveIsNull() {
            addCriterion("user_reserve is null");
            return (Criteria) this;
        }

        public Criteria andUserReserveIsNotNull() {
            addCriterion("user_reserve is not null");
            return (Criteria) this;
        }

        public Criteria andUserReserveEqualTo(String value) {
            addCriterion("user_reserve =", value, "userReserve");
            return (Criteria) this;
        }

        public Criteria andUserReserveNotEqualTo(String value) {
            addCriterion("user_reserve <>", value, "userReserve");
            return (Criteria) this;
        }

        public Criteria andUserReserveGreaterThan(String value) {
            addCriterion("user_reserve >", value, "userReserve");
            return (Criteria) this;
        }

        public Criteria andUserReserveGreaterThanOrEqualTo(String value) {
            addCriterion("user_reserve >=", value, "userReserve");
            return (Criteria) this;
        }

        public Criteria andUserReserveLessThan(String value) {
            addCriterion("user_reserve <", value, "userReserve");
            return (Criteria) this;
        }

        public Criteria andUserReserveLessThanOrEqualTo(String value) {
            addCriterion("user_reserve <=", value, "userReserve");
            return (Criteria) this;
        }

        public Criteria andUserReserveLike(String value) {
            addCriterion("user_reserve like", value, "userReserve");
            return (Criteria) this;
        }

        public Criteria andUserReserveNotLike(String value) {
            addCriterion("user_reserve not like", value, "userReserve");
            return (Criteria) this;
        }

        public Criteria andUserReserveIn(List<String> values) {
            addCriterion("user_reserve in", values, "userReserve");
            return (Criteria) this;
        }

        public Criteria andUserReserveNotIn(List<String> values) {
            addCriterion("user_reserve not in", values, "userReserve");
            return (Criteria) this;
        }

        public Criteria andUserReserveBetween(String value1, String value2) {
            addCriterion("user_reserve between", value1, value2, "userReserve");
            return (Criteria) this;
        }

        public Criteria andUserReserveNotBetween(String value1, String value2) {
            addCriterion("user_reserve not between", value1, value2, "userReserve");
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

        public Criteria andFullnameJpIsNull() {
            addCriterion("fullname_jp is null");
            return (Criteria) this;
        }

        public Criteria andFullnameJpIsNotNull() {
            addCriterion("fullname_jp is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameJpEqualTo(String value) {
            addCriterion("fullname_jp =", value, "fullnameJp");
            return (Criteria) this;
        }

        public Criteria andFullnameJpNotEqualTo(String value) {
            addCriterion("fullname_jp <>", value, "fullnameJp");
            return (Criteria) this;
        }

        public Criteria andFullnameJpGreaterThan(String value) {
            addCriterion("fullname_jp >", value, "fullnameJp");
            return (Criteria) this;
        }

        public Criteria andFullnameJpGreaterThanOrEqualTo(String value) {
            addCriterion("fullname_jp >=", value, "fullnameJp");
            return (Criteria) this;
        }

        public Criteria andFullnameJpLessThan(String value) {
            addCriterion("fullname_jp <", value, "fullnameJp");
            return (Criteria) this;
        }

        public Criteria andFullnameJpLessThanOrEqualTo(String value) {
            addCriterion("fullname_jp <=", value, "fullnameJp");
            return (Criteria) this;
        }

        public Criteria andFullnameJpLike(String value) {
            addCriterion("fullname_jp like", value, "fullnameJp");
            return (Criteria) this;
        }

        public Criteria andFullnameJpNotLike(String value) {
            addCriterion("fullname_jp not like", value, "fullnameJp");
            return (Criteria) this;
        }

        public Criteria andFullnameJpIn(List<String> values) {
            addCriterion("fullname_jp in", values, "fullnameJp");
            return (Criteria) this;
        }

        public Criteria andFullnameJpNotIn(List<String> values) {
            addCriterion("fullname_jp not in", values, "fullnameJp");
            return (Criteria) this;
        }

        public Criteria andFullnameJpBetween(String value1, String value2) {
            addCriterion("fullname_jp between", value1, value2, "fullnameJp");
            return (Criteria) this;
        }

        public Criteria andFullnameJpNotBetween(String value1, String value2) {
            addCriterion("fullname_jp not between", value1, value2, "fullnameJp");
            return (Criteria) this;
        }

        public Criteria andFullnameEnIsNull() {
            addCriterion("fullname_en is null");
            return (Criteria) this;
        }

        public Criteria andFullnameEnIsNotNull() {
            addCriterion("fullname_en is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEnEqualTo(String value) {
            addCriterion("fullname_en =", value, "fullnameEn");
            return (Criteria) this;
        }

        public Criteria andFullnameEnNotEqualTo(String value) {
            addCriterion("fullname_en <>", value, "fullnameEn");
            return (Criteria) this;
        }

        public Criteria andFullnameEnGreaterThan(String value) {
            addCriterion("fullname_en >", value, "fullnameEn");
            return (Criteria) this;
        }

        public Criteria andFullnameEnGreaterThanOrEqualTo(String value) {
            addCriterion("fullname_en >=", value, "fullnameEn");
            return (Criteria) this;
        }

        public Criteria andFullnameEnLessThan(String value) {
            addCriterion("fullname_en <", value, "fullnameEn");
            return (Criteria) this;
        }

        public Criteria andFullnameEnLessThanOrEqualTo(String value) {
            addCriterion("fullname_en <=", value, "fullnameEn");
            return (Criteria) this;
        }

        public Criteria andFullnameEnLike(String value) {
            addCriterion("fullname_en like", value, "fullnameEn");
            return (Criteria) this;
        }

        public Criteria andFullnameEnNotLike(String value) {
            addCriterion("fullname_en not like", value, "fullnameEn");
            return (Criteria) this;
        }

        public Criteria andFullnameEnIn(List<String> values) {
            addCriterion("fullname_en in", values, "fullnameEn");
            return (Criteria) this;
        }

        public Criteria andFullnameEnNotIn(List<String> values) {
            addCriterion("fullname_en not in", values, "fullnameEn");
            return (Criteria) this;
        }

        public Criteria andFullnameEnBetween(String value1, String value2) {
            addCriterion("fullname_en between", value1, value2, "fullnameEn");
            return (Criteria) this;
        }

        public Criteria andFullnameEnNotBetween(String value1, String value2) {
            addCriterion("fullname_en not between", value1, value2, "fullnameEn");
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

        public Criteria andCmapusIsNull() {
            addCriterion("cmapus is null");
            return (Criteria) this;
        }

        public Criteria andCmapusIsNotNull() {
            addCriterion("cmapus is not null");
            return (Criteria) this;
        }

        public Criteria andCmapusEqualTo(String value) {
            addCriterion("cmapus =", value, "cmapus");
            return (Criteria) this;
        }

        public Criteria andCmapusNotEqualTo(String value) {
            addCriterion("cmapus <>", value, "cmapus");
            return (Criteria) this;
        }

        public Criteria andCmapusGreaterThan(String value) {
            addCriterion("cmapus >", value, "cmapus");
            return (Criteria) this;
        }

        public Criteria andCmapusGreaterThanOrEqualTo(String value) {
            addCriterion("cmapus >=", value, "cmapus");
            return (Criteria) this;
        }

        public Criteria andCmapusLessThan(String value) {
            addCriterion("cmapus <", value, "cmapus");
            return (Criteria) this;
        }

        public Criteria andCmapusLessThanOrEqualTo(String value) {
            addCriterion("cmapus <=", value, "cmapus");
            return (Criteria) this;
        }

        public Criteria andCmapusLike(String value) {
            addCriterion("cmapus like", value, "cmapus");
            return (Criteria) this;
        }

        public Criteria andCmapusNotLike(String value) {
            addCriterion("cmapus not like", value, "cmapus");
            return (Criteria) this;
        }

        public Criteria andCmapusIn(List<String> values) {
            addCriterion("cmapus in", values, "cmapus");
            return (Criteria) this;
        }

        public Criteria andCmapusNotIn(List<String> values) {
            addCriterion("cmapus not in", values, "cmapus");
            return (Criteria) this;
        }

        public Criteria andCmapusBetween(String value1, String value2) {
            addCriterion("cmapus between", value1, value2, "cmapus");
            return (Criteria) this;
        }

        public Criteria andCmapusNotBetween(String value1, String value2) {
            addCriterion("cmapus not between", value1, value2, "cmapus");
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

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andEntranceYearIsNull() {
            addCriterion("entrance_year is null");
            return (Criteria) this;
        }

        public Criteria andEntranceYearIsNotNull() {
            addCriterion("entrance_year is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceYearEqualTo(String value) {
            addCriterion("entrance_year =", value, "entranceYear");
            return (Criteria) this;
        }

        public Criteria andEntranceYearNotEqualTo(String value) {
            addCriterion("entrance_year <>", value, "entranceYear");
            return (Criteria) this;
        }

        public Criteria andEntranceYearGreaterThan(String value) {
            addCriterion("entrance_year >", value, "entranceYear");
            return (Criteria) this;
        }

        public Criteria andEntranceYearGreaterThanOrEqualTo(String value) {
            addCriterion("entrance_year >=", value, "entranceYear");
            return (Criteria) this;
        }

        public Criteria andEntranceYearLessThan(String value) {
            addCriterion("entrance_year <", value, "entranceYear");
            return (Criteria) this;
        }

        public Criteria andEntranceYearLessThanOrEqualTo(String value) {
            addCriterion("entrance_year <=", value, "entranceYear");
            return (Criteria) this;
        }

        public Criteria andEntranceYearLike(String value) {
            addCriterion("entrance_year like", value, "entranceYear");
            return (Criteria) this;
        }

        public Criteria andEntranceYearNotLike(String value) {
            addCriterion("entrance_year not like", value, "entranceYear");
            return (Criteria) this;
        }

        public Criteria andEntranceYearIn(List<String> values) {
            addCriterion("entrance_year in", values, "entranceYear");
            return (Criteria) this;
        }

        public Criteria andEntranceYearNotIn(List<String> values) {
            addCriterion("entrance_year not in", values, "entranceYear");
            return (Criteria) this;
        }

        public Criteria andEntranceYearBetween(String value1, String value2) {
            addCriterion("entrance_year between", value1, value2, "entranceYear");
            return (Criteria) this;
        }

        public Criteria andEntranceYearNotBetween(String value1, String value2) {
            addCriterion("entrance_year not between", value1, value2, "entranceYear");
            return (Criteria) this;
        }

        public Criteria andVpnIsNull() {
            addCriterion("vpn is null");
            return (Criteria) this;
        }

        public Criteria andVpnIsNotNull() {
            addCriterion("vpn is not null");
            return (Criteria) this;
        }

        public Criteria andVpnEqualTo(String value) {
            addCriterion("vpn =", value, "vpn");
            return (Criteria) this;
        }

        public Criteria andVpnNotEqualTo(String value) {
            addCriterion("vpn <>", value, "vpn");
            return (Criteria) this;
        }

        public Criteria andVpnGreaterThan(String value) {
            addCriterion("vpn >", value, "vpn");
            return (Criteria) this;
        }

        public Criteria andVpnGreaterThanOrEqualTo(String value) {
            addCriterion("vpn >=", value, "vpn");
            return (Criteria) this;
        }

        public Criteria andVpnLessThan(String value) {
            addCriterion("vpn <", value, "vpn");
            return (Criteria) this;
        }

        public Criteria andVpnLessThanOrEqualTo(String value) {
            addCriterion("vpn <=", value, "vpn");
            return (Criteria) this;
        }

        public Criteria andVpnLike(String value) {
            addCriterion("vpn like", value, "vpn");
            return (Criteria) this;
        }

        public Criteria andVpnNotLike(String value) {
            addCriterion("vpn not like", value, "vpn");
            return (Criteria) this;
        }

        public Criteria andVpnIn(List<String> values) {
            addCriterion("vpn in", values, "vpn");
            return (Criteria) this;
        }

        public Criteria andVpnNotIn(List<String> values) {
            addCriterion("vpn not in", values, "vpn");
            return (Criteria) this;
        }

        public Criteria andVpnBetween(String value1, String value2) {
            addCriterion("vpn between", value1, value2, "vpn");
            return (Criteria) this;
        }

        public Criteria andVpnNotBetween(String value1, String value2) {
            addCriterion("vpn not between", value1, value2, "vpn");
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

        public Criteria andCriterionDtIsNull() {
            addCriterion("criterion_dt is null");
            return (Criteria) this;
        }

        public Criteria andCriterionDtIsNotNull() {
            addCriterion("criterion_dt is not null");
            return (Criteria) this;
        }

        public Criteria andCriterionDtEqualTo(Date value) {
            addCriterionForJDBCDate("criterion_dt =", value, "criterionDt");
            return (Criteria) this;
        }

        public Criteria andCriterionDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("criterion_dt <>", value, "criterionDt");
            return (Criteria) this;
        }

        public Criteria andCriterionDtGreaterThan(Date value) {
            addCriterionForJDBCDate("criterion_dt >", value, "criterionDt");
            return (Criteria) this;
        }

        public Criteria andCriterionDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("criterion_dt >=", value, "criterionDt");
            return (Criteria) this;
        }

        public Criteria andCriterionDtLessThan(Date value) {
            addCriterionForJDBCDate("criterion_dt <", value, "criterionDt");
            return (Criteria) this;
        }

        public Criteria andCriterionDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("criterion_dt <=", value, "criterionDt");
            return (Criteria) this;
        }

        public Criteria andCriterionDtIn(List<Date> values) {
            addCriterionForJDBCDate("criterion_dt in", values, "criterionDt");
            return (Criteria) this;
        }

        public Criteria andCriterionDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("criterion_dt not in", values, "criterionDt");
            return (Criteria) this;
        }

        public Criteria andCriterionDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("criterion_dt between", value1, value2, "criterionDt");
            return (Criteria) this;
        }

        public Criteria andCriterionDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("criterion_dt not between", value1, value2, "criterionDt");
            return (Criteria) this;
        }

        public Criteria andUserStartDateIsNull() {
            addCriterion("user_start_date is null");
            return (Criteria) this;
        }

        public Criteria andUserStartDateIsNotNull() {
            addCriterion("user_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andUserStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("user_start_date =", value, "userStartDate");
            return (Criteria) this;
        }

        public Criteria andUserStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_start_date <>", value, "userStartDate");
            return (Criteria) this;
        }

        public Criteria andUserStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("user_start_date >", value, "userStartDate");
            return (Criteria) this;
        }

        public Criteria andUserStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_start_date >=", value, "userStartDate");
            return (Criteria) this;
        }

        public Criteria andUserStartDateLessThan(Date value) {
            addCriterionForJDBCDate("user_start_date <", value, "userStartDate");
            return (Criteria) this;
        }

        public Criteria andUserStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_start_date <=", value, "userStartDate");
            return (Criteria) this;
        }

        public Criteria andUserStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("user_start_date in", values, "userStartDate");
            return (Criteria) this;
        }

        public Criteria andUserStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_start_date not in", values, "userStartDate");
            return (Criteria) this;
        }

        public Criteria andUserStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_start_date between", value1, value2, "userStartDate");
            return (Criteria) this;
        }

        public Criteria andUserStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_start_date not between", value1, value2, "userStartDate");
            return (Criteria) this;
        }

        public Criteria andUserEndDateIsNull() {
            addCriterion("user_end_date is null");
            return (Criteria) this;
        }

        public Criteria andUserEndDateIsNotNull() {
            addCriterion("user_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andUserEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("user_end_date =", value, "userEndDate");
            return (Criteria) this;
        }

        public Criteria andUserEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_end_date <>", value, "userEndDate");
            return (Criteria) this;
        }

        public Criteria andUserEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("user_end_date >", value, "userEndDate");
            return (Criteria) this;
        }

        public Criteria andUserEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_end_date >=", value, "userEndDate");
            return (Criteria) this;
        }

        public Criteria andUserEndDateLessThan(Date value) {
            addCriterionForJDBCDate("user_end_date <", value, "userEndDate");
            return (Criteria) this;
        }

        public Criteria andUserEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_end_date <=", value, "userEndDate");
            return (Criteria) this;
        }

        public Criteria andUserEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("user_end_date in", values, "userEndDate");
            return (Criteria) this;
        }

        public Criteria andUserEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_end_date not in", values, "userEndDate");
            return (Criteria) this;
        }

        public Criteria andUserEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_end_date between", value1, value2, "userEndDate");
            return (Criteria) this;
        }

        public Criteria andUserEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_end_date not between", value1, value2, "userEndDate");
            return (Criteria) this;
        }

        public Criteria andUserInvalidFlagIsNull() {
            addCriterion("user_invalid_flag is null");
            return (Criteria) this;
        }

        public Criteria andUserInvalidFlagIsNotNull() {
            addCriterion("user_invalid_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUserInvalidFlagEqualTo(String value) {
            addCriterion("user_invalid_flag =", value, "userInvalidFlag");
            return (Criteria) this;
        }

        public Criteria andUserInvalidFlagNotEqualTo(String value) {
            addCriterion("user_invalid_flag <>", value, "userInvalidFlag");
            return (Criteria) this;
        }

        public Criteria andUserInvalidFlagGreaterThan(String value) {
            addCriterion("user_invalid_flag >", value, "userInvalidFlag");
            return (Criteria) this;
        }

        public Criteria andUserInvalidFlagGreaterThanOrEqualTo(String value) {
            addCriterion("user_invalid_flag >=", value, "userInvalidFlag");
            return (Criteria) this;
        }

        public Criteria andUserInvalidFlagLessThan(String value) {
            addCriterion("user_invalid_flag <", value, "userInvalidFlag");
            return (Criteria) this;
        }

        public Criteria andUserInvalidFlagLessThanOrEqualTo(String value) {
            addCriterion("user_invalid_flag <=", value, "userInvalidFlag");
            return (Criteria) this;
        }

        public Criteria andUserInvalidFlagLike(String value) {
            addCriterion("user_invalid_flag like", value, "userInvalidFlag");
            return (Criteria) this;
        }

        public Criteria andUserInvalidFlagNotLike(String value) {
            addCriterion("user_invalid_flag not like", value, "userInvalidFlag");
            return (Criteria) this;
        }

        public Criteria andUserInvalidFlagIn(List<String> values) {
            addCriterion("user_invalid_flag in", values, "userInvalidFlag");
            return (Criteria) this;
        }

        public Criteria andUserInvalidFlagNotIn(List<String> values) {
            addCriterion("user_invalid_flag not in", values, "userInvalidFlag");
            return (Criteria) this;
        }

        public Criteria andUserInvalidFlagBetween(String value1, String value2) {
            addCriterion("user_invalid_flag between", value1, value2, "userInvalidFlag");
            return (Criteria) this;
        }

        public Criteria andUserInvalidFlagNotBetween(String value1, String value2) {
            addCriterion("user_invalid_flag not between", value1, value2, "userInvalidFlag");
            return (Criteria) this;
        }

        public Criteria andUserDeleteFlagIsNull() {
            addCriterion("user_delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andUserDeleteFlagIsNotNull() {
            addCriterion("user_delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeleteFlagEqualTo(String value) {
            addCriterion("user_delete_flag =", value, "userDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andUserDeleteFlagNotEqualTo(String value) {
            addCriterion("user_delete_flag <>", value, "userDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andUserDeleteFlagGreaterThan(String value) {
            addCriterion("user_delete_flag >", value, "userDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andUserDeleteFlagGreaterThanOrEqualTo(String value) {
            addCriterion("user_delete_flag >=", value, "userDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andUserDeleteFlagLessThan(String value) {
            addCriterion("user_delete_flag <", value, "userDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andUserDeleteFlagLessThanOrEqualTo(String value) {
            addCriterion("user_delete_flag <=", value, "userDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andUserDeleteFlagLike(String value) {
            addCriterion("user_delete_flag like", value, "userDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andUserDeleteFlagNotLike(String value) {
            addCriterion("user_delete_flag not like", value, "userDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andUserDeleteFlagIn(List<String> values) {
            addCriterion("user_delete_flag in", values, "userDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andUserDeleteFlagNotIn(List<String> values) {
            addCriterion("user_delete_flag not in", values, "userDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andUserDeleteFlagBetween(String value1, String value2) {
            addCriterion("user_delete_flag between", value1, value2, "userDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andUserDeleteFlagNotBetween(String value1, String value2) {
            addCriterion("user_delete_flag not between", value1, value2, "userDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
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