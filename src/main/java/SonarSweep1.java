import java.util.ArrayList;
import java.util.Scanner;

public class SonarSweep1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String measurement = scanner.nextLine();
            if (!measurement.isEmpty()) {
                input.add(Integer.valueOf(measurement));
            } else {
                break;
            }
        }

        System.out.println(input);
        int numberOfTimes = 0;
        System.out.println(input.size());
        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i) < (input.get(i + 1))) {
                numberOfTimes++;
            }
        }
        System.out.println(numberOfTimes);

    }
}
