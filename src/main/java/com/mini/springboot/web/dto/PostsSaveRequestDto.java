package com.mini.springboot.web.dto;

import com.mini.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String constent;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String constent, String author) {
        this.title = title;
        this.constent = constent;
        this.author = author;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(constent)
                .author(author)
                .build();
    }
}
