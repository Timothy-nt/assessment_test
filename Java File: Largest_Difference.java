import java.util.List;

public class LargestDifference {
    public static int findLargestDifference(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return 0;
        }

        int min = numbers.get(0);
        int maxDiff = numbers.get(1) - min;

        for (int i = 1; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            int diff = currentNum - min;

            if (diff > maxDiff) {
                maxDiff = diff;
            }

            if (currentNum < min) {
                min = currentNum;
            }
        }

        return maxDiff;
    }
}
