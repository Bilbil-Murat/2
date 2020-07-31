package ForLoop;
import methods_library_classes.*;
public class CheckMagicSquare {
    public static void main(String[] args) {
        int [][]ab={{1,2,3},{1,2,3}};
        System.out.println(isMagicSquere(ab));
    }
    public static int isMagicSquere(int [][] square){
        int checkRow =0;
        for (int i = 0; i < square.length ; i++) {
            checkRow+=square[0][i];
        }
        int sum =0;
        for (int i = 0; i <square.length ; i++) {
            //for()

        }
        return  checkRow;
    }

}
