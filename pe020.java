import java.math.BigInteger;
import java.util.Arrays;

public class pe020 {

    public BigInteger fac(BigInteger x) {
        if (x.equals(new BigInteger("0")) || x.equals(new BigInteger("1"))) {
            return new BigInteger("1");
        }
        return fac(x.subtract(new BigInteger("1"))).multiply(x);
    }

    public static void main(String[] args) {
        pe020 fac = new pe020();
        int ret = Arrays.stream(fac.fac(new BigInteger("100"))
                .toString()
                .split("")
        )
                .map(Integer::parseInt)
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println(ret);
    }
}
