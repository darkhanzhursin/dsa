package codesignal.intro;

public class ChessBoardCellColor {
    public static boolean solution(String cell1, String cell2) {
        // Extracting the row and column numbers from the cell strings
        int row1 = cell1.charAt(1) - '0';
        int col1 = cell1.charAt(0) - 'A' + 1;
        int row2 = cell2.charAt(1) - '0';
        int col2 = cell2.charAt(0) - 'A' + 1;

        // Calculating whether the cells have the same color
        return (row1 + col1) % 2 == (row2 + col2) % 2;
    }

    public static void main(String[] args) {
        String cell1 = "A1";
        String cell2 = "C2";
        System.out.println(solution(cell1, cell2));  // Output: true
    }
}
