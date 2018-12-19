package com.company;
import java.util.ArrayList;

public class Kennel {
    public Kennel (cat, dog, loudDog)
    {

          private ArrayList<Pet> petList = new ArrayList<Pet>();

          public void allSpeak () {
          for (Pet p : petList) {
             System.out.println(p.getName() + " says: " + p.speak());
         }
      }

           public void addPet (Pet p){
           petList.add(p);
      }

           public ArrayList<Pet> getPets () {
           return this.petList;
        }
    }
}