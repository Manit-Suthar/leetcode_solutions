package p20;

// import java.util.HashMap;
// import java.util.Map;
import java.lang.Math;

//Effective Solution //
class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0;
        for(int i=columnTitle.length()-1,r=0;i>-1;i--,r++){
            sum = sum + (int)(Math.pow(26, i)*(int)(columnTitle.charAt(r)-64));
        }
        return sum;
    }
}
public class Problem20_excelSheetColumnNumber {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String str = "AA";
        int title = obj.titleToNumber(str);
        System.out.println(title);
    }
}

// Solution using Hashmap //

    // class Solution {
    //     public int titleToNumber(String columnTitle) {
    //         Map<String,Integer> map = new HashMap<>();
    //         char[] c = columnTitle.toCharArray();
    //         int sum = 0;
    //         for(int i = 1;i<=26;i++){
    //             String str = Character.toString((char)(i+64));
    //             map.put(str,i);
    //         }
    //         for(int k=c.length-1,r=0;k>-1;k--,r++){
    //             sum = sum + (int)(Math.pow(26,r)*map.get(Character.toString(c[k])));
    //         }
    //         return sum;
    //     }
    // }

    // public class Problem20_excelSheetColumnNumber {
    //     public static void main(String[] args) {
    //         Solution obj = new Solution();
    //         String str = "AB";
    //         int titleNum = obj.titleToNumber(str);
    //         System.out.println(titleNum);
    //     }
    // }


