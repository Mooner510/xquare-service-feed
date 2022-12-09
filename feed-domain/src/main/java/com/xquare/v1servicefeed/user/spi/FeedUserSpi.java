package com.xquare.v1servicefeed.user.spi;

import com.xquare.v1servicefeed.annotation.Spi;
import com.xquare.v1servicefeed.user.User;

import java.util.List;
import java.util.UUID;

@Spi
public interface FeedUserSpi {
    List<User> queryUserByIds(List<UUID> ids);
}