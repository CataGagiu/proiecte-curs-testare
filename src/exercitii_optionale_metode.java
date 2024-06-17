import java.sql.SQLOutput;
import java.util.Arrays;

public class exercitii_optionale_metode {
    public static void main(String[] args)
    {
        System.out.println("\n optionale ex nr 1: "+ILikeToMoveIt("Cata"));
        System.out.print("\n optionale ex nr 2:"+numarDinArray(5, new int []{78,-6,90,34,2}));
        System.out.println(numarDinArray(6, new int[]{8,-36,100,4,98,6,0,-2,200} ));
        System.out.print(numarElementeNegativeArray(new int[]{8,-36,-100,4,98,6,0,-2,-200,-5468, 85}));
    }

    //Scrieti o metoda care primeste un nume si returneaza urmatorul text (unde nume = numele dat):
    // I like to move it, move it
    // I like to move it, move it
    // I like to move it, move it
    // [nume] likes to move it
    // I like to move it, move it
    // I like to move it, move it
    // I like to move it, move it
    // [nume] likes to move it
    private static String ILikeToMoveIt(String nume)
    {
        String text1 = "\n "+ nume + " likes to move it";
        String text2= "\n I like to move it, move it";
        String afisare="";
        for (int j = 1; j <= 8; j++)
        {
            if (j==4 || j==8)
            {
                afisare+=text1;
            }
            else
            {
                afisare+=text2;
            }
        }
        return afisare;
    }
    //Scrieti o metoda care primeste un numar intreg si un array de numere intregi si returneaza “numarul face parte din array”
    // (daca numarul dat face parte din array-ul dat) sau “numarul nu face parte din array” (daca numarul nu face parte din
    // arrayul dat)
    private static String numarDinArray (int numar, int[] numarArray) {
        String mesaj1 = "\n " + numar + " FACE parte din " + Arrays.toString(numarArray);
        String mesaj2 = "\n " + numar + " NU FACE parte din array " + Arrays.toString(numarArray);
        String afisare = "";
        for (int c : numarArray)
        {
            if (numar == c)
            {
                return afisare = mesaj1;
            }
            else afisare = mesaj2;
        }
        return afisare;
    }
    //Scrieti o metoda care primeste un array de numere intregi si returneaza cate numere negative sunt in total in array;
    private static int numarElementeNegativeArray (int[] numarArray)
    {
        System.out.print("\n optionale ex 3: \n numarul de elemente negative din "+ Arrays.toString(numarArray)+" este ");
        int nrNegative=0;
        for (int c:numarArray)
        {
            if(c<0)
            {
                nrNegative++;
            }
        }
        return  nrNegative;
    }
}