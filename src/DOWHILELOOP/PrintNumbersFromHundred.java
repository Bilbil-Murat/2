package firstpackage;

public class PrintNumbersFromHundred {
    public static void main(String[] args) {
        double number=100;

        do {
            System.out.println( "This is actual number : = "+ (int)number+"\n");
            number-=0.5;
            System.out.println("This is -0,5 from number : ="+number+"\n");

        }
        while(number>0);
        System.out.println("This is number while loop  "+number);
    }
}
