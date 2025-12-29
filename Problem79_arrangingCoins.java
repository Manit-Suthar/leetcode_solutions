package p79;
class Solution {
    
        public int arrangeCoins(int n) {
            // Formula derived from k(k+1)/2 <= n
            return (int)((Math.sqrt(1 + 8L * n) - 1) / 2);
        }
    
    
    // public int arrangeCoins(int n) {
    //     int rowCount = 0;
    //     for(int i = 1 ; i <= n ; i++ ){
    //         n -= i;
    //         rowCount++;
    //     } 
    //     return rowCount;
    // }
}
public class Problem79_arrangingCoins {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int coins = 55; 
        int ans = obj.arrangeCoins(coins);
        System.out.println(ans);
    }
}
