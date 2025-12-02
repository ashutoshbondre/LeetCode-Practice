
class Solution {
    static int mod = 1000000000 + 7;

    public int countTrapezoids(int[][] points) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] arr : points) {
            int y = arr[1];
            map.put(y, map.getOrDefault(y, 0) + 1);
        }

        long total = 0;
        long cnt = 0;

        for (int val : map.values()) {
            if (val < 2) continue;
            long ways = (long) val * (val - 1) / 2;
            total = (total + cnt * ways) % mod;
            cnt = (cnt + ways) % mod;
        }

        return (int) total;
    }
}