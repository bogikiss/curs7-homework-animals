package org.fasttrackit.won14.curs7.homework7animals;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        Mouse myMouse = new Mouse();
        Chicken myChicken = new Chicken();
        Duck myDuck = new Duck();

        System.out.println(myCat.walk());
        System.out.println(myDog.eat());
        System.out.println(myMouse.eat());
        System.out.println(myChicken.talk());
        System.out.println(myDuck.talk());
    }
}
