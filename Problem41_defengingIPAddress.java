package p41;
class Solution {
    public String defangIPaddr(String address) {
        // StringBuffer sb = new StringBuffer();
        // for(char c : address.toCharArray()){
        //     if(c!='.'){
        //         sb.append(c);
        //     }
        //     else{
        //         sb.append("[.]");
        //     }
        // }
        return address.replace(".","[.]");
    }
}
public class Problem41_defengingIPAddress {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String  ipAdd = "1.1.1.1";
        String ans = obj.defangIPaddr(ipAdd);
        System.out.println(ans);
    }
}
