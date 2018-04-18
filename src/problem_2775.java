import java.util.Scanner;

/**
 * Created by iseung on 2018. 4. 18..
 */
public class problem_2775 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int k, n;
        int[][] floors = new int[15][15];
        int[] answer = new int[num];

        for(int i = 0; i < floors.length; i++){
            floors[i][0] = 1;
            floors[0][i] = i+1;
        }
        for(int i = 1; i < floors.length; i++){
            for(int j = 1; j < floors[i].length; j++){
                floors[i][j] = floors[i-1][j] + floors[i][j-1];
            }
        }
        for(int i = 0; i < num; i++){
            k = s.nextInt();
            n = s.nextInt();
            answer[i] = floors[k][n-1];
        }
        for(int result: answer){
            System.out.println(result);
        }
    }
}
