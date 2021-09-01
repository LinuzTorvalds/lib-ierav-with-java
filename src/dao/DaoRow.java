package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Row;

public class DaoRow implements DaoBasic {
    
    public DaoRow() {
        String inst = "create table if not exists Row ("
                    + " book int"
                    + ",row text"
                    + ",primary key(book));";
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
        Row r = (Row) o;
        String inst = "insert into Row(book, row) values(?,?);";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try(PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, r.getBook());
                pS.setString(2, r.getRow());
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
        Row r = (Row) o;
        String inst = "update Row set row = ? where book = ?;";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try(PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setString(1, r.getRow());
                pS.setInt(2, r.getBook());
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
        Row r = (Row) o;
        String inst = "delete from Row where book = ?;";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try(PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, r.getBook());
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
        String inst = "select * from Row into outfile '../../../" + path + "';";
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
    public Object read(String nada, int book) {
        String inst = "select * from Row where book = ?;";
        Row r = null;
        ResultSet rS;
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, book);
                rS = pS.executeQuery();
                if (rS.next()) {
                    r = new Row();                    
                    r.setBook(rS.getInt(1));
                    r.setRow(rS.getString(2));
                }
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return (r);
    }

    @Override
    public List<Object> list() {
        String inst = "select * from Row order by book";
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
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        return list;
    }
}