package miu.mpp.theater;

public class Theater {

    private Seat[][] seats;
    private double[][] seatPrices;
    private double salesTaxRate;

    public Theater(int rows, int columns, double salesTaxRate) {
        seats = new Seat[rows][columns];
        seatPrices = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = new Seat();
                if (i < 5) {
                    seatPrices[i][j] = 18.0;
                } else if (i < 12) {
                    seatPrices[i][j] = 15.0;
                } else {
                    seatPrices[i][j] = 12.0;
                }
            }
        }

        this.salesTaxRate = salesTaxRate;
    }

    public void showEmptySeats() {
        System.out.println("Empty Seats:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (!seats[i][j].isReserved()) {
                    System.out.println("Row " + (i + 1) + ", Seat " + (j + 1));
                }
            }
        }
    }

    public void showReservedSeats() {
        System.out.println("Reserved Seats: ");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j].isReserved()) {
                    System.out.println("Row " + (i + 1) + ", Seat " + (j + 1));
                }
            }
        }
    }

    public void reserveSeat(int row, int column) {
        if (!seats[row - 1][column - 1].isReserved()) {
            seats[row - 1][column - 1].reserve();
            System.out.println("Seat reserved successfully.");
        } else {
            System.out.println("Seat already reserved.");
        }
    }

    public void unreserveSeat(int row, int column) {
        if (seats[row - 1][column - 1].isReserved()) {
            seats[row - 1][column - 1].unreserve();
            System.out.println("Seat unreserved successfully.");
        } else {
            System.out.println("Seat is already empty.");
        }
    }

    public void emptyAllSeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j].unreserve();
            }
        }
        System.out.println("All seats emptied successfully.");
    }

    public void reserveAllSeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j].reserve();
            }
        }
        System.out.println("All seats reserved successfully.");
    }

    public double calculateTotalCost(int row, int column) {
        double seatPrice = seatPrices[row - 1][column - 1];
        double subtotal = seatPrice;
        double tax = subtotal * salesTaxRate;
        return subtotal + tax;
    }
}
