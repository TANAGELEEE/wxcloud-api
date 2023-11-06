package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.Score;

import java.util.Optional;

public interface SearchService {

  Optional<Score> getScore(Score score);
}
