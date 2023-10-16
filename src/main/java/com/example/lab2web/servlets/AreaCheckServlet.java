package com.example.lab2web.servlets;

import com.example.lab2web.backend.CheckValue;
import com.example.lab2web.backend.CreatePoint;
import com.example.lab2web.backend.Point;
import com.example.lab2web.backend.PointCollection;
import jakarta.servlet.Filter;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class AreaCheckServlet extends jakarta.servlet.http.HttpServlet{

    private PointCollection pointCollection;
    private String baseServlet;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();
        baseServlet = "/controller";
        pointCollection = new PointCollection();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("AREA GET");
        PrintWriter out = response.getWriter();
        if (baseServlet.equals(request.getAttribute("headServlet"))) {
            request.setAttribute("pointCollection", pointCollection);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Invalid coordinations');");
            out.println("location='index.jsp';");
            out.println("</script>");
            response.setStatus(400);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        if (baseServlet.equals(request.getAttribute("headServlet"))) {
            long t1 = System.nanoTime();
            String action = request.getParameter("action");
            switch (action) {
                case "update":
                    CreatePoint createPoint = new CreatePoint();
                    CheckValue checkValue = new CheckValue();
                    if (checkValue.ckeck(request.getParameter("x"), request.getParameter("y"), request.getParameter("r"))) {
                        Point point = createPoint.create(request.getParameter("x"), request.getParameter("y"), request.getParameter("r"));
                        long t2 = System.nanoTime() - t1;
                        point.setTime(String.format("%.5f", Float.valueOf(t2) / 1000000000));
                        pointCollection.addPoint(point);
                        request.setAttribute("pointCollection", pointCollection);
                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                    } else {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('Invalid coordinations');");
                        out.println("location='index.jsp';");
                        out.println("</script>");
                        response.setStatus(400);
                    }

                    break;
                case "clear":
                    pointCollection.clear();
                    request.setAttribute("pointCollection", pointCollection);
                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                    break;
                default:
                    System.out.println("DEFAULT");
            }
        }

    }
}


