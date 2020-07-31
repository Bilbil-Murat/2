package methods_library_classes;

import java.util.Scanner;

public class A_Test {
    public static void main(String[] args) {
        System.out.println(A.number());
        A myA= new A();
        int x =myA.number2();
        Scanner myScann= new Scanner(System.in);
        myScann.nextInt();// nextInt is NON_STATIC method
    }
}
