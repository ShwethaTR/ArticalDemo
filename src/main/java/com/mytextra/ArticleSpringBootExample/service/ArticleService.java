package com.mytextra.ArticleSpringBootExample.service;

import com.mytextra.ArticleSpringBootExample.model.Article;

public interface ArticleService {

    public boolean createService(Article article);
    public Article getArticle(int articleId);
    public  boolean updateArticle(Article article);
    public boolean deleteArticle(int articleId);
}
