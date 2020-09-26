package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.HelloWorld;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

//        HelloWorld hw = new HelloWorld("Witaj w domu!");
        HelloWorld hw = context.getBean("helloWorld", HelloWorld.class);
        System.out.println(hw.getMessage());

        context.close();
    }
}
