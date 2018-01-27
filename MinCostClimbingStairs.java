class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] ans = new int[cost.length];
        ans[0]=cost[0];
        ans[1]=cost[1];
        for(int i=2;i<cost.length;i++)
        {
            ans[i] = Math.min(ans[i-1]+cost[i], ans[i-2]+cost[i]);
        }
        return Math.min(ans[cost.length-2],ans[cost.length-1]);
    }
}