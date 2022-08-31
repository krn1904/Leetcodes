class Solution {
    String swap(int a ,int b,String s){
        int len = s.length();
        char[] str = new char[len];
        for(int i =0 ; i< len; i++){
            str[i] = s.charAt(i);
        }
        char temp = str[a];
        str[a] = str[b];
        str[b] = temp;
        String s1 = "";
        for(int i =0 ; i< len; i++){
            s1 = s1 + str[i];
        }
              
        return s1;
    }
    int length(int num){
        int count = 0;
        while(num!=0){
            count++;
            num /= 10;
        }
        return count;
    }
    public int largestInteger(int num) {
        int len = length(num) - 1;
        String s = String.valueOf(num);
        
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j <= len;j++){
                if(s.charAt(j) > s.charAt(i) && Integer.valueOf(s.charAt(i)) % 2 == 0 && Integer.valueOf(s.charAt(j)) % 2 == 0){
                     s = swap(j,i,s);
                }
                if(s.charAt(j) > s.charAt(i) && Integer.valueOf(s.charAt(i)) % 2 != 0 && Integer.valueOf(s.charAt(j)) % 2 != 0){
                     s = swap(j,i,s);
                }
            }
        }
        
        // int count = 0;
        // for(int i = 1; i < len; i=i+2){
        //     for(int j = i + 2; j <= len; j=j+2){
        //           if(s.charAt(j) > s.charAt(i)){
        //              s = swap(j,i,s);
        //               // count++;
        //         }
        //     }
        // }
        int a = Integer.valueOf(s);
        return a;
    }
}