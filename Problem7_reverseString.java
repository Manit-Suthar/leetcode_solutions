class Solution{
    public void reverseString(char[] s) {
        int start=0,end=s.length-1;
        char temp;
        while(start < end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(s);
    }
}
public class Problem7_reverseString {
    public static void main(String[] args) {
        Solution obj= new Solution();
        char[] str={'h','e','l','l','o'};
        obj.reverseString(str);    
    }
}
