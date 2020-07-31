package firstpackage;
import java.util.Scanner;
public class Jobapplicants {
    public static void main(String... args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter age of apticant :");
        int age = myScanner.nextInt();
        age = 20;
        int javaScore = myScanner.nextInt();
        javaScore = 90;

        if ((age >= 20 && age < 30) && javaScore >= 80) {
            System.out.println(age * 1.5 + javaScore * 4.5);

        } else if (age <= 20 && age < 30 && (javaScore < 80)) {
            System.out.println(age * 1.5 + javaScore * 3.5);
        } else if (age < 31 && javaScore < 80) {
            System.out.println(age * 1.1 + javaScore * 4.5);
        } else if (age < 31 && javaScore < 80) {
            System.out.println(age * 1.1 + javaScore * 3.5);

        }
        if (true) {
            System.out.println("Please enter a valid age or Java Score");
        }
    }
}