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
            session.setAttribute("hello-user", "Hello "+n);
            System.out.println(n+" "+p);
        try {
            int accessLevel = LoginDAO.validate(n, p);
            if(accessLevel>=0){
                if(accessLevel==0){
                    session.setAttribute("accessLevel","Admin");
                    RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
                    rd.forward(request,response);
                }else if(accessLevel==1){
                    session.setAttribute("accessLevel","Moderator");
                    RequestDispatcher rd=request.getRequestDispatcher("moderator.jsp");
                    rd.forward(request,response);
                }else if(accessLevel==2){
                    session.setAttribute("accessLevel","Student");
                    session.setAttribute("display-btn","none");
                    session.setAttribute("display","block");
                    RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                    rd.forward(request,response);
                }
            }
            else{
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
