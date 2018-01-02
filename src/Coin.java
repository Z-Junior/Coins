public class Coin
{
    public final int HEADS = 0;
    public final int TAILS = 1;

    private int face;
    private double bias;

    // ---------------------------------------------
    //   Sets up the coin by flipping it initially.
    // ---------------------------------------------
    public Coin ()
    {
        this.bias = 0.5;

        flip();
    }

    public Coin(double fBias)
    {
        if (fBias >= 0 && fBias <= 1)
            this.bias = fBias;
        else
            this.bias = 0.5;

        flip();
    }

    // -----------------------------------------------
    //   Flips the coin by randomly choosing a face.
    // -----------------------------------------------
    public void flip()
    {
        double fRandom = Math.random();

        if (fRandom < this.bias)
            face = HEADS;
        else
            face = TAILS;
    }

    // -----------------------------------------------------
    //   Returns the current face of the coin as an integer.
    // -----------------------------------------------------
    public int getFace()
    {
        return face;
    }

    // ----------------------------------------------------
    //   Returns the current face of the coin as a string.
    // ----------------------------------------------------
    public String toString()
    {
        String faceName;

        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";

        return faceName;
    }
}
