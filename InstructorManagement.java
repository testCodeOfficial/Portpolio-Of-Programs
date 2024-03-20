import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

interface forMethodInInstructor {
    void addingInstructor();

    void deleteInstructor();

    void displayingDataOfInstructors();

    void editInstructor();

    void searchInstructor();
}

public class InstructorManagement extends UMPS implements forMethodInInstructor {

    private static Scanner s = new Scanner(System.in);
    // ADDING INSTRUCTORS METHOD
    static ThisIsForInstructor ins = new ThisIsForInstructor();

    @Override
    public void addingInstructor() {
        do {
            String[] iDetails = insInformation("instructorDeatails");

            if (iDetails.length == 0) {
                System.out.println("The instructor cancelled application");
                return;
            }

            else {
                System.out.println("The instructor was been enrolled in.");
                ins.instantiateOfInstructor();
                String insId = ins.getTheInstructorId();
                iDetails[5] = insId;

                for (String[] instructor : forInstructors) {
                    System.out.println(Arrays.toString(instructor));
                }
                forInstructors.add(iDetails);
                for(int i = 0; i < forInstructors.size(); i++){

                    System.out.println(forInstructors.get(i));

                }
            }
        } while (addAgain());

    }

    // DELETE INSTRUCTOR METHOD
    @Override
    public void deleteInstructor() {
        do {
            System.out.print("\nEnter the Instructor ID \"INS" + year + "-1234\": ");
            String deleteInsID = s.nextLine().trim();
            if(deleteInsID.isBlank()){
                System.out.println("The instructor id can't be blank.");
            } else{
            boolean isFound = false;

            for (int i = forInstructors.size() - 1; i >= 0; i--) {
                String[] instructor = forInstructors.get(i);

                if (instructor.length > 5) {
                    String deletionOfInstructor = instructor[5];

                    if (deletionOfInstructor.endsWith(deleteInsID)) {
                        isFound = true;
                        System.out.println(deleteInsID + " Code is processing... for deleting .");
                        System.out.println();
                        String adminConfirmation;
                        System.out.printf(
                                "Admin: Are you sure you want to delete this instructor data we need as confirmation.\nChoice [Y/N]: ");
                        adminConfirmation = s.nextLine().trim();

                        if (adminConfirmation.equalsIgnoreCase("Y")) {
                            forInstructors.remove(i);
                            System.out.println("This instructor profile is now confirm deleted.");
                            break;
                        } else {
                            System.out.println("This instructor is not confirm deleted in database");

                        }
                        break;
                    }
                }

            }
            if (!isFound) {
                System.out.println("This instructor with this id \"" + deleteInsID + "\" is not existing.");
            }
        }
        } while (deleteAgain());
    }

