package p37;
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i = 0;i<jewels.length();i++){
            for(int j = 0 ; j<stones.length();j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}
public class Problem37_jewelsAndStones {
        public static void main(String[] args) {
            Solution obj = new Solution();
            String jewels = "abcdP";
            String stones = "Pacabcdzx";
            int ans = obj.numJewelsInStones(jewels, stones);
            System.out.println(ans);
        }
}
