import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class UniversityManagementSystem {
	private static final Scanner s = new Scanner(System.in);

    static List<String[]> forInstructors = new ArrayList<>();
    static List<String[]> forStudents = new ArrayList<>();
    static List<String[]> forSubjects = new ArrayList<>();

	public static void main(String[] backToMain) {
        

		// UNIVERSITY MANAGEMENT SYSTEM
		System.out.println("\n------------------------------------------------\nUNIVERSITY MANAGEMENT SYSTEM\n");
        System.out.print("\n[1]Prompt To Add \n[2]Prompt To Display \n[3]Prompt To Delete \n[4]Prompt To Edit \n[5]Prompt To Search \n[6]Want To End\n");
        System.out.print("Enter Index From 1-6:");
		int choice = s.nextInt();
        s.nextLine();
        // Assign for Add
		switch(choice) {
			case 1:
                clearScreen();
                System.out.println("ADDING <INFO>");
                System.out.println("\n[1]Add Instructor\n[2]Add Student\n[3]Add Subject\n[4]Back");
                System.out.print("Enter Index 1-3: ");
                int addChoice = s.nextInt();
                s.nextLine();
                switch(addChoice){
                    case 1:
                        System.out.println("INSTRUCTOR FORM");
                        addingInstructor(); 
                        main(backToMain);
                        break;
                    case 2:
                        System.out.println("STUDENT FORM");
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
                        break;
                }
                break;
            //Assign For Display
            case 2:
                clearScreen();
                System.out.println("DISPLAYING <INFO>");
                System.out.println("\n[1]Display Instructor\n[2]Display Student\n[3]Display Subject\n[4]Back");
                System.out.print("Enter Index 1-3: ");
                int displayChoice = s.nextInt();
                s.nextLine();
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
                        main(backToMain);
                        break;
                    case 4:
                        main(backToMain);
                        break;
                    default:
                        break;
                }
                break;
            //Assign For Delete
            case 3:     
                clearScreen();
                System.out.println("DELETE <INFO>");   
                System.out.println("\n[1]Delete Instructor\n[2]Delete Student\n[3]Delete Subject\n[4]Back");
                System.out.print("Enter Index 1-3: ");
                int deleteChoice = s.nextInt();
                switch(deleteChoice){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        main(backToMain);
                        break;
                }
            //Assign For Edit
            case 4:
                clearScreen();
                System.out.println("EDIT <INFO>");
                System.out.println("\n[1]Edit Instructor\n[2]Edit Student\n[3]Edit Subject\n[4]Back");
                System.out.print("Enter Index 1-3: ");
                int editChoice = s.nextInt();
                switch(editChoice){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        main(backToMain);
                        break;
                }
            //Assign For Searching
            case 5:
                clearScreen();
                System.out.println("SEARCHING <INFO>");
                System.out.println("\n[1]Search Instructor\n[2]Search Student\n[3]Search Subject\n[4]Back");
                System.out.print("Enter Index 1-3: ");
                int searchChoice = s.nextInt();
                switch(searchChoice){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        main(backToMain);
                        break;
                }
            case 6:
                System.err.print("Warning!!!\nDo you want to end this program?\n[Y] Yes \n[N] No \nChoose From Y/N: ");
                String yesOrNo = s.next().trim().toUpperCase();
                if(yesOrNo.equals("Y") || yesOrNo.equals("YES")){
                    System.out.println("Bat ka nag exit parr");
                    break;
                }else{
                    System.out.println("--------------------------------------------------");
                    main(backToMain);
                }
                    break;
            default:
                clearScreen();
                System.out.printf("This [%s] is invalid, Please Enter the valid Choices.", choice);
                    main(backToMain);
                    break;
            
		}
        s.close();	
	}

    static void addingSubject(){
        String [] subDetails = subject("SubjectDetails");
        forSubjects.add(subDetails);
    }

	
    static ThisIsForInstructor ins = new ThisIsForInstructor();

    private static void addingInstructor(){
        String[] iDetails = information("instructorDeatails");

        ins.instantiateOfInstructor();
        String insId = ins.getTheInstructorId();
        iDetails[5] = insId;
        forInstructors.add(iDetails);
        
    }
    
    static ThisIsForStudent st = new ThisIsForStudent();

    private static void addingStudent(){
        String[] sDetails = information("studentDeatails");

        String stId = st.getTheStudentId();
        sDetails[5] = stId;
        forStudents.add(sDetails);
    }

	static String[] information(String dataInformation) {
		String informationForAll[] = new String[6];

		System.out.print("Enter your First Name: ");
		informationForAll[0] = s.nextLine();
		System.out.print("Enter your Last Name: ");
		informationForAll[1] = s.nextLine(); 
		System.out.print("Enter your Middle Name (Optional): ");
		informationForAll[2] = s.nextLine(); 
		System.out.print("Enter your Address: ");
		informationForAll[3] = s.nextLine();
        System.out.println(); 

        while(true){
		System.out.print("Enter your Age: ");
        String insAgeInput = s.nextLine(); 
		// informationForAll[4] = s.nextLine(); 
            try {
                int insAge = Integer.parseInt(insAgeInput);
                if(insAge >= 17 && insAge <= 23 || insAge >= 24 && insAge <= 100){
                    informationForAll[4] = insAgeInput;
                    break;
                }else{
                    if(insAge >= 17 && insAge <= 23){
                    System.out.println("You're age must be 17 to 23 y/olds.");
                    } else{
                        System.out.println("You're age must be 24 to 100 y/olds.");
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
        else if(insAge >= 24 && insAge <= 100){
            System.out.println("You're  a Instructor");
        }
		return informationForAll;
	}

    private static void displayingDataOfInstructors(){
        if(forInstructors.isEmpty() || forInstructors != null){
            System.out.println("There's no Instructor Available, Try to Add");
        }
        getDataForInstructors(forInstructors);
    }

    private static void displayingDataOfStudents(){
        if(forStudents.isEmpty() || forStudents != null){
            System.out.println("There's no Student Available, Try to Add");
        }
        getDataForStudents(forStudents);
    }
    

    static String[] subject(String sub){
        String subjectForAll[] = new String[2];

        System.out.print("Enter subject title: ");
        subjectForAll[0] = s.nextLine();
        System.out.print("Enter subject description: ");
        subjectForAll[1] = s.nextLine();

        return subjectForAll;
    }

    static void getDataForInstructors(List<String[]> takeDataForInstructor){
            List<String[]> getDataOfIns= new ArrayList<>(takeDataForInstructor);  
            for(String[] getData: getDataOfIns){
                if(getData.length >= 5){

                String insFname = getData[0];
                String insLname = getData[1];
                String insMname = getData[2];
                String insAddress = getData[3];
                String insAge = getData[4];
               
                // String instructorIdentity = ins.getTheInstructorId();
                String instructorIdentity = getData[5];



                System.out.print("INSTRUCTOR ID:"+instructorIdentity+"\n|Fisrt Name: " +insFname+" | Last Name: "+insLname+" | Middle Name: "+insMname+" | Address: "+insAddress+" | Age: "+insAge+" |\n");
                }else{}
                }
            
        
    }

    static void getDataForStudents(List<String[]> takeDataForStudent){
        
        for(String[] getData: takeDataForStudent){
            String stFname = getData[0];
            String stLname = getData[1];
            String stMname = getData[2];
            String stAddress = getData[3];
            String stAge = getData[4];
            
            String studentIdentity = getData[5];

            System.out.print("STUDENT ID:"+studentIdentity+"\n|Fisrt Name: "+stFname+" | Last Name: " +stLname +" | Middle Name: "+stMname+" | Address: "+stAddress+" | Age: "+stAge+" |\n");
        }
    }

    static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
class ThisIsForStudent extends UniversityManagementSystem{
    private String idOFstudent;
    
    public ThisIsForStudent(){
        this.idOFstudent = r4d();
    }

    private String r4d(){
        final int year = 24;
        final Random r = new Random();
        final int student4Digit = r.nextInt(1000,10000);
        String stFormat = String.format("(ST"+ year +"-%04d)%n", student4Digit);
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
    }

    private String r4d(List<String[]> forInstructor){
        final int year = 24;
        final Random r = new Random();
        final int instuctor4Digit = r.nextInt(1000,10000);
        String insFormat = String.format("(INS"+ year +"-%04d)%n", instuctor4Digit);
        forInstructors.add(new String[]{insFormat});
        return insFormat;
    }

    public String getTheInstructorId(){
        return idOFInstructor;
    }
} 

class ThisIsForSubject extends UniversityManagementSystem {
}
