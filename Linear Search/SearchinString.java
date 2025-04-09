import java.io.*;

public class SearchinString {
    public static void main(String[] args) {
        String name = "Naman";
        char target ='n';
        System.out.println (searc2(name, target));
    }

    static boolean searc2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        
        

        return false;
    }


    // this is without enhanced Loop and upper oneis using enhanced loop
    // static boolean search(String str, char target) {
    //     if (str.length() == 0) {
    //         return false;
    //     }

    //     for (int i = 0; i < str.length(); i++) {
    //         if (target == str.charAt(i)) {
    //             return true;
    //         }
    //     }

    //     return false;
    // }
}