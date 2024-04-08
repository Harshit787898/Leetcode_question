class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q.offer(students[i]);
        }
        for(int i=0;i<sandwiches.length;i++){
            int n=q.size();
            boolean flag=false;
            while(n!=0){
                int temp=q.poll();
                if(temp==sandwiches[i]){
                    flag=true;
                    break;
                }
                else{
                    q.offer(temp);
                }
                n--;
            }
            if(!flag){
                return q.size();
            }
        }
        return 0;
    }
}