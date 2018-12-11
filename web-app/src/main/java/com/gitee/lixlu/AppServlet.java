package com.gitee.lixlu;

import java.io.IOException;
import java.io.PrintWriter;

public class AppServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();
        String desc = SimpleService.getServiceDescription();
        out.println(desc);
        out.flush();
        out.close();
    }
}
