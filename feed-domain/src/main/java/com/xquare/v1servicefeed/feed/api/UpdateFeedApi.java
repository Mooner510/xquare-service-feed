package com.xquare.v1servicefeed.feed.api;

import com.xquare.v1servicefeed.annotation.Api;
import com.xquare.v1servicefeed.feed.api.dto.request.DomainUpdateFeedRequest;

import java.util.UUID;

@Api
public interface UpdateFeedApi {
    void execute(UUID feedId, DomainUpdateFeedRequest request);
}
