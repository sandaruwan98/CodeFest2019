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

public class AddQuizServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String course=request.getParameter("course-name");
        String unit=request.getParameter("unit-name");
        String question=request.getParameter("question-contain");
        String ans1=request.getParameter("ans1");
        String ans2=request.getParameter("ans2");
        String ans3=request.getParameter("ans3");
        String ans4=request.getParameter("ans4");
        String realAns=request.getParameter("real-ans");
        String explanation=request.getParameter("exp");
        int act_ans=Integer.parseInt(realAns);

        HttpSession session = request.getSession(false);
        if(session!=null)
            //System.out.println(answer);
            try {
                boolean addQuiz = QuizDAO.addQuiz(new Quiz(course,unit,"",question,ans1,ans2,ans3,ans4,explanation,"",1,act_ans));
                if(addQuiz){
                    //Redirect to moderator page
                    System.out.println("Done");
                }
                /*RequestDispatcher rd=request.getRequestDispatcher("virtualQ.jsp");
                rd.include(request,response);*/
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        out.close();
    }

}
