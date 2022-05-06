package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Showroom {
    /**
     * represents property of showroom
     **/

    //ArrayList: alternative to array
    //makes it easier to work with arrays.
    //do not need to specify amount of items
    //all cars will be saved here:
    private ArrayList<Car> cars = new ArrayList<Car>();
    Scanner scanner = new Scanner(System.in);



    /**
     * What I want this class to do
     **/
    //Add cars to the showroom
    //View all cars in the showroom
    //view a single car in the showroom
    //remove car

    //method that belongs to "showroom" class
    //adding a car to the showroom
    public void addCar() {
        //declare and initialize a new car
        Car car = new Car();


        //set the properties of the car
        System.out.println("Please enter the car name:");
        car.name = scanner.nextLine();

        System.out.println("Please input car manufacturer: ");
        car.manufacturer = scanner.nextLine();

        System.out.println("Please input car type: ");
        car.type = scanner.nextLine();

        System.out.println("Please input car id: ");
        car.setid(scanner.nextInt());

        //arraylist.add is used to add items to the arraylist
        this.cars.add(car);
        System.out.println(car.name + "Added Successfully");
    }

        void viewAllCars() {
            System.out.println("All Available cars: \n");

            for (Car car: cars) {
                System.out.println("name: " + car.name + "type: " + car.type);
            }
        }

        void viewSingleCar(){
        //ArrayList.get: used ti get the item by the index

        //try catch: helps handle exceptions(errors)in code
       try{
           System.out.println("Please input the index of the car you want to view");
           int carIndex = scanner.nextInt();
           Car car = this.cars.get(carIndex);
           System.out.println("Name: " + car.name + "Type: " + car.type);


       }catch(Exception ex){
           System.out.println("Unable to find a car, please try again");
       }
        }

        void removeCar(){
        try{
            System.out.println("Please input the index if the car to remove");
            int carIndex = scanner.nextInt();
            cars.remove(carIndex);
            System.out.println("Removed successfully!");
        }catch(Exception ex){
            System.out.println("Unable to remove specified car");
        }


        }

}
