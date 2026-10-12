class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> hm = new HashMap<>();

        for(int i = 0;i < n; i++)
        {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            if(hm.containsKey(key))
                hm.get(key).add(strs[i]);
            else
            {
                ArrayList<String> ar = new ArrayList<>();
                ar.add(strs[i]);
                hm.put(key,ar);
            }
        }
        return new ArrayList<>(hm.values());
    }
}