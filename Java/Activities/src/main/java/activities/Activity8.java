package activities;

public class Activity8 {
    public static void main(String[] args)  {

        try {
            exceptionTest("Print value");
            exceptionTest(null);
        } catch (CustomException e) {
            System.out.println("Inside catch"+e.getMessage());
        }

    }

    public static void exceptionTest(String val) throws CustomException {

        if (val == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(val);
        }


    }
}
