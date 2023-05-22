package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args)  {
        ArrayList<String>myList=new ArrayList<>();
        myList.add("Raj");
        myList.add("Amit");
        myList.add("Riya");
        myList.add("Sush");
        myList.add("Manny");
        for(String names:myList) {
            System.out.println("Printing the names" + names);
        }
        System.out.println("Printing the 3rd name"+myList.get(2));
        if(myList.contains("Amit")){
            System.out.println("The name exists");
        }else{
            System.out.println("The name does not exists");
        }
        System.out.println("Number of names in the array"+myList.size());
        myList.remove("Manny");
        System.out.println("Number of names in the array"+myList.size());
    }
}
