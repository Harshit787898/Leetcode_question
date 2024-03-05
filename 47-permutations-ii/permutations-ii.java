class Solution {
    public void traverse(int n, List<Integer> subset, List<List<Integer>> powerset, HashMap<Integer, Integer> map) {
        if (subset.size() == n) {
            powerset.add(new ArrayList<>(subset)); // Create a new instance of the subset list
        } else {
            for (Map.Entry<Integer, Integer> entry : new ArrayList<>(map.entrySet())) {
                int key = entry.getKey();
                int val = entry.getValue();
                if (val > 0) { 
                    subset.add(key);
                    map.put(key, val - 1);
                    traverse(n, subset, powerset, map);
                    map.put(key, val);
                    subset.remove(subset.size() - 1);
                }
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> powerset = new ArrayList<>();
        traverse(nums.length, subset, powerset, map);
        return powerset;
    }
}