'''class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        count=len(s)
        n=len(s);
        temp=''
        for i in range (0,n-1):
          for j in range (0,n-i-1):
              if s[j] > s[j+1]:
                temp=s[j+1];
                s[j]=s[j+1]
                s[j]=temp'''

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if sorted(s) == sorted(t):
            return True
        else:
            return False
