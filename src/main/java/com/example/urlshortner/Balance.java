package com.example.urlshortner;

import javax.persistence.*;

@Entity
@Table(name = "balance")
public class Balance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "balance_id")
    private int balance_id;
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "plan_id")
    private int plan_id;
    @Column(name = "credit_remain")
    private String credit_remain;
    @Column(name = "started_on")
    private String started_on;
    @Column(name = "expire_on")
    private String expire_on;


    public int getBalance_id() {
        return balance_id;
    }

    public void setBalance_id(int balance_id) {
        this.balance_id = balance_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }

    public String getCredit_remain() {
        return credit_remain;
    }

    public void setCredit_remain(String credit_remain) {
        this.credit_remain = credit_remain;
    }

    public String getStarted_on() {
        return started_on;
    }

    public void setStarted_on(String started_on) {
        this.started_on = started_on;
    }

    public String getExpire_on() {
        return expire_on;
    }

    public void setExpire_on(String expire_on) {
        this.expire_on = expire_on;
    }
}
