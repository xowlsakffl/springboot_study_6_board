package com.fastcampus.projectBoard1.service;

import com.fastcampus.projectBoard1.domain.Article;
import com.fastcampus.projectBoard1.domain.constant.SearchType;
import com.fastcampus.projectBoard1.dto.ArticleDto;
import com.fastcampus.projectBoard1.dto.ArticleUpdateDto;
import com.fastcampus.projectBoard1.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.*;

@DisplayName("게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {
    @InjectMocks
    private ArticleService sut;
    @Mock
    private ArticleRepository articleRepository;

    /*@DisplayName("게시글을 검색하면 리스트를 반환")
    @Test
    void givenSearchParameters_whenGetArticles_thenReturnArticles() {
        Page<ArticleDto> articles = sut.searchArticles(SearchType.TITLE, "search keyword");
        assertThat(articles).isNotNull();
    }

    @DisplayName("게시글을 조회하면 게시글을 반환")
    @Test
    void givenArticleId_whenGetArticle_thenReturnArticle() {
        ArticleDto article = sut.searchArticle(1L);
        assertThat(article).isNotNull();
    }

    @DisplayName("게시글 생성")
    @Test
    void givenArticleInfo_whenInsertArticle_thenSaveArticle() {
        ArticleDto article = ArticleDto.of(LocalDateTime.now(), "ams", "테스트제목", "테스트내용", "#테스트");
        given(articleRepository.save(any(Article.class))).willReturn(null);

        sut.saveArticle(article);

        then(articleRepository).should().save(any(Article.class));// save를 호출했는가
    }

    @DisplayName("게시글 수정")
    @Test
    void givenArticleInfo_whenUpdateArticle_thenSaveArticle() {
        given(articleRepository.save(any(Article.class))).willReturn(null);

        sut.updateArticle(1L, ArticleUpdateDto.of("테스트제목", "테스트내용", "#테스트1"));

        then(articleRepository).should().save(any(Article.class));// save를 호출했는가
    }

    @DisplayName("게시글 삭제")
    @Test
    void givenArticleInfo_whenDelectingArticle_thenDeleteArticle() {
        willDoNothing().given(articleRepository).delete(any(Article.class));

        sut.deleteArticle(1L);

        then(articleRepository).should().delete(any(Article.class));// save를 호출했는가
    }*/
}