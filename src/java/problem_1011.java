import java.util.Scanner;

/**
 * Created by iseung on 2018. 4. 23..
 */
public class problem_1011 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int testCase = s.nextInt();
        int[] answer = new int[testCase];
        int min, max, num;
        int toggle;

        for(int i = 0; i < testCase; i++){
            min = s.nextInt();
            max = s.nextInt();
            num = max - min;

            toggle = 1;
            answer[i] = 1;
            do{
                num -= answer[i];
                answer[i] += (1-toggle);

                if(toggle == 0) toggle++;
                else toggle--;
            }while(0 < num);

            answer[i] = (answer[i] - toggle) * 2 - (1 - toggle);
        }
        for(int i = 0; i < testCase; i++){
            System.out.println(answer[i]);
        }
    }
}
