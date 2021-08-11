package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say(){
        System.out.println("bow-wow");
    }

    @PostConstruct
    public void init(){
        System.out.println("INIT METHOD");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("DESTROY METOD");
    }
    public Dog(){
        System.out.println("Dog bean is created");
    }
}
