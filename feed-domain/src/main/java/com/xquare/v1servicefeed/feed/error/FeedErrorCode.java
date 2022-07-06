package com.xquare.v1servicefeed.feed.error;

import com.xquare.v1servicefeed.error.ExceptionProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class FeedErrorCode implements ExceptionProperty {

    ;

    private final int status;
    private final String message;
}