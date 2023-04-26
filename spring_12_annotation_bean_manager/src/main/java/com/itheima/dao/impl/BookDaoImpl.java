package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
@Scope("prototype") // 设置为生成对象非单例
public class BookDaoImpl implements BookDao{

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    // 构造方法后
    @PostConstruct
    public void init() {
        System.out.println("init13 ...");
    }
    // 程序销毁前
    @PreDestroy
    public void destroy() {
        System.out.println("destroy ...");
    }
}