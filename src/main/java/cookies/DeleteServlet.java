package cookies;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Тут принцип удаления cookies это перезаписывание их
        Cookie cookie = new Cookie("name_user", "");

        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
