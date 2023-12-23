class Solution {
    public boolean isPathCrossing(String s) {
        int x=0;
        int y=0;
        HashMap<List<Integer>,Integer>map=new HashMap<>();
        List<Integer> t=new ArrayList<>();
        t.add(x);
        t.add(y);
        map.put(t,0);
        for(int i=0;i<s.length();i++){
            List<Integer> te=new ArrayList<>();
            if(s.charAt(i)=='N')
                y++;
            else if(s.charAt(i)=='S')
                y--;
            else if(s.charAt(i)=='E')
                x++;
            else
                x--;
            te.add(x);
            te.add(y);
            if(map.containsKey(te)){
                return true;
            }
            else{
                map.put(te,0);
            }
        }
        return false;
    }
}