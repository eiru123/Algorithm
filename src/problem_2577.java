import java.util.Scanner;

/**
 * Created by iseung on 2018. 3. 26..
 */
public class problem_2577 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int[] count = new int[10];
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        int mul = num1 * num2 * num3;

        while(mul/10 != 0 || mul != 0){
            count[mul%10]++;
            mul /= 10;
        }

        for(int i = 0; i < count.length; i++){
            System.out.println(count[i]);
        }
    }
}
