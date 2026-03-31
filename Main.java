import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            try {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Search Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Show Topper");
                System.out.println("6. Exit");

                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.print("Enter RegNo Name Age Email Course ParentName ParentContact: ");

                    int regNo = sc.nextInt();
                    String name = sc.next();
                    int age = sc.nextInt();
                    String email = sc.next();
                    String course = sc.next();
                    String parentName = sc.next();
                    String parentContact = sc.next();

                    int[] marks = new int[5];
                    System.out.println("Enter marks of 5 subjects:");
                    for (int i = 0; i < 5; i++) {
                        marks[i] = sc.nextInt();
                    }

                    System.out.print("Enter Previous CGPA: ");
                    double cgpa = sc.nextDouble();

                    Student s = new Student(regNo, name, age, email, course,
                            parentName, parentContact, marks, cgpa);

                    service.addStudent(s);

                } else if (choice == 2) {
                    service.viewAll();

                } else if (choice == 3) {
                    System.out.print("Enter RegNo: ");
                    service.search(sc.nextInt());

                } else if (choice == 4) {
                    System.out.print("Enter RegNo: ");
                    service.delete(sc.nextInt());

                } else if (choice == 5) {
                    service.showTopper();

                } else if (choice == 6) {
                    System.out.println("Exiting...");
                    break;
                }

            } catch (Exception e) {
                System.out.println("Invalid Input! Try again.");
                sc.nextLine();
            }
        }
    }
}
