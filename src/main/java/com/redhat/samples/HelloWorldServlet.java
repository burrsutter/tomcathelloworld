package com.redhat.samples;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;

@WebServlet("/HelloWorld")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<HTML><BODY>");
        writer.println("<H1>Hello World</H1>" + java.time.LocalDateTime.now());
        writer.println("</BODY></HTML>");
        writer.close();        
    }

}
