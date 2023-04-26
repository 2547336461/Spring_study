package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.awt.print.Book;

public class App {
    public static void main(String[] args) {
        //1.加载类路径下的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从文件系统下加载配置文件
        ApplicationContext ctx2 = new FileSystemXmlApplicationContext("D:\\study\\java\\IdeaProjects\\teacherCode\\Spring_study\\spring_10_container\\src\\main\\resources\\applicationContext.xml");
//        BookDao bookDao = (BookDao) ctx2.getBean("bookDao");
//        BookDao bookDao = ctx2.getBean("bookDao", BookDao.class);
        BookDao bookDao = ctx2.getBean(BookDao.class);
        bookDao.save();
    }
}
