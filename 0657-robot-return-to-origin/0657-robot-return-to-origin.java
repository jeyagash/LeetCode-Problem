class Solution {
    public boolean judgeCircle(String moves) {
        int h = 0;
        int v = 0;
        for (int robot : moves.toCharArray()) {
            if (robot == 'U') v++;
            else if (robot=='D') v--;
            else if (robot=='L') h--;
            else if(robot=='R')h++;
        }
        return h==0 && v==0;
    }
}