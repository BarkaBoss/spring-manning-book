package ng.com.nokt;

import org.springframework.stereotype.Component;

@Component
public class ParrotSound implements SoundInterface{
    @Override
    public String makesSound() {
        return "Herrooo quark";
    }
}
