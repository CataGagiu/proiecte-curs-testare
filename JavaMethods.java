public class JavaMethods
{
    public static void main(String[] args)
    {
        salutnume("Cristina");
        helloNr(10);
        afiseazaCeva("Cata", 39);
        System.out.println(calculeazaSuma(3,7));
        calculeazaSuma(3.5,5.5);
        metoda1();
        metoda1("Cata");
    }
    private static void afiseazaCeva(String nume, int varsta)
    {
        System.out.println("Hello " + nume + " ai vasta de "+ varsta +" de ani ?");
    }
    private static void salutnume (String nume)
    {
        System.out.println("salut " + nume);
    }
    private static void helloNr (int nr)
    {
        System.out.println("Hello "+ nr);
    }
    private static int calculeazaSuma (int x, int y)
    {
        return x+y;
    }
    private static void calculeazaSuma (double x, double y)
    {
        System.out.println(x+y);
    }
    private static void metoda1()
    {
        System.out.println("metoda1");
    }
    private static void metoda1 (String nume)
    {
        System.out.println("metoda1 cu " +nume);
    }
}
