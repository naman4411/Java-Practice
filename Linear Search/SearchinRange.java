public class SearchinRange {
public static void main(String[] args) {
    int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
    int target = 19;
    
    // change the range to search
    System.out.println(SearchinRange(nums ,target ,1 ,4));
}
static int SearchinRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1; // <-- This line was missing
    }
}
