package methods_library_classes;

public class MultiTable {
    public static void printMultiplicationTable(){
        for(int i=1; i<10;i++){
            System.out.print("----------------\n");
            for (int j=1;j<=10;j++){
                System.out.println(i+"X"+j+"="+i*j);
            }
            System.out.println();
        }

    }
}
