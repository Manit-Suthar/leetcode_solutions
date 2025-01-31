//returnig arr indices whose sum is as asked

class Solution
{
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i=0,j;
        while (i < n - 1) 
        {
            for (j = i + 1; j < n; j++) 
            {
                if (nums[i] + nums[j] == target)
                {
                    return new int[]{i, j};
                }
            }
            i++;
        }
        System.out.println("no match");
        return new int[]{}; 
    }
}

public class Problem1{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[]a={2,3,4,5};
        int target=9;
        int m;
        int[]b=obj.twoSum(a,target);
        for(m=0; m <b.length;m++)
       {
        System.out.println(b[m]);
       } 
    }
}
