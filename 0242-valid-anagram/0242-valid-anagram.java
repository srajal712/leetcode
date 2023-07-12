class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        
        int[] frequency=new int[26];
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
            frequency[ch-'a']=frequency[ch-'a']+1;
        }
        int[] frequency1=new int[26];
        for(int i=0;i<t.length();i++)
        {
           char ch=t.charAt(i);
            frequency1[ch-'a']=frequency1[ch-'a']+1;
        }
        for(int i=0;i<frequency.length;i++)
        {
            if(frequency[i] != frequency1[i])
            {
                return false;
            }
        }
        return true;
    }
}