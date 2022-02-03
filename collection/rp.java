package collection;

import java.util.Scanner;

public class rp {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("abc is a stupid, idiot person. ");

        String str = "abc is a stupid, idiot person.";

        System.out.println("Enter the bad word to be replaced: ");
        String bwd = in.nextLine();


        if (str.contains(bwd))
        {

                System.out.println(str.replace(bwd, "*"));

        }
        else
        {
            System.out.println("This is not a bad word");
        }
        in.close();
    }
}
