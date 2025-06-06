//package p9;
import java.util.Arrays;



class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        int n = digits.length;
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            else
            {
                digits[i] = 0;
            }
        }
        int[] newArray = new int[n+1];
        newArray[0] = 1;
        return newArray;
        
    }
}
public class Problem9_plusOne
{
    public static void main(String[] args) 
    {
        int[] digits = {1,9};
        Solution obj = new Solution();
        int[] fArray = obj.plusOne(digits);
        System.out.println(Arrays.toString(fArray)); 
    }
}