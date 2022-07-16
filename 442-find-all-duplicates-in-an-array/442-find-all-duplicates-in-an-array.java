class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int check = nums[i] - 1;
            if(nums[i] != nums[check]){
                swap(nums,i,check);
            }else{
                i++;
            }
        }
        ArrayList<Integer> arr =new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
            arr.add(nums[j]);
            }
        }
        return arr;
    }
     public void swap(int[] nums,int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}