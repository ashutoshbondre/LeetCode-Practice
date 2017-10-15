class Solution {
    public int maxA(int N) {
    
        int [] dp = new int[N+1];
        for(int i=1;i<=N;i++)
        {
            dp[i]=i;
            for(int j=1;j<=i-3;j++)
            {
                dp[i] = Math.max(dp[i],dp[j]*(i-j-1));
            }
        }
        return dp[N];
}
}

/*
    public int maxA(int N) {
        int max = N ;
        for(int i = 1;i<=N-3;i++)
        {
            max = Math.max(max,maxA(i)*(N-i-1));
        }
        return max;
    }
    
/*