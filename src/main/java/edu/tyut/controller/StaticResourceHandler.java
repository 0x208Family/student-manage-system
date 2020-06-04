package edu.tyut.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StaticResourceHandler extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        char[] buffer = new char[1024];
        int offset;
        try (
                InputStreamReader reader = new InputStreamReader(
                        new FileInputStream(this.getServletContext().getRealPath(req.getServletPath())),
                        StandardCharsets.UTF_8);
                OutputStreamWriter writer = new OutputStreamWriter(resp.getOutputStream(), StandardCharsets.UTF_8)
        ) {
            while ((offset = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, offset);
            }
        }
    }
}
