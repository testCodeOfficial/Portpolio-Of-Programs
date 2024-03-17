import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.Calendar;

public class UniversityManagementSystem {
    static Scanner s = new Scanner(System.in);

    static List<String[]> forInstructors = new ArrayList<>();
    static List<String[]> forStudents = new ArrayList<>();
    static List<String[]> forSubjects = new ArrayList<>();
    static Boolean isTrue = false;
    static final int year = yearAtFure();

    public static void main(String[] backToMain) {

        // UNIVERSITY MANAGEMENT SYSTEM
//        String umpsArt = """
//            \n
//            ----------------------------------------------------------------------------------------------------------------------------------------------------------------
//            .-..-.  .-..-.  .-.  .-..-.   .--.   .---.    .--.   .-.  .-----.  .-..-.  .-..-.   .--.   .-..-.   .--.    .--.    .--.   .-..-.   .--.   .-..-.  .-----.
//            : :: :  : `: :  : :  : :: :  : .--'  : .; :  : .--'  : :  `-. .-'  : :: :  : `' :  : .; :  : `: :  : .; :  : .--'  : .--'  : `' :  : .--'  : `: :  `-. .-'
//            : :: :  : .` :  : :  : :: :  : `;    :   .'  `. `.   : :    : :    `.  .'  : .. :  :    :  : .` :  :    :  : : _   : `;    : .. :  : `;    : .` :    : :
//            : :; :  : :. :  : :  : `' ;  : :__   : :.`.   _`, :  : :    : :     .' ;   : :; :  : :: :  : :. :  : :: :  : :; :  : :__   : :; :  : :__   : :. :    : :
//            `.__.'  :_;:_;  :_;   `.,'   `.__.'  :_;:_;  `.__.'  :_;    :_;    :_,'    :_;:_;  :_;:_;  :_;:_;  :_;:_;  `.__.'  `.__.'  :_;:_;  `.__.'  :_;:_;    :_;
//
//
//            .---.   .---.    .--.   .---.   .-.  .-.     .-.  .-..-.   .--.    .--.   .-..-.   .--.   .-----.   .--.   .-..-.
//            : .; :  : .; :  : ,. :  : .--'  : :  : :     : :  : `: :  : .--'  : .--'  : :: :  : .--'  `-. .-'  : .--'  : `' :
//            :  _.'  :   .'  : :: :  : `;    : :  : :     : :  : .` :  : : _   `. `.   `.  .'  `. `.     : :    : `;    : .. :
//            : :     : :.`.  : :; :  : :     : :  : :__   : :  : :. :  : :; :   _`, :   .' ;    _`, :    : :    : :__   : :; :
//            :_;     :_;:_;  `.__.'  :_;     :_;  :___.'  :_;  :_;:_;  `.__.'  `.__.'  :_,'    `.__.'    :_;    `.__.'  :_;:_;
//            -----------------------------------------------------------------------------------------------------------------------------------------------------------------
//                \n""";
//
//        System.out.print(umpsArt);

        do{
            try{
                System.out.print("\n\n[1]Prompt To Add \n[2]Prompt To Display \n[3]Prompt To Delete \n[4]Prompt To Edit \n[5]Prompt To Search \n[6]Want To End\n");
                System.out.print("Enter Index From 1-6: ");
                String schoice = s.nextLine();
                int choice = Integer.parseInt(schoice);
                // Assign for Add Method
                switch(choice) {
                    case 1:
                        clearScreen();
                        do{
                            try{
                                System.out.println("ADDING < INFORMATION >");
                                System.out.println("\n[1]Add Instructor\n[2]Add Student\n[3]Add Subject\n[4]Back");
                                System.out.print("Enter Index 1-3: ");
                                String cAddChoice = s.nextLine();
                                int addChoice = Integer.parseInt(cAddChoice);
                                clearScreen();

                                switch(addChoice){
                                    case 1:
                                        addingInstructor();
                                        main(backToMain);

                                        break;
                                    case 2:
                                        addingStudent();
                                        main(backToMain);
                                        break;
                                    case 3:
                                        addingSubject();
                                        main(backToMain);
                                        break;
                                    case 4:
                                        main(backToMain);
                                        break;
                                    default:
                                        System.out.printf("This [%s] is invalid, Please Enter the valid Choices.", addChoice);
                                        System.out.println("--------------------------------------------------------------------------------------------");
                                        break;
                                }
                            }catch(NumberFormatException e){
                                // e.printStackTrace();
                                // return;
                            }
                        }while(isTrue);
                        break;
                    //Assign For Display
                    case 2:
                        clearScreen();
                        do{
                            try{
                                System.out.println("DISPLAYING < INFORMATION >");
                                System.out.println("\n[1]Display Instructor\n[2]Display Student\n[3]Display Subject\n[4]Back");
                                System.out.print("Enter Index 1-3: ");
                                String dChoice = s.nextLine();
                                int displayChoice = Integer.parseInt(dChoice);
                                clearScreen();
                                switch(displayChoice){
                                    case 1:
                                        displayingDataOfInstructors();
                                        main(backToMain);
                                        break;
                                    case 2:
                                        displayingDataOfStudents();
                                        main(backToMain);
                                        break;
                                    case 3:
                                        displayingDataOfSubjects();

                                        main(backToMain);
                                        break;
                                    case 4:
                                        main(backToMain);
                                        break;
                                    default:
                                        System.out.printf("This [%s] is invalid, Please Enter the valid Choices.", displayChoice);
                                        System.out.println("--------------------------------------------------------------------------------------------");
                                        break;
                                }
                            }catch(Exception e){
                                System.out.println("\nThe input is in valid.");
                                System.out.println("--------------------------------------------------------------------------------------------");
                                // e.printStackTrace();
                                // return;
                            }
                        }while(!isTrue);
                        break;
                    //Assign For Delete
                    case 3:
                        clearScreen();
                        do{
                            try{
                                System.out.println("DELETE < INFORMATION >");
                                System.out.println("\n[1]Delete Instructor\n[2]Delete Student\n[3]Delete Subject\n[4]Back");
                                System.out.print("Enter Index 1-3: ");
                                String dChoice = s.nextLine();
                                int deleteChoice = Integer.parseInt(dChoice);
                                clearScreen();
                                switch(deleteChoice){
                                    case 1:
                                        deleteInstructor();
                                        main(backToMain);
                                        break;
                                    case 2:
                                        deleteStudent();
                                        main(backToMain);
                                        break;
                                    case 3:
                                        deleteSubject();
                                        main(backToMain);
                                        break;
                                    case 4:
                                        main(backToMain);
                                        break;
                                    default:
                                        break;
                                }
                            }catch(Exception e){
                                System.out.println("\nThe input is in valid.");
                                System.out.println("--------------------------------------------------------------------------------------------");
                                // e.printStackTrace();
                                // return;
                            }
                        }while(!isTrue);
                        break;
                    //Assign For Edit
                    case 4:
                        clearScreen();
                        do{
                            try{
                            System.out.println("EDIT < INFORMATION >");
                            System.out.println("\n[1]Edit Instructor\n[2]Edit Student\n[3]Edit Subject\n[4]Back");
                            System.out.print("Enter Index 1-3: ");
                            String eChoice = s.nextLine();
                            int editChoice = Integer.parseInt(eChoice);
                            clearScreen();
                                switch(editChoice){
                                    case 1:
                                        editInstructor();
                                        main(backToMain);
                                        break;
                                    case 2:
                                        editStudent();
                                        main(backToMain);
                                        break;
                                    case 3:
                                        editSubject();
                                        main(backToMain);
                                        break;
                                    case 4:
                                        main(backToMain);
                                        break;
                                    default:
                                        break;
                                    }
                            }catch(Exception e){
                                    // e.printStackTrace();
                                    // return;
                                    System.out.println("\nThe input is in valid.");
                                    System.out.println("--------------------------------------------------------------------------------------------");
                            }
                        }
                        while(!isTrue);
                        break;
                    //Assign For Searching
                    case 5:
                        clearScreen();
                        do{
                            try{
                                System.out.println("SEARCHING < INFORMATION >");
                                System.out.println("\n[1]Search Instructor\n[2]Search Student\n[3]Search Subject\n[4]Back");
                                System.out.print("Enter Index 1-3: ");
                                int searchChoice = s.nextInt();
                                s.nextLine();
                                clearScreen();
                                switch(searchChoice){
                                    case 1:
                                        searchInstructor();
                                        main(backToMain);
                                        break;
                                    case 2:
                                        searchStudent();
                                        main(backToMain);
                                        break;
                                    case 3:
                                        searchSubject();
                                        main(backToMain);
                                        break;
                                    case 4:
                                        main(backToMain);
                                        break;
                                    default:
                                        break;
                                    }
                            }catch(Exception e){
                                // e.printStackTrace();
                                // return;
                                System.out.println("\nThe input is in valid.");
                                System.out.println("--------------------------------------------------------------------------------------------");
                            }
                        }while(!isTrue);
                        break;
                    case 6:
                        System.out.print("\nHello Admin, ");
                        System.err.print("Do you want to end this program?\n[Y] Yes \n[N] No \nChoose From Y/N: ");
                        String yesOrNo = s.next().trim().toUpperCase();
                        if(yesOrNo.equals("Y") || yesOrNo.equals("YES")){
                            System.out.println("You now exiting in program. Thank You");
                            isTrue = true;
                            break;
                        }else{
                            System.out.println("--------------------------------------------------");
                            main(backToMain);
                        }
                        break;
                    default:
                        clearScreen();
                        System.out.printf("\nThis [%s] is invalid, Please Enter the valid Choices.", choice);
                        main(backToMain);
                        break;

                }
            }catch(NumberFormatException e){
                System.out.println("\nThe input must be valid and program didn't allowed it.");
                System.out.println("--------------------------------------------------------------------------------------------");
                // e.printStackTrace();
                
                return;
            }


        }while(!isTrue);
    }




