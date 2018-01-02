import java.util.Scanner;

public class CoinRunner
{
    private final static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args)
    {
        Coin cFair = new Coin();

        Coin cBias1 = new Coin(PromptDouble("Enter bias for coin one: "));
        Coin cBias2 = new Coin(PromptDouble("Enter bias for coin two: "));

        for (int i = 0; i <= 100; i++)
        {

        }
    }

    protected static double PromptDouble(String question)
    {
        System.out.print(question);

        while (!SCAN.hasNextDouble())
        {
            System.out.flush();

            System.out.print("Enter a decimal: ");

            SCAN.next();
        }

        return SCAN.nextDouble();
    }
}
