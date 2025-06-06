
class Solution 
{
    public int singleNumber(int[] nums)
    {
        
        int uniNum = 0;
        for(int i=0;i<nums.length;i++)
        {
            uniNum = uniNum^nums[i];
        }
        
        return uniNum;
    }
}

public class Problem3_singleNum
{
    public static void main(String[] args)
    {
        Solution obj = new Solution();
        int a[]={1,3,4,3,4};
        int ans = obj.singleNumber(a);
        System.out.println(ans);
    
    }
}