    //Overloading Method For All Add
    public static Boolean addAgain(){
        String addAgainC;
        do{
            System.out.println("\nDo you want to add again?\n[Y] yes\n[N] no \nChoice[Y/N]: ");
            addAgainC  = s.nextLine().toUpperCase();
            if(addAgainC.equalsIgnoreCase("Y")){
                return true;
            } else if(addAgainC.equalsIgnoreCase("N")){
                return false;
            }
        }while(true);
    }

    //Overloading Method For All edit
    public static Boolean editAgain(){
        String addAgainC;
        do{
            System.out.println("\nDo you want to edit again?\n[Y] yes\n[N] no \nChoice[Y/N]: ");
            addAgainC  = s.nextLine().toUpperCase();
            if(addAgainC.equalsIgnoreCase("Y")){
                return true;
            } else if(addAgainC.equalsIgnoreCase("N")){
                return false;
            }
        }while(true);
    }

    //Overloading Method For All edit
    public static Boolean deleteAgain(){
        String addAgainC;
        do{
            System.out.println("\nDo you want to delete again?\n[Y] yes\n[N] no \nChoice[Y/N]: ");
            addAgainC  = s.nextLine().toUpperCase();
            if(addAgainC.equalsIgnoreCase("Y")){
                return true;
            } else if(addAgainC.equalsIgnoreCase("N")){
                return false;
            }
        }while(true);
    }

    //Overloading Method For All edit
    public static Boolean searchAgain(){
        String addAgainC;
        do{
            System.out.println("\nDo you want to delete again?\n[Y] yes\n[N] no \nChoice[Y/N]: ");
            addAgainC  = s.nextLine().toUpperCase();
            if(addAgainC.equalsIgnoreCase("Y")){
                return true;
            } else if(addAgainC.equalsIgnoreCase("N")){
                return false;
            }
        }while(true);
    }


