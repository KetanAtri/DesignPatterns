package creationalDesignPatterns.abstractFactory.objects;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class NormieSedan extends Sedan
{
    private Integer airBags;

    public NormieSedan(Integer price, String engine, Integer airBags)
    {
        if (price > 10000)
        {
            throw new IllegalArgumentException("Price too high to be classified as NormieSedan");
        }
        this.price = price;
        this.engine = engine;
        this.airBags = airBags;
    }
}
