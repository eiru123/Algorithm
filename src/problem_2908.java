import java.util.Scanner;

/**
 * Created by iseung on 2018. 3. 30..
 */
public class problem_2908 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String[] nums = s.nextLine().split(" ");
        int[] num = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            String temp = "";
            for(int j = 0; j < nums[i].length(); j++){
                temp += nums[i].charAt(nums[i].length()-j-1);
            }
            num[i] = Integer.parseInt(temp);
        }

        if(num[0] < num[1])
            System.out.print(num[1]);
        else
            System.out.print(num[0]);
    }
}
