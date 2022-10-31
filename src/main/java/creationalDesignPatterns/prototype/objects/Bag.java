package creationalDesignPatterns.prototype.objects;

import lombok.Data;

@Data
public class Bag implements Cloneable
{
    protected Integer compartments;

    protected String material;

    protected void initialize()
    {
        compartments = 0;
        material = "";
    }

    @Override
    public Bag clone() throws CloneNotSupportedException
    {
        Bag clone = (Bag) super.clone();
        clone.initialize();
        return clone;
    }
}
