public class Level {

    private boolean goalComp;
    private int points;
    private int goal;

    public boolean goalReached() {
        return goalComp;
    }

    public int getPoints() {
        return points;
    }

    public void setGoal(int a) {
        goal = a;
    }

    public void reachGoal() {
        goalComp = true;
        points += goal;
    }

}
