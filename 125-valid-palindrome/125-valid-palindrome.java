class Solution {
    public boolean isPalindrome(String s) {
        String ns = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();//replaces all the special character with ""
        // StringBuilder res = new StringBuilder(ns);
        // res = res.reverse();
        int i =0;
        int j =ns.length()-1;
         while (i <= j) {
            if (ns.charAt(i) == ns.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
        //first submit...
        // if(res.toString().equals(ns)){
        // return true;
        // }
        // return false;
    }
}