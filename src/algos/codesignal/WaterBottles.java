package algos.codesignal;

public class WaterBottles {

    public static void main(String[] args) {
        maxBottlesDrunk(20, 1);
    }


    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunk = numBottles;
        int emptyBottles = numBottles;
        numBottles = 0;
        while ((emptyBottles + numBottles) >= numExchange) {
            if (emptyBottles < numExchange) {
                emptyBottles += numBottles;
                drunk += numBottles;
                numBottles = 0;
            }
            emptyBottles -= numExchange;
            numBottles++;
            numExchange++;
        }

        return drunk + numBottles;
    }

}
