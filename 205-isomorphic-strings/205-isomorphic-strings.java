class Solution {
    
    public boolean isIsomorphic(String s, String t) {
        
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
//         int len1 = s.length();
//         int len2 = t.length();
//         if(len1 != len2){
//             return false;
//         }
//         int[] map1 = new int[256];
//         int[] map2 = new int[256];
        
//         for(int i = 0; i < len1; i++){
//              if(map1[s.charAt(i)] != map2[t.charAt(i)]){
//                  System.out.println("Running");
//              } 
//         }
//         return true;
//     }
}

        