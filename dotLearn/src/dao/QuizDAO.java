package dao;

import db.DBConnection;
import entity.Quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QuizDAO {
    //CRUD Operations
    public static ArrayList<Quiz> getAllQuestions(String courseName,String unitName) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("select * from lessons where courseName=? and UnitName=?");
        pst.setObject(1,courseName);
        pst.setObject(2,unitName);
        ResultSet rst = pst.executeQuery();
        ArrayList<Quiz> quizList=new ArrayList<>();
        while(rst.next()){
            int cid = rst.getInt(2);
            String course = rst.getString(3);
            String unit = rst.getString(4);
            String unitContain = rst.getString(5);
            String questionContain = rst.getString(6);
            String ans1 = rst.getString(7);
            String ans2 = rst.getString(8);
            String ans3 = rst.getString(9);
            String ans4 = rst.getString(10);
            int realAns = rst.getInt(11);
            String explain = rst.getString(12);
            String comments = rst.getString(13);
            quizList.add(new Quiz(course,unit,unitContain,questionContain,ans1,ans2,ans3,ans4,explain,comments,cid,realAns));
        }
        return quizList;
    }

    public static boolean addQuiz(Quiz quiz) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pst = connection.prepareStatement("insert into lessons values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        pst.setObject(1,"");
        pst.setObject(2,quiz.getCid());
        pst.setObject(3,quiz.getCourseName());
        pst.setObject(4,quiz.getUnitName());
        pst.setObject(5,quiz.getUnitContain());
        pst.setObject(6,quiz.getQuesContain());
        pst.setObject(7,quiz.getAns1());
        pst.setObject(8,quiz.getAns2());
        pst.setObject(9,quiz.getAns3());
        pst.setObject(10,quiz.getAns4());
        pst.setObject(11,quiz.getRealAns());
        pst.setObject(12,quiz.getExplain());
        pst.setObject(13,quiz.getComments());
        int result = pst.executeUpdate();
        return result>0;
    }
}