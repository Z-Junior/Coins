import java.util.Scanner;

public class CoinRunner
{
    private final static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args)
    {
        Coin[] coins = new Coin[]{
                new Coin(),
                new Coin(PromptDouble("Enter bias for coin one: ")),
                new Coin(PromptDouble("Enter bias for coin two: "))
        };

        int iHeads[] = new int[coins.length];
        int iTails[] = new int[coins.length];



        for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j < coins.length; j++)
            {
                coins[j].flip();

                if (coins[j].getFace() == Coin.HEADS)
                    iHeads[j]++;
                else
                    iTails[j]++;
            }
        }

        for (int i = 0; i < coins.length; i++)
            System.out.println(String.format("Coin %d: %d Heads and %d Tails", i+1, iHeads[i], iTails[i]));
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
