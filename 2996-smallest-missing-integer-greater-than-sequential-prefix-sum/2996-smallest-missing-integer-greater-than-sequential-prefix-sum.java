class Solution {
    public int missingInteger(int[] nums) {
        int n= nums.length;
       
        int sum=nums[0];
        for( int i=1; i<n;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }else{
                break;
            }
        }HashSet<Integer>ans=new HashSet<>();
        for(int num :nums)ans.add(num);
    while(ans.contains(sum))sum++;
    return sum;
    }
}