package com.mytextra.ArticleSpringBootExample.service.impl;

import com.mytextra.ArticleSpringBootExample.dao.ArticleDao;
import com.mytextra.ArticleSpringBootExample.model.Article;
import com.mytextra.ArticleSpringBootExample.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleDao articleDao;


    @Override
    public boolean createService(Article article) {

      try {
          if (article != null) {

              boolean res = articleDao.insertArticle(article);
              return res;

          }
      }
      catch (Exception e){
          System.out.println(e.getMessage());
      }
        return false;
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
