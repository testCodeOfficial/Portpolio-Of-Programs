import java.util.Scanner;
import java.util.Random;
import java.util.random.*;

public class MapProgram {
    static Scanner find = new Scanner(System.in);
    public static void main(String[] args) {
    desingMap mapDesign = new desingMap();

    
    
    Random shuffle = new Random();
    
    //1 meter = 0.1sec
    // distance  + speed = time
    // divide Or modulos by 60 for taking time and hours
    //Display the Short Path
    String empty = "";
    String places[] = {"SCHOOL", "JOLIBEE", "HOSPITAL", "MCDO", "SM"};
    String thecurrentLocation = places[shuffle.nextInt(places.length)];

    int distance1 = shuffle.nextInt(10,100);
    int distance2 = shuffle.nextInt(10,100);
    int distance3 = shuffle.nextInt(10,100);
    int distance4 = shuffle.nextInt(10,100);
    int distance5 = shuffle.nextInt(10,100);
    int distance6 = shuffle.nextInt(10, 100);

    mapDesign.generateMap(thecurrentLocation, places, distance1, distance2, distance3, distance4, distance5, distance6);


    //INFORMATION IN MAP
    System.out.println("\n\n*************************************\t");
    System.out.println("|\tMap Information\t");
    System.out.println("\n|\t (o<>o) - Human Interface");
    System.out.print("\n|\t = - Define as road in map\t");
    System.out.print("\n|\t m - distance\t");
    System.out.println("\n**************************************\t\n");
    
    //DISPLAY DETAILS SHOWN IN MAP  
    System.out.print("----------------------"); 
    System.out.print("\n   < PLACES IN MAP >\n" );
    for(int i =0; i < places.length; i++){
        System.out.print("[\t" + places[i]+ "\n");
    }
    // System.out.print("\n[\t\b" + places[0] + "\t    ]");
    // System.out.print("\n[\t\b" + places[1] + "    ]");
    // System.out.print("\n[\t\b" + places[2] + "   ]");
    // System.out.print("\n[\t\b" + places[3] + "\t    ]");
    // System.out.print("\n[\t\b" + places[4] + "\t    ]");
    System.out.print("\n---------------------");

    System.out.println();
    
    
    
      do{
            if(thecurrentLocation.equalsIgnoreCase(places[4])){
                System.out.println("Your current location: " + places[4]);
                System.out.println("\nJOLIBEE" + "\nHOSPITAL" + "\nMCDO" + "\nSCHOOL");
                
            }

            if(thecurrentLocation.equalsIgnoreCase(places[1])){
                System.out.println("Your current location: " + places[1]);
                System.out.println("\nSCHOOL" + "\nHOSPITAL" + "\nMCDO" + "\nSM");
                
            }

            if(thecurrentLocation.equalsIgnoreCase(places[2])){
                System.out.println("Your current location: " + places[2]);
                System.out.println("\nSCHOOL" +"\nJOLIBEE" + "\nMCDO" + "\nSM");

                
            }

             if(thecurrentLocation.equalsIgnoreCase(places[3])){
                System.out.println("Your current location: " + places[3]);
                System.out.println("\nSCHOOL"+"\nJOLIBEE" + "\nHOSPITAL" + "\nSM");    
            }

            if(thecurrentLocation.equalsIgnoreCase(places[0])){
                System.out.println("Your current location: " + places[0]);
                System.out.println("\nSM"+"\nJOLIBEE" + "\nHOSPITAL" + "\nMCDO");    
 
            }

        // try{
        //DISPLAY CURRENT LOCATION OF THE USER
        System.out.print("");

        System.out.print("\nChoose location you would like to visit: ");
        String menu = find.nextLine();
        
        userDestination(menu, thecurrentLocation, places, distance1, distance2, distance3, distance4, distance5, distance6);

        }while(true);
    }


