package org.example;

public enum LampName {
    WINDOW_LAMP("Window"),
    ROOF_LAMP("Roof"),
    READ_LAMP("Read");


    public final String displayName;

    LampName(String displayName) {
        this.displayName = displayName;
    }

}
