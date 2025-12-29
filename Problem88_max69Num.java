package p88;
class Solution {
    public int maximum69Number (int num) {
        char[] strNum = String.valueOf(num).toCharArray();
        for(int i = 0 ; i < strNum.length ; i++){
            if(strNum[i]=='6'){
                strNum[i] = '9';
                return Integer.parseInt(String.valueOf(strNum));
            }
        }
        return num;

    }
}
public class Problem88_max69Num {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int num = 9999;
        int ans = obj.maximum69Number(num);
        System.out.println(ans);
    }
}