    /*SUBJECTS ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    static ThisIsForSubject subs = new ThisIsForSubject();

    //ADDING SUBJECTS METHOD
    private static void addingSubject(){

        do{
            String[] subDetails = subjectInformation("SubjectDetails");

            if(subDetails.length == 0){
                System.out.print("The subject must cancelled.");
            } else{
                System.out.print("The subject must added");
                subs.instantiateOfSubject();
                String subsId = subs.getTheSubjectId();
                subDetails[2] = subsId;
                forSubjects.add(subDetails);
            }
        }while(addAgain());
    }

    //DELETE SUBJECT
    private static void deleteSubject(){
       
        System.out.print("\nEnter the Student ID \"SUB-1234\": ");
        String deleteCode = s.nextLine().trim();

        boolean isFound = false;

        for(int i = forSubjects.size() - 1; i >= 0; i--){
            String[] subject = forSubjects.get(i);

            if(subject.length >= 3){
            String deletionOfSubject = subject[2];

                if(deletionOfSubject.endsWith(deleteCode)){
                    isFound = true;
                    System.out.println(deleteCode+" Code is processing... for deleting .");
                    System.out.println();
                    String adminConfirmation;
                    System.out.printf("Admin: Are you sure you want to delete this subject we need as confirmation.\nChoice [Y/N]: ");
                    adminConfirmation = s.nextLine().trim();

                    if(adminConfirmation.equalsIgnoreCase("Y")){
                        forSubjects.remove(i);
                        System.out.println("This student profile is now confirm deleted." );
                        break;
                    } else{
                        System.out.println("This student is not confirm deleted in database");
                        
                    }
                    break;
                } 
            }   
           
        }
        if (!isFound) {
            System.out.println("This student with this id \""+deleteCode+"\" is not existing.");
        }
    }

    //SEARCH SUBJECT
    private static void searchSubject() {
        System.out.println("Search Subject: ");
        String subjectSearched = s.nextLine().toUpperCase().trim();

        boolean found = false;
        for (String[] subject : forSubjects) {
            if (subject.length >= 3 &&
                    (subject[0].toUpperCase().contains(subjectSearched.toUpperCase()) ||
                            subject[1].toUpperCase().contains(subjectSearched.toUpperCase()) ||
                            subject[2] != null && subject[2].toUpperCase().contains(subjectSearched))) {
                System.out.println("Subject Found:");
                System.out.println("Title: " + subject[0]);
                System.out.println("Description: " + subject[1]);
                System.out.println("Subject Code: " + (subject[2] != null ? subject[2] : " "));
                found = true;
            }
        }

        if (!found) {
            System.out.println("No subject found.");
        }
    }

    //EDIT SUBJECT
    // private static Scanner editScanner = new Scanner(System.in);

    private static void editSubject() {
        
        System.out.print("\nEnter the subject code \"SUB-1234\": ");
        String editCode = s.nextLine().trim();

        // if (!editCode.matches("SUB-\\d{4}$")) {
        //     System.out.println("Invalid input format. Subject Code should contain only 4 digits.");
        //     return;
        // } 
        if(editCode.isBlank()){
            System.out.println("The subject code can't be blank.");
        } else{
        
        boolean isFound = false;

        for(String []subDetails : forSubjects){
            if(subDetails.length > 2 && subDetails[2].contains(editCode)){
                    isFound = true;
                    System.out.println("\n< The subject is in the database > ".toUpperCase());
                    System.out.print("\nSubject Title: " +subDetails[0]+" \nSubject Code: "+subDetails[1]+" \n");
                    System.out.println();
                    System.out.print("\nDo you want to edit this instructor?\n[Y] Yes, I want to edit it\n[N] No, maybe later\n");
                    String eIns = s.nextLine().trim().toUpperCase();

                    boolean editForAll = false;
                    if(eIns.equalsIgnoreCase("Y")){
                        System.out.println("Proceed to edit your profile");


                        while(!editForAll){
                            System.out.print("Enter your new subject title: ");
                            String newTitle = s.nextLine();

                            if(newTitle.isBlank()){
                                System.out.println("First name is empty, Fill it");
                            } else{
                                subDetails[0] = newTitle;
                                break;
                            }
                        }

                        while(!editForAll){
                            System.out.print("Enter your new subject description: ");
                            String newDescription = s.nextLine();

                            if(newDescription.isBlank()){
                                System.out.println("Address is empty, Fill it");
                            } else{
                                subDetails[1] = newDescription;
                                break;
                            }
                        }

                        System.out.println("Your profile was succesfully updated.");
                        
                    } else if(eIns.equalsIgnoreCase("N")){
                        System.out.println("Your editing profile is not updated.");
                    }  else{
                        System.out.println("Invalid Input.");
                    }
                    break;
            }
            
        }
    
        if(!isFound){
            System.out.println("This Code is not existing, try to add first");
        }
    }
    }


    //SUBJECT DATA GETTER
    public static String[] subjectInformation(String sub){
        String subjectForAll[] = new String[3];
        System.out.println("CREATE SUBJECT/S\n");

        while(!isTrue){
            System.out.print("Enter subject title: ");
            String sTitles = s.nextLine();
            if(sTitles.isBlank()){
                System.out.println("Subject title is empty, Fill it");
            } else{
                subjectForAll[0] = sTitles;
                break;
            }
        }

        while(!isTrue){
            System.out.print("Enter subject description: ");
            String sDes = s.nextLine();
            if(sDes.isBlank()){
                System.out.println("Subject description is empty, Fill it");
            } else{
                subjectForAll[1] = sDes;
                break;
            }
        }

        System.out.print("\nDo you want to add this subject?\n[Y] Yes, i want to add it\n[N] No, maybe later\n");
        while(!isTrue){
            System.out.print("Choices [Y/N]: ");
            String subC = s.nextLine().toUpperCase();

            if(subC.equals("Y")){
                break;
            } else if(subC.equals("N")){
                return new String[0];
            } else{
                System.out.println("Invalid input");
            }
        }

        return subjectForAll;
    }

    //SETTER DATA FOR SUBJECTS
    static void getDataForSubjects(List<String[]> takeDataForSubjects){
        List<String[]> getDataOfSubs= new ArrayList<>(takeDataForSubjects);
        String [] textTitle = {"|SUBJECT CODE", "|SUBJECT TITLE", "|SUBJECT DESCRIPTION|"};
        System.out.println(" DISPLAYING ALL SUBJECTS THAT EXISTING IN DATABASE");
        System.out.println("=======================================================");
        for(String textSub : textTitle){
            System.out.printf("%-17s", textSub);
        }
        System.out.println("\n=======================================================");
        for(String[] getData: getDataOfSubs){
            if(getData.length > 2){

                String sTitle = getData[0];
                String sDescription = getData[1];
                String sIdentity = getData[2];

                String newStitle = textBehaviour(sTitle, 12);
                String newSDescription = textBehaviour(sDescription, 12);
                String newSIdentity = textBehaviour(sIdentity, 12);

                System.out.printf("\r|%-16s|%-16s|%-16s   |",newSIdentity,newStitle,newSDescription);
                System.out.println("\n=======================================================");
            }
        }


    }
    
    //DISPLAY DATA FOR SUBJECTS
    private static void displayingDataOfSubjects(){
        if(forSubjects.isEmpty()){
            System.out.println("There's no subject Available, Try to add");
            return;
        } else {

        getDataForSubjects(forSubjects);

        String extraInDisplay;
        do{
            
            System.out.println("\nDo you want assign/add subject?");
            System.out.println("[I] Assigning subject to Instrctor");
            System.out.println("[S] Adding subject to Student");
            System.out.println("[E] Type \"E\" if you want to back to main \nChoices: ");
            extraInDisplay = s.nextLine().toUpperCase().trim();
            if(extraInDisplay.equalsIgnoreCase("I")){
                System.out.print("\nEnter the Instructor ID \"INS"+ year + "-1234\": ");
                String assignSubj = s.nextLine();
                if(forInstructors.contains(assignSubj)){
                    System.out.println("Processing for assigning...");
                    System.out.println("Enter Subject Code \"SUB-1234\" you want to assign in instructor: ");
                    String insSub = s.nextLine().trim();

                    ThisIsForInstructor insToSub = new ThisIsForInstructor();
                    insToSub.subjectToAssign(assignSubj,insSub);
                    System.out.println("Subject was assigning to the instructor" + assignSubj);
                    break;
                } else {
                    System.out.println("There's no instructor existing with this ID, try to add first");
                }
            } else if(extraInDisplay.equalsIgnoreCase("S")){
                System.out.print("\nEnter the Student ID \"ST"+year + "-1234\": ");
                String addSubj = s.nextLine().trim();
                if(forStudents.contains(addSubj)){
                    System.out.println("Processing for adding...");
                    System.out.println("Enter Subject Code \"SUB-1234\" you want to add in student: ");
                    String stSub = s.nextLine();

                        ThisIsForStudent student = new ThisIsForStudent();
                        student.sujectToAdd(addSubj, stSub);
                        System.out.println("Subject was added in this student"+addSubj);
                        break;
                } else{
                        System.out.println("There's no student existing with this ID, try to add first");
                }
            } else if(extraInDisplay.equalsIgnoreCase("E")){
                break;
            } else{
                System.out.println("Invalid input please try again.");
            }
        }while(extraInDisplay != "E");
    }
    }

    /*INSTRUCTOR ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */


