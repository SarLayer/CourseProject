package by.bntu.fitr.povt.sunRevival.servlets;

import by.bntu.fitr.povt.sunRevival.login.ConnectionProvider;
import by.bntu.fitr.povt.sunRevival.login.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/LoginRegister")
public class LoginRegister extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ConnectionProvider cd = new ConnectionProvider();
        String userName= "";
        String password= "";
        String password1="";
        String password2= "";
        String submitType= "";
        String submitType1= "";
        userName= request.getParameter("username");
        password= request.getParameter("password");
        password1= request.getParameter("password1");
        password2= request.getParameter("password2");
        submitType= request.getParameter("login");
        submitType1= request.getParameter("register");
        /*if( "Login".equals(submitType)) {
        userName = userName.trim();
        password = password.trim();
        }
        if("Registration".equals(submitType1)){
            userName = userName.trim();
            password1 = password1.trim();
            password2 = password2.trim();
        }*/
        System.out.println(userName);
        System.out.println(password);



        if( "Login".equals(submitType) && !userName.equals("") && !password.equals("")) {
            try {

                if (cd.login(new Customer(userName, password))) {

                    request.getRequestDispatcher("welcome.jsp").forward(request, response);
                }
                else
                {
                    request.setAttribute("message","Data Not Found");
                    request.getRequestDispatcher("login.jsp").forward(request,response);
                }

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
       
       
         else if("Registration".equals(submitType1) && password1.length()>0  && password1.equals(password2)){
          
            try {

                cd.insertCustomer(new Customer(userName,password1));
                request.setAttribute("successMessage","Registration Done");
                request.getRequestDispatcher("login.jsp").forward(request,response);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            }
       
       
        else{
            request.setAttribute("message","Data Not Found");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
        
    }
    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

}
