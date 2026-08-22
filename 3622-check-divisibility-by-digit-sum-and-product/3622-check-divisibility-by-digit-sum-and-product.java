class Solution {
    public boolean checkDivisibility(int n) 
    {
     int sum=0;
     int pro=1;
     int temp=n;

     while(n!=0){
        int last=n%10;
        sum+=last;
        pro*=last;
        n/=10;
     }
     if(temp%(sum+pro)==0){
        return true;
     }else{
        return false;
     }   
    }
}