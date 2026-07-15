class Solution {
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        long low = 1;
        long high = (long)Math.max(divisor1, divisor2) * (uniqueCnt1 + uniqueCnt2);
        
        long lcm = lcm(divisor1, divisor2);

        while (low < high) {
            long mid = low + (high - low) / 2;

            // Count numbers not divisible by divisor1
            long cnt1 = mid - mid / divisor1;
            // Count numbers not divisible by divisor2
            long cnt2 = mid - mid / divisor2;
            // Count numbers not divisible by either divisor (usable for both sets)
            long cntBoth = mid - mid / lcm;

            // Check if we can satisfy both requirements
            if (cnt1 >= uniqueCnt1 && cnt2 >= uniqueCnt2 && cntBoth >= uniqueCnt1 + uniqueCnt2) {
                high = mid; // try smaller
            } else {
                low = mid + 1; // need larger
            }
        }

        return (int)low;
    }

    // Helper to compute LCM
    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    // Helper to compute GCD
    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

