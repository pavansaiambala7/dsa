class Solution {
public:
vector<vector<string>>dp;
    vector<vector<string>> partition(string s) {
        int n= s.size();
        vector<string>path;
        solve(s,0,path);
        return dp;
    }
    void solve(string &s, int i,vector<string>&path){
        if(i==s.size()) {
            dp.push_back(path);
            return;}
        for(int k=i;k<s.size();k++){
            if(ispalin(s,i,k)){
                path.push_back(s.substr(i,k-i+1));
                solve(s,k+1,path);
                path.pop_back();
            }
        }

    }bool ispalin(string &s,int i, int j){
        while(i<=j){
            if(s[i]!=s[j])return false;
            i++,j--;
        }
        return true;
    }
};