public class MapFunctionality {
    // DISPLAY ALL ROUTE
    public static void userDestination(String menu, String thecurrentLocation, String places[], int distance1,
            int distance2, int distance3, int distance4, int distance5, int distance6, int distance7, int distance8) {

        switch (thecurrentLocation) {
            
            // DISPLAY POSSIBLE ROUTE IN CURRENT LOCATION SCHOOL TO ALL
            case "SCHOOL":
                String currentLocation[] = { places[0], places[1], places[2], places[3], places[4], places[5] };

                System.out.println("\nPossible Route:" + "\n");

                // Route for School - Jollibee
                if (menu.equalsIgnoreCase("JOLLIBEE")) {

                    // function for distance
                    int firstRouteJollibee = distance2;
                    int secondRouteJollibee = distance1 + distance6 + distance5 + distance3;
                    int thirdRouteJollibee = distance1 + distance6 + distance7 + distance8 + distance4 + distance3; 

                    // function for time
                    int minute = firstRouteJollibee % 60;
                    int minute2 = secondRouteJollibee % 60;
                    int minute3 = thirdRouteJollibee % 60;
                    int hours = firstRouteJollibee / 60;
                    int hours2 = secondRouteJollibee / 60;
                    int hours3 = thirdRouteJollibee / 60;

                    System.out.println("First Route " + currentLocation[0] + " >>> " + ": " + currentLocation[1]  + " (" + distance2 + "m) " + "\nCalculated Distance: " + +firstRouteJollibee + "m");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation[0] + " (" + distance1 + "m) " + ": "  + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[2] + " ("   + distance5 + "m) " + " >>> " + currentLocation[1] + " (" + distance2 + "m) " + "\nCalculated Distance: " + secondRouteJollibee + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println("Third Route " + currentLocation[0] + " (" + distance1 + "m) " + ": "  + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[5] + " ("   + distance7 + "m) " + " >>> " + currentLocation[3] + " (" + distance8 + "m) "  + currentLocation[2] + " (" + distance4 + "m) "+ currentLocation[1] + " (" + distance3 + "m) " + "\nCalculated Distance: " + secondRouteJollibee + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                    System.out.println();
                    if (firstRouteJollibee <= secondRouteJollibee && firstRouteJollibee <= thirdRouteJollibee) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route: " + currentLocation[0] + " >>> " + ": " + currentLocation[1] + " (" + distance2 + "m) " + "\nCalculated Distance: "   + +firstRouteJollibee + "m");
                        if (firstRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf("\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    } else if (secondRouteJollibee <= firstRouteJollibee && secondRouteJollibee <= thirdRouteJollibee) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route: " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance5 + "m) " + " >>> " + currentLocation[2] + " (" + distance4 + "m) " + " >>> " + currentLocation[1] + " (" + distance2 + "m) "  + "\nCalculated Distance: " + secondRouteJollibee + "m\n");
                        if (secondRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out.printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }

                    }

                    else {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation[0] + " (" + distance1 + "m) " + ": "  + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[5] + " ("   + distance7 + "m) " + " >>> " + currentLocation[3] + " (" + distance8 + "m) "  + currentLocation[2] + " (" + distance4 + "m) "+ currentLocation[1] + " (" + distance3 + "m) " + "\nCalculated Distance: " + thirdRouteJollibee + "m\n");
                        if(thirdRouteJollibee < 60){
                            System.out.println("This is the quickest option: " + minute3 + " minute/s\n");
                        }else{
                            System.out.println("This is the quickest option: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                        }
                    }
                }

                // Route for School - Hospital
                else if (menu.equalsIgnoreCase("HOSPITAL")) {

                    int firstRouteHospital = distance2 + distance3;
                    int secondRouteHospital = distance1 + distance6 + distance5;
                    int thirdRouteHospital = distance1 + distance6 + distance7 + distance8 + distance4;

                    int minute = firstRouteHospital % 60;
                    int minute2 = secondRouteHospital % 60;
                    int minute3 = thirdRouteHospital % 60;
                    int hours = firstRouteHospital / 60;
                    int hours2 = secondRouteHospital / 60;
                    int hours3 = thirdRouteHospital / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation[0] + " >>> " + ": " + currentLocation[1]+ " (" + distance2 + "m) " + " >>> " + currentLocation[2] + " (" + distance3 + "m) " + "\nCalculated Distance: " + +firstRouteHospital + "m\n");
                    System.out.println("Time: " + hours + "hour/s and " +   minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[2] + " ("+ distance5 + "m) " + "\nCalculated Distance: " + +secondRouteHospital + "m\n");
                    System.out.println("Time: " + hours2 + "hour/s and " + + minute2 + " minute/s\n");
                    System.out.println("Third Route " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[5] + " ("+ distance7 + "m) " + " >>> " + currentLocation[3] + " ("+ distance8 + "m) "  + " >>> " + currentLocation[2] +"\nCalculated Distance: " + +thirdRouteHospital + "m\n");
                    System.out.println("Time: " + hours3 + "hour/s and " + + minute3 + " minute/s\n");
                    System.out.println();

                    if (firstRouteHospital < secondRouteHospital && firstRouteHospital <= thirdRouteHospital) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation[0] + " >>> " + ": " + currentLocation[1]
                                + " (" + distance2 + "m) " + " >>> " + currentLocation[2] + " (" + distance3 + "m) "
                                + "\nCalculated Distance: " + +firstRouteHospital + "m\n");
                        if (firstRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }
                     else if (secondRouteHospital <= firstRouteHospital && secondRouteHospital <= thirdRouteHospital) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route: " + currentLocation[0] + " (" + distance1 + "m) "  + ": " + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[2]  + " (" + distance5 + "m) " + " >>> " + "\nCalculated Distance: " + secondRouteHospital + "m\n");
                        if (secondRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out.printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                    else {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Third Route " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[5] + " ("+ distance7 + "m) " + " >>> " + currentLocation[3] + " ("+ distance8 + "m) "  + " >>> " + currentLocation[2] +"\nCalculated Distance: " + +thirdRouteHospital + "m\n");
                         if (secondRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3 + "  minute/s\n");
                        } else {
                            System.out.printf("\nThis is the quickest option: " + hours3 + " and " + minute3 + "  minute/s\n");
                        }
                    }
                }

                // Route for School- Mcdo
                else if (menu.equalsIgnoreCase("MCDO")) {

                    int firstRouteMcdo = distance2 + distance3 + distance4;
                    int secondRouteMcdo = distance1 + distance6 + distance5 + distance4;
                    int thirdRouteMcdo = distance1 + distance6 + distance7 + distance8;

                    int minute = firstRouteMcdo % 60;
                    int minute2 = secondRouteMcdo % 60;
                    int minute3 = thirdRouteMcdo % 60;
                    int hours = firstRouteMcdo / 60;
                    int hours2 = secondRouteMcdo / 60;
                    int hours3 = thirdRouteMcdo / 60;

                    System.out.println("First Route " + currentLocation[0] + " >>> " + ": " + currentLocation[1] + " (" + distance2 + "m) " + " >>> " + currentLocation[2] + " (" + distance3 + "m) " + " >>> " + currentLocation[3] + " (" + distance4 + "m) " + "\nCalculated Distance: "+firstRouteMcdo + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[2] + " (" + distance5 + "m) " + " >>> " + currentLocation[3] + " (" + distance4 + "m) " + "\nCalculated Distance: " + +secondRouteMcdo + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println("Third Route " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[5] + " (" + distance7 + "m) " + " >>> " + currentLocation[3] + " (" + distance8 + "m) " + "\nCalculated Distance: " + +thirdRouteMcdo + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                        
                    if (firstRouteMcdo <= secondRouteMcdo && firstRouteMcdo <= thirdRouteMcdo) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation[0] + " >>>  "+": " + currentLocation[1] + " (" + distance2 + "m) " + " >>> " + currentLocation[2] + " ("  + distance3 + "m) " + " >>> " + currentLocation[3] + " (" + distance4 + "m) " + "\nCalculated Distance: " + +firstRouteMcdo + "m\n");
                        if (firstRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out .printf("\nThis is the quickest option: " + hours + " and " + minute + "  minute/s\n");
                        }
                    }
                     else if (secondRouteMcdo <= firstRouteMcdo && secondRouteMcdo <= thirdRouteMcdo) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation[0] + " (" + distance1 + "m) " + ": "  + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[2] + " (" + distance5 + "m) " + " >>> " + currentLocation[3] + " (" + distance4 + "m) " + "\nCalculated Distance: " + secondRouteMcdo + "m\n");
                        if (secondRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out.printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }

                    else {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Third Route " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[5] + " (" + distance7 + "m) " + " >>> " + currentLocation[3] + " (" + distance8 + "m) " + "\nCalculated Distance: " + +thirdRouteMcdo + "m\n");
                        if (thirdRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3 + "  minute/s\n");
                        } else {
                            System.out.println("this is the quickes option: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                        }
                    }
            }
                    
                // Route for School - SM
                else if (menu.equalsIgnoreCase("SM")) {

                    int firstRouteSM = distance1 + distance6;
                    int secondRouteSM = distance2 + distance3 + distance5 + distance6;
                    int thirdRouteSM = distance2 + distance3 + distance4 + distance8 + distance7 + distance6;

                    int minute = firstRouteSM % 60;
                    int minute2 = secondRouteSM % 60;
                    int minute3 = thirdRouteSM % 60;
                    int hours = firstRouteSM / 60;
                    int hours2 = secondRouteSM / 60;
                    int hours3 = thirdRouteSM / 60;

                    System.out.println("First Route " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) " + "\nCalculated Distance: "+ +firstRouteSM + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation[0] + " >>> " + ": " + currentLocation[1]+ " (" + distance2 + "m) " + " >>> " + currentLocation[2] + " (" + distance3 + "m) "+ " >>> " + currentLocation[3] + " (" + distance5 + "m), (" + distance6 + "m) " + "\nCalculated Distance: " + +secondRouteSM + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println("Third  Route " + currentLocation[0] + " >>> " + ": " + currentLocation[1]+ " (" + distance2 + "m) " + " >>> " + currentLocation[2] + " (" + distance3 + "m) "+ " >>> " + currentLocation[3] + " (" + distance4 + "m) " + " >>> " + currentLocation[5] + " (" + distance8 + "m)" + " >>> " + currentLocation[6] + " (" + distance7 + "m)" + " (" + distance6 + "m)" +"\nCalculated Distance: " + +thirdRouteSM + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                    

                    System.out.println();


                    if (firstRouteSM <= secondRouteSM && firstRouteSM <= thirdRouteSM) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) " + "\nCalculated Distance: "+ +firstRouteSM + "m\n");
                        if (firstRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }


                    else if(secondRouteSM <= firstRouteSM && secondRouteSM <= thirdRouteSM){
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Second Route " + currentLocation[0] + " >>> " + ": " + currentLocation[1]+ " (" + distance2 + "m) " + " >>> " + currentLocation[2] + " (" + distance3 + "m) "+ " >>> " + currentLocation[3] + " (" + distance5 + "m), (" + distance6 + "m) " + "\nCalculated Distance: " + +secondRouteSM + "m\n");
                        if (secondRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }

                    else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Third  Route " + currentLocation[0] + " >>> " + ": " + currentLocation[1]+ " (" + distance2 + "m) " + " >>> " + currentLocation[2] + " (" + distance3 + "m) "+ " >>> " + currentLocation[3] + " (" + distance4 + "m) " + " >>> " + currentLocation[5] + " (" + distance8 + "m)" + " >>> " + currentLocation[4] + " (" + distance7 + "m)" + " (" + distance6 + "m)" +"\nCalculated Distance: " + +thirdRouteSM + "m\n");
                        if (secondRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                }
                
                //School - Apartment

                else if (menu.equalsIgnoreCase("APARTMENT")) {

                    int firstRouteApartment = distance1 + distance6 + distance7;
                    int secondRouteApartment = distance2 + distance3 + distance5 + distance7;
                    int thirdRouteApartment = distance2 + distance3 + distance4 +distance8;

                    int minute = firstRouteApartment % 60;
                    int minute2 = secondRouteApartment % 60;
                    int minute3 =  thirdRouteApartment % 60;

                    int hours = firstRouteApartment / 60;
                    int hours2 = secondRouteApartment / 60;
                    int hours3 = thirdRouteApartment /60;


                    System.out.println("First Route " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) >>> " + currentLocation[5] + " (" + distance7 + "m) " +"\nCalculated Distance: "+ +firstRouteApartment + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation[0] + " (" + distance2 + "m) " + ": " + currentLocation[1]+ " (" + distance3 + "m) " + " >>> " + currentLocation[2] + " (" + distance5 + "m) "+ " >>> " + currentLocation[5] + " (" + distance7 + "m), (" + distance6 + "m) " + "\nCalculated Distance: " + +secondRouteApartment + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println("Third Route " + currentLocation[0] + " (" + distance2 + "m) " + ": " + currentLocation[1]+ " (" + distance3 + "m) " + " >>> " + currentLocation[3] + " (" + distance4 + "m) "+ " >>> " + currentLocation[5] + " (" + distance8 + "m), (" + distance6 + "m) " + "\nCalculated Distance: " + +thirdRouteApartment + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                    System.out.println();

                    if (firstRouteApartment <= secondRouteApartment &&  firstRouteApartment <= thirdRouteApartment) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route: " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) >>> " + currentLocation[5] + " (" + distance7 + "m) " +"\nCalculated Distance: "+ +firstRouteApartment + "m\n");
                        if (firstRouteApartment < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }

                    else if (secondRouteApartment <= firstRouteApartment && secondRouteApartment <= thirdRouteApartment) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route: " + currentLocation[0] + " (" + distance2 + "m) " + ": " + currentLocation[1]+ " (" + distance3 + "m) " + " >>> " + currentLocation[3] + " (" + distance4 + "m) "+ " >>> " + currentLocation[5] + " (" + distance8 + "m), (" + distance6 + "m) " + "\nCalculated Distance: " + +secondRouteApartment + "m\n");
                        if (secondRouteApartment < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }

                    else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route: " + currentLocation[0] + " (" + distance2 + "m) " + ": " + currentLocation[1]+ " (" + distance3 + "m) " + " >>> " + currentLocation[3] + " (" + distance4 + "m) "+ " >>> " + currentLocation[5] + " (" + distance8 + "m), (" + distance6 + "m) " + "\nCalculated Distance: " + +thirdRouteApartment + "m\n");
                        if (thirdRouteApartment < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours3 + " and " + minute3 + "  minute/s\n");
                        }
                    }
                }
                
