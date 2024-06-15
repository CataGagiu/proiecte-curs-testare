import java.sql.SQLOutput;

public class operators
{
    public static void main(String[] args)
    {
        int a=100;
        int b=50;
        int c=30;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a%c);
        System.out.println(++a); //prima data creste dupa care afiseaza
        System.out.println(a++);// prima data afisseaza dupa care creste
        System.out.println(a);
        System.out.println(--b);

        //oepratori de atribuire

        int d=10;
        int e=d;
        d+=2; // d= d+2
        d-=3;
        System.out.println(e);
        System.out.println(d);
        System.out.println("------------------------");

        for(int i=0; i<=10; i+=2)
        {
            System.out.println(i);

        }
        for(int i=10; i>=0 ; i--)
        {
            System.out.println(i);
        }
        System.out.println(a>b);
        System.out.println(b>a);
        System.out.println(5==5);
        System.out.println(e==d);
        System.out.println(a!=b);
        boolean ilovejava= true;
        System.out.println(ilovejava);
        System.out.println(!ilovejava);
        if (!ilovejava)
            {
            System.out.println("learn test automation");
            }
        else
            {
            System.out.println("still learning");
            }
        System.out.println(d);
        System.out.println(e);
        if (d<=10 && e<=10)
            {
                System.out.println("d si e mai mic sau egal decat 10");
            }
        if (d<10 || e<=10)
            {
            System.out.println("d si e mai mic sau egal decat 10");
            }

    }
}
