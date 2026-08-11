class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        int postfix[]=new int[n];
        prefix[0]=nums[0];
        postfix[n-1]=nums[n-1];
        for(int i=1;i<n;i++)
        {
            prefix[i]=nums[i]*prefix[i-1];
        }
        for(int j=n-2;j>0;j--)
        {
            postfix[j]=postfix[j+1]*nums[j];
        }
        nums[0]=postfix[1];
        nums[n-1]=prefix[n-2];
        for(int k=1;k<n-1;k++)
        {
            nums[k]=prefix[k-1]*postfix[k+1];
        }
        return nums;
    }
}