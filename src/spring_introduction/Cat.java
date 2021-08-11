package spring_introduction;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet {
    Cat(){
        System.out.println("Cat bean is created");
    }
    @Override
    public void say() {
        System.out.println("mew-mew");
    }

    public int destroy(){
        System.out.println("DESTROY METHOD");
        return 1;
    }
}
