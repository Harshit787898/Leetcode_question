import java.util.Arrays;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int[] ans = new int[arr1.length];
        int start = 0;
        int end = arr1.length - 1;
        int index = 0;

        for (int i = 0; i < arr2.length; i++) {
            int target = arr2[i];
            start = 0;
            end = arr1.length - 1;

            while (end >= start) {
                int mid = start + (end - start) / 2;
                if (arr1[mid] == target) {
                    for (int j = start; j <= end; j++) {
                        if (arr1[j] == target) {
                            ans[index++] = arr1[j];
                        }
                    }
                    break;
                }
                if (arr1[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if (index == arr1.length) {
                break;
            }
            boolean found = false;
            for (int num : arr2) {
                if (arr1[i] == num) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                ans[index++] = arr1[i];
            }
        }

        return ans;
    }
}