class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        HashSet<Integer> set=new HashSet<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int t=entry.getValue();
            if(set.contains(t)){
                return false;
            }
            else{
                set.add(t);
            }
        }
        return true;
    }
}