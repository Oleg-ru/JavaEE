package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //получение аргумента
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        PrintWriter pw = response.getWriter();
        pw.println("<html> <h1>Hello world! from doGet</h1>");
        pw.println("<h2> Hi in our online shop named 'Market' dear " + name + " " + surname + "</h2>");
        pw.println("</html>");
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
