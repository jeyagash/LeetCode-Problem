class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ans;

        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;

        while (r1 <= r2 && c1 <= c2) {
            
            for (int i = c1; i <= c2; i++) {
                ans.add(matrix[r1][i]);
            }
            r1++;

            for (int i = r1; i <= r2; i++) {
                ans.add(matrix[i][c2]);
            }
            c2--;

            if (r1 <= r2) {
                for (int i = c2; i >= c1; i--) {
                    ans.add(matrix[r2][i]);
                }
                r2--;
            }

            if (c1 <= c2) {
                for (int i = r2; i >= r1; i--) {
                    ans.add(matrix[i][c1]);
                }
                c1++;
            }
        }

        return ans;
    }
}
