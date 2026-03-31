
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

   public Student(int var1, String var2, int var3, String var4, String var5, String var6, String var7, int[] var8, double var9) {
      super(var2, var3);
      this.regNo = var1;
      this.email = var4;
      this.course = var5;
      this.parentName = var6;
      this.parentContact = var7;
      this.marks = var8;
      this.cgpa = var9;
      this.calculateResult();
   }

   private void calculateResult() {
      int var1 = 0;

      for(int var5 : this.marks) {
         var1 += var5;
      }

      this.percentage = (double)var1 / (double)5.0F;
      if (this.percentage >= (double)90.0F) {
         this.grade = "A";
      } else if (this.percentage >= (double)75.0F) {
         this.grade = "B";
      } else if (this.percentage >= (double)50.0F) {
         this.grade = "C";
      } else {
         this.grade = "Fail";
      }

   }

   public int getRegNo() {
      return this.regNo;
   }

   public double getPercentage() {
      return this.percentage;
   }

   public void display() {
      System.out.println("\n----- Student Details -----");
      System.out.println("Reg No: " + this.regNo);
      System.out.println("Name: " + this.name);
      System.out.println("Age: " + this.age);
      System.out.println("Email: " + this.email);
      System.out.println("Course: " + this.course);
      System.out.println("Parent: " + this.parentName + " (" + this.parentContact + ")");
      System.out.println("CGPA: " + this.cgpa);
      System.out.print("Marks: ");

      for(int var4 : this.marks) {
         System.out.print(var4 + " ");
      }

      System.out.println("\nPercentage: " + this.percentage);
      System.out.println("Grade: " + this.grade);
   }
}
