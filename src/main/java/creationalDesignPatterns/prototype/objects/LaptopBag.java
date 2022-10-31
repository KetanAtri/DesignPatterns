package creationalDesignPatterns.prototype.objects;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class LaptopBag extends Bag
{
    private Boolean hasPadding;

    @Override
    public LaptopBag clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException("Laptop bags cannot be cloned");
    }
}
