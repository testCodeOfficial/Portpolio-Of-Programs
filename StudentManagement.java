import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

interface forMethodInStudent {
    void addingStudent();

    void displayingDataOfStudents();

    void editStudent();

    void deleteStudent();

    void searchStudent();

}

public class StudentManagement extends UMPS implements forMethodInStudent {

    private static Scanner s = new Scanner(System.in);

    /*
     * STUDENTS
     * -----------------------------------------------------------------------------
     * -----------------------------------------------------------------------------
     * -------------------------------
     */

    // ADDING STUDENTS METHOD
    static ThisIsForStudent st = new ThisIsForStudent();

    @Override
    public void addingStudent() {
        do {
            String[] sDetails = stInformation("studentDeatails");

            if (sDetails.length == 0) {
                System.out.println("The student cancelled application");
            } else {
                System.out.println("The student was enrolled.");
                st.instantiateOfStudents();
                String stId = st.getTheStudentId();
                sDetails[5] = stId;
                forStudents.add(sDetails);
            }
        } while (addAgain());
    }

    // DELETE STUDENT
    @Override
    public void deleteStudent() {
        do {
            System.out.print("\nEnter the Student ID \"ST" + year + "-1234\" : ");
            String deleteStID = s.nextLine().trim();
            if(deleteStID.isBlank()){
                System.out.println("The student id can't be blank.");
            } else{
            boolean isFound = false;

            for (int i = forStudents.size() - 1; i >= 0; i--) {
                String[] student = forStudents.get(i);

                if (student.length > 5) {
                    String deletionOfStudent = student[5];

                    if (deletionOfStudent.endsWith(deleteStID)) {
                        isFound = true;
                        System.out.println(deleteStID + " Code is processing... for deleting .");
                        System.out.println();
                        String adminConfirmation;
                        System.out.printf(
                                "Admin: Are you sure you want to delete this student profile we need as confirmation.\nChoice [Y/N]: ");
                        adminConfirmation = s.nextLine().trim();

                        if (adminConfirmation.equalsIgnoreCase("Y")) {
                            forStudents.remove(i);
                            System.out.println("This student profile is now confirm deleted.");
                            break;
                        } else {
                            System.out.println("This student is not confirm deleted in database");

                        }
                        break;
                    }
                }

            }
            if (!isFound) {
                System.out.println("This student with this id \"" + deleteStID + "\" is not existing.");
            }
        }
        } while (deleteAgain());
    }

