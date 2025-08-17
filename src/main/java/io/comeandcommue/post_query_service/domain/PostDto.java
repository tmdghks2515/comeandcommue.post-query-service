package io.comeandcommue.post_query_service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder(builderMethodName = "of")
@AllArgsConstructor
public class PostDto {
    private String id;
    private String postNo;
    private String title;
    private String categoryName;
    private String linkHref;
    private String thumbnailSrc;
    private String authorName;
    private int likeCount;
    private int hitCount;
    private String communityType;
//    private String communityTypeLabel;
    private LocalDateTime postedAt;
    private LocalDateTime createdAt;
}
