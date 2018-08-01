package cn.lubing36.core.db.gen.domain;

public class BankUnionNumberInfo {
    private Integer id;

    private String bankUnionNumber;

    private String bankName;

    private String contactPhone;

    private String contactAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankUnionNumber() {
        return bankUnionNumber;
    }

    public void setBankUnionNumber(String bankUnionNumber) {
        this.bankUnionNumber = bankUnionNumber == null ? null : bankUnionNumber.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }
}