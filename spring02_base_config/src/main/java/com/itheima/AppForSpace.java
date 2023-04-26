package com.itheima;

import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForSpace {
    public static void main(String[] args) {
        // 获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4.获取bean
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
        // 将bean的scope属性设置为prototype后创建出来的两个对象不同
        BookService bookService1 = (BookService) ctx.getBean("service");
        BookService bookService2 = (BookService) ctx.getBean("service");
        System.out.println(bookService1);
        System.out.println(bookService2);
    }
}
