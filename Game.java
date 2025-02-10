public class Game {

    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private int score;
    private boolean bonus;

    public Game() {
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();
    }

    public Level getLevel(int level) {
        if(level == 1) return levelOne;
        if(level == 2) return levelTwo;
        if(level == 3) return levelThree;
        return null;
    }

    public void isBonus() {
        bonus = true;
    }

    public void play(int lev, boolean gol, int poin) {
        getLevel(lev).setGoal(poin);
        if(gol == true) {
            getLevel(lev).reachGoal();
            System.out.println("Goal Reached");
            System.out.println("Points: " + poin);
        } else {
            System.out.println("Goal Failed");
        }

        System.out.println("Level: " + lev);
    }

    public int getScore() {
        //System.out.println(levelOne.getPoints());
        if(levelOne.goalReached() == true) score += levelOne.getPoints();
        if(levelOne.goalReached() == true && levelTwo.goalReached() == true) score += levelTwo.getPoints();
        if(levelTwo.goalReached() == true && levelThree.goalReached() == true) score += levelThree.getPoints();
        if(bonus == true) score *= 3;
        return score;
    }

    //public int playMany() {}
}
