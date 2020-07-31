package DOWHILELOOP;

import methods_library_classes.Top_To_Bottom;

public class Problems {
    private static Object Top_To_Bottom;

    public static void printNum(){
        int start=100;
        while (start<=1000){
            System.out.println(start);
            start++;
        }
    }
    //Method to print all ASCII values and CHARS
    public static  void print_All_ASCII(){
        for (int i=0;i<256; i++){
            System.out.println("Number : "+i+"  Character : "+(char)i);//type casting
        }
    }
    public static void main(String[] args) {
        System.out.println();
        printNum();
        print_All_ASCII();
        methods_library_classes.Top_To_Bottom.printVertical("HELLO");
    }
}
