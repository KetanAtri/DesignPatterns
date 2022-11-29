package creationalDesignPatterns.objectPool.objects;

import lombok.extern.slf4j.Slf4j;

public interface WaterContainer extends Poolable
{
     void empty();

     void fill(Integer capacity);
}
