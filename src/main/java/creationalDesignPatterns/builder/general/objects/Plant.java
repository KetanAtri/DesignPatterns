package creationalDesignPatterns.builder.general.objects;

import lombok.Data;

@Data
public class Plant
{
    protected Leaf leaf;

    protected Float height;
}
