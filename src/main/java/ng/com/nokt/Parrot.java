package ng.com.nokt;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {
    private String name = "Parry";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
