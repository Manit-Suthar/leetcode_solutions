
class Solution 
{
    public boolean isPalindrome(int x) {
        int dig,rev=0,y=x;
        if(x<0)
        {
            return false;
        }
        else
        {
        while(x!=0)
        {
            dig = x%10;
            rev = rev*10 + dig;
            x /= 10;
        }
        if (y == rev)
        {
            return true;
        }
        else
            return false;
    }
    }
}
    public class Problem2_pelindrumNum
{
    public static void main(String a [])
    {
        Solution b = new Solution();
        boolean result = b.isPalindrome(-12321);
        System.out.println(result);
    }
}
