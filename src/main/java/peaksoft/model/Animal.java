package peaksoft.model;

import org.springframework.stereotype.Component;

@Component
public class Animal {

    private AnimalsCage animalsCage;
    private Dog dog;

    public Animal() {
    }

    public Animal(AnimalsCage animalsCage, Dog dog) {
        this.animalsCage = animalsCage;
        this.dog = dog;
    }

    public AnimalsCage getAnimalsCage() {
        return animalsCage;
    }

    public void setAnimalsCage(AnimalsCage animalsCage) {
        this.animalsCage = animalsCage;
    }

    public Dog getDog() {
        return dog;
    }


    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalsCage=" + animalsCage +
                ", dog=" + dog +
                '}';
    }
}
