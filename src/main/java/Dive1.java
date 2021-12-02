import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dive1 {
    public static void main(String[] args) {
        List<String> course = new ArrayList<>();
        int horizontal = 0;
        int depth = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String command = scanner.nextLine();
            if (!command.isEmpty()) {
                course.add(command);
            } else {
                break;
            }
        }
        System.out.println(course);


        for (String s : course) {
            String cours = s.trim().split(" ")[0];
            int unit = Integer.parseInt(s.trim().split(" ")[1]);
            switch (cours) {
                case ("forward"):
                    horizontal = horizontal + unit;
                    break;
                case ("down"):
                    depth = depth + unit;
                    break;
                case ("up"):
                    depth = depth - unit;
                    break;
            }

        }
        System.out.println(Math.multiplyExact(horizontal, depth));
    }
}

