import java.util.Scanner;

/**
 * Created by iseung on 2018. 3. 25..
 */
public class problem_1152 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        int count = 0;

        sentence = sentence.trim();
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' ' && sentence.charAt(i-1) != ' '){
                count++;
            }
        }
        if(sentence.equals("")) System.out.print(0);
        else System.out.print(count+1);

    }



}
