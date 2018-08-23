package com.syoki.service.impl;

import com.syoki.dao.IUserScoreStatisticsDao;
import com.syoki.model.UserScoreStatistics;
import com.syoki.service.UserScoreStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userScoreStatisticsService")
public class UserScoreStatisticsServiceImpl implements UserScoreStatisticsService {

    @Autowired
    private IUserScoreStatisticsDao scoreStatisticsDao;

    @Override
    public List<UserScoreStatistics> search(Integer score) {
        return scoreStatisticsDao.search(score);
    }
}