                break;

            // DISPLAY POSSIBLE ROUTE IN CURRENT LOCATION Jollibee TO ALL
            case "JOLLIBEE":

                String currentLocation1[] = { places[0], places[1], places[2], places[3], places[4], places[5] };

                System.out.println("\nPossible Route: " + "\n");

                // Route for Jollibee - School
                if (menu.equalsIgnoreCase("SCHOOL")) {

                    int firstRouteSchool = distance2;
                    int secondRouteSchool = distance3 + distance5 + distance6 + distance1;
                    int thirdRouteSchool = distance3 + distance4 + distance8 + distance7 + distance6 + distance1;

                    int minute = firstRouteSchool % 60;
                    int minute2 = secondRouteSchool % 60;
                    int minute3 = thirdRouteSchool % 60;

                    int hours = firstRouteSchool / 60;
                    int hours2 = secondRouteSchool / 60;
                    int hours3 = thirdRouteSchool / 60;


                    System.out.println("First Route " + currentLocation1[1] + ": " + currentLocation1[0] + " (" + distance2 + "m) " + "\nCalculated Distance: " + +firstRouteSchool + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation1[1] + " (" + distance3 + "m) " + ": " + currentLocation1[2] + " (" + distance5 + "m) " + " >>> " + currentLocation1[4] + " ("+ distance6 + "m)" + " >>> " + currentLocation1[0] + " (" + distance1 + ") " + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println("Third Route " + currentLocation1[1] + " (" + distance3 + "m) " + ": " + currentLocation1[2] + " (" + distance4 + "m) " + " >>> " + currentLocation1[3] + " ("+ distance8 + "m)" + " >>> " + currentLocation1[5] + " (" + distance7 + ") " + " >>> " + currentLocation1[4] + " ("+ distance6 + "m)" + " >>> " + currentLocation1[0] + " (" + distance1 + ") " + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                    System.out.println();



                    if (firstRouteSchool <= secondRouteSchool && firstRouteSchool <= thirdRouteSchool) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + ": " + currentLocation1[0] + " (" + distance2 + "m) " + "\nCalculated Distance: " + +firstRouteSchool + "m\n");

                        if (firstRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }



                    else if (secondRouteSchool <= firstRouteSchool && secondRouteSchool <= thirdRouteSchool) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + " (" + distance3 + "m) " + ": " + currentLocation1[2] + " (" + distance5 + "m) " + " >>> " + currentLocation1[4] + " (" + distance6 + "m) " + ">>> " + currentLocation1[0] + " (" + distance1 + ") " + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                        if (secondRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " hour/s and " + minute2 + "  minute/s\n");
                        }
                    }

