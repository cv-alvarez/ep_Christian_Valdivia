package com.example.ep_christianvaldivia.proxy.controller;


import com.example.ep_christianvaldivia.proxy.dao.ArtistDao;
import com.example.ep_christianvaldivia.proxy.model.Artist;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListArtistServlet", value = "/ListArtistServlet")

public class ListArtistServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArtistDao artistDao = new ArtistDao();
        try {
            List<Artist> listArtist = artistDao.getArtist();
            RequestDispatcher dispatcher = request.getRequestDispatcher("/listArtist.jsp");
            request.setAttribute("list",listArtist);
        } catch (Exception e) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/error.jsp");
            request.setAttribute("message", e );
            requestDispatcher.forward(request,response);
            e.printStackTrace();
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }


}
