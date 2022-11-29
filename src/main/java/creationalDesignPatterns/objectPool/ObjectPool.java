package creationalDesignPatterns.objectPool;

import creationalDesignPatterns.objectPool.objects.Poolable;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.function.Supplier;

@Slf4j
public class ObjectPool<T extends Poolable>
{
    private BlockingQueue<T> objectPool;

    ObjectPool(Supplier<T> supplier, Integer count)
    {
        objectPool = new ArrayBlockingQueue<T>(count);
        for(int q=0; q<count; q++)
        {
            objectPool.add(supplier.get());
        }
    }

    public T getObject()
    {
        try
        {
            return objectPool.take();
        }
        catch (InterruptedException e)
        {
            log.error(this.getClass().getSimpleName() + "::getObject() Exception: ", e);
        }
        return null;
    }

    public void releaseObject(T object)
    {
        object.reset();

        objectPool.offer(object);
    }
}
