import jdk.jfr.Unsigned;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int n = Integer.parseInt(NM[0]), m = Integer.parseInt(NM[1]);

        ArrayList<Long> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arr.add(Long.parseLong(br.readLine()));
        }

        long result = 0;
        long min = 1, max = Collections.max(arr);
        long mid = 0;

        while(min <= max) {
            result = 0;
            mid = (max + min) / 2;
            for (int i = 0; i < n; i++) {
                result += arr.get(i) / mid;
            }
            if (result >= m) {
                min = mid + 1;
            }
            else if (result < m) {
                max = mid - 1;
            }
        }

        System.out.println(max);
    }
}