class Solution {
    public int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int x : nums) {
                if (x <= mid) count++;
            }
            if (count > mid) {
                high = mid;       // duplicate in [low, mid]
            } else {
                low = mid + 1;    // duplicate in [mid+1, high]
            }
        }
        return low;
    }
}
