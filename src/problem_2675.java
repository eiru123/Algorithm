import java.util.Scanner;

/**
 * Created by iseung on 2018. 3. 28..
 */
public class problem_2675 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int test = s.nextInt();
        String[] words = new String[test];
        for(int i = 0; i < test; i++){
            int repeat = s.nextInt();
            String word = s.nextLine();
            words[i] = "";
            for(int j = 1; j < word.length(); j++){
                for(int k = 0; k < repeat; k++){
                    words[i] += word.charAt(j);
                }
            }
        }
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
}
