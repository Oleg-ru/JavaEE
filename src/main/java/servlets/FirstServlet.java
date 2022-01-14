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
        pw.println("<html>");
        pw.println("<head>" + "<title>Main</title>" + "</head>");
        pw.println("<h2> Hi in our online shop named 'Market' dear " + name + " " + surname + "</h2>");
        pw.println("");
        pw.println("</html>");
        //redirect
        //response.sendRedirect("/mMarket");
        //response
        RequestDispatcher dispatcher = request.getRequestDispatcher("/mMarket");
        dispatcher.forward(request, response);
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
