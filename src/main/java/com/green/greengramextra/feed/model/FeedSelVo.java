package com.green.greengramextra.feed.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FeedSelVo {
    private int ifeed;
    private int iuser;
    private String writer;
    private String location;
    private String createdAt;
    private String contents;
    private List<String> pics;
}
