class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int ans=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<students.length;i++){
            ans+=Math.abs(students[i]-seats[i]);
        }
        return ans;
    }
}