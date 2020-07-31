package ForLoop;

import java.util.ArrayList;

public class cupsCoffe {
    public static void main(String[] args) {
        System.out.println(totalcups(60));
    }
    public static int totalcups(int n) {
        return n+(n/6);
        }

    public static String swapTwo(String str) {
       String swapping ="";
       for(int i=0; i<str.length()-3;i+=4){
           swapping+=str.charAt(i+2);
           swapping+=str.charAt(i+3);
           swapping+=str.charAt(i+1);
           swapping+=str.charAt(i);

       }
       for (int i=swapping.length();i<str.length();i++){
           swapping+=str.charAt(i);
       }
             return swapping;
        }
    }

