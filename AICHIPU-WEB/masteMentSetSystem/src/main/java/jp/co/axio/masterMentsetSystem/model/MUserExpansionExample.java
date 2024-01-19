package jp.co.axio.masterMentsetSystem.model;

import java.util.ArrayList;
import java.util.List;

public class MUserExpansionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MUserExpansionExample() {
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