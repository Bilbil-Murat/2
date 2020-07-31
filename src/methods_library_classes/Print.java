package methods_library_classes;

public class Print{
    public static void printMultiHelloWorld(int numOf_Hello_Word){
        /*Write a mhethod with intiger parameter for number of ""Hello World*/
        int count =0;
        while(count<numOf_Hello_Word){
            System.out.println("Hello World !");
            count++;
        }
    }
    /*Write a method takes 2 numbers as parameter and returns additions of them*/
    public static int addTwoNumbers(int a ,int b){
        return a+b;
    }
    /*Write a method takes 2 numbers as parameter and returns subtractions of them*/
    public static double subtractTwoNumbers(double a, double b){
        return a-b;
    }
    /*Write a method takes 2 numbers as parameter and returns multiplications of them*/
   public static float multiplyTwoNumbers(float a , float b){
        return a*b;
       /*Write a method takes 2 numbers as parameter and returns division of them*/
}
    public static int  divideTwoNumbers (int  a,  int b){
        return  a/b ;
    }
    public static void main(String[] args) {

        printMultiHelloWorld(1);

    }

}

