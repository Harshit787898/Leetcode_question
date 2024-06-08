from typing import List

class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        # Cumulative sum array
        for i in range(1, len(nums)):
            nums[i] += nums[i - 1]
        
        # Modulus operation on cumulative sum array
        for i in range(len(nums)):
            nums[i] %= k
        
        map = {0: -1}  # To handle edge cases

        for i in range(len(nums)):
            if nums[i] in map and (i - map[nums[i]] > 1):
                return True
            elif nums[i] not in map:
                map[nums[i]] = i
        
        return False
