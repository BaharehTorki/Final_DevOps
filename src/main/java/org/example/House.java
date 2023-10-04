package org.example;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Room> roomList;
    private boolean mainPowerSwitch;
    private String name;

    public House(String name, List<Room> roomList) {
        this.mainPowerSwitch = true;
        this.name = name;
        this.roomList = roomList;
    }

    public void turnOffPower(){
        mainPowerSwitch = false;
        for (Room room: roomList){
            room.turnOffLights();
        }
    }
    public List<Room> getRoomList() {
        return roomList;
    }
    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
    public boolean isMainPowerSwitch() {
        return mainPowerSwitch;
    }
    public void setMainPowerSwitch(boolean mainPowerSwitch) {
        this.mainPowerSwitch = mainPowerSwitch;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addRoomToHouse(Room room){
        List<Room> rooms = new ArrayList<>();
        rooms.addAll(roomList);
        rooms.add(room);
        this.roomList = rooms;
    }
    public boolean isAllLightsOff(){
        int x = roomList.size();
        int y = 0;
        for (Room room: roomList){
            if (room.isAllLightsOff()){
                y++;
            }
        }
        return x == y;
    }
    @Override
    public String toString() {
        return "House[" +
                "roomList=" + roomList + ", " +
                "mainPowerSwitch=" + mainPowerSwitch + ", " +
                "name=" + name + ']';
    }

}
