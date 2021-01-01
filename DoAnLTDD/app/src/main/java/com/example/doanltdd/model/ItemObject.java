package com.example.doanltdd.model;

public class ItemObject {

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String content;
    private String title;

    public ItemObject(String content, String title) {
        this.content = content;
        this.title = title;
    }
}