    // ADDING INSTRUCTORS METHOD
    static ThisIsForInstructor ins = new ThisIsForInstructor();

    private static void addingInstructor(){
        do{
            String[] iDetails = insInformation("instructorDeatails");

            if(iDetails.length == 0){
                System.out.println("The instructor cancelled application");
                return;
            }

            else{
                System.out.println("The instructor was been enrolled in.");
                ins.instantiateOfInstructor();
                String insId = ins.getTheInstructorId();
                iDetails[5] = insId;
                forInstructors.add(iDetails);
            }
        }while(addAgain());

    }

    //DELETE INSTRUCTOR METHOD
    private static void deleteInstructor(){
        System.out.print("\nEnter the Instructor ID \"INS" +year+ "-1234\": ");
        String deleteInsID = s.nextLine().trim();

        boolean isFound = false;

        for(int i = forInstructors.size() - 1; i >= 0; i--){
            String[] instructor = forInstructors.get(i);

            if(instructor.length >= 6){
            String deletionOfInstructor = instructor[5];

                if(deletionOfInstructor.endsWith(deleteInsID)){
                    isFound = true;
                    System.out.println(deleteInsID+" Code is processing... for deleting .");
                    System.out.println();
                    String adminConfirmation;
                    System.out.printf("Admin: Are you sure you want to delete this instructor data we need as confirmation.\nChoice [Y/N]: ");
                    adminConfirmation = s.nextLine().trim();

                    if(adminConfirmation.equalsIgnoreCase("Y")){
                        forInstructors.remove(i);
                        System.out.println("This instructor profile is now confirm deleted." );
                        break;
                    } else{
                        System.out.println("This instructor is not confirm deleted in database");
                        
                    }
                    break;
                } 
            }   
           
        }
        if (!isFound) {
            System.out.println("This instructor with this id \""+deleteInsID+"\" is not existing.");
        }
    }

    //EDITING INSTRUCTOR METHOD
    private static void editInstructor() {
        // Scanner editScanner = new Scanner(System.in);
        System.out.print("\nEnter the Instructor ID \"INS" + year + "-1234\" : ");
        String editInsID = s.nextLine().trim();

        // if (!editID.matches("\\d{4}$")) {
        //     System.out.println("Invalid input format. Instructor ID should contain only 4 digits.");
        //     return;
        // }

        if(editInsID.isBlank()){
            System.out.println("The instructor is blank");
        } else{
        boolean isFound = false;

        for(String insDetails[]: forInstructors){
            if(insDetails.length > 5 && insDetails[5].contains(editInsID)){
                    isFound = true;
                    System.out.println("\n< The instructor is in the database > ".toUpperCase());
                    System.out.print("\n|First Name: " +insDetails[0]+" | Last Name: "+insDetails[1]+" | Middle Name: "+insDetails[2]+" | Address: "+insDetails[3]+" | Age: "+insDetails[4]+" |\n");
                    System.out.println();

                    System.out.print("\nDo you want to edit this instructor?\n[Y] Yes, I want to edit it\n[N] No, maybe later\n");
                    String eIns = s.nextLine().trim().toUpperCase();

                    boolean editForAll = false;
                    if(eIns.equalsIgnoreCase("Y")){
                        System.out.println("Proceed to edit your profile");


                        while(!editForAll){
                            System.out.print("Enter your inew first name: ");
                            String newInstructorFirstName = s.nextLine();

                            if(newInstructorFirstName.isBlank()){
                                System.out.println("First name is empty, Fill it");
                            } else if(newInstructorFirstName.matches(".*\\d.*")){
                                System.out.println("First name can't contain any number");
                            }else{
                                insDetails[0] = newInstructorFirstName;
                                break;
                            }
                        }

                        while(!editForAll){
                            System.out.print("Enter your new last name: ");
                            String newInstructorLastName = s.nextLine();

                            if(newInstructorLastName.isBlank()){
                                System.out.println("Last name is empty, Fill it");
                            } else if(newInstructorLastName.matches(".*\\d.*")){
                                System.out.println("Last name can't contain any number");
                            } else{
                                insDetails[1] = newInstructorLastName;
                                break;
                            }
                        }

                        while(!editForAll){
                            System.out.print("Enter your new middle name (Optional): ");
                            String newInstructorMiddleName = s.nextLine();
                            if(newInstructorMiddleName.matches(".*\\d.*")){
                                System.out.println("Middle name can't contain any number");
                            }else{
                                insDetails[2] = newInstructorMiddleName;
                                break;
                            }
                        }

                        while(!editForAll){
                            System.out.print("Enter your new address: ");
                            String newInstructorAddress = s.nextLine();

                            if(newInstructorAddress.isBlank()){
                                System.out.println("Address is empty, Fill it");
                            } else{
                                insDetails[3] = newInstructorAddress;
                                break;
                            }
                        }


                        while(!editForAll){
                            System.out.print("Enter your new age: ");
                            String newInsAgeInput = s.nextLine();
                            try {
                                int newAge = Integer.parseInt(newInsAgeInput);
                                if(newAge >= 24 && newAge <= 100){
                                    insDetails[4] = newInsAgeInput;
                                    break;
                                }else{
                                    if(newAge >= 24 && newAge <= 100){
                                        System.out.println("You're age must be 24 to 100 y/olds.");
                                    } else{
                                        System.out.println("Age doesn't meet the requirement for instructor.");
                                    }
                                }
                            } catch (Exception e) {
                                System.out.printf("This [%s] is invalid, Please Enter the valid Choices.\n", newInsAgeInput);
                            }

                            int updAge = Integer.parseInt(insDetails[4]);
                            if(updAge >= 24  && updAge <= 100){
                                System.out.println("You're a Instructor.");
                            }
                        }

                        System.out.println("Your profile was succesfully updated.");
                    } else if(eIns.equalsIgnoreCase("N")){
                        System.out.println("Your editing profile is not updated.");
                    }  else{
                        System.out.println("Invalid Input.");
                    }
                    break;
                
            }
        }
        if(!isFound){
            System.out.println("This ID is not existing, try to add first");
        }
    }
    }


