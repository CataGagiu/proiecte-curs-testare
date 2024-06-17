public class exercitiiMetodeReturn
{
    public static void main(String[] args)
    {
        System.out.println(suma(5,6));
        concat("sdg","dgdg");
        a2litera("dfghjksdgfj");
        System.out.println("ex nr 1: opusul lui -10 este" + nrOpus(-10));
        System.out.println("opusul lui 11 este "+nrOpus(11));
        System.out.println("opusul lui 0 este "+nrOpus(0));
        System.out.println("ex nr 2: maximul dintre 1234 si 4321 este "+ maximulDin2(1234,4321));
        System.out.println("ex nr 3: media dintre 1,2,4 este " + mediaAritmetica(1,3,4));
        System.out.println("ex nr 4: lungimea cuvantului \"sternocleidomastoidian\" este " + lungimecuavnt("sternocleidomastoidian" ));
        System.out.println("ex nr 5: cuvintele masa si casa concatenate sunt: "+concateneaza("masa","casa"));
        System.out.println("ex nr 6: cuvant inversat \"sternocleidomastoidian\" este "+ inverseaza("sternocleidomastoidian"));
        System.out.print("optional ex 1: ");
        afiseazafraza();
        System.out.println("optional ex 2: "+ parImpar(10));
        System.out.println("optional ex 2: "+ parImpar(11));
        System.out.println("optional ex 3: luna "+anotimp("casa"));
        System.out.println("optional ex 4:");
        System.out.println("test 1 cel mai mare numar dintre 12345 si 4321 este "+compar(12345,4321));
        System.out.println("test 2 cel mai mare numar dintre 8 si 1 este "+ compar(8,1));
        System.out.println("test 3 cel mai mare numar dintre 4 si 4 este "+compar(4,4));
        System.out.println("optional ex 5: compara 4 nr: 1,2,3,4. Cel mai mare este: "+compara4Nr(1,2,3,4));
        System.out.println("optional ex 5: compara 4 nr: 5,4,3,2. Cel mai mare este: "+compara4Nr(5,4,3,2));
        System.out.println("optional ex 5: compara 4 nr: 6,7,3,4. Cel mai mare este: "+compara4Nr(6,7,3,4));
        System.out.println("optional ex 5: compara 4 nr: 1,2,7,4. Cel mai mare este: "+compara4Nr(1,2,7,4));
        System.out.println("optional ex 5: compara 4 nr: 1,4,3,4. Cel mai mare este: "+compara4Nr(1,2,3,4));
        System.out.print("optional ex 6:");
        String cuv1="casa";
        String cuv2="gol";
        System.out.println("lungimea cuvantului \""+ cuv1 + "\" este "+ cuv1.length() + " si este par : "+ lungimeCuvantPar(cuv1));
        System.out.println("lungimea cuvantului \""+ cuv2 + "\" este "+ cuv2.length() + " si este par : "+ lungimeCuvantPar(cuv2));
        System.out.println("optional 7: ");
        System.out.println("mijlocul cuvantului \""+ cuv1 + "\" este " + mijlocCuvant( cuv1));
        System.out.println("mijlocul cuvantului \""+ cuv2 + "\" este " + mijlocCuvant( cuv2));
        System.out.println("optional 8: ");
        int sumaCifreANr=-65982;
        System.out.println("Suma cifrelor numarului "+sumaCifreANr+ " este "+ sumaCifre(sumaCifreANr));
        sumaCifreANr=65982;
        System.out.println("Suma cifrelor numarului "+sumaCifreANr+ " este "+ sumaCifre(sumaCifreANr));
        //System.out.println(sumacifrenou(145));

    }
        private static int  suma(int a, int b)//adunare
    {
        int sum=a+b;
        return sum;

    }
    private static String concat(String a, String b)//concaatenare 2 stringuri
    {
        System.out.println(a+b);
        return a+b;
    }
    private  static char a2litera(String cuvant)//al 2-lea caracter din cuvant
    {
        System.out.println(cuvant.charAt(1));
      return cuvant.charAt(1);
    }

    //ex nr 1
    private static int nrOpus (int a)
    {
        if (a>0)
        {
            return -a;
        }
        else if (a<0)
        {
            return -a;

        }
        else return 0;
    }
    //ex nr 2
    private static int maximulDin2 (int a, int b)
    {
        if (a>b)
        {
            return a;
        }
        else if (b>a)
        {
            return b;
        }
        else return a;
    }
    //ex nr 3 : Scrieți o metodă care prime te 3 numere întregi  i returneazș ș ă media lor aritmetică (cu tot cu virgulă)
   private  static  float mediaAritmetica(int a, int b, int c)
   {
       float media=(float) ((a+b+c)/3.0);
       return media;
   }
   //ex nr 4 Scrieți o metodă care primeste un String  i returneazș ș ă lungimea lui
    private static int lungimecuavnt(String cuvant)
    {
        return cuvant.length();
    }
    //Scrieți o metodă care prime te douș ă Stringuri  i le concateneazș ă
    private static String concateneaza (String cuvant1, String cuvant2)
    {
        return cuvant1+cuvant2;
    }
    //crieți o metodă care prime te un String  i returneazș ș ă inversul lui (ex. “abcd”->”dcba”)
    private static String inverseaza (String cuvant)
    {
        int lungimecuvant=cuvant.length();
        String cuvantinversat1="";
        for (int i=lungimecuvant-1; i>=0;i--)
        {
            cuvantinversat1+=cuvant.charAt(i);

        }
        return cuvantinversat1;
    }
    // Exercitiul 1: Scrieti o metoda care nu primeste nimic si afiseaza textul “In sfarsit e vreme buna!”. Apelati metoda in main().
public static void afiseazafraza()
{
    System.out.println("In sfarsit e vreme buna!");

}
   // Exercitiul 2: Scrieti o metoda care primeste un numar si returneaza un rezultat de tip boolean. Daca numarul e
    // par returneaza true, altfel returneaza false. Afisati rezultatul returnat de metoda in iinteriorul lui main().
    private static boolean parImpar (int a)
    {
        return a % 2 == 0;
    }
    //Scrieti o metoda care primeste o luna calendaristica si returneaza anotimpul din care face parte.
    // Pentru martie, aprilie, mai -> primavara Pentru iunie, iulie, august -> vara Pentru septembrie,
    // octombrie, noiembie -> toamna
    //2  Pentru decembrie, ianuarie, februarie -> iarna Pentru orice altceva inafara de luna calendaristica ->
    // unknown Testati metoda in main cu date de test din toate clasele de echivalenta (ECP )
    private static String anotimp (String luna)
    {
        String lunamici = luna.toLowerCase();
        if (lunamici.equals("martie") || lunamici.equals("aprilie") || lunamici.equals("mai"))
        {
            return "primavara";
        }
        else if (lunamici.equals("iunie") || lunamici.equals("iulie") || lunamici.equals("august"))
        {
            return  luna+" este luna ce face parte din vara";
        }
        else if (lunamici.equals("septembrie") || lunamici.equals("octombrie") || lunamici.equals("noiembrie"))
        {
            return luna+ " este luna ce face parte din toamna";
        }
        else if (lunamici.equals("decembrie") || lunamici.equals("ianuarie") || lunamici.equals("februarie"))
        {
            return luna+" este luna ce face parte din iarna";
        }
        else
        {
            return luna+ " nu este o luna valida";
        }

    }
    //Scrieti o metoda care primeste doua numere si il returneaza pe cel mai mare din ele. In cazul in care sunt
    // egale, returnati oricare din ele. Testati metoda.

    private static int compar (int a, int b)
    {
        if (a>b)
            {
            return a;
            }
        else if (a<b)
            {
            return b;
            }
        else return a;
    }
    //exercitiul 5: Scrieti o metoda care primeste 4 numere si il returneaza pe cel mai mare din ele. In cazul in care
    // doua sau mai multe sunt eglale, returnati oricare din ele. Testati metoda
    private  static int compara4Nr (int a,int b, int c, int d)
    {
        if (a>=b && a>=c && a>=d)
        {
            return a;
        }
        else if (b>=a && b>=c && b>=d)
        {
            return b;
        }
        else if (c>=a && c>=b && c>=d)
        {
            return c;
        }
        else return d;
    }
    //sau
   // private static int returneazaMaximLa4Nr(int x,int y, int z, int w )
   // {
    //    int max;
    //    int numere[]= {x,y,z,w};
    //    for (int  n:numere)
    //    {
    //        max=n;
      //  }
     //   return max;
    //}
    //Exercitiul 6: Scrieti o metoda care primeste un String si returneaza true daca numarul de caractere din Stringul respectiv
    // este par. Testati metoda.

    private static boolean lungimeCuvantPar (String cuvant)
    {
        int dimensiuneCuvant=cuvant.length();
        return dimensiuneCuvant % 2 == 0;
    }
    //Exercitiul 7: Scrieti o metoda care primeste un cuvant si returneaza caracterul/caracterele din mijloc. Daca are numar impar
    // de litere, returnati litera din mijloc (casca -> s). Daca are numar par de litere, returnati cele doua litere din mijloc
    // (castel -> st). Testati metoda.

    private static String mijlocCuvant (String cuvant)
    {
        int lungimeCuv=cuvant.length();
        String mid1= String.valueOf(cuvant.charAt((lungimeCuv/2)+1));
        String mid2= String.valueOf(cuvant.charAt(lungimeCuv/2));
        String mijlocP=mid1+mid2;
        String mijlocI= String.valueOf(cuvant.charAt(lungimeCuv/2));
        if ((lungimeCuv%2)==0)
        {
            return mijlocP;
        }
        else
        {
            return mijlocI;
        }
    }
    //Scrieti o metoda care primeste un numar si returneaza suma cifrelor lui. Testati metoda
    private static int sumaCifre(int numar)
    {   int numarAbs=Math.abs(numar);
        String numarulstring = String.valueOf(numarAbs);
        int lungimeNR = numarulstring.length();
        int sumar = 0;
            for (int j = 0; j <= lungimeNR - 1; j++)
            {   if(j==(lungimeNR-1))
                {
                    if(numar<0)
                        {
                        sumar-=numarAbs%10;
                        }
                    else
                        {
                    sumar+=numarAbs%10;
                        }

                }
                else
                {
                    sumar += numarAbs % 10;
                }
                numarAbs /=10;
            }
        return sumar;
    }
    //sau facut asa dar far cifra cu - prima
   // private static int sumacifrenou (int numar)
    //{   int sumacifrelor=0;
    //    int numarAbs=Math.abs(numar);
     //   String numarulstring = String.valueOf(numarAbs);
     //   int lungimeNR = numarulstring.length();
     //   for (int  i=0; i<=lungimeNR ; i++ )
     //   {
     //       sumacifrelor+=numarAbs%10;
      //  }
      //  return sumacifrelor;
    //}

}

