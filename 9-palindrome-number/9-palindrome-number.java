class Solution {
    public int len(int x){
        int count = 0;
        while(x!=0){
            x = x/10;
            count++;
        }
        return count;
    }
    public boolean isPalindrome(int x) {
        // x = Math.abs(x);
        if(x < 0){
            return false;
        }
       int len = len(x);
       int temp = x;
       int c = 0;
       int m = (int)Math.pow(10,len-1);
       while(x!=0){
            int a = x % 10;
            c = c + a * m;
            x = x /10;
            m = m / 10;
        }
        // System.out.println(c);
        if(temp == c){
            return true;
        }
        return false;
    }
}