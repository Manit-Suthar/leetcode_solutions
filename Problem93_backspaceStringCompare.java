package p93;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0,j=0; i <s.length();i++){
            if(s.charAt(i)=='#' && j!=0){
                sb1.deleteCharAt(j-1);
                j--;
                System.out.print(sb1.toString()+""+j+" ");
            }
            else{ 
                if(s.charAt(i)=='#')continue;
                sb1.append(s.charAt(i));
                j++;
                System.out.print(" "+sb1.toString()+""+j+" ");
            }
        }
        System.out.println();
        for(int i = 0,j=0; i <t.length();i++){
            if(t.charAt(i)=='#'&& j!=0){
                sb2.deleteCharAt(j-1);
                j--;
                System.out.print(sb2.toString()+""+j+" ");

            }
            else{ 
                if(t.charAt(i)=='#')continue;
                sb2.append(t.charAt(i));
                j++;
                System.out.print(" "+sb2.toString()+""+j+" ");
            }
        }
        System.out.println();
        System.out.println(sb1.toString()+" "+sb2.toString());
        return sb1.toString().equals(sb2.toString());
    }
}
public class Problem93_backspaceStringCompare {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "y#fo##f";
        String t = "y#f#o##f";
        boolean ans = obj.backspaceCompare(s, t);
        System.out.println(ans);
    }
}
