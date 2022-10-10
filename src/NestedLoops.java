public class NestedLoops
{
    public static void main(String[] args)
    {
        //Task 7
        for(int r=1; r <=5; r++)
        {
            for (int c=1; c<=5; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Task 6
        System.out.println();
        for(int r=5; r >=0; r--)
        {
         for (int c=1; c<=r; c++)
         {
             System.out.print("*");
         }
            System.out.println();
        }

        //Task 5
        System.out.println();
        for(int r=0; r <=5; r++)
        {
            for (int c=1; c<=r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
