import java.util.Scanner;

/**
 * Created by iseung on 2018. 4. 3..
 */
public class problem_5622 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String sentence = s.nextLine().toUpperCase();
        int time = 0;
        for (int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            if(c == '1') time += 2;
            else if('A' <= c && c <= 'C') time += 3;
            else if('D' <= c && c <= 'F') time += 4;
            else if('G' <= c && c <= 'I') time += 5;
            else if('J' <= c && c <= 'L') time += 6;
            else if('M' <= c && c <= 'O') time += 7;
            else if('P' <= c && c <= 'S') time += 8;
            else if('T' <= c && c <= 'V') time += 9;
            else if('W' <= c && c <= 'Z') time += 10;
            else time += 11;
        }
        System.out.print(time);
    }
}
