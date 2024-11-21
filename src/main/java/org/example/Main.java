package org.example;
import org.example.company.Car;
import org.example.company.Mitsubishi;
import org.example.company.Holden;
import org.example.company.Ford;
import org.example.arge.CarSkeleton;
import org.example.arge.HybridCar;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;




public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println("********** Car **************");
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.getClass().getSimpleName());//sınıf ismini basar
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println("************ Mitsubishi *****************");

        Car  mitsubishi= new Mitsubishi(6,"Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println("********** Ford ***************");
        Car ford = new Ford(6,"Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        System.out.println("********* Holden **************");
        Car holden= new Holden(6,"Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println("********Car R&D Company *************");
        CarSkeleton gasPoweredCar=new GasPoweredCar("ford","good car",90,6);
        CarSkeleton electricCar=new ElectricCar("tesla","fast car",23.4,5);
        CarSkeleton hybridCar=new HybridCar("Tebra","Ex teaksi",78,60,4);

        System.out.println(gasPoweredCar.getDescription());
        System.out.println(gasPoweredCar.startEngine());
        System.out.println(gasPoweredCar.drive());


        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());


        System.out.println(hybridCar.startEngine());
        System.out.println(hybridCar.drive());











    }



}