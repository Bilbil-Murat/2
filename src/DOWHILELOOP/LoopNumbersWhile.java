package firstpackage;

public class LoopNumbersWhile {
    public static void main(String[] args) {
        int counter;
         int number=1;
        for(int i=1; i<=3; i++){
            counter=1;
            while(counter<6){
         if (number%2==0) {
              System.out.print("  \t");
          }
          else System.out.print(number + "\t");
                counter++;
                number++;
          }
            System.out.println();
          }

        }
    }

