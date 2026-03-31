class Student extends Person {
    private int regNo;
    private String email;
    private String course;
    private String parentName;
    private String parentContact;

    private int[] marks = new int[5];
    private double percentage;
    private String grade;
    private double cgpa;

    public Student(int regNo, String name, int age, String email,
                   String course, String parentName, String parentContact,
                   int[] marks, double cgpa) {

        super(name, age);
        this.regNo = regNo;
        this.email = email;
        this.course = course;
        this.parentName = parentName;
        this.parentContact = parentContact;
        this.marks = marks;
        this.cgpa = cgpa;

        calculateResult();
    }

    private void calculateResult() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        percentage = total / 5.0;

        if (percentage >= 90) grade = "A";
        else if (percentage >= 75) grade = "B";
        else if (percentage >= 50) grade = "C";
        else grade = "Fail";
    }

    public int getRegNo() { return regNo; }
    public double getPercentage() { return percentage; }

    public void display() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Reg No: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Parent: " + parentName + " (" + parentContact + ")");
        System.out.println("CGPA: " + cgpa);

        System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }

        System.out.println("\nPercentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}