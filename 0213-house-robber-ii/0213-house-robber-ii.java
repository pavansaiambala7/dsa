class Solution {
    public int rob(int[] nums) {
       int n= nums.length;
       if(n==1)return nums[0];
       if(n==2)return Math.max(nums[0],nums[1]); 
       return Math.max(ans(nums,0,n-2),ans(nums,1,n-1));
    }int ans(int []nums,int l,int r){
       int prev=0;
       int prev2=0;
        for(int i=l;i<=r;i++){
            int cur=Math.max(prev,prev2+nums[i]);
            prev2=prev;
            prev= cur;
        }
        return prev;
    }
}