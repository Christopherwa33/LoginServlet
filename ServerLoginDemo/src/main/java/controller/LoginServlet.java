/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Response;

/**
 *
 * @author Utente
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    
    private final String user = "demo";
    private final String password = "demo";
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        
        String paramUsername = request.getParameter("username");
        String paramPassword = request.getParameter("password");
        
        if (user.equals(paramUsername)&& password.equals(paramPassword)){
            //se l'autenticazione va a buon fine 
            //recupero la sessione 
        HttpSession oldSession = request.getSession(false);
        if (oldSession != null ){
            oldSession.invalidate();  //o invalido la sessione se esistente
           }
    
        HttpSession currentSession = request.getSession();//crea nuova sessione 
        currentSession.setAttribute("user", paramUsername);
        currentSession.setMaxInactiveInterval(5*60);//Five minuti di inattiviatà massima
        response.sendRedirect("success.jsp");
        //autenticazione fallita
        }else{
        response.sendRedirect("login.jsp");
        }
    }
}
