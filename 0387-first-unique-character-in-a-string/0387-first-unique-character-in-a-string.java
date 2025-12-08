class Solution {
    public int firstUniqChar(String s) {
        int index = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()==1)
            {
                int x = s.indexOf(e.getKey());
                if(x<index)
                {
                    index=x;
                }
            }
        }
        if(index==s.length())
        {
            return -1;
        }

        return index;
    }
}