    // EDITING INSTRUCTOR METHOD
    @Override
    public void editInstructor() {
        do {
            // Scanner editScanner = new Scanner(System.in);
            System.out.print("\nEnter the Instructor ID \"INS" + year + "-1234\" : ");
            String editInsID = s.nextLine().trim();

            // if (!editID.matches("\\d{4}$")) {
            // System.out.println("Invalid input format. Instructor ID should contain only 4
            // digits.");
            // return;
            // }

            if (editInsID.isBlank()) {
                System.out.println("The instructor is blank");
            } else {
                boolean isFound = false;

                for (String insDetails[] : forInstructors) {
                    if (insDetails.length > 5 && insDetails[5].contains(editInsID)) {
                        isFound = true;
                        System.out.println("\n< The instructor is in the database > ".toUpperCase());
                        System.out.print("\n|First Name: " + insDetails[0] + " | Last Name: " + insDetails[1]
                                + " | Middle Name: " + insDetails[2] + " | Address: " + insDetails[3] + " | Age: "
                                + insDetails[4] + " |\n");
                        System.out.println();

                        System.out.print(
                                "\nDo you want to edit this instructor?\n[Y] Yes, I want to edit it\n[N] No, maybe later\n");
                        String eIns = s.nextLine().trim().toUpperCase();

                        boolean editForAll = false;
                        if (eIns.equalsIgnoreCase("Y")) {
                            System.out.println("Proceed to edit your profile");

                            while (!editForAll) {
                                System.out.print("Enter your inew first name: ");
                                String newInstructorFirstName = s.nextLine();

                                if (newInstructorFirstName.isBlank()) {
                                    System.out.println("First name is empty, Fill it");
                                } else if (newInstructorFirstName.matches(".*\\d.*")) {
                                    System.out.println("First name can't contain any number");
                                } else {
                                    insDetails[0] = newInstructorFirstName;
                                    break;
                                }
                            }

                            while (!editForAll) {
                                System.out.print("Enter your new last name: ");
                                String newInstructorLastName = s.nextLine();

                                if (newInstructorLastName.isBlank()) {
                                    System.out.println("Last name is empty, Fill it");
                                } else if (newInstructorLastName.matches(".*\\d.*")) {
                                    System.out.println("Last name can't contain any number");
                                } else {
                                    insDetails[1] = newInstructorLastName;
                                    break;
                                }
                            }

                            while (!editForAll) {
                                System.out.print("Enter your new middle name (Optional): ");
                                String newInstructorMiddleName = s.nextLine();
                                if (newInstructorMiddleName.matches(".*\\d.*")) {
                                    System.out.println("Middle name can't contain any number");
                                } else {
                                    insDetails[2] = newInstructorMiddleName;
                                    break;
                                }
                            }

                            while (!editForAll) {
                                System.out.print("Enter your new address: ");
                                String newInstructorAddress = s.nextLine();

                                if (newInstructorAddress.isBlank()) {
                                    System.out.println("Address is empty, Fill it");
                                } else {
                                    insDetails[3] = newInstructorAddress;
                                    break;
                                }
                            }

                            while (!editForAll) {
                                System.out.print("Enter your new age: ");
                                String newInsAgeInput = s.nextLine();
                                try {
                                    int newAge = Integer.parseInt(newInsAgeInput);
                                    if (newAge >= 24 && newAge <= 100) {
                                        insDetails[4] = newInsAgeInput;
                                        break;
                                    } else {
                                        if (newAge >= 24 && newAge <= 100) {
                                            System.out.println("You're age must be 24 to 100 y/olds.");
                                        } else {
                                            System.out.println("Age doesn't meet the requirement for instructor.");
                                        }
                                    }
                                } catch (Exception e) {
                                    System.out.printf("This [%s] is invalid, Please Enter the valid Choices.\n",
                                            newInsAgeInput);
                                }

                                int updAge = Integer.parseInt(insDetails[4]);
                                if (updAge >= 24 && updAge <= 100) {
                                    System.out.println("You're a Instructor.");
                                }
                            }

                            System.out.println("Your profile was succesfully updated.");
                        } else if (eIns.equalsIgnoreCase("N")) {
                            System.out.println("Your editing profile is not updated.");
                        } else {
                            System.out.println("Invalid Input.");
                        }
                        break;

                    }
                }
                if (!isFound) {
                    System.out.println("This ID is not existing, try to add first");
                }
            }
        } while (editAgain());
    }