    //SEARCHING INSTRUCTOR METHOD
    private static void searchInstructor() {
        // Scanner insSearch = new Scanner(System.in);
        System.out.println("Search Instructors: ");
        String instructorSearched = s.nextLine();

        boolean found = false;
        for (String[] instructor : forInstructors) {
            if (instructor.length >= 6 &&
                    (instructor[0].toUpperCase().contains(instructorSearched.toUpperCase()) ||
                            instructor[1].toUpperCase().contains(instructorSearched.toUpperCase()) ||
                            (instructor[2] != null && instructor[2].toUpperCase().contains(instructorSearched.toUpperCase())) ||
                            instructor[3].toUpperCase().contains(instructorSearched.toUpperCase()) ||
                            (instructor[4] != null && instructor[4].contains(instructorSearched)) ||
                            (instructor[5] != null && instructor[5].toUpperCase().contains(instructorSearched))))
            {
                System.out.println("Instructor Found:");
                System.out.println("First Name: " + instructor[0]);
                System.out.println("Last Name: " + instructor[1]);
                System.out.println("Middle Name: " + (instructor[2] != null ? instructor[2] : ""));
                System.out.println("Address: " + instructor[3]);
                System.out.println("Age: " + (instructor[4] != null ? instructor[4] : ""));
                System.out.println("ID: " + (instructor[5] != null ? instructor[5] : ""));


                found = true;
            }
        }

        if (!found) {
            System.out.println("No instructor found.");
        }
    }


    //INSTRUCTOR DATA SETTER
    static String[] insInformation(String dataInformation) {
        System.out.print("CREATE INSTRUCTOR/S FORM\n");
        String informationForAll[] = new String[6];



        while(!isTrue){
            System.out.print("Enter your First Name: ");
            String instructorFirstName = s.nextLine();

            if(instructorFirstName.isBlank()){
                System.out.println("First name is empty, Fill it");
            } else if(instructorFirstName.matches(".*\\d.*")){
                System.out.println("First name can't contain any number");
            }else{
                informationForAll[0] = instructorFirstName;
                break;
            }
        }

        while(!isTrue){
            System.out.print("Enter your Last Name: ");
            String instructorLastName = s.nextLine();

            if(instructorLastName.isBlank()){
                System.out.println("Last name is empty, Fill it");
            } else if(instructorLastName.matches(".*\\d.*")){
                System.out.println("Last name can't contain any number");
            } else{
                informationForAll[1] = instructorLastName;
                break;
            }
        }

        while(!isTrue){
            System.out.print("Enter your Middle Name (Optional): ");
            String instructorMiddleName = s.nextLine();
            if(instructorMiddleName.matches(".*\\d.*")){
                System.out.println("Middle name can't contain any number");
            }else{
                informationForAll[2] = instructorMiddleName;
                break;
            }
        }

        while(!isTrue){
            System.out.print("Enter your Address: ");
            String instructorAddress = s.nextLine();

            if(instructorAddress.isBlank()){
                System.out.println("Address is empty, Fill it");

            } else{
                informationForAll[3] = instructorAddress;
                break;
            }
        }


        while(!isTrue){
            System.out.print("Enter your Age: ");
            String insAgeInput = s.nextLine();
            try {
                int insAge = Integer.parseInt(insAgeInput);
                if(insAge >= 24 && insAge <= 100){
                    informationForAll[4] = insAgeInput;
                    break;
                }else{
                    if(insAge >= 24 && insAge <= 100){
                        System.out.println("You're age must be 24 to 100 y/olds.");
                    } else{
                        System.out.println("Age doesn't meet the requirement for instructor.");;
                    }
                }
            } catch (Exception e) {
                System.out.printf("This [%s] is invalid, Please Enter the valid Choices.\n", insAgeInput);
            }
        }
        int insAge = Integer.parseInt(informationForAll[4]);
        if(insAge >= 24  && insAge <= 100){
            System.out.println("You're a Instructor.");
        }


        System.out.print("\nDo you want to add this instructor?\n[Y] Yes, i want to add it\n[N] No, maybe later\n");
        while(!isTrue){
            System.out.print("Choices [Y/N]: ");
            String insC = s.nextLine().toUpperCase();

            if(insC.equals("Y")){
                break;
            } else if(insC.equals("N")){
                return new String[0];
            } else{
                System.out.println("Invalid input");
            }
        }
        return informationForAll;

    }




