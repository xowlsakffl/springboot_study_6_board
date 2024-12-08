package com.fastcampus.projectBoard1.dto;

import com.fastcampus.projectBoard1.domain.Article;
import com.fastcampus.projectBoard1.domain.QUserAccount;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.fastcampus.projectBoard1.domain.Article}
 */
public record ArticleDto(LocalDateTime createdAt, String createdBy, String title, String content,
                         String hashtag){
    public static ArticleDto of(LocalDateTime createdAt, String createdBy, String title, String content, String hashtag) {
        return new ArticleDto(createdAt, createdBy, title, content, hashtag);
    }

    public static ArticleDto from(Article entity){
        return new ArticleDto(
                entity.getId(),
                UserAccountDto.from(entity.getUserAccount()),
                entity.getTitle(),
                entity.getContent(),
                entity.getHashtag(),
                entity.getCreatedAt(),
                entity.getCreatedBy(),
                entity.getModifiedAt(),
                entity.getModifiedBy()
        );
    }

    public Article toEntity(){
        return Article.of(
                UserAccountDto.toEntity(),
                title,
                content,
                hashtag
        );
    }
}