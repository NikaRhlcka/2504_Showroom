package com.company;

//"car" class defines objects in Java
public class Car {
    public String type;
    public String manufacturer;
    public String name;
    private int id;
//with no access type(public or private) automatically sets public


    //methods
    void getName(){
        System.out.println("Get name in the car class");
    }

    void makeSound(){
    }

    void setId(int id){
        this.id = id;
    }
}
