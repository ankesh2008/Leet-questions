class Solution {
    public boolean isPalindrome(int x) {
       if(x<0){
        return false;
       }
       int reverse = 0 ;
       int h = x;
       
       while(h>0){
        int d  = h%10;
        reverse = reverse*10+d;
        h = h/10;

       }
       if(reverse == x){
        return true;
       }else{return false;
       }
        
    }
    
}