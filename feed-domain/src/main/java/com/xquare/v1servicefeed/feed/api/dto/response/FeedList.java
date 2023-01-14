package com.xquare.v1servicefeed.feed.api.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
public class FeedList {
    private final UUID feedId;
    private final UUID userId;
    private final String content;
    private final LocalDateTime createdAt;
    private final Integer likeCount;
    private final Integer commentCount;
}