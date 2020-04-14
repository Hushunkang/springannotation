package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;

/**
 * @author hskBeginner Email：2752962035@qq.com
 * @version 1.0
 * @description
 * @create 2020年04月08日
 */
@Configuration//告诉spring，这是一个配置类，就相当于一个spring的xml配置文件
//@ComponentScan//这个注解默认的包，扫描的是当前类所在包及其子包，即此处的@ComponentScan等价于@ComponentScan("com.atguigu.config")
//@ComponentScan("com.atguigu")
//includeFilters属性表示我扫描包加载注解的时候，根据一些规则我只把这些组件加入到spring ioc容器里面，前提需要禁用掉默认的过滤器栈useDefaultFilters = false
@ComponentScan(value = "com.atguigu.controller", includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Repository.class})}, useDefaultFilters = false)
//excludeFilters属性表示我扫描包加载注解的时候，根据一些规则排除哪些组件我不加入到spring ioc容器里面
//@ComponentScan(value = "com.atguigu", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})})
public class MainConfig {

//    @Bean//向spring ioc容器里面注册Bean（注册组件）
    //Bean的类型为方法返回值类型，Bean的名称（Bean的id）为方法名
    @Bean("008")
    public Person person007(){
        return new Person("Lilei",16);
    }

    //说明：不管你的@ComponentScan注解怎么配置，spring ioc容器里面始终有mainConfig和person008这两个bean
    //结论：@ComponentScan这个注解表示只要是标注了@Component、@Controller、@Service、@Repository的Bean都会被注册到spring ioc容器里面，但是它对@Configuration、@Bean不起作用
    //todo 04、组件注册-自定义TypeFilter指定过滤规则

}
