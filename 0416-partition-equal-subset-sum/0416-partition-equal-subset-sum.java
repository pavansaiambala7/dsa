class Solution {
    public boolean canPartition(int[] nums) {
     int totalsum=0;
     int n=nums.length;
     for( int i=0;i<nums.length;i++)totalsum+=nums[i];
     if(totalsum%2==1)return false;
     boolean [][] t= new boolean[n+1][(totalsum/2)+1];
     for( int i=0;i<n+1;i++)t[i][0]=true;
    
    for( int i=1;i<n;i++){
        for( int j=1;j<=totalsum/2;j++){
            if(nums[i-1]<=j){
                t[i][j]=t[i-1][j-nums[i-1]]||t[i-1][j];
            }else{
                t[i][j]=t[i-1][j];
            }
        }
    }
    return t[n-1][totalsum/2];
    }
}