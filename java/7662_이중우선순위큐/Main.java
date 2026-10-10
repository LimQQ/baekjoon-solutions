import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        while (n-- != 0) {
            int m = Integer.parseInt(br.readLine());
            TreeSet<Integer> treeSet = new TreeSet<>();
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            while (m-- != 0) {
                String[] temp = br.readLine().split(" ");
                int t = Integer.parseInt(temp[1]);
                if (temp[0].equals("I")) {
                    if(!treeSet.add(t)){
                        hashMap.put(t , hashMap.get(t) + 1);
                    }
                    else{
                        hashMap.put(t, 1);
                    }
                }
                else {
                    if(!treeSet.isEmpty()) {
                        if (Integer.parseInt(temp[1]) == -1) {
                            if(hashMap.get(treeSet.first()) > 1){
                                hashMap.put(treeSet.first(), hashMap.get(treeSet.first()) - 1);
                            }
                            else{
                                treeSet.pollFirst();
                            }
                        }
                        else{
                            if(hashMap.get(treeSet.last()) > 1){
                                hashMap.put(treeSet.last(), hashMap.get(treeSet.last()) - 1);
                            }
                            else{
                                treeSet.pollLast();
                            }
                        }
                    }
                }
            }
            if (treeSet.isEmpty()) {
                result.append("EMPTY\n");
            } else {
                result.append(treeSet.last()).append(" ").append(treeSet.first()).append("\n");
            }
        }
        System.out.println(result);
    }
}