class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        List<Integer> temp=new ArrayList<>(map.values());
        Collections.sort(temp);
        int c=temp.size();
        for(int i=0;i<temp.size();i++){
            if(temp.get(i)<=k){
                k=k-temp.get(i);
                c-=1;
            }
            else{
                break;
            }
        }
        return c;
    }
}