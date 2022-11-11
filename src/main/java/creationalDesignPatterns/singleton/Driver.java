package creationalDesignPatterns.singleton;

import creationalDesignPatterns.singleton.truth.EagerTruth;
import creationalDesignPatterns.singleton.truth.LazyDoubleLockTruth;
import creationalDesignPatterns.singleton.truth.LazyInitializationHolderTruth;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Driver
{
    private static void testEagerTruth()
    {
        EagerTruth myEagerTruth = EagerTruth.getInstance();
        EagerTruth yourEagerTruth = EagerTruth.getInstance();
        log.info("Driver::testEagerTruth() Truth is: {}", myEagerTruth==yourEagerTruth);
    }

    private static void testLazyDoubleLockTruth()
    {
        LazyDoubleLockTruth myLazyDoubleLockTruth = LazyDoubleLockTruth.getInstance();
        LazyDoubleLockTruth yourLazyDoubleLockTruth = LazyDoubleLockTruth.getInstance();
        log.info("Driver::testLazyDoubleLockTruth() Truth is: {}", myLazyDoubleLockTruth==yourLazyDoubleLockTruth);
    }

    private static void testLazyInitializationHolderTruth()
    {
        LazyInitializationHolderTruth myLazyInitializationHolderTruth = LazyInitializationHolderTruth.getInstance();
        LazyInitializationHolderTruth yourLazyInitializationHolderTruth = LazyInitializationHolderTruth.getInstance();
        log.info("Driver::testLazyInitializationHolderTruth() Truth is: {}",
                myLazyInitializationHolderTruth==yourLazyInitializationHolderTruth);
    }

    public static void main(String[] args)
    {
        testEagerTruth();
        testLazyDoubleLockTruth();
        testLazyInitializationHolderTruth();
    }
}
