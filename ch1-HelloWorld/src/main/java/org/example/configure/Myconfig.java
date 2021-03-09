package org.example.configure;

import org.example.bean.Pet;
import org.example.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
*1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
*2、配置类本身也是组件
*3、proxyBeanMethods :代理bean 的方法
*
*/

@Configuration(proxyBeanMethods = true)
public class Myconfig {
    @Bean//给容器添加组件，方法名就是id，返回类型就是类型，返回值就是在容器中的实例
    //默认单例
    public User user01(){
        User user = new User("zs", 18);
        user.setPet(tomcat());
        return user;
    }
    @Bean("pet")
    public Pet tomcat(){
        return new Pet("tomcat");
    }

}
