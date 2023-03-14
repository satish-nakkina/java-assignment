package javaAssignments.assignment8;



public class ExceptionThrower {
    public static void throwAllExceptions(int value) throws NegativeValueException, MaxValueException {
        if (value < 0) {
            throw new NegativeValueException("Value should be positive");
        }  else if (value > 10) {
            throw new MaxValueException("Value should be less than 10");
        } else if (value == 3) {
            int[] arr = new int[5];
            int index = 10;
            int element = arr[index];
        } else if (value == 4) {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
        }
    }
}
