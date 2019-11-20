import java.util.Scanner;

/**
 * Created by iseung on 2018. 3. 28..
 */
public class problem_1157 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int[] alphabet = new int[26];
        String word = s.nextLine();
        int max;
        char result;
        boolean check = false;
        word = word.toLowerCase();

        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
            alphabet[index]++;
        }
        max = 0;
        for(int i = 1; i < alphabet.length; i++){
            if(alphabet[i] == alphabet[max]){
                check = true;
            }else if(alphabet[max] < alphabet[i]) {
                max = i;
                check = false;
            }
        }
        result = (char)('A' + max);
        if(check)System.out.print("?");
        else System.out.print(result);
    }
}
