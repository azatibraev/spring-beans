package peaksoft.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    private AnimalsCage animalsCage;

    private Long nanoTime = System.nanoTime();

    public Timer() {
    }

    public Timer(AnimalsCage animalsCage1) {
        animalsCage = animalsCage1;
    }

    public Timer(Long nanoTime) {
        this.nanoTime = nanoTime;
    }

    public Long getTime() {
        return nanoTime;
    }
}
