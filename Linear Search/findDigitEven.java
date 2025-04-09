
//https:leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class findDigitEven {
    public static void main(String[] args){
        int [] nums =  {18, 123, 1 ,1764, 891};
        System.out.println(findeven(nums ));
    }

    static int findeven(int [] nums ){
        int count = 0;
        for( int num :nums){
            if(even(num)){ 
                count ++;
            }
        }
        return count++;
    }

    static boolean even (int num ){
        int numberOfDigits = digits(num);
         return  numberOfDigits % 2 == 0 ;
    }

    // count number of digits
    static int digits  (int num){
        int count = 0; 
        while (num >0){
            count ++ ;
            num = num /10 ;
        }
        return count ;
    }

    }

