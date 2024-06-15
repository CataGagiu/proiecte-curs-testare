public class exercitii_cu_operatori
{
    public static void main(String[] args)
    {//exercitii din curs

        System.out.println(10+6); //ex 1
        System.out.println(10/5);//ex 2
        //ex 3
        int x=10;
        ++x;
        System.out.println(x);
        //ex 4
        x=10;
        x+=5;
        System.out.println(x);
        //ex 5
        int e=11;
        int f=12;
        int suma=e+f;
        if (suma>=10)
        {
            System.out.println("suma e mai mare decat 10");
        }
        else
        {
            System.out.println("suma e mai mica decat 10");
        }
        //ex nr 6
        if(suma%2==0)
        {
            System.out.println("suma este numar par");
        }
        else
        {
            System.out.println("suma este numar impar");
        }
        //optionale
        // ex nr 1
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        System.out.println(a+b+c+d);
        System.out.println(a*b*c*d);
        System.out.println(b%d);
        //ex nr 2
        for(int i=1; i<3; i++)
        {
            a++;
        }
        System.out.println(a);
        //ex nr 3
        for(int i=0; i<2; i++)
        {
            b-=2;
        }
        System.out.println(b);
        //ex nr 4
        boolean cond1=true;
        boolean cond2=true;
        if (a+b+c+d>=100)
        {
            cond1=true;
        }
        else
        {
            cond1=false;
            System.out.println(cond1);
        }
        if (a*b*c*d>1000)
        {
            cond2=true;
        }
        else
        {
            cond2=false;
            System.out.println(cond2);
        }
        //ex nr 5
        if (cond1==true || cond2==true)
        {
            System.out.println("cel putin una este adevarata");
        }
        else
        {
            System.out.println("nici una nu este adevarata");
        }
        if (cond1==true && cond2==true)
        {
            System.out.println("ambele sunt adevarate");
        }
        else
        {
            System.out.println("nu sunt ambele adevarate");
        }
    }
}
