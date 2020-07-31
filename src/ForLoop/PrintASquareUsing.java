package ForLoop;

public class PrintASquareUsing {
    public static void main(String[] args) {
        printSquareWithWhileLoop();
     //   printSquareWithDoWhile();
        // print a square with for loop
        System.out.println("FOR LOOP");
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printSquareWithWhileLoop() {
        int i = 20;
        int j;
        System.out.println("While Loop");
        while (i <= 40){
            j=5;
            while (j <=16){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
//print square with do while.
    }

 /*   public static void printSquareWithDoWhile() {
        System.out.println("Do while ");
        int i;
        int j = 1;
        do {
            i=0;
            do {
                System.out.print(i);
            }
            while (i <= 40);
            System.out.println("*  ");
            i++;
            j++;
        }
        while (i < 90);

    }*/
}






