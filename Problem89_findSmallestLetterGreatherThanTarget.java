package p89;
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i= 0 ; i< letters.length;i++){
            if((int)letters[i]-target > 0){
                return letters[i];
            }
        }
        return letters[0];
    }
}
public class Problem89_findSmallestLetterGreatherThanTarget {
    public static void main(String[] args) {
        Solution obj = new Solution();
        char[] letters = {'x','x','y','y'};
        char target = 'z';
        char ans = obj.nextGreatestLetter(letters, target);
        System.out.println(ans);
    }
}
