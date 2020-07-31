package methods_library_classes;
public class reverseString{
    public static  void reverse(String sentenses ){
        for (int i= sentenses.length()-1; i>=0; i--) {
            System.out.print(sentenses.charAt(i));
        }
        int numbers=17;
        for(int i=numbers; i>=0; i--){
            System.out.print(numbers);
            numbers--;
        }
    }
    public static void main(String[] args) {
        reverse("abc");
        reverse("I love Java and SQL");
        reverse("My name is Bilbil and I have 6 years of experiense in java programming");
    }
}
