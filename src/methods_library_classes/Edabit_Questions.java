package methods_library_classes;

import java.util.Scanner;

public class Edabit_Questions {
    public static void main(String[] args) {
        System.out.println(helloWorld(3));
        System.out.println(equalSlices(8, 3, 2));
        System.out.println(addUpTo(7));
        int a[] = {1, 2, -9, 7};

        System.out.println(additiveInverse(a));
        System.out.println(MultiplyByLength(a));}

    public static int monthlyPayment(int monthly, int payment) {
        int totalAmount = 35000;
        int restPayment = totalAmount - monthly * payment;
        return restPayment;

    }

    public static void foodsuggestion() {
        Scanner scanner = new Scanner(System.in);

    }

    public static boolean divisibleByFive(int num) {
        boolean result = false;
        if (num % 5 == 0) {
            result = true;
        }
        return result;
    }

    public static boolean reverse(boolean b) {
        return !b;//b is not equal what does it have it
    }

    public static int length(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
            System.out.print(i);
        }
        return i;
    }

    public static boolean isPlural(String word) {

        boolean pulural = false;
        int i;
        for (i = 0; i < word.length() - 1; i++) {
            if (word.endsWith("s")) {
                pulural = true;
            } else pulural = false;
        }
        return pulural;
    }

    public static String helloName(String name) {
        String hello = "Hello ";
        String end = "!";
        return hello + name + end;
    }

    public static String monthName(int num) {
        String month;
        switch (num) {
            case 1: {
                month = "January";
                break;
            }
            case 2: {
                month = "February";
                break;
            }
            case 3: {
                month = "March";
                break;
            }
            case 4: {
                month = "April";
                break;
            }
            case 5: {
                month = "May";
                break;
            }
            case 6: {
                month = "June";
                break;
            }
            case 7: {
                month = "July";
                break;
            }
            case 8: {
                month = "August";
                break;
            }
            case 9: {
                month = "September";
                break;
            }
            case 10: {
                month = "October";
                break;
            }
            case 11: {
                month = "November";
                break;
            }
            case 12: {
                month = "December";
                break;
            }
            default:
                month = "NoOne";
        }
        return month;
    }

    public static String helloWorld(int num) {
        String result = " ";
        if (num % 15 == 0) {
            result = "Hello World";
        } else if (num % 5 == 0) {
            result = "World";
        } else if (num % 3 == 0) {
            result = "Hello";
        }
        return result;
    }

    public static boolean equalSlices(int total, int people, int each) {
        boolean result = false;
        int total2 = people * each;
        if (total >= total2) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //add a Consecutive List of Numbers
    public static int addUpTo(int n) {
        if (n == 0) return 0;
        else return n + addUpTo(n - 1);
    }

    public static int[] additiveInverse(int[] arr) {
        int newAr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newAr[i] = -arr[i];
        }
        return newAr;
    }

    public static int[] MultiplyByLength(int[] arr) {
        int newAr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newAr[i] *= arr.length;
        }
        return newAr;
    }
}