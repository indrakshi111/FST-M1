package activities;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {

        Plane plane=new Plane(10);

        plane.onboard("Ritu");
        plane.onboard("Ram");
        plane.onboard("John");
        plane.onboard("Henry");
        plane.onboard("Larry");
        plane.onboard("Haris");
        plane.onboard("Mohan");
        plane.onboard("Manas");
        plane.onboard("Rima");
        plane.onboard("Raj");
        System.out.println("Take off time is"+plane.takeOff());
        System.out.println("Passenger List"+plane.getPassengers());
        Thread.sleep(5000);
        //landed
        plane.land();
        //landing time
        System.out.println("plane landed at"+plane.getLastTimeLanded());
    }
    }

