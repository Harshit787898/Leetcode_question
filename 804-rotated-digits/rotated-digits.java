class Solution {
    public int getMirrot(int d){
        switch(d){
            case 0:return 0;
            case 1:return 1;
            case 8:return 8;
            case 2:return 5;
            case 5:return 2;
            case 6:return 9;
            case 9:return 6;
        }
        return 0;
    }
    public boolean isValid(int n){
        int num=0;
        int t=n;
        boolean flag=false;
        while(n!=0){
            int d=n%10;
            if(d==3 || d==4 || d==7 ){
                return false;
            }
            int temp=getMirrot(d);
            if(temp!=d){
                flag=true;
            }
            num=num*10+temp;
            n=n/10;
        }
        return flag;
    }
    public int rotatedDigits(int n) {
        int ans=0;
        for(int i=2;i<=n;i++){
            if(isValid(i)){
                ans+=1;
            }
        }
        return ans;
    }
}