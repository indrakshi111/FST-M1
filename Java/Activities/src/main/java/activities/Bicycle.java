package activities;

public class Bicycle implements BicycleOperations,BicycleParts{
    public int gears;
    public int currentSpeed;
    public Bicycle(int gears,int currentSpeed){
        this.gears=gears;
        this.currentSpeed=currentSpeed;

    }
    String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);

    }

    @Override
    public void applyBrake(int decrease) {
        currentSpeed=currentSpeed-decrease;
        System.out.println("The current speed after applyng brake is"+currentSpeed);

    }

    @Override
    public void speedUp(int increase) {
        currentSpeed=currentSpeed+increase;
        System.out.println("The current speed after speed up is"+currentSpeed);
    }
}
