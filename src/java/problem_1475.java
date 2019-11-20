import java.util.Scanner;

public class problem_1475 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String num = s.nextLine();
        int[] check = new int[9];
        int max;

        check[6] = 1;

        for(int i=0; i<num.length(); i++){
            if(num.charAt(i) == '9'){
                check[6]++;
            }else {
                check[num.charAt(i)-'0']++;
            }
        }
        check[6] /= 2;
        max = check[0];

        for(int i=1; i<check.length; i++){
            if(max < check[i]){
                max = check[i];
            }
        }
        System.out.print(max);
    }
}
