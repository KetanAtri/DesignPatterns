package creationalDesignPatterns.singleton.truth;

public class LazyInitializationHolderTruth
{
    private LazyInitializationHolderTruth() {}

    private static class TruthHolder
    {
        static LazyInitializationHolderTruth INSTANCE = new LazyInitializationHolderTruth();
    }

    public static LazyInitializationHolderTruth getInstance()
    {
        return TruthHolder.INSTANCE;
    }
}
