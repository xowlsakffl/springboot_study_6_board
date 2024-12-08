package com.fastcampus.projectBoard1.service;

import com.fastcampus.projectBoard1.domain.Article;
import com.fastcampus.projectBoard1.dto.ArticleCommentDto;
import com.fastcampus.projectBoard1.repository.ArticleCommentRepository;
import com.fastcampus.projectBoard1.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleCommentService {
    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    public List<ArticleCommentDto> searchArticleComment(long articleId) {
        return List.of();
    }

    public ArticleCommentDto saveArticleComment(ArticleCommentDto articleCommentDto) {
        return null;
    }
}
