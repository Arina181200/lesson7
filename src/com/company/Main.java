package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Shop> list = new ArrayList<Shop>();
        Shop car1 = new Shop(1, "Toyota", 12000000, 5000, 2500, 2500);
        Shop car2 = new Shop(2, "BMW", 14000000, 4000, 2400, 2400);
        Shop car3 = new Shop(3, "Jaguar", 15000000, 3000, 2500, 2700);
        Shop car = new Car(4, "Audi", 170000000, 3000, 2900, 2100);
        try {
            car.addCar(car1);
            car.addCar(car2);
            car.addCar(car3);
            car.showAllCars();
        } catch (TooBigCarException e) {
            System.out.println("Too big car");
        }
        try
        {
            car.countOfCar(car1);
            car.countOfCar(car2);
            car.countOfCar(car3);
            car.showAllCars();
        }catch (OutOfFreeCarException e)
        {
            System.out.println("Too many car");
        }

    }
    }

