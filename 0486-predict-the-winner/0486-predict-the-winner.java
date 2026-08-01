class Solution {
    int [][]dp;
    public boolean predictTheWinner(int[] nums) {
         int n= nums.length;
        dp=new int[n][n];
        for( int[]rows:dp)Arrays.fill(rows,Integer.MIN_VALUE);
        return ans(nums,0,n-1)>=0;
        
    
    }int ans(int [] nums,int i, int j){
        if(i==j)return nums[i];
        if(dp[i][j]!=Integer.MIN_VALUE)return dp[i][j];
        int left=nums[i]-ans(nums,i+1,j);
        int right= nums[j]-ans(nums,i,j-1);
    dp[i][j]=Math.max(left,right);
return dp[i][j];
    }
}