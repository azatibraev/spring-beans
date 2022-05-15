package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private Animal animal;
    private Timer timer = new Timer();


    public AnimalsCage() {
    }

    @Autowired
    public AnimalsCage(@Qualifier(value = "cat")Animal animal, Timer timer) {
        this.timer = timer;
       this.animal =animal;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return this.timer;
    }
}