    //DISPLAY DATA FOR INSTRUCTOR
    private static void displayingDataOfInstructors(){
        if(forInstructors.isEmpty() || forInstructors == null){
            System.out.println("There's no Instructor Available, Try to Add");
            return;
        }
        getDataForInstructors(forInstructors, forSubjects);
    }

    //GETTER DATA FOR INSTRUCTOR
    private static void getDataForInstructors(List<String[]> takeDataForInstructor, List<String[]> assigningSubject){
        List<String[]> getDataOfIns= new ArrayList<>(takeDataForInstructor);
        String [] textTitle = {"|INSTRUCTOR ID", "|FIRST NAME", "|LAST NAME", "|MIDDLE NAME", "|ADDRESS", "|AGE", "|SUBJECT CODE", "|SUBJECT TITLE", "|SUBJECT DESCRIPTION|"};
        System.out.println("\t\t\t\t\t\t DISPLAYING ALL INSTRUCTORS THAT EXISTING IN DATABASE");
        System.out.println("=============================================================================================================================================================");
        for(String text : textTitle){
            System.out.printf("%-17s", text);
        }
        System.out.println("\n=============================================================================================================================================================");
        for(String[] getData: getDataOfIns){
            if(getData.length >= 5){

                String insFname = getData[0];
                String insLname = getData[1];
                String insMname = getData[2];
                String insAddress = getData[3];
                String insAge = getData[4];
                String instructorIdentity = getData[5];

                String newInsAddress = textBehaviour(insAddress, 7);
                System.out.printf("\r| %-14s | %-14s | %-14s | %-14s | %-14s | %-14s", instructorIdentity, insFname.toUpperCase(), insLname.toUpperCase(), insMname.toUpperCase(), newInsAddress.toUpperCase(), insAge);
            

            List<String[]> instructorHolder = new ArrayList<>();
            for(String[] insSub : assigningSubject){
                if(insSub.length > 5 && insSub[5].contains(instructorIdentity)){
                    instructorHolder.add(insSub);
                }
            }

            if(!instructorHolder.isEmpty()){
                for(String[] insSub : instructorHolder){
                    String subjectCode =  insSub[0];
                    String subjectTitle =  insSub[1];
                    String subjectDescription =  insSub[2];
                    System.out.printf(" | %-14s | %-14s | %-14s    |", subjectCode, subjectTitle, subjectDescription);
                    System.out.println("\n=========================================================================================================================================================");
            
                }
            } else {
                System.out.printf(" | %-14s | %-14s | %-14s    |", " ", " " ," ");
                System.out.println("\n=============================================================================================================================================================");
            
            }

            }
        }


    }

