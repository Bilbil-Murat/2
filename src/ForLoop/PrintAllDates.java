package ForLoop;

public class PrintAllDates {
    public static void main(String[] args) {
        String year = "2020 year";
        for (int month =1; month < 13; month++) {
            if (month!=12){
            System.out.println("--------------------- ");
            for (int day = 1; day< 31; day++) {
                System.out.println(month+"/"+day+"/"+ year);
            }


            }

        }
    }
}
