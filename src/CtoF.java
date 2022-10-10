import java.util.Scanner;
public class CtoF
{
    public static void main(String[] args) {


            Scanner in = new Scanner(System.in);

            double celsiusTemp = 0;
            double fahrenheitTemp = 0;
            boolean done = false;

            do {
                System.out.print(" What is the temperature in Celsius? ");
                if (in.hasNextDouble())
                {
                    done = true;
                    celsiusTemp = in.nextDouble();
                    fahrenheitTemp = (celsiusTemp * 9 / 5) + 32;
                    in.nextLine();
                    System.out.println("This temperature in Fahrenheit is: " + fahrenheitTemp + " degrees.");
                }
                else {
                    done = false;
                    System.out.print("You entered an invalid input. Please try again.");
                    in.nextLine();
                }

            } while (done == false);

    }
}
