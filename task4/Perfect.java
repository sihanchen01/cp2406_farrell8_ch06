import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Perfect {
    public static void main(String[] args) {
        List<Integer> output = new ArrayList<Integer>();
        for (int i = 1; i < 101; i++) {
            List<Integer> evenDivider = new ArrayList<Integer>();
            // starts from 2, since all num could be evenly divide by 1
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    evenDivider.add(j);
                }
            }
            int sum = evenDivider.stream().mapToInt(x -> x).sum();
            if (sum == i - 1) {
                output.add(i);
            }
        }
        System.out.print(Arrays.toString(output.toArray()));
    }
}
