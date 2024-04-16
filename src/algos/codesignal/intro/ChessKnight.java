package algos.codesignal.intro;

public class ChessKnight {

    public static void main(String[] args) {
        System.out.println(solution("d5"));
    }

    static int solution(String str) {
        int col = str.charAt(0) - 'a';
        int row = Character.getNumericValue(str.charAt(1)) - 1;
        return canMove(row, col);
    }

    static int canMove(int row, int col) {
        int counter = 0;
        int len = 8;
        for (int r = 0; r < len; r++) {
            for (int c = 0; c < len; c++) {
                if ((row - 2 == r && col - 1 == c)
                    || (row - 1 == r && col - 2 == c)
                    || (row - 2 == r && col + 1 == c)
                    || (row - 1 == r && col + 2 == c)
                    || (row + 1 == r && col + 2 == c)
                    || (row + 2 == r && col + 1 == c)
                    || (row + 2 == r && col - 1 == c)
                    || (row + 1 == r && col - 2 == c))
                    counter++;

            }
        }
        return counter;
    }
}
