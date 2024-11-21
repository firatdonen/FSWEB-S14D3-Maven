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

    public int drive(){
        System.out.println(getClass().getSimpleName()+"the car is braking.");
        runEngine();
        return 0;
    }
    protected String runEngine(){
        return "the car is accelerating.";

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

