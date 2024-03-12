package ng.com.nokt.config;

import ng.com.nokt.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Lele");
        return p;
    }

    @Bean
    String string(){
        var s = new String();
        s = "Hello";
        return s;
    }
}
