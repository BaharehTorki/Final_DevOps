package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LightTest {
    ManipulateLights ml = new ManipulateLights();
    static Lamp windowBedroom;
    static House myHouse;

    @BeforeEach
    public void setUp(){
         windowBedroom = new Lamp(LampName.WINDOW_LAMP.displayName);
         myHouse = new House("Rikemansvägen 2",List.of());
    }

    @Test
    void mainSwitchOffTest(){
        myHouse.setMainPowerSwitch(false);
        assertFalse(myHouse.isMainPowerSwitch());
    }

    @Test
    void mainSwitchOnTest(){
        assertTrue(myHouse.isMainPowerSwitch());
    }

    @Test
    void turnOnLampTest(){
        windowBedroom.turnOnLamp();
        assertTrue(windowBedroom.lampState());
    }

    @Test
    void turnOffLampTest(){
        windowBedroom.turnOffLamp();
        assertFalse(windowBedroom.lampState());
    }
}
