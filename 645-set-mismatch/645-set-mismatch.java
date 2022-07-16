class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int check = nums[i] - 1;
            if(nums[i] != nums[check]){
                swap(nums,i,check);
            }else{
                i++;
            }
        }
        // int[]  arr = new int[]{-1,-1};
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                return new int[]{nums[j],j+1};
            }
        }
                return new int[]{-1,-1};
    }
     public void swap(int[] nums,int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    }
