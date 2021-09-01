package model;

import java.util.Date;
import org.joda.time.Period;

public class Ioan {
    
    private int code;
    private Book book;
    private Member member;
    private Date dateE, dateD;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Date getDateE() {
        return dateE;
    }

    public void setDateE(Date dateE) {
        this.dateE = dateE;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }
    
    public String modifySituation() {
        String situation = "";
        Date date = new Date();
        Period period = new Period(dateD.getTime(), date.getTime());
        int weeks = period.getWeeks();
        if (weeks <= 2) 
            situation = "late";
        else if (weeks > 2 && weeks <= 10)
            situation = "impeded";
        else if (weeks > 10)
            situation = "suspended";
        return situation;
    }
    
    public float showFine() {
        float fine;
        Date data = new Date();
        Period period = new Period(dateD.getTime(), data.getTime());
        int weeks = period.getWeeks();
        fine = 5 * weeks;
        return fine;
    }
}