package com.example.ep_christianvaldivia.proxy.controller;
import com.example.ep_christianvaldivia.proxy.dao.ArtistDao;
import com.example.ep_christianvaldivia.proxy.model.Artist;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ArtistServlet", value = "/ArtistServlet")

public class AddArtistServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher =request.getRequestDispatcher("/addArtist.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArtistDao dao= new ArtistDao();
        int rowsAffected=0;

        Artist artist = new Artist();
        artist.setUsername(request.getParameter("username"));
        artist.setName(request.getParameter("name"));
        artist.setAge(request.getParameter("age"));
        artist.setGender(request.getParameter("genre"));

        try{
            rowsAffected = dao.addArtist(artist);
            if(rowsAffected>0) {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/success.jsp");
                request.setAttribute("rowsaffected", rowsAffected);
                requestDispatcher.forward(request, response);
            }
        }catch(Exception e){
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/error.jsp");
            request.setAttribute("message", e );
            requestDispatcher.forward(request,response);
            e.printStackTrace();
        }


    }

}
