class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
            for(int j =0; j<nums.length;j++){
                if(nums[j] != j + 1){
                    arr.add(j+1);
                }
            }
        return arr;
        }
    public void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}