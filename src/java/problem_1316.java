import java.util.Scanner;

/**
 * Created by iseung on 2018. 3. 29..
 */
public class problem_1316 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        s.nextLine();
        boolean[] checks = new boolean[26];
        int count = 0;
        for(int i = 0; i < num; i++){
            String word = s.nextLine().toLowerCase();
            char prev = word.charAt(0);

            for(int j = 0; j < checks.length; j++){
                checks[j] = false;
            }
            checks[prev-'a'] = true;
            for(int j = 0; j < word.length(); j++){
                char cur = word.charAt(j);

                if(prev == cur) {
                    if(j == word.length()-1) count++;
                    continue;
                }
                else if(checks[cur-'a']) break;
                else checks[cur-'a'] = true;

                prev = cur;
                if(j == word.length()-1) count++;
            }
        }

        System.out.print(count);
    }
}
