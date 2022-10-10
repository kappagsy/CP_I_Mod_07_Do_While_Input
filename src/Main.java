import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        for(int x=0; x <= 10; x++)
        {
            System.out.println(x);
        }

        for(int l = 0; l < 3; l++)
            System.out.println();

        for(int x=10; x >= 0; x--)
        {
            System.out.println(x);
        }

        int reps = in.nextInt();
        for(int x = 1; x <= reps; x++)
        {
            System.out.println("Re: " + x);
        }

        int rndA = rnd.nextInt(6) + 1;
        int rndB = rnd.nextInt(6) + 1;

        while(rndA != rndB)
        {
            rndA = rnd.nextInt(6) + 1;
            rndB = rnd.nextInt(6) + 1;
            System.out.printf("\n%3d%3d", rndA, rndB);
        }
    }
}