class Solution {
    public int maxArea(int[] height) {
        int lp=0;
        int rp=height.length-1;
        int max_water=0;
        while(lp<rp)
        {
            //water level
            int height_=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int waterlevel=height_*width;
            max_water=Math.max(waterlevel,max_water);
            if(height[lp]<height[rp])
            {
                lp++;
            }
            else{
                rp--;
            }
        }
        return max_water;
    }
}