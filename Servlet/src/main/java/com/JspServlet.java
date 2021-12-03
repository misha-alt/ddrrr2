package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/temp-servlet")
public class JspServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp);
        ArrayList<User> users = new ArrayList<User>(){{
              add(new User("Misha", "Belaruss", 34));
              add(new User("Dima", "Grete Britane", 34));
               add(new User("Piter", "USA", 34));
            }};
        req.setAttribute("users", users);

        getServletContext().getRequestDispatcher("/first-jsp.jsp").forward(req,resp);
    }
}
