class Solution {
    HashMap<String, Integer> dp = new HashMap<>();

    public void solve(HashMap<Integer, List<int[]>> map, int s, int d, int k, int co, int[] min) {
        if (s == d) {
            min[0] = Math.min(min[0], co);
            return;
        }
        if (k < 0 || co > min[0])
            return;
        String key = s + "_" + co;
        if (dp.containsKey(key)) {
            min[0] = Math.min(min[0], dp.get(key));
            return;
        }
        if (map.containsKey(s)) {
            for (int[] temp : map.get(s)) {
                int c = temp[0];
                int p = temp[1];
                solve(map, c, d, k - 1, co + p, min);
            }
        }
        dp.put(key, min[0]);
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        HashMap<Integer,List<int[]>> map=new HashMap<>();
        for(int [] f:flights){
            int from=f[0];
            int to=f[1];
            int price=f[2];
            if (map.containsKey(from)) {
                map.get(from).add(new int[]{to, price});
            } else {
                List<int[]> destinations = new ArrayList<>();
                destinations.add(new int[]{to, price});
                map.put(from, destinations);
            }
        }
        int[] min = {Integer.MAX_VALUE};
        solve(map, src, dst, k, 0, min);
        if (min[0] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return min[0];
        }
    }
}