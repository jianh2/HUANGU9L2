import java.util.*;
public class Animal {
    private String name;
    private int age;

    private double height;

     private boolean vaccinated;

     public Animal(String name, int age, boolean vaccinated, double height){
         this.name  = name;
         this.age = age;
         this.vaccinated = vaccinated;

     }

    public String getName(){
        return name;
    }

    public int getAge(){
         return age;
    }

    public boolean getVaccinated(){
         return vaccinated;
    }

    public double getHeight(){
         return height;
    }

    public void adopt(){
        System.out.println("You have adopted " + name);
    }

    public void feed(){
        System.out.println("You have fed " + name);

    }

    public void swim(){
         System.out.println("You are swimming");
    }





}