    // EDIT STUDENTS
    @Override
    public void editStudent() {
        do {
            // Scanner editScanner = new Scanner(System.in);
            System.out.print("\nEnter the Student ID \"ST" + year + "-1234\": ");
            String editStID = s.nextLine().trim();

            if (editStID.isBlank()) {
                System.out.println("The student id can't be blank.");
            } else {
                boolean isFound = false;

                for (String stDetails[] : forStudents) {

                    if (stDetails.length > 5 && stDetails[5].contains(editStID)) {
                        isFound = true;
                        System.out.println("\n< The student is in the database > ".toUpperCase());
                        System.out.print("\n|First Name: " + stDetails[0] + " | Last Name: " + stDetails[1]
                                + " | Middle Name: " + stDetails[2] + " | Address: " + stDetails[3] + " | Age: "
                                + stDetails[4] + " |\n");
                        System.out.println();

                        System.out.print(
                                "\nDo you want to edit this Student?\n[Y] Yes, I want to edit it\n[N] No, maybe later\n");
                        String eIns = s.nextLine().trim().toUpperCase();
                        s.nextLine();

                        boolean editForAll = false;
                        if (eIns.equalsIgnoreCase("Y")) {
                            System.out.println("Proceed to edit your profile");

                            while (!editForAll) {
                                System.out.print("Enter your new first Name: ");
                                String newStudentFirstName = s.nextLine();

                                if (newStudentFirstName.isBlank()) {
                                    System.out.println("First name is empty, Fill it");
                                } else if (newStudentFirstName.matches(".*\\d.*")) {
                                    System.out.println("First name can't contain any number");
                                } else {
                                    stDetails[0] = newStudentFirstName;
                                    break;
                                }
                            }

                            while (!editForAll) {
                                System.out.print("Enter your new last Name: ");
                                String newStudentLastName = s.nextLine();

                                if (newStudentLastName.isBlank()) {
                                    System.out.println("Last name is empty, Fill it");
                                } else if (newStudentLastName.matches(".*\\d.*")) {
                                    System.out.println("Last name can't contain any number");
                                } else {
                                    stDetails[1] = newStudentLastName;
                                    break;
                                }
                            }

                            while (!editForAll) {
                                System.out.print("Enter your new middle name (Optional): ");
                                String newStudentMiddleName = s.nextLine();
                                if (newStudentMiddleName.matches(".*\\d.*")) {
                                    System.out.println("Middle name can't contain any number");
                                } else {
                                    stDetails[2] = newStudentMiddleName;
                                    break;
                                }
                            }

                            while (!editForAll) {
                                System.out.print("Enter your new address: ");
                                String newStudentAddress = s.nextLine();

                                if (newStudentAddress.isBlank()) {
                                    System.out.println("Address is empty, Fill it");
                                } else {
                                    stDetails[3] = newStudentAddress;
                                    break;
                                }
                            }

                            while (!editForAll) {
                                System.out.print("Enter your new age: ");
                                String newStAgeInput = s.nextLine();
                                try {
                                    int newAge = Integer.parseInt(newStAgeInput);
                                    if (newAge <= 24 && newAge <= 100) {
                                        stDetails[4] = newStAgeInput;
                                        break;
                                    } else {
                                        if (newAge >= 24 && newAge <= 100) {
                                            System.out.println("You're age must be 24 to 100 y/olds.");
                                        } else {
                                            System.out.println("Age doesn't meet the requirement for student.");
                                        }
                                    }
                                } catch (Exception e) {
                                    System.out.printf("This [%s] is invalid, Please Enter the valid Choices.\n",
                                            newStAgeInput);
                                }

                                int updAge = Integer.parseInt(stDetails[4]);
                                if (updAge >= 24 && updAge <= 100) {
                                    System.out.println("You're a Student.");
                                }
                            }

                            System.out.println("Your profile was succesfully updated.");
                            break;
                        } else if (eIns.equalsIgnoreCase("N")) {
                            System.out.println("Your editing profile is not updated.");
                            break;
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

    @Override
    // SEARCH STUDENTS
    public void searchStudent() {
        do {
            // Scanner searchStudent = new Scanner(System.in);
            System.out.println("Search Student: ");
            String studentSearched = s.nextLine();
            if(studentSearched.isBlank()){
                System.out.println("The student id can't be blank.");
            } else{
            boolean found = false;
            for (String[] student : forStudents) {
                if (student.length > 5 &&
                        (student[0].toUpperCase().contains(studentSearched.toUpperCase()) ||
                                student[1].toUpperCase().contains(studentSearched.toUpperCase()) ||
                                (student[2] != null && student[2].toUpperCase().contains(studentSearched.toUpperCase()))
                                ||
                                student[3].toLowerCase().contains(studentSearched.toUpperCase()) ||
                                (student[4] != null && student[4].equals(studentSearched)) ||
                                (student[5] != null && student[5].toUpperCase().contains(studentSearched)))) {
                    System.out.println("Student Found:");
                    System.out.println("First Name: " + student[0]);
                    System.out.println("Last Name: " + student[1]);
                    System.out.println("Middle Name: " + (student[2] != null ? student[2] : ""));
                    System.out.println("Address: " + student[3]);
                    System.out.println("Age: " + (student[4] != null ? student[4] : ""));
                    System.out.println("ID: " + (student[5] != null ? student[5] : ""));
                    found = true;
                    for(String sub[] : forSubjects){
                        if(sub.length > 2 && sub[0] != null && sub[0].toUpperCase().contains(studentSearched.toUpperCase()) || sub[1] != null &&
                        sub[1].toUpperCase().contains(studentSearched.toUpperCase()) || sub[2] != null || sub[2].toUpperCase().contains(studentSearched)){
                            System.out.println("Subject  Title:      " + (sub[0] != null ? sub[0] : ""));
                            System.out.println("Subject Description:      " + (sub[1] != null ? sub[1] : ""));
                    System.out.println("SUBJECT  CODE:      " + (sub[2] != null ? sub[2] : ""));
                        }
                    }
                }
            }

            if (!found) {
                System.out.println("No student found.");
            }
        }
        } while (searchAgain());
    }

    // STUDENTS DATA GETTER
    public static String[] stInformation(String dataInformation) {
        String informationForAll[] = new String[6];
        System.out.println("CREATE STUDENT/S FORM\n");

        while (!isTrue) {
            System.out.print("Enter your First Name: ");
            String stFname = s.nextLine();
            if (stFname.isBlank()) {
                System.out.println("First name is empty, Fill it");
            } else if (stFname.matches(".*\\d.*")) {
                System.out.println("First name can't contain any number");
            } else {
                informationForAll[0] = stFname;
                break;
            }

        }

        while (!isTrue) {
            System.out.print("Enter your Last Name: ");
            String stLname = s.nextLine();
            if (stLname.isBlank()) {
                System.out.println("Last name is empty, fill it");
            } else if (stLname.matches(".*\\d.*")) {
                System.out.println("Last name can't contain any number");
            } else {
                informationForAll[1] = stLname;
                break;
            }
        }

        while (!isTrue) {
            System.out.print("Enter your Middle Name (Optional): ");
            String stMname = s.nextLine();
            if (stMname.matches(".*\\d.*")) {
                System.out.println("Middle name can't contain any number");
            } else {
                informationForAll[2] = stMname;
                break;
            }
        }

        while (!isTrue) {
            System.out.print("Enter your Address: ");
            String stAddress = s.nextLine();
            if (stAddress.isBlank()) {
                System.out.println("Address is empty, Fill it");
            } else {
                informationForAll[3] = stAddress;
                break;
            }
        }

        while (true) {
            System.out.print("Enter your Age: ");
            String insAgeInput = s.nextLine();
            try {
                int insAge = Integer.parseInt(insAgeInput);
                if (insAge >= 17 && insAge <= 23) {
                    informationForAll[4] = insAgeInput;
                    break;
                } else {
                    if (insAge >= 17 && insAge <= 23) {
                        System.out.println("You're age must be 17 to 23 y/olds.");
                    } else {
                        System.out.println("Age doesn't meet the requirement for students");
                    }
                }
            } catch (Exception e) {
                System.out.printf("This [%s] is invalid, Please Enter the valid Choices.\n", insAgeInput);
            }
        }
        int insAge = Integer.parseInt(informationForAll[4]);
        if (insAge >= 17 && insAge <= 23) {
            System.out.println("You're a Student.");
        }

        System.out.print("\nDo you want to add this student?\n[Y] Yes, i want to add it\n[N] No, maybe later\n");

        while (!isTrue) {
            System.out.print("Choices [Y/N]: ");
            String sC = s.nextLine().toUpperCase();

            if (sC.equals("Y")) {
                break;
            } else if (sC.equals("N")) {
                return new String[0];
            } else {
                System.out.println("Invalid input");
            }
        }

        return informationForAll;
    }

    @Override
    // DISPLAYING DATA FOR STUDENTS
    public void displayingDataOfStudents() {
        if (forStudents.isEmpty() || forStudents == null) {
            System.out.println("There's no Student Available, Try to Add");
            return;
        } else {

            getDataForStudents(forStudents, forSubjects);
        }
    }

    // SETTER DATA FOR STUDENTS
    public static void getDataForStudents(List<String[]> takeDataForStudent, List<String[]> takeSubjectData) {
        List<String[]> getDataOfStudent = new ArrayList<>(takeDataForStudent);
        // List<String[]> addSubjectFromStudent = new ArrayList<>(takeSubjectData);
        String[] updateSubject = new String[forSubjects.size()];
        String[] textTitle = { "|STUDENT ID", "|FIRST NAME", "|LAST NAME", "|MIDDLE NAME", "|ADDRESS", "|AGE " };
        String[] textSub = { "|SUBJECT CODE", "|SUBJECT TITLE", "|SUBJECT DESCRIPTION|\n" };
        System.out.println("\n\t\t\t\t DISPLAYING ALL STUDENTS THAT EXIST IN DATABASE");
        System.out.println(
                "==============================================================================================================================================");

        for (String together : textTitle) {
            System.out.printf("%-17s", together);
        }
        System.out.println(
                "\n==============================================================================================================================================");
        for (String[] getDatas : getDataOfStudent) {

            if (getDatas.length > 5) {
                String studentIdentity = getDatas[5];
                String stFname = getDatas[0];
                String stLname = getDatas[1];
                String stMname = getDatas[2];
                String stAddress = getDatas[3];
                String stAge = getDatas[4];

                String newAddress = textBehaviour(stAddress, 20);

                System.out.printf("\r|%-16s| %-16s| %-16s| %-16s| %-16s| %-16s|", studentIdentity,
                stFname.toUpperCase(), stLname.toUpperCase(), stMname.toUpperCase(), newAddress.toUpperCase(),
                stAge);
                System.out.println(
                "\n==================================================================================================================================================");

                boolean subjectAppear = false;
                int count = 0;
                for (String[] added : takeSubjectData) {
                    if (added != null && added.length > 5 && added[5].equals(studentIdentity)) {
                        if (!subjectAppear) {
                            String subjectCode = added[2];
                            String subjectName = added[0];
                            String subjectCredits = added[1];
                            String thisThreeInSubject = subjectCode + subjectName + subjectCredits;
                            boolean displayAtTheSame = false;

                            for(int i = 0; i < count; i++){
                                if (updateSubject[i] != null && updateSubject[i].equals(thisThreeInSubject)) {
                                    displayAtTheSame = true;
                                    break;
                                }
                            }

                            if(!displayAtTheSame){
                                for (String textS : textSub) {
                                    System.out.printf("%-17s", textS); 
                                }
                                System.out.printf("%-17s | %-17s | %-17s|\n", subjectCode, subjectName, subjectCredits);
                                System.out.println("============================================================");

                                updateSubject[count++] = thisThreeInSubject;

                                subjectAppear = true;
                            }
                            
                        }
                    }
                }

                if (!subjectAppear) {
                    
                   
                    System.out.println("============================================================");
                    System.out.printf("%-12s| %-12s | %-12s |", "N/A", "N/A", "N/A");
                    System.out.println("\n==========================================================");
                }

            }
        }
    }
}
