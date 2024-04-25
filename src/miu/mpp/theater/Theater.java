package miu.mpp.theater;

import java.util.ArrayList;
import java.util.List;

public class Theater {

    private int rows;
    private int columns;
    List<Person> customers;
    String[][] spacesArr;
    private int emptySpaces;
    private int reservedSpaces;

    private final String empty = "empty";
    private final String reserved = "reserved";

    public Theater(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.customers = new ArrayList<>();
        this.spacesArr = new String[rows][columns];
        init(spacesArr);
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void showAllEmptySeats() {
        emptySpaces = util(empty);
        if (emptySpaces == 0) System.out.println("Unfortunately, there is no empty seat...");
        else System.out.printf("There are %d seats available", emptySpaces);
    }

    public void showAllReservedSeats() {
        reservedSpaces = util(reserved);
        if (reservedSpaces == 0) System.out.println("There are no reserved seats.");
        else System.out.printf("%d reserved seat(s)");
    }

    private void init(String[][] seats) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = empty;
            }
        }
    }

    private int util(String type) {
        int counter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (spacesArr[i][j].equals(type)) {
                    counter++;
                    System.out.printf("%s ", spacesArr[i][j]);
                }
            }
            System.out.println();
        }
        return counter;
    }

    public int getEmptySpaces() {
        return emptySpaces;
    }
}
