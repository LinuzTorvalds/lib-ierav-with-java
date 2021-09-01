package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Member;

public class DaoMember implements DaoBasic {
    
    public DaoMember() {
        String inst = "create table if not exists Member ("
                    + " code int"
                    + ",name varchar(255)"
                    + ",phone varchar(16)"
                    + ",cellphone varchar(16)"
                    + ",adress varchar(100)"
                    + ",seminarian boolean"
                    + ",ioan boolean"
                    + ",situation varchar(30)"
                    + ",owing boolean"
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
        Member m = (Member) o;
        String inst = "insert into Member(code, name, phone, cellphone, adress, seminarian, ioan, situation, owing) ";
            inst += "values(?,?,?,?,?,?,?,?,?);";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try(PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, m.getCode());
                pS.setString(2, m.getName());
                pS.setString(3, m.getPhone());
                pS.setString(4, m.getCellphone());
                pS.setString(5, m.getAdress());
                pS.setBoolean(6, m.isSeminarian());
                pS.setBoolean(7, m.isIoan());
                pS.setString(8, m.getSituation());
                pS.setBoolean(9, m.isOwing());
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
        Member m = (Member) o;
        String inst = "update Member set name = ?, phone = ?, cellphone = ?, adress = ?, seminarian = ?, ioan = ?, situation = ?, owing = ?";
        inst += " where code = ?;";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try(PreparedStatement pS = con.prepareStatement(inst)) {                
                pS.setString(1, m.getName());
                pS.setString(2, m.getPhone());
                pS.setString(3, m.getCellphone());
                pS.setString(4, m.getAdress());
                pS.setBoolean(5, m.isSeminarian());
                pS.setBoolean(6, m.isIoan());
                pS.setString(7, m.getSituation());
                pS.setBoolean(8, m.isOwing());
                pS.setInt(9, m.getCode());
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
        Member m = (Member) o;
        String inst = "delete from Member where code = ?;";
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try(PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, m.getCode());
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
        String inst = "select * from Member into outfile '../../../" + path + "';";
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
        String inst = "select * from Member where code = ?;";
        Member m = null;
        ResultSet rS;
        try {
            Connection con = DaoConnection.getInstance().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)) {
                pS.setInt(1, code);
                rS = pS.executeQuery();
                if (rS.next()) {
                    m = new Member();
                    m.setCode(rS.getInt(1));
                    m.setName(rS.getString(2));
                    m.setPhone(rS.getString(3));
                    m.setCellphone(rS.getString(4));
                    m.setAdress(rS.getString(5));
                    m.setSeminarian(rS.getBoolean(6));
                    m.setIoan(rS.getBoolean(7));
                    m.setSituation(rS.getString(8));
                    m.setOwing(rS.getBoolean(9));
                }
            }
            DaoConnection.getInstance().setCon(con);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return (m);
    }

    @Override
    public List<Object> list() {
        String inst = "select * from Member order by name";
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