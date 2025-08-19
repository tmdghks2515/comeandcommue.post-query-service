package io.comeandcommue.post_query_service.domain;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
public class RecentPostsQuery {
    private List<String> communityTypes;
    private LocalDateTime lastCreatedAt;
    private int pageSize;
    private String userId;
}
