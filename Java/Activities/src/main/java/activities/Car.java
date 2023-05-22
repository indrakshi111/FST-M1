package activities;

public class Car {

   String color;
   String transmission;
    int make;
    int tyres;
    int doors;
    public Car(){
        tyres=4;
        doors=4;
    }
    public void displayCharacteristics(){
        System.out.println("colour of the car"+color);
        System.out.println("transmission of the car"+transmission);
        System.out.println("make of the car"+make);
        System.out.println("tyres of the car"+tyres);
        System.out.println("doors of the car"+doors);
    }
    public void accelarate(){
        System.out.println("Car is moving forward.");

    }
    public void brake(){
        System.out.println("Car has stopped.");

    }
}
