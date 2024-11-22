package org.example.arge;

import org.example.company.Car;

public class CarFactory {
    public static void main(String[] args) {
        System.out.println("********Car R&D Company *************");

        CarSkeleton gasPoweredCar=new GasPoweredCar("ford","good car",90,6);
        startEngine(gasPoweredCar);
        drive(gasPoweredCar);


        CarSkeleton electricCar=new ElectricCar("tesla","fast car",23.4,5);
        startEngine(electricCar);
        drive(electricCar);



        CarSkeleton hybridCar=new HybridCar("Tebra","Ex teaksi",78,60,4);
        startEngine(hybridCar);
        drive(hybridCar);
    }
    public static void startEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());
    }
    public  static void drive(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.drive());

    }
}
