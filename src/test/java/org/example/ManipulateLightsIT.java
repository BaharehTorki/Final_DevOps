package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManipulateLightsIT {
    ManipulateLights ml = new ManipulateLights();
    static Lamp windowLivingRoom;
    static Lamp roofLivingRoom;
    static Lamp roofBedroom;
    static Lamp windowBedroom;
    static Lamp readLiving;
    static Room bedroom;
    static Room livingRoom;
    static House myHouse;

    @BeforeEach
    public void setUp(){
        windowLivingRoom = new Lamp(LampName.WINDOW_LAMP.displayName);
        roofLivingRoom = new Lamp(LampName.ROOF_LAMP.displayName);
        roofBedroom = new Lamp(LampName.ROOF_LAMP.displayName);
        windowBedroom = new Lamp(LampName.WINDOW_LAMP.displayName);
        readLiving = new Lamp(LampName.READ_LAMP.displayName);
        bedroom = new Room("Bedroom", List.of(windowBedroom, roofBedroom));
        livingRoom = new Room("Livingroom", List.of(roofLivingRoom, windowLivingRoom,readLiving));
        myHouse = new House("Rikemansvägen 2",List.of(bedroom,livingRoom));
    }

    @Test
    void turnOffRoomLightsTestIT() {
        ml.turnOffRoomLights(myHouse,livingRoom);
        assertTrue(livingRoom.isAllLightsOff());
    }

    @Test
    void turnOnRoomLightsIT() {
        ml.turnOnRoomLights(myHouse, livingRoom);
        assertTrue(livingRoom.isAllLightsOn());
    }

    @Test
    void turnOnLampIT() {
        ml.turnOnLamp(myHouse,bedroom,roofBedroom);
        assertTrue(roofBedroom.lampState());
    }

    @Test
    void turnOffLampIT() {
        ml.turnOffLamp(myHouse,bedroom,roofBedroom);
        assertFalse(roofBedroom.lampState());
    }

    @Test
    void turnOffMainSwitchIT() {
        ml.turnOffMainSwitch(myHouse);
        assertTrue(myHouse.isAllLightsOff());
    }

    @Test
    void turnOnMainSwitchIT() {
        ml.turnOnMainSwitch(myHouse);
        assertTrue(myHouse.isMainPowerSwitch());
    }

    @Test
    void turnOnLightsBasedOnNameIT() {
        ml.turnOnLightsBasedOnName(myHouse,LampName.ROOF_LAMP.displayName);
        assertTrue(roofLivingRoom.lampState());
        assertTrue(roofBedroom.lampState());
    }

    @Test
    void turnOffLightsBasedOnNameIT() {
        ml.turnOffLightsBasedOnName(myHouse,LampName.WINDOW_LAMP.displayName);
        assertFalse(windowBedroom.lampState());
        assertFalse(windowLivingRoom.lampState());
    }

    @Test
    void addRoomToHouseIT(){
        myHouse.addRoomToHouse(new Room("Toilet", List.of()));
        assertEquals(3,myHouse.getRoomList().size());
    }

    @Test
    void addLampToRoomIT(){
        bedroom.addLampToRoom(new Lamp(LampName.READ_LAMP.displayName));
        assertEquals(3,bedroom.getLampsList().size());
    }
}