package io.comeandcommue.post_query_service.domain;

import io.comeandcommue.post_query_service.domain.dto.PostDto;
import io.comeandcommue.post_query_service.domain.query.CountNewPostsQuery;
import io.comeandcommue.post_query_service.domain.query.RecentPostsQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostQueryRepository {
    List<PostDto> findRecentPosts(RecentPostsQuery query);
    Optional<PostDto> findById(String postId, String userId);
    int countNewPosts(CountNewPostsQuery query);
}

