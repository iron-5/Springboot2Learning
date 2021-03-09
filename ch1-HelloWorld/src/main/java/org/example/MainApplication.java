package org.example;

import org.example.bean.Pet;
import org.example.bean.User;
import org.example.configure.Myconfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
* @SpringBootApplication 表明这是一个springboot应用
*
* */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        //1.返回IOC容器
/*
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //2.查看IOC容器里的组件
        String[] names = run.getBeanDefinitionNames();
//        for (String name: names
//             ) {
//            System.out.println(name);
//        }
        //3.从容器中获取组件

        Pet pet = (Pet)run.getBean("pet");
        Pet pet1 = (Pet)run.getBean("pet");
        System.out.println(pet == pet1);
        //配置类也是容器中的一个组件
        Myconfig bean = (Myconfig)run.getBean(Myconfig.class);
        //是调用配置类的方法呢还是从容器中拿？从容器中拿
        //默认值@Configuration(proxyBeanMethods = true)代理对象调用方法，springboot总会检查容器中有无该对象
        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println(user == user1);
        //用户的宠物是不是容器中的宠物?是的
        System.out.println(user.getPet() == pet);
*/

    }
}
