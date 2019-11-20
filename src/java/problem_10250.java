import java.util.Scanner;

/**
 * Created by iseung on 2018. 4. 20..
 */
public class problem_10250 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int test = s.nextInt();
        int h, w, guest;
        int[] answer = new int[test];

        for(int i = 0; i < test; i++){
            h = s.nextInt();
            w = s.nextInt();
            guest = s.nextInt();

            answer[i] = ((((guest - 1) % h) + 1) * 100) + (((guest - 1) / h) + 1);
        }

        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
