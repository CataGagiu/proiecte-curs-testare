public class ExercitiiAlgoritmi
{
    public static void main(String[] args)
    {
        //1.Declarați un șir de numere întregi (ex. )
        int a,b,c,d,e,f;
        a=1;
        b=-25;
        c=34;
        d=-2;
        e=67;
        f=5;

        int sirNr[]={a, b, c, d, e, f};
        //2.Scrieți un program care să afișeze doar vecinii numerelor din șir (ex. în loc de 1 afișați 0 și 2; în loc de -25 a$șați -26 și -24; etc
        System.out.println("ex 2: vecinii numerelor "+a+","+b+","+c+","+d+","+e+","+f+ " sunt : ");
        for(int n:sirNr)
        {
            System.out.print((n-1)+" si "+ (n+1)+ "  ");
        }
        //3.Scrieți un program care să a$șeze numerele nega*ve din șir
        System.out.println();
        System.out.print("ex nr 3 : nr negative din sir sunt:");
        for (int n:sirNr)
        {
            if (n<0)
            {
                System.out.print(n+" ");
            }
        }
        //4.Declarați un șir de țări cu 8 elemente (ex. Anglia, România, Albania, Franța, Elveția, China, SUA, Australia
        System.out.println();
        String tari[]={"Anglia","România","Albania", "Franța", "Elveția", "China", "SUA", "Australia"};
        System.out.print("ex nr 4: tarile sunt: ");
        for (String t:tari)
        {
            System.out.print(t +" ");
        }
        //5.Scrieți un program care să afșeze inițiala fiecărei țări
        System.out.println();
        System.out.print("ex nr 5: initialele tarilor sunt: ");
        for (String t:tari)
        {
            System.out.print(t.charAt(0) +" ");
        }
        //Scrieți un program care să a$șeze numai țările care încep cu litera “A”
        System.out.println();
        char primalitera='A' ;
        System.out.print("ex nr 6: Tarile cu litera " + primalitera+ " sunt : ");
        for (String t:tari)
        {
            if (primalitera==t.charAt(0))
            {
                System.out.print(t+" " );
            }
        }
        System.out.println();
        //Scrieți un program care să afișeze numărul de litere pentru fecare țara
        System.out.println("ex nr 7: numarul de litere:");
        int nrLitere=0;
        for (String t:tari)
        {
            System.out.println( t+" are " + t.length());
        }
        //8. Scrieți un program care să afișeze țara cu cel mai lung nume

        int max=0;

        String tara=tari[0];

        for (String t:tari)
        {
            if (t.length()>max)
            {
                max=t.length();
                tara=t;
            }
        }
        System.out.println("ex nr 8:"+tara +" este tara cu cel mai mare numar de litere : "+max);
        //Scrieți un program care să a$șeze țara cu cel mai scurt nume
        int min=100;
        tara="blabla";
        for (String t:tari)
        {
            if(min>t.length())
            {
                min=t.length();
                tara=t;
            }
        }
        System.out.println("ex nr 9: "+tara +" este tara cu cel mai mic numar de litere : "+min);
    }
}