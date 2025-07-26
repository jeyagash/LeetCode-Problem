import java.util.Arrays;

public class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            mat = rotate90(mat);
        }
        return false;
    }

    private int[][] rotate90(int[][] m) {
        int n = m.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n - 1 - i] = m[i][j];
            }
        }
        return res;
    }
}
