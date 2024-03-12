package ng.com.nokt.config;

import ng.com.nokt.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Primary
    @Bean(name = "lele")
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Lele");
        return p;
    }

    @Bean(name = "dan")
    Parrot parrotD(){
        var p = new Parrot();
        p.setName("Daniel");
        return p;
    }

    @Bean
    String string(){
        var s = new String();
        s = "Hello";
        return s;
    }
}
