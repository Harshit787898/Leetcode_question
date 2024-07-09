class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        ans = float('-inf')
        p = 1
        for num in nums:
            if num == 0:
                ans = max(ans, 0)
                p = 1
            else:
                p *= num
                ans = max(num, max(p, ans))
        p = 1
        for num in reversed(nums):
            if num == 0:
                ans = max(ans, 0)
                p = 1
            else:
                p *= num
                ans = max(num, max(p, ans))
        
        return ans