package main.usersignup;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "servlet", value = "/getData")
public class Servlet extends HttpServlet {

    public void init() {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        String un= (String) request.getParameter("username");
        String pwd = (String) request.getParameter("password");

        Main obj = new Main(un, pwd);

        out.println("<h3>Saved to Database Successfully..</h3>");
        out.println(un);
    }

    public void destroy() {
    }
}