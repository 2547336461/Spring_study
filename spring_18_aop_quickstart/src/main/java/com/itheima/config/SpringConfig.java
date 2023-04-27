package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.itheima")
// 告诉spring程序中有用注解开发的AOP
@EnableAspectJAutoProxy
public class SpringConfig {
}
