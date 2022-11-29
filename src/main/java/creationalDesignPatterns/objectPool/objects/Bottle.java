package creationalDesignPatterns.objectPool.objects;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Bottle implements WaterContainer
{
    private Integer capacity;

    @Override
    public void reset()
    {
        capacity = 0;
    }

    @Override
    public void empty()
    {
        log.info("Can't empty, the cap won't open! Water present: {}L", capacity);
    }

    @Override
    public void fill(Integer capacity)
    {
        this.capacity = capacity;
    }
}
