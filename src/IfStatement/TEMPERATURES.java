package firstpackage;

import java.util.Scanner;
    public class  TEMPERATURES {
        public static void main(String[] args) {
            Scanner myscanner = new Scanner(System.in);
            System.out.println("Please enter the temperature: ");
            int temperature = myscanner.nextInt();
            if (temperature >= 30) {
                System.out.println("\n\t\twear jacket");
            } else {
                System.out.println("wear hat");

            }
        }
    }