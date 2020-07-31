package methods_library_classes;

public class ASCII {
    public static void printASCII(){
         for (char ch ='a'; ch<='z';ch++){
            System.out.print( "Letters ASCII :"+ch+" - ");
        }
        System.out.println();
         for(int i=0; i<256; i++){
             System.out.print("ALL ASCII : "+(char)i+" - ");
         }

    }
}
