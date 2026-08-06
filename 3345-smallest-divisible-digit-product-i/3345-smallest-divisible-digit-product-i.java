class Solution {
    int digit=0;
    public int smallestNumber(int n, int t) {
        int sum=1;
        int f=n;
     for(int i=f;i<=100;i++){
        sum=product(i);
        if(sum%t==0)return i;
    } 
    return -1;}  
    int product(int n){
        digit=1;
    while(n>0){
             digit*=n%10;
        n=n/10;
    }
       return digit;}
}