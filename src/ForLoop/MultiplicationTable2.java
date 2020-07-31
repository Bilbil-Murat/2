package ForLoop;
public class MultiplicationTable2 {
    public static void main(String[] args) {
        System.out.println();
        /*
         Print Multiplication table like given below
           1    2   3    4    5   6   7   8    9
   -----------------------------------------------
   1:      1
   2:      2
   3:      3
   4:      4
   5:      5
   6:      6
   7:      7
   8:      8
   9:      9

         */


        for (int i = 1; i < 10; i++) {
            System.out.format("\t\t i1= " + i);
        }
        System.out.format("\n\t\t---------------------------------------------------------------------------------");
        for (int i = 1; i < 10; i++) {

            System.out.print("\n i2= "+i + " : ");

            for (int j = 1; j<10; j++) {

                System.out.print(" \t j*i= "+j*i );

            }
          // System.out.print(" ");
        }
    }
}
