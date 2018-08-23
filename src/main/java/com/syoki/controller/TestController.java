package com.syoki.controller;

import com.syoki.service.UserScoreStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserScoreStatisticsService userScoreStatisticsService;

    @RequestMapping("/list")
    public Object list() {
        return userScoreStatisticsService.search(900);
    }

}
