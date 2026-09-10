class Solution {
public:
    bool canCross(vector<int>& stones) {
       unordered_map<int,unordered_set<int>> mp;
       for( int stone: stones){
        mp[stone]=unordered_set<int>();}
        mp[stones[0]].insert(0);
        for( int stone : stones){
            for( int k:mp[stone]){
                for( int jump :{k-1,k,k+1}){
                    if(jump>0 && mp.find(stone+jump)!=mp.end()){
                        mp[stone+jump].insert(jump);
                    }
                }
            }
        }

       return !mp[stones.back()].empty();
    }
};