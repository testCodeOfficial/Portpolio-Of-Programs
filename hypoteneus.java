
import java.util.Scanner;

public class hypoteneus{

    public static void main(String []args){

        double triangleOne, triangleTwo, triangleThree;

        Scanner scan = new Scanner(System.in);

        // Size of the Triangle
        System.out.print("Enter size of first corner: ");
        triangleOne = scan.nextDouble();

        System.out.print("Enter size of second corner: ");
        triangleTwo = scan.nextDouble();

        //Calculate using of square root of the first corner and second corner
        triangleThree = Math.sqrt((triangleOne * triangleOne) + (triangleTwo * triangleTwo));

        //Display Result
        System.out.print("Result of hypoteneus is: " + triangleThree);

        //Scan close for stopping scan in another part
        scan.close();
    }
}