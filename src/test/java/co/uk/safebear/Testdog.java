package co.uk.safebear;

import co.uk.safebear.kennals.Dog;
import org.junit.Test;

public class Testdog {

    @Test
    public void testDog() {

        Dog allsation = new Dog();
        Dog scruffy = new Dog();
        Dog scooby = new Dog();

        scruffy.setBreed("pitbull");
        scooby.setBreed("alsation");

        scruffy.setBreed("pitbull");

        System.out.println("scruffy breed is " + scruffy.getbreed());
        scooby.bark();




    }


}
