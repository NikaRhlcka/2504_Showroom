package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Showroom myShowroom = new Showroom();
        myShowroom.addCar();
        myShowroom.viewAlCars();*/

        System.out.println("Welcome to the car showroom");
        Showroom myShowroom = new Showroom();
        Scanner scanner = new Scanner(System.in);

        String userInput = "";

        do {
            System.out.println("Please choose an activity(write 'quit' to exit): ");
            System.out.println("""
                    1. Add car
                    2. View all cars
                    3. View single car
                    4. Remove car
                    """);

            userInput = scanner.nextLine();
            switch(userInput){
                case "quit":
                    System.out.println("Exiting Application!");
                    break;
                case "1":
                   myShowroom.addCar();
                    break;
                case "2":
                    myShowroom.viewAllCars();
                    break;
                case "3":
                    myShowroom.viewSingleCar();
                    break;
                case "4":
                    myShowroom.removeCar();

            }
        } while (!userInput.equalsIgnoreCase("quit"));

        Audi audi = new Audi();
      /*  audi.name = "Audi Name";
        audi.engineType = "Audi";*/
        audi.getName();

        System.out.println(audi);

    }
}
