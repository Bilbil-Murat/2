package methods_library_classes;

import ForLoop.MultiplicationTable;

public class Test {
    public static void main(String[] args) {
        System.out.println("First : ");
        Print.printMultiHelloWorld(15);
        System.out.println("ADDITION : "+ Print.addTwoNumbers(3,5));
        System.out.println( "SUBTRACTION :"+Print.subtractTwoNumbers(20.00,13.00));
        System.out.println("MULTIPLY :"+ Print.multiplyTwoNumbers(10.00f,5.00f));
        System.out.println("DIVISION :"+ Print.divideTwoNumbers(50,5));
        System.out.println(Print.addTwoNumbers(Print.divideTwoNumbers(10,2),95));
        System.out.println(Print.divideTwoNumbers(Print.addTwoNumbers(100,100),2));
         double result = Print.subtractTwoNumbers(Print.addTwoNumbers(78,34),12);
        System.out.println(result);
        ASCII.printASCII();
        MultiTable.printMultiplicationTable();
        OddNumbers.printOddNumbers(1,20);
        OddNumbers.printEvenNumbers(20,40);
        int x= OddNumbers.printEvenNumbers(1,45);// here we  can  create expression because we have int return value
        int z= OddNumbers.printOddNumbers(5,90);
        Shape.printPyramid(5);
        Palindrome.reverse_String("madam");
        Palindrome.reverse_String("jokel");
    }
}
