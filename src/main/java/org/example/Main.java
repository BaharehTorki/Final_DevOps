package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lamp windowLivingroom = new Lamp(LampName.WINDOW_LAMP.displayName);
        Lamp roofLivingroom = new Lamp(LampName.ROOF_LAMP.displayName);

        Lamp roofBedroom = new Lamp(LampName.ROOF_LAMP.displayName);
        Lamp windowBedroom = new Lamp(LampName.WINDOW_LAMP.displayName);
        Lamp readLiving = new Lamp(LampName.READ_LAMP.displayName);

        Room bedroom = new Room("Bedroom",List.of(windowBedroom, roofBedroom));
        Room livingroom = new Room("Livingroom", List.of(roofLivingroom, windowLivingroom));
        livingroom.addLampToRoom(readLiving);

        House myHouse = new House("Rikemansvägen 2",List.of(bedroom,livingroom));


        ManipulateLights  manipulateLights = new ManipulateLights();
//        manipulateLights.turnOffMainSwitch(myHouse);
        manipulateLights.turnOnLightsBasedOnName(myHouse, LampName.WINDOW_LAMP.displayName);
        manipulateLights.turnOnRoomLights(myHouse, bedroom);

    }
}