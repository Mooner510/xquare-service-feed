package com.xquare.v1servicefeed.domain.feed.domain;

import com.xquare.v1servicefeed.configuration.entity.BaseUUIDEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "tbl_feed")
@Entity
public class FeedEntity extends BaseUUIDEntity {
}
