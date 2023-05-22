package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer, String> colours = new HashMap<Integer, String>();//Creating HashMap
        colours.put(1,"Red");
        colours.put(2,"Green");
        colours.put(3,"Pink");
        colours.put(4,"Orange");
        System.out.println(colours);
        colours.remove(2);
        System.out.println(colours);
        if(colours.containsValue("Green")) {
            System.out.println("Green colour exists!!");
        }
            else{
            System.out.println("Green colour does not exist!!");
            }

    }

}
