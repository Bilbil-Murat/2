package methods_library_classes;

public class Shape {
    public static void printPyramid(int numberOfLine) {
        for (int i = 1; i <numberOfLine; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            } if (i>0&& i<20){
                System.out.print(" +");
            }
            for (int j = 20-i; j >= 1; j--) {
                System.out.print("^");
                if (i>0&& i<20){
                    System.out.print("+");
                }
            }
            for (int j = 20-i; j >=1; j--) {
                    System.out.print(" @ ");

                }
            for(int j=i-1 ; j<i*4; j++){
                System.out.print("$");{
                }
            }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        printPyramid(20);
        System.out.println("Second ");
        printPyramid(5);
        System.out.println("Third");
        printPyramid(10);
    }
}
