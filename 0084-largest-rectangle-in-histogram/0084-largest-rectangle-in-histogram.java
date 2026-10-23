class Solution {
    public int largestRectangleArea(int[] heights) {

        int maxArea=0;
        int msr[] =new  int[heights.length];
        int msl[]=new  int[heights.length];
        //max smaller right
        Stack<Integer> s= new Stack<>();
        for(int i=heights.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                msr[i]=heights.length;
            }
            else{
                msr[i]=s.peek();
            }

            s.push(i);
        }

        //max smaller left
        s=new Stack<>();
        for(int i=0;i<heights.length;i++)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                msl[i]=-1;

            }
            else{
                msl[i]=s.peek();
            }
            s.push(i);
        }

        // calculating the area for each index

        for(int i=0;i<heights.length;i++)
        {
            int height=heights[i];
            int width=msr[i]-msl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(currArea,maxArea);
        }
        return maxArea;
    }
}