package org.example;

public class ManipulateLights {

    public void turnOffRoomLights(House house, Room room){
        if (house.isMainPowerSwitch()){
            room.turnOffLights();
            System.out.println("All lamps in " + room.getName() + " is OFF");
        }else {
            System.out.println("Main switch is OFF");
        }
    }

    public boolean turnOnRoomLights(House house, Room room){
        if (house.isMainPowerSwitch()){
            room.turnOnLights();
            System.out.println("All lamps in " + room.getName() + " is ON");
            return true;
        }else {
            System.out.println("Main switch is OFF");
            return false;
        }
    }

    public boolean turnOnLamp(House house, Room room, Lamp lamp){
        if (house.isMainPowerSwitch()){
            lamp.turnOnLamp();
            System.out.println(lamp.name() + "lamp in " + room.getName() + " is ON");
            return true;
        }else {
            System.out.println("Main switch is OFF");
            return false;
        }
    }

    public boolean turnOffLamp(House house, Room room, Lamp lamp){
        if (house.isMainPowerSwitch()){
            lamp.turnOffLamp();
            System.out.println(lamp.name() + "lamp in " + room.getName() + " is OFF");
            return true;
        }else {
            System.out.println("Main switch is OFF");
            return false;
        }
    }

    public boolean turnOffMainSwitch(House house){
        if (house.isMainPowerSwitch()) {
            house.turnOffPower();
            System.out.println(house.getName() + " powerswitch is OFF");
            return true;
        } else {
            System.out.println(house.getName() + " powerswitch is already OFF");
            return false;
        }
    }

    public boolean turnOnMainSwitch(House house){
        if (!house.isMainPowerSwitch()) {
            house.setMainPowerSwitch(true);
            System.out.println(house.getName() + " powerswitch is ON");
            return true;
        } else {
            System.out.println(house.getName() + " powerswitch is already ON");
            return false;
        }
    }

    public void turnOnLightsBasedOnName(House house,String lampName){
        if(house.isMainPowerSwitch()) {
            for (Room room : house.getRoomList()) {
                for (Lamp lamp : room.getLampsList()) {
                    if (lamp.name().equals(lampName)) {
                        lamp.turnOnLamp();
                        System.out.println(lamp.name() + "lamp in " + room.getName() + " is ON");
                    }
                }
            }
        }else {
            System.out.println("Main switch is OFF");
        }
    }
    public void turnOffLightsBasedOnName(House house,String lampName){
        if(house.isMainPowerSwitch()) {
            for (Room room : house.getRoomList()) {
                for (Lamp lamp : room.getLampsList()) {
                    if (lamp.name().equals(lampName)) {
                        lamp.turnOffLamp();
                        System.out.println(lamp.name() + "lamp in " + room.getName() + " is OFF");
                    }
                }
            }
        }else {
            System.out.println("Main switch is OFF");
        }
    }



}
