package servlets;

import dao.LoginDAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n=request.getParameter("uname");
        String p=request.getParameter("psw");

        HttpSession session = request.getSession(false);
        if(session!=null)
            session.setAttribute("name", n);

        try {
            int accessLevel = LoginDAO.validate(n, p);
            if(accessLevel>=0){
                RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
                rd.forward(request,response);
                if(accessLevel==0){
                    session.setAttribute("accessLevel","Admin");
                }else if(accessLevel==1){
                    session.setAttribute("accessLevel","Moderator");
                }else if(accessLevel==2){
                    session.setAttribute("accessLevel","Student");
                }
            }
            else{
                System.out.println("Error");
                out.print("<p style=\"color:red\">Sorry username or password error</p>");
                RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
                rd.include(request,response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        out.close();
    }

}
