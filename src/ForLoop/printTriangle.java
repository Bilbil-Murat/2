package ForLoop;

public class printTriangle {
    public static void main(String[] args) {
        for (int u = 1; u <= 15; u++) {
            for (int i = 1; i <=u; i++) {
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("With while Loop");
        int i =0;
        int j;
        while(i<20){
            j=0;
            while (j<i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }



        for(int i1=0;i1<=15;i1++){
            for (int k = 15; k<=i1 ; k++) {
                System.out.print("-");

            }
            System.out.println();
        }

    }
}