class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
            map.put(s.charAt(i),1);
        }
        int ans=0;
        int flag=0;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            int t=entry.getValue();
            ans+=(t/2)*2;
            if(flag==0&&t%2==1){
                ans+=1;
                flag=1;
            }
        }
        return ans;
    }
}