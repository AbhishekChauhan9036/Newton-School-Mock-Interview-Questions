#include<bits/stdc++.h>
using namespace std;

long long numOfWays(int n, int m);

int main() {

    int T;
    cin >> T;
    while (T--) {
        int n, m;
        cin >> n >> m;
        cout << numOfWays(n, m) << endl;
    }
    return 0;
}


long long numOfWays(int N, int M)
{
    long long ans=0;
    long long k=N*M;
    int mod=1000000007;
    for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            int c=0;
            if(j+2<M&&i+1<N)
                 c++;
            if(j+2<M&&i-1>=0)
                 c++;
            if(i+2<N&&j+1<M)
                  c++;
            if(i+2<N&&j-1>=0)
                 c++;
             if(j-2>=0&&i+1<N)
                 c++;
            if(j-2>=0&&i-1>=0)
                 c++;
            if(i-2>=0&&j+1<M)
                  c++;
            if(i-2>=0&&j-1>=0)
                 c++;
            ans=((ans+k)%mod-(c+1)%mod+mod)%mod;
        }
    }
    return ans;
}