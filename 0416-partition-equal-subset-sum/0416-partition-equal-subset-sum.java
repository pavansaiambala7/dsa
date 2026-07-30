class Solution {
    public boolean canPartition(int[] nums) {
     int totalsum=0;
     int n=nums.length;
     for( int i=0;i<nums.length;i++)totalsum+=nums[i];
     if(totalsum%2==1)return false;
     boolean[] t= new boolean[(totalsum/2)+1];
    t[0]=true;
    
    for( int i=0;i<n;i++){
        for( int j=totalsum/2;j>=nums[i];j--){

                t[j]=t[j-nums[i]]||t[j];
            
                t[j]=t[j];
            }
        }
    
    return t[totalsum/2];
    }
}