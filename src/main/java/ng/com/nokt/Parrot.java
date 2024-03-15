package ng.com.nokt;

import org.springframework.beans.factory.annotation.Autowired;
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

    private final SoundInterface soundInterface;

    @Autowired
    public Parrot(SoundInterface soundInterface) {
        this.soundInterface = soundInterface;
    }

    String makeSound(){
        return soundInterface.makesSound();
    }

}
