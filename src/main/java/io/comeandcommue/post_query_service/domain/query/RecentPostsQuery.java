package io.comeandcommue.post_query_service.domain.query;


import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Setter
@Getter
public class RecentPostsQuery {
    private List<String> communityTypes;
    private Instant createdAtFrom;
    private Instant createdAtTo;
    private int pageSize;
    private String userId;
}
