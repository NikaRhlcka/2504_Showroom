package com.company;

public class Audi extends Car {
    String engineType;

    void getName(){
            System.out.println("Get name in the audi class");
    }

    @Override
    public String toString() {
        return "Audi{" +
                "engineType='" + engineType + '\'' +
                ", type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
