package io.comeandcommue.post_query_service.trigger;

import io.comeandcommue.post_query_service.application.QueryPostUseCase;
import io.comeandcommue.post_query_service.common.loginUser.LoginUser;
import io.comeandcommue.post_query_service.common.loginUser.UserPrincipal;
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
    public ResponseEntity<List<PostDto>> getRecentPosts(RecentPostsQuery query, @LoginUser UserPrincipal user) {
        query.setUserId(user.id());
        return ResponseEntity.ok(queryPostUseCase.getRecentPosts(query));
    }
}
