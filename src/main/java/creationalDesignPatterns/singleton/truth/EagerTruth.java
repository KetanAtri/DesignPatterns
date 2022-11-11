package creationalDesignPatterns.singleton.truth;

public final class EagerTruth
{
    private EagerTruth() {}

    private static EagerTruth INSTANCE = new EagerTruth();

    public static EagerTruth getInstance()
    {
        return INSTANCE;
    }
}
