public class Main {

    public static void main(String[] args) {
        /*
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
*/

        Game two = new Game();

        two.play(1, true, 200);
        two.play(2, true, 100);
        two.play(3, false, 500);
        System.out.println(two.getScore());

        Game three = new Game();

        three.play(1, true, 200);
        three.play(2, false, 100);
        three.play(3, true, 500);
        three.isBonus();
        System.out.println(three.getScore());

        Game four = new Game();

        four.play(1, false, 200);
        four.play(2, false, 100);
        four.play(3, false, 500);
        System.out.println(four.getScore());




    }
}
