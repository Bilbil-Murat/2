package firstpackage;
import java.util.Scanner;
public class HomeAssignment {
    public static void main(String [] args ){
        Scanner myScanner = new Scanner(System .in);
        float item123 =2.49f;
        float item124=4.79f;
        float item125=1.65f;
        float item126=7.88f;
        float item127=0.99f;
        System.out.println("\t\t\t GROCERY ITEMS\n");
        System.out.println("\tItem id "+"\t\tquantity"+"\t\tprice\n");
        System.out.println("------------------------------------------\n");
        System.out.format("\t123"+"\t\t\t\t\t1 \t\t\t\t$%.2f\n",item123); ;
        System.out.format("\t125"+"\t\t\t\t\t2 \t\t\t\t$%.2f\n",item125);
        System.out.format("\tTOTAL\t\t\t\t3 \t\t\t\t$%.2f", item123+(2*item125));






    }
}
