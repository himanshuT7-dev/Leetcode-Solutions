class Solution {
    public String frequencySort(String s) {
        int arr[] = new int[128];

        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)]++;
        }

        StringBuilder ans = new StringBuilder();

        while(ans.length()<s.length())
        {
            int max = 0;
            int maxIndex = 0;

            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                    maxIndex=i;
                }
            }

            if(max==0)break;

            while(arr[maxIndex]>0)
            {
                ans.append((char) maxIndex);
                arr[maxIndex]--;
            }
        }
        return ans.toString();
    }
}