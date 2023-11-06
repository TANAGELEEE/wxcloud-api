/**
 * Copyright ©2021-2025 tanagelee Corporation, All Rights Reserved
 */
package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.ScoreMapper;
import com.tencent.wxcloudrun.model.Score;
import com.tencent.wxcloudrun.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * SearchServiceImpl
 *
 * @author liyunjun
 * @date 2023/11/6 21:14
 */
@Service
public class SearchServiceImpl implements SearchService {

    final ScoreMapper scoreMapper;

    public SearchServiceImpl(@Autowired ScoreMapper scoreMapper) {
        this.scoreMapper = scoreMapper;
    }

    @Override
    public Optional<Score> getScore(Score score) {
        return Optional.ofNullable(scoreMapper.getScore(score));
    }
}