import java.util.Scanner;

public class IT24100477Lab4Q2 {
 public static void main (String[] args) {
 int exam_marks, lab_marks, exam_precentage, lab_precentage, final_marks;
 Scanner input = new Scanner (System.in);

 System.out.print("Please enter exam marks (out of 100) : ");
 exam_marks = input.nextInt();
 if (exam_marks < 0 || exam_marks > 100) { 
   System.out.println("Invalid input for exam marks. terminating program");
   return;
 }

 System.out.print("Please enter lab submission marks (out of 100) : ");
 lab_marks = input.nextInt();
 if ((lab_marks < 0) || (lab_marks > 100)) {
  System.out.println("Invalid input for lab submission marks. Terminating program");
  return;
 }

 System.out.print("Please enter the percentage given from the exam: "); 
 exam_precentage = input.nextInt();
 System.out.print("please enter the percentage given from the lab submission: ");
 lab_precentage = input.nextInt();

 if ((exam_precentage + lab_precentage != 100))
 {
  System.out.println("The percentage must add up to 100. terminating program");
  return;
 }
 else { 
  final_marks = (exam_marks*exam_precentage/100) + (lab_marks*lab_precentage)/100;
  
  System.out.println("Final mark is :" + final_marks);
  final_marks = input.nextInt(); }
 }
}