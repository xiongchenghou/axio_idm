package jp.co.axio.masterMentsetSystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MUserSystemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MUserSystemExample() {
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