package OCA_Questions;

public class App {
    public static void main(String[] args) {
        Boolean [] bool= new Boolean[2];
        bool [0]=new Boolean(Boolean.parseBoolean("true"));
        bool[1]=new Boolean(null);
        System.out.println(bool[0]+" "+bool[1]);



        int num [][] = new int [1][3];
        for(int i=0; i<num.length; i++){
            for (int j=0; j<num[1].length; j++){
                num[i][j]=10;
            }
        }
    }
}
