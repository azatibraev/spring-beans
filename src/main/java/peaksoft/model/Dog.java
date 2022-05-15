package peaksoft.model;

import org.springframework.stereotype.Component;

/**
 * @author AzatIbraev
 * @Date 14.05.2022
 */
@Component
public class Dog extends Animal {


    @Override
    public String toString() {
        return "I'm a dog";
    }
}
