class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int l=0;
        int r=nums.length-1;
        reverse(nums,l,r);
        //reverser the upto k
         reverse(nums,l,k-1);
        // //reverse after the k index

         reverse(nums,k,r);


        
    }
    public int[] reverse(int arr[],int left,int right)
    {
        while(left<(right)){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }
}