package com.green.greengramextra.feed;

import com.green.greengramextra.feed.FeedMapper;
import com.green.greengramextra.feed.model.FeedSelVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class FeedService {
    private final FeedMapper mapper;
    public List<FeedSelVo> getFeedAllV1(){
        List<FeedSelVo> list = mapper.selFeedAll();
        for (FeedSelVo item : list ) {
            List<String> pics = mapper.selFeedPicsAll(item.getIfeed());
            item.setPics(pics);
        }
        return list;
    }
}
