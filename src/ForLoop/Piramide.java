package ForLoop;

public class Piramide {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            //for loop for the spaces
            for (int j = 0; j <= 20 - i; j++) {//15- i(15) it will change every line until 15
                System.out.print("- ");
            }
            //for loop for stars
            for (int k = 1; k < 4 * i - 1; k++) {
                System.out.print("*");
            }
            for (int j = 20 - i; j >= 0; j--) {
                System.out.print("^ ");
            }
            System.out.println();
        }


    }
}
