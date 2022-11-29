package creationalDesignPatterns.objectPool;

import creationalDesignPatterns.objectPool.objects.Bottle;
import creationalDesignPatterns.objectPool.objects.WaterContainer;

public class Driver
{
    private static void testObjectPool()
    {
        ObjectPool<Bottle> objectPool = new ObjectPool<>(Bottle::new, 2);
        Bottle bottle1 = objectPool.getObject();
        Bottle bottle2 = objectPool.getObject();
        bottle1.fill(5);
        bottle2.fill(6);
        bottle1.empty();
        objectPool.releaseObject(bottle2);
        Bottle bottle3 = objectPool.getObject();
        bottle3.empty();
        bottle3.fill(10);
        bottle3.empty();
    }

    public static void main(String[] args)
    {
        testObjectPool();
    }
}
