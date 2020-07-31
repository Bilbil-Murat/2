package firstpackage;
import java.util.Scanner;
public class carpurchase {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Whic model  ? (X/Y)");
        String modelXMRSP = myScanner.next();
        int XMSRP=0;
        int YMSRP=0;
        if ( modelXMRSP.equals("X")) {
            System.out.println("Do you want to body package? : ( Y/N)");
            XMSRP +=3000;
            String modelYMRSP =myScanner.next();
            if(modelYMRSP.equalsIgnoreCase("Y")){
                System.out.println("Do you want soun sistem ?  : (Y/N)");
                YMSRP = YMSRP+5000;
            }
            else if (modelYMRSP.equals("Y")){
                YMSRP= 35000;
                System.out.println("Do you want enter. package ? : (Y/N)");
                String ent =myScanner.next();
                if (ent.equalsIgnoreCase("y")){
                    YMSRP +=8000;

                    System.out.println(("Safety package? : (Y/N" ));
                    String safety = myScanner.next();
                    if (safety.equalsIgnoreCase("Ok"));
                }
            }



        }



                else {
                System.out.println("Sorry we have only X and Y ");
            }
        }
    }
