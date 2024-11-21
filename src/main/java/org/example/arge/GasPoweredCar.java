package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;
    public GasPoweredCar(String name, String description, double avgKmPerLitre,int cylinders){
        super(name,description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.cylinders=cylinders;
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " gas-powered car's engine is starting";
    }
    @Override
    public int drive(){
        System.out.println(getClass().getSimpleName()+"gas-powered car's engine is driving");
        runEngine();
        return 0;
    }


    //getter ve setter metodları
    public double getAverageKmPerLiter(){
        return avgKmPerLitre;
    }
    public int getCylinders(){
        return cylinders;
    }
    public void setAvgKmPerLitre(double avgKmLitre){
        this.avgKmPerLitre=avgKmPerLitre;
    }
    public void setCylinders(int cylinders){
        this.cylinders=cylinders;
    }


    }
