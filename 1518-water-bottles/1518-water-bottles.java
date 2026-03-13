class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int temp=numBottles;
        while(numBottles>=numExchange)
        {
            int newB = numBottles / numExchange;
            int rem = numBottles % numExchange;

            temp += newB;

            numBottles = newB + rem;
        }
        return temp;
    }
}