package org.example.animals;


class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Paws {
    public void numberPaws() {
        System.out.println("The animal has paws");
    }
}

class Cow extends Animal {
    public void animalSound() {
        System.out.println("The cow says: muu muu");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        Animal myCow = new Cow();

        Paws myPaws = new Paws();

        myPaws.numberPaws();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        myCow.animalSound();
    }
}
