package com.xquare.v1servicefeed.configuration.security;

import com.xquare.v1servicefeed.configuration.annotation.Adapter;
import com.xquare.v1servicefeed.configuration.spi.SecuritySpi;
import com.xquare.v1servicefeed.feed.CategoryEnum;
import com.xquare.v1servicefeed.user.role.UserAuthority;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Adapter
public class SecurityAdapter implements SecuritySpi {

    @Override
    public UUID getCurrentUserId() {
        return UUID.fromString(SecurityContextHolder.getContext().getAuthentication().getName());
    }

    @Override
    public boolean isValidateUserAuthority(String categoryName) {
        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        CategoryEnum category = CategoryEnum.valueOf(categoryName);

        List<UserAuthority> userAuthorities = authorities
                .stream()
                .map(authority -> UserAuthority.valueOf(authority.getAuthority()))
                .toList();

        for (UserAuthority authority : category.getAuthorities()) {
            if (userAuthorities.contains(authority)) {
                return true;
            }
        }

        return false;
    }
}
