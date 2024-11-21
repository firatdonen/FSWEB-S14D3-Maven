package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge,int batterySize){
       super(name,description);
        this.avgKmPerCharge=avgKmPerCharge;
        this.batterySize=batterySize;

    }
    @Override
    public String startEngine(){
        return getClass().getSimpleName()+" Electric car's engine is starting.";

    }
    @Override
    public int drive() {
        System.out.println(getClass().getSimpleName() + "Electric car's engine is driving.");
        runEngine();
    return 0;
    }
    //getter ve setter metodları
    public  double getAvgKmPerCharge(){
        return avgKmPerCharge;
    }
    public int getBatterySize(){
        return batterySize;
    }
    public void setAvgKmPerCharge(double avgKmPerCharge){
        this.avgKmPerCharge=avgKmPerCharge;
    }
    public void setBatterySize(int batterySize){
        this.batterySize=batterySize;
    }
}
