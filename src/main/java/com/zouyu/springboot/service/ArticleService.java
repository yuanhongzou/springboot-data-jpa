package com.zouyu.springboot.service;

import com.zouyu.springboot.bean.Article;
import com.zouyu.springboot.reporsitory.ArticleReporsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ArticleService {

    @Autowired
    private ArticleReporsitory articleReporsitory;

    @Transactional
    public void saveOrUpdate(Article article){
        articleReporsitory.save(article);
    }

    @Transactional
    public void delete(Long id){
        articleReporsitory.deleteById(id);
    }

    public Iterable<Article> findAll(){
        return articleReporsitory.findAll();
    }


//    public Article findByTitle(String title){
//        return articleReporsitory2.findByTitle(title);
//    }
}
