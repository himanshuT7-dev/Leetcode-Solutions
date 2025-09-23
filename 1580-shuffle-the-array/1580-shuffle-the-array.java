class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[2*n];
        int j=n;
        int k=0;
        for(int i=0;i<n*2;i++)
        {
            if(i%2!=0)
            {
                result[i]=nums[j];
                j++;
            }
            else
            {
                result[i]=nums[k];
                k++;
            }
        }
        return result;
    }
}