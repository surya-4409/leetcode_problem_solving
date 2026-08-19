class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean ans=false;
        if(n<=0)
        {
            return false;
        }
        n=n&n-1;
        if(n<<1==0)
        {
            return true;
        }
        return ans;
    }
}