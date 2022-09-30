package controller;


import org.apache.hc.core5.http.impl.io.IdentityInputStream;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("Controller")
public class Controller extends HttpServlet {
//    private final PokemonDB pokemonDB = new PokemonDB();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String command = "home";
        if (request.getParameter("command") != null) {
            command = request.getParameter("command");
        }
        String destination;
        switch (command) {
            case "useroverview":
                destination = overzicht(request, response);
                break;

            case  "register":
                destination = register(request, response);
                break;

            default:
                destination = home(request, response);
        }

        request.getRequestDispatcher(destination).forward(request, response);
    }

    private String register(HttpServletRequest request, HttpServletResponse response) {
        return "register.jsp";
    }

    private String overzicht(HttpServletRequest request, HttpServletResponse response) {
        return "userOverview.jsp";
    }

    private String home(HttpServletRequest request, HttpServletResponse response) {
        return "index.jsp";
    }
}
