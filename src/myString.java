import java.sql.SQLOutput;

public class myString
{
    public static void main(String[] args)
    {
        String text="Hello ";
        String nume="Catalin ";
        String numeMare=nume.toUpperCase();
        String propozitie="Ana are mere";

        System.out.println(numeMare);
        System.out.println(text+nume);
        System.out.println(text);
        String numeMic=nume.toLowerCase();
        System.out.println(numeMic);
        System.out.println(propozitie.length());
        char primaLitera=propozitie.charAt(5);
        System.out.println(primaLitera);
        String filmulPreferat="Filmul meu preferat este \n\" Harry Potter\"";
        System.out.println(filmulPreferat);
        // sau punem ghilimele simple





    }
}
