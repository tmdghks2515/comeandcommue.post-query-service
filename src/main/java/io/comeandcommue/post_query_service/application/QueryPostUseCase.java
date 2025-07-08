package io.comeandcommue.post_query_service.application;

import io.comeandcommue.post_query_service.domain.PostDto;
import io.comeandcommue.post_query_service.domain.PostQueryRepository;
import io.comeandcommue.post_query_service.domain.RecentPostsQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class QueryPostUseCase {
    private final PostQueryRepository postQueryRepository;

    public List<PostDto> getRecentPosts(RecentPostsQuery query) {
        return postQueryRepository.findRecentPosts(query);
    }
}
