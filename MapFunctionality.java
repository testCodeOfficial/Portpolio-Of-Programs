public class MapFunctionality {
    // DISPLAY ALL ROUTE
    public static void userDestination(String menu, String thecurrentLocation, String places[], int distance1,
            int distance2, int distance3, int distance4, int distance5, int distance6) {

        switch (thecurrentLocation) {
            
            // DISPLAY POSSIBLE ROUTE IN CURRENT LOCATION SCHOOL TO ALL
            case "SCHOOL":
                String currentLocation[] = { places[0], places[1], places[2], places[3], places[4] };

                System.out.println("\nPossible Route:" + "\n");

                // Route for School - Jollibee
                if (menu.equalsIgnoreCase("JOLLIBEE")) {

                    // function for distance
                    int firstRouteJollibee = distance2 + 2000;
                    int secondRouteJollibee = distance1 + distance6 + distance5 + distance3;

                    // function for time
                    int minute = firstRouteJollibee % 60;
                    int minute2 = secondRouteJollibee % 60;
                    int hours = firstRouteJollibee / 60;
                    int hours2 = secondRouteJollibee / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation[0] + " >>> " + ": " + currentLocation[1]  + " (" + distance2 + "m) " + "\nCalculated Distance: " + +firstRouteJollibee + "m");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation[0] + " (" + distance1 + "m) " + ": "  + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[2] + " ("   + distance5 + "m) " + " >>> " + currentLocation[1] + " (" + distance2 + "m) " + "\nCalculated Distance: " + secondRouteJollibee + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println();

                    if (firstRouteJollibee <= 60) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route: " + currentLocation[0] + " >>> " + ": " + currentLocation[1] + " (" + distance2 + "m) " + "\nCalculated Distance: " + +firstRouteJollibee + "m");
                        if (firstRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf( "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    
                    } else if (firstRouteJollibee < secondRouteJollibee) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route: " + currentLocation[0] + " >>> " + ": " + currentLocation[1] + " (" + distance2 + "m) " + "\nCalculated Distance: "   + +firstRouteJollibee + "m");
                        if (firstRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf("\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }else if (secondRouteJollibee <= 60) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route: " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance5 + "m) " + " >>> " + currentLocation[2]  + " (" + distance4 + "m) " + " >>> " + currentLocation[1] + " (" + distance2 + "m) "  + "\nCalculated Distance: " + secondRouteJollibee + "m\n");
                        if (secondRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }

                    } else if (secondRouteJollibee < firstRouteJollibee) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route: " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance5 + "m) " + " >>> " + currentLocation[2] + " (" + distance4 + "m) " + " >>> " + currentLocation[1] + " (" + distance2 + "m) "  + "\nCalculated Distance: " + secondRouteJollibee + "m\n");
                        if (secondRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out.printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }

                    }
                }

                // Route for School - Hospital
                else if (menu.equalsIgnoreCase("HOSPITAL")) {

                    int firstRouteHospital = distance2 + distance3;
                    int secondRouteHospital = distance1 + distance6 + distance5;

                    int minute = firstRouteHospital % 60;
                    int minute2 = secondRouteHospital % 60;
                    int hours = firstRouteHospital / 60;
                    int hours2 = secondRouteHospital / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation[0] + " >>> " + ": " + currentLocation[1]+ " (" + distance2 + "m) " + " >>> " + currentLocation[2] + " (" + distance3 + "m) " + "\nCalculated Distance: " + +firstRouteHospital + "m\n");
                    System.out.println("Time: " + hours + "hour/s and " +   minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[2] + " ("+ distance5 + "m) " + "\nCalculated Distance: " + +secondRouteHospital + "m\n");
                    System.out.println("Time: " + hours2 + "hour/s and " + + minute2 + " minute/s\n");
                    System.out.println();

                    if (firstRouteHospital <= 60) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation[0] + " >>> " + ": " + currentLocation[1] + " (" + distance2 + "m) " + " >>> " + currentLocation[2] + " (" + distance3 + "m) "   + "\nCalculated Distance: " + +firstRouteHospital + "m\n");
                        if (firstRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf( "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    } else if (firstRouteHospital < secondRouteHospital) {
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
                    } else if (secondRouteHospital <= 60) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route: " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[2] + " (" + distance5 + "m) " + " >>> " + "\nCalculated Distance: " + secondRouteHospital + "m\n");
                        if (secondRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out.printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }  else if (secondRouteHospital < firstRouteHospital) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route: " + currentLocation[0] + " (" + distance1 + "m) "  + ": " + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[2]  + " (" + distance5 + "m) " + " >>> " + "\nCalculated Distance: " + secondRouteHospital + "m\n");
                        if (secondRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out.printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                }

                // Route for School- Mcdo
                else if (menu.equalsIgnoreCase("MCDO")) {

                    int firstRouteMcdo = distance2 + distance3 + distance4;
                    int secondRouteMcdo = distance1 + distance6 + distance5 + distance4;

                    int minute = firstRouteMcdo % 60;
                    int minute2 = secondRouteMcdo % 60;
                    int hours = firstRouteMcdo / 60;
                    int hours2 = secondRouteMcdo / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation[0] + " >>> " + ": " + currentLocation[1] + " (" + distance2 + "m) " + " >>> " + currentLocation[2] + " (" + distance3 + "m) " + " >>> " + currentLocation[3] + " (" + distance4 + "m) " + "\nCalculated Distance: "+firstRouteMcdo + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[2] + " (" + distance5 + "m) " + " >>> " + currentLocation[3] + " (" + distance4 + "m) " + "\nCalculated Distance: " + +secondRouteMcdo + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");

                    if (firstRouteMcdo <= 60) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation[0] + " >>> " + ": " + currentLocation[1]+ " (" + distance2 + "m) " + " >>> " + currentLocation[2] + " (" + distance3 + "m) " + " >>> " + currentLocation[3] + " (" + distance4 + "m) " + "\nCalculated Distance: "+firstRouteMcdo + "m\n");
                        if (firstRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf("\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }else if (firstRouteMcdo < secondRouteMcdo) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[2] + " ("  + distance5 + "m) " + " >>> " + currentLocation[3] + " (" + distance4 + "m) " + "\nCalculated Distance: " + +secondRouteMcdo + "m\n");
                        if (secondRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }

                    }else if (secondRouteMcdo <= 60) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation[0] + " (" + distance1 + "m) " + ": "  + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[2] + " (" + distance5 + "m) " + " >>> " + currentLocation[3] + " (" + distance4 + "m) " + "\nCalculated Distance: " + +secondRouteMcdo + "m\n");
                        if (secondRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out.printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    } else if (secondRouteMcdo < firstRouteMcdo) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation[0] + " (" + distance1 + "m) " + ": "  + currentLocation[4] + " (" + distance6 + "m) " + " >>> " + currentLocation[2] + " (" + distance5 + "m) " + " >>> " + currentLocation[3] + " (" + distance4 + "m) " + "\nCalculated Distance: " + +secondRouteMcdo + "m\n");
                        if (secondRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out.printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                }

                // Route for School - SM
                else if (menu.equalsIgnoreCase("SM")) {

                    int firstRouteSM = distance1 + distance6;
                    int secondRouteSM = distance2 + distance3 + distance5 + distance6;

                    int minute = firstRouteSM % 60;
                    int minute2 = secondRouteSM % 60;
                    int hours = firstRouteSM / 60;
                    int hours2 = secondRouteSM / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) " + "\nCalculated Distance: "+ +firstRouteSM + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation[0] + " >>> " + ": " + currentLocation[1]+ " (" + distance2 + "m) " + " >>> " + currentLocation[2] + " (" + distance3 + "m) "+ " >>> " + currentLocation[4] + " (" + distance5 + "m), (" + distance6 + "m) " + "\nCalculated Distance: " + +secondRouteSM + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println();

                    if (firstRouteSM <= 60) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation[0] + " (" + distance1 + "m) " + ": " + currentLocation[4] + " (" + distance6 + "m) " + "\nCalculated Distance: " + +firstRouteSM + "m\n");
                        if (firstRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }

                    else if (firstRouteSM < secondRouteSM) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation[0] + " (" + distance1 + "m) " + ": "+ currentLocation[4] + " (" + distance6 + "m) " + "\nCalculated Distance: "+firstRouteSM + "m\n");
                        if (firstRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }

                    else if (secondRouteSM <= 60) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation[0] + " >>> " + ": " + currentLocation[1]+ " (" + distance2 + "m) " + " >>> " + currentLocation[2] + " (" + distance3 + "m) "+ " >>> " + currentLocation[4] + " (" + distance5 + "m), (" + distance6 + "m)  " + "\nCalculated Distance: "+secondRouteSM + "m\n");
                        if (secondRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }

                    else if (secondRouteSM < firstRouteSM) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation[0] + " >>> " + ": " + currentLocation[1] + " (" + distance2 + "m) " + " >>> " + currentLocation[2] + " (" + distance3 + "m) "+ " >>> " + currentLocation[4] + " (" + distance5 + "m), (" + distance6 + "m)  " + "\nCalculated Distance: " +secondRouteSM + "m\n");
                        if (secondRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                }
                
                break;

            // DISPLAY POSSIBLE ROUTE IN CURRENT LOCATION Jollibee TO ALL
            case "JOLLIBEE":

                String currentLocation1[] = { places[0], places[1], places[2], places[3], places[4] };

                System.out.println("\nPossible Route: " + "\n");

                // Route for Jollibee - School
                if (menu.equalsIgnoreCase("SCHOOL")) {

                    int firstRouteSchool = distance2;
                    int secondRouteSchool = distance3 + distance5 + distance6 + distance1;

                    int minute = firstRouteSchool % 60;
                    int minute2 = secondRouteSchool % 60;
                    int hours = firstRouteSchool / 60;
                    int hours2 = secondRouteSchool / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation1[1] + ": " + currentLocation1[0] + " (" + distance2 + "m) " + "\nCalculated Distance: " + +firstRouteSchool + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation1[1] + " (" + distance3 + "m) " + ": " + currentLocation1[2] + " (" + distance5 + "m) " + " >>> " + currentLocation1[4] + " ("+ distance6 + "m)" + " >>> " + currentLocation1[0] + " (" + distance1 + ") " + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println();

                    if (firstRouteSchool <= 60) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + ": " + currentLocation1[0] + " (" + distance2 + "m) " + "\nCalculated Distance: " + +firstRouteSchool + "m\n");

                        if (firstRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }

                    else if (firstRouteSchool < secondRouteSchool) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + ": " + currentLocation1[0] + " (" + distance2 + "m) " + "\nCalculated Distance: " + +firstRouteSchool + "m\n");

                        if (firstRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }

                    else if (secondRouteSchool <= 60) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + " (" + distance3 + "m) " + ": " + currentLocation1[2] + " (" + distance5 + "m) " + " >>> " + currentLocation1[4] + " (" + distance6 + "m) " + ">>> " + currentLocation1[0] + " (" + distance1 + ") " + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                        if (secondRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }

                    else if (secondRouteSchool < firstRouteSchool) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + " (" + distance3 + "m) " + ": " + currentLocation1[2] + " (" + distance5 + "m) " + " >>> " + currentLocation1[4] + " (" + distance6 + "m) " + ">>> " + currentLocation1[0] + " (" + distance1 + ") " + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                        if (secondRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                }

                // Route for Jollibee - Hospital
                else if (menu.equalsIgnoreCase("HOSPITAL")) {

                    int firstRouteHospital = distance3;
                    int secondRouteHospital = distance2 + distance1 + distance6 + distance5;

                    int minute = firstRouteHospital % 60;
                    int minute2 = secondRouteHospital % 60;
                    int hours = firstRouteHospital / 60;
                    int hours2 = secondRouteHospital / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation1[1] + " >>> " + ": " + currentLocation1[2]  + " (" + distance3 + "m) " + "\nCalculated Distance: " + +firstRouteHospital + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation1[1] + " (" + distance2 + "m) " + ": " + currentLocation1[0] + " (" + distance1 + "m) " + " >>> " + currentLocation1[4] + " (" + distance6 + "m) " + " >>> " + currentLocation1[2] + " (" + distance5 + "m) " + "\nCalculated Distance: "  +secondRouteHospital + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println();
                    
                    if (firstRouteHospital <= 60) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + " >>> " + ": " + currentLocation1[2]  + " (" + distance3 + "m) " + "\nCalculated Distance: " + +firstRouteHospital + "m\n");

                        if (firstRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }
                    
                    else if (firstRouteHospital < secondRouteHospital) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + " >>> " + ": " + currentLocation1[2]
                                + " (" + distance3 + "m) " + "\nCalculated Distance: " + +firstRouteHospital + "m\n");

                        if (firstRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    } else if (secondRouteHospital <= 60) {
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
                    } else if (secondRouteHospital < firstRouteHospital) {
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

                }

                // Route for Jollibee - Mcdo
                else if (menu.equalsIgnoreCase("MCDO")) {

                    int firstRouteMcdo = distance3 + distance4;
                    int secondRouteMcdo = distance2 + distance1 + distance6 + distance5 + distance4;

                    int minute = firstRouteMcdo % 60;
                    int minute2 = secondRouteMcdo % 60;
                    int hours = firstRouteMcdo / 60;
                    int hours2 = secondRouteMcdo / 60;
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
                    System.out.println();


                    if (firstRouteMcdo <= 60) {
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
                    }  else if (firstRouteMcdo < secondRouteMcdo ) {
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
                    } else if (secondRouteMcdo <= 60) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + " (" + distance2 + "m) " + ": "
                                + currentLocation1[0] + " (" + distance1 + "m) " + " >>> " + currentLocation1[4] + " ("
                                + distance6 + "m) " + " >>> " + currentLocation1[2] + " (" + distance5 + "m) " + " >>> "
                                + currentLocation1[3] + "(" + distance4 + "m) " + "\nCalculated Distance: "
                                + +secondRouteMcdo + "m\n");
                        if (firstRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }  else if (secondRouteMcdo < firstRouteMcdo) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation1[1] + " (" + distance2 + "m) " + ": "
                                + currentLocation1[0] + " (" + distance1 + "m) " + " >>> " + currentLocation1[4] + " ("
                                + distance6 + "m) " + " >>> " + currentLocation1[2] + " (" + distance5 + "m) " + " >>> "
                                + currentLocation1[3] + "(" + distance4 + "m) " + "\nCalculated Distance: "
                                + +secondRouteMcdo + "m\n");
                        if (firstRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }

                }

                // Route for Jollibee - SM
                else if (menu.equalsIgnoreCase("SM")) {

                    int firstRouteSM = distance3 + distance5 + distance6;
                    int secondRouteSM = distance2 + distance1 + distance6;

                    int minute = firstRouteSM % 60;
                    int minute2 = secondRouteSM % 60;
                    int hours = firstRouteSM / 60;
                    int hours2 = secondRouteSM / 60;
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
                    System.out.println();

                    if (firstRouteSM <= 60) {
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
                    }   else if (firstRouteSM < secondRouteSM) {
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

                    else if (secondRouteSM <= 60) {
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
                    }  else if (secondRouteSM < firstRouteSM) {
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
                
                break;
            }
            // DISPLAY POSSIBLE ROUTE IN CURRENT LOCATION HOSPITAL TO ALL
            case "HOSPITAL":
                String currentLocation2[] = { places[0], places[1], places[2], places[3], places[4] };

                System.out.println("\nPossible Route: " + "\n");

                // Route for Hospital - School
                if (menu.equalsIgnoreCase("SCHOOL")) {

                    int firstRouteSchool = distance3 + distance2;
                    int secondRouteSchool = distance5 + distance6 + distance1;

                    int minute = firstRouteSchool % 60;
                    int minute2 = secondRouteSchool % 60;
                    int hours = firstRouteSchool / 60;
                    int hours2 = secondRouteSchool / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation2[2] + " >>> " + ": " + currentLocation2[1]
                    + " (" + distance3 + "m) " + currentLocation2[0] + " (" + distance2 + "m) "
                    + "\nCalculated Distance: " + +firstRouteSchool + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation2[2] + " (" + distance5 + "m) " + ": "
                    + currentLocation2[4] + " (" + distance6 + "m) " + " >>> " + currentLocation2[0] + " ("
                    + distance1 + "m) " + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println();
                    
                    if (firstRouteSchool <= 60) {
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
                    }   else if (firstRouteSchool < secondRouteSchool) {
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

                    else if (secondRouteSchool <= 60) {
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
                    else if (secondRouteSchool < firstRouteSchool) {
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
                }

                // Route for Hospital - Jollibee
                else if (menu.equalsIgnoreCase("JOLLIBEE")) {

                    int firstRouteJollibee = distance3;
                    int secondRouteJollibee = distance5 + distance6 + distance1 + distance2;

                    int minute = firstRouteJollibee % 60;
                    int minute2 = secondRouteJollibee % 60;
                    int hours = firstRouteJollibee / 60;
                    int hours2 = secondRouteJollibee / 60;
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
                    System.out.println();

                    if (firstRouteJollibee <= 60) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation2[2] + " >>> " + ": " + currentLocation2[1]
                                + " (" + distance3 + "m) " + "\nCalculated Distance: " + +firstRouteJollibee + "m\n");
                        if (firstRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }   else if (firstRouteJollibee < secondRouteJollibee) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation2[2] + " >>> " + ": " + currentLocation2[1]
                                + " (" + distance3 + "m) " + "\nCalculated Distance: " + +firstRouteJollibee + "m\n");
                        if (firstRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    } else if (secondRouteJollibee <= 60) {
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
                    }   else if (secondRouteJollibee < firstRouteJollibee) {
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
                }

                // Route for Hospital - Mcdo
                else if (menu.equalsIgnoreCase("MCDO")) {

                    int firstRouteMcdo = distance4;
                    int secondRouteMcdo = distance5 + distance6 + distance1 + distance2 + distance3 + distance4;
                    int thirdRouteMcdo = distance3 + distance2 + distance1 + distance6 + distance5 + distance4;

                    int minute = firstRouteMcdo % 60;
                    int minute2 = secondRouteMcdo % 60;
                    int minute3 = thirdRouteMcdo % 60;
                    int hours = firstRouteMcdo / 60;
                    int hours2 = secondRouteMcdo / 60;
                    int hours3 = thirdRouteMcdo / 60;
                    int time[] = { minute, minute2, minute3 };
                    int time2[] = { hours, hours2, hours3 };

                    System.out.println("First Route " + currentLocation2[2] + " >>> " + ": " + currentLocation2[3]
                    + " (" + distance4 + "m) " + "\nCalculated Distance: " + +firstRouteMcdo + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println();

                    if (firstRouteMcdo == firstRouteMcdo) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation2[2] + " >>> " + ": " + currentLocation2[3]
                                + " (" + distance4 + "m) " + "\nCalculated Distance: " + +firstRouteMcdo + "m\n");
                        if (firstRouteMcdo < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }
                }

                // Route for Hospital - SM
                else if (menu.equalsIgnoreCase("SM")) {

                    int firstRouteSM = distance5 + distance6;
                    int secondRouteSM = distance3 + distance2 + distance6 + distance5;

                    int minute = firstRouteSM % 60;
                    int minute2 = secondRouteSM % 60;
                    int hours = firstRouteSM / 60;
                    int hours2 = secondRouteSM / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation2[2] + " (" + distance5 + "m) " + ": "
                    + currentLocation2[4] + " (" + distance6 + "m) " + "\nCalculated Distance: "
                    +firstRouteSM + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation2[2] + " (" + distance3 + "m) " + ": "
                    + currentLocation2[1] + " (" + distance2 + "m) " + " >>> " + currentLocation2[2] + " ("
                    + distance6 + "m) " + " >>> " + currentLocation2[4] + " (" + distance5 + "m) "
                    + "\nCalculated Distance: " + +secondRouteSM + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println();

                    if (firstRouteSM <= 60) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation2[2] + " (" + distance5 + "m) " + ": "
                                + currentLocation2[4] + " (" + distance6 + "m) " + "\nCalculated Distance: "
                                + +firstRouteSM + "m\n");
                        if (firstRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }   else if (firstRouteSM < secondRouteSM) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation2[2] + " (" + distance5 + "m) " + ": "
                                + currentLocation2[4] + " (" + distance6 + "m) " + "\nCalculated Distance: "
                                + +firstRouteSM + "m\n");
                        if (firstRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }

                    else if (secondRouteSM <= 60) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation2[2] + " (" + distance3 + "m) " + ": "
                                + currentLocation2[1] + " (" + distance2 + "m) " + " >>> " + currentLocation2[2] + " ("
                                + distance6 + "m) " + " >>> " + currentLocation2[4] + " (" + distance5 + "m) "
                                + "\nCalculated Distance: " + +secondRouteSM + "m\n");
                        if (secondRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }   else if (secondRouteSM < firstRouteSM) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation2[2] + " (" + distance3 + "m) " + ": "
                                + currentLocation2[1] + " (" + distance2 + "m) " + " >>> " + currentLocation2[2] + " ("
                                + distance6 + "m) " + " >>> " + currentLocation2[4] + " (" + distance5 + "m) "
                                + "\nCalculated Distance: " + +secondRouteSM + "m\n");
                        if (secondRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                }

                break;

            // DISPLAY POSSIBLE ROUTE IN MCDO
            case "MCDO":
                String currentLocation3[] = { places[0], places[1], places[2], places[3], places[4] };

                System.out.println("\nPossible Route: " + "\n");
                // Route for Mcdo - School
                if (menu.equalsIgnoreCase("SCHOOL")) {
                    
                    int firstRouteSchool = distance4 + distance3 + distance2;
                    int secondRouteSchool = distance4 + distance5 + distance6 + distance1;

                    int minute = firstRouteSchool % 60;
                    int minute2 = secondRouteSchool % 60;
                    int hours = firstRouteSchool / 60;
                    int hours2 = secondRouteSchool / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                    + currentLocation3[2] + " (" + distance3 + "m)  >>> " + currentLocation3[1] + " ("
                    + distance2 + "m)  >>> " + currentLocation3[0] + "\nCalculated Distance: "
                    + +firstRouteSchool + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println("Second Route " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                    + currentLocation3[2] + " (" + distance5 + "m) " + " >>> " + currentLocation3[4] + " ("
                    + distance6 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + ") "
                    + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + " minute/s\n");
                    System.out.println();

                    if (firstRouteSchool <= 60) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                                + currentLocation3[2] + " (" + distance3 + "m)  >>> " + currentLocation3[1] + " ("
                                + distance2 + "m)  >>> " + currentLocation3[0] + "\nCalculated Distance: "
                                + +firstRouteSchool + "m\n");
                        if (firstRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    } else if (firstRouteSchool < secondRouteSchool) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                                + currentLocation3[2] + " (" + distance3 + "m)  >>> " + currentLocation3[1] + " ("
                                + distance2 + "m)  >>> " + currentLocation3[0] + "\nCalculated Distance: "
                                + +firstRouteSchool + "m\n");
                        if (firstRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }else if (secondRouteSchool <= 60) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                                + currentLocation3[2] + " (" + distance5 + "m) " + " >>> " + currentLocation3[4] + " ("
                                + distance6 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + ") "
                                + "\nCalculated Distance: " + secondRouteSchool + "m\n");
                        if (secondRouteSchool < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    } else if (secondRouteSchool < firstRouteSchool) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
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
                }

                // Route for Mcdo - Hospital
                else if (menu.equalsIgnoreCase("HOSPITAL")) {

                    int firstRouteHospital = distance4;
                    int secondRouteHospital = distance4 + distance5 + distance6 + distance1 + distance2 + distance3;

                    int minute = firstRouteHospital % 60;
                    int minute2 = secondRouteHospital % 60;
                    int hours = firstRouteHospital / 60;
                    int hours2 = secondRouteHospital / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation3[3] + " >>> " + ": " + currentLocation3[2]
                    + " (" + distance4 + "m) " + "\nCalculated Distance: " + +firstRouteHospital
                    + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + " minute/s\n");
                    System.out.println();

                    if (firstRouteHospital == firstRouteHospital) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation3[3] + " >>> " + ": " + currentLocation3[2]
                                + " (" + distance4 + "m) " + "\nCalculated Distance: " + +firstRouteHospital
                                + "m\n");
                        if (firstRouteHospital < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }
                }


                // Route for Mcdo - Jollibee
                else if (menu.equalsIgnoreCase("JOLLIBEE")) {

                    int firstRouteJollibee = distance4 + distance3;
                    int secondRouteJollibee = distance4 + distance5 + distance6 + distance1 + distance2;

                    int minute = firstRouteJollibee % 60;
                    int minute2 = secondRouteJollibee % 60;
                    int hours = firstRouteJollibee / 60;
                    int hours2 = secondRouteJollibee / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

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
                    System.out.println();

                    if (firstRouteJollibee <= 60) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation3[3] + " >>> " + ": " + currentLocation3[2]
                                + " (" + distance4 + "m) " + " >>> " + currentLocation3[1] + " (" + distance3 + "m) "
                                + "\nCalculated Distance: " + +firstRouteJollibee + "m\n");
                        if (firstRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }  else if (firstRouteJollibee < secondRouteJollibee) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation3[3] + " >>> " + ": " + currentLocation3[2]
                                + " (" + distance4 + "m) " + " >>> " + currentLocation3[1] + " (" + distance3 + "m) "
                                + "\nCalculated Distance: " + +firstRouteJollibee + "m\n");
                        if (firstRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }

                    else if (secondRouteJollibee <= 60) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                                + currentLocation3[2] + " (" + distance5 + "m) " + " >>> " + currentLocation3[4] + " ("
                                + distance6 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + "m) " + " >>> "
                                + currentLocation3[1] + " (" + distance2 + "m) " + "\nCalculated Distance: "
                                + +secondRouteJollibee + "m\n");
                        if (secondRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }   else if ( secondRouteJollibee < firstRouteJollibee) {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                                + currentLocation3[2] + " (" + distance5 + "m) " + " >>> " + currentLocation3[4] + " ("
                                + distance6 + "m) " + " >>> " + currentLocation3[0] + " (" + distance1 + "m) " + " >>> "
                                + currentLocation3[1] + " (" + distance2 + "m) " + "\nCalculated Distance: "
                                + +secondRouteJollibee + "m\n");
                        if (secondRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "  minute/s\n");
                        } else {
                            System.out
                                    .printf("\nThis is the quickest option: " + hours2 + " and " + minute2 + "  minute/s\n");
                        }
                    }
                }

                // Route for SM
                else if (menu.equalsIgnoreCase("SM")) {

                    int firstRouteSM = distance4 + distance5 + distance6;
                    int secondRouteSM = distance4 + distance3 + distance2 + distance1 + distance6;

                    int minute = firstRouteSM % 60;
                    int minute2 = secondRouteSM % 60;
                    int hours = firstRouteSM / 60;
                    int hours2 = secondRouteSM / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

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
                    System.out.println();

                    if (firstRouteSM <= 60) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                                + currentLocation3[2] + " (" + distance5 + "m)  >>> " + currentLocation3[4] + " ("
                                + distance6 + "m) " + "\nCalculated Distance: " + +firstRouteSM + "m\n");
                        if (firstRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }   else if (firstRouteSM < secondRouteSM) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation3[3] + " (" + distance4 + "m) " + ": "
                                + currentLocation3[2] + " (" + distance5 + "m)  >>> " + currentLocation3[4] + " ("
                                + distance6 + "m) " + "\nCalculated Distance: " + +firstRouteSM + "m\n");
                        if (firstRouteSM < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "  minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "  minute/s\n");

                        }
                    }  else if (secondRouteSM <= 60) {
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
                    }  else if (secondRouteSM < firstRouteSM) {
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
                }

                break;

            // DISPLAY ALL POSIBLE ROUTE IN SM
            case "SM":
                String currentLocation4[] = { places[0], places[1], places[2], places[3], places[4] };

                System.out.println("\nPossible Route: " + "\n");
                // Route for Sm - School
                if (menu.equalsIgnoreCase("SCHOOL")) {
                    
                    int firstRouteSchool = distance6 + distance1; int secondRouteSchool = distance6 + distance5 + distance3 + distance2;

                    int minute = firstRouteSchool % 60;
                    int minute2 = secondRouteSchool % 60;
                    int hours = firstRouteSchool / 60;
                    int hours2 = secondRouteSchool / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

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

                        if (firstRouteSchool <= 60) {
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
                        }    else if (firstRouteSchool < secondRouteSchool) {
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

                        else if (secondRouteSchool <= 60) {
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
                        }   else if (secondRouteSchool < firstRouteSchool) {
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

                }

                // Route for Sm - Hospital
                else if (menu.equalsIgnoreCase("HOSPITAL")) {

                    int firstRouteHospital = distance6 + distance5;
                    int secondRouteHospital = distance1 + distance2 + distance3;

                    int minute = firstRouteHospital % 60;
                    int minute2 = secondRouteHospital % 60;
                    int hours = firstRouteHospital / 60;
                    int hours2 = secondRouteHospital / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                    + currentLocation4[2] + " (" + distance5 + "m)" + "\nCalculated Distance: "
                    +firstRouteHospital + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + "  minute/s\n");
                    System.out.println("Second Route " + currentLocation4[4] + " >>> " + ": " + currentLocation4[0]
                    + " (" + distance1 + "m) " + " >>> " + currentLocation4[1] + " (" + distance2 + "m) "
                    + " >>> " + currentLocation4[2] + " (" + distance3 + "m) " + "\nCalculated Distance: "
                    +secondRouteHospital + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + "  minute/s\n");
                    System.out.println();

                    if (firstRouteHospital <= 60) {
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
                    }   else if (firstRouteHospital < secondRouteHospital) {
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

                    else if (secondRouteHospital <= 60) {
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
                    }   else if (secondRouteHospital < firstRouteHospital ) {
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
                }

                // Route for Sm - Mcdo
                else if (menu.equalsIgnoreCase("MCDO")) {

                    int firstRouteMcdo = distance6 + distance5 + distance4;
                    int secondRouteMcdo = distance6 + distance1 + distance2 + distance3 + distance4;

                    int minute = firstRouteMcdo % 60;
                    int minute2 = secondRouteMcdo % 60;
                    int hours = firstRouteMcdo / 60;
                    int hours2 = secondRouteMcdo / 60;
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
                    System.out.println();
                    
                    if (firstRouteMcdo <= 60) {
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
                    }   else if (firstRouteMcdo < secondRouteMcdo) {
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

                    else if (secondRouteMcdo <= 60) {
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
                    }    else if (secondRouteMcdo < firstRouteMcdo) {
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
                    }
                }

                // Route for Sm - Jollibee
                else if (menu.equalsIgnoreCase("JOLLIBEE")) {

                    int firstRouteJollibee = distance6 + distance1 + distance2;
                    int secondRouteJollibee = distance6 + distance5 + distance3;

                    int minute = firstRouteJollibee % 60;
                    int minute2 = secondRouteJollibee % 60;
                    int hours = firstRouteJollibee / 60;
                    int hours2 = secondRouteJollibee / 60;
                    int time[] = { minute, minute2 };
                    int time2[] = { hours, hours2 };

                    System.out.println("First Route " + currentLocation4[4] + " ("+distance6+"m) "  + ": " + currentLocation4[0]
                    + " (" + distance1 + "m) >>> " + currentLocation4[1] + " (" + distance2 + "m)"
                    + "\nCalculated Distance: " + +firstRouteJollibee + "m\n");
                    System.out.println("Time: " + hours + " hour/s and " + minute + "  minute/s\n");
                    System.out.println("Second Route " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                    + currentLocation4[2] + " (" + distance5 + "m) " + " >>> " + currentLocation4[1] + " ("
                    + distance3 + "m) " + "\nCalculated Distance: " + +secondRouteJollibee + "m\n");
                    System.out.println("Time: " + hours2 + " hour/s and " + minute2 + "  minute/s\n");
                    System.out.println();

                    if (firstRouteJollibee <= 60) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation4[4] + " ("+distance6+"m) " + ": " + currentLocation4[0]
                                + " (" + distance1 + "m) >>> " + currentLocation4[1] + " (" + distance2 + "m)"
                                + "\nCalculated Distance: " + +firstRouteJollibee + "m\n");
                        if (firstRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "   minute/s\n");

                        }
                    }   else if (firstRouteJollibee < secondRouteJollibee) {
                        System.out.println("\nRECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation4[4] + " ("+distance6+"m) " + ": " + currentLocation4[0]
                                + " (" + distance1 + "m) >>> " + currentLocation4[1] + " (" + distance2 + "m)"
                                + "\nCalculated Distance: " + +firstRouteJollibee + "m\n");
                        if (firstRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours + " hour/s and " + minute + "   minute/s\n");

                        }
                    }

                    else if (secondRouteJollibee <= 60)  {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                                + currentLocation4[2] + " (" + distance5 + "m) " + " >>> " + currentLocation4[1] + " ("
                                + distance3 + "m) " + "\nCalculated Distance: " + +secondRouteJollibee + "m\n");
                        if (secondRouteJollibee < 60) {
                            System.out.printf("\nThis is the quickest option: " + minute2 + "   minute/s\n");
                        } else {
                            System.out.printf(
                                    "\nThis is the quickest option: " + hours2 + "hour/s and " + minute2 + "   minute/s\n");
                        }
                    }    else if (secondRouteJollibee < firstRouteJollibee)  {
                        System.out.println("RECOMMENDED!\n");
                        System.out.println("You may take this route:  " + currentLocation4[4] + " (" + distance6 + "m) " + ": "
                                + currentLocation4[2] + " (" + distance5 + "m) " + " >>> " + currentLocation4[1] + " ("
                                + distance3 + "m) " + "\nCalculated Distance: " + +secondRouteJollibee + "m\n");
                        if (secondRouteJollibee < 60) {
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
