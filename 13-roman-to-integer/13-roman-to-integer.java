class Solution {
    public int romanToInt(String s) {
        // int a = 0;
        int sum = 0;
        int arr[] = new int[s.length()];
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)) {
                case 'I' -> arr[i] = 1;
                case 'V' -> arr[i] = 5;
                case 'X' -> arr[i] = 10;
                case 'L' -> arr[i] = 50;
                case 'C' -> arr[i] = 100;
                case 'D' -> arr[i] = 500;
                case 'M' -> arr[i] = 1000;
                default -> System.out.println("Not  correct roman value.");
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i < arr.length-1 && arr[i] < arr[i+1]){
                sum -= arr[i];
            }else{
                sum += arr[i];
            }
        }
        return sum;
    }
}