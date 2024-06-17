import java.sql.SQLOutput;

public class Exercitiiforwhileif
{
    public static void main(String[] args)
    { //exercitii obligatorii
        // ex nr 1
        System.out.print("exercitiul 1: ");
        for (int i = 0; i <= 10; i++)
            System.out.print(i + " ");
            System.out.println();

        //ex nr 2
        System.out.print("exercitiul 2: ");
        for (int i = 20; i >= 10; i--)
            System.out.print(i + " ");
        //ex nr 3
        System.out.println();
        System.out.print("exercitiul 3: ");
        for (int i = 0; i <= 100; i += 2)
            System.out.print(i + " ");
        //ex nr 4
        String numeFruct[] = {"mere", "căpșuni", "pere", "banane"};
        System.out.println();
        System.out.println("exercitiul 4:");
        for (String c : numeFruct) {
            System.out.println("Imi place sa mananc " + c);
        }
        //ex nr 5
        int lunaAn = 11;
        System.out.print("exercitiul 5: ");
        switch (lunaAn) {
            case 1:
                System.out.println("ianuarie");
                break;
            case 2:
                System.out.println("februarie");
                break;
            case 3:
                System.out.println("martie");
                break;
            case 4:
                System.out.println("aprilie");
                break;
            case 5:
                System.out.println("mai");
                break;
            case 6:
                System.out.println("iunie");
                break;
            case 7:
                System.out.println("iulie");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("septembrie");
                break;
            case 10:
                System.out.println("octombrie");
                break;
            case 11:
                System.out.println("noiembrie");
                break;
            case 12:
                System.out.println("decembrie");
                break;
            default:
                System.out.println("nu avem o luna valida");


        }
        //optionale
        //ex 1
        int temperature = 25;
        System.out.print("optionale ex 1 : temperatura aleasa este " + temperature + " de grade si este ");
        if (temperature < 18)
        {
            System.out.println("prea frig");
        }
        else if (18 < temperature && temperature < 22)
        {
            System.out.println("Ok");
        }
        else
        {
            System.out.println("prea cald");
        }
        //ex 2
        System.out.print("optionale ex 2:");
        char gender='f';
        boolean casatorit=false;
        switch (gender)
        {
            case 'm': System.out.print(" domnul "); break;
            case 'f':
                if (casatorit)
                {
                System.out.print(" doamna ");break;
                }
                else
                {
                System.out.print(" domnisoara ");
                break;
                }

        }
        //ex 3
        System.out.println();
        System.out.print("optionale ex 3: ");
        int a=10;
        int b=10;
        int d=5;
        if (a>b)
        {
            System.out.print(a + " este mai mare decat "+ b);
        }
        else if (a==b)
        {
            System.out.print(a+ " egal cu "+ b);
        }

        else
        {
            System.out.print(a+ " mai mic decat "+ b);
        }
//ex nr 4
        System.out.println();
        System.out.print("optionale ex 4: ");
        if (a>=b && a>=d)
        {
            System.out.println(a+ " este cel mai mare dintre " +a+"," + b+ " si "+d);
        }
        else if (b>=a&& b>=d)
        {
            System.out.println(b+" este cel mai mare dintre "+a+"," + b+ " si "+d);
        }
        else
        {
            System.out.println(d+" este cel mai mare dintre "+a+"," + b+ " si "+d);
        }
        //ex nr 5
        System.out.print("optionale ex 5: ");
        char letter='c';
        char consoana[]={'a','e','i','o','u'};
        for (char c:consoana)
        {
            if(letter==c)
            {
                System.out.println(letter+ " este o vocala");break;
            }
            else
            {
                System.out.println(letter+ " este o consoana");break;
            }
        }

        //sau un if lung
        System.out.println("optional Happy birthday: ");
        for (int i=1; i<=2; i++)
        {
            System.out.println();
            for (int j=1; j<=4; j++)
            {
                if (j==3)
                {
                    System.out.println("Happy birthday dear Gabriel ");
                }
                else
                {
                System.out.println("Happy birthday to you");
                }
            }
        }
    }

}
