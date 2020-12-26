package com.example.urlshortner;

import javax.persistence.*;

@Entity
@Table(name = "activity")

public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "act_id")
    private int act_id;
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "url_left")
    private String url_left;
    @Column(name = "url_successfull")
    private String url_successfull;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUrl_left() {
        return url_left;
    }

    public void setUrl_left(String url_left) {
        this.url_left = url_left;
    }

    public String getUrl_successfull() {
        return url_successfull;
    }

    public void setUrl_successfull(String url_successfull) {
        this.url_successfull = url_successfull;
    }

    public int getAct_id() {
        return act_id;
    }

    public void setAct_id(int act_id) {
        this.act_id = act_id;
    }
}
