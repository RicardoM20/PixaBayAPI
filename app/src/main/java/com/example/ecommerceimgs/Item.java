package com.example.ecommerceimgs;

public class Item {

    private String imageUrl;
    private String user;
    private int likes;

    public Item(String imageUrl, String user, int likes){
        this.imageUrl = imageUrl;
        this.likes = likes;
        this.user = user;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getLikes() {
        return likes;
    }
    public String getUser(){
        return user;
    }
}
