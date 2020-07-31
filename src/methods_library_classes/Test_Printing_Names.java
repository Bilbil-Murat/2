package methods_library_classes;

public class Test_Printing_Names {
    public static void main(String[] args) {
        Name.myName_Void_Without_Parameter();
        Name.myName_With_Void_Parameter("BILBIL");
        System.out.println(  Name.myName_String_With_Parameter("String : BILBIL "));
        Name.myName_String_Without_Parameter();
        Top_To_Bottom.printVertical("Hello");
        Game.Number_Guessing(19);

    }
}
