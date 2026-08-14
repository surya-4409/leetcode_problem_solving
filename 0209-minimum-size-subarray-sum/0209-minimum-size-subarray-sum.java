class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int min_length=Integer.MAX_VALUE;
        int found=0;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum>=target)
            {
                found=1;
                min_length=Math.min(min_length,right-left+1);
                 sum=sum-nums[left];
                left++;
                
            }
           

        }
        if(found==0)
        {
            return 0;
        }
        return min_length;
    }
}