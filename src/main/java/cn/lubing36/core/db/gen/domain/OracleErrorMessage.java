package cn.lubing36.core.db.gen.domain;

public class OracleErrorMessage {
    private Integer id;

    private String errorCode;

    private String errorMsg;

    private String errorMsgZh;

    private String cause;

    private String causeZh;

    private String action;

    private String actionZh;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    public String getErrorMsgZh() {
        return errorMsgZh;
    }

    public void setErrorMsgZh(String errorMsgZh) {
        this.errorMsgZh = errorMsgZh == null ? null : errorMsgZh.trim();
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getCauseZh() {
        return causeZh;
    }

    public void setCauseZh(String causeZh) {
        this.causeZh = causeZh == null ? null : causeZh.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getActionZh() {
        return actionZh;
    }

    public void setActionZh(String actionZh) {
        this.actionZh = actionZh == null ? null : actionZh.trim();
    }
}