class Solution {
    public int mySqrt(int x) {
        int i=0;
        do{
            long prod=i*i;
            if(prod>x)
                return i-1;
            else if(prod==x)
                return i;
            i++;
        }while(true);
    }
}