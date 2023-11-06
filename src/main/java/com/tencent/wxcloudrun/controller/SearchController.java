package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.Score;
import com.tencent.wxcloudrun.service.SearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * search控制器
 */
@RestController

public class SearchController {

    final SearchService searchService;
    final Logger logger;

    public SearchController(@Autowired SearchService searchService) {
        this.searchService = searchService;
        this.logger = LoggerFactory.getLogger(SearchController.class);
    }


    /**
     * 获取当前计数
     *
     * @return API response json
     */
    @PostMapping(value = "/api/score/search")
    ApiResponse post(@RequestBody Score score) {
        logger.info("/api/score/search post request");
        Optional<Score> result = searchService.getScore(score);
        return result.map(ApiResponse::ok).orElseGet(() -> ApiResponse.ok(result));
    }

}