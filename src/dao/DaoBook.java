package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Book;
import model.Row;

public class DaoBook implements DaoBasic {
    
    public DaoBook() {
        String inst = "create table if not exists Book ("
                    + " code int"
                    + ",categoryM varchar(100)"
                    + ",categoryS varchar(255)"
                    + ",editora varchar(100)"
                    + ",author varchar(100)"
                    + ",title varchar(100)"
                    + ",amountT int"
                    + ",amountD int"
                    + ",restricted boolean"
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
        Book b = (Book) o;
        String inst = "insert into Book(code, categoryM, categoryS, editora, author, title, amountT, amountD, restricted)";
        inst += "values(?,?,?,?,?,?,?,?,?);";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try(PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, b.getCode());
                pS.setString(2, b.getCategoryM());
                pS.setString(3, b.getCategoryS());
                pS.setString(4, b.getEditora());
                pS.setString(5, b.getAuthor());
                pS.setString(6, b.getTitle());
                pS.setInt(7, b.getAmountT());
                pS.setInt(8, b.getAmountD());
                pS.setBoolean(9, b.isRestricted());
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
        Book b = (Book) o;
        String inst = "update Book set categoryM = ?, categoryS = ?, editora = ?, author = ?, title = ?, amountT = ?, amountD = ?, restricted = ?";
        inst += "where code = ?;";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try(PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setString(1, b.getCategoryM());
                pS.setString(2, b.getCategoryS());
                pS.setString(3, b.getEditora());
                pS.setString(4, b.getAuthor());
                pS.setString(5, b.getTitle());
                pS.setInt(6, b.getAmountT());
                pS.setInt(7, b.getAmountD());
                pS.setBoolean(8, b.isRestricted());
                pS.setInt(9, b.getCode());
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
        Book b = (Book) o;
        String inst = "delete from Book where code = ?;";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try(PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, b.getCode());
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
        String inst = "select * from Book into outfile '../../../" + path + "';";
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
        String inst = "select * from Book where code = ?;";
        Book b = null;
        ResultSet rS;
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, code);
                rS = pS.executeQuery();
                if (rS.next()) {
                    b = new Book();
                    b.setCode(rS.getInt(1));
                    b.setCategoryM(rS.getString(2));
                    b.setCategoryS(rS.getString(3));
                    b.setEditora(rS.getString(4));
                    b.setAuthor(rS.getString(5));
                    b.setTitle(rS.getString(6));
                    b.setAmountT(rS.getInt(7));
                    b.setAmountD(rS.getInt(8));
                    b.setRestricted(rS.getBoolean(9));
                }
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return (b);
    }

    @Override
    public List<Object> list() {
        String inst = "select * from Book order by author";
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