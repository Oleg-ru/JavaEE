package servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import logic.Cart;

import java.io.IOException;


public class SessionBasketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Session with class Cart
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");

        String name = request.getParameter("name");
        int quality = Integer.parseInt(request.getParameter("quality"));
        System.out.println(name + " : " + quality);

        if (cart == null) {
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quality);
        }
        session.setAttribute("cart", cart);

        //forward на jsp файл. т.е переход в корзину
        getServletContext().getRequestDispatcher("/testRedirectForward.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
