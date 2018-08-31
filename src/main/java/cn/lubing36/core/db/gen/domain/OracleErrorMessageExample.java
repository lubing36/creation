package cn.lubing36.core.db.gen.domain;

import java.util.ArrayList;
import java.util.List;

public class OracleErrorMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OracleErrorMessageExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andErrorCodeIsNull() {
            addCriterion("error_code is null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNotNull() {
            addCriterion("error_code is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeEqualTo(String value) {
            addCriterion("error_code =", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotEqualTo(String value) {
            addCriterion("error_code <>", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThan(String value) {
            addCriterion("error_code >", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("error_code >=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThan(String value) {
            addCriterion("error_code <", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThanOrEqualTo(String value) {
            addCriterion("error_code <=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLike(String value) {
            addCriterion("error_code like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotLike(String value) {
            addCriterion("error_code not like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIn(List<String> values) {
            addCriterion("error_code in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotIn(List<String> values) {
            addCriterion("error_code not in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeBetween(String value1, String value2) {
            addCriterion("error_code between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotBetween(String value1, String value2) {
            addCriterion("error_code not between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNull() {
            addCriterion("error_msg is null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNotNull() {
            addCriterion("error_msg is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgEqualTo(String value) {
            addCriterion("error_msg =", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotEqualTo(String value) {
            addCriterion("error_msg <>", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThan(String value) {
            addCriterion("error_msg >", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThanOrEqualTo(String value) {
            addCriterion("error_msg >=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThan(String value) {
            addCriterion("error_msg <", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThanOrEqualTo(String value) {
            addCriterion("error_msg <=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLike(String value) {
            addCriterion("error_msg like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotLike(String value) {
            addCriterion("error_msg not like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIn(List<String> values) {
            addCriterion("error_msg in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotIn(List<String> values) {
            addCriterion("error_msg not in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgBetween(String value1, String value2) {
            addCriterion("error_msg between", value1, value2, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotBetween(String value1, String value2) {
            addCriterion("error_msg not between", value1, value2, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgZhIsNull() {
            addCriterion("error_msg_zh is null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgZhIsNotNull() {
            addCriterion("error_msg_zh is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgZhEqualTo(String value) {
            addCriterion("error_msg_zh =", value, "errorMsgZh");
            return (Criteria) this;
        }

        public Criteria andErrorMsgZhNotEqualTo(String value) {
            addCriterion("error_msg_zh <>", value, "errorMsgZh");
            return (Criteria) this;
        }

        public Criteria andErrorMsgZhGreaterThan(String value) {
            addCriterion("error_msg_zh >", value, "errorMsgZh");
            return (Criteria) this;
        }

        public Criteria andErrorMsgZhGreaterThanOrEqualTo(String value) {
            addCriterion("error_msg_zh >=", value, "errorMsgZh");
            return (Criteria) this;
        }

        public Criteria andErrorMsgZhLessThan(String value) {
            addCriterion("error_msg_zh <", value, "errorMsgZh");
            return (Criteria) this;
        }

        public Criteria andErrorMsgZhLessThanOrEqualTo(String value) {
            addCriterion("error_msg_zh <=", value, "errorMsgZh");
            return (Criteria) this;
        }

        public Criteria andErrorMsgZhLike(String value) {
            addCriterion("error_msg_zh like", value, "errorMsgZh");
            return (Criteria) this;
        }

        public Criteria andErrorMsgZhNotLike(String value) {
            addCriterion("error_msg_zh not like", value, "errorMsgZh");
            return (Criteria) this;
        }

        public Criteria andErrorMsgZhIn(List<String> values) {
            addCriterion("error_msg_zh in", values, "errorMsgZh");
            return (Criteria) this;
        }

        public Criteria andErrorMsgZhNotIn(List<String> values) {
            addCriterion("error_msg_zh not in", values, "errorMsgZh");
            return (Criteria) this;
        }

        public Criteria andErrorMsgZhBetween(String value1, String value2) {
            addCriterion("error_msg_zh between", value1, value2, "errorMsgZh");
            return (Criteria) this;
        }

        public Criteria andErrorMsgZhNotBetween(String value1, String value2) {
            addCriterion("error_msg_zh not between", value1, value2, "errorMsgZh");
            return (Criteria) this;
        }

        public Criteria andCauseIsNull() {
            addCriterion("cause is null");
            return (Criteria) this;
        }

        public Criteria andCauseIsNotNull() {
            addCriterion("cause is not null");
            return (Criteria) this;
        }

        public Criteria andCauseEqualTo(String value) {
            addCriterion("cause =", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotEqualTo(String value) {
            addCriterion("cause <>", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThan(String value) {
            addCriterion("cause >", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThanOrEqualTo(String value) {
            addCriterion("cause >=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThan(String value) {
            addCriterion("cause <", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThanOrEqualTo(String value) {
            addCriterion("cause <=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLike(String value) {
            addCriterion("cause like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotLike(String value) {
            addCriterion("cause not like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseIn(List<String> values) {
            addCriterion("cause in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotIn(List<String> values) {
            addCriterion("cause not in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseBetween(String value1, String value2) {
            addCriterion("cause between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotBetween(String value1, String value2) {
            addCriterion("cause not between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseZhIsNull() {
            addCriterion("cause_zh is null");
            return (Criteria) this;
        }

        public Criteria andCauseZhIsNotNull() {
            addCriterion("cause_zh is not null");
            return (Criteria) this;
        }

        public Criteria andCauseZhEqualTo(String value) {
            addCriterion("cause_zh =", value, "causeZh");
            return (Criteria) this;
        }

        public Criteria andCauseZhNotEqualTo(String value) {
            addCriterion("cause_zh <>", value, "causeZh");
            return (Criteria) this;
        }

        public Criteria andCauseZhGreaterThan(String value) {
            addCriterion("cause_zh >", value, "causeZh");
            return (Criteria) this;
        }

        public Criteria andCauseZhGreaterThanOrEqualTo(String value) {
            addCriterion("cause_zh >=", value, "causeZh");
            return (Criteria) this;
        }

        public Criteria andCauseZhLessThan(String value) {
            addCriterion("cause_zh <", value, "causeZh");
            return (Criteria) this;
        }

        public Criteria andCauseZhLessThanOrEqualTo(String value) {
            addCriterion("cause_zh <=", value, "causeZh");
            return (Criteria) this;
        }

        public Criteria andCauseZhLike(String value) {
            addCriterion("cause_zh like", value, "causeZh");
            return (Criteria) this;
        }

        public Criteria andCauseZhNotLike(String value) {
            addCriterion("cause_zh not like", value, "causeZh");
            return (Criteria) this;
        }

        public Criteria andCauseZhIn(List<String> values) {
            addCriterion("cause_zh in", values, "causeZh");
            return (Criteria) this;
        }

        public Criteria andCauseZhNotIn(List<String> values) {
            addCriterion("cause_zh not in", values, "causeZh");
            return (Criteria) this;
        }

        public Criteria andCauseZhBetween(String value1, String value2) {
            addCriterion("cause_zh between", value1, value2, "causeZh");
            return (Criteria) this;
        }

        public Criteria andCauseZhNotBetween(String value1, String value2) {
            addCriterion("cause_zh not between", value1, value2, "causeZh");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("action is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("action is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("action <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("action like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("action not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("action not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionZhIsNull() {
            addCriterion("action_zh is null");
            return (Criteria) this;
        }

        public Criteria andActionZhIsNotNull() {
            addCriterion("action_zh is not null");
            return (Criteria) this;
        }

        public Criteria andActionZhEqualTo(String value) {
            addCriterion("action_zh =", value, "actionZh");
            return (Criteria) this;
        }

        public Criteria andActionZhNotEqualTo(String value) {
            addCriterion("action_zh <>", value, "actionZh");
            return (Criteria) this;
        }

        public Criteria andActionZhGreaterThan(String value) {
            addCriterion("action_zh >", value, "actionZh");
            return (Criteria) this;
        }

        public Criteria andActionZhGreaterThanOrEqualTo(String value) {
            addCriterion("action_zh >=", value, "actionZh");
            return (Criteria) this;
        }

        public Criteria andActionZhLessThan(String value) {
            addCriterion("action_zh <", value, "actionZh");
            return (Criteria) this;
        }

        public Criteria andActionZhLessThanOrEqualTo(String value) {
            addCriterion("action_zh <=", value, "actionZh");
            return (Criteria) this;
        }

        public Criteria andActionZhLike(String value) {
            addCriterion("action_zh like", value, "actionZh");
            return (Criteria) this;
        }

        public Criteria andActionZhNotLike(String value) {
            addCriterion("action_zh not like", value, "actionZh");
            return (Criteria) this;
        }

        public Criteria andActionZhIn(List<String> values) {
            addCriterion("action_zh in", values, "actionZh");
            return (Criteria) this;
        }

        public Criteria andActionZhNotIn(List<String> values) {
            addCriterion("action_zh not in", values, "actionZh");
            return (Criteria) this;
        }

        public Criteria andActionZhBetween(String value1, String value2) {
            addCriterion("action_zh between", value1, value2, "actionZh");
            return (Criteria) this;
        }

        public Criteria andActionZhNotBetween(String value1, String value2) {
            addCriterion("action_zh not between", value1, value2, "actionZh");
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