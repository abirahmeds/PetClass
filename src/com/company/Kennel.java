package com.company;
import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> pets;
    public Kennel(ArrayList<Pet> pets){
        this.pets = pets;
    }
    public String allSpeak(){
        String out = "";
        for(int i = 0; i < pets.size(); i++){
            out += pets.get(i).getName() + ":" + pets.get(i).speak() + "\n";
        }
        return out;
    }
}
