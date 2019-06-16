package com.example.zerone.moviehelper;

public class Theatre {
    private String name;
    private String address;
    private final int imageResource;
    Theatre(String name,String address,int imageResource){
        this.name = name;
        this.address = address;
        this.imageResource = imageResource;
    }

    public String getName(){return name;}
    public String getAddress(){return address;}

    public int getImageResource() {
        return imageResource;
    }
}