    //DISPLAY ALL ROUTE
    public static void userDestination(String menu,String thecurrentLocation, String places[], int distance1, int distance2, int distance3, int distance4, int distance5, int distance6){

    switch(thecurrentLocation){
        //DISPLAY POSSIBLE ROUTE IN CURRENT LOCATION SCHOOL TO ALL
        case "SCHOOL":
            String currentLocation[] = {places[0], places[1],places[2], places[3], places[4]}; 
        
            // System.out.print("\nChoose location you would like to visit: ");
            // String choice = find.nextLine();     

            System.out.println("\nPossible Route:"+ "\n");
                
                //Route for School - jolibee
            if(menu.equalsIgnoreCase("jolibee")){

                //function for distance
                int firstRouteJolibee =  distance2;
                int secondRouteJolibee = distance1 + distance6 + distance5 + distance3;

                //function for time
                int minute = firstRouteJolibee%60;
                int minute2 = secondRouteJolibee%60;
                int hours = firstRouteJolibee/60;
                int hours2 = secondRouteJolibee/60;
                int time[] = {minute, minute2};
                int time2[] = {hours, hours2};
                
                //Display Distance, Minute and Hours
                    if(firstRouteJolibee < 60 || secondRouteJolibee < 60){
                    System.out.println("First Route "+ currentLocation[0] +" >>>" +": " + currentLocation[1] +" ("+distance2+"m) " + "\nCalculate Distance: " +  +firstRouteJolibee + "m");
                    System.out.println("Time: " +minute+"minutes\n");
                    System.out.println("Second Route "+ currentLocation[0] +" ("+distance1+"m) " +": " + currentLocation[4] + " ("+distance6+"m) " + " >>> " + currentLocation[2] + " ("+distance5+"m) " + " >>> " + currentLocation [1]+ " ("+distance3+") "  +"\nCalculate Distance: " + secondRouteJolibee +"m\n");
                    System.out.println("Time: "+ minute2+"minutes\n");
                    System.out.println();
                    }

                    else if(firstRouteJolibee > secondRouteJolibee || secondRouteJolibee > firstRouteJolibee){
                    System.out.println("First Route "+ currentLocation[0] +" >>> " +": " + currentLocation[1] +" ("+distance2+"m) " + "\nCalculate Distance: " +  +firstRouteJolibee + "m");
                    System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                    System.out.println("Second Route "+ currentLocation[0] +" ("+distance1+"m) " +": " + currentLocation[4] + " ("+distance6+"m) " + " >>> " + currentLocation[2] + " ("+distance5+"m) " + " >>> " + currentLocation [1]+ " ("+distance2+") "  +"\nCalculate Distance: " + secondRouteJolibee +"m\n");
                    System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                    System.out.println();
                    }
                        if(firstRouteJolibee < secondRouteJolibee){
                            System.out.println("\nRECOMMENDED!\n");
                            System.out.println("You may take this route: "+ currentLocation[0] +" >>> " +": " + currentLocation[1] +" ("+distance2+"m) " + "\nCalculate Distance: " +  +firstRouteJolibee + "m");
                            if(firstRouteJolibee < 60){
                                System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                            
                            }
                        }
                    
                        else if(secondRouteJolibee > firstRouteJolibee){
                            System.out.println("RECOMMENDED!\n");
                            System.out.println("You may take this route: "+ currentLocation[0] +" ("+distance1+"m) " +": " + currentLocation[4] + " ("+distance5+"m) " + " >>> " + currentLocation[2] + " ("+distance4+"m) " + " >>> " + currentLocation [1]+ " ("+distance2+") "  +"\nCalculate Distance: " + secondRouteJolibee +"m\n");
                            if(secondRouteJolibee < 60){
                                System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                            }
                            
                        }
                }
            
                //Route for School - Hospital
            else if(menu.equalsIgnoreCase("HOSPITAL")){
                
                int firstRouteHospital = distance2 + distance3;
                int secondRouteHospital = distance1 + distance6 + distance5;

                int minute = firstRouteHospital%60;
                int minute2 = secondRouteHospital%60;
                int hours = firstRouteHospital/60;
                int hours2 = secondRouteHospital/60;
                int time[] = {minute, minute2};
                int time2[] = {hours, hours2};

                if(firstRouteHospital < 60 || secondRouteHospital < 60){
                System.out.println("First Route " + currentLocation[0] +" >>> " + ": " + currentLocation[1] +" ("+distance2+"m) " + " >>> " + currentLocation[2]  + " ("+distance3+"m) "+"\nCalculate Distance: " +  +firstRouteHospital + "m\n" );
                System.out.println("Time: " +minute+"minutes\n");
                System.out.println("Second Route " + currentLocation[0] +" ("+distance1+"m) " + ": " + currentLocation[4] + " ("+distance6+"m) " + " >>> " + currentLocation[2] + " ("+distance5+"m) " + "\nCalculate Distance: " +  +secondRouteHospital + "m\n" );
                System.out.println("Time: "+ minute2+"minutes\n");
                System.out.println();
                }

                else if(firstRouteHospital > secondRouteHospital || secondRouteHospital > firstRouteHospital){
                    System.out.println("First Route " + currentLocation[0] +" >>> " + ": " + currentLocation[1] +" ("+distance2+"m) " + " >>> " + currentLocation[2]  + " ("+distance3+"m) "+"\nCalculate Distance: " +  +firstRouteHospital + "m\n");
                    System.out.println("Time: " +minute+"minutes\n");
                    System.out.println("Second Route " + currentLocation[0] +" ("+distance1+"m) " + ": " + currentLocation[4] + " ("+distance6+"m) " + " >>> " + currentLocation[2] + " ("+distance5+"m) " + "\nCalculate Distance: " +  +secondRouteHospital + "m\n");
                    System.out.println("Time: "+ minute2+"minutes\n");
                    System.out.println();
                }

                    if(firstRouteHospital < secondRouteHospital){
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route " + currentLocation[0] +" >>> " + ": " + currentLocation[1] +" ("+distance2+"m) " + " >>> " + currentLocation[2]  + " ("+distance3+"m) "+"\nCalculate Distance: " +  +firstRouteHospital + "m\n");
                        if(firstRouteHospital < 60){
                            System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                        
                        }
                    }
                
                    else if(secondRouteHospital > firstRouteHospital){
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route: "+ currentLocation[0] +" ("+distance1+"m) " +": " + currentLocation[4] + " ("+distance6+"m) " + " >>> " + currentLocation[2] + " ("+distance5+"m) " + " >>> " + "\nCalculate Distance: " + secondRouteHospital +"m\n");
                        if(secondRouteHospital < 60){
                            System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                        }
                        
                    }
            }

                //Route for School- Mcdo
            else if(menu.equalsIgnoreCase("MCDO")){
            
                int firstRouteMcdo = distance2 + distance3 + distance4;
                int secondRouteMcdo = distance1 + distance6 + distance5 + distance4;

                int minute = firstRouteMcdo%60;
                int minute2 = secondRouteMcdo%60;
                int hours = firstRouteMcdo/60;
                int hours2 = secondRouteMcdo/60;
                int time[] = {minute, minute2};
                int time2[] = {hours, hours2};

                if(firstRouteMcdo < 60 || secondRouteMcdo < 60){
                    System.out.println("First Route " + currentLocation[0] + " >>> " +": " + currentLocation[1] +" ("+distance2+"m) " + " >>> " + currentLocation[2] +" ("+distance3+"m) " + " >>> " + currentLocation[3]+ " ("+distance4+"m) " +"\nCalculate Distance: " +  +firstRouteMcdo + "m\n");
                    System.out.println("Time: " +minute+"minutes\n");
                    System.out.println("Second Route " + currentLocation[0] + " ("+distance1+"m) " +": " + currentLocation[4] + " ("+distance6+"m) " +" >>> " + currentLocation[2] + " ("+distance5+"m) " +" >>> " + currentLocation[3] +" ("+distance4+"m) " + "\nCalculate Distance: " +  +secondRouteMcdo + "m\n");
                    System.out.println("Time: "+ minute2+"minutes\n");
                    System.out.println();
                }
    
                else if(firstRouteMcdo > secondRouteMcdo || secondRouteMcdo > firstRouteMcdo){
                System.out.println("First Route " + currentLocation[0] + " >>> " +": " + currentLocation[1] +" ("+distance2+"m) " + " >>> " + currentLocation[2] +" ("+distance3+"m) " + " >>> " + currentLocation[3]+ " ("+distance4+"m) " +"\nCalculate Distance: " +  +firstRouteMcdo + "m\n");
                System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                System.out.println("Second Route " + currentLocation[0] + " ("+distance1+"m) " +": " + currentLocation[4] + " ("+distance6+"m) " +" >>> " + currentLocation[2] + " ("+distance5+"m) " +" >>> " + currentLocation[3] +" ("+distance4+"m) " + "\nCalculate Distance: " +  +secondRouteMcdo + "m\n");
                System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                }
                        if(firstRouteMcdo < secondRouteMcdo){
                            System.out.println("\nRECOMMENDED!\n");
                            System.out.println("First Route " + currentLocation[0] + " >>> " +": " + currentLocation[1] +" ("+distance2+"m) " + " >>> " + currentLocation[2] +" ("+distance3+"m) " + " >>> " + currentLocation[3]+ " ("+distance4+"m) " +"\nCalculate Distance: " +  +firstRouteMcdo + "m\n");
                            if(firstRouteMcdo < 60){
                                System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                            
                            }
                        }
                    
                        else if(secondRouteMcdo > firstRouteMcdo){
                            System.out.println("RECOMMENDED!\n");
                            System.out.println("Second Route " + currentLocation[0] + " ("+distance1+"m) " +": " + currentLocation[4] + " ("+distance6+"m) " +" >>> " + currentLocation[2] + " ("+distance5+"m) " +" >>> " + currentLocation[3] +" ("+distance4+"m) " + "\nCalculate Distance: " +  +secondRouteMcdo + "m\n");
                            if(secondRouteMcdo < 60){
                                System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                            }
                            
                        }
                }

                //Route for School - SM
            else if(menu.equalsIgnoreCase("SM")){
                
                int firstRouteSM = distance1 + distance6; 
                int secondRouteSM = distance2 + distance3 + distance5;

                int minute = firstRouteSM%60;
                int minute2 = secondRouteSM%60;
                int hours = firstRouteSM/60;
                int hours2 = secondRouteSM/60;
                int time[] = {minute, minute2};
                int time2[] = {hours, hours2};

                if(firstRouteSM < 60 || secondRouteSM < 60){
                    System.out.println("First Route " + currentLocation[0] + " ("+distance1+"m) " +": " + currentLocation[4] +" ("+distance6+"m) " + "\nCalculate Distance: " +  +firstRouteSM + "m\n");
                    System.out.println("Time: " +minute+"minutes\n");
                    System.out.println("Second Route " + currentLocation[0] + " >>> " +": " + currentLocation[1] + " ("+distance2+"m) " +" >>> " + currentLocation[2]+" ("+distance3+"m) " + " >>> " + currentLocation[4] +" ("+distance5+"m) " + "\nCalculate Distance: " +  +secondRouteSM + "m\n");
                    System.out.println("Time: "+ minute2+"minutes\n");
                    System.out.println();
                    }
    
                    else if(firstRouteSM > secondRouteSM || secondRouteSM > firstRouteSM){
                    System.out.println("First Route " + currentLocation[0] + " ("+distance1+"m) " +": " + currentLocation[4] +" ("+distance6+"m) " + "\nCalculate Distance: " +  +firstRouteSM + "m\n");
                    System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                    System.out.println("Second Route " + currentLocation[0] + " >>> " +": " + currentLocation[1] + " ("+distance2+"m) " +" >>> " + currentLocation[2]+" ("+distance3+"m) " + " >>> " + currentLocation[4] +" ("+distance5+"m) " + "\nCalculate Distance: " +  +secondRouteSM + "m\n");
                    System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                    System.out.println();
                    }
                        if(firstRouteSM < secondRouteSM){
                            System.out.println("\nRECOMMENDED!\n");
                            System.out.println("First Route " + currentLocation[0] + " ("+distance1+"m) " +": " + currentLocation[4] +" ("+distance6+"m) " + "\nCalculate Distance: " +  +firstRouteSM + "m\n");
                            if(firstRouteSM < 60){
                                System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                            
                            }
                        }
                    
                        else if(secondRouteSM > firstRouteSM){
                            System.out.println("RECOMMENDED!\n");
                            System.out.println("Second Route " + currentLocation[0] + " >>> " +": " + currentLocation[1] + " ("+distance2+"m) " +" >>> " + currentLocation[2]+" ("+distance3+"m) " + " >>> " + currentLocation[4] +" ("+distance5+"m) " + "\nCalculate Distance: " +  +secondRouteSM + "m\n");
                            if(secondRouteSM <= 60){
                                System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                            }   
                        }
            }

            else{
                System.out.println("Invalid Type");
            }
            break;
          
        //DISPLAY POSSIBLE ROUTE IN CURRENT LOCATION JOLIBEE TO ALL
        case "JOLIBEE":

            String currentLocation1[] = {places[0], places[1],places[2], places[3], places[4]}; 

            System.out.println("\nPossible Route: "+ "\n");
            
            //Route for Jolibee - School
            if(menu.equalsIgnoreCase("SCHOOL")){
            
            int firstRouteSchool = distance2;
            int secondRouteSchool = distance3 + distance5 + distance6 + distance1;

            int minute = firstRouteSchool%60;
            int minute2 = secondRouteSchool%60;
            int hours = firstRouteSchool/60;
            int hours2 = secondRouteSchool/60;
            int time[] = {minute, minute2};
            int time2[] = {hours, hours2};


                if(firstRouteSchool < 60 || secondRouteSchool < 60){
                    System.out.println("First Route "+ currentLocation1[1] + ": " + currentLocation1[0] +" ("+distance2+"m) " + "\nCalculate Distance: " +  +firstRouteSchool + "m\n");
                    System.out.println("Time: " +minute+"minutes\n");
                    System.out.println("Second Route "+ currentLocation1[1] +"("+distance3+"m)  " +": " + currentLocation1[2] + " ("+distance5+"m) " + " >>> " + currentLocation1[4] + " ("+distance6+"m)"+" >>> " + currentLocation1 [0]+ " ("+distance1+") "  +"\nCalculate Distance: " + secondRouteSchool +"m\n");
                    System.out.println("Time: "+ minute2+"minutes\n");
                    System.out.println();
                    }

                    else if(firstRouteSchool > secondRouteSchool || secondRouteSchool > firstRouteSchool){
                    System.out.println("First Route "+ currentLocation1[1] + ": " + currentLocation1[0] +" ("+distance2+"m) " + "\nCalculate Distance: " +  +firstRouteSchool + "m\n");
                    System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                    System.out.println("Second Route "+ currentLocation1[1] +" ("+distance3+"m) " +": " + currentLocation1[2] + " ("+distance5+"m) " + " >>> " + currentLocation1[4] + " ("+distance6+"m)"+" >>> " + currentLocation1 [0]+ " ("+distance1+") "  +"\nCalculate Distance: " + secondRouteSchool +"m\n");
                    System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                    System.out.println();
                    }
                        if(firstRouteSchool < secondRouteSchool){
                            System.out.println("\nRECOMMENDED!\n");
                            System.out.println("First Route "+ currentLocation1[1] + ": " + currentLocation1[0] +" ("+distance2+"m) " + "\nCalculate Distance: " +  +firstRouteSchool + "m\n");

                            if(firstRouteSchool < 60){
                                System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                            
                            }
                        }
                    
                        else if(secondRouteSchool > firstRouteSchool){
                            System.out.println("RECOMMENDED!\n");
                            System.out.println("Second Route "+ currentLocation1[1] +" ("+distance3+"m) " +": " + currentLocation1[2] + " ("+distance5+"m) " + " >>> " + currentLocation1[4] + " ("+distance6+"m) "+">>> " + currentLocation1 [0]+ " ("+distance1+") "  +"\nCalculate Distance: " + secondRouteSchool +"m\n");
                            if(secondRouteSchool < 60){
                                System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                            }   
                        }


            }

            //Route for Jolibee - Hospital
            else if(menu.equalsIgnoreCase("HOSPITAL")){
            
            int firstRouteHospital = distance3;
            int secondRouteHospital = distance2  + distance1 + distance6 + distance5;

            int minute = firstRouteHospital%60;
            int minute2 = secondRouteHospital%60;
            int hours = firstRouteHospital/60;
            int hours2 = secondRouteHospital/60;
            int time[] = {minute, minute2};
            int time2[] = {hours, hours2};

                if(firstRouteHospital < 60 || secondRouteHospital < 60){
                    System.out.println("First Route " + currentLocation1[1] +" >>> " + ": " + currentLocation1[2] +" ("+distance3+"m) " +"\nCalculate Distance: " +  +firstRouteHospital +"m\n");
                    System.out.println("Time: " +minute+"minutes\n");
                    System.out.println("Second Route " + currentLocation1[1] +" ("+distance2+"m) " + ": " + currentLocation1[0] + " ("+distance1+"m) " + " >>> " + currentLocation1[4] + " ("+distance6+"m) " +" >>> " + currentLocation1[2] + " ("+distance5+"m) "+ "\nCalculate Distance: " +  +secondRouteHospital + "m\n");
                    System.out.println("Time: "+ minute2+"minutes\n");
                    System.out.println();
                    }

                    else if(firstRouteHospital > secondRouteHospital || secondRouteHospital > firstRouteHospital){
                    System.out.println("First Route " + currentLocation1[1] +" >>> " + ": " + currentLocation1[2] +" ("+distance3+"m) " +"\nCalculate Distance: " +  +firstRouteHospital + "m\n");
                    System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                    System.out.println("Second Route " + currentLocation1[1] +" ("+distance2+"m) " + ": " + currentLocation1[0] + " ("+distance1+"m) " + " >>> " + currentLocation1[4] + " ("+distance6+"m) " +" >>> " + currentLocation1[2] + " ("+distance5+"m) "+ "\nCalculate Distance: " +  +secondRouteHospital + "m\n");
                    System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                    System.out.println();
                    }
                        if(firstRouteHospital < secondRouteHospital){
                            System.out.println("\nRECOMMENDED!\n");
                            System.out.println("First Route " + currentLocation1[1] +" >>> " + ": " + currentLocation1[2] +" ("+distance3+"m) " +"\nCalculate Distance: " +  +firstRouteHospital + "m\n");

                            if(firstRouteHospital < 60){
                                System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                            
                            }
                        }
                    
                        else if(secondRouteHospital > firstRouteHospital){
                            System.out.println("RECOMMENDED!\n");
                            System.out.println("Second Route " + currentLocation1[1] +" ("+distance2+"m) " + ": " + currentLocation1[0] + " ("+distance1+"m) " + " >>> " + currentLocation1[4] + " ("+distance6+"m) " +" >>> " + currentLocation1[2] + " ("+distance5+"m) "+ "\nCalculate Distance: " +  +secondRouteHospital + "m\n");
                            if(secondRouteHospital < 60){
                                System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                            }   
                        }

            }

            //Route for Jolibee - Mcdo
            else if(menu.equalsIgnoreCase("MCDO")){
        
            int firstRouteMcdo =  distance3 + distance4;
            int secondRouteMcdo = distance2 + distance1 + distance6 + distance5 + distance4;

            int minute = firstRouteMcdo%60;
            int minute2 = secondRouteMcdo%60;
            int hours = firstRouteMcdo/60;
            int hours2 = secondRouteMcdo/60;
            int time[] = {minute, minute2};
            int time2[] = {hours, hours2};
            
                if(firstRouteMcdo < 60 || secondRouteMcdo < 60){
                    System.out.println("First Route " + currentLocation1[1] + " >>> " +": " + currentLocation1[2] +" ("+distance3+"m) " + " >>> " + currentLocation1[3] +" ("+distance4+"m) " + " >>> " +"\nCalculate Distance: " +  +firstRouteMcdo + "m\n");
                    System.out.println("Time: " +minute+"minutes\n");
                    System.out.println("Second Route " + currentLocation1[1] + " ("+distance2+"m) " +": " + currentLocation1[0] + " ("+distance1+"m) " +" >>> " + currentLocation1[4] + " ("+distance6+"m) " +" >>> " + currentLocation1[2] +" ("+distance5+"m) " +" >>> " + currentLocation1[3] +"("+distance4+"m) "+ "\nCalculate Distance: " +  +secondRouteMcdo + "m\n");
                    System.out.println("Time: "+ minute2+"minutes\n");
                    System.out.println();
                    }

                    else if(firstRouteMcdo > secondRouteMcdo || secondRouteMcdo > firstRouteMcdo){
                    System.out.println("First Route " + currentLocation1[1] + " >>> " +": " + currentLocation1[2] +" ("+distance3+"m) " + " >>> " + currentLocation1[3] +" ("+distance4+"m) " + " >>> " +"\nCalculate Distance: " +  +firstRouteMcdo + "m\n");
                    System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                    System.out.println("Second Route " + currentLocation1[1] + " ("+distance2+"m) " +": " + currentLocation1[0] + " ("+distance1+"m) " +" >>> " + currentLocation1[4] + " ("+distance6+"m) " +" >>> " + currentLocation1[2] +" ("+distance5+"m) " +" >>> " + currentLocation1[3] +"("+distance4+"m) "+ "\nCalculate Distance: " +  +secondRouteMcdo + "m\n");
                    System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                    System.out.println();
                    }
                        if(firstRouteMcdo < secondRouteMcdo){
                            System.out.println("\nRECOMMENDED!\n");
                            System.out.println("First Route " + currentLocation1[1] + " >>> " +": " + currentLocation1[2] +" ("+distance3+"m) " + " >>> " + currentLocation1[3] +" ("+distance4+"m) " + " >>> " +"\nCalculate Distance: " +  +firstRouteMcdo + "m\n");

                            if(firstRouteMcdo < 60){
                                System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                            
                            }
                        }
                    
                        else if(secondRouteMcdo > firstRouteMcdo){
                            System.out.println("RECOMMENDED!\n");
                            System.out.println("Second Route " + currentLocation1[1] + " ("+distance2+"m) " +": " + currentLocation1[0] + " ("+distance1+"m) " +" >>> " + currentLocation1[4] + " ("+distance6+"m) " +" >>> " + currentLocation1[2] +" ("+distance5+"m) " +" >>> " + currentLocation1[3] +"("+distance4+"m) "+ "\nCalculate Distance: " +  +secondRouteMcdo + "m\n");
                            if(firstRouteMcdo < 60){
                                System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                            }   
                        }

            }

            //Route for Jolibee - SM
            else if(menu.equalsIgnoreCase("SM")){
            
            int firstRouteSM = distance3 + distance5 + distance6; 
            int secondRouteSM = distance2 + distance1 + distance6;

            int minute = firstRouteSM%60;
            int minute2 = secondRouteSM%60;
            int hours = firstRouteSM/60;
            int hours2 = secondRouteSM/60;
            int time[] = {minute, minute2};
            int time2[] = {hours, hours2};

                if(firstRouteSM < 60 || secondRouteSM < 60){
                System.out.println("First Route " + currentLocation1[1] + " ("+distance3+"m) " +": " + currentLocation1[2] +" ("+distance5+"m) "+" >>> " + currentLocation1[4] +" ("+distance6+"m)"+ "\nCalculate Distance: " +  +firstRouteSM + "m\n");
                System.out.println("Time: " +minute+"minutes\n");
                System.out.println("Second Route " + currentLocation1[1] + " ("+distance1+"m) " +": " + currentLocation1[0] + " ("+distance6+"m) " +" >>> " + currentLocation1[4] +" ("+distance5+"m) " + "\nCalculate Distance: " +  +secondRouteSM + "m\n");
                System.out.println("Time: "+ minute2+"minutes\n");
                System.out.println();
                }

                else if(firstRouteSM > secondRouteSM || secondRouteSM > firstRouteSM){
                System.out.println("First Route " + currentLocation1[1] + " ("+distance3+"m) " +": " + currentLocation1[2] +" ("+distance5+"m) "+" >>> " + currentLocation1[4] +" ("+distance6+"m)"+ "\nCalculate Distance: " +  +firstRouteSM + "m\n");
                System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                System.out.println("Second Route " + currentLocation1[1] + " ("+distance1+"m) " +": " + currentLocation1[0] + " ("+distance6+"m) " +" >>> " + currentLocation1[4] +" ("+distance5+"m) " + "\nCalculate Distance: " +  +secondRouteSM + "m\n");
                System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                System.out.println();
                }
                    if(firstRouteSM < secondRouteSM){
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route " + currentLocation1[1] + " ("+distance3+"m) " +": " + currentLocation1[2] +" ("+distance5+"m) "+" >>> " + currentLocation1[4] +" ("+distance6+"m)"+ "\nCalculate Distance: " +  +firstRouteSM + "m\n");

                        if(firstRouteSM < 60){
                            System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                        
                        }
                    }
                
                    else if(secondRouteSM > firstRouteSM){
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Second Route " + currentLocation1[1] + " ("+distance1+"m) " +": " + currentLocation1[0] + " ("+distance6+"m) " +" >>> " + currentLocation1[4] +" ("+distance5+"m) " + "\nCalculate Distance: " +  +secondRouteSM + "m\n");
                        if(firstRouteSM < 60){
                            System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                        }   
                    }
            }

            else{
                System.out.println("Invalid Type");
            }

          break;

        //DISPLAY POSSIBLE ROUTE IN CURRENT LOCATION HOSPITAL TO ALL
        case "HOSPITAL":
            String currentLocation2[] = {places[0], places[1],places[2], places[3], places[4]}; 
            

            System.out.println("\nPossible Route: "+ "\n");
            
            //Route for Hospital - School
            if(menu.equalsIgnoreCase("SCHOOL")){
            
            int firstRouteSchool = distance3 + distance2;
            int secondRouteSchool = distance5 + distance6 + distance1;

            int minute = firstRouteSchool%60;
            int minute2 = secondRouteSchool%60;
            int hours = firstRouteSchool/60;
            int hours2 = secondRouteSchool/60;
            int time[] = {minute, minute2};
            int time2[] = {hours, hours2};
       
                if(firstRouteSchool < 60 || secondRouteSchool < 60){
                System.out.println("First Route "+ currentLocation2[2] +" >>> " +": " + currentLocation2[1] +" ("+distance3+"m) "+ currentLocation2[0] +" ("+distance2+"m) " +"\nCalculate Distance: " +  +firstRouteSchool + "m\n");
                System.out.println("Time: " +minute+"minutes\n");
                System.out.println("Second Route "+ currentLocation2[2] +" ("+distance5+"m) " +": " + currentLocation2[4] + " ("+distance6+"m) " + " >>> " + currentLocation2[0] + " ("+distance1+"m) " +"\nCalculate Distance: " + secondRouteSchool +"m\n");
                System.out.println("Time: "+ minute2+"minutes\n");
                System.out.println();
                }

                else if(firstRouteSchool > secondRouteSchool || secondRouteSchool > firstRouteSchool){
                System.out.println("First Route "+ currentLocation2[2] +" >>> " +": " + currentLocation2[1] +" ("+distance3+"m) "+ currentLocation2[0] +" ("+distance2+"m) " +"\nCalculate Distance: " +  +firstRouteSchool + "m\n");
                System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                System.out.println("Second Route "+ currentLocation2[2] +" ("+distance5+"m) " +": " + currentLocation2[4] + " ("+distance6+"m) " + " >>> " + currentLocation2[0] + " ("+distance1+"m) " +"\nCalculate Distance: " + secondRouteSchool +"m\n");
                System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                System.out.println();
                }
                    if(firstRouteSchool < secondRouteSchool){
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route "+ currentLocation2[2] +" >>> " +": " + currentLocation2[1] +" ("+distance3+"m) "+ currentLocation2[0] +" ("+distance2+"m) " +"\nCalculate Distance: " +  +firstRouteSchool + "m\n");

                        if(firstRouteSchool < 60){
                            System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                        
                        }
                    }
                
                    else if(secondRouteSchool > firstRouteSchool){
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Second Route "+ currentLocation2[2] +" ("+distance5+"m) " +": " + currentLocation2[4] + " ("+distance6+"m) " + " >>> " + currentLocation2[0] + " ("+distance1+"m) " +"\nCalculate Distance: " + secondRouteSchool +"m\n");
                        if(firstRouteSchool < 60){
                            System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                        }   
                    }
            }

            //Route for Hospital - Jolibee
            else if(menu.equalsIgnoreCase("JOLIBEE")){
            
            int firstRouteJolibee = distance3;
            int secondRouteJolibee = distance5 + distance6 + distance1 + distance2;

            int minute = firstRouteJolibee%60;
            int minute2 = secondRouteJolibee%60;
            int hours = firstRouteJolibee/60;
            int hours2 = secondRouteJolibee/60;
            int time[] = {minute, minute2};
            int time2[] = {hours, hours2};

            System.out.println("First Route " + currentLocation2[2] +" >>> " + ": " + currentLocation2[1] +" ("+distance3+"m) " +"\nCalculate Distance: " +  +firstRouteJolibee + "m\n");
            System.out.println("Second Route " + currentLocation2[2] +" ("+distance5+"m) " + ": " + currentLocation2[4] + " ("+distance6+"m) " + " >>> " + currentLocation2[0] + " ("+distance1+"m) " +" >>> " + currentLocation2[1] + " ("+distance2+"m) " + "\nCalculate Distance: " +  +secondRouteJolibee + "m\n");
            
            if(firstRouteJolibee < 60 || secondRouteJolibee < 60){
                System.out.println("First Route " + currentLocation2[2] +" >>> " + ": " + currentLocation2[1] +" ("+distance3+"m) " +"\nCalculate Distance: " +  +firstRouteJolibee + "m\n");
                System.out.println("Time: " +minute+"minutes\n");
                System.out.println("Second Route " + currentLocation2[2] +" ("+distance5+"m) " + ": " + currentLocation2[4] + " ("+distance6+"m) " + " >>> " + currentLocation2[0] + " ("+distance1+"m) " +" >>> " + currentLocation2[1] + " ("+distance2+"m) " + "\nCalculate Distance: " +  +secondRouteJolibee + "m\n");
                System.out.println("Time: "+ minute2+"minutes\n");
                System.out.println();
                }

                else if(firstRouteJolibee > secondRouteJolibee || secondRouteJolibee > firstRouteJolibee){
                System.out.println("First Route " + currentLocation2[2] +" >>> " + ": " + currentLocation2[1] +" ("+distance3+"m) " +"\nCalculate Distance: " +  +firstRouteJolibee + "m\n");
                System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                System.out.println("Second Route " + currentLocation2[2] +" ("+distance5+"m) " + ": " + currentLocation2[4] + " ("+distance6+"m) " + " >>> " + currentLocation2[0] + " ("+distance1+"m) " +" >>> " + currentLocation2[1] + " ("+distance2+"m) " + "\nCalculate Distance: " +  +secondRouteJolibee + "m\n");
                System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                System.out.println();
                }
                    if(firstRouteJolibee < secondRouteJolibee){
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route " + currentLocation2[2] +" >>> " + ": " + currentLocation2[1] +" ("+distance3+"m) " +"\nCalculate Distance: " +  +firstRouteJolibee + "m\n");
                        if(firstRouteJolibee < 60){
                            System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                        
                        }
                    }
                
                    else if(secondRouteJolibee > firstRouteJolibee){
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Second Route " + currentLocation2[2] +" ("+distance5+"m) " + ": " + currentLocation2[4] + " ("+distance6+"m) " + " >>> " + currentLocation2[0] + " ("+distance1+"m) " +" >>> " + currentLocation2[1] + " ("+distance2+"m) " + "\nCalculate Distance: " +  +secondRouteJolibee + "m\n");
                        if(secondRouteJolibee < 60){
                            System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                        }   
                    }
            }

            //Route for Hospital - Mcdo
            else if(menu.equalsIgnoreCase("MCDO")){
        
            int firstRouteMcdo =  distance4;
            int secondRouteMcdo = distance5 +distance6 + distance1 + distance2 + distance3 + distance4;
            int thirdRouteMcdo = distance3+ distance2 + distance1 + distance6 + distance5 + distance4;

            int minute = firstRouteMcdo%60;
            int minute2 = secondRouteMcdo%60;
            int minute3 = thirdRouteMcdo%60;
            int hours = firstRouteMcdo/60;
            int hours2 = secondRouteMcdo/60;
            int hours3 = thirdRouteMcdo/60;
            int time[] = {minute, minute2, minute3};
            int time2[] = {hours, hours2, hours3};

            // System.out.println("First Route " + currentLocation2[2] + " >>> " +": " + currentLocation2[3] +" ("+distance4+"m) " +"\nCalculate Distance: " +  +firstRouteMcdo + "m\n");
            // System.out.print("Second Route " + currentLocation2[2] + " ("+distance5+"m) " +": " + currentLocation2[4] + " ("+distance6+"m) " +" >>> " + currentLocation2[0] + " ("+distance1+"m) " +" >>> " + currentLocation2[1] +" ("+distance2+"m) " +" >>> " + currentLocation2[2] + " >>> " + currentLocation2[3] + " ("+distance4+"m) " +  "\nCalculate Distance: " +  +secondRouteMcdo + "m\n");
            // System.out.print("Third Route " + currentLocation2[2] + " ("+distance3+"m) " +": " + currentLocation2[1] + " ("+distance2+"m) " +" >>> " + currentLocation2[0] + " ("+distance1+"m) " +" >>> " + currentLocation2[4] +" ("+distance6+"m) " +" >>> " + currentLocation2[2] + "  >>> " + currentLocation2[3] + " ("+distance4+"m)" + "\nCalculate Distance: " +  +thirdRouteMcdo + "m\n");


                if(firstRouteMcdo < 60 || secondRouteMcdo < 60 || thirdRouteMcdo < 60){
                System.out.println("First Route " + currentLocation2[2] +" >>> " + ": " + currentLocation2[1] +" ("+distance3+"m) " +"\nCalculate Distance: " +  +firstRouteMcdo + "m\n");
                System.out.println("Time: " +minute+"minutes\n");
                System.out.print("Second Route " + currentLocation2[2] + " ("+distance5+"m) " +": " + currentLocation2[4] + " ("+distance6+"m) " +" >>> " + currentLocation2[0] + " ("+distance1+"m) " +" >>> " + currentLocation2[1] +" ("+distance2+"m) " +" >>> " + currentLocation2[2] + " >>> " + currentLocation2[3] + " ("+distance4+"m) " +  "\nCalculate Distance: " +  +secondRouteMcdo + "m\n");
                System.out.println("Time: "+ minute2+"minutes\n");
                System.out.print("Third Route " + currentLocation2[2] + " ("+distance3+"m) " +": " + currentLocation2[1] + " ("+distance2+"m) " +" >>> " + currentLocation2[0] + " ("+distance1+"m) " +" >>> " + currentLocation2[4] +" ("+distance6+"m) " +" >>> " + currentLocation2[2] + "  >>> " + currentLocation2[3] + " ("+distance4+"m)" + "\nCalculate Distance: " +  +thirdRouteMcdo + "m\n");
                System.out.println("Time: "+ minute3+"minutes\n");
                System.out.println();
                }

                else if(firstRouteMcdo > secondRouteMcdo || secondRouteMcdo > firstRouteMcdo || thirdRouteMcdo > secondRouteMcdo || thirdRouteMcdo >firstRouteMcdo){
                System.out.println("First Route " + currentLocation2[2] +" >>> " + ": " + currentLocation2[1] +" ("+distance3+"m) " +"\nCalculate Distance: " +  +firstRouteMcdo + "m\n");
                System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                System.out.print("Second Route " + currentLocation2[2] + " ("+distance5+"m) " +": " + currentLocation2[4] + " ("+distance6+"m) " +" >>> " + currentLocation2[0] + " ("+distance1+"m) " +" >>> " + currentLocation2[1] +" ("+distance2+"m) " +" >>> " + currentLocation2[2] + " >>> " + currentLocation2[3] + " ("+distance4+"m) " +  "\nCalculate Distance: " +  +secondRouteMcdo + "m\n");
                System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                System.out.print("Third Route " + currentLocation2[2] + " ("+distance3+"m) " +": " + currentLocation2[1] + " ("+distance2+"m) " +" >>> " + currentLocation2[0] + " ("+distance1+"m) " +" >>> " + currentLocation2[4] +" ("+distance6+"m) " +" >>> " + currentLocation2[2] + "  >>> " + currentLocation2[3] + " ("+distance4+"m)" + "\nCalculate Distance: " +  +thirdRouteMcdo + "m\n");
                System.out.println("Time: "+ minute3+"minutes\n");
                System.out.println();
                }
                    if(firstRouteMcdo < secondRouteMcdo){
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route " + currentLocation2[2] +" >>> " + ": " + currentLocation2[1] +" ("+distance3+"m) " +"\nCalculate Distance: " +  +firstRouteMcdo + "m\n");
                        if(firstRouteMcdo < 60){
                            System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                        
                        }
                    }
                
                    else if(secondRouteMcdo > firstRouteMcdo){
                        System.out.println("RECOMMENDED!\n");
                        System.out.print("Second Route " + currentLocation2[2] + " ("+distance5+"m) " +": " + currentLocation2[4] + " ("+distance6+"m) " +" >>> " + currentLocation2[0] + " ("+distance1+"m) " +" >>> " + currentLocation2[1] +" ("+distance2+"m) " +" >>> " + currentLocation2[2] + " >>> " + currentLocation2[3] + " ("+distance4+"m) " +  "\nCalculate Distance: " +  +secondRouteMcdo + "m\n");
                        if(secondRouteMcdo < 60){
                            System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                        }   
                    }

                    else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.print("Third Route " + currentLocation2[2] + " ("+distance3+"m) " +": " + currentLocation2[1] + " ("+distance2+"m) " +" >>> " + currentLocation2[0] + " ("+distance1+"m) " +" >>> " + currentLocation2[4] +" ("+distance6+"m) " +" >>> " + currentLocation2[2] + "  >>> " + currentLocation2[3] + " ("+distance4+"m)" + "\nCalculate Distance: " +  +thirdRouteMcdo + "m\n");
                        if(thirdRouteMcdo < 60){
                            System.out.printf("\nThis is quickest option: " +minute3+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: "+hours3 +" and "+minute3+" minutes\n");
                        }
                    }
            }

            //Route for Hospital - SM
            else if(menu.equalsIgnoreCase("SM")){
            
            int firstRouteSM = distance5 + distance6; 
            int secondRouteSM = distance3 + distance2 + distance6 + distance5;

            int minute = firstRouteSM%60;
            int minute2 = secondRouteSM%60;
            int hours = firstRouteSM/60;
            int hours2 = secondRouteSM/60;
            int time[] = {minute, minute2};
            int time2[] = {hours, hours2};

                if(firstRouteSM < 60 || secondRouteSM < 60){
                    System.out.println("First Route " + currentLocation2[2] + " ("+distance5+"m) " +": " + currentLocation2[4] +" ("+distance6+"m) " + "\nCalculate Distance: " +  +firstRouteSM + "m\n");
                    System.out.println("Time: " +minute+"minutes\n");
                    System.out.println("Second Route " + currentLocation2[2] + " ("+distance3+"m) " +": " + currentLocation2[1] + " ("+distance2+"m) " +" >>> " + currentLocation2[2] +" ("+distance6+"m) " + " >>> " + currentLocation2[4] +" ("+distance5+"m) " + "\nCalculate Distance: " +  +secondRouteSM + "m\n");
                    System.out.println("Time: "+ minute2+"minutes\n");
                    System.out.println();
                    }

                    else if(firstRouteSM > secondRouteSM || secondRouteSM > firstRouteSM){
                    System.out.println("First Route " + currentLocation2[2] + " ("+distance5+"m) " +": " + currentLocation2[4] +" ("+distance6+"m) " + "\nCalculate Distance: " +  +firstRouteSM + "m\n");
                    System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                    System.out.println("Second Route " + currentLocation2[2] + " ("+distance3+"m) " +": " + currentLocation2[1] + " ("+distance2+"m) " +" >>> " + currentLocation2[2] +" ("+distance6+"m) " + " >>> " + currentLocation2[4] +" ("+distance5+"m) " + "\nCalculate Distance: " +  +secondRouteSM + "m\n");
                    System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                    System.out.println();
                    }
                        if(firstRouteSM < secondRouteSM){
                            System.out.println("\nRECOMMENDED!\n");
                            System.out.println("First Route " + currentLocation2[2] + " ("+distance5+"m) " +": " + currentLocation2[4] +" ("+distance6+"m) " + "\nCalculate Distance: " +  +firstRouteSM + "m\n");
                            if(firstRouteSM < 60){
                                System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                            
                            }
                        }
                    
                        else if(secondRouteSM > firstRouteSM){
                            System.out.println("RECOMMENDED!\n");
                            System.out.println("Second Route " + currentLocation2[2] + " ("+distance3+"m) " +": " + currentLocation2[1] + " ("+distance2+"m) " +" >>> " + currentLocation2[2] +" ("+distance6+"m) " + " >>> " + currentLocation2[4] +" ("+distance5+"m) " + "\nCalculate Distance: " +  +secondRouteSM + "m\n");
                            if(secondRouteSM < 60){
                                System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                            }   
                        }
            }

            else{
                System.out.println("Invalid Type");
            }

            break;

            //DISPLAY POSSIBLE ROUTE IN MCDO
        case "MCDO":
            String currentLocation3[] = {places[0], places[1],places[2], places[3], places[4]}; 

            System.out.println("\nPossible Route: " + "\n");
            
            if(menu.equalsIgnoreCase("SCHOOL")){
            //Route for Mcdo - School
            int firstRouteSchool = distance4 + distance3 + distance2;
            int secondRouteSchool = distance4 + distance5 + distance6 + distance1;
            
            int minute = firstRouteSchool%60;
            int minute2 = secondRouteSchool%60;
            int hours = firstRouteSchool/60;
            int hours2 = secondRouteSchool/60;
            int time[] = {minute, minute2};
            int time2[] = {hours, hours2};

            // System.out.println("First Route "+ currentLocation3[3] +" ("+distance4+"m) " +": " + currentLocation3[2] +" ("+distance3+"m)  >>> " + currentLocation3[1] +" ("+distance2+"m)  >>> " + currentLocation3[0] + "\nCalculate Distance: " +  + firstRouteSchool + "m\n");
            // System.out.println("Second Route "+ currentLocation3[3] +" ("+distance4+"m) " +": " + currentLocation3[2] + " ("+distance5+"m) " + " >>> " + currentLocation3[4] + " ("+distance6+"m) " + " >>> " + currentLocation3 [0]+ " ("+distance1+") "  +"\nCalculate Distance: " + secondRouteSchool +"m\n");
            
                if(firstRouteSchool < 60 || secondRouteSchool < 60){
                System.out.println("First Route "+ currentLocation3[3] +" ("+distance4+"m) " +": " + currentLocation3[2] +" ("+distance3+"m)  >>> " + currentLocation3[1] +" ("+distance2+"m)  >>> " + currentLocation3[0] + "\nCalculate Distance: " +  + firstRouteSchool + "m\n");
                System.out.println("Time: " +minute+"minutes\n");
                System.out.println("Second Route "+ currentLocation3[3] +" ("+distance4+"m) " +": " + currentLocation3[2] + " ("+distance5+"m) " + " >>> " + currentLocation3[4] + " ("+distance6+"m) " + " >>> " + currentLocation3 [0]+ " ("+distance1+") "  +"\nCalculate Distance: " + secondRouteSchool +"m\n");
                System.out.println("Time: "+ minute2+"minutes\n");
                System.out.println();
                }

                else if(firstRouteSchool > secondRouteSchool || secondRouteSchool > firstRouteSchool){
                System.out.println("First Route "+ currentLocation3[3] +" ("+distance4+"m) " +": " + currentLocation3[2] +" ("+distance3+"m)  >>> " + currentLocation3[1] +" ("+distance2+"m)  >>> " + currentLocation3[0] + "\nCalculate Distance: " +  + firstRouteSchool + "m\n");
                System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                System.out.println("Second Route "+ currentLocation3[3] +" ("+distance4+"m) " +": " + currentLocation3[2] + " ("+distance5+"m) " + " >>> " + currentLocation3[4] + " ("+distance6+"m) " + " >>> " + currentLocation3 [0]+ " ("+distance1+") "  +"\nCalculate Distance: " + secondRouteSchool +"m\n");
                System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                System.out.println();
                }
                    if(firstRouteSchool < secondRouteSchool){
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route "+ currentLocation3[3] +" ("+distance4+"m) " +": " + currentLocation3[2] +" ("+distance3+"m)  >>> " + currentLocation3[1] +" ("+distance2+"m)  >>> " + currentLocation3[0] + "\nCalculate Distance: " +  + firstRouteSchool + "m\n");
                        if(firstRouteSchool < 60){
                            System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                        
                        }
                    }
                
                    else if(secondRouteSchool > firstRouteSchool){
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Second Route "+ currentLocation3[3] +" ("+distance4+"m) " +": " + currentLocation3[2] + " ("+distance5+"m) " + " >>> " + currentLocation3[4] + " ("+distance6+"m) " + " >>> " + currentLocation3 [0]+ " ("+distance1+") "  +"\nCalculate Distance: " + secondRouteSchool +"m\n");
                        if(secondRouteSchool < 60){
                            System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                        }   
                    }
            }

            //Route for Mcdo - Hospital
            else if(menu.equalsIgnoreCase("HOSPITAL")){
            
            int firstRouteHospital = distance4;
            int secondRouteHospital = distance4 + distance5 + distance6 + distance1 + distance2 + distance3; 

            int minute = firstRouteHospital%60;
            int minute2 = secondRouteHospital%60;
            int hours = firstRouteHospital/60;
            int hours2 = secondRouteHospital/60;
            int time[] = {minute, minute2};
            int time2[] = {hours, hours2};

            // System.out.println("First Route " + currentLocation3[3] +" >>> " + ": " + currentLocation3[2] +" ("+distance4+"m) " + " >>> " +"\nCalculate Distance: " +  +firstRouteHospital + "m" + "\nTime: \n");
            // System.out.println("Second Route " + currentLocation3[3] +" ("+distance4+"m) " + ": " + currentLocation3[2] + " ("+distance5+"m) " + " >>> " + currentLocation3[4] + " ("+distance6+"m) " +" >>> " + currentLocation3[0] + " ("+distance1+"m) "+" >>> " + currentLocation3[1] + " ("+distance2+"m) " + currentLocation3[2] + " ("+distance3+"m)" +"\nCalculate Distance: " +  +secondRouteHospital + "m\n");
            
                        
                if(firstRouteHospital < 60 || secondRouteHospital < 60){
                System.out.println("First Route " + currentLocation3[3] +" >>> " + ": " + currentLocation3[2] +" ("+distance4+"m) " + " >>> " +"\nCalculate Distance: " +  +firstRouteHospital + "m" + "\nTime: \n");
                System.out.println("Time: " +minute+"minutes\n");
                System.out.println("Second Route " + currentLocation3[3] +" ("+distance4+"m) " + ": " + currentLocation3[2] + " ("+distance5+"m) " + " >>> " + currentLocation3[4] + " ("+distance6+"m) " +" >>> " + currentLocation3[0] + " ("+distance1+"m) "+" >>> " + currentLocation3[1] + " ("+distance2+"m) " + currentLocation3[2] + " ("+distance3+"m)" +"\nCalculate Distance: " +  +secondRouteHospital + "m\n");
                System.out.println("Time: "+ minute2+"minutes\n");
                System.out.println();
                }

                else if(firstRouteHospital > secondRouteHospital || secondRouteHospital > firstRouteHospital){
                System.out.println("First Route " + currentLocation3[3] +" >>> " + ": " + currentLocation3[2] +" ("+distance4+"m) " + " >>> " +"\nCalculate Distance: " +  +firstRouteHospital + "m" + "\nTime: \n");
                System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                System.out.println("Second Route " + currentLocation3[3] +" ("+distance4+"m) " + ": " + currentLocation3[2] + " ("+distance5+"m) " + " >>> " + currentLocation3[4] + " ("+distance6+"m) " +" >>> " + currentLocation3[0] + " ("+distance1+"m) "+" >>> " + currentLocation3[1] + " ("+distance2+"m) " + currentLocation3[2] + " ("+distance3+"m)" +"\nCalculate Distance: " +  +secondRouteHospital + "m\n");
                System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                System.out.println();
                }
                    if(firstRouteHospital < secondRouteHospital){
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route " + currentLocation3[3] +" >>> " + ": " + currentLocation3[2] +" ("+distance4+"m) " + " >>> " +"\nCalculate Distance: " +  +firstRouteHospital + "m" + "\nTime: \n");
                        if(firstRouteHospital < 60){
                            System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                        
                        }
                    }
                
                    else if(secondRouteHospital > firstRouteHospital){
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Second Route " + currentLocation3[3] +" ("+distance4+"m) " + ": " + currentLocation3[2] + " ("+distance5+"m) " + " >>> " + currentLocation3[4] + " ("+distance6+"m) " +" >>> " + currentLocation3[0] + " ("+distance1+"m) "+" >>> " + currentLocation3[1] + " ("+distance2+"m) " + currentLocation3[2] + " ("+distance3+"m)" +"\nCalculate Distance: " +  +secondRouteHospital + "m\n");
                        if(secondRouteHospital < 60){
                            System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                        }   
                    }
            }

            //Route for Mcdo - Jolibee
            else if(menu.equalsIgnoreCase("JOLIBEE")){
        
            int firstRouteJolibee= distance4 + distance3;
            int secondRouteJolibee = distance4 + distance5 + distance6 + distance1 + distance2;

            int minute = firstRouteJolibee%60;
            int minute2 = secondRouteJolibee%60;
            int hours = firstRouteJolibee/60;
            int hours2 = secondRouteJolibee/60;
            int time[] = {minute, minute2};
            int time2[] = {hours, hours2};

            // System.out.println("First Route " + currentLocation3[3] + " >>> " +": " + currentLocation3[2] +" ("+distance4+"m) " + " >>> " + currentLocation3[1] +" ("+distance3+"m) " +"\nCalculate Distance: " +  +firstRouteJolibee + "m\n");
            // System.out.println("Second Route " + currentLocation3[3] + " ("+distance4+"m) " +": " + currentLocation3[2] + " ("+distance5+"m) " +" >>> " + currentLocation3[4] + " ("+distance6+"m) " +" >>> " + currentLocation3[0] +" ("+distance1+"m) " +" >>> " + currentLocation3[1] + " ("+distance2+"m) " +"\nCalculate Distance: " +  +secondRouteJolibee + "m\n");
            
                if(firstRouteJolibee < 60 || secondRouteJolibee < 60){
                System.out.println("First Route " + currentLocation3[3] + " >>> " +": " + currentLocation3[2] +" ("+distance4+"m) " + " >>> " + currentLocation3[1] +" ("+distance3+"m) " +"\nCalculate Distance: " +  +firstRouteJolibee + "m\n");
                System.out.println("Time: " +minute+"minutes\n");
                System.out.println("Second Route " + currentLocation3[3] + " ("+distance4+"m) " +": " + currentLocation3[2] + " ("+distance5+"m) " +" >>> " + currentLocation3[4] + " ("+distance6+"m) " +" >>> " + currentLocation3[0] +" ("+distance1+"m) " +" >>> " + currentLocation3[1] + " ("+distance2+"m) " +"\nCalculate Distance: " +  +secondRouteJolibee + "m\n");
                System.out.println("Time: "+ minute2+"minutes\n");
                System.out.println();
                }

                else if(firstRouteJolibee > secondRouteJolibee || secondRouteJolibee > firstRouteJolibee){
                System.out.println("First Route " + currentLocation3[3] + " >>> " +": " + currentLocation3[2] +" ("+distance4+"m) " + " >>> " + currentLocation3[1] +" ("+distance3+"m) " +"\nCalculate Distance: " +  +firstRouteJolibee + "m\n");
                System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                System.out.println("Second Route " + currentLocation3[3] + " ("+distance4+"m) " +": " + currentLocation3[2] + " ("+distance5+"m) " +" >>> " + currentLocation3[4] + " ("+distance6+"m) " +" >>> " + currentLocation3[0] +" ("+distance1+"m) " +" >>> " + currentLocation3[1] + " ("+distance2+"m) " +"\nCalculate Distance: " +  +secondRouteJolibee + "m\n");
                System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                System.out.println();
                }
                    if(firstRouteJolibee < secondRouteJolibee){
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route " + currentLocation3[3] + " >>> " +": " + currentLocation3[2] +" ("+distance4+"m) " + " >>> " + currentLocation3[1] +" ("+distance3+"m) " +"\nCalculate Distance: " +  +firstRouteJolibee + "m\n");
                        if(firstRouteJolibee < 60){
                            System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                        
                        }
                    }
                
                    else if(secondRouteJolibee > firstRouteJolibee){
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Second Route " + currentLocation3[3] + " ("+distance4+"m) " +": " + currentLocation3[2] + " ("+distance5+"m) " +" >>> " + currentLocation3[4] + " ("+distance6+"m) " +" >>> " + currentLocation3[0] +" ("+distance1+"m) " +" >>> " + currentLocation3[1] + " ("+distance2+"m) " +"\nCalculate Distance: " +  +secondRouteJolibee + "m\n");
                        if(secondRouteJolibee < 60){
                            System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                        }   
                    }
            }

            //Route for SM
            else if(menu.equalsIgnoreCase("SM")){
            
            int firstRouteSM = distance4 + distance5 + distance6; 
            int secondRouteSM = distance4 + distance3 + distance2 + distance1 + distance6;

            int minute = firstRouteSM%60;
            int minute2 = secondRouteSM%60;
            int hours = firstRouteSM/60;
            int hours2 = secondRouteSM/60;
            int time[] = {minute, minute2};
            int time2[] = {hours, hours2};

            // System.out.println("First Route " + currentLocation3[3] + " ("+distance4+"m) " +": " + currentLocation3[2] +" ("+distance5+"m) " + currentLocation3[4] +" ("+distance6+"m) "+ "\nCalculate Distance: " +  +firstRouteSM + "m" + "\nTime: \n");
            // System.out.println("Second Route " + currentLocation3[3] + " ("+distance4+"m) " +": " + currentLocation3[2] + " ("+distance3+"m) " +" >>> " + currentLocation3[1] +" ("+distance2+"m) " + " >>> " + currentLocation3[0] +" ("+distance1+"m) " + " >>> "+ currentLocation3[4] + " ("+distance6+"m) "+ "\nCalculate Distance: " +  +secondRouteSM + "m" + "\nTime: \n");
            
                if(firstRouteSM < 60 || secondRouteSM < 60){
                System.out.println("First Route " + currentLocation3[3] + " ("+distance4+"m) " +": " + currentLocation3[2] +" ("+distance5+"m) " + currentLocation3[4] +" ("+distance6+"m) "+ "\nCalculate Distance: " +  +firstRouteSM + "m\n");
                System.out.println("Time: " +minute+"minutes\n");
                System.out.println("Second Route " + currentLocation3[3] + " ("+distance4+"m) " +": " + currentLocation3[2] + " ("+distance3+"m) " +" >>> " + currentLocation3[1] +" ("+distance2+"m) " + " >>> " + currentLocation3[0] +" ("+distance1+"m) " + " >>> "+ currentLocation3[4] + " ("+distance6+"m) "+ "\nCalculate Distance: " +  +secondRouteSM + "m\n");
                System.out.println("Time: "+ minute2+"minutes\n");
                System.out.println();
                }

                else if(firstRouteSM > secondRouteSM || secondRouteSM > firstRouteSM){
                System.out.println("First Route " + currentLocation3[3] + " ("+distance4+"m) " +": " + currentLocation3[2] +" ("+distance5+"m) " + currentLocation3[4] +" ("+distance6+"m) "+ "\nCalculate Distance: " +  +firstRouteSM + "m\n");
                System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                System.out.println("Second Route " + currentLocation3[3] + " ("+distance4+"m) " +": " + currentLocation3[2] + " ("+distance3+"m) " +" >>> " + currentLocation3[1] +" ("+distance2+"m) " + " >>> " + currentLocation3[0] +" ("+distance1+"m) " + " >>> "+ currentLocation3[4] + " ("+distance6+"m) "+ "\nCalculate Distance: " +  +secondRouteSM + "m\n");
                System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                System.out.println();
                }
                    if(firstRouteSM < secondRouteSM){
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route " + currentLocation3[3] + " ("+distance4+"m) " +": " + currentLocation3[2] +" ("+distance5+"m) " + currentLocation3[4] +" ("+distance6+"m) "+ "\nCalculate Distance: " +  +firstRouteSM + "m\n");
                        if(firstRouteSM < 60){
                            System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                        
                        }
                    }
                
                    else if(secondRouteSM > firstRouteSM){
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Second Route " + currentLocation3[3] + " ("+distance4+"m) " +": " + currentLocation3[2] + " ("+distance3+"m) " +" >>> " + currentLocation3[1] +" ("+distance2+"m) " + " >>> " + currentLocation3[0] +" ("+distance1+"m) " + " >>> "+ currentLocation3[4] + " ("+distance6+"m) "+ "\nCalculate Distance: " +  +secondRouteSM + "m\n");
                        if(secondRouteSM < 60){
                            System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                        }   
                    }
            }

            else{
                System.out.println("Invalid Type");
            }
        break;
           
            //DISPLAY ALL POSIBLE ROUTE IN SM
        case "SM": 
            String currentLocation4[] = {places[0], places[1],places[2], places[3], places[4]}; 

            System.out.println("\nPossible Route: " + "\n");
            
            if(menu.equalsIgnoreCase("SCHOOL")){
            //Route for Sm - School
            int firstRouteSchool = distance6 + distance1;
            int secondRouteSchool = distance6 + distance5 +  distance3+ distance2;

            int minute = firstRouteSchool%60;
            int minute2 = secondRouteSchool%60;
            int hours = firstRouteSchool/60;
            int hours2 = secondRouteSchool/60;
            int time[] = {minute, minute2};
            int time2[] = {hours, hours2};

            // System.out.println("First Route "+ currentLocation4[4] +" ("+distance6+"m) " +": " + currentLocation4[0] +" ("+distance1+"m) " + "\nCalculate Distance: " +  +firstRouteSchool + "m\n");
            // System.out.println("Second Route "+ currentLocation4[4] +" ("+distance6+"m) " +": " + currentLocation4[3] + " ("+distance5+"m) " + " >>> " + currentLocation4[2] + " ("+distance3+"m) " + " >>> " + currentLocation4 [1]+ " ("+distance2+") "  +"\nCalculate Distance: " + secondRouteSchool +"m\n");
            
                if(firstRouteSchool < 60 || secondRouteSchool < 60){
                    System.out.println("First Route "+ currentLocation4[4] +" ("+distance6+"m) " +": " + currentLocation4[0] +" ("+distance1+"m) " + "\nCalculate Distance: " +  +firstRouteSchool + "m\n");
                    System.out.println("Time: " +minute+"minutes\n");
                    System.out.println("Second Route "+ currentLocation4[4] +" ("+distance6+"m) " +": " + currentLocation4[3] + " ("+distance5+"m) " + " >>> " + currentLocation4[2] + " ("+distance3+"m) " + " >>> " + currentLocation4 [1]+ " ("+distance2+") "  +"\nCalculate Distance: " + secondRouteSchool +"m\n");
                    System.out.println("Time: "+ minute2+"minutes\n");
                    System.out.println();
                    }

                else if(firstRouteSchool > secondRouteSchool || secondRouteSchool > firstRouteSchool){
                    System.out.println("First Route "+ currentLocation4[4] +" ("+distance6+"m) " +": " + currentLocation4[0] +" ("+distance1+"m) " + "\nCalculate Distance: " +  +firstRouteSchool + "m\n");
                    System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                    System.out.println("Second Route "+ currentLocation4[4] +" ("+distance6+"m) " +": " + currentLocation4[3] + " ("+distance5+"m) " + " >>> " + currentLocation4[2] + " ("+distance3+"m) " + " >>> " + currentLocation4 [1]+ " ("+distance2+") "  +"\nCalculate Distance: " + secondRouteSchool +"m\n");
                    System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                    System.out.println();
                    }
                    if(firstRouteSchool < secondRouteSchool){
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route "+ currentLocation4[4] +" ("+distance6+"m) " +": " + currentLocation4[0] +" ("+distance1+"m) " + "\nCalculate Distance: " +  +firstRouteSchool + "m\n");
                        if(firstRouteSchool < 60){
                            System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                        
                        }
                    }
                
                    else if(secondRouteSchool > firstRouteSchool){
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Second Route "+ currentLocation4[4] +" ("+distance6+"m) " +": " + currentLocation4[3] + " ("+distance5+"m) " + " >>> " + currentLocation4[2] + " ("+distance3+"m) " + " >>> " + currentLocation4 [1]+ " ("+distance2+") "  +"\nCalculate Distance: " + secondRouteSchool +"m\n");
                        if(secondRouteSchool < 60){
                            System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                        }   
                    }

            }

            //Route for Sm - Hospital
            else if(menu.equalsIgnoreCase("HOSPITAL")){
            
            int firstRouteHospital = distance6  + distance5;
            int secondRouteHospital = distance1 + distance2 + distance3;

            int minute = firstRouteHospital%60;
            int minute2 = secondRouteHospital%60;
            int hours = firstRouteHospital/60;
            int hours2 = secondRouteHospital/60;
            int time[] = {minute, minute2};
            int time2[] = {hours, hours2};

            // System.out.println("First Route " + currentLocation4[4] +" ("+distance6+"m) " + ": " + currentLocation4[2] +" ("+distance5+"m)"  +"\nCalculate Distance: " +  +firstRouteHospital + "m\n");
            // System.out.println("Second Route " + currentLocation4[4] +" >>> " + ": " + currentLocation4[0] + " ("+distance1+"m) " + " >>> " + currentLocation4[1] + " ("+distance2+"m) " +" >>> " + currentLocation4[2]+ " ("+distance3+"m) " + "\nCalculate Distance: " +  +secondRouteHospital + "m\n");
            
                if(firstRouteHospital < 60 || secondRouteHospital < 60){
                    System.out.println("First Route " + currentLocation4[4] +" ("+distance6+"m) " + ": " + currentLocation4[2] +" ("+distance5+"m)"  +"\nCalculate Distance: " +  +firstRouteHospital + "m\n");
                    System.out.println("Time: " +minute+"minutes\n");
                    System.out.println("Second Route " + currentLocation4[4] +" >>> " + ": " + currentLocation4[0] + " ("+distance1+"m) " + " >>> " + currentLocation4[1] + " ("+distance2+"m) " +" >>> " + currentLocation4[2]+ " ("+distance3+"m) " + "\nCalculate Distance: " +  +secondRouteHospital + "m\n");
                    System.out.println("Time: "+ minute2+"minutes\n");
                    System.out.println();

                }

                else if(firstRouteHospital > secondRouteHospital || secondRouteHospital > firstRouteHospital){
                    System.out.println("First Route " + currentLocation4[4] +" ("+distance6+"m) " + ": " + currentLocation4[2] +" ("+distance5+"m)"  +"\nCalculate Distance: " +  +firstRouteHospital + "m\n");
                    System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                    System.out.println("Second Route " + currentLocation4[4] +" >>> " + ": " + currentLocation4[0] + " ("+distance1+"m) " + " >>> " + currentLocation4[1] + " ("+distance2+"m) " +" >>> " + currentLocation4[2]+ " ("+distance3+"m) " + "\nCalculate Distance: " +  +secondRouteHospital + "m\n");
                    System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                    System.out.println();
                }
                    if(firstRouteHospital < secondRouteHospital){
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route " + currentLocation4[4] +" ("+distance6+"m) " + ": " + currentLocation4[2] +" ("+distance5+"m)"  +"\nCalculate Distance: " +  +firstRouteHospital + "m\n");
                        if(firstRouteHospital < 60){
                            System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                        
                        }
                    }
                
                    else if(secondRouteHospital > firstRouteHospital){
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Second Route " + currentLocation4[4] +" >>> " + ": " + currentLocation4[0] + " ("+distance1+"m) " + " >>> " + currentLocation4[1] + " ("+distance2+"m) " +" >>> " + currentLocation4[2]+ " ("+distance3+"m) " + "\nCalculate Distance: " +  +secondRouteHospital + "m\n");
                        if(secondRouteHospital < 60){
                            System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                        }   
                    }
            }

            //Route for Sm - Mcdo
            else if(menu.equalsIgnoreCase("MCDO")){
        
            int firstRouteMcdo =  distance5 + distance4;
            int secondRouteMcdo = distance6 + distance1 + distance2 +distance3 + distance4;

            int minute = firstRouteMcdo%60;
            int minute2 = secondRouteMcdo%60;
            int hours = firstRouteMcdo/60;
            int hours2 = secondRouteMcdo/60;
            int time[] = {minute, minute2};
            int time2[] = {hours, hours2};

            // System.out.println("First Route " + currentLocation4[4] + " >>> " +": " + currentLocation4[2] +" ("+distance5+"m) " + " >>> " + currentLocation4[3] +" ("+distance4+"m)" +"\nCalculate Distance: " +  +firstRouteMcdo + "m\n");
            // System.out.println("Second Route " + currentLocation4[4] + " ("+distance6+"m) " +": " + currentLocation4[0] + " ("+distance1+"m) " +" >>> " + currentLocation4[1] + " ("+distance2+"m) " +" >>> " + currentLocation4[2] +" ("+distance3+"m) " +" >>> " + currentLocation4[3] +" ("+distance4+"m)" + "\nCalculate Distance: " +  +secondRouteMcdo + "m\n");
            
                if(firstRouteMcdo < 60 || secondRouteMcdo < 60){
                    System.out.println("First Route " + currentLocation4[4] + " >>> " +": " + currentLocation4[2] +" ("+distance5+"m) " + " >>> " + currentLocation4[3] +" ("+distance4+"m)" +"\nCalculate Distance: " +  +firstRouteMcdo + "m\n");
                    System.out.println("Time: " +minute+"minutes\n");
                    System.out.println("Second Route " + currentLocation4[4] + " ("+distance6+"m) " +": " + currentLocation4[0] + " ("+distance1+"m) " +" >>> " + currentLocation4[1] + " ("+distance2+"m) " +" >>> " + currentLocation4[2] +" ("+distance3+"m) " +" >>> " + currentLocation4[3] +" ("+distance4+"m)" + "\nCalculate Distance: " +  +secondRouteMcdo + "m\n");
                    System.out.println("Time: "+ minute2+"minutes\n");
                    System.out.println();
                    }

                else if(firstRouteMcdo > secondRouteMcdo || secondRouteMcdo > firstRouteMcdo){
                    System.out.println("First Route " + currentLocation4[4] + " >>> " +": " + currentLocation4[2] +" ("+distance5+"m) " + " >>> " + currentLocation4[3] +" ("+distance4+"m)" +"\nCalculate Distance: " +  +firstRouteMcdo + "m\n");
                    System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                    System.out.println("Second Route " + currentLocation4[4] + " ("+distance6+"m) " +": " + currentLocation4[0] + " ("+distance1+"m) " +" >>> " + currentLocation4[1] + " ("+distance2+"m) " +" >>> " + currentLocation4[2] +" ("+distance3+"m) " +" >>> " + currentLocation4[3] +" ("+distance4+"m)" + "\nCalculate Distance: " +  +secondRouteMcdo + "m\n");
                    System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                    System.out.println();
                }
                        if(firstRouteMcdo < secondRouteMcdo){
                            System.out.println("\nRECOMMENDED!\n");
                            System.out.println("First Route " + currentLocation4[4] + " >>> " +": " + currentLocation4[2] +" ("+distance5+"m) " + " >>> " + currentLocation4[3] +" ("+distance4+"m)" +"\nCalculate Distance: " +  +firstRouteMcdo + "m\n");
                            if(firstRouteMcdo < 60){
                                System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                            
                            }
                        }
                    
                        else if(secondRouteMcdo > firstRouteMcdo){
                            System.out.println("RECOMMENDED!\n");
                            System.out.println("Second Route " + currentLocation4[4] + " ("+distance6+"m) " +": " + currentLocation4[0] + " ("+distance1+"m) " +" >>> " + currentLocation4[1] + " ("+distance2+"m) " +" >>> " + currentLocation4[2] +" ("+distance3+"m) " +" >>> " + currentLocation4[3] +" ("+distance4+"m)" + "\nCalculate Distance: " +  +secondRouteMcdo + "m\n");
                            if(secondRouteMcdo < 60){
                                System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                            }
                            else{
                                System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                            }   
                        }
            }

            //Route for Sm - Jolibee
            else if(menu.equalsIgnoreCase("jJOLIBEE")){
            
            int firstRouteJolibee =  distance1 + distance2; 
            int secondRouteJolibee = distance6 + distance5 + distance3 ;

            int minute = firstRouteJolibee%60;
            int minute2 = secondRouteJolibee%60;
            int hours = firstRouteJolibee/60;
            int hours2 = secondRouteJolibee/60;
            int time[] = {minute, minute2};
            int time2[] = {hours, hours2};

            System.out.println("First Route " + currentLocation4[4] + " >>> " +": " + currentLocation4[0] +" ("+distance1+"m) >>> " + currentLocation4[0] +" ("+distance2+"m)"+"\nCalculate Distance: " +  +firstRouteJolibee + "m\n");
            System.out.println("Second Route " + currentLocation4[4] + " ("+distance6+"m) " +": " + currentLocation4[2] + " ("+distance5+"m) " +" >>> " + currentLocation4[1] +" ("+distance3+"m) " + "\nCalculate Distance: " +  +secondRouteJolibee + "m\n");
            
            if(firstRouteJolibee < 60 || secondRouteJolibee < 60){
                System.out.println("First Route " + currentLocation4[4] + " >>> " +": " + currentLocation4[0] +" ("+distance1+"m) >>> " + currentLocation4[0] +" ("+distance2+"m)"+"\nCalculate Distance: " +  +firstRouteJolibee + "m\n");
                System.out.println("Time: " +minute+"minutes\n");
                System.out.println("Second Route " + currentLocation4[4] + " ("+distance6+"m) " +": " + currentLocation4[2] + " ("+distance5+"m) " +" >>> " + currentLocation4[1] +" ("+distance3+"m) " + "\nCalculate Distance: " +  +secondRouteJolibee + "m\n");
                System.out.println("Time: "+ minute2+"minutes\n");
                System.out.println();
                }

                else if(firstRouteJolibee > secondRouteJolibee || secondRouteJolibee > firstRouteJolibee){
                    System.out.println("First Route " + currentLocation4[4] + " >>> " +": " + currentLocation4[0] +" ("+distance1+"m) >>> " + currentLocation4[0] +" ("+distance2+"m)"+"\nCalculate Distance: " +  +firstRouteJolibee + "m\n");
                    System.out.println("Time: "+hours +" hours and "+minute+"minutes\n");
                    System.out.println("Second Route " + currentLocation4[4] + " ("+distance6+"m) " +": " + currentLocation4[2] + " ("+distance5+"m) " +" >>> " + currentLocation4[1] +" ("+distance3+"m) " + "\nCalculate Distance: " +  +secondRouteJolibee + "m\n");
                    System.out.println("Time: "+hours2 +" hours and "+ minute2+"minutes\n");
                    System.out.println();
                }
                    if(firstRouteJolibee < secondRouteJolibee){
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route " + currentLocation4[4] + " >>> " +": " + currentLocation4[0] +" ("+distance1+"m) >>> " + currentLocation4[0] +" ("+distance2+"m)"+"\nCalculate Distance: " +  +firstRouteJolibee + "m\n");
                        if(firstRouteJolibee < 60){
                            System.out.printf("\nThis is quickest option: " +minute+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: " +hours +" hours and "+minute+" minutes\n");
                        
                        }
                    }
                
                    else if(secondRouteJolibee > firstRouteJolibee){
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Second Route " + currentLocation4[4] + " ("+distance6+"m) " +": " + currentLocation4[2] + " ("+distance5+"m) " +" >>> " + currentLocation4[1] +" ("+distance3+"m) " + "\nCalculate Distance: " +  +secondRouteJolibee + "m\n");
                        if(secondRouteJolibee < 60){
                            System.out.printf("\nThis is quickest option: " +minute2+" minutes\n");
                        }
                        else{
                            System.out.printf("\nThis is quickest option: "+hours2 +" and "+minute2+" minutes\n");
                        }   
                    }
            }

            else{
                System.out.println("Invalid Type");
            }

            break;
        default:
            break;

           
            //ERROR HANDLER CALL
        
            // System.out.println("Invalid Choice");
        }       
    }

  
        
        // }catch(Exception e){
        // System.out.printf("\n%s is not valid word. please input Integer ",empty);

        // System.out.println();
        // }

    //  }while(true);    




}

