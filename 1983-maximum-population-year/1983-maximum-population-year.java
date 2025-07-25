class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year = new int[101]; 

        for (int[] log : logs) {
            year[log[0] - 1950]++;   
            year[log[1] - 1950]--;    
        }

        int maxYear = 0;
        int maxPop = 0;
        int currentPop = 0;

        for (int i = 0; i < 101; i++) {
            currentPop += year[i];
            if (currentPop > maxPop) {
                maxPop = currentPop;
                maxYear = i;
            }
        }

        return 1950 + maxYear;
    }
}
