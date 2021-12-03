package com;

import javax.jws.WebService;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

@WebServlet (urlPatterns = {"cool-servlet"})
public class Servlett extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log("Method init =)");
    }



    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.getWriter().write("Method enter\n");
        super.service(req, resp);
        resp.getWriter().write("Method service\n");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url  = req.getRequestURI();
        String par = formatParams(req);
        resp.getWriter().write("Method doGet\nURL"+url+ "\nParamrters\n"+par);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url  = req.getRequestURI();
        String par = formatParams(req);
        resp.getWriter().write("Method doPost\nURL:"+url+ "\nParamrters\n"+par+"\n");
    }

    private String formatParams(HttpServletRequest req) {
        return req.getParameterMap()
                .entrySet()
                .stream()
                .map(entry ->{
                 String paranm =  String.join( "and", entry.getValue());
               return entry.getKey()+"=>"+paranm;
                })
                .collect(Collectors.joining());
    }

    @Override
    public void destroy() {
        log("Method destroy =)");

    }


}

