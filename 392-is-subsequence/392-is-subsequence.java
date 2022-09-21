class Solution {
    public boolean isSubsequence(String s, String t) {
      
        int j = 0 ,i = 0;
            while(j < t.length()){
                if(i < s.length() && s.charAt(i) == t.charAt(j)){
                    i++;
                    j++;
                }else{
                    j++;
                }
        }
        if(i == s.length() ) return true;
        else return false;
    }
}