package com.ll.sb231127.domain.article.article.service;

import com.ll.sb231127.domain.article.article.entity.Article;
import com.ll.sb231127.global.rsData.RsData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class ArticleServiceTest {
    @Autowired
    private ArticleService articleService;

    @DisplayName("글쓰기")
    @Test
    void t1() {
        RsData<Article> wirteRs = articleService.write(1l,"t", "b");
        Article article = wirteRs.getData();

        assertThat(article.getId()).isGreaterThan(0L);
    }
}