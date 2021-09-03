package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Book;
import model.Loan;
import model.Member;
import useful.Several;

public class DaoLoan implements DaoBasic {
    
    public DaoLoan() {
        String inst = "create table if not exists Loan ("
                    + " code int auto_increment"
                    + ",book int"
                    + ",member int"
                    + ",dateE date"
                    + ",dateD date"
                    + ",constraint book foreign key(book) references Book(code) on update cascade on delete cascade"
                    + ",constraint member foreign key(member) references Member(code) on update cascade on delete cascade"
                    + ",primary key(code));";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.execute();
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public boolean create(Object o) {
        boolean result = true;
        Loan l = (Loan) o;
        String inst = "insert into Loan(book, member, dateE, dateD)";
        inst += "values(?,?,?,?);";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try(PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, l.getBook().getCode());
                pS.setInt(2, l.getMember().getCode());
                pS.setDate(3, Several.dateConvert(l.getDateE()));
                pS.setDate(4, Several.dateConvert(l.getDateD()));
                pS.execute();
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            result = false;
            throw new RuntimeException(ex.getMessage());
        }
        return (result);
    }

    @Override
    public boolean update(Object o) {
        boolean result = true;
        Loan l = (Loan) o;
        String inst = "update Loan set book = ?, member = ?, dateE = ?, dateD = ? where code = ?;";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try(PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, l.getBook().getCode());
                pS.setInt(2, l.getMember().getCode());
                pS.setDate(3, Several.dateConvert(l.getDateE()));
                pS.setDate(4, Several.dateConvert(l.getDateD()));
                pS.setInt(5, l.getCode());
                pS.execute();
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            result = false;
            throw new RuntimeException(ex.getMessage());
        }
        return (result);
    }

    @Override
    public boolean delete(Object o) {
        boolean result = true;
        Loan l = (Loan) o;
        String inst = "delete from Loan where code = ?;";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try(PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, l.getCode());
                pS.execute();
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            result = false;
            throw new RuntimeException(ex.getMessage());
        }
        return (result);
    }

    @Override
    public boolean export(String path) {
        boolean result = true;
        String inst = "select * from Loan into outfile '../../../" + path + "';";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.execute();
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return (result);
    }

    @Override
    public Object read(String nada, int code) {
        String inst = "select * from Loan where code = ?;";
        Loan l = null;
        DaoBook dB = new DaoBook();
        DaoMember dM = new DaoMember();
        ResultSet rS;
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, code);
                rS = pS.executeQuery();
                if (rS.next()) {
                    l = new Loan();
                    l.setCode(rS.getInt(1));
                    Object b = dB.read("", rS.getInt(2));
                    Book book = (Book) b;
                    l.setBook(book);
                    Object m = dM.read("", rS.getInt(3));
                    Member member = (Member) m;
                    l.setMember(member);
                    l.setDateE(rS.getDate(4));
                    l.setDateD(rS.getDate(5));
                }
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return (l);
    }

    @Override
    public List<Object> list() {
        String inst = "select * from Loan order by code";
        List<Object> list = new ArrayList<>();
        ResultSet rS;
        Object o;
        try {
            try (PreparedStatement pS = DaoConnection.getInstance().getCon().prepareStatement(inst)) {
                rS = pS.executeQuery();
                DaoConnection.getInstance().setCon(DaoConnection.getInstance().getCon());
                if (rS != null)
                    while (rS.next()) {
                        o = read("", rS.getInt(1));
                        list.add(o);
                    }
                pS.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return list;
    }
}