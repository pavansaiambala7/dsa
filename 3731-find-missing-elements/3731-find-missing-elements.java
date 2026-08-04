class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n= nums.length;
        List<Integer>list= new ArrayList<>();
        Arrays.sort(nums);
        int ans=0;
        int max=nums[n-1];
        for(int i=nums[0];i<=max;i++){
            if(i==nums[ans])ans++;
            else{list.add(i);
                
            }
        }
         
     return list;
    }
}