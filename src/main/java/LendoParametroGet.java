/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rafae
 */
@WebServlet(urlPatterns = {"/LendoParametroGet"})
public class LendoParametroGet extends HttpServlet {

    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title> Recuperando parametros HTTP via GET </title ></head ><body>");
        out.println("<h1>Recuperando parametros HTTP via GET</h1>");
        out.println("<li>Nome = " + request.getParameter("nome") + "</li>");
        out.println("<li>Telefone = " + request.getParameter("fone") + "</li>");
        out.println("</body></html>");
        out.close();
    }
}