    /*STUDENTS ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

    //ADDING STUDENTS METHOD
    static ThisIsForStudent st = new ThisIsForStudent();

    private static void addingStudent(){
        do{
            String[] sDetails = stInformation("studentDeatails");

            if(sDetails.length == 0){
                System.out.println("The student cancelled application");
            } else{
                System.out.println("The student was enrolled.");
                st.instantiateOfStudents();
                String stId = st.getTheStudentId();
                sDetails[5] = stId;
                forStudents.add(sDetails);
            }
        }while(addAgain());
    }

    //DELETE STUDENT
    private static void deleteStudent(){
        System.out.print("\nEnter the Student ID \"ST" +year+ "-1234\" : ");
        String deleteStID = s.nextLine().trim();

        boolean isFound = false;

        for(int i = forStudents.size() - 1; i >= 0; i--){
            String[] student = forStudents.get(i);

            if(student.length >= 6){
            String deletionOfStudent = student[5];

                if(deletionOfStudent.endsWith(deleteStID)){
                    isFound = true;
                    System.out.println(deleteStID+" Code is processing... for deleting .");
                    System.out.println();
                    String adminConfirmation;
                    System.out.printf("Admin: Are you sure you want to delete this student profile we need as confirmation.\nChoice [Y/N]: ");
                    adminConfirmation = s.nextLine().trim();

                    if(adminConfirmation.equalsIgnoreCase("Y")){
                        forStudents.remove(i);
                        System.out.println("This student profile is now confirm deleted." );
                        break;
                    } else{
                        System.out.println("This student is not confirm deleted in database");
                        
                    }
                    break;
                } 
            }   
           
        }
        if (!isFound) {
            System.out.println("This student with this id \""+deleteStID+"\" is not existing.");
        }
    }

    //EDIT STUDENTS

    private static void editStudent() {
        // Scanner editScanner = new Scanner(System.in);
        System.out.print("\nEnter the Student ID \"ST" + year + "-1234\": ");
        String editStID = s.nextLine().trim();

        if(editStID.isBlank()){
            System.out.println("The student is blank.");
        } else{
        boolean isFound = false;

        for(String stDetails[]: forStudents){

            if(stDetails.length > 5 && stDetails[5].contains(editStID)){
                    isFound = true;
                    System.out.println("\n< The student is in the database > ".toUpperCase());
                    System.out.print("\n|First Name: " +stDetails[0]+" | Last Name: "+stDetails[1]+" | Middle Name: "+stDetails[2]+" | Address: "+stDetails[3]+" | Age: "+stDetails[4]+" |\n");
                    System.out.println();

                    System.out.print("\nDo you want to edit this Student?\n[Y] Yes, I want to edit it\n[N] No, maybe later\n");
                    String eIns = s.nextLine().trim().toUpperCase();
                    s.nextLine();

                    boolean editForAll = false;
                    if(eIns.equalsIgnoreCase("Y")){
                        System.out.println("Proceed to edit your profile");


                        while(!editForAll){
                            System.out.print("Enter your new first Name: ");
                            String newStudentFirstName = s.nextLine();

                            if(newStudentFirstName.isBlank()){
                                System.out.println("First name is empty, Fill it");
                            } else if(newStudentFirstName.matches(".*\\d.*")){
                                System.out.println("First name can't contain any number");
                            }else{
                                stDetails[0] = newStudentFirstName;
                                break;
                            }
                        }

                        while(!editForAll){
                            System.out.print("Enter your new last Name: ");
                            String newStudentLastName = s.nextLine();

                            if(newStudentLastName.isBlank()){
                                System.out.println("Last name is empty, Fill it");
                            } else if(newStudentLastName.matches(".*\\d.*")){
                                System.out.println("Last name can't contain any number");
                            } else{
                                stDetails[1] = newStudentLastName;
                                break;
                            }
                        }

                        while(!editForAll){
                            System.out.print("Enter your new middle name (Optional): ");
                            String newStudentMiddleName = s.nextLine();
                            if(newStudentMiddleName.matches(".*\\d.*")){
                                System.out.println("Middle name can't contain any number");
                            }else{
                                stDetails[2] = newStudentMiddleName;
                                break;
                            }
                        }

                        while(!editForAll){
                            System.out.print("Enter your new address: ");
                            String newStudentAddress = s.nextLine();

                            if(newStudentAddress.isBlank()){
                                System.out.println("Address is empty, Fill it");
                            } else{
                                stDetails[3] = newStudentAddress;
                                break;
                            }
                        }


                        while(!editForAll){
                            System.out.print("Enter your new age: ");
                            String newStAgeInput = s.nextLine();
                            try {
                                int newAge = Integer.parseInt(newStAgeInput);
                                if(newAge >= 24 && newAge <= 100){
                                    stDetails[4] = newStAgeInput;
                                    break;
                                }else{
                                    if(newAge >= 24 && newAge <= 100){
                                        System.out.println("You're age must be 24 to 100 y/olds.");
                                    } else{
                                        System.out.println("Age doesn't meet the requirement for student.");
                                    }
                                }
                            } catch (Exception e) {
                                System.out.printf("This [%s] is invalid, Please Enter the valid Choices.\n", newStAgeInput);
                            }

                            int updAge = Integer.parseInt(stDetails[4]);
                            if(updAge >= 24  && updAge <= 100){
                                System.out.println("You're a Student.");
                            }
                        }

                        System.out.println("Your profile was succesfully updated.");
                        break;
                    } else if(eIns.equalsIgnoreCase("N")){
                        System.out.println("Your editing profile is not updated.");
                        break;
                    }  else{
                        System.out.println("Invalid Input.");
                    }
                break;
            }
        }
        if(!isFound){
            System.out.println("This ID is not existing, try to add first");
        }
    }
    }

    //SEARCH STUDENTS
    private static void searchStudent() {
        // Scanner searchStudent = new Scanner(System.in);
        System.out.println("Search Student: ");
        String studentSearched = s.nextLine();

        boolean found = false;
        for (String[] student : forStudents) {
            if (student.length >= 6 &&
                    (student[0].toUpperCase().contains(studentSearched.toUpperCase()) ||
                            student[1].toUpperCase().contains(studentSearched.toUpperCase()) ||
                            (student[2] != null && student[2].toUpperCase().contains(studentSearched.toUpperCase())) ||
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
            }
        }

        if (!found) {
            System.out.println("No student found.");
        }
    }

    //STUDENTS DATA GETTER
    public static String[] stInformation(String dataInformation) {
        String informationForAll[] = new String[6];
        System.out.println("CREATE STUDENT/S FORM\n");

        while(!isTrue){
            System.out.print("Enter your First Name: ");
            String stFname = s.nextLine();
            if(stFname.isBlank()){
                System.out.println("First name is empty, Fill it");
            } else if(stFname.matches(".*\\d.*")){
                System.out.println("First name can't contain any number");
            } else{
                informationForAll[0] = stFname;
                break;
            }

        }

        while(!isTrue){
            System.out.print("Enter your Last Name: ");
            String stLname = s.nextLine();
            if(stLname.isBlank()){
                System.out.println("Last name is empty, fill it");
            } else if(stLname.matches(".*\\d.*")){
                System.out.println("Last name can't contain any number");
            } else{
                informationForAll[1] = stLname;
                break;
            }
        }

        while(!isTrue){
            System.out.print("Enter your Middle Name (Optional): ");
            String stMname = s.nextLine();
            if(stMname.matches(".*\\d.*")){
                System.out.println("Middle name can't contain any number");
            } else{
                informationForAll[2] = stMname;
                break;
            }
        }

        while(!isTrue){
            System.out.print("Enter your Address: ");
            String  stAddress = s.nextLine();
            if(stAddress.isBlank()){
                System.out.println("Address is empty, Fill it");
            } else{
                informationForAll[3] = stAddress;
                break;
            }
        }

        while(true){
            System.out.print("Enter your Age: ");
            String insAgeInput = s.nextLine();
            try {
                int insAge = Integer.parseInt(insAgeInput);
                if(insAge >= 17 && insAge <= 23){
                    informationForAll[4] = insAgeInput;
                    break;
                }else{
                    if(insAge >= 17 && insAge <= 23){
                        System.out.println("You're age must be 17 to 23 y/olds.");
                    } else{
                        System.out.println("Age doesn't meet the requirement for students");
                    }
                }
            } catch (Exception e) {
                System.out.printf("This [%s] is invalid, Please Enter the valid Choices.\n", insAgeInput);
            }
        }
        int insAge = Integer.parseInt(informationForAll[4]);
        if(insAge >= 17  && insAge <=23){
            System.out.println("You're a Student.");
        }

        System.out.print("\nDo you want to add this student?\n[Y] Yes, i want to add it\n[N] No, maybe later\n");

        while(!isTrue){
            System.out.print("Choices [Y/N]: ");
            String sC = s.nextLine().toUpperCase();

            if(sC.equals("Y")){
                break;
            } else if(sC.equals("N")){
                return new String[0];
            } else{
                System.out.println("Invalid input");
            }
        }

        return informationForAll;
    }

    //DISPLAYING DATA FOR STUDENTS
    private static void displayingDataOfStudents(){
        if(forStudents.isEmpty() || forStudents == null){
            System.out.println("There's no Student Available, Try to Add");
            return;
        }

        getDataForStudents(forStudents); //forSubjects;

    }


    //SETTER DATA FOR STUDENTS
    private static void getDataForStudents(List<String[]> takeDataForStudent) { //List<String[]> takeSubjectData
        List<String[]> getDataOfStudent = new ArrayList<>(takeDataForStudent);
        String[] textTitle = {"|STUDENT ID", "|FIRST NAME", "|LAST NAME", "|MIDDLE NAME", "|ADDRESS", "|AGE" , "|SUBJECT CODE", "|SUBJECT TITLE", "|SUBJECT DESCRIPTION|\n"};
        System.out.println("\t\t\t\t DISPLAYING ALL STUDENTS THAT EXIST IN DATABASE");
        System.out.println("==============================================================================================================================================");

        for(String together: textTitle){
            System.out.printf("%-17s", together);   
        }
        System.out.println("==============================================================================================================================================");
        for (String[] getDatas : getDataOfStudent) {
            if (getDatas.length >= 5) {
                String studentIdentity = getDatas[5];
                String stFname = getDatas[0];
                String stLname = getDatas[1];
                String stMname = getDatas[2];
                String stAddress = getDatas[3];
                String stAge = getDatas[4];

                String newAddress = textBehaviour(stAddress, 20);

                System.out.printf("\r|%-16s| %-16s| %-16s| %-16s| %-16s| %-16s|\n", studentIdentity, stFname.toUpperCase(), stLname.toUpperCase(), stMname.toUpperCase(), newAddress.toUpperCase(), stAge);
                System.out.println("==================================================================================================================================================");
                // List<String> addedEnrolledSubject = new ArrayList<>();
                // List<String> addedSubjectCode = new ArrayList<>();
                // List<String> addedSubjectTitle = new ArrayList<>();
                // List<String> addedSubjectDescription = new ArrayList<>();
                // for(String[] added : takeSubjectData){
                //     if(added.length >= 3 && added[0].contains(studentIdentity)){
                //         addedSubjectCode.add(added[1]);
                //         addedSubjectTitle.add(added[2]);
                //         addedSubjectDescription.add(added[3]);
                //     }
                // }

                // for(int i = 0; i < addedEnrolledSubject.size(); i++){
                // System.out.printf("| %-12s | %-12s | %-14s | %-14s | %-14s | %-8s | %-12s | %-12s | %-12s|\n", studentIdentity, stFname.toUpperCase(), stLname.toUpperCase(), stMname.toUpperCase(), newAddress.toUpperCase(), stAge, addedSubjectCode.get(i), addedSubjectTitle.get(i), addedSubjectDescription.get(i));
                // }
                // System.out.println("====================================================================================================================");
            }
        }
    }

    /*ANOTEHER PROVIDER METHOD ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

    //METHODS FOR CLEARING SYSTEM SCREEN
    static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    //METHOD FOR TEXT ABBREVIATION
    public static String textBehaviour(String text, int maxOfText) {
        if (text.length() <= maxOfText) {
            return text;
        }

        StringBuilder cBuilder = new StringBuilder();
        int len = 0;

        for (char tparts : text.toCharArray()) {
            cBuilder.append(tparts);
            len++;

            if (tparts == ' ' && len >= maxOfText) {
                break;
            }
        }

        while (cBuilder.charAt(cBuilder.length() - 1) == ' ') {
            cBuilder.deleteCharAt(cBuilder.length() - 1);
        }

        cBuilder.append("...");
        return cBuilder.toString();
    }

    //METHOD FOR CALENDAR

    public static int yearAtFure(){
        Calendar yearInCalendar = Calendar.getInstance();
        int yearNow = yearInCalendar.get(Calendar.YEAR) % 100;
        return yearNow;
    }

}
//CLASSES FOR UNIVERSITY MANAGEMENT SYSTEM ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */


//CLASS FOR STUDENTS
class ThisIsForStudent extends UniversityManagementSystem{
    private String idOFstudent;

