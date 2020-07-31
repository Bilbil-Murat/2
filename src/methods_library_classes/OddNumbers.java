package methods_library_classes;

import org.w3c.dom.ls.LSOutput;

public class OddNumbers {
    public static int printOddNumbers(int start, int end) {
        int i;
        for ( i= start; i < end; i++) {
            if (i % 2 == 1) {
                System.out.println("Odd Number : " + i);
            }

        }
        return i;
    }


    public static int printEvenNumbers(int start, int end) {
        int i;
        for(  i= start; i < end; i++) {
            if (i % 2 == 0) {
                System.out.println("\nEven Numbers : " + i);
            }
        }
        return i;
    }
}
