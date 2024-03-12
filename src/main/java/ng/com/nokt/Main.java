package ng.com.nokt;

import ng.com.nokt.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p);
        p.setName("Parry");//#033761
        System.out.println(p.getName());

    }
}