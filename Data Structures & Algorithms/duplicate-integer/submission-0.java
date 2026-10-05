class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> ledger= new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            int cv= nums[i];
            if(ledger.contains(cv))
            {
                return true;
            }
            else
            {
                ledger.add(cv);   

            }
        }
                        return false;

    }
}