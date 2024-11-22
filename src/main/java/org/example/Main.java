package org.example;
import org.example.company.Car;
import org.example.company.Mitsubishi;
import org.example.company.Holden;
import org.example.company.Ford;
import org.example.arge.CarSkeleton;
import org.example.arge.HybridCar;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;

import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println("********** Car **************");
        Car car = new Car(8, "Base car");
        printResult(car);

        //bununu yerine pirintResult(Car);
//        System.out.println(car.startEngine());
//        System.out.println(car.getClass().getSimpleName());//sınıf ismini basar
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());

        System.out.println("************ Mitsubishi *****************");

        Car  mitsubishi= new Mitsubishi(6,"Outlander VRX 4WD");
        printResult(mitsubishi);
//        System.out.println(mitsubishi.startEngine());
//        System.out.println(mitsubishi.accelerate());
//        System.out.println(mitsubishi.brake());

        System.out.println("********** Ford ***************");
        Car ford = new Ford(6,"Ford Falcon");
        printResult(ford);
//        System.out.println(ford.startEngine());
//        System.out.println(ford.accelerate());
//        System.out.println(ford.brake());

        System.out.println("********* Holden **************");
        Car holden= new Holden(6,"Holden Commodore");
        printResult(holden);
     }

    public static void  printResult(Car car){
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

    }



}