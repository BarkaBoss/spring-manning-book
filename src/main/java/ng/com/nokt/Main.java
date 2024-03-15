package ng.com.nokt;

import ng.com.nokt.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Parrot p = context.getBean(Parrot.class);
//        //System.out.println(p);
//        p.setName("Parry");
//        Supplier<Parrot> parrotSupplier = ()-> p;
//
//        context.registerBean("parrot", Parrot.class, parrotSupplier);
//        System.out.println(p.getName());

        Person p = context.getBean(Person.class);

        System.out.println(p.getName());
        System.out.println(p.getParrot().getName());
        System.out.println(p.getParrot().makeSound());
    }
}