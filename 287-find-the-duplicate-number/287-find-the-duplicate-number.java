class Solution {
   public int findDuplicate(int[] nums) {
        int i = 0;
        while(i != nums.length){
            int correct = nums[i] - 1;
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1)
                return nums[j];
        }
       return -1;
    }
    public void swap(int[] nums,int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}