package p75;
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
    if(timeSeries.length == 0) return 0;
    int total = 0;
    for(int i = 0 ; i < timeSeries.length-1 ; i++){
      if(timeSeries[i+1]-timeSeries[i]>=duration){
        total+=duration;
      }
      else{
        total+= (timeSeries[i+1]-timeSeries[i]);
      }
    }
    total += duration;
    return total;
    }
}
public class Problem75_teemosAttack {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] timeSeries = {1,2,4,6,7};
        int duration = 2;
        int ans = obj.findPoisonedDuration(timeSeries, duration);
        System.out.println(ans);
    }
}
