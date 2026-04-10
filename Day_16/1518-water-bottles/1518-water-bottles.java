class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles=numBottles;
        while(numBottles>=numExchange)
        {
            int newBottle=numBottles/numExchange;
            totalBottles+=newBottle;
            numBottles=newBottle+(numBottles%numExchange);
        }
        return totalBottles;
    }
}