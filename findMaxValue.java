public class findMaxValue {
    public static void main(String[] args) {
        int [] [] arr = {
            {1,2,3},
           {6,9,6,45},
           {99,95,4,22},
           {56,41,75,63}
       };
       int max= Search(arr);
       System.out.println(max);
    }

    static int  Search(int [] [] arr){
        int max = Integer.MIN_VALUE;
        for ( int row = 0 ; row < arr.length; row++){
        for ( int col = 0 ; col < arr[row].length; col++){
            if ( arr[row] [col] > max){
                max = arr[row] [col];
            }
        }
        }
        return max;
    }
}
