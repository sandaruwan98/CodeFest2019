package servlets;

import dao.LoginDAO;
import dao.QuizDAO;
import entity.Quiz;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

public class QuizServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String course=request.getParameter("course-name");
        String unit=request.getParameter("unit-name");

        HttpSession session = request.getSession(false);
        if(session!=null)
            //System.out.println(answer);
        try {
            ArrayList<Quiz> allQuestions = QuizDAO.getAllQuestions(course,unit);
            session.setAttribute("questionList",allQuestions);
            RequestDispatcher rd=request.getRequestDispatcher("virtualQ.jsp");
            rd.include(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        out.close();
    }

}
