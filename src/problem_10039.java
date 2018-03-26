import java.util.Scanner;

/**
 * Created by iseung on 2018. 3. 27..
 */
public class problem_10039 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int[] scores = new int[5];
        int result=0;
        for(int i=0; i<5; i++){
            scores[i] = s.nextInt();
            if(scores[i] < 40) result += 40;
            else result += scores[i];
        }

        System.out.print(result/5);
    }
}
