class Solution {
    public boolean validPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l+=1;
                r-=1;  

            }
            else{
                return cp(l+1,r,s)||cp(l,r-1,s);
            }
        }
            return true;

    }
        public  boolean cp(int left,int right,String s){
            while(left<right){
                if(s.charAt(left)==s.charAt(right)){
                    left+=1;
                    right-=1;
                }
                else return false;

            }
            return true;
        
}
}