public void displayTopper() {
    if (students.isEmpty()) {
        System.out.println("No students available.");
        return;
    }

    Student topper = null;
    double maxAvg = 0;

    for (Student s : students.values()) {
        int[] marks = s.getMarks();
        int sum = 0;

        for (int m : marks) {
            sum += m;
        }

        double avg = sum / 5.0;

        if (avg > maxAvg) {
            maxAvg = avg;
            topper = s;
        }
    }

    System.out.println("\nTopper Details:");
    topper.display();
}
