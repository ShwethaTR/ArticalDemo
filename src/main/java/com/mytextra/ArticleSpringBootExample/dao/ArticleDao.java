package com.mytextra.ArticleSpringBootExample.dao;
import com.mytextra.ArticleSpringBootExample.model.Article;

public interface ArticleDao {

    public boolean insertArticle(Article article);
    public Article getArticle(int articleId);
    public  boolean updateArticle(Article article);
    public boolean deleteArticle(int articleId);
}
