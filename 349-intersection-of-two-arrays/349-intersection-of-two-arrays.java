import java.util.Arrays;
import java.util.List;
class Solution {
    public boolean binarySearch1(int target,int n,int[] nums){
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
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l1 = nums1.length;
        int l2 = nums2.length;
        HashSet<Integer> ans = new HashSet<>();
        // int[] arr = new int[Math.min(l1,l2)];
        int j = 0;
        for(int i = 0; i < l1; i++){
            if(binarySearch1(nums1[i],l2,nums2)){
                // arr[j] = nums1[i];
                ans.add(nums1[i]);
                j++;
            }
        }
       // int[] arr = ans.toArray(ans);
        // Arrays.asList(arr);
        int[] arr=new int[ans.size()];
        int k=0;
        for(int i : ans){
            arr[k]=i;
            k++;
        }
        return arr;
    }
}