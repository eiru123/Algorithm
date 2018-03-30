import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        String c = s.nextLine();
        int[] alphabet = new int[26];

        for(int i = 0; i < alphabet.length; i++){
            alphabet[i] = -1;
        }
        for(int i = 0; i < c.length(); i++){
            int index = c.charAt(i) - 'a';
            if(alphabet[index] == -1)
                alphabet[c.charAt(i) - 'a'] = i;
        }
        for(int i = 0; i < alphabet.length; i++){
            System.out.print(alphabet[i] + " ");
        }
    }

}
