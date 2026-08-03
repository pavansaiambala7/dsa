class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        int [] dp=new int[n+1];
        dp[0]=0;
        for(int i=n-1;i>=0;i--){
            dp[i]=Integer.MIN_VALUE;
            int sum=0;
            for(int k=1;k<=3;k++){
                if(i+k-1<n){
                    sum+=stoneValue[i+k-1];
                    int score=sum-dp[i+k];
                    dp[i]=Math.max(score,dp[i]);

                }
            }
        }
        if(dp[0]>0)return "Alice";
        else if(dp[0]<0)return "Bob";
        else{
            return "Tie";
        }
        
    }
}