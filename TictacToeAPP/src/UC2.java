import java.util.Random;

    public class UC2 {

        static char player1Symbol;
        static char player2Symbol;
        static char currentPlayerSymbol;

        public static void main(String[] args) {
            toss();
        }

        static void toss() {
            Random rand = new Random();
            int result = rand.nextInt(2); // 0 or 1

            if (result == 0) {
                player1Symbol = 'X';
                player2Symbol = 'O';
                currentPlayerSymbol = player1Symbol;

                System.out.println("Player 1 won the toss and will start!");
            } else {
                player1Symbol = 'O';
                player2Symbol = 'X';
                currentPlayerSymbol = player2Symbol;

                System.out.println("Player 2 won the toss and will start!");
            }

            System.out.println("Player 1 Symbol: " + player1Symbol);
            System.out.println("Player 2 Symbol: " + player2Symbol);
        }
    }


