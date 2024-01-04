package org.learning.Best.of.the.year;

public class Song {
    private String id;
    private String title;
    private String author;

    public Song(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "-" +  title + " " + author + " " + id;
    }
}
