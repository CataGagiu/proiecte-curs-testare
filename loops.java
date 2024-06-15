public class loops
{
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
            if (i==4) continue ;{ }
            System.out.println(i);
        }
        String cars[]={"trabant" , "elbons 4zen", "BMW", "peugeot"};
        for (String c:cars)
        {
            System.out.println("Vreau sa conduc " + c);

            if (c == "elbons 4zen")
            {
                System.out.println("mai bine conduc eu"); break;
            }
        }
        int i=0;
        while(i<5)
        {
            System.out.println("i=" +i);
            i++;
        }
        int j=0;
        do
        {
            System.out.println("j="+j);
                    j++;
        }
        while(j<5);

    }
}
