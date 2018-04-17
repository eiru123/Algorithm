import java.util.Scanner;

/**
 * Created by iseung on 2018. 4. 17..
 */
public class problem_1193 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num1, num2, idx, count = 0;
        int num = s.nextInt();
        num1 = num2 = idx = 1;

        while((count + idx) < num){
            count += idx;
            num2++;
            idx++;
        }
        num -= count;
        for(int i = 0; i < num-1; i++){
            num1++;
            num2--;
        }
        if(idx % 2 == 0) System.out.print(num1 + "/" + num2);
        else System.out.print(num2 + "/" + num1);
    }
}
