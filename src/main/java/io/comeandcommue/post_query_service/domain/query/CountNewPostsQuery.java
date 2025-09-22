package io.comeandcommue.post_query_service.domain.query;

import java.time.Instant;
import java.util.List;

public record CountNewPostsQuery(
        List<String> communityTypes,
        Instant createdAtTo
) {
}
