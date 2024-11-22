package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){}
    public CarSkeleton(String name,String description){
        this.name=name;
        this.description=description;
    }
    public String startEngine(){
       return "the car's engine is starting";

    }

    public String drive(){
        runEngine(this);
        return "the car is braking.";

    }
    public void runEngine(CarSkeleton carSkeleton) {
        if (carSkeleton instanceof HybridCar) {
           HybridCar hybridCar= ((HybridCar)carSkeleton);
            System.out.println("the car engine is starting with hybridcar"+hybridCar.getAvgKmPerLiter()+"battery size"+hybridCar.getBatterySize());

        } else if (carSkeleton instanceof ElectricCar) {
            ElectricCar electricCar=((ElectricCar)carSkeleton);
            System.out.println("the car engine is starting with hybridcar"+electricCar.getAvgKmPerCharge()+"battery size"+electricCar.getBatterySize());

        } else if (carSkeleton instanceof GasPoweredCar) {
            GasPoweredCar gasPoweredCar=((GasPoweredCar)carSkeleton);
            System.out.println("the car engine is starting with gasPowerCar"+gasPoweredCar.getAverageKmPerLiter() );
        }
    }
   public String brake(){
        return getClass().getSimpleName()+"the car is braking";
   }

   //getter ve setter metodları

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDescription(String description){
        this.description= description;
    }

    }

