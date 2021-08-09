package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");

        Pet dog = context.getBean("myDog",Pet.class);

        dog.say();
        context.close();
    }
}
