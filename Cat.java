package org.fasttrackit.won14.curs7.homework7animals;

public class Cat implements Animal{
    @Override
    public String walk() {
        return "cat walking";
    }

    @Override
    public String talk() {
        return "cat talking";
    }

    @Override
    public String eat() {
        return "cat eating";
    }
}
