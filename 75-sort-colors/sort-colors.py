class Solution(object):
    def sortColors(self, nums):
        one=0
        two=len(nums)-1
        zero=0
        while(one<=two):
            if nums[one]==1:
                one+=1
            elif nums[one]==0:
                t=nums[one]
                nums[one]=nums[zero]
                nums[zero]=t
                one+=1
                zero+=1
            else:
                l=nums[one]
                nums[one]=nums[two]
                nums[two]=l
                two-=1
        