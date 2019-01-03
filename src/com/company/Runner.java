package com.company;

import java.util.ArrayList;

public class Runner {
   public static void main(String[] args) {
       Cat cat = new Cat("Cat");
       Dog dog = new Dog("Dog");
       LoudDog loudDog = new LoudDog("Loud Dog");
       ArrayList<Pet> pets = new ArrayList<>();
       pets.add(cat);
       pets.add(dog);
       pets.add(loudDog);
       System.out.println(cat.speak()); // → "meow"
       System.out.println(dog.speak()); // → "woof"
       System.out.println(loudDog.speak()); // → "WOOF"
       System.out.println(new Kennel(pets).allSpeak());
   }
}
