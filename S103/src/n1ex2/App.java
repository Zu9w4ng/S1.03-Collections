package n1ex2;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> llistaNum = new ArrayList<Integer> (Arrays.asList(1,1,2,3,5,8,13,21,34,55));
        ListIterator<Integer> it = llistaNum.listIterator();
        List<Integer> llistaNum2 = new ArrayList<Integer>();
        
        while(it.hasNext()) {
            llistaNum2.add(0,it.next());
        }
        System.out.println(llistaNum);
        System.out.println(llistaNum2);
    }
}
