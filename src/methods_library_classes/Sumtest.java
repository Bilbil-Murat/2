package methods_library_classes;

public class Sumtest {
    public static void doSum (Integer x, Integer y){
        System.out.println("Integer sum is "+(x+y));
    }
    public static void doSum(double x, double y){
        System.out.println("double sum is "+(x+y));
    }
    public static void doSum (float x, float y){
        System.out.println("float sum is "+(x+y));
    }
    public class Test{
    }
    public static void main(String[] args) {
//     doSum(10,20);
//     doSum(10.0,20.0);
   if(args[0].equals("Hello") ? true : false){
       System.out.println("Success");
   }
   else{
        System.out.println("Failure");

        }
    }
}
