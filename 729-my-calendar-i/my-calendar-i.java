class MyCalendar {
    TreeMap<Integer,Integer>map;
    public MyCalendar() {
        map=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Map.Entry<Integer, Integer> eventBeforeS = map.floorEntry(start);
        Map.Entry<Integer, Integer> eventAfterS = map.ceilingEntry(start);
        if(eventBeforeS!=null&&eventBeforeS.getValue()>start){
            return false;
        }
        if(eventAfterS!=null&&end>eventAfterS.getKey()){
            return false;
        }
        map.put(start,end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */