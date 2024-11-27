import java.util.Random;

public class SnakeLadderProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake Ladder Simulator");

        int start_position = 0;
        System.out.println("Player Start at position: " + start_position);

        Random random = new Random();
        int dieRoll = random.nextInt(6) + 1;
        System.out.println("The Player rolled: " + dieRoll);

        start_position += dieRoll;
        System.out.println("Player moves to the Position: " + start_position);

    }
}

