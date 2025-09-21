package io.comeandcommue.post_query_service.domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostQueryRepository {
    List<PostDto> findRecentPosts(RecentPostsQuery query);
    Optional<PostDto> findById(String postId, String userId);
}

