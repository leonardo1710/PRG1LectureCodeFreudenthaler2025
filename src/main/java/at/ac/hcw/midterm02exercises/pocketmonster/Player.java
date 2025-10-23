package at.ac.hcw.midterm02exercises.pocketmonster;

public class Player {
    private String name;
    private final int BELT_SIZE;
    private Ball[] ballBelt;

    public Player(String name) {
        this.name = name;
        this.BELT_SIZE = 10;

        this.ballBelt = new Ball[BELT_SIZE];

        for (int i = 0; i < BELT_SIZE; i++) {
            ballBelt[i] = new Ball(i + "");
        }
    }

    public Ball getNext(){
        for (int i = 0; i < ballBelt.length; i++) {
            if(ballBelt[i] != null){
                Ball b = new Ball(ballBelt[i].getLabel());
                ballBelt[i] = null;
                return b;
            }
        }
        return null;
    }
}
