package methods_library_classes;
public class display_Hello_World {
public static void printSome( ) {

    int x = 0;
    do {
        System.out.println("Hello World");
        x++;
    }

    while (x < 10);
}
    public static void printSomeText(String text) {
        System.out.println(text);
    }
    public static int  returnSomething(int a){
    return a;

    }

    public static  void printNumbers(){
    for (int i=1; i<=100; i++){
        System.out.println(i);
    }
    }

    public static void main(String[] args) {
       printSomeText("Hello");
        printSome();
        printNumbers();

    }
}
