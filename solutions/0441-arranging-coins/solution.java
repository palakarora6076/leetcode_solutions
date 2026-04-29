class Solution {
    public int arrangeCoins(int n) {
        int low = 1;
        int high = 65535;
        int ans = 65536; // something just outside range

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long coins = (long) mid * (mid + 1) / 2;

            if (coins > n) {
                ans = mid;        // possible first greater
                high = mid - 1;   // try smaller
            } else {
                low = mid + 1;    // need bigger
            }
        }

        return ans - 1;
    }
}
