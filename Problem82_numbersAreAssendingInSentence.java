package p82;
class Solution {
    public boolean areNumbersAscending(String s) {
        int num = 0 , large = 0 ; 
        for(int i = 0 ; i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                num = (int) (s.charAt(i)-'0');
                while(i<s.length()-1 && s.charAt(i+1)>='0' && s.charAt(i+1)<='9'){
                    num = num*10 + (s.charAt(i+1)-'0');
                    i++;
                }
                if(num > large) large = num;
                else return false;
                System.out.println(large+" "+i);
            }
        }
        return true;
    }
}
// class Solution {
//     public boolean areNumbersAscending(String s) {
//         int prev = 0;
//         for (String word : s.split(" ")) {
//             if (Character.isDigit(word.charAt(0))) {
//                 int num = Integer.parseInt(word);
//                 if (num <= prev) return false;
//                 prev = num;
//             }
//         }
//         return true;
//     }
// }

public class Problem82_numbersAreAssendingInSentence {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s ="4 5 6 7 55";
        boolean ans = obj.areNumbersAscending(s);
        System.out.println(ans);
    }
}
