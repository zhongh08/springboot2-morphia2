package com.syoki.model;

import org.mongodb.morphia.annotations.Entity;

import java.util.Date;

@Entity(value = "t_user_score_statistics", noClassnameStored = true)
public class UserScoreStatistics extends BaseInfo {

    private String userId;
    private Date month;
    private Integer scoreTotal;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public Integer getScoreTotal() {
        return scoreTotal;
    }

    public void setScoreTotal(Integer scoreTotal) {
        this.scoreTotal = scoreTotal;
    }
}
