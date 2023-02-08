package com.xquare.v1servicefeed.feed;

import com.xquare.v1servicefeed.user.role.UserAuthority;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.xquare.v1servicefeed.user.role.UserAuthority.*;

@RequiredArgsConstructor
@Getter
public enum CategoryEnum {
    NOTICE("NOTICE", List.of(STD, STC, STA, DOD, DOS), "공지사항"),
    CLUB("CLUB", List.of(CLL), "동아리"),
    BAMBOO("BAMBOO", List.of(STD, STC, STA, DOD, DOS, CLL, OST), "대나무숲");

    private final String name;

    private final List<UserAuthority> authorities;

    private final String koreaName;
}
