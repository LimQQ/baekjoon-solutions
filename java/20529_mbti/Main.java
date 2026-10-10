import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> mbti = new HashMap<>();
        String[] mbtilist = {"ISTJ", "ISFJ", "INFJ", "INTJ",
                "ISTP", "ISFP", "INFP", "INTP",
                "ESTP", "ESFP", "ENFP", "ENTP",
                "ESTJ", "ESFJ", "ENFJ", "ENTJ"};
        for(int i = 0; i < 16; i++){
            mbti.put(mbtilist[i], i);
        }
        int[][] distance = new int[16][16];
        for(int i = 0; i < 16; i++){
            for(int j = 0; j < 16; j++){
                distance[i][j] = compare(mbtilist[i], mbtilist[j]);
            }
        }


        while(n-- != 0){
            int m = Integer.parseInt(br.readLine()), min = 13;
            String[] list = br.readLine().split(" ");
            if(m > 32){
                result.append(0 + "\n");
            }
            else{
                for(int i = 0; i < m; i++){
                    for(int j = i + 1; j < m; j++){
                        int ab = distance[mbti.get(list[i])][mbti.get(list[j])];
                        if(ab > min){
                            continue;
                        }
                        for(int k = j + 1; k < m; k++){
                            int bc = distance[mbti.get(list[j])][mbti.get(list[k])];
                            int ca = distance[mbti.get(list[k])][mbti.get(list[i])];
                            if(ab + bc + ca < min){
                                min = ab + bc + ca;
                            }
                        }
                    }
                }
                result.append(min + "\n");
            }
        }
        System.out.println(result);
    }

    public static int compare(String a, String b){
        int Distance = 0;
        for(int i = 0; i < 4; i++){
            if(a.charAt(i) != b.charAt(i)){
                Distance++;
            }
        }
        return Distance;
    }
}