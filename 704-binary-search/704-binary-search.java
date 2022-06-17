class Solution {
     public int binarySearch1(int target,int n,int[] nums){
        int start = 0;
        int end = n-1;
        int flag = 0;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] < target){
                start = mid+1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                flag = mid;
                break;
            }  
        }
        if( nums[flag] == target){
            return flag;
        }else{
            return -1;
        }
    }
    public int search(int[] nums, int target) {
        return binarySearch1(target,nums.length,nums);
    }
}