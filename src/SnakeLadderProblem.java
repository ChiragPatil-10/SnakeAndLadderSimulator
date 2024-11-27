import java.util.Random;

public class SnakeLadderProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake Ladder Simulator");

        int start_position = 0;
        System.out.println("Player Start at position: " + start_position);

        Random random = new Random();
        int dieRoll = random.nextInt(6) + 1;
        System.out.println("The Player rolled: " + dieRoll);

        int option = random.nextInt(3);

        switch (option) {
            case 0:
                System.out.println("Option: No Play. Player stays at postion: " + start_position);
                break;

            case 1:
                start_position += dieRoll;
                System.out.println("Option: Ladder!!. Player climbs up to position: " + start_position);
                break;

            case 2:
                start_position -= dieRoll;
                if (start_position < 0) {
                    start_position = 0;
                }
                System.out.println("Option: Snake! Player slides down to position: " + start_position);
                break;

            default:
                System.out.println("Invalid option!");
        }
    }
}






