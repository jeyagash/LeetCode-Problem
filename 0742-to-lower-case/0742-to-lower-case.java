class Solution {
    public String toLowerCase(String s) {
        /*
        s=s.toLowerCase();
        return s;
    }
}
*/
char[] ch = s.toCharArray();
for(int i=0;i<ch.length;i++){
    if(ch[i]>='A'&&ch[i]<='Z'){
        ch[i]=(char)(ch[i]+32);
    }

}
return new String(ch);
}
}