    // SEARCHING INSTRUCTOR METHOD
    @Override
    public void searchInstructor() {
        do {
            // Scanner insSearch = new Scanner(System.in);
            System.out.println("Search Instructors: ");
            String instructorSearched = s.nextLine();
            if(instructorSearched.isBlank()){
                System.out.println("The instructor id can't be blank.");
            } else {
            boolean found = false;
            for (String[] instructor : forInstructors) {
                if (instructor.length > 5 && 
                        (instructor[0].toUpperCase().contains(instructorSearched.toUpperCase()) ||
                                instructor[1].toUpperCase().contains(instructorSearched.toUpperCase()) ||
                                (instructor[2] != null
                                        && instructor[2].toUpperCase().contains(instructorSearched.toUpperCase()))
                                ||
                                instructor[3].toUpperCase().contains(instructorSearched.toUpperCase()) ||
                                (instructor[4] != null && instructor[4].contains(instructorSearched)) ||
                                (instructor[5] != null && instructor[5].toUpperCase().contains(instructorSearched)))) {
                    System.out.println("\nInstructor Found:");
                    System.out.println("First Name:    " + instructor[0]);
                    System.out.println("Last Name:     " + instructor[1]);
                    System.out.println("Middle Name:   " + (instructor[2] != null ? instructor[2] : ""));
                    System.out.println("Address:       " + instructor[3]);
                    System.out.println("Age:           " + (instructor[4] != null ? instructor[4] : ""));
                    System.out.println("ID:            " + (instructor[5] != null ? instructor[5] : ""));
                    for(String sub[] : forSubjects){
                        if(sub.length > 2 && sub[2] != null || sub[2].toUpperCase().contains(instructorSearched)){
                    System.out.println("SUBJECT  CODE:      " + sub[2] != null ? sub[2] : "");
                        }
                    }
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No instructor found.");
            }
        }
        } while (searchAgain());
    }

    // INSTRUCTOR DATA SETTER
    public static String[] insInformation(String dataInformation) {
        System.out.print("CREATE INSTRUCTOR/S FORM\n");
        String informationForAll[] = new String[6];

        while (!isTrue) {
            System.out.print("Enter your First Name: ");
            String instructorFirstName = s.nextLine();

            if (instructorFirstName.isBlank()) {
                System.out.println("First name is empty, Fill it");
            } else if (instructorFirstName.matches(".*\\d.*")) {
                System.out.println("First name can't contain any number");
            } else {
                informationForAll[0] = instructorFirstName;
                break;
            }
        }

        while (!isTrue) {
            System.out.print("Enter your Last Name: ");
            String instructorLastName = s.nextLine();

            if (instructorLastName.isBlank()) {
                System.out.println("Last name is empty, Fill it");
            } else if (instructorLastName.matches(".*\\d.*")) {
                System.out.println("Last name can't contain any number");
            } else {
                informationForAll[1] = instructorLastName;
                break;
            }
        }

        while (!isTrue) {
            System.out.print("Enter your Middle Name (Optional): ");
            String instructorMiddleName = s.nextLine();
            if (instructorMiddleName.matches(".*\\d.*")) {
                System.out.println("Middle name can't contain any number");
            } else {
                informationForAll[2] = instructorMiddleName;
                break;
            }
        }

        while (!isTrue) {
            System.out.print("Enter your Address: ");
            String instructorAddress = s.nextLine();

            if (instructorAddress.isBlank()) {
                System.out.println("Address is empty, Fill it");

            } else {
                informationForAll[3] = instructorAddress;
                break;
            }
        }

        while (!isTrue) {
            System.out.print("Enter your Age: ");
            String insAgeInput = s.nextLine();
            try {
                int insAge = Integer.parseInt(insAgeInput);
                if (insAge >= 24 && insAge <= 100) {
                    informationForAll[4] = insAgeInput;
                    break;
                } else {
                    if (insAge >= 24 && insAge <= 100) {
                        System.out.println("You're age must be 24 to 100 y/olds.");
                    } else {
                        System.out.println("Age doesn't meet the requirement for instructor.");
                        ;
                    }
                }
            } catch (Exception e) {
                System.out.printf("This [%s] is invalid, Please Enter the valid Choices.\n", insAgeInput);
            }
        }
        int insAge = Integer.parseInt(informationForAll[4]);
        if (insAge >= 24 && insAge <= 100) {
            System.out.println("You're a Instructor.");
        }

        System.out.print("\nDo you want to add this instructor?\n[Y] Yes, i want to add it\n[N] No, maybe later\n");
        while (!isTrue) {
            System.out.print("Choices [Y/N]: ");
            String insC = s.nextLine().toUpperCase();

            if (insC.equals("Y")) {
                break;
            } else if (insC.equals("N")) {
                return new String[0];
            } else {
                System.out.println("Invalid input");
            }
        }

        return informationForAll;

    }

    // static ThisIsForInstructor to = new ThisIsForInstructor();

    // DISPLAY DATA FOR INSTRUCTOR
    @Override
    public void displayingDataOfInstructors() {
        if (forInstructors.isEmpty() || forInstructors == null) {
            System.out.println("There's no Instructor Available, Try to Add");
            return;
        }

        getDataForInstructors(forInstructors, forSubjects);
    }

    // GETTER DATA FOR INSTRUCTOR
    public static void getDataForInstructors(List<String[]> takeDataForInstructor, List<String[]> forSubject) {
        List<String[]> getDataOfIns = new ArrayList<>(takeDataForInstructor);

        String[] textTitle = { "|INSTRUCTOR ID", "|FIRST NAME", "|LAST NAME", "|MIDDLE NAME", "|ADDRESS", "|AGE",
                "SUBJECT HOLD" };
        System.out.println("\t\t\t\t\t\t DISPLAYING ALL INSTRUCTORS THAT EXISTING IN DATABASE");
        System.out.println(
                "=============================================================================================================================================================");
        for (String text : textTitle) {
            System.out.printf("%-17s", text);
        }
        System.out.println(
                "\n=============================================================================================================================================================");

        for (String[] getData : getDataOfIns) {
            // for (int i = 0; i< getData.length; i++){
            //     System.out.println(getData[i] + " " + i);
            // }
            if (getData.length > 5) {
            String insFname = getData[0];
            String insLname = getData[1];
            String insMname = getData[2];
            String insAddress = getData[3];
            String insAge = getData[4];
            String instructorIdentity = getData[5];
            String newInsAddress = textBehaviour(insAddress, 7);
            
            System.out.printf("| %-14s | %-14s | %-14s | %-14s | %-14s | %-14s ", instructorIdentity,
                    insFname.toUpperCase(), insLname.toUpperCase(), insMname.toUpperCase(),
                    newInsAddress.toUpperCase(), insAge);

            StringBuilder subjectHold = new StringBuilder();
            for (String[] assignment : forSubjects) {
                if (assignment.length > 5 && assignment[5] != null && assignment[5].equals(instructorIdentity)) { 
                    subjectHold.append(assignment[2]);
                    subjectHold.append(", ");
                }
            }

            System.out.printf("| %-14s", subjectHold.toString());
            System.out.println();
            }
            
        }

    }

}
