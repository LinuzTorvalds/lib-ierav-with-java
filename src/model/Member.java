package model;

public class Member {
    
    private int code;
    private String adress, name, phone, cellphone, situation;
    private boolean seminarian, ioan, owing;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public boolean isSeminarian() {
        return seminarian;
    }

    public void setSeminarian(boolean seminarian) {
        this.seminarian = seminarian;
    }

    public boolean isIoan() {
        return ioan;
    }

    public void setIoan(boolean ioan) {
        this.ioan = ioan;
    }

    public boolean isOwing() {
        return owing;
    }

    public void setOwing(boolean owing) {
        this.owing = owing;
    }      
}