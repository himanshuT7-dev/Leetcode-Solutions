class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int output = 0;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
                map.put(nums[i],1);
        }
        for(int i : map.values())
        {
            output += i*(i-1)/2;
        }
        return output;
    }
}