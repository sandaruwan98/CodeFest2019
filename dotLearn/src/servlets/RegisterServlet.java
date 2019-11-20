package servlets;

import dao.LoginDAO;
import dao.RegisterDAO;
import dto.UserDTO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /*response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String email=request.getParameter("email");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String passwordConfirm=request.getParameter("passwordConfirm");

        HttpSession session = request.getSession(false);
        if(session!=null)
        try {
            if(!password.equals(passwordConfirm)){
                out.print("<script>alert(\"Passwords do not match\");</script>");
            }else {
                boolean register = RegisterDAO.register(new UserDTO(fname + " " + lname, email, username, password.hashCode()));
                if(register){
                    out.print("<script>alert(\"Registration Successful\");</script>");
                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                    rd.forward(request, response);
                }else {
                    out.print("<script>alert(\"Registration Unsuccessful\");</script>");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        out.close();*/
    }

}
