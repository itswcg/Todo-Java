package com.itswcg.todo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaptchaCaptchastoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaptchaCaptchastoreExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChallengeIsNull() {
            addCriterion("challenge is null");
            return (Criteria) this;
        }

        public Criteria andChallengeIsNotNull() {
            addCriterion("challenge is not null");
            return (Criteria) this;
        }

        public Criteria andChallengeEqualTo(String value) {
            addCriterion("challenge =", value, "challenge");
            return (Criteria) this;
        }

        public Criteria andChallengeNotEqualTo(String value) {
            addCriterion("challenge <>", value, "challenge");
            return (Criteria) this;
        }

        public Criteria andChallengeGreaterThan(String value) {
            addCriterion("challenge >", value, "challenge");
            return (Criteria) this;
        }

        public Criteria andChallengeGreaterThanOrEqualTo(String value) {
            addCriterion("challenge >=", value, "challenge");
            return (Criteria) this;
        }

        public Criteria andChallengeLessThan(String value) {
            addCriterion("challenge <", value, "challenge");
            return (Criteria) this;
        }

        public Criteria andChallengeLessThanOrEqualTo(String value) {
            addCriterion("challenge <=", value, "challenge");
            return (Criteria) this;
        }

        public Criteria andChallengeLike(String value) {
            addCriterion("challenge like", value, "challenge");
            return (Criteria) this;
        }

        public Criteria andChallengeNotLike(String value) {
            addCriterion("challenge not like", value, "challenge");
            return (Criteria) this;
        }

        public Criteria andChallengeIn(List<String> values) {
            addCriterion("challenge in", values, "challenge");
            return (Criteria) this;
        }

        public Criteria andChallengeNotIn(List<String> values) {
            addCriterion("challenge not in", values, "challenge");
            return (Criteria) this;
        }

        public Criteria andChallengeBetween(String value1, String value2) {
            addCriterion("challenge between", value1, value2, "challenge");
            return (Criteria) this;
        }

        public Criteria andChallengeNotBetween(String value1, String value2) {
            addCriterion("challenge not between", value1, value2, "challenge");
            return (Criteria) this;
        }

        public Criteria andResponseIsNull() {
            addCriterion("response is null");
            return (Criteria) this;
        }

        public Criteria andResponseIsNotNull() {
            addCriterion("response is not null");
            return (Criteria) this;
        }

        public Criteria andResponseEqualTo(String value) {
            addCriterion("response =", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotEqualTo(String value) {
            addCriterion("response <>", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseGreaterThan(String value) {
            addCriterion("response >", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseGreaterThanOrEqualTo(String value) {
            addCriterion("response >=", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLessThan(String value) {
            addCriterion("response <", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLessThanOrEqualTo(String value) {
            addCriterion("response <=", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLike(String value) {
            addCriterion("response like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotLike(String value) {
            addCriterion("response not like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseIn(List<String> values) {
            addCriterion("response in", values, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotIn(List<String> values) {
            addCriterion("response not in", values, "response");
            return (Criteria) this;
        }

        public Criteria andResponseBetween(String value1, String value2) {
            addCriterion("response between", value1, value2, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotBetween(String value1, String value2) {
            addCriterion("response not between", value1, value2, "response");
            return (Criteria) this;
        }

        public Criteria andHashkeyIsNull() {
            addCriterion("hashkey is null");
            return (Criteria) this;
        }

        public Criteria andHashkeyIsNotNull() {
            addCriterion("hashkey is not null");
            return (Criteria) this;
        }

        public Criteria andHashkeyEqualTo(String value) {
            addCriterion("hashkey =", value, "hashkey");
            return (Criteria) this;
        }

        public Criteria andHashkeyNotEqualTo(String value) {
            addCriterion("hashkey <>", value, "hashkey");
            return (Criteria) this;
        }

        public Criteria andHashkeyGreaterThan(String value) {
            addCriterion("hashkey >", value, "hashkey");
            return (Criteria) this;
        }

        public Criteria andHashkeyGreaterThanOrEqualTo(String value) {
            addCriterion("hashkey >=", value, "hashkey");
            return (Criteria) this;
        }

        public Criteria andHashkeyLessThan(String value) {
            addCriterion("hashkey <", value, "hashkey");
            return (Criteria) this;
        }

        public Criteria andHashkeyLessThanOrEqualTo(String value) {
            addCriterion("hashkey <=", value, "hashkey");
            return (Criteria) this;
        }

        public Criteria andHashkeyLike(String value) {
            addCriterion("hashkey like", value, "hashkey");
            return (Criteria) this;
        }

        public Criteria andHashkeyNotLike(String value) {
            addCriterion("hashkey not like", value, "hashkey");
            return (Criteria) this;
        }

        public Criteria andHashkeyIn(List<String> values) {
            addCriterion("hashkey in", values, "hashkey");
            return (Criteria) this;
        }

        public Criteria andHashkeyNotIn(List<String> values) {
            addCriterion("hashkey not in", values, "hashkey");
            return (Criteria) this;
        }

        public Criteria andHashkeyBetween(String value1, String value2) {
            addCriterion("hashkey between", value1, value2, "hashkey");
            return (Criteria) this;
        }

        public Criteria andHashkeyNotBetween(String value1, String value2) {
            addCriterion("hashkey not between", value1, value2, "hashkey");
            return (Criteria) this;
        }

        public Criteria andExpirationIsNull() {
            addCriterion("expiration is null");
            return (Criteria) this;
        }

        public Criteria andExpirationIsNotNull() {
            addCriterion("expiration is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationEqualTo(Date value) {
            addCriterion("expiration =", value, "expiration");
            return (Criteria) this;
        }

        public Criteria andExpirationNotEqualTo(Date value) {
            addCriterion("expiration <>", value, "expiration");
            return (Criteria) this;
        }

        public Criteria andExpirationGreaterThan(Date value) {
            addCriterion("expiration >", value, "expiration");
            return (Criteria) this;
        }

        public Criteria andExpirationGreaterThanOrEqualTo(Date value) {
            addCriterion("expiration >=", value, "expiration");
            return (Criteria) this;
        }

        public Criteria andExpirationLessThan(Date value) {
            addCriterion("expiration <", value, "expiration");
            return (Criteria) this;
        }

        public Criteria andExpirationLessThanOrEqualTo(Date value) {
            addCriterion("expiration <=", value, "expiration");
            return (Criteria) this;
        }

        public Criteria andExpirationIn(List<Date> values) {
            addCriterion("expiration in", values, "expiration");
            return (Criteria) this;
        }

        public Criteria andExpirationNotIn(List<Date> values) {
            addCriterion("expiration not in", values, "expiration");
            return (Criteria) this;
        }

        public Criteria andExpirationBetween(Date value1, Date value2) {
            addCriterion("expiration between", value1, value2, "expiration");
            return (Criteria) this;
        }

        public Criteria andExpirationNotBetween(Date value1, Date value2) {
            addCriterion("expiration not between", value1, value2, "expiration");
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