package methods_library_classes;

public class letters {
    public static void printLetters(char laetter){
        for(int i=1;i <=5;i++) {
            System.out.print(i+"\t");
            for (int j=0;j<=3; j++){
                System.out.print(laetter+"\t");
                laetter++;
            }
            System.out.println();
        }
    }
}
