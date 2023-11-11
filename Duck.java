package org.fasttrackit.won14.curs7.homework7animals;

public class Duck implements Animal{
    @Override
    public String walk() {
        return "duck walking";
    }

    @Override
    public String talk() {
        return "duck talking";
    }

    @Override
    public String eat() {
        return "duck eating";
    }
}
