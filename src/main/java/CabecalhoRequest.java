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
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.*;
import java.io.*;


/**
 *
 * @author rafae
 */
@WebServlet(urlPatterns = {"/CabecalhoRequest"})
public class CabecalhoRequest extends HttpServlet {

    public void doGet(HttpServletRequest request,
        HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body><head><title> Recuperando todos os parametros do Cabeçalho </title ></head >");
        out.println("<h1>Recuperando todos os parametros do Cabeçalho</h1>");
        Enumeration campos = request.getHeaderNames();
        while (campos.hasMoreElements()) {
            String campo = (String) campos.nextElement();
            String valor = request.getHeader(campo);
            out.println("<li>" + campo + " = " + valor + "</li>");
        }
        out.println("</body></html>");
        out.close();
    }
}
