import java.util.Scanner;

/**
 * Created by iseung on 2018. 3. 26..
 */
public class problem_8958 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        s.nextLine();
        int[] count = new int[num];
        String[] answers = new String[num];

        for(int i = 0; i < num; i++){
            answers[i] = s.nextLine();
        }

        for(int i = 0; i < num; i++){
            int length = answers[i].length();
            int tc = 1;

            for(int j = 0; j < length; j++){
                char c = answers[i].charAt(j);

                if(c == 'O') {
                    count[i]+=tc;
                    tc++;
                }
                else tc = 1;
            }
            System.out.println(count[i]);
        }
    }
}