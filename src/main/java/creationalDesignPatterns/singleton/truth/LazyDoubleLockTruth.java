package creationalDesignPatterns.singleton.truth;

import org.springframework.util.ObjectUtils;

public class LazyDoubleLockTruth
{
    private LazyDoubleLockTruth() {}

    private static LazyDoubleLockTruth INSTANCE;

    public static LazyDoubleLockTruth getInstance()
    {
        if (ObjectUtils.isEmpty(INSTANCE))
        {
            synchronized (LazyDoubleLockTruth.class)
            {
                if (ObjectUtils.isEmpty(INSTANCE))
                {
                    INSTANCE = new LazyDoubleLockTruth();
                }
            }
        }
        return INSTANCE;
    }
}
