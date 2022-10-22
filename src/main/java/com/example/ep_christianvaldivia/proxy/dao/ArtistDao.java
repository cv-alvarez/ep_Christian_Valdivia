package com.example.ep_christianvaldivia.proxy.dao;

import com.example.ep_christianvaldivia.proxy.dao.mysql.MySQLConnection;
import com.example.ep_christianvaldivia.proxy.model.Artist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ArtistDao {
    public int addArtist(Artist artist) throws Exception{

        MySQLConnection mySQLConnection = new MySQLConnection();
        Connection con = mySQLConnection.getConnection();
        int rowsAffected =0;

        String queryInsert = "INSERT INTO artist(username,name,age,genre)" +  "VALUES (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(queryInsert);
        ps.setString(1, artist.getUsername());
        ps.setString(2, artist.getName());
        ps.setString(3, artist.getAge());
        ps.setString(4, artist.getGender());


        rowsAffected = ps.executeUpdate();
        return rowsAffected;
    }
    public List<Artist> getArtist() throws Exception{

        MySQLConnection mySQLConnection = new MySQLConnection();
        Connection con = mySQLConnection.getConnection();

        String querySelect = "select * from artist";
        Statement st = con.createStatement();
        ResultSet resultSet = st.executeQuery(querySelect);
        List<Artist> listArtist = new ArrayList<>();

        while(resultSet.next()){
            Artist artist = new Artist();
            artist.setUsername(resultSet.getString("username"));
            artist.setName(resultSet.getString("name"));
            artist.setAge(resultSet.getString("age"));
            artist.setGender(resultSet.getString("genre"));

            listArtist.add(artist);
        }
        return listArtist;
    }

}

