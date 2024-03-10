import java.util.Scanner;
import java.util.Random;

public class MapProgram {
    static Random shuffle = new Random();
    static Scanner find = new Scanner(System.in);
    static String anotherLocation;
    static String places[] = { "SCHOOL", "JOLLIBEE", "HOSPITAL", "MCDO", "SM", "APARTMENT"};
    static String thecurrentLocation = places[shuffle.nextInt(places.length)];
    static boolean op = true;


    private static void cls(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws InterruptedException{
        
        int distance1 = shuffle.nextInt(10, 100);
        int distance2 = shuffle.nextInt(10, 100);
        int distance3 = shuffle.nextInt(10, 100);
        int distance4 = shuffle.nextInt(10, 100);
        int distance5 = shuffle.nextInt(10, 100);
        int distance6 = shuffle.nextInt(10, 100);
        int distance7 = shuffle.nextInt(10, 100);
        int distance8 = shuffle.nextInt(10, 100);

        //TITLE
        String sim = """
            █████████  ███████████ ███████████      ███████    █████       █████          ██████   ██████   █████████   ███████████ 
            ███░░░░░███░█░░░███░░░█░░███░░░░░███   ███░░░░░███ ░░███       ░░███          ░░██████ ██████   ███░░░░░███ ░░███░░░░░███
           ░███    ░░░ ░   ░███  ░  ░███    ░███  ███     ░░███ ░███        ░███           ░███░█████░███  ░███    ░███  ░███    ░███
           ░░█████████     ░███     ░██████████  ░███      ░███ ░███        ░███           ░███░░███ ░███  ░███████████  ░██████████ 
            ░░░░░░░░███    ░███     ░███░░░░░███ ░███      ░███ ░███        ░███           ░███ ░░░  ░███  ░███░░░░░███  ░███░░░░░░  
            ███    ░███    ░███     ░███    ░███ ░░███     ███  ░███      █ ░███      █    ░███      ░███  ░███    ░███  ░███        
           ░░█████████     █████    █████   █████ ░░░███████░   ███████████ ███████████    █████     █████ █████   █████ █████       
            ░░░░░░░░░     ░░░░░    ░░░░░   ░░░░░    ░░░░░░░    ░░░░░░░░░░░ ░░░░░░░░░░░    ░░░░░     ░░░░░ ░░░░░   ░░░░░ ░░░░░        
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
                                                                                        
             ██╗ ██████╗   ██╗██╗   ██████╗ ██╗                                         
            ██╔╝██╔═══██╗ ██╔╝╚██╗ ██╔═══██╗╚██╗                                        
            ██║ ██║   ██║██╔╝  ╚██╗██║   ██║ ██║                                        
            ██║ ██║   ██║╚██╗  ██╔╝██║   ██║ ██║                                        
            ╚██╗╚██████╔╝ ╚██╗██╔╝ ╚██████╔╝██╔╝                                        
             ╚═╝ ╚═════╝   ╚═╝╚═╝   ╚═════╝ ╚═╝ 
             
             \nGROUP\n
             > BENEDICK BELISANO
             > JB BAROTAG
             > NICOLE STANTON
             > BYRON BORAL
             > DEXTER VALENCIA
                """;

        Thread artThread = new Thread(() -> {
            try {
                for (int i = 0; i < sim.length(); i++) {
                    System.out.print(sim.charAt(i));
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
            }
        });

        artThread.start();
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        scanner.nextLine();
        artThread.interrupt();
        Thread.sleep(100);
        
        cls();

        

        designMap mapDesign = new designMap();

        MapFunctionality mapFunction = new MapFunctionality();
        

        do{
        System.out.println("\n" + sim);
        mapDesign.generateMap(thecurrentLocation, places, distance1, distance2, distance3, distance4,distance5, distance6, distance7, distance8);

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
            find.nextLine();


            // Display Possible Route Function
            mapFunction.userDestination(menu, thecurrentLocation, places, distance1, distance2, distance3, distance4, distance5, distance6, distance7, distance8);


            if( menu.equalsIgnoreCase(thecurrentLocation)){
                System.out.println("\nYou are already in this location.\n");
                System.out.print("\nDo you want to stay here?\n[Y] Yes, I want to stay.\n[N] No, I want to leave.\nChoice: ");
                anotherLocation = find.nextLine();
                    
                    if (anotherLocation.equalsIgnoreCase(("Y").trim()) || anotherLocation.equalsIgnoreCase(("y").trim())) {
                    continue;  
                    }else{
                        String art = """
                            ████████╗    ██╗  ██╗     █████╗     ███╗   ██╗    ██╗  ██╗    ██╗   ██╗     ██████╗     ██╗   ██╗    ██╗
                            ╚══██╔══╝    ██║  ██║    ██╔══██╗    ████╗  ██║    ██║ ██╔╝    ╚██╗ ██╔╝    ██╔═══██╗    ██║   ██║    ██║
                               ██║       ███████║    ███████║    ██╔██╗ ██║    █████╔╝      ╚████╔╝     ██║   ██║    ██║   ██║    ██║
                               ██║       ██╔══██║    ██╔══██║    ██║╚██╗██║    ██╔═██╗       ╚██╔╝      ██║   ██║    ██║   ██║    ╚═╝
                               ██║       ██║  ██║    ██║  ██║    ██║ ╚████║    ██║  ██╗       ██║       ╚██████╔╝    ╚██████╔╝    ██╗
                               ╚═╝       ╚═╝  ╚═╝    ╚═╝  ╚═╝    ╚═╝  ╚═══╝    ╚═╝  ╚═╝       ╚═╝        ╚═════╝      ╚═════╝     ╚═╝
                                                                                                                                                                                                                                                                                                   
                                """;
                
                
                            for(int i = 0; i < art.length(); i++){
                                System.out.print(art.charAt(i));
                            }
                        System.out.println("FOR USING THIS MAP");
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

            thecurrentLocation = menu.toUpperCase();
            // Option
            System.out.print("\nDo you still want to go to another place?\n[Y] Yes, I want to go somewhere.\n[N] No, want to exit.\nChoice: ");
                    anotherLocation = find.nextLine();
                        
                        if (anotherLocation.equalsIgnoreCase(("Y").trim()) || anotherLocation.equalsIgnoreCase(("y").trim())) {
                        continue;   
                    }else{
                        op = false;
                        String art = """
                            ████████╗    ██╗  ██╗     █████╗     ███╗   ██╗    ██╗  ██╗    ██╗   ██╗     ██████╗     ██╗   ██╗    ██╗
                            ╚══██╔══╝    ██║  ██║    ██╔══██╗    ████╗  ██║    ██║ ██╔╝    ╚██╗ ██╔╝    ██╔═══██╗    ██║   ██║    ██║
                               ██║       ███████║    ███████║    ██╔██╗ ██║    █████╔╝      ╚████╔╝     ██║   ██║    ██║   ██║    ██║
                               ██║       ██╔══██║    ██╔══██║    ██║╚██╗██║    ██╔═██╗       ╚██╔╝      ██║   ██║    ██║   ██║    ╚═╝
                               ██║       ██║  ██║    ██║  ██║    ██║ ╚████║    ██║  ██╗       ██║       ╚██████╔╝    ╚██████╔╝    ██╗
                               ╚═╝       ╚═╝  ╚═╝    ╚═╝  ╚═╝    ╚═╝  ╚═══╝    ╚═╝  ╚═╝       ╚═╝        ╚═════╝      ╚═════╝     ╚═╝
                                                                                                                                                                                                                                                                                                   
                                """;
                
                
                            for(int i = 0; i < art.length(); i++){
                                System.out.print(art.charAt(i));
                            }
                            System.out.println("FOR USING THIS MAP");
                        break;
                    }
                    
        } while (op);
        find.close();
    }

    public static void randomLocation(){

        if (thecurrentLocation.equalsIgnoreCase((places[4]).trim())) {
            System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------");
            String smStory = "\n\t\t\t\tYou and your friends have just finished shopping at the mall. Where do you want to go to next? \n".toUpperCase();
            System.out.println
            (smStory);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");  
            System.out.println("\nYour current location: " + places[4]);
            for(int i = 0; i < places.length; i++){

                if(i != 4)
                System.out.println(places[i]);
                
            }
        } else{
        
        if (thecurrentLocation.equalsIgnoreCase((places[5]).trim())) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                String jollibeeStory = "\n\tYou and your family are finish in finding your place to sleep but your sister wants a family bonding. Where do you want to go next?\n".toUpperCase();
                System.out.println
                (jollibeeStory);
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nYour current location: " + places[5]);
                    for(int i = 0; i < places.length; i++){
    
                        if(i != 5)
                        System.out.println(places[i]);
                        
                    }
        }


        
        if (thecurrentLocation.equalsIgnoreCase((places[1]).trim())) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            String jollibeeStory = "\n\tYou and your family went to Jollibee to eat but your youngest sibling does not want to go home yet. Where do you want to go to next?\n".toUpperCase();
            System.out.println
            (jollibeeStory);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\nYour current location: " + places[1]);
                for(int i = 0; i < places.length; i++){

                    if(i != 1)
                    System.out.println(places[i]);
                    
                }
        }

        if (thecurrentLocation.equalsIgnoreCase((places[2]).trim())) {
            System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------");
            String hospitalStory = "\n\t\t\tYou visited your sister at the hospital but visiting hours have ended. Where do you want to go to next?\n".toUpperCase();
            System.out.println
            (hospitalStory);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\nYour current location: " + places[2]);
                for(int i = 0; i < places.length; i++){

                    if(i != 2)
                    System.out.println(places[i]);
                    
                }
        }

        if (thecurrentLocation.equalsIgnoreCase((places[3]).trim())) {
            System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------");
            String mcdoStory = "\n\t\t\tYou and your friends eat at McDonald's and decided to go elsewhere. Where do you want to go next?\n".toUpperCase();
            System.out.println
            (mcdoStory);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\nYour current location: " + places[3]);
                for(int i = 0; i < places.length; i++){

                    if(i != 3)
                    System.out.println(places[i]);
                    
                }
            }

        if (thecurrentLocation.equalsIgnoreCase((places[0]).trim())) {
            System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------");
            String schoolStory = "\n\t\t\tClass has just ended and you and your friends wants to go somewhere else. Where do want to go to next?\n" .toUpperCase();    
            System.out.println
                (schoolStory); 
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\nYour current location: " + places[0]);
                for(int i = 0; i < places.length; i++){

                    if(i != 0)
                    System.out.println(places[i]);
                    
                }
            
        }
        
    }
    
    }
}

    