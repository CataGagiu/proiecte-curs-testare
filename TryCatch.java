public class TryCatch
{
    public static void main(String[] args)
    {
        int [] number={1,2,3,4,5,6,7,8,9,};

        try
        {
            System.out.println(number[8]);
        }
        catch (Exception e)
        {
            System.out.println("a aparut o eroare");
        }
    }

}
