import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Display Topper");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Registration No: ");
                    String regNo = sc.nextLine();

                    System.out.print("Enter Parent Name: "); // 
                    String parent = sc.nextLine();

                    int[] marks = new int[5];
                    System.out.println("Enter marks of 5 subjects:");
                    for (int i = 0; i < 5; i++) {
                        marks[i] = sc.nextInt();
                    }

                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();

                    Student s = new Student(id, name, email, regNo, parent, marks, cgpa);
                    service.addStudent(s);

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    service.displayAll();
                    break;

                case 3:
                    service.displayTopper();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
