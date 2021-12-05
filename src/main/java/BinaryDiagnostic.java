import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BinaryDiagnostic {
    public static void main(String[] args) {

        int power;
        StringBuilder gammaRate = new StringBuilder();
        StringBuilder epsilonRate = new StringBuilder();

        ArrayList<String> diagnosticReport1 = new ArrayList<>();
        ArrayList<List<Integer>> diagnosticReport2 = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (!input.isEmpty()) {
                diagnosticReport1.add(input);
            } else {
                break;
            }
        }


        for (String i : diagnosticReport1) {
            List<Integer> list = new ArrayList<>(Arrays.asList(i.split("")))
                    .stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            diagnosticReport2.add(diagnosticReport1.indexOf(i), list);
        }

        for (int i = 0; i < diagnosticReport2.get(0).size(); i++) {
            int nul = 0;
            int one = 0;
            for (List<Integer> integers : diagnosticReport2) {
                int y = integers.get(i);
                if (y == 0) {
                    nul++;
                } else {
                    one++;
                }
            }

            if (nul > one) {
                gammaRate.append("0");
                epsilonRate.append("1");
            } else {
                gammaRate.append("1");
                epsilonRate.append("0");
            }
        }
        System.out.println(gammaRate);
        System.out.println(epsilonRate);

        int gammaRateFinal = Integer.parseInt(gammaRate.toString().trim(), 2);
        int epsilonRateFinal = Integer.parseInt(epsilonRate.toString().trim(), 2);
        power = gammaRateFinal * epsilonRateFinal;

        System.out.println(power);


    }
}
