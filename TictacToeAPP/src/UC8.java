/**
 * TicTacToe
 * UC8 controls the continuous game loop and alternates
 * turns until the game ends.
 */
public class UC8 {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    /**
     * Entry point of the program. Demonstrates the structure
     * of a continuous game loop.
     */
    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human Player Turn");
            } else {
                System.out.println("Computer Player Turn");
            }

            // Simulated condition to stop the loop
            gameOver = true;

            // Switch turns
            isHumanTurn = !isHumanTurn;
        }

        System.out.println("Game Over");
    }
}
