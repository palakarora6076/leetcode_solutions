class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int low = 1, k = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            long hours = 0; // use long here

            for (int pile : piles) {
                hours += (pile + mid - 1) / mid; // ceiling division
            }

            if (hours <= h) {
                k = mid;
                high = mid - 1; // try smaller speed
            } else {
                low = mid + 1; // need faster speed
            }
        }
        return k;
    }
}

