package at.ac.hcw.midterm02exercises.pocketmonster;

public class PocketMonster {
    private int hp;
    private int level;
    private String name;
    private int catchDifficulty; // 0..100 -> the less the easier to catch

    public PocketMonster(int hp, int level, String name, int catchDifficulty) {
        this.hp = hp;
        this.level = level;
        this.name = name;
        this.catchDifficulty = catchDifficulty;
    }

    public int getCatchDifficulty(){
        return catchDifficulty;
    }

    public String getName(){
        return this.name;
    }
}
