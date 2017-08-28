package com.dpate168.gifis.model;

import java.time.LocalDate;

public class Gif {
    //Name, Date uploaded, userName, fav

    private String name;
    private LocalDate dateUploaded;
    private String userName;
    private boolean favorite;
    private int categoryId;

    public Gif(String name, LocalDate dateUploaded, String userName, boolean favorite, int categoryId) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.userName = userName;
        this.favorite = favorite;
        this.categoryId = categoryId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
