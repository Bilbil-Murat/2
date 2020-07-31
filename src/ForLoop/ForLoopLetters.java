package firstpackage;

public class ForLoopLetters {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.print(i);
            for (char letters = 'a'; letters < 'e'; letters++) {
                System.out.print("\t" + letters);
            }
            System.out.println();

        }
        System.out.println("++++++++++");
        char letter='a';
        for(int i=1; i<5; i++){
            System.out.print(i);
            for(int j=1; j<5;j++){
                System.out.print(" \t"+letter+"");
                letter++;

            }
            System.out.println();
        }
    }
}
