class Solution {
    public char binarysearch(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        
        while(start < end){
            int mid = start + (end - start)/2;
            
            if(letters[mid] > target){
                end = mid;
            }else if(letters[mid] <= target){
                start = mid + 1;
            }else{
                break;
            }
        }
        return letters[end];
    }
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters[letters.length - 1] <= target){
            return letters[0];
        }else{
             return binarysearch(letters,target); 
        }
    }
}