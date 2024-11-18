class Solution {
    public int sumg(int code[],int i,int k){
        int s=0;i=i+1;
        while(k>0){
            if(i>code.length-1){
                 i=0;
                  s+=code[i];
            }
            else{
                s+=code[i];
            }
            i+=1;
            k--;
        }
        return s;
    }
    public int suml(int code[],int i,int k){
       int s=0;i=i-1;
       while(k>0){
           if(i>=0&&i<code.length){
               s+=code[i];
           }
           else{
               i=code.length-1;
               s+=code[i];
           }
           i-=1;
           k-=1;
       }
       return s;
    }
    public int[] decrypt(int[] code, int k) {
        int ans[]=new int[code.length];
        if(k>0){
            for(int i=0;i<code.length;i++){
                ans[i]=sumg(code,i,k);
            }
            return ans;
        }
        else if(k<0){
            for(int i=0;i<code.length;i++){
                ans[i]=suml(code,i,k*(-1));
            }
            return ans;
        }
        return ans;
    }
}