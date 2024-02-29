import java.util.Scanner;
import java.util.Random;
import java.util.random.*;

public class MapProgram {
    static Random shuffle = new Random();
    static Scanner find = new Scanner(System.in);
    static String anotherLocation;
    static String empty = "";
    static String places[] = { "SCHOOL", "JOLLIBEE", "HOSPITAL", "MCDO", "SM" };
    static String thecurrentLocation = places[shuffle.nextInt(places.length)];
    static boolean op = true;

    public static void main(String[] args) {
        
        designMap mapDesign = new designMap();
        MapFunctionality mapFunction = new MapFunctionality();

        int distance1 = shuffle.nextInt(10, 100);
        int distance2 = shuffle.nextInt(10, 100);
        int distance3 = shuffle.nextInt(10, 100);
        int distance4 = shuffle.nextInt(10, 100);
        int distance5 = shuffle.nextInt(10, 100);
        int distance6 = shuffle.nextInt(10, 100);

        do{

        mapDesign.generateMap(thecurrentLocation, places, distance1, distance2, distance3, distance4,distance5, distance6);

        // DISPLAY DETAILS SHOWN IN MAP
        System.out.print("*****************************************************************************************************************************************************");
        System.out.print("\n\t\t\t\t\t\t\t\tPLACES IN MAP \n");
        for (int i = 0; i < places.length; i++) {
            System.out.print("\t\t\t\t\t\t\t\t" + " " + ">" + " " + places[i] + "\n");
        }
        System.out.print("\n*****************************************************************************************************************************************************");

        System.out.println();

        // DISPLAY CURRENT LOCATION OF THE USER[Randomize]
        // The story was idea of mr. Byron Boral
        // Dexter Valencia
        // edited by: Nicole Stanton 

            randomLocation();
            System.out.print("");
            
            System.out.print("\nChoose location you would like to visit: ");
            String menu = find.nextLine().trim();

            if( menu.equalsIgnoreCase(thecurrentLocation)){
                System.out.println("\nYou are already in this location.\n");
                System.out.println("\nDo you want to go back there?\n[Y] Yes, I want to back.\n[N] nevermind.\n");
                anotherLocation = find.nextLine();
                    
                    if (anotherLocation.equalsIgnoreCase(("Y").trim()) || anotherLocation.equalsIgnoreCase(("y").trim())) {
                    continue;  
                    }else{
                        System.exit(0);
                    }
                continue;
            }

            boolean checkLocation = false;
            for(int i=0; i < places.length; i++){
                if(menu.equalsIgnoreCase(places[i])){
                    checkLocation = true;
                    continue;
                }
            }

            if(!checkLocation){
                System.out.printf("\nThis location is not in the map & this input [ %s ] is invalid.", menu);
                System.out.println("\n");
                continue;
            }



            // Display Possible Route Function
            mapFunction.userDestination(menu, thecurrentLocation, places, distance1, distance2, distance3, distance4, distance5, distance6);

            thecurrentLocation = menu.toUpperCase();
            // Option
            System.out.println("\nDo you want to go there?\n[Y] Yes, I want to go there.\n[N] nevermind.\n");
                    anotherLocation = find.nextLine();
                        
                        if (anotherLocation.equalsIgnoreCase(("Y").trim()) || anotherLocation.equalsIgnoreCase(("y").trim())) {
                        continue;   
                    }else{
                        op = false;
                        System.out.println("I hope you enjoy your strolling outside the city.");
                        break;
                    }
        } while (op);

    }

    public static void randomLocation(){

        if (thecurrentLocation.equalsIgnoreCase((places[4]).trim())) {
            System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------");
            String smStory = "\n\t\t\t\tYou and your friends have just finished shopping at the mall. Where do you want to go to next? \n".toUpperCase();
            System.out.println
            (smStory);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");  
            System.out.println("\nYour current location: " + places[4]);
            System.out.println("\nJOLLIBEE" + "\nHOSPITAL" + "\nMCDO" + "\nSCHOOL");
            
        }

        else{

        
        if (thecurrentLocation.equalsIgnoreCase((places[1]).trim())) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            String jollibeeStory = "\n\tYou and your family went to Jollibee to eat but your youngest sibling does not want to go home yet. Where do you want to go to next?\n".toUpperCase();
            System.out.println
            (jollibeeStory);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\nYour current location: " + places[1]);
                System.out.println("\nHOSPITAL" + "\nSCHOOL" + "\nSM" + "\nMCDO");
        }

        if (thecurrentLocation.equalsIgnoreCase((places[2]).trim())) {
            System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------");
            String hospitalStory = "\n\t\t\tYou visited your sister at the hospital but visiting hours have ended. Where do you want to go to next?\n".toUpperCase();
            System.out.println
            (hospitalStory);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\nYour current location: " + places[2]);
                System.out.println("\nSCHOOL" + "\nSM" + "\nMCDO" + "\nJOLLIBEE");
            
        }

        if (thecurrentLocation.equalsIgnoreCase((places[3]).trim())) {
            System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------");
            String mcdoStory = "\n\t\t\tYou and your friends eat at McDonald's and decided to go elsewhere. Where do you want to go next?\n".toUpperCase();
            System.out.println
            (mcdoStory);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\nYour current location: " + places[3]);
                System.out.println("\nSM" + "\nJOLLIBEE" + "\nHOSPITAL" + "\nSCHOOL");
  
            }

        if (thecurrentLocation.equalsIgnoreCase((places[0]).trim())) {
            System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------");
            String schoolStory = "\n\t\t\tClass has just ended and you and your friends wants to go somewhere else. Where do want to go to next?\n" .toUpperCase();    
            System.out.println
                (schoolStory); 
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\nYour current location: " + places[0]);
                System.out.println("\nMCDO" + "\nSM" + "\nHOSPITAL" + "\nJOLLIBEE");
            
            }
        }
    }
}

    