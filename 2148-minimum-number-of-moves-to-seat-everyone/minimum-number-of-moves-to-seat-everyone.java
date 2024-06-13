class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        PriorityQueue<Integer> pq2=new PriorityQueue<>();
        int n=students.length;
        int ans=0;
        for(int i=0;i<n;i++){
            pq1.offer(seats[i]);
            pq2.offer(students[i]);
        }
        while(!pq1.isEmpty()){
            int t1=pq1.poll();
            int t2=pq2.poll();
            ans+=Math.abs(t1-t2);
        }
        return ans;
    }
}