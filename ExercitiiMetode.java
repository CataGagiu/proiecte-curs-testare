import java.util.SortedMap;

public class ExercitiiMetode
{
    public static void main(String[] args)
    {
        System.out.println("ex nr 1: ");
        int g=3;
        System.out.println(" se va afisa de "+ g + " ori");
        for(int i=1; i<=g;i++)
        {
            learningJava();
        }
        System.out.println("ex nr 2: ");
        String limbajDeProgramare[]={ "Java", "Python", "JavaScript", "C++" };
        for(String l:limbajDeProgramare)
        {
            learning2Code(l);
        }
        System.out.println("ex nr 3:");
        aflaNumarulMaiMare(1,3);
        aflaNumarulMaiMare(10,4);
        aflaNumarulMaiMare(22,22);
        System.out.println("ex nr 4: ");
        lungimeaCuvantului("sternocleidomastodian");
        System.out.println("ex nr 5: ");
        primaLitera("sternocleidomastoidian");
        primaLitera("Avion");
        System.out.println("ex nr 6: ");
        verificaVarsta(3);
        verificaVarsta(20);
        verificaVarsta(61);
    //Deni o metoda cu numele learningJava() fara parametri, care aseaza textul “It’s easy to learn Java”. Apela metoda
    // denita de voi in interiorul lui main() de 3 ori.
    }
    public static void learningJava()
    {
            System.out.println("It’s easy to learn Java");
    }
    //Deni o noua metoda cu numele learning2Code() care primeste un parametru de p String cu numele limbajProgramare
    // si aseaza “It’s easy to learn limbajProgramare”, unde limbajProgramare corespunde cu paramtru dat. Apela metoda
    // in main() cu urmatorii parametri: “Java”, “Python”, “JavaScript”, “C++”
    public static void  learning2Code(String limbajProgramare)
    {
        System.out.println("It’s easy to learn " + limbajProgramare);
    }
    //Deni o metoda cu numele aaNumarulMaiMare() care primeste doi parametri de p int si aseaza “Numarul mai mare
    // este: x”, unde x=numarul mai mare dintre cei doi parametri
    public static void  aflaNumarulMaiMare(int x, int y)
    {
        if (x>y)
        {
            System.out.println("dintre "+ x+ " si " + y +" numarul cel mai mare este "+x);
        } else if (x==y)
        {
            System.out.println(x+" este egal cu " + y);
        }
        else
            System.out.println("dintre " + x + " si "+ y + " numarul cel mai mare este "+ y);
    }
    //Deni o metoda cu numele lungimeaCuvantului() care primeste un cuvant si aseaza “Lungimea cuvantului dat este:
    // x”, unde x=lungimea cuvantului dat
    public  static void lungimeaCuvantului(String cuvant)
    {
        System.out.println("lungimea cuvantului -> "+ cuvant + " este de "+ cuvant.length()+" caractere");
    }
    //Deni o metoda care primeste un cuvant si aseaza “cuvant incepe cu vocala” daca incepe cu vocala sau
    // “cuvant incepe cu consoana” daca incepe cu consoana, unde cuvant corespunde cu cuvantul dat. Apela
    // metoda in main() ca sa o testa cu doua valori diferite.
    public  static  void primaLitera (String cuvant)
    {
        char vocala[]={'a','e','i','o','u'};
        String cuvantCuLiteraMica=cuvant.toLowerCase();
        char primaLitera = cuvantCuLiteraMica.charAt(0);
        System.out.print("cuvantul  \" " + cuvant + " \" incepe cu " + primaLitera);
        for (char c:vocala)
        {
            if (primaLitera==c)
            {
                System.out.println(" si este o vocala"); break;
            }
            else
                System.out.println(" si este o consoana");break;
        }
    }
    //Deni o metoda care primeste un parametru varsta. Daca varsta este sub 18, metoda aseaza “too young”.
    // Daca varsta este intre 18-60, aseaza “just ne”. Daca varsta este peste 60, aseaza “too old”.
    // Apela metoda in main a.i. sa testa toate cazurile posibile
public static void verificaVarsta(int varsta)
    {
        System.out.print(varsta);
        if (varsta<18)
        {
            System.out.println(" too young ");
        } else if (varsta>=18 && varsta<=60)
        {
            System.out.println(" just fine ");
        }
        else
        {
            System.out.println(" too old ");
        }
    }
}
