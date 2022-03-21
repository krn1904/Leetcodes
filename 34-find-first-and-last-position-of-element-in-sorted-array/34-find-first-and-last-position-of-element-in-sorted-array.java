class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] as = {-1,-1};
        int a = search(nums,target,true);
        int b = search(nums,target,false);
         as[0] = a;
         as[1] = b;
        return as;
     }
    public int search(int[] nums, int target,boolean serachstart){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end){
            
            int mid = (start + end) / 2;
            if(nums[mid] > target){
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                ans = mid;
                     if(serachstart){
                         end = mid - 1;
                     }else{
                         start = mid + 1;
                         }
                 }
        }
        return ans;
    }
}