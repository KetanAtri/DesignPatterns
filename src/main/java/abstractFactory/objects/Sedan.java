package abstractFactory.objects;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Sedan
{
    protected Integer price;

    protected String engine;

    public void pairWith(SUV suv)
    {
        log.info(this.getClass().getSimpleName() + "::pairWith() {} paired with {}", this, suv);
    }
}
