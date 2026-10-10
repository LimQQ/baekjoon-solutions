import com.sun.source.tree.Tree;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] NM = br.readLine().split(" ");
        ArrayList<String> know = new ArrayList<>();
        ArrayList<String> donKnow = new ArrayList<>();
        for(int i = 0; i < Integer.parseInt(NM[0]); i++){
            know.add(br.readLine());
        }

        Collections.sort(know);

        for(int i = 0; i < Integer.parseInt(NM[1]); i++){
            String temp = br.readLine();
            if(Collections.binarySearch(know, temp) >= 0){
                donKnow.add(temp);
            }
        }

        Collections.sort(donKnow);
        bw.write(donKnow.size() + "\n");

        for(int i = 0; i < donKnow.size(); i++){
            bw.write(donKnow.get(i) + "\n");
        }
        bw.flush();

    }
}