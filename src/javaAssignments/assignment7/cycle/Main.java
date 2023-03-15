package javaAssignments.assignment7.cycle;

//Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
// Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
// Create instances of all three types and upcast them to an array of Cycle. Try to call balance( )
// on each element of the array and observe the results.
// Downcast and call balance( ) and observe what happens
public class Main {
    public static  void main(String[] args){

        Cycle[] cycles=new Cycle[5];

        cycles[0]=new Unicycle();
        cycles[1]=new Bicycle();
        cycles[2]=new Tricycle();

        // Upcast
//        for (Cycle cycle : cycles) {
//            cycle.balance(); // Compile-time error
//        }
        //Downcast
        for (Cycle cycle : cycles) {
            if (cycle instanceof Unicycle) {
                ((Unicycle) cycle).balance();
            } else if (cycle instanceof Bicycle) {
                ((Bicycle) cycle).balance();
            }
        }
    }
}
