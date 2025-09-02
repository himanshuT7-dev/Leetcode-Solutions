class Solution {

    /**
     * @param Integer[] $nums
     * @return Integer[]
     */
    function getConcatenation($nums) {
        $n = count($nums);
        $ans = $nums;

        for($i=0;$i<$n;$i++)
        {
            $ans[] = $nums[$i];
        }
        return $ans;
    }
}