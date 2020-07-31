package ForLoop;
public class HourGlassNumbers {
    public static void main(String[] args) {
        //variable for the numbers of lines
        int lines=8;
        for (int i = 1; i <lines; i++) {
            //to print spaces
            for (int j = 1; j<= i; j++) {
                System.out.print("-");
            }
            //to print numbers triangle
            for (int k = i; k <lines; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        //second part
        for (int i = lines; i>1 ; i--) {
            //to spaces
            for (int j=0; j<i; j++){
                System.out.print("-");
            }
            for (int j = i; j <lines ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
