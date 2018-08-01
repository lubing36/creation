package cn.lubing36.core.db.gen.domain;


public class JcPlannedOrder {
    private Integer id;

    private String planDate;

    private String planData;

    private String planAnalyse;

    private Long planCostInput;

    private String isWin;

    private Long profit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlanDate() {
        return planDate;
    }

    public void setPlanDate(String planDate) {
        this.planDate = planDate == null ? null : planDate.trim();
    }

    public String getPlanData() {
        return planData;
    }

    public void setPlanData(String planData) {
        this.planData = planData == null ? null : planData.trim();
    }

    public String getPlanAnalyse() {
        return planAnalyse;
    }

    public void setPlanAnalyse(String planAnalyse) {
        this.planAnalyse = planAnalyse == null ? null : planAnalyse.trim();
    }

    public Long getPlanCostInput() {
        return planCostInput;
    }

    public void setPlanCostInput(Long planCostInput) {
        this.planCostInput = planCostInput;
    }

    public String getIsWin() {
        return isWin;
    }

    public void setIsWin(String isWin) {
        this.isWin = isWin == null ? null : isWin.trim();
    }

    public Long getProfit() {
        return profit;
    }

    public void setProfit(Long profit) {
        this.profit = profit;
    }
}