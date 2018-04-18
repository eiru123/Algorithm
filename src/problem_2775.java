import java.util.Scanner;

/**
 * Created by iseung on 2018. 4. 18..
 */
public class problem_2775 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int k, n;
        int[] twoUnderFloor;
        int[] underFloor;
        int[] answer = new int[num];

        while(num > 0) {
            k = s.nextInt();
            n = s.nextInt();
            twoUnderFloor = new int[n];
            underFloor = new int[n];

            for (int i = 0; i < twoUnderFloor.length; i++) {
                twoUnderFloor[i] = i + 1;
            }
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == 0) underFloor[j] = 1;
                    else {
                        underFloor[j] = underFloor[j - 1] + twoUnderFloor[j];
                    }
                    twoUnderFloor[j] = underFloor[j];
                }
            }

            answer[answer.length - num] = underFloor[n-1];
            num--;
        }
        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
