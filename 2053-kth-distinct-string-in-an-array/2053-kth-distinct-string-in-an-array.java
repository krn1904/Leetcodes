class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> ans = new ArrayList<String>();
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i].equals(arr[j])){
                    count++;
                }
            }
            if(count == 1){
                ans.add(arr[i]);
            }
        }
                                 // System.out.print(ans.size());

        if(ans.size() < k){
            return "";
        }else{
            return ans.get(k-1);
        }
        // System.out.print(ans);

        // return "-1";
    }
}