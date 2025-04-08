import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        
      int [] [] arr = {
     {1,2,3},
    {6,9,6,45},
    {99,95,4,22},
    {56,41,75,63}
};
    int target =63 ;
    int [] ans = Search(arr,target);
    System.out.println(Arrays.toString(ans));
    }

    static int[] Search(int[] [] arr , int target){
        for (int row = 0;  row < arr.length; row ++){
            for (int col= 0 ; col<arr[row].length;  col++){
                if (arr[row][col] == target){
                return new int []{row,col};
                }
            }
        }
        return null;
    }
}

