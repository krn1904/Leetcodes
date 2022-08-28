class Solution {
    public boolean isPalindrome(String s) {
        String ns = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();//replaces all the special character with ""
        StringBuilder res = new StringBuilder(ns);
        res = res.reverse();
        if(res.toString().equals(ns)){
        return true;
        }
        return false;
    }
}