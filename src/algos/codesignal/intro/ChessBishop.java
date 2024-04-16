package algos.codesignal.intro;

public class ChessBishop {
    public static void main(String[] args) {
        String bishop1 = "d3";
        String pawn1 = "a6";
        System.out.println("Can the bishop capture the pawn? " + solution(bishop1, pawn1)); // Output: true

        String bishop2 = "h1";
        String pawn2 = "h3";
        System.out.println("Can the bishop capture the pawn? " + solution(bishop2, pawn2)); // Output: false
    }

    public static boolean solution(String bishop, String pawn) {
        int bishopRow = bishop.charAt(1) - '0'; // '0' = 48 '1' = 49
        int bishopCol = bishop.charAt(0) - 'a' + 1; // 'a' = 97

        int pawnRow = pawn.charAt(1) - '0';
        int pawnCol = pawn.charAt(0) - 'a' + 1;

        // Check if the absolute difference in row and column positions is the same for bishop and pawn
        return Math.abs(bishopRow - pawnRow) == Math.abs(bishopCol - pawnCol);
    }
}
