package arrrays;
public class Cut_In_Half {
      public static void main(String[] args) {
         int arr2[]={1,2,3,4,5,6,7,8,9};
        cutInHalf(arr2);
    }
    public static void cutInHalf(int [] arr){
        int myArray= arr.length;
        int half=myArray/2+1;
        int []firstHalf=new int[half];
        for (int i = 0; i <half ; i++) {
            firstHalf[i]=arr[i];
        }
    }
}
