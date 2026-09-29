class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String s2="";
        for(int i=0;i<s.length();i++){
             s2 += s.charAt(s.length()-i-1); 
              }
        
        if (s.equals(s2)){
            return true;
        }
        return false;
    }

}
