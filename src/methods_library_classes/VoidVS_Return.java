package methods_library_classes;

public class VoidVS_Return {
    public static void method1 (){
        System.out.println("A");
    }
    public static String method2(){
        return "B";
    }

    public static void main(String[] args) {
        method1();
        method2();
        String b= method2();
        //String a= method1();//when we dont have return  variable we can not  create exsprassion
    }
}
