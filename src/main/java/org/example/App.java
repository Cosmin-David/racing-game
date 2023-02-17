package org.example;

public class  App
{
    public static void main( String[] args )
    {
     Car carRefference = new Car();
     carRefference.name = "Ferrari";
     carRefference.maxSpeed = 300;
     carRefference.fuelLevel = 60;
     carRefference.mileage = 12.5;
     carRefference.totalTravelDistance = 0;
     carRefference.damaged = true;
     carRefference.doorCount = 1;
     carRefference.color = "Red";

     Engine engine1 = new Engine();
     engine1.manufacturer = "Ferrari";
     engine1.capacity = 3000;

     carRefference.engine = engine1;

        System.out.println("Engine1 capacity: " + engine1.capacity);
        System.out.println("Car engine capacity: " + carRefference.engine.capacity);

        engine1.capacity = 4000;
        System.out.println("Car engine capacity after update: " + carRefference.engine.capacity);



        // concatenation
        System.out.println("Properties of car: " + carRefference.name);
        System.out.println("Max speed: " + carRefference.maxSpeed);
        System.out.println("Fuel level: " + carRefference.fuelLevel);
        System.out.println("Milleage: " + carRefference.mileage);
        System.out.println("Total Traveled Distance: " + carRefference.totalTravelDistance);
        System.out.println("Damaged: " + carRefference.damaged);
        System.out.println("Door Count: " + carRefference.doorCount);
        System.out.println("Colour: " + carRefference.color);
        System.out.println("carRefference");

        Car car2 = new Car();
        car2.name = "Renault";
        car2.fuelLevel = 70;
        car2.totalTravelDistance = 100;

        car2.engine = new Engine();
        car2.engine.capacity = 2000;

        System.out.println("Properties of car " + car2.name);
        System.out.println("Max speed: " + car2.maxSpeed);
        System.out.println("Fuel level: " + car2.fuelLevel);
        System.out.println("Milleage: " + car2.mileage);
        System.out.println("Total Traveled Distance: " + car2.totalTravelDistance);
        System.out.println("Damaged: " + car2.damaged);
        System.out.println("Door Count: " + car2.doorCount);
        System.out.println("Color: " + car2.color);


        System.out.println("Initial name for car1: " + carRefference.name);

        carRefference.name = "Audi";
        System.out.println("Initial name for car1: " + carRefference.name);

        carRefference = new Car();
        System.out.println("Name of new car: " + carRefference.name);
        carRefference.name = "BMW";

        carRefference = car2;
        System.out.println("Name of car refferenced from 2 variable. CarRefference: " + carRefference.name);
        System.out.println("Name of car refferenced from 2 variable. Car2:  " + car2.name);

        car2.name = "Dacia";
        System.out.println("Updated name of car refferenced from 2 variable. CarRefference: " + carRefference.name);
        System.out.println("Updated name of car refferenced from 2 variable. Car2:  " + car2.name);


    }
}
