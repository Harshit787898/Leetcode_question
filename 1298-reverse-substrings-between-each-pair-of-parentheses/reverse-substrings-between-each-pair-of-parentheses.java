class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')'){
                StringBuilder ans=new StringBuilder();
                while(!st.isEmpty()&&st.peek()!='('){
                    ans.append(st.pop());

                }
                if(!st.isEmpty()&&st.peek()=='('){
                    st.pop();
                }
                for(char c:ans.toString().toCharArray()){
                    st.push(c);
                }
            }else{
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}