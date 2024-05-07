class SmallestInfiniteSet {
    List<Integer> l=new ArrayList<>();
    public SmallestInfiniteSet() {
       for (int i = 1; i <= 1000; i++) {
            l.add(i);
        }
    }
    
    public int popSmallest() {
        return l.remove(0);
    
    }
    
    public void addBack(int num) {
       if(!l.contains(num))
       {
           l.add(num);
           Collections.sort(l);
       }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */