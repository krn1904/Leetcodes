class Solution {
    public boolean binarySearch(int target,int n,int[] nums){
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
                flag = 1;
                break;
            }  
        }
        if( flag == 1){
            return true;
        }else{
            return false;
        }
    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int c = -1;
        Arrays.sort(nums);
        for(int i =0; i<=n; i++){
            if(binarySearch(i,n,nums)){
            }else{
                c = i;
                break;
            }
    }    
        return c;
}
}