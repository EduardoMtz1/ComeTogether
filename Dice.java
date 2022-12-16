import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Dice{
    static Scanner inputObject = new Scanner(System.in);
    public static void main(String[] args) {
        int T = inputObject.nextInt();
        for(int i = 1; i <= T; i++){
            int N = inputObject.nextInt();
            List<Integer> S = new ArrayList<Integer>();
            for(int j = 0; j < N; j++){
                S.add(inputObject.nextInt());
            }
            Collections.sort(S);
            int length = 0;
            for(int j =0; j<S.size();j++){
                if(S.get(j) > length) length++;
            }
            System.out.println("Case #" + i + ": " + length);
        }
    }
}