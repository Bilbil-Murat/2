package firstpackage;
public class LoopNumbersAndLettersWithWhile {
    public static void main(String[] args) {
        // write number in each line and same letters after numbers
        int numbers=1;
        char letters;
        int count;
        while(numbers<5){
            letters='a';
            System.out.print(numbers);
            while(letters<'e'){
                System.out.print(" \t "+letters);
                letters++;
            }
            numbers++;
            System.out.println();
        }
    }
}
