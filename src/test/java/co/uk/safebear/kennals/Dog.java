package co.uk.safebear.kennals;

import java.security.PublicKey;

public class Dog {

    private int age;
    private String breed;
    private boolean gpsTag;


    public void setBreed(String newbreed){
        breed=newbreed;
    }

    public String getbreed(){
        return breed;
    }

    public void bark(){

    System.out.println("bark");
}


}
