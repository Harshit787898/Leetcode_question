import java.util.*;

class Solution {
    public int generate_nums(int n, int[] map) {
        StringBuilder mappedValue = new StringBuilder();
        if (n == 0) {
            mappedValue.append(map[0]);
        } else {
            while (n > 0) {
                int d = n % 10;
                mappedValue.append(map[d]);
                n /= 10;
            }
            mappedValue.reverse();
        }
        return Integer.parseInt(mappedValue.toString());
    }

    public int[] sortJumbled(int[] mapping, int[] nums) {
        int[] new_nums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            new_nums[i] = generate_nums(nums[i], mapping);
        }

        // Use a stable sort to maintain original order for equal mapped values
        Integer[] indices = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(new_nums[a], new_nums[b]));

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[indices[i]];
        }

        return ans;
    }
}
