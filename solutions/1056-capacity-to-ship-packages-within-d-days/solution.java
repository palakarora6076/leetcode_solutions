class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for (int w : weights) {
            low = Math.max(low, w);  // must carry at least the heaviest package
            high += w;               // worst case: carry everything in one day
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int daysNeeded = 1, cap = 0;

            // Inline day counting (avoids method call overhead)
            for (int w : weights) {
                if (cap + w > mid) {
                    daysNeeded++;
                    cap = 0;
                }
                cap += w;
            }

            if (daysNeeded <= days) {
                high = mid - 1;  // try smaller capacity
            } else {
                low = mid + 1;   // need larger capacity
            }
        }

        return low;  // after binary search, low is the minimum feasible capacity
    }
}

