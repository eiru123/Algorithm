import java.util.Scanner;

/**
 * Created by iseung on 2018. 3. 27..
 */
public class problem_2920 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int[] scales = new int[9];
        int[] status = new int[9]; // 0 ascending, 1 descending, 2 mixed
        boolean sort = true;

        for(int i=1; i<scales.length; i++){
            scales[i] = s.nextInt();
        }

        for(int i=1; i<scales.length; i++){

            if(i == scales[i]) {status[i] = 0;}
            else if(i == (scales.length-scales[i])) status[i] = 1;
            else {
                status[i] = 2;
            }

            if(i != 1 && status[i] != status[i-1]){
                sort = false;
                break;
            }
        }
        if(!sort)
            System.out.print("mixed");
        else if(status[1] == 0)
            System.out.print("ascending");
        else
            System.out.print("descending");
    }
}
