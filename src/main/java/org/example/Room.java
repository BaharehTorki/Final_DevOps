package org.example;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private List<Lamp> lampsList;
    private String name;

    public Room(String name,List<Lamp> lampsList) {
        this.name = name;
        this.lampsList = lampsList;
    }

    public boolean turnOffLights(){
        for (Lamp lamp: lampsList){
            lamp.turnOffLamp();
        }
        return true;
    }
    public void turnOnLights(){
        for (Lamp lamp:lampsList){
            lamp.turnOnLamp();
        }
    }
    public boolean isAllLightsOff(){
        int x = lampsList.size();
        int y = 0;
        for (Lamp lamp: lampsList){
            if (!lamp.lampState()){
                y++;
            }
        }
        if (y == x){
            return true;
        }
        return false;
    }
    public boolean isAllLightsOn(){
        int x = lampsList.size();
        int y = 0;
        for (Lamp lamp: lampsList){
            if (lamp.lampState()){
                y++;
            }
        }
        if (y == x){
            return true;
        }
        return false;
    }

    public List<Lamp> getLampsList() {
        return lampsList;
    }

    public void setLampsList(List<Lamp> lampsList) {
        this.lampsList = lampsList;
    }
    public void addLampToRoom(Lamp lamp){
        List<Lamp> lamps = new ArrayList<>();
        lamps.addAll(lampsList);
        lamps.add(lamp);
        this.lampsList = lamps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Room[" +
                "lampsList=" + lampsList + ", " +
                "name=" + name + ']';
    }


}
