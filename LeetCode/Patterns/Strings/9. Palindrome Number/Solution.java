class Solution {
    public boolean isPalindrome(int x) {
        int rev=0, temp=x;

        if(x<0)
            return false;

        while(x>0) {
            //int r=x%10;
            rev = rev*10 + x%10;
            x/=10;
        }

        return rev==temp;
        // if(rev==temp)
        //     return true;
        // else
        //     return false;
    }
}