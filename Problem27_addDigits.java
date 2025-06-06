package p27;


class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        return num;
    }
}
public class Problem27_addDigits {
        public static void main(String[] args) {
            Solution obj = new Solution();
            int ans = obj.addDigits(10);
            System.out.println(ans);
        }    
    }

    // class Solution {
//     public int addDigits(int num) {
//             String strNum = String.valueOf(num);
//             while(num>9){
//                 int sum = 0;
//                 for(int i=0;i<strNum.length();i++){
//                     sum = sum + Integer.parseInt(String.valueOf(strNum.charAt(i)));
//                 }
//                 num = sum;
//                 strNum = String.valueOf(num);
//             }
     
//         return num;
//     }
// }

// public class Problem27_addDigits {
//     public static void main(String[] args) {
//         Solution obj = new Solution();
//         int ans = obj.addDigits(10);
//         System.out.println(ans);
//     }    
// }

//                            //       DIGITAL ROOT SOLUTION       //
// class Solution {
//     public int addDigits(int num) {
//         if (num == 0) {
//             return 0;
//         }
//         return 1 + (num - 1) % 9;
//     }
// }