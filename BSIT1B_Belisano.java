//Belisano, Benedick Guile V.
//BSIT-1B
//Error Handler is executed
import java.util.*;

public class BSIT1B_Belisano{
    public static void main(String[] args) {
        
        //Declare variable and user input
        Scanner scan = new Scanner(System.in);
        String space_input;

        System.out.print("\t\t<PRIME NUMBER>\n");
        
        System.out.println("\nCreator: This is user input within specified range prime numbers.\nInteger only is allowed to input at the blank spaces.\n");

        //While the condition is true is give infinite loop
        while(true){
            //Try the user input without getting error.
            try{

                System.out.print("\nEnter Lower Range: ");
                space_input = scan.nextLine();
                int userLowerRange = Integer.parseInt(space_input);
                
                System.out.print("\nEnter Higher Range: ");
                space_input = scan.nextLine();
                int userHighRange = Integer.parseInt(space_input);

                System.out.print("\nDisplay Prime Numbers: ");
                range_of_prime(userLowerRange, userHighRange);
                
                System.out.println("\n\n<Welcome to Prime Numbers>");
            }

            //This error handler for declaring not integer
            catch(Exception e){
                System.out.println("The Letter/Decimal/Symbol is not allowed. Please input the valid order");
                scan.nextLine();
            }
        }
    }
    //Display All Prime Integers
    public static void range_of_prime(Integer userLowerRange, Integer userHighRange){
        for(int i = userLowerRange; i <= userHighRange; i++){
            if(primeResult(i)){
                System.out.print(i + " ");
            }
        }
    }

    //Implementing a method outside of our main
    public static boolean primeResult(int userPrime){
        //Also if prime number is start in the negative number
        //return false
        if(userPrime <= 1){
            return false;
        }

        //2 and 3. I put this because it could conflict for finding prime number which is 2 and 3 is prime 
        //Tricky statement
        if(userPrime == 2 || userPrime == 3){
            return true;
        }

        //Display the user input inside of this loop
        for(int i = 2; i*i <= userPrime; i++){
            //This formula calculated userPrime can divisible by 2,3,5 and is equal to 0
            //return false
            if(userPrime % i == 0){
                return false;
            }
        }

        //if can't divisible by 2 or 3 and can multiply by itself
        //return true
        return true;
    }
    
}