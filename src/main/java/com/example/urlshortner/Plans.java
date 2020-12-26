package com.example.urlshortner;

import javax.persistence.*;

@Entity
@Table(name = "plans")
public class Plans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_id")
    private int plan_id;
    @Column(name = "plan_name")
    private String plan_name;
    @Column(name = "plan_rate")
    private String plan_rate;
    @Column(name = "plan_time")
    private String plan_time;
    @Column(name = "plan_credits")
    private String plan_credits;

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    public String getPlan_rate() {
        return plan_rate;
    }

    public void setPlan_rate(String plan_rate) {
        this.plan_rate = plan_rate;
    }

    public String getPlan_time() {
        return plan_time;
    }

    public void setPlan_time(String plan_time) {
        this.plan_time = plan_time;
    }

    public String getPlan_credits() {
        return plan_credits;
    }

    public void setPlan_credits(String plan_credits) {
        this.plan_credits = plan_credits;
    }
}
