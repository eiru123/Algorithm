import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    static Set<Integer> num = new HashSet<>();
    private static void d(int n){
        if(n > 10000) return;
        int ten;
        int result = n;

        for(int i=4; i>=0; i--){
            ten = (int)Math.pow(10, i);
            if(n/ten == 0) continue;

            result += n/ten;
            n -= n/ten*ten;
        }
        num.remove(result);
        d(result);
    }
    public static void main(String[] args) throws Exception {
        Iterator<Integer> iter;
        for(int i=1; i<=10000; i++)
            num.add(i);

        for(int i=1; i<=10000; i++){
            d(i);
        }
        iter = num.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
    }

}
