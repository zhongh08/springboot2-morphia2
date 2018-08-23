package com.syoki.service;

import com.syoki.model.PageVO;
import com.syoki.model.UserScoreStatistics;

import java.util.List;

public interface UserScoreStatisticsService {

    List<UserScoreStatistics> search(Integer score);

    PageVO<UserScoreStatistics> searchByPage(Integer pageIndex, Integer pageSize);

}
