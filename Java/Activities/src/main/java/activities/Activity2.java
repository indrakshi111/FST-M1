package activities;

public class Activity2 {
    public static void main(String[] args) {
        int sum = 0;
        int expectedvalue = 30;
        int[] numbers = {10, 77, 10, 54, -11, 10};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("the number is" + numbers[i]);
            if (numbers[i] == 10) {
                sum = sum + numbers[i];
                System.out.println("the sum is" + sum);
                if (sum == expectedvalue) {
                    System.out.println("the value matches with 30");
                }
            }


        }
    }

}
