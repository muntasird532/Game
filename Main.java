public class Main {

    public static void main(String[] args) {
        Game one = new Game();
        one.getLevel(1).setGoal(200);
        System.out.println(one.getLevel(1).getPoints());
        one.getLevel(1).reachGoal();
        System.out.println(one.getLevel(1).getPoints());

        one.getLevel(2).setGoal(100);
        System.out.println(one.getLevel(2).getPoints());
        one.getLevel(2).reachGoal();
        System.out.println(one.getLevel(2).getPoints());

        one.getLevel(3).setGoal(500);
        System.out.println(one.getLevel(3).getPoints());
        one.getLevel(3).reachGoal();
        System.out.println(one.getLevel(3).getPoints());

        System.out.println(one.getLevel(1).goalReached());
        System.out.println(one.getLevel(2).goalReached());
        System.out.println(one.getLevel(3).goalReached());

        //one.isBonus();
        System.out.println(one.getScore());

        Game two = new Game();

        two.play(1, true, 300);
        System.out.println(two.getLevel(1).getPoints());
    }
}
