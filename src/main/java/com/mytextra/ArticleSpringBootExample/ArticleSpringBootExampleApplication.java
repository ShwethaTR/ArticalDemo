package com.mytextra.ArticleSpringBootExample;

import com.mytextra.ArticleSpringBootExample.model.Article;
import com.mytextra.ArticleSpringBootExample.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ArticleSpringBootExampleApplication {

	@Autowired
	ArticleService articleService;

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ArticleSpringBootExampleApplication.class, args);
		ArticleService articleService= context.getBean(ArticleService.class);

		Article article = new Article();
		article.setArticleId(1);
		article.setArticleName("kpop");
		article.setArticleType("music");
		article.setArticleDescription("this is the best music");

		Article article1 = new Article();
		article.setArticleId(2);
		article.setArticleName("Modi");
		article.setArticleType("politics");
		article.setArticleDescription("modi is the best");

		Article article2 = new Article();
		article2.setArticleId(3);
		article2.setArticleName("Revolution");
		article2.setArticleType("general");
		article2.setArticleDescription("to change the youth");

		List<Article> articleList = new ArrayList<>();
		articleList.add(article);
		articleList.add(article1);
		articleList.add(article2);


		boolean flag =articleService.createService(article);
		System.out.println("Artical inserted successfully");
	}




}

