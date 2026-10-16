class Solution {
    public boolean isPalindrome(String s) {
        // String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        // int n = str.length();
        // for(int i=0;i<n/2;i++){
        //     if(str.charAt(i)!=str.charAt(n-i-1)){
        //         return false;
        //     }
        // }
        // return true;
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            char lchar = s.charAt(left);
            char rchar = s.charAt(right);
            if (!Character.isLetterOrDigit(lchar)){
                left++;
            }
            else if(!Character.isLetterOrDigit(rchar)){
                right--;
            }
            else{
            if(Character.toLowerCase(lchar)!=Character.toLowerCase(rchar)){
                return false;
            }
            left++;
            right--;
            }

        }
        return true;


    }
}