package org.fasttrackit.won14.curs7.homework7animals;

public class Mouse implements Animal{
    @Override
    public String walk() {
        return "mouse walking";
    }

    @Override
    public String talk() {
        return "mouse talking";
    }

    @Override
    public String eat() {
        return "mouse eating";
    }
}
