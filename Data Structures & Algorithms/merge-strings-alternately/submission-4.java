class Solution {
    public String mergeAlternately(String word1, String word2) {
       int w2=0;
       int w1=0;
       StringBuilder s3 = new StringBuilder();
       int i=0;
       while(w1< word1.length() || w2<word2.length()){
            if(i%2==0 && w1<word1.length()){
                     s3.append(word1.charAt(w1));
                     w1++;
                }
            if(i%2==1 && w2<word2.length()){
                  s3.append(word2.charAt(w2));
                    w2++;
        }
                i++;

        }
        String mergestr = s3.toString();
    return mergestr;
}}
