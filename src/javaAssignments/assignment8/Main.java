package javaAssignments.assignment8;



public class Main {
    public static void main(String[] args) {

        try {
            ExceptionThrower.throwAllExceptions(15);

        } catch (NegativeValueException | MaxValueException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
