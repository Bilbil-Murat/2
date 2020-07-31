package IfStatement;
public class LetterGrade{
    public static void main(String  []  args  ) {
         /*- Calculate the Grade according to score
        1.0-49 "fail"
        2.50-59 "D"
        3.60-69 "C"
        4.70-79 "B"
        5.80-89 "A"
        6. 90-100 "A+"
        7. Not between 0-100 "Invalid"
        */
         int grade = 60;
         if(grade<0){
             System.out.println("Grade can not br less than 0 ! ");
         }
         else if (grade<50){
             System.out.println("Fail");
         }
         else if (grade<60){
             System.out.println("D");
         }
         else if (grade<70){
             System.out.println("C");
         }
         else if (grade<80){
             System.out.println("B");
         }
         else if (grade<90){
             System.out.println("A");
         }
         else if (grade<101){
             System.out.println("A+");
         }
         else {
             System.out.println("The grade can not be larger than 100");
         }





    }
}
