class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left_max[]=new int[n];
        left_max[0]=height[0];
        for(int i=1;i<n;i++)
        {
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }
        int right_max[] =new int[n];
        right_max[n-1]=height[n-1];
        for(int j=n-2;j>=0;j--)
        {
            right_max[j]=Math.max(height[j],right_max[j+1]);
        }
        int trapped=0;
        for(int k=0;k<n;k++)
        {
            int water_level=Math.min(left_max[k],right_max[k]);
            trapped +=water_level -height[k];
        }
        return trapped;
    }
}
