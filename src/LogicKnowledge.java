public class LogicKnowledge {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int small = 4;
        int large = 1;
        int goal = 9;

        System.out.println("Lottery winnings: " + greenTicket(a, b, c));
        System.out.println("Number of small bars needed: " + makeChocolate(small, large, goal));
    }

    public static int greenTicket(int a, int b, int c) {
        int result = 0;
        if (a == b && a == c) {
            return result = 20;
        } else if (a == b || a == c || c == b) {
            return result = 10;
        } else {
            return result;
        }
    }

    public static int makeChocolate(int small, int large, int goal) {
        int workingGoal = goal;
        while (large > 0 && (workingGoal - 5) > 0) {
            workingGoal = workingGoal - 5;
            large--;
        }
        if (workingGoal > small) {
            return -1;
        } else {
            return workingGoal;
        }
    }
}


