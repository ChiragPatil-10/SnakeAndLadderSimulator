import java.util.Random;

public class SnakeLadderProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake Ladder Simulator");

        int start_position = 0;
        int winningPosition = 100;
        System.out.println("Player Start at position: " + start_position);

        Random random = new Random();
        while (start_position < winningPosition) {
            int dieRoll = random.nextInt(6) + 1;
            System.out.println("The Player rolled: " + dieRoll);

            int option = random.nextInt(3);

            switch (option) {
                case 0:
                    System.out.println("Option: No Play. Player stays at position: " + start_position);
                    break;

                case 1:
                    start_position += dieRoll;
                    if (start_position > winningPosition) {
                        start_position -= dieRoll;
                        System.out.println("Move exceeds winning position. Stay at position: " + start_position);
                    } else {
                        System.out.println("Option: Ladder!!. Player climbs up to position: " + start_position);
                    }
                    break;

                case 2:
                    start_position -= dieRoll;
                    if (start_position < 0) {
                        start_position = 0;
                    }
                    System.out.println("Option: Snake! Player slides down to position: " + start_position);
                    break;
        }

            System.out.println("Current Position: " + start_position);
        }
        System.out.println("Congratulations!! The player has reached the winning position. " + winningPosition);
    }

}






