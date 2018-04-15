import java.util.Scanner;

/**
 * Created by iseung on 2018. 4. 15..
 */
public class problem_2941 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String sentence = s.nextLine();
        int count = 0;
        for(int i = 0; i < sentence.length(); i++){
            if(i < sentence.length()-1) {
                switch (sentence.charAt(i)) {
                    case 'c':
                        if (sentence.charAt(i + 1) == '=' || sentence.charAt(i + 1) == '-') {
                            i++;
                        }
                        break;
                    case 'd':
                        if (sentence.charAt(i + 1) == 'z' && sentence.charAt(i + 2) == '=' && i < sentence.length() - 2) {
                            i += 2;
                        } else if (sentence.charAt(i + 1) == '-') {
                            i++;
                        }
                        break;
                    case 'l':
                    case 'n':
                        if (sentence.charAt(i + 1) == 'j') {
                            i++;
                        }
                        break;
                    case 's':
                    case 'z':
                        if (sentence.charAt(i + 1) == '=') {
                            i++;
                        }
                        break;
                }
            }
            count++;
        }
        System.out.print(count);
    }
}
