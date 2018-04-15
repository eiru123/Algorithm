import java.util.Scanner;

/**
 * Created by iseung on 2018. 4. 15..
 */
public class problem_2292 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int comp = 1;
        int i = 1;
        while(comp < num){
            comp += 6*i;
            i++;
        }
        System.out.print(i);
    }
}
