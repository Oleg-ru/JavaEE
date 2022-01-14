package cookies;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class SetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Создание и назначение cookies для ответа
        Cookie cookie1 = new Cookie("id_user", "12");
        Cookie cookie2 = new Cookie("name_user", "Don");

        //обязательные поля время жизни
        //можно задать значение -1 и тогда cookies будут удаляться после закрытия браузера
        cookie1.setMaxAge(24 * 60 * 60);
        cookie2.setMaxAge(24 * 60 * 60);

        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
