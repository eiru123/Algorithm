import java.util.Scanner;

/**
 * Created by iseung on 2018. 3. 23..
 */
public class problem_2448 {
    static char[][] stars = new char[10000][10000];

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        for(int i = 0; i < 10000; i++){
            for(int j = 0; j < 10000; j++){
                stars[i][j] = ' ';
            }
        }

        makeStar(num, num-1, 0);

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num*2-1; j++){
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }

    }

    public static void makeStar(int num, int middle, int height){
        if(num == 3){
            stars[height][middle] = '*';
            stars[height+1][middle-1] = '*';
            stars[height+1][middle+1] = '*';
            stars[height+2][middle-2] = '*';
            stars[height+2][middle-1] = '*';
            stars[height+2][middle] = '*';
            stars[height+2][middle+1] = '*';
            stars[height+2][middle+2] = '*';

            return;
        }
        makeStar(num/2, middle, height);
        makeStar(num/2, middle - num/2, height + num/2);
        makeStar(num/2, middle + num/2, height + num/2);
    }


}
