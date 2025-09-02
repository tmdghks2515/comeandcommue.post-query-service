package io.comeandcommue.post_query_service.domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostQueryRepository {
    List<PostDto> findRecentPosts(RecentPostsQuery query);
}

