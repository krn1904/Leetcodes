class Solution {
    public int findMinlen(String[] strs){
        int min = strs[0].length();
        for(int i= 0; i < strs.length; i++){
            if(strs[i].length() < min){
                min = strs[i].length();
            }
        }
        return min;
    }
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        int flag = -1;
        int len = findMinlen(strs);
        // System.out.println(len);
        for(int i = 0; i < len; i++){
            int count = 0;
            for(int j = 0; j < strs.length; j++){
                if(  strs[j].length() >= len && strs[0].charAt(i) == strs[j].charAt(i)){
                    count++;
                }else{
                    flag++;
                    break;
                    
                }
            }
            if(flag >= 0){
                break;
            }
            if(count == strs.length){
                s = s + strs[0].charAt(i);
            }
        }
        return s;
        
    }
}