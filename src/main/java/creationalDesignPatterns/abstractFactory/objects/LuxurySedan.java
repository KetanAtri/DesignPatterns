package creationalDesignPatterns.abstractFactory.objects;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class LuxurySedan extends Sedan
{
    private String brand;

    public LuxurySedan(Integer price, String engine, String brand)
    {
        if (price < 10000)
        {
            throw new IllegalArgumentException("Price too low to be classified as LuxurySedan");
        }
        this.price = price;
        this.engine = engine;
        this.brand = brand;
    }
}
