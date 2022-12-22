import java.util.List;

public class FizzBuzzUsingStringArray {
    public static void main(String[] args) {
    fizzBuzz(15);
    }
    public static List<String> fizzBuzz(int n) {
        String[] output = new String[n];
        for(int i = 0; i<n; i++){
            output[i] = String.valueOf(i+1);
            boolean buzz = Integer.parseInt(output[i]) % 5 == 0;
            boolean fizz = Integer.parseInt(output[i]) %3 ==0;
            if(fizz){
                output[i] = "Fizz";
            }

            if(buzz){
                output[i] = "Buzz";
            }
            if(fizz && buzz){
                output[i] = "FizzBuzz";
            }
        }
        System.out.println(List.of(output));
        return List.of(output);
    }
}
