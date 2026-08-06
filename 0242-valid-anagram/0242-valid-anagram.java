class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        {
            return false;
        }
        
        char[] arr=s.toCharArray();
        char[] arr_t=t.toCharArray();
         Arrays.sort(arr);
         Arrays.sort(arr_t);
        return Arrays.equals(arr,arr_t);
    }
}