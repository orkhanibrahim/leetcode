import java.util.ArrayList;
import java.util.List;

public class FizzBuzzUsingArrayList {
    public static void main(String[] args) {
        fizzBuzz(15);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;
            if (fizz && buzz) {
                output.add("FizzBuzz");
            } else if (fizz) {
                output.add("Fizz");
            } else if (buzz) {
                output.add("Buzz");
            } else {
                output.add(String.valueOf(i));
            }
        }
        System.out.println(List.of(output));
        return output;
    }
}