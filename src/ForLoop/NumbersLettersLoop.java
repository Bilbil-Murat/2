package ForLoop;
public class NumbersLettersLoop {
    public static boolean main(String[] args) {
        boolean result = false;
        char letter = 'a';
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + letter + " ");
                letter++;
            }
            System.out.println();
        }
        System.out.println("Second ");
        char lett = 'u';
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            for (int j = 0; j <= 4; j++) {
                System.out.print(" " + lett + " ");
                lett++;
            }
            System.out.println();
        }
        //with while loop
        System.out.println("With a while loop");
        int numbers = 1;
        char letters = 'a';
        int count;
        while (numbers <= 5) {
            System.out.print(numbers + " ");
            count = 0;//we are resetting  and it should be start from new value.
            while (count < 4) {
                System.out.print(letters + " ");
                count++;
                letters++;

            }
            System.out.println();
            numbers++;

        }
        return result;
    }
}