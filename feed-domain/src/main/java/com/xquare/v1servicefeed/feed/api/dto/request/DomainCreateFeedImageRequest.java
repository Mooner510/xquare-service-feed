package com.xquare.v1servicefeed.feed.api.dto.request;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
@Builder
public class DomainCreateFeedImageRequest {
    private UUID feedId;

    private List<String> attachments_url;
}
