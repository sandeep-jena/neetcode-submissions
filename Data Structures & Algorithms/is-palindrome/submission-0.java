class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int low=0;
        int high=str.length()-1;
        while(low<high){
            if(str.charAt(low)!=str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