    void instantiateOfStudents(){
        this.idOFstudent = r4d(forStudents);
        // dataBaseForID(idOFstudent);
    }

    private String r4d(List<String[]> forSubject){
        final Random r = new Random();
        final int student4Digit = r.nextInt(9000) + 999;
        String stFormat = String.format("ST"+ year +"-%04d", student4Digit);
        forStudents.add(new String[]{stFormat});
        return stFormat;
    }

    private void dataBaseForID(String stIdentity){
        forStudents.add(new String[]{stIdentity});
    }

    public String getTheStudentId(){
        return idOFstudent;
    }

    public void sujectToAdd(String StId, String subjCode){
        for(String student[] : forStudents){
            if(student[0].contains(StId)){
                if(!Arrays.asList(student).contains(subjCode)){
                    List<String> updateDataOfStudent = new ArrayList<>(Arrays.asList(student));
                    updateDataOfStudent.add(subjCode);
                    forStudents.remove(student);
                    forStudents.add(updateDataOfStudent.toArray(new String[1-1]));
                    System.out.println("This subject " + subjCode + " added to student " + StId);
                }else{
                System.out.print("This student" +  StId + "already have this subject code" + subjCode);
                }
            return;
            }
        }
        System.out.println("This student" + StId + "was not existing in database");
    }
}

//CLASS FOR INSTRUCTORS

class ThisIsForInstructor extends UniversityManagementSystem{

    private String idOFInstructor;

    void instantiateOfInstructor(){
        this.idOFInstructor = r4d(forInstructors);
        // dataBaseForID(idOFInstructor);
    }

    private String r4d(List<String[]> forInstructor){
        final Random r = new Random();
        final int instuctor4Digit = r.nextInt(9000) + 999;
        String insFormat = String.format("INS"+ year +"-%04d", instuctor4Digit);
        forInstructors.add(new String[]{insFormat});
        return insFormat;
    }

    private void dataBaseForID(String insIdentity){
        forInstructors.add(new String[]{insIdentity});
    }

    public String getTheInstructorId(){
        return idOFInstructor;
    }

    public void subjectToAssign(String insId, String subjCode ){
        for(String [] insPassSub : forInstructors){
            if(insPassSub[0].equals(idOFInstructor)){
                insPassSub[1] = subjCode;
                System.out.print("This subject was assigning to "+ idOFInstructor);
                return;
            }
        } 
        System.out.printf("Instructor %s not found", idOFInstructor);  
    }

    public boolean checkerOfSubject (String subjCode){
        for(String ins[] : forInstructors){
            if(ins[0].equals(idOFInstructor) && ins.length > 1 && ins[1].equals(subjCode)){
                return true;
            }
        }
        return false;
    }
}

//CLASS FOR SUBJECTS
class ThisIsForSubject extends UniversityManagementSystem {

    private String idOFSubject;

    void instantiateOfSubject(){
        this.idOFSubject = r4d(forSubjects);
    }

    private String r4d(List<String[]> forSubject){
        final Random r = new Random();
        final int subject4Digit = r.nextInt(9000) + 999;
        String subFormat = String.format("SUB"+ "-%04d", subject4Digit);
        forSubjects.add(new String[]{subFormat});
        return subFormat;
    }

    public String getTheSubjectId(){
        return idOFSubject;
    }
}
