package p94;
class Solution {
    public int minOperations(String[] logs) {
        int back = 0 ;
        for(String s : logs){
            if(s.length()==2 && s.charAt(0)=='.') back+=0;
            else if(s.length()==2 && s.charAt(0)!='.') back+=1;
            else if(s.length()>=3 && s.charAt(0)!='.') back+=1;
            else if(back>0) back-=1;
        }
        return back;
    }
}
public class Problem94_CrawlerLogFolder {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] arr = {"1/"};
        int ans = obj.minOperations(arr);
        System.out.println(ans);
    }
}
