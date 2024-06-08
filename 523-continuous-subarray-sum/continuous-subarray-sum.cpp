class Solution {
public:
    bool checkSubarraySum(vector<int>& nums, int k) {
        // Cumulative sum array
        for(int i = 1; i < nums.size(); i++) {
            nums[i] += nums[i - 1];
        }

        // Modulus operation on cumulative sum array
        for(int i = 0; i < nums.size(); i++) {
            nums[i] %= k;
        }

        unordered_map<int, int> map;
        map[0] = -1; // To handle edge cases

        for(int i = 0; i < nums.size(); i++) {
            if(map.find(nums[i]) != map.end() && (i - map[nums[i]] > 1)) {
                return true;
            } else if(map.find(nums[i]) == map.end()) {
                map[nums[i]] = i;
            }
        }
        return false;
    }
};