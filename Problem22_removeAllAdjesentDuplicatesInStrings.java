package p22;

class Solution {
//     StringBuilder loop(StringBuilder sb){
//         for(int i = 0; i<sb.length()-1;i++){
//             if(sb.charAt(i) == sb.charAt(i+1)){
//                 sb.delete(i, i+2);
//                 loop(sb);
//             }
//         }
//         return sb;
//     }
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i<sb.length()-1;i++){
            if(i==-1 && sb.length()>1){
                i++;
            }
            if(sb.charAt(i) == sb.charAt(i+1)){
                sb.delete(i, i+2);
                i-=2;
                if(sb.length()==1 || sb.length()==0){
                    break;
                }
                //loop(sb);
            }
        }
        
        //loop(sb);
        return sb.toString();
    }
}
public class Problem22_removeAllAdjesentDuplicatesInStrings {
    public static void main(String[] args) {
        String str = "cmbbmcaa";
        Solution obj = new Solution();
        String ans = obj.removeDuplicates(str);
        for(int i=0;i<ans.length();i++){
            System.out.print(ans.charAt(i));
        }
    }
}
