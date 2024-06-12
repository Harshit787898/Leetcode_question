class Solution {
public:
    void sortColors(vector<int>& nums) {
        int zero=0,one=0,two=nums.size()-1;
       while(one<=two){
            if(nums[one]==1){
                one++;
            }else if(nums[one]==0){
                int t=nums[zero];
                nums[zero]=nums[one];
                nums[one]=t;
                zero++;
                one++;
            }else{
                int t=nums[two];
                nums[two]=nums[one];
                nums[one]=t;
                two--;
            }
       }
    }
};