package model;

public class Book {
    
    private int code, amountT, amountD;
    private boolean restricted;
    private String author, title, categoryM, categoryS, editora;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getAmountT() {
        return amountT;
    }

    public void setAmountT(int amountT) {
        this.amountT = amountT;
    }

    public int getAmountD() {
        return amountD;
    }

    public void setAmountD(int amountD) {
        this.amountD = amountD;
    }

    public boolean isRestricted() {
        return restricted;
    }

    public void setRestricted(boolean restricted) {
        this.restricted = restricted;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryM() {
        return categoryM;
    }

    public void setCategoryM(String categoryM) {
        this.categoryM = categoryM;
    }

    public String getCategoryS() {
        return categoryS;
    }

    public void setCategoryS(String categoryS) {
        this.categoryS = categoryS;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}