package com.example.lab2web.servlets;


import com.example.lab2web.backend.CreatePoint;
import com.example.lab2web.backend.Point;
import com.example.lab2web.backend.PointCollection;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ControllerServlet extends jakarta.servlet.http.HttpServlet{


    @Override
    public void init(ServletConfig config) throws ServletException {
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/area-check-servlet").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "update":
                System.out.println("POST CONTROLLER UPDATE");
                request.getRequestDispatcher("/area-check-servlet").forward(request, response);
                break;
            case "clear":
                System.out.println("CLEAR");
                request.getRequestDispatcher("/area-check-servlet").forward(request, response);
                break;
            default:
                System.out.println("DEFAULT");
        }


    }




}


