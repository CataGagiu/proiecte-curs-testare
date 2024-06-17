public class exercitii2
{
    public static void main(String[] args)
    {
       float x=1.4f;
       float y=3.5f;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        String myFavouriteMovie="\"La vita e bella\" ";
        System.out.println("My favourite movie is "+myFavouriteMovie);
        System.out.println(myFavouriteMovie.toUpperCase());
        int lungimefilm=myFavouriteMovie.length();
        System.out.println(lungimefilm);
        char sir[]={ 'a','b','c','d' };
        System.out.println(sir[0]);
        System.out.println(sir[1]);
        System.out.println(sir[3]);
        System.out.println("________________________");
        for(char c:sir)
        {
            System.out.println(c);
        }

    }
}
