package methods_library_classes;
import java.util.Scanner;
public class Name {
    public static void myName_Void_Without_Parameter(){
        System.out.println("BILBIL");
    }
    public static void myName_With_Void_Parameter(String name1){
        System.out.println(name1);
    }
    public static String myName_String_With_Parameter(String name){
        return name;
    }
    public static  String myName_String_Without_Parameter(){
        String myName= "BILBIL";
        System.out.println(myName);
        return myName;
    }
    public static void passwordCheck( String password){
        Scanner myScan= new Scanner(System.in);
        System.out.println("Could you put your password again : ");
        password=myScan.next();
        if(password.length()>=6){
            System.out.println("Password is Ok ");
        }
        else{
            System.out.println("Password must be at least 6 character");
        }


    }

   public static String checkingPassword(String passWord){
       Scanner myScanner= new Scanner (System.in);
       System.out.println("Could you Rewrite your password : ");
        passWord=myScanner.next();
        String result;
        if (passWord.length()>=6){
            result="Password is OK ";
        }
        else{
           result="Password is NOT OK";
        }
       System.out.println(result);
        return result;
    }
    public static boolean isPasswordGood(String passwordBoolean){
    boolean result;
    if(passwordBoolean.length()<=6){
    result=false;
    }
    else{
        result=true;
    }
        System.out.println(result);
    return result;
    }
    public static void main(String[] args) {
        checkingPassword("mghtdvh");
        isPasswordGood("password");
    }
}
