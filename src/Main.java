import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        String temp;

        int num = Integer.parseInt(br.readLine());
        for (int i = 0;i < num; i++) {
            temp = br.readLine();
            int index = temp.indexOf(" ");
            int num1 = Integer.parseInt(temp.substring(0, index));
            int num2 = Integer.parseInt(temp.substring(index + 1));

            bw.write(Integer.toString(num1 + num2) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