                    else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Third Route " + currentLocation1[1] + " (" + distance3 + "m) " + ": " + currentLocation1[2] + " (" + distance4 + "m) " + " >>> " + currentLocation1[3] + " ("+ distance8 + "m)" + " >>> " + currentLocation1[5] + " (" + distance7 + ") " + " >>> " + currentLocation1[4] + " ("+ distance6 + "m)" + " >>> " + currentLocation1[0] + " (" + distance1 + ") " + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                        if (secondRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours3 + " and " + minute3 + "  minute/s\n");
                        }
                    }
                }


                // Route for Jollibee - Hospital
                else if (menu.equalsIgnoreCase("HOSPITAL")) {

                    int firstRouteHospital = distance3;
                    int secondRouteHospital = distance2 + distance1 + distance6 + distance5;
                    int thirdRouteHospital = distance2 + distance1 + distance6 + distance7 + distance8 +distance4;

                    int minute = firstRouteHospital % 60;
                    int minute2 = secondRouteHospital % 60;
                    int minute3 = thirdRouteHospital % 60;

                    int hours = firstRouteHospital / 60;
                    int hours2 = secondRouteHospital / 60;
                    int hours3 = thirdRouteHospital / 60;


                    System.out.println("First Route " + currentLocation1[1] + " >>> " + ": " + currentLocation1[2]  + " (" + distance3 + "m) " + "\nCalculated Distance: " + +firstRouteHospital + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation1[1] + " (" + distance2 + "m) " + ": " + currentLocation1[0] + " (" + distance1 + "m) " + " >>> " + currentLocation1[4] + " (" + distance6 + "m) " + " >>> " + currentLocation1[2] + " (" + distance5 + "m) " + "\nCalculated Distance: "  +secondRouteHospital + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println("Third Route " + currentLocation1[1] + " (" + distance2 + "m) " + ": " + currentLocation1[0] + " (" + distance1 + "m) " + " >>> " + currentLocation1[4] + " (" + distance6 + "m) " + " >>> " + currentLocation1[2] + " (" + distance7 + "m) " + currentLocation1[4] + " (" + distance8 + "m) " + " >>> " + currentLocation1[2] + " (" + distance4 + "m) " + "\nCalculated Distance: "  +thirdRouteHospital + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                    System.out.println();
                    

                    if (firstRouteHospital <= secondRouteHospital && firstRouteHospital <= thirdRouteHospital) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + " >>> " + ": " + currentLocation1[2]
                                + " (" + distance3 + "m) " + "\nCalculated Distance: " + +firstRouteHospital + "m\n");

                        if (firstRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }  else if (secondRouteHospital <= firstRouteHospital && thirdRouteHospital <= secondRouteHospital) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + " (" + distance2 + "m) " + ": "
                                + currentLocation1[0] + " (" + distance1 + "m) " + " >>> " + currentLocation1[4] + " ("
                                + distance6 + "m) " + " >>> " + currentLocation1[2] + " (" + distance5 + "m) "
                                + "\nCalculated Distance: " + +secondRouteHospital + "m\n");
                        if (secondRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                    else{
                        System.out.println("You may take this route: " + currentLocation1[1] + " (" + distance2 + "m) " + ": " + currentLocation1[0] + " (" + distance1 + "m) " + " >>> " + currentLocation1[4] + " (" + distance6 + "m) " + " >>> " + currentLocation1[2] + " (" + distance7 + "m) " + currentLocation1[4] + " (" + distance8 + "m) " + " >>> " + currentLocation1[2] + " (" + distance4 + "m) " + "\nCalculated Distance: "  +thirdRouteHospital + "m\n");
                        if (secondRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours3 + " and " + minute3 + "  minute/s\n");
                        }
                    }

                }

                // Route for Jollibee - Mcdo
                else if (menu.equalsIgnoreCase("MCDO")) {

                    int firstRouteMcdo = distance3 + distance4;
                    int secondRouteMcdo = distance2 + distance1 + distance6 + distance5 + distance4;
                    int thirdRouteMcdo = distance3 + distance5 + distance7+ distance8;

                    int minute = firstRouteMcdo % 60;
                    int minute2 = secondRouteMcdo % 60;
                    int minute3 = thirdRouteMcdo % 60;

                    int hours = firstRouteMcdo / 60;
                    int hours2 = secondRouteMcdo / 60;
                    int hours3 = thirdRouteMcdo /60;

                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation1[1] + " >>> " + ": " + currentLocation1[2]
                    + " (" + distance3 + "m) " + " >>> " + currentLocation1[3] + " (" + distance4 + "m) "
                    + "\nCalculated Distance: " + +firstRouteMcdo + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation1[1] + " (" + distance2 + "m) " + ": "
                    + currentLocation1[0] + " (" + distance1 + "m) " + " >>> " + currentLocation1[4] + " ("
                    + distance6 + "m) " + " >>> " + currentLocation1[2] + " (" + distance5 + "m) " + " >>> "
                    + currentLocation1[3] + "(" + distance4 + "m) " + "\nCalculated Distance: "
                    + +secondRouteMcdo + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println("Third Route " + currentLocation1[1] + " >>> " + ": " + currentLocation1[2]
                    + " (" + distance5 + "m) " + " >>> " + currentLocation1[5] + " (" + distance7 + "m) " + currentLocation1[3] + " (" + distance8 + "m) " 
                    + "\nCalculated Distance: " + +thirdRouteMcdo + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                    System.out.println();


                    if (firstRouteMcdo <= secondRouteMcdo && firstRouteMcdo <= thirdRouteMcdo) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + " >>> " + ": " + currentLocation1[2]
                                + " (" + distance3 + "m) " + " >>> " + currentLocation1[3] + " (" + distance4 + "m) "
                                + "\nCalculated Distance: " + +firstRouteMcdo + "m\n");

                        if (firstRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");
                        }
                    }  else if (secondRouteMcdo <= firstRouteMcdo && secondRouteMcdo <= thirdRouteMcdo) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + " (" + distance2 + "m) " + ": "
                                + currentLocation1[0] + " (" + distance1 + "m) " + " >>> " + currentLocation1[4] + " ("
                                + distance6 + "m) " + " >>> " + currentLocation1[2] + " (" + distance5 + "m) " + " >>> "
                                + currentLocation1[3] + "(" + distance4 + "m) " + "\nCalculated Distance: "
                                + +secondRouteMcdo + "m\n");
                        if (secondRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                    else{
                        System.out.println("Third Route " + currentLocation1[1] + " >>> " + ": " + currentLocation1[2]
                        + " (" + distance5 + "m) " + " >>> " + currentLocation1[5] + " (" + distance7 + "m) " + currentLocation1[3] + " (" + distance8 + "m) " 
                        + "\nCalculated Distance: " + +thirdRouteMcdo + "m\n");
                        if (thirdRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours3 + " and " + minute3 + "  minute/s\n");
                        }
                    }

                }

                // Route for Jollibee - SM
                else if (menu.equalsIgnoreCase("SM")) {

                    int firstRouteSM = distance3 + distance5 + distance6;
                    int secondRouteSM = distance2 + distance1 + distance6;
                    int thirdRouteSM = distance3 + distance4 + distance8 + distance7 + distance6;

                    int minute = firstRouteSM % 60;
                    int minute2 = secondRouteSM % 60;
                    int minute3 = thirdRouteSM % 60;
                    int hours = firstRouteSM / 60;
                    int hours2 = secondRouteSM / 60;
                    int hours3 = thirdRouteSM / 60;

                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation1[1] + " (" + distance3 + "m) " + ": "
                    + currentLocation1[2] + " (" + distance5 + "m) " + " >>> " + currentLocation1[4] + " ("
                    + distance6 + "m)" + "\nCalculated Distance: " + +firstRouteSM + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation1[1] + " (" + distance2 + "m) " + ": "
                    + currentLocation1[0] + " (" + distance1 + "m) " + " >>> " + currentLocation1[4] + " ("
                    + distance6 + "m) " + "\nCalculated Distance: " + +secondRouteSM + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    
                    System.out.println("Third Route " + currentLocation1[1] + " (" + distance3 + "m) " + ": "
                    + currentLocation1[2] + " (" + distance4 + "m) " + " >>> " + currentLocation1[3] + " ("
                    + distance8 + "m)" + currentLocation1[5] + " ("
                    + distance7 + "m)" + currentLocation1[4] + " ("
                    + distance6 + "m)" +"\nCalculated Distance: " + +thirdRouteSM + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println();

                    if (firstRouteSM <= secondRouteSM && firstRouteSM <= thirdRouteSM) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + " (" + distance3 + "m) " + ": "
                                + currentLocation1[2] + " (" + distance5 + "m) " + " >>> " + currentLocation1[4] + " ("
                                + distance6 + "m)" + "\nCalculated Distance: " + +firstRouteSM + "m\n");

                        if (firstRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }
                    else if (secondRouteSM <= firstRouteSM && secondRouteSM <= thirdRouteSM) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + " (" + distance2 + "m) " + ": "
                                + currentLocation1[0] + " (" + distance1 + "m) " + " >>> " + currentLocation1[4] + " ("
                                + distance6 + "m) " + "\nCalculated Distance: " + +secondRouteSM + "m\n");
                        if (firstRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                    else{
                        System.out.println("Third Route " + currentLocation1[1] + " (" + distance3 + "m) " + ": "
                        + currentLocation1[2] + " (" + distance4 + "m) " + " >>> " + currentLocation1[3] + " ("
                        + distance8 + "m)" + currentLocation1[5] + " ("
                        + distance7 + "m)" + currentLocation1[4] + " ("
                        + distance6 + "m)" +"\nCalculated Distance: " + +thirdRouteSM + "m\n");
                        if(thirdRouteSM < 60){
                            System.out.printf("\nThis is the quickest option: " + minute3 + "  minute/s\n");
                        }else{
                            System.out
                            .printf("\nThis is the quickest option: " + hours3 + " and " + minute3 + "  minute/s\n");
                        }
                    }
                }
                // Route for Jollibee - Apartment
                else if (menu.equalsIgnoreCase("APARTMENT")) {

                    int firstRouteApartment = distance3 + distance4 + distance8;
                    int secondRouteApartment = distance3 + distance5 + distance7;
                    int thirdRouteApartment = distance2 + distance1 + distance6 + distance7;

                    int minute = firstRouteApartment % 60;
                    int minute2 = secondRouteApartment % 60;
                    int minute3 = thirdRouteApartment % 60;
                    int hours = firstRouteApartment / 60;
                    int hours2 = secondRouteApartment / 60;
                    int hours3 = thirdRouteApartment / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation1[1] + ": (" + currentLocation1[2] + distance3 + "m) " + ": "
                    + currentLocation1[3] + " (" + distance4 + "m) " + " >>> " + currentLocation1[5] + " ("
                    + distance7 + "m)" + "\nCalculated Distance: " + +firstRouteApartment + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation1[1] + ": (" + currentLocation1[2]+ distance5 + "m) " + ": "
                    + currentLocation1[5] + " (" + distance7 + "m) " + " >>> "  + "\nCalculated Distance: " + +secondRouteApartment + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println("Third Route " + currentLocation1[1] + ": (" + distance2 + "m) " + ": "
                    + currentLocation1[0] + " (" + distance1 + "m) " +  currentLocation1[4] + " (" + distance6 + "m) "  + currentLocation1[5] + " (" + distance7 + "m) " + " >>> "  + "\nCalculated Distance: " + +thirdRouteApartment + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println();
                    
                    if (firstRouteApartment <= secondRouteApartment && firstRouteApartment <= thirdRouteApartment) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation1[1] + ": (" + currentLocation1[2] + distance3 + "m) " + ": "
                        + currentLocation1[3] + " (" + distance4 + "m) " + " >>> " + currentLocation1[5] + " ("
                        + distance7 + "m)" + "\nCalculated Distance: " + +firstRouteApartment + "m\n");    
                        if (firstRouteApartment < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }

                    else if (secondRouteApartment <= firstRouteApartment && secondRouteApartment <= thirdRouteApartment) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation1[1] + ": (" + currentLocation1[2]+ distance5 + "m) " + ": "
                        + currentLocation1[5] + " (" + distance7 + "m) " + " >>> "  + "\nCalculated Distance: " + +secondRouteApartment + "m\n");
                        
                        if (secondRouteApartment < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + "hour/s and " + minute2 + "  minute/s\n");
                        }
                    }

                    else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this Route " + currentLocation1[1] + ": (" + distance2 + "m) " + ": "
                        + currentLocation1[0] + " (" + distance1 + "m) " +  currentLocation1[4] + " (" + distance6 + "m) "  + currentLocation1[5] + " (" + distance7 + "m) " + " >>> "  + "\nCalculated Distance: " + +thirdRouteApartment + "m\n");
                        if (thirdRouteApartment < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours3 + "hour/s and " + minute3 + "  minute/s\n");
                        }
                    }
                break;
            }
            // DISPLAY POSSIBLE ROUTE IN CURRENT LOCATION HOSPITAL TO ALL
            case "HOSPITAL":
                String currentLocation2[] = { places[0], places[1], places[2], places[3], places[4], places[5] };

                System.out.println("\nPossible Route: " + "\n");

                // Route for Hospital - School
                if (menu.equalsIgnoreCase("SCHOOL")) {

                    int firstRouteSchool = distance3 + distance2;
                    int secondRouteSchool = distance5 + distance6 + distance1;
                    int thirdRouteSchool = distance4 + distance8 + distance7 + distance6 + distance1;

                    int minute = firstRouteSchool % 60;
                    int minute2 = secondRouteSchool % 60;
                    int minute3 = thirdRouteSchool % 60;
                    int hours = firstRouteSchool / 60;
                    int hours2 = secondRouteSchool / 60;
                    int hours3 = thirdRouteSchool / 60;


                    System.out.println("First Route " + currentLocation2[2] + " >>> " + ": " + currentLocation2[1]
                    + " (" + distance3 + "m) " + currentLocation2[0] + " (" + distance2 + "m) "
                    + "\nCalculated Distance: " + +firstRouteSchool + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation2[2] + " (" + distance5 + "m) " + ": "
                    + currentLocation2[4] + " (" + distance6 + "m) " + " >>> " + currentLocation2[0] + " ("
                    + distance1 + "m) " + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println("Third Route " + currentLocation2[2] + " (" + distance4 + "m) " + ": "
                    + currentLocation2[3] + " (" + distance8+ "m) " + " >>> " + currentLocation2[5] + " ("
                    + distance7 + "m) " + currentLocation2[4] + " ("
                    + distance6 + "m) " + currentLocation2[0] + " ("
                    + distance1 + "m) " + "\nCalculated Distance: " + thirdRouteSchool + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                    System.out.println();
                    
                    if (firstRouteSchool <= secondRouteSchool && firstRouteSchool <= thirdRouteSchool) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation2[2] + " >>> " + ": " + currentLocation2[1]
                                + " (" + distance3 + "m) " + currentLocation2[0] + " (" + distance2 + "m) "
                                + "\nCalculated Distance: " + +firstRouteSchool + "m\n");

                        if (firstRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }

 
                    else if (secondRouteSchool <= firstRouteSchool && secondRouteSchool <= thirdRouteSchool) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation2[2] + " (" + distance5 + "m) " + ": "
                                + currentLocation2[4] + " (" + distance6 + "m) " + " >>> " + currentLocation2[0] + " ("
                                + distance1 + "m) " + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                        if (firstRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                    else{
                        System.out.println("Third Route " + currentLocation2[2] + " (" + distance4 + "m) " + ": "
                        + currentLocation2[3] + " (" + distance8+ "m) " + " >>> " + currentLocation2[5] + " ("
                        + distance7 + "m) " + currentLocation2[4] + " ("
                        + distance6 + "m) " + currentLocation2[0] + " ("
                        + distance1 + "m) " + "\nCalculated Distance: " + thirdRouteSchool + "m\n");    
                        if (firstRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                }

                // Route for Hospital - Jollibee
                else if (menu.equalsIgnoreCase("JOLLIBEE")) {

                    int firstRouteJollibee = distance3;
                    int secondRouteJollibee = distance5 + distance6 + distance1 + distance2;
                    int thirdRouteJollibee = distance4 + distance8 + distance7 + distance6 + distance1 + distance2;
                     

                    int minute = firstRouteJollibee % 60;
                    int minute2 = secondRouteJollibee % 60;
                    int minute3 = thirdRouteJollibee % 60;
                    int hours = firstRouteJollibee / 60;
                    int hours2 = secondRouteJollibee / 60;
                    int hours3 = thirdRouteJollibee / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation2[2] + " >>> " + ": " + currentLocation2[1]
                    + " (" + distance3 + "m) " + "\nCalculated Distance: " + +firstRouteJollibee + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation2[2] + " (" + distance5 + "m) " + ": "
                    + currentLocation2[4] + " (" + distance6 + "m) " + " >>> " + currentLocation2[0] + " ("
                    + distance1 + "m) " + " >>> " + currentLocation2[1] + " (" + distance2 + "m) "
                    + "\nCalculated Distance: " + +secondRouteJollibee + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");

                    System.out.println("Third Route " + currentLocation2[2] + " (" + distance4 + "m) " + ": "
                    + currentLocation2[3] + " (" + distance8 + "m) " + " >>> " + currentLocation2[5] + " ("
                    + distance7 + "m) " + " >>> " + currentLocation2[4] + " (" + distance6 + "m) "
                    + currentLocation2[0] + " (" + distance1 + "m) " + currentLocation2[1] + " (" + distance2 + "m) "
                    +  "\nCalculated Distance: " + +thirdRouteJollibee + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                    System.out.println();

                    if (firstRouteJollibee <= secondRouteJollibee && firstRouteJollibee <= thirdRouteJollibee) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation2[2] + " >>> " + ": " + currentLocation2[1]
                                + " (" + distance3 + "m) " + "\nCalculated Distance: " + +firstRouteJollibee + "m\n");
                        if (firstRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }  else if (secondRouteJollibee <= firstRouteJollibee && secondRouteJollibee <= thirdRouteJollibee) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation2[2] + " (" + distance5 + "m) " + ": "
                                + currentLocation2[4] + " (" + distance6 + "m) " + " >>> " + currentLocation2[0] + " ("
                                + distance1 + "m) " + " >>> " + currentLocation2[1] + " (" + distance2 + "m) "
                                + "\nCalculated Distance: " + +secondRouteJollibee + "m\n");
                        if (secondRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                    else{
                        System.out.println("You make take this route " + currentLocation2[2] + " (" + distance4 + "m) " + ": "
                        + currentLocation2[3] + " (" + distance8 + "m) " + " >>> " + currentLocation2[5] + " ("
                        + distance7 + "m) " + " >>> " + currentLocation2[4] + " (" + distance6 + "m) "
                        + currentLocation2[0] + " (" + distance1 + "m) " + currentLocation2[1] + " (" + distance2 + "m) "
                        +  "\nCalculated Distance: " + +thirdRouteJollibee + "m\n");
                        if (thirdRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3+ "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours3 + "hour/s and " + minute3 + "  minute/s\n");
                        }
                    }
                }

                // Route for Hospital - Mcdo
                else if (menu.equalsIgnoreCase("MCDO")) {

                    int firstRouteMcdo = distance4;
                    int secondRouteMcdo = distance5 + distance7 + distance8;
                    int thirdRouteMcdo = distance3 + distance2 + distance1 + distance6 + distance7 + distance8;

                    int minute = firstRouteMcdo % 60;
                    int minute2 = secondRouteMcdo % 60;
                    int minute3 = thirdRouteMcdo % 60;
                    int hours = firstRouteMcdo / 60;
                    int hours2 = secondRouteMcdo / 60;
                    int hours3 = thirdRouteMcdo / 60;


                    System.out.println("First Route " + currentLocation2[2] + " >>> " + ": " + currentLocation2[3]
                    + " (" + distance4 + "m) " + "\nCalculated Distance: " + +firstRouteMcdo + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    
                    System.out.println("Second Route " + currentLocation2[2] + ": " + currentLocation2[5]
                    + " (" + distance7 + "m) " + currentLocation2[4]+ " (" + distance8 + "m) " +"\nCalculated Distance: " + secondRouteMcdo + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    
                    System.out.println("Third Route " + currentLocation2[2] +  ": " + currentLocation2[1]
                    + " (" + distance2 + "m) " + " >>> "+ currentLocation2[0]
                    + " (" + distance1 + "m) " +" >>> " + currentLocation2[4]
                    + " (" + distance6 + "m) " +" >>> " + currentLocation2[5]
                    + " (" + distance7 + "m) " +" >>> " + currentLocation2[3]
                    + " (" + distance8 + "m) " + "\nCalculated Distance: " + +thirdRouteMcdo + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                    System.out.println();

                    if (firstRouteMcdo <= secondRouteMcdo && firstRouteMcdo <= thirdRouteMcdo) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation2[2] + " >>> " + ": " + currentLocation2[3]
                                + " (" + distance4 + "m) " + "\nCalculated Distance: " + +firstRouteMcdo + "m\n");
                        if (firstRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    } else if(secondRouteMcdo <= firstRouteMcdo && secondRouteMcdo <= thirdRouteMcdo){
                        System.out.println("You may take this route " + currentLocation2[2] + ": " + currentLocation2[5]
                        + " (" + distance7 + "m) " + currentLocation2[4]+ " (" + distance8 + "m) " +"\nCalculated Distance: " + secondRouteMcdo + "m\n");
                        
                        if (firstRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours2 + " hour/s and " + minute2 + "  minute/s\n");

                        }
                    } else{
                        System.out.println("Third Route " + currentLocation2[2] +  ": " + currentLocation2[1]
                        + " (" + distance2 + "m) " + " >>> "+ currentLocation2[0]
                        + " (" + distance1 + "m) " +" >>> " + currentLocation2[4]
                        + " (" + distance6 + "m) " +" >>> " + currentLocation2[5]
                        + " (" + distance7 + "m) " +" >>> " + currentLocation2[3]
                        + " (" + distance8 + "m) " + "\nCalculated Distance: " + +thirdRouteMcdo + "m\n");
                        
                        if (firstRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3 + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours3 + " hour/s and " + minute3 + "  minute/s\n");

                        }
                    }
                }

                // Route for Hospital - SM
                else if (menu.equalsIgnoreCase("SM")) {

                    int firstRouteSM = distance3 + distance2 + distance1 + distance6;
                    int secondRouteSM =distance5 + distance6;
                    int thirdRouteSM = distance4 + distance8 + distance7 + distance6;

                    int minute = firstRouteSM % 60;
                    int minute2 = secondRouteSM % 60;
                    int minute3 = thirdRouteSM % 60;
                    int hours = firstRouteSM / 60;
                    int hours2 = secondRouteSM / 60;
                    int hours3 = thirdRouteSM/ 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation2[2] + " (" + distance3 + "m) " + ": "
                    + currentLocation2[1] + " (" + distance2 + "m) >>>" + currentLocation2[0] + " (" + distance1 + "m) " + currentLocation2[4] + " (" + distance6 + "m) " + "\nCalculated Distance: "
                    +firstRouteSM + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");

                    System.out.println("Second Route " + currentLocation2[2] + " (" + distance5 + "m) " + ": "
                    + currentLocation2[4] + " (" + distance6 + "m)"+
                    "\nCalculated Distance: " + +secondRouteSM + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    
                    System.out.println("Third Route " + currentLocation2[2] + " (" + distance4 + "m) " 
                    + currentLocation2[3] + " (" + distance8 + "m) >>>" + currentLocation2[5] + " (" + distance7 + "m) " + currentLocation2[4] + " (" + distance6 + "m) " + "\nCalculated Distance: "
                    +thirdRouteSM + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                    System.out.println();

                    if (firstRouteSM <= secondRouteSM && firstRouteSM <= thirdRouteSM) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation2[2] + " (" + distance3 + "m) " + ": "
                        + currentLocation2[1] + " (" + distance2 + "m) >>>" + currentLocation2[0] + " (" + distance1 + "m) " + currentLocation2[4] + " (" + distance6 + "m) " + "\nCalculated Distance: "
                        +firstRouteSM + "m\n");
                        if (firstRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }

                    else if (secondRouteSM <= firstRouteSM && secondRouteSM <= thirdRouteSM) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation2[2] + " (" + distance5 + "m) " + ": "
                        + currentLocation2[4] + " (" + distance6 + "m)"+
                        "\nCalculated Distance: " + +secondRouteSM + "m\n");
                        
                        if (secondRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                    else{
                        System.out.println("Third Route " + currentLocation2[2] + " (" + distance4 + "m) " 
                        + currentLocation2[3] + " (" + distance8 + "m) >>>" + currentLocation2[5] + " (" + distance7 + "m) " + currentLocation2[4] + " (" + distance6 + "m) " + "\nCalculated Distance: "
                        +thirdRouteSM+ "m\n");
                        if (thirdRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3 + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours3 + " hour/s and " + minute3 + "  minute/s\n");

                        }
                    }
                }   

                // Route for Hospital - Apartment
                else if (menu.equalsIgnoreCase("APARTMENT")) {

                    int firstRouteApartment = distance3 + distance2 + distance1 + distance6 + distance7;
                    int secondRouteApartment =distance5 + distance7;
                    int thirdRouteApartment = distance4 + distance8 + distance7;

                    int minute = firstRouteApartment % 60;
                    int minute2 = secondRouteApartment % 60;
                    int minute3 = thirdRouteApartment % 60;
                    int hours = firstRouteApartment / 60;
                    int hours2 = secondRouteApartment / 60;
                    int hours3 = thirdRouteApartment/ 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation2[2] + " (" + distance3 + "m) " + ": "
                    + currentLocation2[1] + " (" + distance2 + "m) >>>" + currentLocation2[0] + " (" + distance1 + "m) >>> " + currentLocation2[4] + " (" + distance6 + "m) >>> " +  currentLocation2[5] + " (" + distance7 + "m) "+"\nCalculated Distance: "
                    + firstRouteApartment + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");

                    System.out.println("Second Route " + currentLocation2[2] + " (" + distance5 + "m) " + ": "
                    + currentLocation2[5] + " (" + distance7 + "m)"+
                    "\nCalculated Distance: " + +secondRouteApartment + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    
                    System.out.println("Third Route " + currentLocation2[2] + " (" + distance4 + "m) " 
                    + currentLocation2[3] + " (" + distance8 + "m) >>>" + currentLocation2[5] + " (" + distance7 + "m) " + "\nCalculated Distance: "
                    +thirdRouteApartment + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                    System.out.println();

                    if (firstRouteApartment <= secondRouteApartment && firstRouteApartment <= secondRouteApartment) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation2[2] + " (" + distance3 + "m) " + ": "
                        + currentLocation2[1] + " (" + distance2 + "m) >>>" + currentLocation2[0] + " (" + distance1 + "m) >>> " + currentLocation2[4] + " (" + distance6 + "m) >>> " +  currentLocation2[5] + " (" + distance7 + "m) "+"\nCalculated Distance: "
                        + firstRouteApartment + "m\n");
                        if (firstRouteApartment < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }

                    else if (secondRouteApartment <= firstRouteApartment && secondRouteApartment <= thirdRouteApartment) {
                        System.out.println("RECOMMENDED!\n");

                        System.out.println("You may take this route " + currentLocation2[2] + " (" + distance5 + "m) " + ": "
                        + currentLocation2[5] + " (" + distance7 + "m)"+
                        "\nCalculated Distance: " + +secondRouteApartment + "m\n");
                        if (secondRouteApartment < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                    else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation2[2] + " (" + distance4 + "m) " 
                        + currentLocation2[3] + " (" + distance8 + "m) >>>" + currentLocation2[5] + " (" + distance7 + "m) " + "\nCalculated Distance: "
                        +thirdRouteApartment + "m\n");
                        if (thirdRouteApartment < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3 + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours3 + " hour/s and " + minute3 + "  minute/s\n");

                        }
                    }
                }

                break;

            // DISPLAY POSSIBLE ROUTE IN MCDO
            case "MCDO":
                String currentLocation3[] = { places[0], places[1], places[2], places[3], places[4], places[5] };

                System.out.println("\nPossible Route: " + "\n");
                // Route for Mcdo - School
                if (menu.equalsIgnoreCase("SCHOOL")) {
                    
                    int firstRouteSchool = distance4 + distance3 + distance2;
                    int secondRouteSchool = distance4 + distance5 + distance6 + distance1;
                    int thirdRouteSchool = distance8 + distance7 + distance6 + distance1;
                    int fourthRouteSchool = distance8 + distance7 + distance5 + distance3 + distance2;

                    int minute = firstRouteSchool % 60;
                    int minute2 = secondRouteSchool % 60;
                    int minute3 = thirdRouteSchool % 60;
                    int minute4 = firstRouteSchool % 60;

                    int hours = firstRouteSchool / 60;
                    int hours2 = secondRouteSchool / 60;
                    int hours3 = thirdRouteSchool / 60;
                    int hours4 = fourthRouteSchool / 60;


                    System.out.println("First Route " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                    + currentLocation3[2] + " (" + distance3 + "m)  >>> " + currentLocation3[1] + " ("
                    + distance2 + "m)  >>> " + currentLocation3[1] + ">>> " + currentLocation3[0] + "\nCalculated Distance: "
                    + +firstRouteSchool + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");

                    System.out.println("Second Route " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                    + currentLocation3[2] + " (" + distance5 + "m) " + " >>> " + currentLocation3[4] + " ("
                    + distance6 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + ") "
                    + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");

                    System.out.println("Third Route " + currentLocation3[3] + " (" + distance8 + "m) " + ": "
                    + currentLocation3[4] + " (" + distance7 + "m) " + " >>> " + currentLocation3[5] + " ("
                    + distance6 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + ") "
                    + "\nCalculated Distance: " + thirdRouteSchool + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + " minute/s\n");

                    System.out.println("Fourth Route " + currentLocation3[3] + " (" + distance8+ "m) " + ": "
                    + currentLocation3[5] + " (" + distance7 + "m) " + " >>> " + currentLocation3[2] + " ("
                    + distance5 + "m) " + " >>> " + currentLocation3[1] + " (" + distance3 + "m) >>>"  + currentLocation3[0] + " (" + distance2 + "m) "
                    + "\nCalculated Distance: " + fourthRouteSchool + "m\n");
                    System.out.println("Time: " + hours4 + " hour/s and " + minute4 + " minute/s\n");
                    System.out.println();

                    if (firstRouteSchool <= secondRouteSchool && firstRouteSchool <= thirdRouteSchool && firstRouteSchool <= fourthRouteSchool) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                        + currentLocation3[2] + " (" + distance3 + "m)  >>> " + currentLocation3[1] + " ("
                        + distance2 + "m)  >>> " + currentLocation3[1] + ">>> " + currentLocation3[0] + "\nCalculated Distance: "
                        + +firstRouteSchool + "m\n");

                        if (firstRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }else if (secondRouteSchool <= firstRouteSchool && secondRouteSchool <= thirdRouteSchool && secondRouteSchool <= fourthRouteSchool) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Second Route " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                        + currentLocation3[2] + " (" + distance5 + "m) " + " >>> " + currentLocation3[4] + " ("
                        + distance6 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + ") "
                        + "\nCalculated Distance: " + secondRouteSchool + "m\n");

                        if (secondRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                    else if(thirdRouteSchool <= firstRouteSchool && thirdRouteSchool <= secondRouteSchool && thirdRouteSchool <= fourthRouteSchool){
                        System.out.println("RECOMMENDED!\n");
                        
                        System.out.println("Third Route " + currentLocation3[3] + " (" + distance8 + "m) " + ": "
                        + currentLocation3[4] + " (" + distance7 + "m) " + " >>> " + currentLocation3[5] + " ("
                        + distance6 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + ") "
                        + "\nCalculated Distance: " + thirdRouteSchool + "m\n");
                        if (secondRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                    else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Fourth Route " + currentLocation3[3] + " (" + distance8+ "m) " + ": "
                        + currentLocation3[5] + " (" + distance7 + "m) " + " >>> " + currentLocation3[2] + " ("
                        + distance5 + "m) " + " >>> " + currentLocation3[1] + " (" + distance3 + "m) >>>"  + currentLocation3[0] + " (" + distance2 + "m) "
                        + "\nCalculated Distance: " + fourthRouteSchool + "m\n");
                        
                        if (secondRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                }

                // Route for Mcdo - Hospital
                else if (menu.equalsIgnoreCase("HOSPITAL")) {

                    int firstRouteHospital = distance4;
                    int secondRouteHospital = distance8 + distance7 + distance5;
                    int thirdRouteHospital = distance8 + distance7 + distance6 + distance1 + distance2 +distance3;

                    int minute = firstRouteHospital % 60;
                    int minute2 = secondRouteHospital % 60;
                    int minute3 = thirdRouteHospital % 60;
                    int hours = firstRouteHospital / 60;
                    int hours2 = secondRouteHospital / 60;
                    int hours3 = thirdRouteHospital / 60;


                    System.out.println("First Route " + currentLocation3[3] + " >>> " + ": " + currentLocation3[2]
                    + " (" + distance4 + "m) " + "\nCalculated Distance: " + +firstRouteHospital
                    + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");

                    System.out.println("Second Route " + currentLocation3[3] + " (" + distance8 + "m) " + ": "
                    + currentLocation3[5] + " (" + distance7 + "m) " + " >>> " + currentLocation3[2] + " ("
                    + distance5 + "m) " + "\nCalculated Distance: " + secondRouteHospital + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");

                    System.out.println("Third Route " + currentLocation3[3] + " (" + distance8 + "m) " + ": "
                    + currentLocation3[5] + " (" + distance7 + "m) " + " >>> " + currentLocation3[4] + " ("
                    + distance6 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + "m) " + " >>> " + currentLocation3[1] + " (" + distance2 + "m) " + " >>> " + currentLocation3[2] + " (" + distance3 + ")m" +
                    "\nCalculated Distance: " + thirdRouteHospital + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                    System.out.println();

                    if (firstRouteHospital <= secondRouteHospital && firstRouteHospital <= thirdRouteHospital) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route " + currentLocation3[3] + " >>> " + ": " + currentLocation3[2]
                        + " (" + distance4 + "m) " + "\nCalculated Distance: " + +firstRouteHospital
                        + "m\n");

                        if (firstRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }  else if (secondRouteHospital <= firstRouteHospital  && secondRouteHospital <= thirdRouteHospital) {
                        System.out.println("\nRECOMMENDED!\n");
                        
                        System.out.println("Second Route " + currentLocation3[3] + " (" + distance8 + "m) " + ": "
                        + currentLocation3[5] + " (" + distance7 + "m) " + " >>> " + currentLocation3[2] + " ("
                        + distance5 + "m) " + "\nCalculated Distance: " + secondRouteHospital + "m\n"); 

                        if (firstRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    } else{
                        System.out.println("Third Route " + currentLocation3[3] + " (" + distance8 + "m) " + ": "
                        + currentLocation3[5] + " (" + distance7 + "m) " + " >>> " + currentLocation3[4] + " ("
                        + distance6 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + "m) " + " >>> " + currentLocation3[1] + " (" + distance2 + "m) " + " >>> " + currentLocation3[2] + " (" + distance3 + ")m" +
                        "\nCalculated Distance: " + thirdRouteHospital + "m\n");
                    }
                    
                }


                // Route for Mcdo - Jollibee
                else if (menu.equalsIgnoreCase("JOLLIBEE")) {

                    int firstRouteJollibee = distance4 + distance3;
                    int secondRouteJollibee = distance4 + distance5 + distance6 + distance1 + distance2;
                    int thirdRouteJollibee = distance8 + distance7 + distance5 + distance3;
                    int fourthRouteJollibee = distance8 + distance7 + distance6 + distance1 +distance2;

                    int minute = firstRouteJollibee % 60;
                    int minute2 = secondRouteJollibee % 60;
                    int minute3 = thirdRouteJollibee % 60;
                    int minute4 = fourthRouteJollibee % 60;

                    int hours = firstRouteJollibee / 60;
                    int hours2 = secondRouteJollibee / 60;
                    int hours3 = thirdRouteJollibee / 60;
                    int hours4 = fourthRouteJollibee / 60;

                    System.out.println("First Route " + currentLocation3[3] + " >>> " + ": " + currentLocation3[2]
                    + " (" + distance4 + "m) " + " >>> " + currentLocation3[1] + " (" + distance3 + "m) "
                    + "\nCalculated Distance: " + +firstRouteJollibee + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    
                    System.out.println("Second Route " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                    + currentLocation3[2] + " (" + distance5 + "m) " + " >>> " + currentLocation3[4] + " ("
                    + distance6 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + "m) " + " >>> "
                    + currentLocation3[1] + " (" + distance2 + "m) " + "\nCalculated Distance: "
                    + +secondRouteJollibee + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");

                    System.out.println("Third Route " + currentLocation3[3] + " (" + distance8 + "m) " + ": "
                    + currentLocation3[5] + " (" + distance7 + "m) " + " >>> " + currentLocation3[2] + " ("
                    + distance5 + "m) " + " >>> " + currentLocation3[1] + " (" + distance3 + "m) " + "\nCalculated Distance: "
                    + +thirdRouteJollibee + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + " minute/s\n");
                    

                    System.out.println("Fourth Route " + currentLocation3[3] + " (" + distance8 + "m) " + ": "
                    + currentLocation3[5] + " (" + distance7 + "m) " + " >>> " + currentLocation3[4] + " ("
                    + distance6 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + "m) " + " >>> "
                    + currentLocation3[1] + " (" + distance2 + "m) " + "\nCalculated Distance: "
                    + +secondRouteJollibee + "m\n");
                    System.out.println("Time: " + hours4 + " hour/s and " + minute4 + " minute/s\n");
                    
                    
                    System.out.println();

                    if (firstRouteJollibee <= secondRouteJollibee && firstRouteJollibee <= secondRouteJollibee && firstRouteJollibee <= fourthRouteJollibee) {
                        System.out.println("\nRECOMMENDED!\n");

                        System.out.println("You may take this route " + currentLocation3[3] + " >>> " + ": " + currentLocation3[2]
                        + " (" + distance4 + "m) " + " >>> " + currentLocation3[1] + " (" + distance3 + "m) "
                        + "\nCalculated Distance: " + +firstRouteJollibee + "m\n");
                        if (firstRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }

                    else if ( secondRouteJollibee <= firstRouteJollibee && secondRouteJollibee <= thirdRouteJollibee && secondRouteJollibee <= fourthRouteJollibee) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                        + currentLocation3[2] + " (" + distance5 + "m) " + " >>> " + currentLocation3[4] + " ("
                        + distance6 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + "m) " + " >>> "
                        + currentLocation3[1] + " (" + distance2 + "m) " + "\nCalculated Distance: "
                        + +secondRouteJollibee + "m\n");
                        if (secondRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + "hour/s and " + minute2 + "  minute/s\n");
                        }
                    }
                    else if(thirdRouteJollibee <= firstRouteJollibee && thirdRouteJollibee <= secondRouteJollibee && thirdRouteJollibee <= fourthRouteJollibee){
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation3[3] + " (" + distance8 + "m) " + ": "
                        + currentLocation3[5] + " (" + distance7 + "m) " + " >>> " + currentLocation3[2] + " ("
                        + distance5 + "m) " + " >>> " + currentLocation3[1] + " (" + distance3 + "m) " + "\nCalculated Distance: "
                        + +thirdRouteJollibee + "m\n");
                        if (thirdRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours3 + "hour/s and " + minute3 + "  minute/s\n");
                        }
                    }
                    else{
                        System.out.println("\nRECOMMENDED!\n");
                        
                        System.out.println("You may take this route " + currentLocation3[3] + " (" + distance8 + "m) " + ": "
                        + currentLocation3[5] + " (" + distance7 + "m) " + " >>> " + currentLocation3[4] + " ("
                        + distance6 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + "m) " + " >>> "
                        + currentLocation3[1] + " (" + distance2 + "m) " + "\nCalculated Distance: "
                        + +secondRouteJollibee + "m\n");

                        if (fourthRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute4 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours4+ "hour/s and " + minute4 + "  minute/s\n");
                        }
                    }
                }

                //Route for mcdo - sm
                else if (menu.equalsIgnoreCase("SM")) {

                    int firstRouteSM = distance4 + distance5 + distance6;
                    int secondRouteSM = distance4 + distance3 + distance2 + distance1 + distance6;
                    int thirdRouteSM = distance8 + distance7 + distance6;
                    int fourthRouteSM = distance8 + distance7 +distance5 + distance3 + distance2 + distance1 + distance6;

                    int minute = firstRouteSM % 60;
                    int minute2 = secondRouteSM % 60;
                    int minute3 = thirdRouteSM % 60;
                    int minute4 = fourthRouteSM % 60;

                    int hours = firstRouteSM / 60;
                    int hours2 = secondRouteSM / 60;
                    int hours3 = thirdRouteSM / 60;
                    int hours4  = fourthRouteSM / 60;

                    System.out.println("First Route " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                    + currentLocation3[2] + " (" + distance5 + "m)  >>> " + currentLocation3[4] + " ("
                    + distance6 + "m) " + "\nCalculated Distance: " + +firstRouteSM + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");

                    System.out.println("Second Route " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                    + currentLocation3[2] + " (" + distance3 + "m) " + " >>> " + currentLocation3[1] + " ("
                    + distance2 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + "m) " + " >>> "
                    + currentLocation3[4] + " (" + distance6 + "m) " + "\nCalculated Distance: "
                    + +secondRouteSM + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");

                    System.out.println("Third Route " + currentLocation3[3] + " (" + distance8 + "m) " + ": "
                    + currentLocation3[5] + " (" + distance7 + "m)  >>> " + currentLocation3[4] + " ("
                    + distance6 + "m) " + "\nCalculated Distance: " + +firstRouteSM + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");

                    System.out.println("Fourth Route " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                    + currentLocation3[2] + " (" + distance3 + "m) " + " >>> " + currentLocation3[1] + " ("
                    + distance2 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + "m) " + " >>> "
                    + currentLocation3[4] + " (" + distance6 + "m) " + "\nCalculated Distance: "
                    + +secondRouteSM + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println();

                    if (firstRouteSM <= secondRouteSM && firstRouteSM <= secondRouteSM && firstRouteSM <= fourthRouteSM) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                        + currentLocation3[2] + " (" + distance5 + "m)  >>> " + currentLocation3[4] + " ("
                        + distance6 + "m) " + "\nCalculated Distance: " + +firstRouteSM + "m\n");
                        if (firstRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    } else if (secondRouteSM <= firstRouteSM && secondRouteSM <= thirdRouteSM && secondRouteSM <= fourthRouteSM) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                                + currentLocation3[2] + " (" + distance3 + "m) " + " >>> " + currentLocation3[1] + " ("
                                + distance2 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + "m) " + " >>> "
                                + currentLocation3[4] + " (" + distance6 + "m) " + "\nCalculated Distance: "
                                + +secondRouteSM + "m\n");
                        if (secondRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                    else if( thirdRouteSM <= firstRouteSM && thirdRouteSM <secondRouteSM && thirdRouteSM <= fourthRouteSM){
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation3[3] + " (" + distance8 + "m) " + ": "
                        + currentLocation3[5] + " (" + distance7 + "m)  >>> " + currentLocation3[4] + " ("
                        + distance6 + "m) " + "\nCalculated Distance: " + +firstRouteSM + "m\n");
                        if (thirdRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                    else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Fourth Route " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                        + currentLocation3[2] + " (" + distance3 + "m) " + " >>> " + currentLocation3[1] + " ("
                        + distance2 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + "m) " + " >>> "
                        + currentLocation3[4] + " (" + distance6 + "m) " + "\nCalculated Distance: "
                        + +secondRouteSM + "m\n");
                        if (fourthRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                }

                //mcdo - apartment
                else if (menu.equalsIgnoreCase("APARTMENT")) {

                    int firstRouteMcdo =  distance4 + distance3 + distance2 + distance1 + distance6 + distance7;
                    int secondRouteMcdo = distance4 + distance5 + distance7;
                    int thirdRouteMcdo = distance8;

                    int minute = firstRouteMcdo % 60;
                    int minute2 = secondRouteMcdo % 60;
                    int minute3 = thirdRouteMcdo % 60;
                    int hours = firstRouteMcdo / 60;
                    int hours2 = secondRouteMcdo / 60;
                    int hours3 = thirdRouteMcdo / 60;


                    System.out.println("First Route " + currentLocation3[3] + " ("+distance4+"m) "  + ": " + currentLocation3[2]
                    + " (" + distance3 + "m) " + " >>> " + currentLocation3[1] + " (" + distance2 + "m)" + " >>> " + currentLocation3[0] + " (" + distance1 + "m)" + " >>> " + currentLocation3[4] + " (" + distance6 + "m)" + " >>> " + currentLocation3[5] + " (" + distance7 + "m)"
                    + "\nCalculated Distance: " + +firstRouteMcdo + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + "  minute/s\n");

                    System.out.println("Second Route " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                    + currentLocation3[2] + " (" + distance5 + "m) " + " >>> " + currentLocation3[5] + " ("
                    + distance7 + "m) "+"\nCalculated Distance: "
                    + +secondRouteMcdo + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + "  minute/s\n");

                    System.out.println("Third Route " + currentLocation3[3] + " ("+distance8+"m) "  + ": " + currentLocation3[5]
                    + "\nCalculated Distance: " + thirdRouteMcdo + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + "  minute/s\n");

                    System.out.println();
                    
                    if (firstRouteMcdo <= secondRouteMcdo && firstRouteMcdo <= thirdRouteMcdo) {
                        System.out.println("\nRECOMMENDED!\n");

                        System.out.println("You may take this route " + currentLocation3[3] + " ("+distance4+"m) "  + ": " + currentLocation3[2]
                        + " (" + distance3 + "m) " + " >>> " + currentLocation3[1] + " (" + distance2 + "m)" + " >>> " + currentLocation3[0] + " (" + distance1 + "m)" + " >>> " + currentLocation3[4] + " (" + distance6 + "m)" + " >>> " + currentLocation3[5] + " (" + distance7 + "m)"
                        + "\nCalculated Distance: " + +firstRouteMcdo + "m\n");

                        if (firstRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "   minute/s\n");

                        }
                    }

                    else if (secondRouteMcdo <= firstRouteMcdo && secondRouteMcdo <= thirdRouteMcdo) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                        + currentLocation3[2] + " (" + distance5 + "m) " + " >>> " + currentLocation3[5] + " ("
                        + distance7 + "m) "+"\nCalculated Distance: "
                        + +secondRouteMcdo + "m\n");
                        if (secondRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "   minute/s\n");
                        }
                    }
                    else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Third Route " + currentLocation3[3] + " ("+distance8+"m) "  + ": " + currentLocation3[5]
                        + "\nCalculated Distance: " + thirdRouteMcdo + "m\n");
    
                        if (secondRouteMcdo < 60) {
                            
                            System.out.printf("\nThis is the quickest option: " + minute3 + "   minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours3 + " and " + minute3 + "   minute/s\n");
                        }
                    }
                }

                break;

            // DISPLAY ALL POSIBLE ROUTE IN SM
            case "SM":
                String currentLocation4[] = { places[0], places[1], places[2], places[3], places[4],places[5] };

                System.out.println("\nPossible Route: " + "\n");
                // Route for Sm - School
                if (menu.equalsIgnoreCase("SCHOOL")) {
                    int firstRouteSchool = distance1;
                    int secondRouteSchool = distance6 + distance5 +distance3 + distance2;
                    int thirdRouteSchool = distance6 + distance7 +distance8 + distance4 + distance3 + distance2;
                    
                    int minute = firstRouteSchool % 60;
                    int minute2 = secondRouteSchool % 60;
                    int minute3 = thirdRouteSchool % 60;
                    int hours = firstRouteSchool / 60;
                    int hours2 = secondRouteSchool / 60;
                    int hours3 = thirdRouteSchool / 60;

                    System.out.println("First Route " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                    + currentLocation4[0] + " (" + distance1 + "m) " + "\nCalculated Distance: "
                    + +firstRouteSchool + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + "  minute/s\n");
                    System.out.println("Second Route " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                    + currentLocation4[3] + " (" + distance5 + "m) " + " >>> " + currentLocation4[2] + " ("
                    + distance3 + "m) " + " >>> " + currentLocation4[1] + " (" + distance2 + ") "
                    + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + "  minute/s\n");
                    System.out.println();

                        if (firstRouteSchool < secondRouteSchool) {
                            System.out.println("\nRECOMMENDED!\n");
                            System.out.println("You may take this route:  " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                                    + currentLocation4[0] + " (" + distance1 + "m) " + "\nCalculated Distance: "
                                    + +firstRouteSchool + "m\n");
                            if (firstRouteSchool < 60) {
                                System.out.printf("\nThis is the quickest option: " + minute + "   minute/s\n");
                            } else {
                                System.out.printf(
                                        "\nThis is the quickest option: " + hours + " hour/s and " + minute + "   minute/s\n");

                            }
                        }

                         else if (secondRouteSchool < firstRouteSchool) {
                            System.out.println("RECOMMENDED!\n");
                            System.out.println("You may take this route:  " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                                    + currentLocation4[2] + " (" + distance5 + "m) " + " >>> " + currentLocation4[1] + " ("
                                    + distance3 + "m) " + " >>> " + currentLocation4[0] + " (" + distance2 + ") "
                                    + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                            if (secondRouteSchool < 60) {
                                System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                            } else {
                                System.out
                                        .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "   minute/s\n");
                            }
                        }
                        else{
                            System.out.println("RECOMMENDED!\n");
                            if (secondRouteSchool < 60) {
                                System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                            } else {
                                System.out
                                        .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "   minute/s\n");
                            }
                        }

                }

                // Route for Sm - Hospital
                else if (menu.equalsIgnoreCase("HOSPITAL")) {

                    int firstRouteHospital = distance6 + distance5;
                    int secondRouteHospital =distance6 + distance1 + distance2 + distance3;
                    int thirdRouteHospital = distance6 + distance7 + distance8 +distance4;

                    int minute = firstRouteHospital % 60;
                    int minute2 = secondRouteHospital % 60;
                    int minute3 = thirdRouteHospital % 60;

                    int hours = firstRouteHospital / 60;
                    int hours2 = secondRouteHospital / 60;
                    int hours3 = thirdRouteHospital / 60;


                    System.out.println("First Route " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                    + currentLocation4[2] + " (" + distance5 + "m)" + "\nCalculated Distance: "
                    +firstRouteHospital + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + "  minute/s\n");

                    System.out.println("Second Route " + currentLocation4[4] + " >>> " + ": " + currentLocation4[0]
                    + " (" + distance1 + "m) " + " >>> " + currentLocation4[1] + " (" + distance2 + "m) "
                    + " >>> " + currentLocation4[2] + " (" + distance3 + "m) " + "\nCalculated Distance: "
                    +secondRouteHospital + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + "  minute/s\n");

                    System.out.println("Third Route " + currentLocation4[4] + " >>> " + ": " + currentLocation4[5]
                    + " (" + distance7 + "m) " + " >>> " + currentLocation4[3] + " (" + distance8 + "m) "
                    + " >>> " + currentLocation4[2] + " (" + distance4 + "m) " + "\nCalculated Distance: "
                    +secondRouteHospital + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + "  minute/s\n");
                    System.out.println();

                    if (firstRouteHospital <= secondRouteHospital && firstRouteHospital <= thirdRouteHospital) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                                + currentLocation4[2] + " (" + distance5 + "m)" + "\nCalculated Distance: "
                                + +firstRouteHospital + "m\n");
                        if (firstRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "   minute/s\n");

                        }
                    }

                     else if (secondRouteHospital <= firstRouteHospital && secondRouteHospital <= thirdRouteHospital) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation4[4] + " >>> " + ": " + currentLocation4[0]
                                + " (" + distance1 + "m) " + " >>> " + currentLocation4[1] + " (" + distance2 + "m) "
                                + " >>> " + currentLocation4[2] + " (" + distance3 + "m) " + "\nCalculated Distance: "
                                + +secondRouteHospital + "m\n");
                        if (secondRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "   minute/s\n");
                        }
                    }
                    else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Third Route " + currentLocation4[4] + " >>> " + ": " + currentLocation4[5]
                        + " (" + distance7 + "m) " + " >>> " + currentLocation4[3] + " (" + distance8 + "m) "
                        + " >>> " + currentLocation4[2] + " (" + distance4 + "m) " + "\nCalculated Distance: "
                        +secondRouteHospital + "m\n");
                        if (thirdRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3 + "   minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours3 + " and " + minute3 + "   minute/s\n");
                        }
                    }
                }

                // Route for Sm - Mcdo
                else if (menu.equalsIgnoreCase("MCDO")) {

                    int firstRouteMcdo = distance6 + distance5 + distance4;
                    int secondRouteMcdo = distance6 + distance1 + distance2 + distance3 + distance4;
                    int thirdRouteMcdo = distance6 + distance7 + distance8;

                    int minute = firstRouteMcdo % 60;
                    int minute2 = secondRouteMcdo % 60;
                    int minute3 = thirdRouteMcdo % 60;
                    int hours = firstRouteMcdo / 60;
                    int hours2 = secondRouteMcdo / 60;
                    int hours3 = thirdRouteMcdo / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation4[4] + " ("+distance6+"m) "  + ": " + currentLocation4[2]
                    + " (" + distance5 + "m) " + " >>> " + currentLocation4[3] + " (" + distance4 + "m)"
                    + "\nCalculated Distance: " + +firstRouteMcdo + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + "  minute/s\n");
                    System.out.println("Second Route " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                    + currentLocation4[0] + " (" + distance1 + "m) " + " >>> " + currentLocation4[1] + " ("
                    + distance2 + "m) " + " >>> " + currentLocation4[2] + " (" + distance3 + "m) " + " >>> "
                    + currentLocation4[3] + " (" + distance4 + "m)" + "\nCalculated Distance: "
                    + +secondRouteMcdo + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + "  minute/s\n");
                    System.out.println("Third Route " + currentLocation4[4] + " ("+distance6+"m) "  + ": " + currentLocation4[5]
                    + " (" + distance7 + "m) " + " >>> " + currentLocation4[5] + " (" + distance8 + "m)"
                    + "\nCalculated Distance: " + +thirdRouteMcdo + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + "  minute/s\n");
                    System.out.println();
                    
                     if (firstRouteMcdo <= secondRouteMcdo && firstRouteMcdo <= thirdRouteMcdo) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation4[4] + " ("+distance6+"m) "  + ": " + currentLocation4[2]
                                + " (" + distance5 + "m) " + " >>> " + currentLocation4[3] + " (" + distance4 + "m)"
                                + "\nCalculated Distance: " + +firstRouteMcdo + "m\n");
                        if (firstRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "   minute/s\n");

                        }
                    }
                        else if (secondRouteMcdo <= firstRouteMcdo && secondRouteMcdo <= thirdRouteMcdo) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                                + currentLocation4[0] + " (" + distance1 + "m) " + " >>> " + currentLocation4[1] + " ("
                                + distance2 + "m) " + " >>> " + currentLocation4[2] + " (" + distance3 + "m) " + " >>> "
                                + currentLocation4[3] + " (" + distance4 + "m)" + "\nCalculated Distance: "
                                + +secondRouteMcdo + "m\n");
                        if (secondRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "   minute/s\n");
                        }
                    } else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation4[4] + " ("+distance6+"m) "  + ": " + currentLocation4[5]
                        + " (" + distance7 + "m) " + " >>> " + currentLocation4[5] + " (" + distance8 + "m)"
                        + "\nCalculated Distance: " + +thirdRouteMcdo + "m\n");
                        if (thirdRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3 + "   minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours3 + " and " + minute3 + "   minute/s\n");
                        }
                    }
                }

                // Route for Sm - Jollibee
                else if (menu.equalsIgnoreCase("JOLLIBEE")) {

                    int firstRouteJollibee = distance6+distance1 + distance2;
                    int secondRouteJollibee =  distance6 + distance5 + distance3;
                    int thirdRouteJollibee = distance6+distance7 + distance8 +distance4 + distance3;

                    int minute = firstRouteJollibee % 60;
                    int minute2 = secondRouteJollibee % 60;
                    int minute3 = thirdRouteJollibee % 60;

                    int hours = firstRouteJollibee / 60;
                    int hours2 = secondRouteJollibee / 60;
                    int hours3 = thirdRouteJollibee / 60;

                    System.out.println("First Route " + currentLocation4[4] + " ("+distance6+"m) "  + ": " + currentLocation4[0]
                    + " (" + distance1 + "m) " + " >>> " + currentLocation4[2] + " (" + distance2 + "m)"
                    + "\nCalculated Distance: " + +firstRouteJollibee + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + "  minute/s\n");

                    System.out.println("Second Route " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                    + currentLocation4[2] + " (" + distance5 + "m) " + " >>> " + currentLocation4[1] + " ("
                    + distance3 + "m) " + "\nCalculated Distance: "
                    + +secondRouteJollibee + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + "  minute/s\n");

                    System.out.println("Third Route " + currentLocation4[4] + " ("+distance6+"m) "  + ": " + currentLocation4[5]
                    + " (" + distance7 + "m) " + " >>> " + currentLocation4[5] + " (" + distance8 + "m)" + " >>> " + currentLocation4[3] + " (" + distance4 + "m)" + " >>> " + currentLocation4[2] + " (" + distance3 + "m) >> " + currentLocation4[1] +
                    "\nCalculated Distance: " + +thirdRouteJollibee + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + "  minute/s\n");
                    System.out.println();
                    
                     if (firstRouteJollibee <= secondRouteJollibee && firstRouteJollibee <= thirdRouteJollibee) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation4[4] + " ("+distance6+"m) "  + ": " + currentLocation4[0]
                        + " (" + distance1 + "m) " + " >>> " + currentLocation4[2] + " (" + distance2 + "m)"
                        + "\nCalculated Distance: " + +firstRouteJollibee + "m\n");
                        if (firstRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "   minute/s\n");

                        }
                    }
                        else if (secondRouteJollibee <= firstRouteJollibee && secondRouteJollibee <= thirdRouteJollibee) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                        + currentLocation4[2] + " (" + distance5 + "m) " + " >>> " + currentLocation4[1] + " ("
                        + distance3 + "m) " + "\nCalculated Distance: "
                        + +secondRouteJollibee + "m\n");

                        if (secondRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "   minute/s\n");
                        }
                    } else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation4[4] + " ("+distance6+"m) "  + ": " + currentLocation4[5]
                        + " (" + distance7 + "m) " + " >>> " + currentLocation4[5] + " (" + distance8 + "m)" + " >>> " + currentLocation4[3] + " (" + distance4 + "m)" + " >>> " + currentLocation4[2] + " (" + distance3 + "m) >> " + currentLocation4[1] +
                        "\nCalculated Distance: " + +thirdRouteJollibee + "m\n");

                        if (thirdRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3 + "   minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours3 + " and " + minute3 + "   minute/s\n");
                        }
                    }
                }
                    // Route for Sm - Apartment
                else if (menu.equalsIgnoreCase("APARTMENT")) {

                    int firstRouteApartment = distance6 + distance7;
                    int secondRouteApartment = distance6 + distance1 + distance2 + distance3 + distance5 + distance7;
                    int thirdRouteApartment = distance6 + distance1 + distance2 +distance3 + distance4 + distance8;
                    int fourthRouteApartment = distance6 + distance5 + distance4 + distance8;

                    int minute = firstRouteApartment % 60;
                    int minute2 = secondRouteApartment % 60;
                    int minute3 = thirdRouteApartment % 60;
                    int minute4 = fourthRouteApartment % 60;

                    int hours = firstRouteApartment / 60;
                    int hours2 = secondRouteApartment / 60;
                    int hours3 = thirdRouteApartment / 60;
                    int hours4 = fourthRouteApartment / 60;

                    System.out.println("First Route " + currentLocation4[4] + " ("+distance6+"m) "  + ": "+ " >>> " + currentLocation4[5]+ " (" + distance7 + "m) "
                    + "\nCalculated Distance: " + +firstRouteApartment + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + "  minute/s\n");

                    System.out.println("Second Route " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                    + currentLocation4[0] + " (" + distance1 + "m) " + " >>> " + currentLocation4[1] + " ("
                    + distance2 + "m) " + " >>> " + currentLocation4[2] + " (" + distance3 + "m) " + " >>> "
                    + currentLocation4[5] + " (" + distance5 + "m)" + "(" + distance7 + "m)" + "\nCalculated Distance: "
                    + +secondRouteApartment + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + "  minute/s\n");

                    System.out.println("Third Route " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                    + currentLocation4[0] + " (" + distance1 + "m) " + " >>> " + currentLocation4[1] + " ("
                    + distance2 + "m) " + " >>> " + currentLocation4[2] + " (" + distance3 + "m) " + " >>> "
                    + currentLocation4[3] + " (" + distance4 + "m)" + currentLocation4[5] +"(" + distance8 + "m)" + "\nCalculated Distance: "
                    + +thirdRouteApartment + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + "  minute/s\n");

                    System.out.println("Fourth Route " + currentLocation4[4] + " ("+distance6+"m) "  + ": " + currentLocation4[2]
                    + " (" + distance5 + "m) " + " >>> " + currentLocation4[3] + " (" + distance4 + "m)" + " >>> " + currentLocation4[5] + " (" + distance8 + "m)"
                    + "\nCalculated Distance: " + +fourthRouteApartment + "m\n");
                    System.out.println("Time: " + hours4 + " hour/s and " + minute4 + "  minute/s\n");
                    System.out.println();
                    
                     if (firstRouteApartment <= secondRouteApartment && firstRouteApartment <= thirdRouteApartment && firstRouteApartment <= fourthRouteApartment) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation4[4] + " ("+distance6+"m) "  + ": "+ " >>> " + currentLocation4[5]+ " (" + distance7 + "m) "
                        + "\nCalculated Distance: " + +firstRouteApartment + "m\n");
                        if (firstRouteApartment < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "   minute/s\n");
                        } else {
                            System.out.printf("\nThis is the quickest option: " + hours + " hour/s and " + minute + "   minute/s\n");

                        }
                    }
                        else if (secondRouteApartment <= firstRouteApartment && secondRouteApartment <= thirdRouteApartment && secondRouteApartment <= fourthRouteApartment) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                        + currentLocation4[0] + " (" + distance1 + "m) " + " >>> " + currentLocation4[1] + " ("
                        + distance2 + "m) " + " >>> " + currentLocation4[2] + " (" + distance3 + "m) " + " >>> "
                        + currentLocation4[5] + " (" + distance5 + "m)" + "(" + distance7 + "m)" + "\nCalculated Distance: "
                        + +secondRouteApartment + "m\n");
                        if (secondRouteApartment < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + "hour/s and " + minute2 + "   minute/s\n");
                        }
                    } else if(thirdRouteApartment <= firstRouteApartment && thirdRouteApartment <= secondRouteApartment && thirdRouteApartment <= fourthRouteApartment){ 
                        System.out.println("RECOMMENDED!\n");

                        System.out.println("Ypu may take this route " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                        + currentLocation4[0] + " (" + distance1 + "m) " + " >>> " + currentLocation4[1] + " ("
                        + distance2 + "m) " + " >>> " + currentLocation4[2] + " (" + distance3 + "m) " + " >>> "
                        + currentLocation4[3] + " (" + distance4 + "m)" + currentLocation4[5] +"(" + distance8 + "m)" + "\nCalculated Distance: "
                        + +thirdRouteApartment + "m\n");
                        if (thirdRouteApartment < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute3 + "   minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours3 + "hour/s and " + minute3 + "   minute/s\n");
                        }
                    }   else{
                        System.out.println("RECOMMENDED!\n");

                        System.out.println("You may take this route " + currentLocation4[4] + " ("+distance6+"m) "  + ": " + currentLocation4[2]
                        + " (" + distance5 + "m) " + " >>> " + currentLocation4[3] + " (" + distance4 + "m)" + " >>> " + currentLocation4[5] + " (" + distance8 + "m)"
                        + "\nCalculated Distance: " + +fourthRouteApartment + "m\n");
                        if (fourthRouteApartment < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute4 + "   minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours4 + "hour/s and " + minute4 + "   minute/s\n");
                        }
                    }
                }



                break;
            //DISPALY ALL POSSIBLE ROUTE IN APARTMENT
            case "APARTMENT":
                String currentLocation5[] = { places[0], places[1], places[2], places[3], places[4] ,places[5]};

                System.out.println("\nPossible Route: " + "\n");
                // Route for Apartment - School
                if (menu.equalsIgnoreCase("SCHOOL")) {
                    
                    int firstRouteSchool = distance7 + distance6 + distance1; 
                    int secondRouteSchool = distance7 + distance5 + distance3 + distance2;
                    int thirdRouteSchool = distance8 + distance4 + distance3 + distance2;
                    int fourthRouteSchool = distance8 + distance4 + distance5 + distance6 + distance1;

                    int minute = firstRouteSchool % 60;
                    int minute2 = secondRouteSchool % 60;
                    int minute3 = thirdRouteSchool % 60;
                    int minute4 = fourthRouteSchool % 60;

                    int hours = firstRouteSchool / 60;
                    int hours2 = secondRouteSchool / 60;
                    int hours3 = thirdRouteSchool / 60;
                    int hours4 = fourthRouteSchool / 60;

                    System.out.println("First Route " + currentLocation5[5] + " (" + distance7 + "m) " + ": "
                    + currentLocation5[4] + " (" + distance6 + "m) " + currentLocation5[0] + " (" + distance1 + "m) "  + "\nCalculated Distance: "
                    + +firstRouteSchool + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + "  minute/s\n");

                    System.out.println("Second Route " + currentLocation5[5] + " (" + distance7 + "m) " + ": "
                    + currentLocation5[2] + " (" + distance5 + "m) " + " >>> " + currentLocation5[1] + " ("
                    + distance3 + "m) " + " >>> " + currentLocation5[0] + " (" + distance2 + ") "
                    + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + "  minute/s\n");

                    System.out.println("Third Route " +currentLocation5[5] +":" + currentLocation5[3] + " (" + distance8 + "m) " + ": "
                    + currentLocation5[3] + " (" + distance4 + "m) " + " >>> " + currentLocation5[2] + " ("
                    + distance3 + "m) " + " >>> " + currentLocation5[1] + " (" + distance2 + ") "
                    + "\nCalculated Distance: " + thirdRouteSchool + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + "  minute/s\n");

                    System.out.println("Fourth Route " + currentLocation5[5] + ":"+" (" + distance8 + "m) " + currentLocation5[3] + ": "
                    + " (" + distance4 + "m) "  + currentLocation5[2] + " >>> " + " (" + distance5 + "m) "  + currentLocation5[4] + " >>> " + " (" + distance6 + "m) "  + currentLocation5[0] + " >>> " + " (" + distance1 + "m) " 
                    + "\nCalculated Distance: " + fourthRouteSchool + "m\n");
                    System.out.println("Time: " + hours4 + " hour/s and " + minute4 + "  minute/s\n");

                
                    System.out.println();
                        if (firstRouteSchool <= secondRouteSchool && firstRouteSchool <= secondRouteSchool  && firstRouteSchool <= fourthRouteSchool) {
                            System.out.println("\nRECOMMENDED!\n");
                            System.out.println("You may take this route " + currentLocation5[5] + " (" + distance7 + "m) " + ": "
                            + currentLocation5[4] + " (" + distance6 + "m) " + currentLocation5[0] + " (" + distance1 + "m) "  + "\nCalculated Distance: "
                            + +firstRouteSchool + "m\n");

                            if (firstRouteSchool < 60) {
                                System.out.printf("\nThis is the quickest option: " + minute + "   minute/s\n");
                            } else {
                                System.out.printf(
                                        "\nThis is the quickest option: " + hours + " hour/s and " + minute + "   minute/s\n");

                            }
                        }

                         else if (secondRouteSchool < firstRouteSchool && secondRouteSchool <= thirdRouteSchool && secondRouteSchool <= fourthRouteSchool) {
                            System.out.println("RECOMMENDED!\n");
                            System.out.println("You may take this route " + currentLocation5[5] + " (" + distance7 + "m) " + ": "
                            + currentLocation5[2] + " (" + distance5 + "m) " + " >>> " + currentLocation5[1] + " ("
                            + distance3 + "m) " + " >>> " + currentLocation5[0] + " (" + distance2 + ") "
                            + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                            if (secondRouteSchool < 60) {
                                System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                            } else {
                                System.out
                                        .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "   minute/s\n");
                            }
                        }

                        else if (thirdRouteSchool <= firstRouteSchool &&  thirdRouteSchool <= secondRouteSchool && thirdRouteSchool <= fourthRouteSchool) {
                            System.out.println("RECOMMENDED!\n");
                            System.out.println("You may take this route " +currentLocation5[5] +":" + currentLocation5[3] + " (" + distance8 + "m) " + ": "
                            + currentLocation5[3] + " (" + distance4 + "m) " + " >>> " + currentLocation5[2] + " ("
                            + distance3 + "m) " + " >>> " + currentLocation5[1] + " (" + distance2 + ") "
                            + "\nCalculated Distance: " + thirdRouteSchool + "m\n");
                            if (thirdRouteSchool < 60) {
                                System.out.printf("\nThis is the quickest option: " + minute3 + "   minute/s\n");
                            } else {
                                System.out
                                        .printf("\nThis is the quickest option: " + hours3 + " and " + minute3 + "   minute/s\n");
                            }
                        }
                        else{
                            System.out.println("RECOMMENDED!\n");
                            System.out.println("You may take this route " + currentLocation5[5] + ":"+" (" + distance8 + "m) " + currentLocation5[3] + ": "
                            + " (" + distance4 + "m) "  + currentLocation5[2] + " >>> " + " (" + distance5 + "m) "  + currentLocation5[4] + " >>> " + " (" + distance6 + "m) "  + currentLocation5[0] + " >>> " + " (" + distance1 + "m) " 
                            + "\nCalculated Distance: " + fourthRouteSchool + "m\n");
                            if (fourthRouteSchool < 60) {
                                System.out.printf("\nThis is the quickest option: " + minute4 + "   minute/s\n");
                            } else {
                                System.out
                                        .printf("\nThis is the quickest option: " + hours4 + " and " + minute4 + "   minute/s\n");
                            }
                        }

                }

                // Route for Apartment - Hospital
                else if (menu.equalsIgnoreCase("HOSPITAL")) {

                    int firstRouteHospital = distance7 + distance5;
                    int secondRouteHospital = distance7 + distance6 +distance1 + distance2 + distance3;
                    int thirdRouteHospital = distance8 + distance4;

                    int minute = firstRouteHospital % 60;
                    int minute2 = secondRouteHospital % 60;
                    int minute3 = thirdRouteHospital% 60;
                    int hours = firstRouteHospital / 60;
                    int hours2 = secondRouteHospital / 60;
                    int hours3 = thirdRouteHospital / 60;

                    System.out.println("First Route " + currentLocation5[5] + " (" + distance7+ "m) " + ": "
                    + currentLocation5[2] + " (" + distance5 + "m)" + currentLocation5[2] + "\nCalculated Distance: "
                    +firstRouteHospital + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + "  minute/s\n");

                    System.out.println("Second Route " + currentLocation5[5] + " >>> " + ": " + currentLocation5[4]
                    + " (" + distance6 + "m) " + " >>> " + currentLocation5[0] + " (" + distance1 + "m) "
                    + " >>> " + currentLocation5[1] + " (" + distance2 + "m) " + currentLocation5[2] + " (" + distance3 + "m)" + "\nCalculated Distance: "
                    +secondRouteHospital + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + "  minute/s\n");
                    
                    System.out.println("Third Route " + currentLocation5[5] + " (" + distance8+ "m) " + ": "
                    + currentLocation5[3] + " (" + distance4 + "m)" + currentLocation5[2] + "\nCalculated Distance: "
                    +thirdRouteHospital + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + "  minute/s\n");
                    System.out.println();

                    if (firstRouteHospital <= secondRouteHospital  && firstRouteHospital <= thirdRouteHospital) {
                        System.out.println("\nRECOMMENDED!\n");

                        System.out.println("You may take this route " + currentLocation5[5] + " (" + distance7+ "m) " + ": "
                        + currentLocation5[2] + " (" + distance5 + "m)" + currentLocation5[2] + "\nCalculated Distance: "
                        +firstRouteHospital + "m\n");
                        if (firstRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "   minute/s\n");

                        }
                    }

                    else if (secondRouteHospital <= firstRouteHospital && secondRouteHospital <= thirdRouteHospital) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation5[5] + " >>> " + ": " + currentLocation5[4]
                        + " (" + distance6 + "m) " + " >>> " + currentLocation5[0] + " (" + distance1 + "m) "
                        + " >>> " + currentLocation5[1] + " (" + distance2 + "m) " + currentLocation5[2] + " (" + distance3 + "m)" + "\nCalculated Distance: "
                        +secondRouteHospital + "m\n");

                        if (secondRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "   minute/s\n");
                        }
                    }
                    else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take  this route " + currentLocation5[5] + " (" + distance8+ "m) " + ": "
                        + currentLocation5[3] + " (" + distance4 + "m)" + currentLocation5[2] + "\nCalculated Distance: "
                        +thirdRouteHospital + "m\n");
                        if (thirdRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "   minute/s\n");
                        }
                    }
                }

                // Route for Apartment - Mcdo
                else if (menu.equalsIgnoreCase("MCDO")) {

                    int firstRouteMcdo = distance7 + distance5 + distance4;
                    int secondRouteMcdo = distance7 + distance6 + distance1 + distance2 + distance3 + distance4;
                    int thirdRouteMcdo = distance8;

                    int minute = firstRouteMcdo % 60;
                    int minute2 = secondRouteMcdo % 60;
                    int minute3 = thirdRouteMcdo % 60;
                    int hours = firstRouteMcdo / 60;
                    int hours2 = secondRouteMcdo / 60;
                    int hours3 = thirdRouteMcdo / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation5[5] + " ("+distance7+"m) "  + ": " + currentLocation5[2]
                    + " (" + distance5 + "m) " + " >>> " + currentLocation5[3] + " (" + distance4 + "m)"
                    + "\nCalculated Distance: " + +firstRouteMcdo + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + "  minute/s\n");

                    System.out.println("Second Route " + currentLocation5[5] + " (" + distance7 + "m) " + ": "
                    + currentLocation5[4] + " (" + distance6 + "m) " + " >>> " + currentLocation5[0] + " ("
                    + distance1 + "m) " + " >>> " + currentLocation5[1] + " (" + distance2 + "m) " + " >>> "
                    + currentLocation5[2] + " (" + distance3 + "m)" + currentLocation5[3] +"\nCalculated Distance: "
                    + +secondRouteMcdo + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + "  minute/s\n");

                    System.out.println("Third Route " + currentLocation5[5] + " ("+distance8+"m) "  + ": " + currentLocation5[3]
                    + "\nCalculated Distance: " + thirdRouteMcdo + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + "  minute/s\n");

                    System.out.println();
                    
                    if (firstRouteMcdo <= secondRouteMcdo && firstRouteMcdo <= thirdRouteMcdo) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("First Route " + currentLocation5[5] + " ("+distance7+"m) "  + ": " + currentLocation5[2]
                        + " (" + distance5 + "m) " + " >>> " + currentLocation5[3] + " (" + distance4 + "m)"
                        + "\nCalculated Distance: " + +firstRouteMcdo + "m\n");

                        if (firstRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "   minute/s\n");

                        }
                    }

                    else if (secondRouteMcdo <= firstRouteMcdo && secondRouteMcdo <= thirdRouteMcdo) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Second Route " + currentLocation5[5] + " (" + distance7 + "m) " + ": "
                        + currentLocation5[4] + " (" + distance6 + "m) " + " >>> " + currentLocation5[0] + " ("
                        + distance1 + "m) " + " >>> " + currentLocation5[1] + " (" + distance2 + "m) " + " >>> "
                        + currentLocation5[2] + " (" + distance3 + "m)" + currentLocation5[3] +"\nCalculated Distance: "
                        + +secondRouteMcdo + "m\n");
                        if (secondRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "   minute/s\n");
                        }
                    }
                    else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("Third Route " + currentLocation5[5] + " ("+distance8+"m) "  + ": " + currentLocation5[3]
                        + "\nCalculated Distance: " + thirdRouteMcdo + "m\n");
    
                        if (secondRouteMcdo < 60) {
                            
                            System.out.printf("\nThis is the quickest option: " + minute3 + "   minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours3 + " and " + minute3 + "   minute/s\n");
                        }
                    }
                }

                // Route for Apartment - Jollibee
                else if (menu.equalsIgnoreCase("JOLLIBEE")) {

                    int firstRouteJollibee = distance7 + distance5 + distance3;
                    int secondRouteJollibee = distance7 + distance6 + distance1 + distance2;
                    int thirdRouteJollibee = distance8 + distance4 + distance3;

                    int minute = firstRouteJollibee % 60;
                    int minute2 = secondRouteJollibee % 60;
                    int minute3 = thirdRouteJollibee % 60;
                    int hours = firstRouteJollibee / 60;
                    int hours2 = secondRouteJollibee / 60;
                    int hours3 = thirdRouteJollibee % 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation5[5] + " ("+distance7+"m) "  + ": " + currentLocation5[2]
                    + " (" + distance5 + "m) >>> " + currentLocation5[1] + " (" + distance3 + "m)"
                    + "\nCalculated Distance: " + +firstRouteJollibee + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + "  minute/s\n");

                    System.out.println("Second Route " + currentLocation5[5] + " (" + distance7 + "m) " + ": "
                    + currentLocation5[4] + " (" + distance6 + "m) " + " >>> " + currentLocation5[0] + " ("
                    + distance1 + "m) " + currentLocation5[1] + " ("
                    + distance2 + "m) " + "\nCalculated Distance: " + +secondRouteJollibee + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + "  minute/s\n");

                    System.out.println("Third Route " + currentLocation5[5] + " ("+distance8+"m) "  + ": " + currentLocation5[3]
                    + " (" + distance4+ "m) >>> " + currentLocation5[2] + " (" + distance3 + "m)" +  currentLocation5[1]
                    + "\nCalculated Distance: " + +thirdRouteJollibee + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + "  minute/s\n");
                    System.out.println();

                    if (firstRouteJollibee <= secondRouteJollibee && firstRouteJollibee <= thirdRouteJollibee) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation5[5] + " ("+distance7+"m) "  + ": " + currentLocation5[2]
                        + " (" + distance5 + "m) >>> " + currentLocation5[1] + " (" + distance3 + "m)"
                        + "\nCalculated Distance: " + +firstRouteJollibee + "m\n");
                        if (firstRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "   minute/s\n");

                        }
                    }

                    else if (secondRouteJollibee <= firstRouteJollibee && secondRouteJollibee <= thirdRouteJollibee)  {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation5[5] + " (" + distance7 + "m) " + ": "
                        + currentLocation5[4] + " (" + distance6 + "m) " + " >>> " + currentLocation5[0] + " ("
                        + distance1 + "m) " + currentLocation5[1] + " ("
                        + distance2 + "m) " + "\nCalculated Distance: " + +secondRouteJollibee + "m\n");
                        if (secondRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours2 + "hour/s and " + minute2 + "   minute/s\n");
                        }
                    }
                    else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation5[5] + " ("+distance8+"m) "  + ": " + currentLocation5[3]
                        + " (" + distance4+ "m) >>> " + currentLocation5[2] + " (" + distance3 + "m)" +  currentLocation5[1]
                        + "\nCalculated Distance: " + +thirdRouteJollibee + "m\n");
                        if (secondRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours2 + "hour/s and " + minute2 + "   minute/s\n");
                        }
                    }
                }
                // route Apartment - SM
                else if (menu.equalsIgnoreCase("SM")) {

                    int firstRouteSM = distance7 + distance6;
                    int secondRouteSM = distance7 + distance5 + distance3 + distance2 + distance1 + distance6;
                    int thirdRouteSM = distance8 + distance4 + distance5 + distance6;
                    int fourthRouteSM = distance8 + distance4 + distance3 + distance2 + distance1 + distance6;

                    int minute = firstRouteSM % 60;
                    int minute2 = secondRouteSM % 60;
                    int minute3 = thirdRouteSM % 60;
                    int minute4 = fourthRouteSM % 60;
                    int hours = firstRouteSM / 60;
                    int hours2 = secondRouteSM / 60;
                    int hours3 = thirdRouteSM / 60;
                    int hours4 = fourthRouteSM / 60;


                    System.out.println("First Route " + currentLocation5[5] + " ("+distance7+"m) "  + ": " + currentLocation5[4]
                    + " (" + distance6 + "m)"
                    + "\nCalculated Distance: " + +firstRouteSM + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + "  minute/s\n");

                    System.out.println("Second Route " + currentLocation5[5] + " (" + distance7 + "m) " + ": "
                    + currentLocation5[2] + " (" + distance5 + "m) " + " >>> " + currentLocation5[1] + " ("
                    + distance3 + "m) " +currentLocation5[0] + " (" + distance2 + "m) " + " >>> " + currentLocation5[4] + " ("
                    + distance1 + "m) (" +  distance6 + "m) " +"\nCalculated Distance: " + secondRouteSM+ "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + "  minute/s\n");

                    System.out.println("Third Route " + currentLocation5[5] + " ("+distance8+"m) "  + ": " + currentLocation5[3]
                    + " (" + distance4 + "m) >>> " + currentLocation5[2] + " (" + distance5 + "m)" + currentLocation5[4] + " (" + distance6 + "m)"
                    + "\nCalculated Distance: " + +thirdRouteSM + "m\n");
                    System.out.println("Time: " + hours3 + " hour/s and " + minute3 + "  minute/s\n");

                    System.out.println("Fourth Route " + currentLocation5[4] + " (" + distance8 + "m) " + ": "
                    + currentLocation5[2] + " (" + distance4 + "m) " + " >>> " + currentLocation5[1] + " ("
                    + distance3 + "m) "  + currentLocation5[0] + " ("
                    + distance2 + "m) " + currentLocation5[4] + " ("
                    + distance1 + "m) ("+  distance6 + "m) " +  "\nCalculated Distance: " + fourthRouteSM +"m\n");
                    System.out.println("Time: " + hours4 + " hour/s and " + minute4 + "  minute/s\n");
                    System.out.println();

                    if (firstRouteSM <= secondRouteSM && firstRouteSM <= thirdRouteSM && firstRouteSM <= fourthRouteSM) {
                        System.out.println("\nRECOMMENDED!\n");

                        System.out.println("You may take this route " + currentLocation5[5] + " ("+distance7+"m) "  + ": " + currentLocation5[4]
                        + " (" + distance6 + "m)"
                        + "\nCalculated Distance: " + +firstRouteSM + "m\n");
                        if (firstRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "   minute/s\n");

                        }
                    }

                    else if (secondRouteSM <= firstRouteSM && secondRouteSM <= thirdRouteSM && secondRouteSM <= fourthRouteSM)  {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation5[5] + " (" + distance7 + "m) " + ": "
                        + currentLocation5[2] + " (" + distance5 + "m) " + " >>> " + currentLocation5[1] + " ("
                        + distance3 + "m) " +currentLocation5[0] + " (" + distance2 + "m) " + " >>> " + currentLocation5[4] + " ("
                        + distance1 + "m) (" +  distance6 + "m) " +"\nCalculated Distance: " + secondRouteSM+ "m\n");
                        if (secondRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours2 + "hour/s and " + minute2 + "   minute/s\n");
                        }
                    }

                    
                    else if (thirdRouteSM <= firstRouteSM && thirdRouteSM <= secondRouteSM && thirdRouteSM <= fourthRouteSM)  {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation5[5] + " ("+distance8+"m) "  + ": " + currentLocation5[3]
                        + " (" + distance4 + "m) >>> " + currentLocation5[2] + " (" + distance5 + "m)" + currentLocation5[4] + " (" + distance6 + "m)"
                        + "\nCalculated Distance: " + +thirdRouteSM + "m\n");
                        if (thirdRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours2 + "hour/s and " + minute2 + "   minute/s\n");
                        }
                    }
                    else{
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route " + currentLocation5[4] + " (" + distance8 + "m) " + ": "
                        + currentLocation5[2] + " (" + distance4 + "m) " + " >>> " + currentLocation5[1] + " ("
                        + distance3 + "m) "  + currentLocation5[0] + " ("
                        + distance2 + "m) " + currentLocation5[4] + " ("
                        + distance1 + "m) ("+  distance6 + "m) " +  "\nCalculated Distance: " + fourthRouteSM +"m\n");
                        if (fourthRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours2 + "hour/s and " + minute2 + "   minute/s\n");
                        }
                    }
                }

                break;

            default:
                System.out.printf("This is invalid. Try to enter the correct input base in map figure");
                break;

        
        }
    }
}
