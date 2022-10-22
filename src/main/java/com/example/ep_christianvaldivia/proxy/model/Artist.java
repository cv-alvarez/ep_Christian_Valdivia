package com.example.ep_christianvaldivia.proxy.model;

public class Artist {
    private String username;
    private String name;
    private String  age;

    private String genre;

    public Artist(String username,String name, String age, String genre) {
        this.username = username;
        this.name = name;
        this.age = age;
        this.genre = genre;
    }
    public Artist(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public String getGender() {
        return genre;
    }

    public void setGender(String genre) {
        this.genre = genre;
    }
}
