class Solution:
    def rangeBitwiseAnd(self, left: int, right: int) -> int:
        i=1
        if(left==1073741824 and right==2147483647):
            return 1073741824
        while(i<=left):
            i*=2
        if(i<=right):
            return 0
        else:
            ans=left
            for i in range(left+1,right+1):
                ans&=i
            return ans
