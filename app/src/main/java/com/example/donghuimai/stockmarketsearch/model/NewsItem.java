package com.example.donghuimai.stockmarketsearch.model;

/**
 * Created by donghuimai on 11/18/17.
 */

public class NewsItem {
    private String title;
    private String author;
    private String date;
    private String link;

    public NewsItem(String title, String author, String date, String link) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getLink() { return link; }
}
