package ForLoop;

public class PrinTgivenOutput {
    public static void main(String[] args) {
        // 1 2 3 4 5  and repeat version for loop implementation
        for (int i = 1; i<=5; i++){
            System.out.print(i+"\t");
        }
        System.out.println();
        for (int j=6; j<=10; j++){
            System.out.print(j+"\t");
            }
        System.out.println();
        for (int i=11;i<=15; i++){
            System.out.print(i+"\t");
        }
        System.out.println("Below new \n");
          int number=1;
        for (int i=1; i<=3; i++){
            for (int j=1; j<=5 ; j++) {
                System.out.print(number+"\t");
                number++;
            }
            System.out.println();

        }
        System.out.println("==============");
         int counter=2;
        for(int i=1; i<5; i++){
            for (int j = 1; j <7; j++) {
                if(counter>16 && counter<23) {
                    System.out.print(" "+ "\t");
                }
                else {
                    System.out.print(counter+"\t");
                }
                counter+=2;
            }
            System.out.println();
        }
    }
}



