class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;

        int rowstart = 0;
        int rowend = matrix.length - 1;
        int colstart = 0;
        int colend = matrix[0].length - 1;

        while (rowstart <= rowend && colstart <= colend) {
            // Forward (left → right)
            for (int i = colstart; i <= colend; i++) {
                result.add(matrix[rowstart][i]);
            }
            rowstart++;

            // Downward (top → bottom)
            for (int i = rowstart; i <= rowend; i++) {
                result.add(matrix[i][colend]);
            }
            colend--;

            // Backward (right → left)
            if (rowstart <= rowend) {
                for (int i = colend; i >= colstart; i--) {
                    result.add(matrix[rowend][i]);
                }
                rowend--;
            }

            // Upward (bottom → top)
            if (colstart <= colend) {
                for (int i = rowend; i >= rowstart; i--) {
                    result.add(matrix[i][colstart]);
                }
                colstart++;
            }
        }

        return result;
    }
}

