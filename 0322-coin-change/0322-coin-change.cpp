class Solution {
public:
    int coinChange(vector<int>& coins, int amount) {
        if(amount==0)return 0;
        int n= coins.size();
        vector<vector< int>> dp(n+1,vector<int>(amount+1,amount+1));
        for(int i=0;i<n+1;i++)dp[i][0]=0;
        for( int i =1;i<=n;i++){
            for(int j=0;j<=amount;j++){
                int nottake=dp[i-1][j];
                int take=amount+1;
                if(coins[i-1]<=j){
                    take=(1+dp[i][j-coins[i-1]]);
                }dp[i][j]=min(nottake,take);
;                }
            }
        
        int ans=dp[n][amount];
        return (ans>amount)?-1:ans;
    }
};