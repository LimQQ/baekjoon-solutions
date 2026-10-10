import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        BigInteger hash = new BigInteger("0");
        BigInteger mod = new BigInteger("1234567891");
        for (int i = 0; i < n; i++) {
            BigInteger a = BigInteger.valueOf(str.charAt(i) - 'a' + 1);
            BigInteger b = new BigInteger("31");
            b = b.pow(i);
            b.mod(mod);
            hash = hash.add(a.multiply(b).mod(mod)).mod(mod);
        }
        System.out.println(hash);
    }
}