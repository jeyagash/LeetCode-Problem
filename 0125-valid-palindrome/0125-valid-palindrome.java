class Solution {
    public boolean isPalindrome(String s) {
        boolean bool=false;
        String b=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       
        String a="";
        for(int i=b.length()-1;i>=0;i--){
            a+=b.charAt(i);
        }
        if(a.equals(b)){
            bool=true;
        }
        else{
            bool=false;
        }
        return bool;
    }
}