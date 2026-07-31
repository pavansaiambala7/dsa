class Solution {
    public int minimumPushes(String word) {
        int []freq=new int[26];
      int n = word.length();
      int ans=0;
      for(char c : word.toCharArray()){
        freq[c - 'a']++;
      }
      Arrays.sort(freq);
      int rank=0;
      for( int i=25;i>=0;i--){
        if(freq[i]==0)break;
        ans+=freq[i]*((rank/8)+1);
        rank++;
        
      }

      return ans;  
    }
}