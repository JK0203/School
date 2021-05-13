package com.example.sn.Entity;

import javax.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String body;
    private Long author;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    private Long parent;
    private boolean isComment;


    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Long getAuthor() {
        return author;
    }

    public void setAuthor(Long author) {
        this.author = author;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public boolean getIsComment() {
        return isComment;
    }

    public void setIsComment(Long id, Long parent) {
        this.isComment = !(id==parent);
    }
}
