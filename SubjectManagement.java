import java.util.Scanner;

import java.util.List;
import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

interface forMethodsInSubject{
    void addingSubject();
    void displaySubject();
    void editSubject();
    void deleteSubject();
    void searchSubject();
}


public class SubjectManagement extends UMPS implements forMethodsInSubject{
    
    private static Scanner s = new Scanner(System.in);
    
    static ThisIsForSubject subs = new ThisIsForSubject();

    //ADD SUBJECT--------------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public  void addingSubject(){
    
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

    //DELETE SUBJECT--------------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public  void deleteSubject(){
        do{
            System.out.print("\nEnter the Student ID \"SUB-1234\": ");
            String deleteCode = s.nextLine().trim();
            if(deleteCode.isBlank()){
                System.out.println("The subject code can't be blank.");
            } else{
            boolean isFound = false;
    
            for(int i = forSubjects.size() - 1; i >= 0; i--){
                String[] subject = forSubjects.get(i);
    
                if(subject.length > 2){
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
        }while(deleteAgain());
    }

    //SUBJECT DATA GETTER--------------------------------------------------------------------------------------------------------------------------------------------------------------
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
    public static void getDataForSubjects(List<String[]> takeDataForSubjects){
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

    // private void subManage (){
    //     ThisIsForStudent stm = new ThisIsForStudent();
    //     // stm.subjectToAdd(addSubj, stSub, subjsTitle, subjsDescription);
    // }

    ThisIsForStudent student = new ThisIsForStudent();
    ThisIsForInstructor insToSub = new ThisIsForInstructor();
    UMPS subjectTake = new UMPS();

    //DISPLAY DATA FOR SUBJECTS--------------------------------------------------------------------------------------------------------------------------------------------------------------
     @Override
    public void displaySubject(){
        if(forSubjects.isEmpty()){
            System.out.println("There's no subject Available, Try to add");
            return;
        } else {
        getDataForSubjects(forSubjects);

        boolean toStop = false;
        String extraInDisplay;
            do{
                System.out.println("\nDo you want assign/add subject?");
                System.out.println("[I] Assigning subject to Instrctor");
                System.out.println("[S] Adding subject to Student");
                System.out.println("[E] Type \"E\" if you want to back to main \nChoices: ");
                extraInDisplay = s.nextLine().toUpperCase().trim();
                switch (extraInDisplay) {
                    case "I":
                        System.out.print("\nEnter the Instructor ID \"INS" + year + "-1234\": ");
                        String assignSubj = s.nextLine().trim().toUpperCase();
                        if (matchingInstructor(assignSubj)) {
                            System.out.println("Processing assigning...");
                            System.out.print("Enter Subject Code  \"SUB-1234\" to assign to the instructor: ");
                            String insSub = s.nextLine().trim().toUpperCase();



                            boolean alreadyHave = false;
                            for (String[] assignment : forSubjects) {
                                if (assignment.length > 5 && assignment[5] != null && assignment[5].equals(assignSubj) && assignment[2].equals(insSub)) {
                                    alreadyHave = true;
                                    break;
                                }
                            }


                            if(!alreadyHave){
                            String[] assigning = new String[6];
                            assigning[5] = assignSubj;
                            assigning[2] = insSub; 
                            forSubjects.add(assigning);
                            
                            insToSub.instantiateOfInstructor();
                            String insId = insToSub.getTheInstructorId();
                            String subcode = insSub;
                            insToSub.confirmationOfAssigning(insId, subcode);

                            InstructorManagement insManage = new InstructorManagement();
                            insManage.getDataForInstructors(forInstructors, forSubjects);
                            }  else {
                                System.out.println("Subject " + insSub + " is already assigned to instructor " + assignSubj);
                            }
                             
                            toStop = true;
                            return;
                        } else {
                            System.out.println("There's no instructor with this ID. Please try again.");
                        }
                        break;
                    case "S":
                        System.out.print("\nEnter the Student ID  \"ST" + year + "-1234\": ");
                        String addSubj = s.nextLine().trim().toUpperCase();
                        if (matchingStudent(addSubj, forStudents)) {
                            System.out.println("Processing adding...");
                            System.out.print("Enter Subject Code  \"SUB-1234\" to add to the student: ");
                            String stSub = s.nextLine().trim().toUpperCase();
                            System.out.print("Enter Subject Title: ");
                            String subjsTitle = s.nextLine().trim();
                            System.out.print("Enter Subject Description: ");
                            String subjsDescription = s.nextLine().trim();
                           
                            student.subjectToAdd(addSubj, stSub, subjsTitle, subjsDescription);


                            StudentManagement st = new StudentManagement();
                            st.getDataForStudents(forStudents, forSubjects);
                            
                            toStop = true;
                            return;
                        } else {
                            System.out.println("There's no student with this ID. Please try again.");
                        }
                        break;
                    case "E":
                        System.out.println("Returning to the main menu.");
                        return;
                    default:
                        System.out.println("Invalid input. Please try again.");
                }
            }while(!toStop);
        }
    }

    //EDIT SUBJECT--------------------------------------------------------------------------------------------------------------------------------------------------------------
     @Override
    public void editSubject() {
        do{
            System.out.print("\nEnter the subject code \"SUB-1234\": ");
            String editCode = s.nextLine().trim();
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
        }while(editAgain());
    }

    //SEARCH SUBJECT--------------------------------------------------------------------------------------------------------------------------------------------------------------
     @Override
    public void searchSubject() {
        do{
            System.out.println("Search Subject: ");
            String subjectSearched = s.nextLine().toUpperCase().trim();
            if(subjectSearched.isBlank()){
                System.out.println("The subject code can't be blank.");
            } else{
            boolean found = false;
            for (String[] subject : forSubjects) {
                if (subject.length > 2 &&
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
        }while(searchAgain());
    }
}