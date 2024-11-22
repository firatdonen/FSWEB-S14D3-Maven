package org.example.arge;

public class HybridCar extends CarSkeleton {
   private double avgKmPerLitre;
   private int batterySize;
   private int cylinders;
    public HybridCar(String name,String description, double avgKmPerLitre, int batterySize, int cylinders){
       super(name,description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.batterySize=batterySize;
        this.cylinders=cylinders;
    }


    @Override
    public String startEngine(){
        return getClass().getSimpleName()+"Hybrid car's engine is starting.";

    }
    @Override
    public String drive(){
        runEngine(this);
        return"Hybrid car's engine is starting";

           }

    //getter setter metodları
    public double getAvgKmPerLiter() { return avgKmPerLitre; }
    public int getBatterySize() { return batterySize; }

    public int getCylinders() {
        return cylinders;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
