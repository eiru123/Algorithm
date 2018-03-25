import java.util.Scanner;

/**
 * Created by iseung on 2018. 3. 25..
 */
public class problem_1152 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();

        String[] words = sentence.split(" ");

        System.out.print(words.length);
    }



}
