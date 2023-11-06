package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.Score;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ScoreMapper {

  Score getScore(Score score);
}
