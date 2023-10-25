public class Player {

    private String name;
    private int score;
    private boolean loser;
    private int winstreak;

    public Player(String name) {
        this.name = name;
        score = 0;
        loser = false;
        winstreak = 0;
    }

    public int getScore() {
        return score;
    }
    public int getWinstreak() { return winstreak; }

    public String getName() {
        return name;
    }
    public boolean getLost() {return loser; }
    public void incrimentWinstreak() { winstreak++; }

    public void incrementScore() {
        score++;
    }

    public void reset() {
        score = 0;
        loser = false;
    }

    public void lose() {
        loser = true;
        winstreak = 0;
    }
}