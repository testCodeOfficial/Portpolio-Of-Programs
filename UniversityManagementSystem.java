import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class UniversityManagementSystem {
	static final Scanner s = new Scanner(System.in);

    static List<String[]> forInstructors = new ArrayList<>();
    static List<String[]> forStudents = new ArrayList<>();
    static List<String[]> forSubjects = new ArrayList<>();
    static Boolean isTrue = false;
    static final int year = 24;

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
                                System.out.println("\nThe input is not valid.");
                                System.out.println("--------------------------------------------------------------------------------------------");
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
                        int deleteChoice = s.nextInt();
                        s.nextLine();
                        clearScreen();
                        switch(deleteChoice){
                            case 1:
                                deleteInstructor();
                                main(backToMain);
                                break;
                            case 2:
                                main(backToMain);
                                break;
                            case 3:
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
                        }
                }while(!isTrue);
                        break;
                    //Assign For Edit
                    case 4:
                        clearScreen();
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
                                main(backToMain);
                                break;
                            case 3:
                                main(backToMain);
                                break;
                            case 4:
                                main(backToMain);
                                break;
                            default:
                                break;
                        }
                        break;
                    //Assign For Searching
                    case 5:
                        clearScreen();
                        System.out.println("SEARCHING < INFORMATION" +
                                " >");
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
            }
 

        }while(!isTrue);
        s.close();
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
        Scanner forDelete = new Scanner(System.in);
        System.out.print("\b Instructor ID must enter in this space: ST"+ year);    
        String delOp = forDelete.nextLine();
    }

    private static void searchSubject() {
        Scanner searchSub = new Scanner(System.in);
        System.out.println("Search Subject: ");
        String subjectSearched = searchSub.nextLine();

        boolean found = false;
        for (String[] subject : forSubjects) {
            if (subject.length >= 3 &&
                    (subject[0].toUpperCase().contains(subjectSearched.toUpperCase()) || // Title
                            subject[1].toUpperCase().contains(subjectSearched.toUpperCase()) || // Description
                            subject[2].equals(subjectSearched))) { // ID
                System.out.println("Subject Found:");
                System.out.println("Title: " + subject[0]);
                System.out.println("Description: " + subject[1]);
                System.out.println("ID: " + subject[2]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No subject found.");
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
            } else if(sTitles.matches(".*\\d.*")){
                System.out.println("Subject title can't contain any number");
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
            } else if(sDes.matches(".*\\d.*")){
                System.out.println("Subject description can't contain any number");
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
            System.out.println("\t\t\t\t\t\t DISPLAYING ALL SUBJECTS THAT EXISTING IN DATABASE");
            System.out.println("=============================================================================================================================================================");
            System.out.println("| \tSUBJECT CODE\t | \tSUBJECT TITLE\t | \tSUBJECT DESCRIPTION\t |");
            System.out.println("=============================================================================================================================================================");
            for(String[] getData: getDataOfSubs){
                if(getData.length >= 2){

                String sTitle = getData[0];
                String sDescription = getData[1];
                String sIdentity = getData[2];

                String newStitle = textBehaviour(sTitle, 12);
                String newSDescription = textBehaviour(sDescription, 12);
                String newSIdentity = textBehaviour(sIdentity, 12);

                System.out.print("|\t "+newSIdentity+" \t| \t"+newStitle+" \t| \t"+newSDescription+" \t|");
                }
            }
            
        
    }
    //DISPLAY DATA FOR SUBJECTS
    private static void displayingDataOfSubjects(){
        if(forSubjects.isEmpty()){
            System.out.println("There's no subject Available, Try to add");
            return;
        } 
        getDataForSubjects(forSubjects);
        String extraInDisplay;
        do{
            System.out.println("\n======================================================================================================================\n");
            System.out.println("Do you want assign/add subject?");
            System.out.println("[I] Assigning subject to Instructor");
            System.out.println("[S] Adding subject to Student");
            System.out.println("[E] Type \"E\" if you want to back to main \nChoices: ");
            extraInDisplay = s.nextLine().toUpperCase();
                if(extraInDisplay.equalsIgnoreCase("I")){
                    System.out.print("\nEnter the Instructor ID (e.g., INS"+ year + "-1234) with only 4 digits: ");
                    String assignSubj = s.nextLine();
                    if(assignSubj.equals(forInstructors)){
                    System.out.println("Processing for assigning...");
                    System.out.println("Enter Subject Code you want to assign in student: ");
                    String insSub = s.nextLine();
                    } else {
                        System.out.println("There's no instructor existing with this ID, try to add first");
                    }
                        if(inSub.equals(forSubjects)){
                            forInstructors.add();
                        } else{
                            System.out.println("There's no subject existing with this code, try to add first");
                        }
                } else if(extraInDisplay.equalsIgnoreCase("S")){
                    System.out.print("\nEnter the Student ID (e.g., ST"+year + "-1234) with only 4 digits: ");
                    String addSubj = s.nextLine();
                    if(addSubj.equals(forStudents)){
                    System.out.println("Processing for adding...");
                    System.out.println("Enter Subject Code you want to add in student: ");
                    String stSub = s.nextLine();
                    } else{
                        System.out.println("There's no student existing with this ID, try to add first");
                    }
                        if(stSub.equals(forSubjects)){

                        } else{
                            System.out.println("There's no subject existing with this code, try to add first");
                        }
                } else if(extraInDisplay.equalsIgnoreCase("E")){
                    break;
                } else{
                    System.out.println("Invalid input please try again.");
                }
            }while(extraInDisplay != "E");                                   
                                        
        return;
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
    private static void deleteInstructor() {
        Scanner delScanner = new Scanner(System.in);
        System.out.print("\nEnter the Instructor ID (e.g., INS" + year + "-1234) with only 4 digits: ");
        String deleteID = delScanner.nextLine();

        boolean isFound = false;

        for(int i = forInstructors.size() -1; i >= 0; i--){
            String[] ins = forInstructors.get(i);
            String deletionOfInstructor = forInstructors.get(i);

                if(deletionOfInstructor.endsWith(deleteID)){
                    isFound = true;
                    System.out.println("INS24-"+deleteID+" ID is processing... for deleting .");
                    System.out.println();
                    String adminConfirmation;
                    System.out.printf("Admin: Are you sure you want to delete this profile we need as confirmation.");
                    adminConfirmation = delScanner.nextLine();

                    if(adminConfirmation.equalsIgnoreCase("Y")){
                        forInstructors.remove(i);
                        System.out.println("This instructor profile is now confirm deleted." );
                    } else{
                        System.out.println("This instructor profile is not confirm deleted in database");
                    }
                    break;
                }
        }

        if (!isFound) {
            System.out.println("This instructor is not existing.");
        }

        delScanner.close();
    }    

    // //EDITING INSTRUCTOR METHOD
    private static void editInstructor() {
        Scanner editScanner = new Scanner(System.in);
        System.out.print("\nEnter the Instructor ID (e.g., INS" + year + "-1234) with only 4 digits: ");
        String editID = editScanner.nextLine();
    
        if (!editID.matches("\\d{4}$")) {
            System.out.println("Invalid input format. Instructor ID should contain only 4 digits.");
            editScanner.close();
            return;
        } 
        boolean isFound = false;

        for(String insDetails[]: forInstructors){
  
            for(String fI : insDetails){

            if(fI.contains(editID)){
                isFound = true;
                System.out.println("\n< The instructor is in the database > ");
                System.out.print("\n|First Name: " +insDetails[0]+" | Last Name: "+insDetails[1]+" | Middle Name: "+insDetails[2]+" | Address: "+insDetails[3]+" | Age: "+insDetails[4]+" |\n");
                System.out.println();

                    System.out.print("\nDo you want to edit this instructor?\n[Y] Yes, I want to edit it\n[N] No, maybe later\n");
                    String eIns = editScanner.nextLine().trim().toUpperCase();
                    editScanner.nextLine();

                    boolean editForAll = false;
                    if(eIns.equalsIgnoreCase("Y")){
                        System.out.println("Proceed to edit your profile");

                        
                        while(!editForAll){
                            System.out.print("Enter your First Name: ");
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
                            System.out.print("Enter your Last Name: ");
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
                            System.out.print("Enter your Middle Name (Optional): ");
                            String newInstructorMiddleName = s.nextLine();
                            if(newInstructorMiddleName.matches(".*\\d.*")){
                                System.out.println("Middle name can't contain any number");
                            }else{
                                insDetails[2] = newInstructorMiddleName; 
                                break;
                            }
                        }
                        
                        while(!editForAll){
                            System.out.print("Enter your Address: ");
                            String newInstructorAddress = s.nextLine();
                
                            if(newInstructorAddress.isBlank()){
                                System.out.println("Address is empty, Fill it");
                            } else{
                                insDetails[3] = newInstructorAddress; 
                                break;
                            }
                        }
                        
                
                        while(!editForAll){
                        System.out.print("Enter your Age: ");
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
                        break;
                    } else if(eIns.equalsIgnoreCase("N")){
                        System.out.println("Your editing profile is not updated.");
                        break;
                    }  else{
                        System.out.println("Invalid Input.");
                    }
                    editScanner.close();
                }
            }
        }
        if(!isFound){
            System.out.println("This ID is not existing, try to add first");
        }
        

        return;
    }
    

    //SEARCHING INSTRUCTOR METHOD
    private static void searchInstructor() {
        Scanner insSearch = new Scanner(System.in);
        System.out.println("Search Instructors: ");
        String instructorSearched = insSearch.nextLine();
    
        boolean found = false;
        for (String[] instructor : forInstructors) {
            if (instructor.length >= 6 &&
                    (instructor[0].toUpperCase().contains(instructorSearched.toUpperCase()) || 
                    instructor[1].toUpperCase().contains(instructorSearched.toUpperCase()) || 
                    (instructor[2] != null && instructor[2].toLowerCase().contains(instructorSearched.toLowerCase())) || 
                    instructor[3].toUpperCase().contains(instructorSearched.toUpperCase()) || 
                    (instructor[4] != null && instructor[4].equals(instructorSearched)) || 
                    (instructor[5] != null && instructor[5].equals(String.format("INS%s-%04d", year, Integer.parseInt(instructorSearched))))
                     )) {
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
        getDataForInstructors(forInstructors);
        // System.out.println("\nSUBJECT HANDLE");
        // getDataForSubjects(forSubjects);

    }

    //GETTER DATA FOR INSTRUCTOR
    private static void getDataForInstructors(List<String[]> takeDataForInstructor){
            List<String[]> getDataOfIns= new ArrayList<>(takeDataForInstructor);  
            System.out.println("\t\t\t\t\t\t DISPLAYING ALL INSTRUCTORS THAT EXISTING IN DATABASE");         
            System.out.println("=============================================================================================================================================================");
            System.out.printf("| %-10s | %-10s | %-10s | %-8s | %-25s | %-4s | %-15s | %-15s | %-30s |\n", 
            "INSTRUCTOR ID", "FIRST NAME", "LAST NAME", "MIDDLE NAME", "ADDRESS", "AGE", "SUBJECT CODE", "SUBJECT TITLE", "SUBJECT DESCRIPTION");
            System.out.println("=============================================================================================================================================================");
            for(String[] getData: getDataOfIns){
                if(getData.length >= 5){

                String insFname = getData[0];
                String insLname = getData[1];
                String insMname = getData[2];
                String insAddress = getData[3];
                String insAge = getData[4];
                String instructorIdentity = getData[5];

                String newInsAddress = textBehaviour(insAddress, 7);
                System.out.printf("| %-10s | %-10s | %-10s | %-8s | %-25s | %-4s |\n", instructorIdentity, insFname.toUpperCase(), insLname.toUpperCase(), insMname.toUpperCase(), newInsAddress.toUpperCase(), insAge);System.out.println("============================================================================================================================================================");
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

    private static void searchStudent() {
        Scanner searchStudent = new Scanner(System.in);
        System.out.println("Search Student: ");
        String studentSearched = searchStudent.nextLine();

        boolean found = false;
        for (String[] student : forStudents) {
            if (student.length >= 6 &&
                    (student[0].toUpperCase().contains(studentSearched.toUpperCase()) || 
                            student[1].toUpperCase().contains(studentSearched.toUpperCase()) || 
                            (student[2] != null && student[2].toUpperCase().contains(studentSearched.toUpperCase())) || 
                            student[3].toLowerCase().contains(studentSearched.toUpperCase()) ||
                            (student[4] != null && student[4].equals(studentSearched)) ||
                            (student[5] != null && student[5].equals(String.format("ST%s-%04d", year, Integer.parseInt(studentSearched)))))) {
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

            getDataForStudents(forStudents);

    }


    //SETTER DATA FOR STUDENTS
    private static void getDataForStudents(List<String[]> takeDataForStudent) {
        List<String[]> getDataOfStudent = new ArrayList<>(takeDataForStudent);
        System.out.println("\t\t\t\t DISPLAYING ALL STUDENTS THAT EXIST IN DATABASE");
        System.out.println("====================================================================================================================");
        System.out.printf("| %-14s | %-14s | %-14s | %-14s | %-14s | %-8s |\n"
        , "STUDENT ID", "FIRST NAME", "LAST NAME", "MIDDLE NAME", "ADDRESS", "AGE");
        System.out.println("====================================================================================================================");
    
        for (String[] getDatas : getDataOfStudent) {
            if (getDatas.length >= 5) {
                String studentIdentity = getDatas[5];
                String stFname = getDatas[0];
                String stLname = getDatas[1];
                String stMname = getDatas[2];
                String stAddress = getDatas[3];
                String stAge = getDatas[4];

                String newAddress = textBehaviour(stAddress, 20);
    
                System.out.printf("| %-12s | %-12s | %-14s | %-14s | %-14s | %-8s |", studentIdentity, stFname, stLname, stMname, newAddress, stAge);
                System.out.println("====================================================================================================================");
            }
        }
    }

/*METHOD CLS------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

    //METHODS FOR CLEARING SYSTEM SCREEN
    static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    //TEXT ELLIPSIS THE LONG LINE
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
    
}
//CLASSES FOR UNIVERSITY MANAGEMENT SYSTEM ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */


//CLASS FOR STUDENTS
class ThisIsForStudent extends UniversityManagementSystem{
   private String idOFstudent;

   void instantiateOfStudents(){
       this.idOFstudent = r4d(forStudents);
   }

   private String r4d(List<String[]> forSubject){
       final Random r = new Random();
       final int student4Digit = r.nextInt(9000) + 999;
       String stFormat = String.format("ST"+ year +"-%04d", student4Digit);
       forStudents.add(new String[]{stFormat});
       return stFormat;
   }

   public String getTheStudentId(){
       return idOFstudent;
   }
}

class ThisIsForInstructor extends UniversityManagementSystem{

       private String idOFInstructor;

       void instantiateOfInstructor(){
           this.idOFInstructor = r4d(forInstructors);
           dataBaseForID(idOFInstructor);
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

       public findInstructorId(){
          return idOFInstructor;
       }

       public String getTheInstructorId(){
           return idOFInstructor;
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
