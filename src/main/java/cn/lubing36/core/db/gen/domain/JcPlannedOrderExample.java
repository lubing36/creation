package cn.lubing36.core.db.gen.domain;

import java.util.ArrayList;
import java.util.List;

public class JcPlannedOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JcPlannedOrderExample() {
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

        public Criteria andPlanDateIsNull() {
            addCriterion("plan_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNotNull() {
            addCriterion("plan_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDateEqualTo(String value) {
            addCriterion("plan_date =", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotEqualTo(String value) {
            addCriterion("plan_date <>", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThan(String value) {
            addCriterion("plan_date >", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThanOrEqualTo(String value) {
            addCriterion("plan_date >=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThan(String value) {
            addCriterion("plan_date <", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThanOrEqualTo(String value) {
            addCriterion("plan_date <=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLike(String value) {
            addCriterion("plan_date like", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotLike(String value) {
            addCriterion("plan_date not like", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIn(List<String> values) {
            addCriterion("plan_date in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotIn(List<String> values) {
            addCriterion("plan_date not in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateBetween(String value1, String value2) {
            addCriterion("plan_date between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotBetween(String value1, String value2) {
            addCriterion("plan_date not between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDataIsNull() {
            addCriterion("plan_data is null");
            return (Criteria) this;
        }

        public Criteria andPlanDataIsNotNull() {
            addCriterion("plan_data is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDataEqualTo(String value) {
            addCriterion("plan_data =", value, "planData");
            return (Criteria) this;
        }

        public Criteria andPlanDataNotEqualTo(String value) {
            addCriterion("plan_data <>", value, "planData");
            return (Criteria) this;
        }

        public Criteria andPlanDataGreaterThan(String value) {
            addCriterion("plan_data >", value, "planData");
            return (Criteria) this;
        }

        public Criteria andPlanDataGreaterThanOrEqualTo(String value) {
            addCriterion("plan_data >=", value, "planData");
            return (Criteria) this;
        }

        public Criteria andPlanDataLessThan(String value) {
            addCriterion("plan_data <", value, "planData");
            return (Criteria) this;
        }

        public Criteria andPlanDataLessThanOrEqualTo(String value) {
            addCriterion("plan_data <=", value, "planData");
            return (Criteria) this;
        }

        public Criteria andPlanDataLike(String value) {
            addCriterion("plan_data like", value, "planData");
            return (Criteria) this;
        }

        public Criteria andPlanDataNotLike(String value) {
            addCriterion("plan_data not like", value, "planData");
            return (Criteria) this;
        }

        public Criteria andPlanDataIn(List<String> values) {
            addCriterion("plan_data in", values, "planData");
            return (Criteria) this;
        }

        public Criteria andPlanDataNotIn(List<String> values) {
            addCriterion("plan_data not in", values, "planData");
            return (Criteria) this;
        }

        public Criteria andPlanDataBetween(String value1, String value2) {
            addCriterion("plan_data between", value1, value2, "planData");
            return (Criteria) this;
        }

        public Criteria andPlanDataNotBetween(String value1, String value2) {
            addCriterion("plan_data not between", value1, value2, "planData");
            return (Criteria) this;
        }

        public Criteria andPlanAnalyseIsNull() {
            addCriterion("plan_analyse is null");
            return (Criteria) this;
        }

        public Criteria andPlanAnalyseIsNotNull() {
            addCriterion("plan_analyse is not null");
            return (Criteria) this;
        }

        public Criteria andPlanAnalyseEqualTo(String value) {
            addCriterion("plan_analyse =", value, "planAnalyse");
            return (Criteria) this;
        }

        public Criteria andPlanAnalyseNotEqualTo(String value) {
            addCriterion("plan_analyse <>", value, "planAnalyse");
            return (Criteria) this;
        }

        public Criteria andPlanAnalyseGreaterThan(String value) {
            addCriterion("plan_analyse >", value, "planAnalyse");
            return (Criteria) this;
        }

        public Criteria andPlanAnalyseGreaterThanOrEqualTo(String value) {
            addCriterion("plan_analyse >=", value, "planAnalyse");
            return (Criteria) this;
        }

        public Criteria andPlanAnalyseLessThan(String value) {
            addCriterion("plan_analyse <", value, "planAnalyse");
            return (Criteria) this;
        }

        public Criteria andPlanAnalyseLessThanOrEqualTo(String value) {
            addCriterion("plan_analyse <=", value, "planAnalyse");
            return (Criteria) this;
        }

        public Criteria andPlanAnalyseLike(String value) {
            addCriterion("plan_analyse like", value, "planAnalyse");
            return (Criteria) this;
        }

        public Criteria andPlanAnalyseNotLike(String value) {
            addCriterion("plan_analyse not like", value, "planAnalyse");
            return (Criteria) this;
        }

        public Criteria andPlanAnalyseIn(List<String> values) {
            addCriterion("plan_analyse in", values, "planAnalyse");
            return (Criteria) this;
        }

        public Criteria andPlanAnalyseNotIn(List<String> values) {
            addCriterion("plan_analyse not in", values, "planAnalyse");
            return (Criteria) this;
        }

        public Criteria andPlanAnalyseBetween(String value1, String value2) {
            addCriterion("plan_analyse between", value1, value2, "planAnalyse");
            return (Criteria) this;
        }

        public Criteria andPlanAnalyseNotBetween(String value1, String value2) {
            addCriterion("plan_analyse not between", value1, value2, "planAnalyse");
            return (Criteria) this;
        }

        public Criteria andPlanCostInputIsNull() {
            addCriterion("plan_cost_input is null");
            return (Criteria) this;
        }

        public Criteria andPlanCostInputIsNotNull() {
            addCriterion("plan_cost_input is not null");
            return (Criteria) this;
        }

        public Criteria andPlanCostInputEqualTo(Long value) {
            addCriterion("plan_cost_input =", value, "planCostInput");
            return (Criteria) this;
        }

        public Criteria andPlanCostInputNotEqualTo(Long value) {
            addCriterion("plan_cost_input <>", value, "planCostInput");
            return (Criteria) this;
        }

        public Criteria andPlanCostInputGreaterThan(Long value) {
            addCriterion("plan_cost_input >", value, "planCostInput");
            return (Criteria) this;
        }

        public Criteria andPlanCostInputGreaterThanOrEqualTo(Long value) {
            addCriterion("plan_cost_input >=", value, "planCostInput");
            return (Criteria) this;
        }

        public Criteria andPlanCostInputLessThan(Long value) {
            addCriterion("plan_cost_input <", value, "planCostInput");
            return (Criteria) this;
        }

        public Criteria andPlanCostInputLessThanOrEqualTo(Long value) {
            addCriterion("plan_cost_input <=", value, "planCostInput");
            return (Criteria) this;
        }

        public Criteria andPlanCostInputIn(List<Long> values) {
            addCriterion("plan_cost_input in", values, "planCostInput");
            return (Criteria) this;
        }

        public Criteria andPlanCostInputNotIn(List<Long> values) {
            addCriterion("plan_cost_input not in", values, "planCostInput");
            return (Criteria) this;
        }

        public Criteria andPlanCostInputBetween(Long value1, Long value2) {
            addCriterion("plan_cost_input between", value1, value2, "planCostInput");
            return (Criteria) this;
        }

        public Criteria andPlanCostInputNotBetween(Long value1, Long value2) {
            addCriterion("plan_cost_input not between", value1, value2, "planCostInput");
            return (Criteria) this;
        }

        public Criteria andIsWinIsNull() {
            addCriterion("is_win is null");
            return (Criteria) this;
        }

        public Criteria andIsWinIsNotNull() {
            addCriterion("is_win is not null");
            return (Criteria) this;
        }

        public Criteria andIsWinEqualTo(String value) {
            addCriterion("is_win =", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinNotEqualTo(String value) {
            addCriterion("is_win <>", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinGreaterThan(String value) {
            addCriterion("is_win >", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinGreaterThanOrEqualTo(String value) {
            addCriterion("is_win >=", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinLessThan(String value) {
            addCriterion("is_win <", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinLessThanOrEqualTo(String value) {
            addCriterion("is_win <=", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinLike(String value) {
            addCriterion("is_win like", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinNotLike(String value) {
            addCriterion("is_win not like", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinIn(List<String> values) {
            addCriterion("is_win in", values, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinNotIn(List<String> values) {
            addCriterion("is_win not in", values, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinBetween(String value1, String value2) {
            addCriterion("is_win between", value1, value2, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinNotBetween(String value1, String value2) {
            addCriterion("is_win not between", value1, value2, "isWin");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(Long value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(Long value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(Long value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(Long value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(Long value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(Long value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<Long> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<Long> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(Long value1, Long value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(Long value1, Long value2) {
            addCriterion("profit not between", value1, value2, "profit");
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