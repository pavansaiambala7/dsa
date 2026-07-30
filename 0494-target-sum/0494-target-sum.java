class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
         int totalsum=0;
         for( int i=0; i< n;i++)totalsum+=nums[i];
         if(Math.abs(target)>totalsum)return 0;
         if((totalsum+target)%2!=0)return 0;
         int fin =(totalsum+target)/2;
        int [][]dp=new int[n+1][fin+1];
        for( int i=0; i<n+1;i++)dp[i][0]=1;
        for( int i=1; i<=n;i++){
            for( int j=0;j<=fin;j++){
                if(nums[i-1]<=j){
                    dp[i][j]=dp[i-1][j-nums[i-1]]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][fin];
    }
}