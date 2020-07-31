package ForLoop;

public class Triangle {
    public static void main(String[] args) {


        /*
        Write triangle with *  more  to less upside down*/
        for(int i=1; i<=16;i++){
            for (int j=16; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }



        /*Write triangle less to more */
        System.out.println("Triangle les to more ");
        for (int i=1; i<=16; i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("triangle with while LOOP");
        int i=0;
        int j;
        while (i<16){
          j=0;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println(" Triangle upsidedown");

        int o=1;
        int b;
        while (o<=20){
            b=20;
            while (b>o){
                System.out.print("* ");
                b--;
            }
            System.out.println();
            o++;
        }

        System.out.println(" Triangle from square ");

        for (int k=10; k>0 ; k--) {
            for (int l=1; l<=k ; l++) {
                System.out.print(" 3");
            }
            System.out.println();
        }
        for (int k =10; k>0 ; k--) {
            for (int i1=1; i1<=k; i1++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
