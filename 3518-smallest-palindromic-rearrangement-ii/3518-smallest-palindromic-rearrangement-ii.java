class Solution {
    public String smallestPalindrome(String s, int k) {
        StringBuilder half =new StringBuilder();
        char mid='#';
        int[]freq=new int[26];
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }for(int i=0;i<26;i++){
            for(int j=0;j<freq[i]/2;j++){
                half.append((char)('a'+i));
            }if(freq[i]%2==1){
                mid=(char)('a'+i);
            }}
            for( int i=0;i<26;i++){
                freq[i]=freq[i]/2;}
                 long total = countPermutations(freq);
        if (k > total) return ""; 
            StringBuilder left= new StringBuilder();
            for(int pos=0;pos<half.length();pos++){
            for(int i=0;i<26;i++){
                if(freq[i]==0)continue;
                freq[i]--;
                long count=countPermutations(freq);
                if(count>=k){
                    left.append((char)('a'+i));
                    break;
                }else{
                    k-=count;
                    freq[i]++;
                }
            }}
String right=new StringBuilder(left).reverse().toString();
if(mid=='#'){
    return left.toString()+right;
}else{
    return left.toString()+mid+right;
}
    }
        
    
   private long countPermutations(int[] freq) {
        int total = 0;
        for (int f : freq) total += f;
        long result = 1;
        int used = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) continue;
            for (int j = 1; j <= freq[i]; j++) {
                used++;
                result = result * used / j;
                if (result > (long) 1e13) return (long) 1e13;
            }
        }
        return result;
    } private long factorial(int n) {
        if (n <= 1) return 1;
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
            if (res > (long) 1e13) return (long) 1e13;
        }
        return res;
    }}