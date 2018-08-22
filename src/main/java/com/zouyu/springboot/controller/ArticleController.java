package com.zouyu.springboot.controller;

import com.zouyu.springboot.bean.Article;
import com.zouyu.springboot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/save")
    public String save(){
        Article article = new Article();
        article.setTitle("SPRING BOOT DATA JPA 2");
        article.setContents("SPRING BOOT DATA JPA IS SO EASY 2");
        articleService.saveOrUpdate(article);
        return "Article2 save ok.";
    }

    @RequestMapping("/delete")
    public String delete(){
        articleService.delete(1l);
        return "Article delete ok";
    }

    @RequestMapping("/getAll")
    public Iterable<Article> getAll(){
        return articleService.findAll();
    }

    @RequestMapping("/getbytitle")
    public Article getbytitle(String title){
        throw new RuntimeException("x");
    }

}
