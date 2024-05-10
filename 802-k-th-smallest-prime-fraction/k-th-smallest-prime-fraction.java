class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<int[]> fractions = new ArrayList<>();
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int[] fraction = new int[]{arr[i], arr[j]};
                double value = (double) fraction[0] / fraction[1];
                fractions.add(fraction);
            }
        }
        
        Collections.sort(fractions, (a, b) -> Double.compare(
            (double) a[0] / a[1], (double) b[0] / b[1]));
        
        return fractions.get(k - 1);
    }
}
