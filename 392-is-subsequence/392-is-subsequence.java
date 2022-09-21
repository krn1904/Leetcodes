class Solution {
//     public boolean isSubsequence(String s, String t) {
      
//         int j = 0 ,i = 0;
//             while(j < t.length()){
//                 if(i < s.length() && s.charAt(i) == t.charAt(j)){
//                     i++;
//                     j++;
//                 }else{
//                     j++;
//                 }
//         }
//         if(i == s.length() ) return true;
//         else return false;
//     }
// }

// Other Soliution

public boolean isSubsequence(String s, String t){
        int curidx = -1;
        for(int i=0;i<s.length();i++)
        {
            curidx = t.indexOf(s.charAt(i),curidx+1);
                if(curidx==-1)
                    return false;
        }
        return true;
    }
}