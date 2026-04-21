public class UC1 {

    // Declare 3x3 board
    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // Initialize board with '-'
        initializeBoard();

        // Print the board
        printBoard();
    }

    // Method to initialize board
    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    // Method to print board in required format
    static void printBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println(); // next line after each row
        }
    }
}
