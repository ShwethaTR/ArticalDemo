package com.mytextra.ArticleSpringBootExample.dao.impl;

import com.mytextra.ArticleSpringBootExample.dao.ArticleDao;
import com.mytextra.ArticleSpringBootExample.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AtricleDaoImpl implements ArticleDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public boolean insertArticle(Article article) {

        String sql= "insert into Article "+"(articleId,articleName,articleType,articleDescription) VALUES(?,?,?,?)";

        return jdbcTemplate.update(sql,new Object[]{article.getArticleId(),article.getArticleName(),
                article.getArticleType(),article.getArticleDescription()}) > 0;
    }


    @Override
    public Article getArticle(int articleId) {
        return null;
    }

    @Override
    public boolean updateArticle(Article article) {
        return false;
    }

    @Override
    public boolean deleteArticle(int articleId) {
        return false;
    }
}
