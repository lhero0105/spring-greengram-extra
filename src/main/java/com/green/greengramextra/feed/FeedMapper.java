package com.green.greengramextra.feed;

import com.green.greengramextra.feed.model.FeedSelVo;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface FeedMapper {
    List<FeedSelVo> selFeedAll();
    List<String> selFeedPicsAll(int ifeed);
}
