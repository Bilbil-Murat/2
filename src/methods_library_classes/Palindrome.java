package methods_library_classes;

public class Palindrome {

    public static void   reverse_String ( String text){
        for(int i=text.length()-1; i<text.length();i--) {
            System.out.print(text.charAt(i));
        }
           /* if(text.equalsIgnoreCase(text)){
                System.out.println(text+": is Palindrome");
            }
            else {
                System.out.println(text+": is not Palindrome");
           */
        }

    }

