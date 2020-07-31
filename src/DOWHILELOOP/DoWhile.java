package DOWHILELOOP;

public class DoWhile {
    public static void main(String[] args) {

        int counter=10;// starting point
        do {
            System.out.println("Counter : "+ counter);
            counter++;
        }
        while (counter<=10);
        System.out.println("This is counter 1 : "+counter);

        System.out.println("With while loop");
        int counter2=10;
        while (counter <=10) {
            System.out.println(counter);
            counter++;
        }


        int counter3=1;
        do {
            System.out.println( "This is do loop:  "+counter3);
            counter3*=2;
        }
        while (counter3<=100);
        System.out.println("This is while loop: "+counter3);

    }
}
