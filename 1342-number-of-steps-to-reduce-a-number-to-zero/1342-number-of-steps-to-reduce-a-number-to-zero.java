class Solution {
//     int count(int num){
//         // int count = 0;
        
//     }
   public int help(int num,int count){
        if(num == 0){
            return count;
        }
        if(num%2 == 0){
            return help(num/2, count+1);
        }
            return help(num-1, count+1);
        
    }
    public int numberOfSteps(int num) {
        return help(num, 0);
    }
}