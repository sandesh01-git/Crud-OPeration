import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    static void defaultMsg() {
        System.out.println("Wrong choice !!!  Enter only 1/2/3/4/5/6/7/8");
        System.out.println("-------------------------------------------------");
    }

    public void menu() {
        Operation O = new Operation();
        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("!!! Student Management System !!!");
                System.out.println("1. Add Student");
                System.out.println("2. Display Student List");
                System.out.println("3. Search Student");
                System.out.println("4. Update Student Record");
                System.out.println("5. Delete Student Record");
                System.out.println("6. Exit");
                System.out.println("---------------------------------------------------------");
                System.out.println("Press the respective menu number for respective operation");
                System.out.print("Enter your choice: ");
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        O.addStudent();
                        break;
                    case 2:
                        O.getAllStudents();
                        break;
                    case 3:
                        O.getStudentById();
                        break;
                    case 4:
                        O.UpdateStudent();
                        break;
                    case 5:
                        O.deleteRecord();
                        break;
                    case 6:
                        System.out.println("Thank u very much !!!");
                        System.exit(0);
                    default:
                        defaultMsg();
                        break;
                }
            } catch (InputMismatchException e) {
                defaultMsg();
            }
        }
    }

}
