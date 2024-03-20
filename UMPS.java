import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//MEMBER OF THIS GROUP
/*BENEDICK BELISANO
 * DEXTER VALENCIA
 * J.B BAROTAG
 * NICOLE STANTON
 * BYRON BORAL
 */

public class UMPS {
    private static final Scanner s = new Scanner(System.in);
    static boolean isTrue = false;
    static List<String[]> forInstructors = new ArrayList<>();
    static List<String[]> forStudents = new ArrayList<>();
    static List<String[]> forSubjects = new ArrayList<>();
    // static List<String[]> assigningSubject = new ArrayList<>();
    // static List<String[]> addingSubject = new ArrayList<>();
    static final int year = yearAtFure();

    public static void main(String[] backToMain) {
        UMPS umps = new UMPS();
        SubjectManagement smanagement = new SubjectManagement(); 
        umps.umpsReturn();
    }

    public void umpsReturn() {
        while (!isTrue) {
            system();
        }
    }

    private void system() {

        String umpsArt = """
                ====================================================================================================================================================
                    \n
                                            ██╗   ██╗███╗   ██╗██╗██╗   ██╗███████╗██████╗ ███████╗██╗████████╗██╗   ██╗
                                            ██║   ██║████╗  ██║██║██║   ██║██╔════╝██╔══██╗██╔════╝██║╚══██╔══╝╚██╗ ██╔╝
                                            ██║   ██║██╔██╗ ██║██║██║   ██║█████╗  ██████╔╝███████╗██║   ██║    ╚████╔╝
                                            ██║   ██║██║╚██╗██║██║╚██╗ ██╔╝██╔══╝  ██╔══██╗╚════██║██║   ██║     ╚██╔╝
                                            ╚██████╔╝██║ ╚████║██║ ╚████╔╝ ███████╗██║  ██║███████║██║   ██║      ██║
                                             ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═══╝  ╚══════╝╚═╝  ╚═╝╚══════╝╚═╝   ╚═╝      ╚═╝

                        ██████╗ ██████╗  ██████╗ ███████╗██╗██╗     ██╗███╗   ██╗ ██████╗     ███████╗██╗   ██╗███████╗████████╗███████╗███╗   ███╗
                        ██╔══██╗██╔══██╗██╔═══██╗██╔════╝██║██║     ██║████╗  ██║██╔════╝     ██╔════╝╚██╗ ██╔╝██╔════╝╚══██╔══╝██╔════╝████╗ ████║
                        ██████╔╝██████╔╝██║   ██║█████╗  ██║██║     ██║██╔██╗ ██║██║  ███╗    ███████╗ ╚████╔╝ ███████╗   ██║   █████╗  ██╔████╔██║
                        ██╔═══╝ ██╔══██╗██║   ██║██╔══╝  ██║██║     ██║██║╚██╗██║██║   ██║    ╚════██║  ╚██╔╝  ╚════██║   ██║   ██╔══╝  ██║╚██╔╝██║
                        ██║     ██║  ██║╚██████╔╝██║     ██║███████╗██║██║ ╚████║╚██████╔╝    ███████║   ██║   ███████║   ██║   ███████╗██║ ╚═╝ ██║
                        ╚═╝     ╚═╝  ╚═╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝╚═╝╚═╝  ╚═══╝ ╚═════╝     ╚══════╝   ╚═╝   ╚══════╝   ╚═╝   ╚══════╝╚═╝     ╚═╝
                        \n
                ====================================================================================================================================================


                                        """;
        System.out.print(umpsArt);

        do {
            String[] op = { "Subject Management", "Instructor Management", "Student Management", "UMPS Terminate" };
            for (int i = 0; i < op.length; i++) {
                System.out.println((i + 1) + ". " + op[i]);
            }
            System.out.print("\nSelect from the option: ");
            String yourChoice = s.nextLine().trim();
            try {
                clearScreen();
                int choice = Integer.parseInt(yourChoice);
                
                switch (choice) {
                    case 1:
                        SubjectManagement();
                        break;
                    case 2:
                        InstructorManagement();
                        break;
                    case 3:
                        StudentManagement();
                        break;
                    case 4:
                           System.out.print("\nuniversity management profiling system termination\n".toUpperCase());
                        System.err.print(
                                "Are you sure you wanna end this program?\n[Y] Yes \n[N] No");
                    
                        System.out.println("Choose From Y/N: ");
                        String yesOrNo = s.nextLine().trim().toUpperCase();
                        
                        if (yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("YES")) {
                            System.out.println("You now exiting in program. Thank You");
                            isTrue = true;
                            break;
                        } else if (yesOrNo.equalsIgnoreCase("N") || yesOrNo.equalsIgnoreCase("NO")) {
                            System.out.println("\n--------------------------------------------------");
                            return;
                        } else if(yesOrNo.isEmpty()){
                            System.out.println("Output can't be empty, and choose only from \"Y or N\"");
                        }else {
                            System.out.println("print: Error Output");
                        }
                            break;
                    
                    default:
                        System.out.println("\n--------------------------------------------------------------------");
                        System.out.printf("This %s input is invalid, The valid is from 1 - 6 only\n", choice);
                        break;

                }
            } catch (NumberFormatException e) {
                System.out.println("\n--------------------------------------------------------------------");
                System.out.print("\nThis input is not from the selection.");
            }
        } while (!isTrue);
    }

