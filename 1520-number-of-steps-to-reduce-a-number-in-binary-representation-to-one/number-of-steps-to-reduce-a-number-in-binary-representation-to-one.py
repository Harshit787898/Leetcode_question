class Solution:
    def numSteps(self, s: str) -> int:
        n = int(s, 2)  
        c = 0
        
        while n != 1:
            if n % 2 == 0:
                n //= 2
            else:
                n += 1
            c += 1
        
        return c
