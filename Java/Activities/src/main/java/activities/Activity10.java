package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args)  {
        HashSet<String>hs=new HashSet<>();
        hs.add("A");
        hs.add("V");
        hs.add("N");
        hs.add("P");
        hs.add("O");
        hs.add("K");
        System.out.println("The Size of the Hashset"+hs.size());
        hs.remove("V");
        if(hs.remove("S")){
            System.out.println("S removed");
        }else{
            System.out.println("S not present");
        }
        System.out.println("checking if A is present"+hs.contains("A"));
        System.out.println("The final set"+hs);
    }
}
