package com.zouyu.springboot.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 创建了一个实体类。
 * 使用@Entity进行实体类的持久化操作，当JPA检测到我们的实体类当中有
 *
 * @author yuanhong
 * @Entity 注解的时候，会在数据库中生成对应的表结构信息。
 * @date 2018年8月17日
 */
@Entity
public class Article {
    private Integer id;

    private String title;

    private String contents;

    /**
     * 使用@Id指定主键.
     * <p>
     * 使用代码@GeneratedValue(strategy=GenerationType.IDENTITY)
     * 指定主键的生成策略，mysql默认的是自增长。
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
