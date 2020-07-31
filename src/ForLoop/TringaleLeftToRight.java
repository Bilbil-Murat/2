package ForLoop;
public class TringaleLeftToRight {
    public static void main(String[] args) {
        for (int i = 1; i <= 17; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("With While loop");
        int i = 1;
        int j;
        while (i<=25) {
            j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("With Do While Loop");
        int first = 1;
        int second;
        do {
            second=1;
            do {
                System.out.print("* ");
            }
            while (first<=second);
            first++;
            System.out.println();

        }
        while (first>=second);
          second--;
    }
}