    private void SubjectManagement() {

        SubjectManagement subjectManagement = new SubjectManagement();
        while (!isTrue) {
            System.out.println("\n----------------------------------------------------------------\n");
            String[] op = { "Add", "display", "edit", "delete", "search", "return to lobby" };
            for (int i = 0; i < op.length; i++) {
                String[] word = op[i].split(" ");
                StringBuilder capatilizeTheWord = new StringBuilder();
                for (String option : word) {
                    if (!option.isEmpty()) {
                        String fWord = option.substring(0, 1).toUpperCase();
                        String otherWord = option.substring(1).toLowerCase();
                        capatilizeTheWord.append(fWord).append(otherWord).append(" ");
                    }
                }
                String finalTouch = capatilizeTheWord.toString().trim();
                if (i != 5) {
                    System.out.println((i + 1) + ". " + finalTouch + " Subject");
                } else {
                    System.out.println((i + 1) + ". " + finalTouch.replace(" Subject", " "));
                }

            }
            // System.out.println("1. add\n2. display\n3. edit\n 4. delete\n 5. search\n
            // Select from the option: ");
            System.out.print("\nSelect from the option: ");
            String yourChoice = s.nextLine().trim();
            try {
                int choice = Integer.parseInt(yourChoice);
                clearScreen();
                switch (choice) {

                    case 1:
                        clearScreen();
                        subjectManagement.addingSubject();
                        break;
                    case 2:
                        clearScreen();
                        subjectManagement.displaySubject();
                        break;
                    case 3:
                        clearScreen();
                        subjectManagement.editSubject();
                        break;
                    case 4:
                        clearScreen();
                        subjectManagement.deleteSubject();
                        break;
                    case 5:
                        clearScreen();
                        subjectManagement.searchSubject();
                        break;
                    case 6:
                        clearScreen();
                        isTrue = false;
                        umpsReturn();
                        return;
                    default:
                        System.out.println("--------------------------------------------------------------------");
                        System.out.printf("This %s input is invalid, The valid is from 1 - 6 only", choice);
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("--------------------------------------------------------------------");
                System.out.print("This input is not from the selection.");
            }
        }
    }

    private void InstructorManagement() {
        InstructorManagement instructorManagement = new InstructorManagement();
        while (!isTrue) {
            System.out.println("\n----------------------------------------------------------------\n");
            String[] op = { "Add", "display", "edit", "delete", "search", "return to lobby" };
            for (int i = 0; i < op.length; i++) {
                String[] word = op[i].split(" ");
                StringBuilder capatilizeTheWord = new StringBuilder();
                for (String option : word) {
                    if (!option.isEmpty()) {
                        String fWord = option.substring(0, 1).toUpperCase();
                        String otherWord = option.substring(1).toLowerCase();
                        capatilizeTheWord.append(fWord).append(otherWord).append(" ");
                    }
                }

                String finalTouch = capatilizeTheWord.toString().trim();
                if (i != 5) {
                    System.out.println((i + 1) + ". " + finalTouch + " Instructor");
                } else {
                    System.out.println((i + 1) + ". " + finalTouch.replace(" Instructor", " "));
                }
            }
            System.out.print("\nSelect from the option: ");
            String yourChoice = s.nextLine().trim();
            try {
                int choice = Integer.parseInt(yourChoice);
                clearScreen();
                switch (choice) {
                    case 1:
                        clearScreen();
                        instructorManagement.addingInstructor();
                        break;
                    case 2:
                        clearScreen();
                        instructorManagement.displayingDataOfInstructors();
                        break;
                    case 3:
                        clearScreen();
                        instructorManagement.editInstructor();
                        break;
                    case 4:
                        clearScreen();
                        instructorManagement.deleteInstructor();
                        break;
                    case 5:
                        clearScreen();
                        instructorManagement.searchInstructor();
                        break;
                    case 6:
                        clearScreen();
                        isTrue = false;
                        umpsReturn();
                        return;
                    default:
                        System.out.println("--------------------------------------------------------------------");
                        System.out.printf("This %s input is invalid, The valid is from 1 - 6 only");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("--------------------------------------------------------------------");
                System.out.print("This input is not from the selection.");
            }
        }
    }

    private void StudentManagement() {
        StudentManagement studentManagement = new StudentManagement();
        while (!isTrue) {
            System.out.println("\n--------------------------------------------------------------------\n");
            String[] op = { "add", "display", "edit", "delete", "search", "return to lobby" };
            for (int i = 0; i < op.length; i++) {
                String[] word = op[i].split(" ");
                StringBuilder capatilizeTheWord = new StringBuilder();
                for (String option : word) {
                    if (!option.isEmpty()) {
                        String fWord = option.substring(0, 1).toUpperCase();
                        String otherWord = option.substring(1).toLowerCase();
                        capatilizeTheWord.append(fWord).append(otherWord).append(" ");
                    }
                }
                String finalTouch = capatilizeTheWord.toString().trim();
                if (i != 5) {
                    System.out.println((i + 1) + ". " + finalTouch + " Student");
                } else {
                    System.out.println((i + 1) + ". " + finalTouch.replace(" Student", " "));
                }

            }
            System.out.println("\nSelect from the option: ");
            String yourChoice = s.nextLine().trim();
            try {
                int choice = Integer.parseInt(yourChoice);
                clearScreen();
                switch (choice) {
                    case 1:
                        clearScreen();
                        studentManagement.addingStudent();
                        break;
                    case 2:
                        clearScreen();
                        studentManagement.displayingDataOfStudents();
                        break;
                    case 3:
                        clearScreen();
                        studentManagement.editStudent();
                        break;
                    case 4:
                        clearScreen();
                        studentManagement.deleteStudent();
                        break;
                    case 5:
                        clearScreen();
                        studentManagement.searchStudent();
                        break;
                    case 6:
                        clearScreen();
                        isTrue = false;
                        umpsReturn();
                        return;
                    default:
                        System.out.printf("This %s input is invalid, The valid is from 1 - 6 only", choice);
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.print("This input is not from the selection.");
            }
        }
    }

    /*
     * EXTRA PROVIDER METHOD
     * -----------------------------------------------------------------------------
     * -----------------------------------------------------------------------------
     * ---------------------------------
     */

    // METHODS FOR CLEARING SYSTEM SCREEN
    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // METHOD FOR TEXT ABBREVIATION
    public static String textBehaviour(String text, int maxOfText) {
        if (text == null || maxOfText < 1) {
            return "";
        }

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

        while (cBuilder.length() > 0 && cBuilder.charAt(cBuilder.length() - 1) == ' ') {
            cBuilder.deleteCharAt(cBuilder.length() - 1);
        }

        cBuilder.append("...");
        return cBuilder.toString();
    }

    // METHOD FOR CALENDAR

    public static int yearAtFure() {
        Calendar yearInCalendar = Calendar.getInstance();
        int yearNow = yearInCalendar.get(Calendar.YEAR) % 100;
        return yearNow;
    }

    // METHOD FOR MATCHING ID
    static boolean matchingInstructor(String id) {
        for (String[] ins : forInstructors) {
            if (ins.length > 5 && ins[5].equals(id)) {
                return true;
            }
        }
        return false;
    }
    
    static boolean matchingStudent(String id, List<String[]> studentData) {
        for (String[] st : studentData) {
            if (st.length > 5 && st[5].equals(id)) {
                return true;
            }
        }
        return false;
    }

    // Overloading Method For All Add
    public static Boolean addAgain() {
        String addAgainC;
        do {
            System.out.println("\n\nDo you want to add again?\n[Y] yes\n[N] no \nChoice[Y/N]: ");
            addAgainC = s.nextLine().toUpperCase();
            if (addAgainC.equalsIgnoreCase("Y")) {
                return true;
            } else if (addAgainC.equalsIgnoreCase("N")) {
                return false;
            }
        } while (true);
    }

    // Overloading Method For All edit
    public static Boolean editAgain() {
        String addAgainC;
        do {
            System.out.println("\n\nDo you want to edit again?\n[Y] yes\n[N] no \nChoice[Y/N]: ");
            addAgainC = s.nextLine().toUpperCase();
            if (addAgainC.equalsIgnoreCase("Y")) {
                return true;
            } else if (addAgainC.equalsIgnoreCase("N")) {
                return false;
            }
        } while (true);
    }

    // Overloading Method For All edit
    public static Boolean deleteAgain() {
        String addAgainC;
        do {
            System.out.println("\n\nDo you want to delete again?\n[Y] yes\n[N] no \nChoice[Y/N]: ");
            addAgainC = s.nextLine().toUpperCase();
            if (addAgainC.equalsIgnoreCase("Y")) {
                return true;
            } else if (addAgainC.equalsIgnoreCase("N")) {
                return false;
            }
        } while (true);
    }

    // Overloading Method For All edit
    public static Boolean searchAgain() {
        String addAgainC;
        do {
            System.out.println("\n\nDo you want to search again?\n[Y] yes\n[N] no \nChoice[Y/N]: ");
            addAgainC = s.nextLine().toUpperCase();
            if (addAgainC.equalsIgnoreCase("Y")) {
                return true;
            } else if (addAgainC.equalsIgnoreCase("N")) {
                return false;
            }
        } while (true);
    }

    // CLASS FOR
    // SUBJECTS--------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static class ThisIsForSubject extends SubjectManagement {

        private String idOFSubject;

        void instantiateOfSubject() {
            this.idOFSubject = r4d(forSubjects);
        }

        private String r4d(List<String[]> forSubject) {
            final Random r = new Random();
            final int subject4Digit = r.nextInt(9000) + 999;
            String subFormat = String.format("SUB" + "-%04d", subject4Digit);
            // forSubjects.add(new String[]{subFormat});
            return subFormat;
        }

        public String getTheSubjectId() {
            return idOFSubject;
        }
    }

    // CLASS FOR INSTRUCTORS

    public static class ThisIsForInstructor extends InstructorManagement {

        private String idOFInstructor;

        void instantiateOfInstructor() {
            this.idOFInstructor = r4d(forInstructors);
            // dataBaseForID(idOFInstructor);
        }

        private String r4d(List<String[]> forInstructor) {
            final Random r = new Random();
            final int instuctor4Digit = r.nextInt(9000) + 999;
            String insFormat = String.format("INS" + year + "-%04d", instuctor4Digit);
            // forInstructors.add(new String[]{insFormat});
            return insFormat;
        }

        // private void dataBaseForID(String insIdentity){
        // forInstructors.add(new String[]{insIdentity});
        // }

        public String getTheInstructorId() {
            return idOFInstructor;
        }

        public void confirmationOfAssigning(String insId, String subjCode){
            subjectToAssign(insId, subjCode);
        }

        public void subjectToAssign(String insId, String subjCode) {
            System.out.println("This subject " + subjCode + " was assign to this instructor " + insId);
        }

    }

//     boolean insFound = false;
//     for (String[] insPassSub : forInstructors) {
//         if (insPassSub.length > 5 && insPassSub[5].equals(idOFInstructor)) {
//             for (int i = 6; i < insPassSub.length; i++) {
//                 if (insPassSub != null && insPassSub[i].contains(subjCode)) {
//                     System.out.println("This subject is already assigned to " + insId);
//                     return;
//                 }
//             }
//             for (int i = 6; i < insPassSub.length; i++) {
//                 if (insPassSub[i] != null && insPassSub[i].isEmpty()) {
//                     insPassSub[i] = subjCode;
//                     System.out.println("This subject was assigned to " + insId);
//                     insFound = true;
//                     forInstructors.add(insPassSub);
//                     return;
//                 }
//             }
//         }
//     }

//     if (insFound) {
//         System.out.println("Instructor not found: " + insId);
//     }
// }
    // CLASS FOR STUDENTS
    public static class ThisIsForStudent extends UMPS {

        private String idOFstudent;

        void instantiateOfStudents() {
            this.idOFstudent = r4d(forStudents);
            // dataBaseForID(idOFstudent);
        }

        private String r4d(List<String[]> forSubject) {
            final Random r = new Random();
            final int student4Digit = r.nextInt(9000) + 999;
            String stFormat = String.format("ST" + year + "-%04d", student4Digit);
            // forStudents.add(new String[]{stFormat});
            return stFormat;
        }

        public String getTheStudentId() {
            return idOFstudent;
        }

        public void subjectToAdd(String StId, String subjsCode, String subjsTitle, String subjsDescription) {
                boolean subjectExists = false;
                for (String[] subject : forSubjects) {
                    if (subject[5].equals(StId) && subject[2].equals(subjsCode)) {
                      
                        subject[0] = subjsTitle;
                        subject[1] = subjsDescription;
                        subjectExists = true;
                        System.out.println("Subject " + subjsCode + " is already assigned to student " + StId);
                        break;
                    }
                }
            
                if (!subjectExists) {
                    String[] subjectDetails = new String[6];
                    subjectDetails[5] = StId;
                    subjectDetails[2] = subjsCode;
                    subjectDetails[0] = subjsTitle;
                    subjectDetails[1] = subjsDescription;
            
                    forSubjects.add(subjectDetails);
                    System.out.println("Adding subject " + subjsCode + " to student " + StId);
                }
            }
    }

}
