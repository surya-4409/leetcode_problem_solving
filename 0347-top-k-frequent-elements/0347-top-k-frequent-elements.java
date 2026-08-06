class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

            PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());


            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.offer(entry);
            }

            int arr[] =new int[k];
            for(int j=0;j<k;j++)
            {
                arr[j]=pq.poll().getKey();
            }
            return arr;
    
    }
}
