class Solution {
public:
    int change(int amount, vector<int>& coins) {
         int n =coins.size();
         int m=amount;
        vector<vector<unsigned int>>dp(n,vector<unsigned int>(m+1,0));
        for( int t =0;t<m+1;t++){
        dp[0][t]= (t% coins[0]==0);
        } 
          for( int i=1;i<n;i++){
            for( int j=0;j<=amount;j++){

            unsigned int nottake=dp[i-1][j];
            unsigned int take=0;
            if(coins[i]<=j){
                take=dp[i][j-coins[i]];
            }
            dp[i][j]=take+nottake;
            }
        }
        return dp[n-1][m];
    }
};