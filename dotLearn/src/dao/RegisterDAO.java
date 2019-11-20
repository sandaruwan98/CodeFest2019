package dao;

import db.DBConnection;
import dto.UserDTO;
import entity.User;
import sun.rmi.runtime.NewThreadAction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterDAO {
    //CRUD Operations
    public static boolean register(UserDTO user) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("insert into login (username,password,access_level) values(?,?,2)");
        pst.setObject(1,user.getFname()+" "+user.getLname());
        pst.setObject(2,user.getPassword());
        int result = pst.executeUpdate();
        System.out.println(result);
        if(result>0){
            int lastID = getLastID();
            pst = connection.prepareStatement("insert into student values(?,?,?)");
            pst.setObject(1,lastID);
            pst.setObject(2,user.getName());
            pst.setObject(3,user.getEmail());
            int studentResult = pst.executeUpdate();
            return studentResult>0;
        }
        return false;
    }

    public static int getLastID() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("select user_id from login order by user_id desc limit 1");
        ResultSet rst = pst.executeQuery();
        if(rst.next()){
            return rst.getInt(1);
        }
        return 0;
    }
}