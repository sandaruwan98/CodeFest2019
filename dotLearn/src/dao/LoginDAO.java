package dao;

import db.DBConnection;
import entity.User;
import sun.rmi.runtime.NewThreadAction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    //CRUD Operations
    public static int validate(String uname, String pass) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("select * from login where username=?");
        pst.setObject(1,uname);
        ResultSet rst = pst.executeQuery();
        if(rst.next()){
            long password = rst.getLong(3);
            System.out.println(uname+" "+password+" "+pass);
            int accessLevel = rst.getInt(4);
            if(password==pass.hashCode()){
                return accessLevel;
            }
        }
        return -1;
    }
}