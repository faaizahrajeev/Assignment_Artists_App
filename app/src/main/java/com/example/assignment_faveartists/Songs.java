package com.example.assignment_faveartists;

public class Songs {
    private String song, singer, imgUrl;

    // constructor
    public Songs(String song, String singer, String imgUrl) {
        this.song = song;
        this.singer = singer;
        this.imgUrl = imgUrl;
    }

    // getters and setters
    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    // tostring
    @Override
    public String toString() {
        return "Songs{" +
                "song='" + song + '\'' +
                ", singer='" + singer + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
