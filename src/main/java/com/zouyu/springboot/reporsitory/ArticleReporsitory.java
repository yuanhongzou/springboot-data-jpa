package com.zouyu.springboot.reporsitory;

import com.zouyu.springboot.bean.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleReporsitory extends CrudRepository<Article, Long> {
}
