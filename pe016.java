import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class pe016 {

    public static void main(String[] args) {
        int x = 1000;
        int sum = new ArrayList<>(Arrays.asList(new BigInteger("2")
                .pow(x)
                .toString()
                .split(""))
        )
                .stream()
                .map(Integer::parseInt)
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println(sum);
    }
}
