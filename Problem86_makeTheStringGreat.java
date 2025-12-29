package p86;
class Solution {
    public String makeGood(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0 ; i< sb.length()-1;i++){
            if(Math.abs(sb.charAt(i)-sb.charAt(i+1))==Math.abs('a'-'A')){
                sb.delete(i, i+2);
                System.out.println(sb);
                i=-1;
            }
        }
        return String.valueOf(sb);
    }
}
public class Problem86_makeTheStringGreat {
   public static void main(String[] args) {
    Solution obj = new Solution();
    String s = "ABbcCma";
    String ans = obj.makeGood(s);
    System.out.println(ans);
   } 
}
