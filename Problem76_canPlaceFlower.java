package p76;
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        if(l ==1 && flowerbed[0] == 0 && n == 1 ) return true;
        for(int i = 0 ; i <l-1 && n>0 ;i++){
            if(flowerbed[i] == 1) continue;
            else{
                if(flowerbed[0] == 0 && flowerbed[1] == 0){
                    flowerbed[0] = 1;
                    n--;
                } 
                else if(i>0 && flowerbed[i-1]==0 && flowerbed[i+1]==0) {
                    flowerbed[i] = 1;
                    n--;
                }
                else if(flowerbed[l-2]==0 && flowerbed[l-1]==0){
                    flowerbed[l-1] = 1;
                    n--;
                }
            }
        }
        return n==0?true:false;
    }
}
public class Problem76_canPlaceFlower {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] flowerbed = {0,1,0};
        int n = 1;
        boolean ans = obj.canPlaceFlowers(flowerbed, n);
        System.out.println(ans);
    }
}
