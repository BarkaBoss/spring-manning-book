package ng.com.nokt.config;

import ng.com.nokt.services.LoggingAspect;
import ng.com.nokt.services.SecurityAspect;
import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "ng.com.nokt.services")
public class ProjectConfig {

    @Bean
    public LoggingAspect loggingAspect(){
        return new LoggingAspect();
    }

    @Bean
    public SecurityAspect securityAspect(){
        return new SecurityAspect();
    }
}
