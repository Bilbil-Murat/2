package ForLoop;
public class LoopRectangle {
    public static void main(String[] args) {
        System.out.println("Rectangle with fore loop");
        for(int i=1;i<=20;i++){
            for (int j = 1; j <=10 ; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println("Rectangle with while loop");
        int i=5;
        int j;
        while (i<=35){
            j=1;
            while(j<=15){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("rectangle with Do while");
        int k =0;
        int w;
        do {
            w=0;
            do {
                System.out.print("* ");
                w++;
            } while (w<=15);
        System.out.println();
        k++;
            } while (k<=15);
    }
}
