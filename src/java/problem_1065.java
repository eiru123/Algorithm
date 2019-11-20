import java.util.Scanner;

/**
 * Created by iseung on 2018. 3. 22..
 */
public class problem_1065 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int[] nums = new int[3];
        int result;

        if(num < 100) {
            result = num;
        }
        else {
            result = 99;

            int i;
            int temp;
            if(num == 1000) num = 999;
            for(int number = 100; number <= num; number++) {
                i = 0;
                temp = number;
                while (temp > 0) {
                    nums[i] = temp % 10;
                    temp /= 10;
                    i++;
                }
                if (nums[0] - nums[1] == nums[1] - nums[2])
                    result++;
            }
        }

        System.out.print(result);
    }
}
