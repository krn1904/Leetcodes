class Solution {
    public int sum(int start,int end,int[] nums){
        int sum = 0;
        for(int i = start;i < end;i++){
            sum += nums[i];
        }
        return sum;
    }
    public int pivotIndex(int[] nums) {
        int sum = sum(0,nums.length,nums);
        int Tsum = 0;
       for(int i = 0; i < nums.length; i++){
           // int Tsum = 0;
           if(sum - Tsum - nums[i] ==  Tsum){
               return i;
           }
           Tsum = Tsum + nums[i];
       }
        return -1;
    }
}