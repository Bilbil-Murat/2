package Switch;

public class Grade_With_Switch {
    public static void main(String[] args) {
          int grade = 50;

      switch (grade/10){

          case 10:
                System.out.println("A");
          case 9:
              System.out.println("B+");
          case 8:
              System.out.println("B");
          case 7:
              System.out.println("C+");
          case 6:
              System.out.println("C");
          case 5:
              System.out.println("F");
        }
    }
}
