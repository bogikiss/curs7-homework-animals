package org.fasttrackit.won14.curs7.homework7animals;

public class Chicken implements Animal{
    @Override
    public String walk() {
        return "chicken walking";
    }

    @Override
    public String talk() {
        return "chicken talking";
    }

    @Override
    public String eat() {
        return "chicken eating";
    }
}
