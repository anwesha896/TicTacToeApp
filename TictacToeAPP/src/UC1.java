public class UC1 {
        // 3x3 board declaration
        static char[][] board = new char[3][3];

        /**
         * Entry point of the program.
         * It initializes the board and prints the empty grid.
         */
        public static void main(String[] args) {
            initializeBoard();
            printBoard();
        }

        /**
         * Initializes the board by filling all cells with '-'
         */
        static void initializeBoard() {
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = '-';
                }
            }
        }

        /**
         * Prints the Tic-Tac-Toe board in grid format
         */
        static void printBoard() {
            System.out.println("Tic-Tac-Toe Board:");

            for (int row = 0; row < 3; row++) {
                System.out.print(" ");
                for (int col = 0; col < 3; col++) {
                    System.out.print(board[row][col]);

                    // Print vertical separator
                    if (col < 2) {
                        System.out.print(" | ");
                    }
                }
                System.out.println();

                // Print horizontal separator
                if (row < 2) {
                    System.out.println("-----------");
                }
            }
        }
    }
