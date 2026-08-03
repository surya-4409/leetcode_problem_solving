class Solution {
    public int majorityElement(int[] nums) {
        int max_num=0;
        int count=0;
        for(int num:nums)
        {
            if(count ==0)
            {
                max_num=num;

            }

            if(max_num==num)
            {
                count++;
            }
            else{
                count--;
            }
        }

        return max_num;
        
    }
}