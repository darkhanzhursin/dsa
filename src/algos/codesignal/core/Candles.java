package algos.codesignal.core;

public class Candles {
    public static void main(String[] args) {
        System.out.println(solution(12, 2));
    }

    static int solution(int candlesNumber, int makeNew) {
        int totalBurned = 0;
        int leftovers = 0;
        while (candlesNumber > 0) {
            totalBurned += candlesNumber;
            leftovers += candlesNumber;
            candlesNumber = leftovers / makeNew;
            leftovers = leftovers % makeNew;
        }
        return totalBurned;
    }
}

// 12 + 6 + 3 + 1 + 1
// 12 / 2 = 6
// 6 / 2 = 3
// 3 / 2 = 1 | 1

// 5 + 2 + 1
// 5 / 2 = 2 | 1
// 2 / 2 = 1

// 13 + 2 + 1
// 13 / 5 = 2 |3
// (2 + 3) / 5 = 1
