public class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int n = nums.length;
        long sum = (n *(n+1))/2;
        int duplicate = -1;
        for(int i:nums)
        {
            if(set.contains(i)) duplicate = i;
            sum-=i;
            set.add(i);
        }
        return new int[] {duplicate,(int)sum + duplicate};
    }
}