package n1ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

        Month january = new Month("January");
        Month february = new Month("February");
        Month march = new Month("March");
        Month april = new Month("April");
        Month may = new Month("May");
        Month june = new Month("June");
        Month july = new Month("July");
        Month september = new Month("September");
        Month october = new Month("October");
        Month november = new Month("November");
        Month december = new Month("December");

        ArrayList<Month> months = new ArrayList<Month>(Arrays.asList(january, february, march, april, may, june, july, september, october, november, december));


        //insert
        Month august = new Month("August");
        months.add(7, august);

        HashSet<Month> hsetMonth = new HashSet<Month>();

        //print and add to hashset
        for (int i = 0; i < months.size(); ++i) {
            Month currentMonth = (Month) months.get(i);
            System.out.println(currentMonth.getName());
            hsetMonth.add(currentMonth);
        }

        //no duplicats
        System.out.println("\n");
        //escriu false i no l'afegeix
        System.out.println(hsetMonth.add(new Month("December")));

        //recorreguts for i iterador
        System.out.println("\n");
        for (Month month : hsetMonth) {
            System.out.println(month.getName());
        }

        System.out.println("\n");
        Iterator<Month> it = hsetMonth.iterator();

        while(it.hasNext()){
            System.out.println(it.next().getName());
        }


    }

}
