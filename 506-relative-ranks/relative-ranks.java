class Solution {
    public String[] findRelativeRanks(int[] score) {
        String ans[]=new String[score.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<score.length;i++){
            map.put(score[i],i);
            pq.offer(score[i]);
        }
        int pos=1;
        while(pq.size()!=0){
            int sc=pq.poll();
            int in=map.get(sc);
            if(pos>3){
                ans[in]=pos+"";
            }else{
                if(pos==1){
                    ans[in]="Gold Medal";
                }
                else if(pos==2){
                    ans[in]="Silver Medal";
                }
                else{
                    ans[in]="Bronze Medal";
                }
            }
            pos++;
        }
        return ans;
    }
}