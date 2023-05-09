package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App2 {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        Date dt1 = sdf.parse(sc.next());
        Date dt2 = sdf.parse(sc.next());

        long diff = dt1.getTime() - dt2.getTime();
        long dia = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

        System.out.println("Diferença de " + dia);
        sc.close();

    }
}
