package at.ac.hcw.midterm02exercises.pocketmonster;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Player player1 = new Player("Ash");
        Player player2 = new Player("Anton");

        PocketMonster pm1 = new PocketMonster(100, 3, "Julius", 95);
        PocketMonster pm2 = new PocketMonster(100, 3, "Pikachu", 23);
        PocketMonster pm3 = new PocketMonster(100, 3, "Glumanda", 50);
        PocketMonster pm4 = new PocketMonster(100, 3, "Roberta", 74);
        PocketMonster pm5 = new PocketMonster(100, 3, "Garfield", 10);

        PocketMonster[] monstersForGame = new PocketMonster[5];
        monstersForGame[0] = pm1;
        monstersForGame[1] = pm2;
        monstersForGame[2] = pm3;
        monstersForGame[3] = pm4;
        monstersForGame[4] = pm5;


        Game game = new Game(player1, player2, monstersForGame);

        PocketMonster pm = game.spawn();
        System.out.println("a wild " + pm.getName() + " appeared.");

        Ball next = player1.getNext();
        Ball next2 = player2.getNext();

        if(next != null){
            boolean success = game.throwBallAt(next, pm);
            System.out.println("Catch??? " + success);
        } else {
            System.out.println("Game over, no balls left");
        }

        Scanner scanner = new Scanner(System.in);

        game.makeMove(monstersForGame, scanner);
    }
}
