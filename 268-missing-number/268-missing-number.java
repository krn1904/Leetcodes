class Solution {
    public int missingNumber(int[] nums) {
        cycl(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
    public void cycl(int[] nums){
        int i = 0;
        while(i < nums.length){
            int check = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[check]){
                swap(i,check,nums);
            }else{
                i++;
            }
        }
    }
    public void swap(int first, int second,int[] nums){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}