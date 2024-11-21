package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private  int cylinders;
    private String name;
    private int wheels;
    public Car(int cylinders,String name){
        this.engine=true;
        this.cylinders=cylinders;
        this.name=name;
        this.wheels=4;
    }

    public String getName(){
        return name;
    }
    public int getCylinders(){
        return cylinders;
    }
    @Override
    public String toString(){
        return "Car{"+
                "Cylinders"+cylinders+
                ", name"+ name+
                "}";
    }


 @Override
  public boolean equals(Object o){
    if(this==o) return true;// iki nesne aynı ise
        if(o==null||getClass()!=o.getClass()) return false; // o nesnesi null veya farklı bir sınıfa aitse
        Car car =(Car) o; // o nesnesi Car türünüe dönüştürülür
        return wheels == car.wheels
                && Objects.equals(name,car.name);
           }



public String startEngine(){
    printSimpleName();
    return "the car's engine is starting";
}

    private void printSimpleName() {
        System.out.println(getClass().getSimpleName());
    }

    public String accelerate(){
        printSimpleName();
        return "the car is accelerating";
}

public String brake(){
    printSimpleName();
    return "the car is braking";
    }

}
