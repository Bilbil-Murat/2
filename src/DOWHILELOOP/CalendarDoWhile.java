package firstpackage;

public class CalendarDoWhile {
    public static void main(String[] args) {
        /*Write down Calendar with do while;
        1.Initialization 2.Condition 3.a.Increment and b.decrement
         */
        int month=1;
        int day;
        do{
            day=1;
            do{
                System.out.println(month+" / "+day+" /2020 year ");
                day++;
            }
            while(day<31);
            month++;
            if(month!=13){
                System.out.println("--------------------");
            }
        }
            while(month<13);
        System.out.println();
    }
}
