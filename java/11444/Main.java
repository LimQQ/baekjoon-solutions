import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());
        BigInteger a = BigInteger.ZERO, b = BigInteger.ONE, c = BigInteger.ONE;
        BigInteger mod = new BigInteger("1000000007");
        for(BigInteger i = BigInteger.ZERO; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)){
            c = a.add(b).mod(mod);
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}