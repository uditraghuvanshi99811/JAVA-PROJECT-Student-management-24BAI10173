import java.util.*;

class StudentService {
    HashMap<Integer, Student> map = new HashMap<>();

    public void addStudent(Student s) {
        map.put(s.getRegNo(), s);
        System.out.println("Student Added Successfully!");
    }

    public void viewAll() {
        if (map.isEmpty()) {
            System.out.println("No Students Found");
            return;
        }

        for (Student s : map.values()) {
            s.display();
        }
    }

    public void search(int regNo) {
        if (map.containsKey(regNo)) {
            map.get(regNo).display();
        } else {
            System.out.println("Student Not Found");
        }
    }

    public void delete(int regNo) {
        if (map.containsKey(regNo)) {
            map.remove(regNo);
            System.out.println("Student Deleted");
        } else {
            System.out.println("Student Not Found");
        }
    }

    public void showTopper() {
        if (map.isEmpty()) {
            System.out.println("No Data Available");
            return;
        }

        Student top = null;

        for (Student s : map.values()) {
            if (top == null || s.getPercentage() > top.getPercentage()) {
                top = s;
            }
        }

        System.out.println("\n🏆 Topper Details:");
        top.display();
    }
}