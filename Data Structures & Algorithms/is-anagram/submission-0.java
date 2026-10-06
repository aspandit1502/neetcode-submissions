class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
 
    

    HashMap<Character,Integer> ledger= new HashMap<>();

    for(int i=0;i<s.length();i++)
    {
        char cv= s.charAt(i);
        ledger.put(cv,ledger.getOrDefault(cv,0)+1);
    }

    
    for(int i=0;i<s.length();i++)
    {
        char cvs= t.charAt(i);
        ledger.put(cvs,ledger.getOrDefault(cvs,0)-1);
    }

    {
        for(int count: ledger.values())
        if(count!=0)
        {
            return false;
        }
    }
    
     return true;
    }
}
