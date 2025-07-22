class Solution {
    public boolean checkIfPangram(String sentence) {
        int[]nums = new int[26];
        // char[] n = sentence.toCharArray();
        for(int i=0;i<sentence.length();i++){
            char a = sentence.charAt(i);
            nums[a - 'a']++;

        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return false;
            }
        }
        return true;
        
    }
}