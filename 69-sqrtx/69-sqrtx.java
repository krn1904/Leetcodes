class Solution {
    public int mySqrt(int x) {
        if(x<=1){return x;}
        int start = 1;
        int end = x;
    while(start < end){
        int mid = (start + end) /2;
        
        if(mid  <= x/mid){
            start = mid + 1;
        }
        else{
            end = mid;
        }
        
    }
        return start - 1; 
    }
}