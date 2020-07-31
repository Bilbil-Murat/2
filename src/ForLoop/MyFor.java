package ForLoop;

public class MyFor {
    public static void main(String[] args) {
        for (  double myDouble = 15.00f;myDouble<=100.00f; myDouble+=5.00) {
            System.out.println(myDouble);
        }
        for (int i = 1; i <15 ; i++) {
            System.out.println("BILBIL".substring(0,6));
        }
        for (int j=15; j>=0;j--) {
                System.out.println("LIBLIB".substring(5).replace("B","M"));
                System.out.println("LIBLIB".toLowerCase().toUpperCase());
            }
        }
    }