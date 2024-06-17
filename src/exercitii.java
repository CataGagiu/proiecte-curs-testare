import java.lang.reflect.Array;

public class exercitii
{
    public static void main(String[] args)
    {
        int myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean myBool = false;
        String myText = "Hello World";
        String myOtherText ="1a2b3c";
        byte x=121;
        int a2variabila=(int)myNum ;
        System.out.println(a2variabila);
        float variabilafloat=0.1F;
        int a3variabila= (int)variabilafloat;
        System.out.println(a3variabila);
        String numedetara="Romania";
        int lungimestring=numedetara.length();
        System.out.println(lungimestring);
        Double y[]= {11.4 ,34.5 ,45.6 , 67.6};
        System.out.println(y[1]);
        int lungimey=y.length;

        System.out.println(y[lungimey-1]);

    }
}
