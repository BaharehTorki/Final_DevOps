package org.example;

public class Lamp {
    private boolean lampState;
    private String name;

    public Lamp(String name) {
        this.lampState = false;
        this.name = name;
    }

    public boolean lampState() {
        return lampState;
    }
    public void turnOnLamp(){
        lampState = true;
    }
    public void turnOffLamp(){
        lampState = false;
    }
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return "Lamps[" +
                "lampState=" + lampState + ", " +
                "name=" + name + ']';
    }

}