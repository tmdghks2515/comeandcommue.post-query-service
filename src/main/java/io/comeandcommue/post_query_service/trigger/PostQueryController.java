package io.comeandcommue.post_query_service.trigger;

import io.comeandcommue.lib.web.loginUser.LoginUser;
import io.comeandcommue.lib.web.loginUser.ResolvedLoginUser;
import io.comeandcommue.post_query_service.application.QueryPostUseCase;
import io.comeandcommue.post_query_service.domain.PostDto;
import io.comeandcommue.post_query_service.domain.RecentPostsQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/post/query")
public class PostQueryController {
    private final QueryPostUseCase queryPostUseCase;

    @GetMapping("/recent")
    public ResponseEntity<List<PostDto>> getRecentPosts(RecentPostsQuery query, @ResolvedLoginUser LoginUser loginUser) {
        query.setUserId(loginUser.id());
        return ResponseEntity.ok(queryPostUseCase.getRecentPosts(query));
    }
}
