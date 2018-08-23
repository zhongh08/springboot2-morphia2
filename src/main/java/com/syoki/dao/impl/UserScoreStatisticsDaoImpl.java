package com.syoki.dao.impl;

import com.syoki.dao.IUserScoreStatisticsDao;
import com.syoki.model.UserScoreStatistics;
import org.mongodb.morphia.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserScoreStatisticsDaoImpl extends BaseDAOImpl<UserScoreStatistics> implements IUserScoreStatisticsDao {

    @Override
    public List<UserScoreStatistics> search(Integer score) {
        Query<UserScoreStatistics> query = dsForRW.createQuery(UserScoreStatistics.class);
        query.filter("scoreTotal", score);
        //query.field("dataId").in(id);
        //query.filter("type", type);
        return query.asList();
    }
}
